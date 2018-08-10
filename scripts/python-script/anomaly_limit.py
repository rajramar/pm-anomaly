import urllib, json
import numpy as np
import mysql.connector

def compute_boundary_limit(metricsValArray,metric):
  #print("inside function")
  print "mean",np.mean(metricsValArray)
  print "sd",np.std(metricsValArray) 
  lbound = np.mean(metricsValArray) - (2 * (np.std(metricsValArray)))
  ubound = np.mean(metricsValArray) + (2 * (np.std(metricsValArray)))
  #print metric
  lbound = float(lbound)
  ubound = float(ubound)
  print "type of lbound",type(lbound)
  print lbound
  print ubound
  return lbound,ubound
  
def submitDetailstoDB(metric,lbound,ubound): 
	print "mysql connect for :",metric
	mydb = mysql.connector.connect(
		host="localhost",
		user="root",
		passwd="wipro@123",
		database="PlatformMonitor"
	)
	mycursor = mydb.cursor()
	#mycursor.execute("SHOW DATABASES")
	#for x in mycursor:
	#  print(x)
	# CREATE TABLE MetricsAnomalyRange (metricsName VARCHAR(100), lowerLimit DOUBLE, upperLimit DOUBLE, createdTime timestamp DEFAULT CURRENT_TIMESTAMP )
	sql = "INSERT INTO MetricsAnomalyRange (metricsName, lowerLimit, upperLimit) VALUES (%s, %s, %s)"
	mycursor.execute(sql, (metric,lbound,ubound))
	mydb.commit()
	print(mycursor.rowcount, "record inserted.")
	
def archiveToHistory(): 
	print "mysql connect for archiving"
	mydb = mysql.connector.connect(
		host="localhost",
		user="root",
		passwd="wipro@123",
		database="PlatformMonitor"
	)
	mycursor = mydb.cursor()
	#mycursor.execute("SHOW DATABASES")
	#for x in mycursor:
	#  print(x)
	# CREATE TABLE MetricsAnomalyRange (metricsName VARCHAR(100), lowerLimit VARCHAR(100), upperLimit VARCHAR(100), createdTime timestamp DEFAULT CURRENT_TIMESTAMP )
	sql = "SELECT count(*) FROM MetricsAnomalyRange"
        mycursor.execute(sql)
	result = mycursor.fetchone()
	no_of_rows = result[0]
	print no_of_rows

        if no_of_rows > 0 :
           print "mysql connect insert to history"
	   mycursor = mydb.cursor()
	   sql = "INSERT INTO MetricsAnomalyRangeHistory SELECT * from MetricsAnomalyRange"
	   mycursor.execute(sql)
	   mydb.commit()
	   print(mycursor.rowcount, "record inserted.")
           print "truncate table"
           mycursor = mydb.cursor()
           sql = "TRUNCATE TABLE MetricsAnomalyRange"
           mycursor.execute(sql)
           mydb.commit()
        	
	
	

archiveToHistory()
cpu_querystring = "&m=sum:cpu_user&m=sum:cpu_system&m=sum:cpu_idle&m=sum:cpu_nice&m=sum:cpu_wio"
memory_querystring = "&m=sum:mem_free&m=sum:mem_cached&m=sum:mem_total&m=sum:mem_shared"
#disk_querystring = "&m=sum:read_bytes&m=sum:write_bytes"
#network_querystring = "&m=sum:bytes_in&m=sum:bytes_out"
#url = "http://10.201.45.15:4242/api/query?start=1h-ago"+cpu_querystring+memory_querystring+disk_querystring+network_querystring;
url = "http://10.201.45.15:4242/api/query?start=3h-ago"+cpu_querystring+memory_querystring;
response = urllib.urlopen(url)
data = json.loads(response.read())
metricsCnt = len(data)
i=0
while i < metricsCnt :
 datapoints = data[i]['dps']
 metric = data[i]['metric']
 metricsValArray = datapoints.values()
 #print metric
 print metricsValArray
 #Anomaly boundary computation
 lbound,ubound = compute_boundary_limit(metricsValArray,metric)
 #DB insertion
 submitDetailstoDB(metric,lbound,ubound)
 i+=1
 
 

 
