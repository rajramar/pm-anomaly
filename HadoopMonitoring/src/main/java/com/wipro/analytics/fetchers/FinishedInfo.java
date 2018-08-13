// ORM class for table 'FinishedInfo'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Mon Jul 02 09:17:52 IST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FinishedInfo extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        id = (String)value;
      }
    });
    setters.put("allocatedMemory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        allocatedMemory = (Double)value;
      }
    });
    setters.put("occupiedMemory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        occupiedMemory = (Double)value;
      }
    });
    setters.put("usedPerAllocatedMemory", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        usedPerAllocatedMemory = (Double)value;
      }
    });
    setters.put("cpuTimeSpentTotal", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        cpuTimeSpentTotal = (Long)value;
      }
    });
    setters.put("usedPerAllocatedCPU", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        usedPerAllocatedCPU = (Double)value;
      }
    });
  }
  public FinishedInfo() {
    init0();
  }
  private String id;
  public String get_id() {
    return id;
  }
  public void set_id(String id) {
    this.id = id;
  }
  public FinishedInfo with_id(String id) {
    this.id = id;
    return this;
  }
  private Double allocatedMemory;
  public Double get_allocatedMemory() {
    return allocatedMemory;
  }
  public void set_allocatedMemory(Double allocatedMemory) {
    this.allocatedMemory = allocatedMemory;
  }
  public FinishedInfo with_allocatedMemory(Double allocatedMemory) {
    this.allocatedMemory = allocatedMemory;
    return this;
  }
  private Double occupiedMemory;
  public Double get_occupiedMemory() {
    return occupiedMemory;
  }
  public void set_occupiedMemory(Double occupiedMemory) {
    this.occupiedMemory = occupiedMemory;
  }
  public FinishedInfo with_occupiedMemory(Double occupiedMemory) {
    this.occupiedMemory = occupiedMemory;
    return this;
  }
  private Double usedPerAllocatedMemory;
  public Double get_usedPerAllocatedMemory() {
    return usedPerAllocatedMemory;
  }
  public void set_usedPerAllocatedMemory(Double usedPerAllocatedMemory) {
    this.usedPerAllocatedMemory = usedPerAllocatedMemory;
  }
  public FinishedInfo with_usedPerAllocatedMemory(Double usedPerAllocatedMemory) {
    this.usedPerAllocatedMemory = usedPerAllocatedMemory;
    return this;
  }
  private Long cpuTimeSpentTotal;
  public Long get_cpuTimeSpentTotal() {
    return cpuTimeSpentTotal;
  }
  public void set_cpuTimeSpentTotal(Long cpuTimeSpentTotal) {
    this.cpuTimeSpentTotal = cpuTimeSpentTotal;
  }
  public FinishedInfo with_cpuTimeSpentTotal(Long cpuTimeSpentTotal) {
    this.cpuTimeSpentTotal = cpuTimeSpentTotal;
    return this;
  }
  private Double usedPerAllocatedCPU;
  public Double get_usedPerAllocatedCPU() {
    return usedPerAllocatedCPU;
  }
  public void set_usedPerAllocatedCPU(Double usedPerAllocatedCPU) {
    this.usedPerAllocatedCPU = usedPerAllocatedCPU;
  }
  public FinishedInfo with_usedPerAllocatedCPU(Double usedPerAllocatedCPU) {
    this.usedPerAllocatedCPU = usedPerAllocatedCPU;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FinishedInfo)) {
      return false;
    }
    FinishedInfo that = (FinishedInfo) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.allocatedMemory == null ? that.allocatedMemory == null : this.allocatedMemory.equals(that.allocatedMemory));
    equal = equal && (this.occupiedMemory == null ? that.occupiedMemory == null : this.occupiedMemory.equals(that.occupiedMemory));
    equal = equal && (this.usedPerAllocatedMemory == null ? that.usedPerAllocatedMemory == null : this.usedPerAllocatedMemory.equals(that.usedPerAllocatedMemory));
    equal = equal && (this.cpuTimeSpentTotal == null ? that.cpuTimeSpentTotal == null : this.cpuTimeSpentTotal.equals(that.cpuTimeSpentTotal));
    equal = equal && (this.usedPerAllocatedCPU == null ? that.usedPerAllocatedCPU == null : this.usedPerAllocatedCPU.equals(that.usedPerAllocatedCPU));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof FinishedInfo)) {
      return false;
    }
    FinishedInfo that = (FinishedInfo) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.allocatedMemory == null ? that.allocatedMemory == null : this.allocatedMemory.equals(that.allocatedMemory));
    equal = equal && (this.occupiedMemory == null ? that.occupiedMemory == null : this.occupiedMemory.equals(that.occupiedMemory));
    equal = equal && (this.usedPerAllocatedMemory == null ? that.usedPerAllocatedMemory == null : this.usedPerAllocatedMemory.equals(that.usedPerAllocatedMemory));
    equal = equal && (this.cpuTimeSpentTotal == null ? that.cpuTimeSpentTotal == null : this.cpuTimeSpentTotal.equals(that.cpuTimeSpentTotal));
    equal = equal && (this.usedPerAllocatedCPU == null ? that.usedPerAllocatedCPU == null : this.usedPerAllocatedCPU.equals(that.usedPerAllocatedCPU));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.allocatedMemory = JdbcWritableBridge.readDouble(2, __dbResults);
    this.occupiedMemory = JdbcWritableBridge.readDouble(3, __dbResults);
    this.usedPerAllocatedMemory = JdbcWritableBridge.readDouble(4, __dbResults);
    this.cpuTimeSpentTotal = JdbcWritableBridge.readLong(5, __dbResults);
    this.usedPerAllocatedCPU = JdbcWritableBridge.readDouble(6, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readString(1, __dbResults);
    this.allocatedMemory = JdbcWritableBridge.readDouble(2, __dbResults);
    this.occupiedMemory = JdbcWritableBridge.readDouble(3, __dbResults);
    this.usedPerAllocatedMemory = JdbcWritableBridge.readDouble(4, __dbResults);
    this.cpuTimeSpentTotal = JdbcWritableBridge.readLong(5, __dbResults);
    this.usedPerAllocatedCPU = JdbcWritableBridge.readDouble(6, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(allocatedMemory, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(occupiedMemory, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(usedPerAllocatedMemory, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(cpuTimeSpentTotal, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(usedPerAllocatedCPU, 6 + __off, 8, __dbStmt);
    return 6;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(id, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(allocatedMemory, 2 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(occupiedMemory, 3 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(usedPerAllocatedMemory, 4 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeLong(cpuTimeSpentTotal, 5 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeDouble(usedPerAllocatedCPU, 6 + __off, 8, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.allocatedMemory = null;
    } else {
    this.allocatedMemory = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.occupiedMemory = null;
    } else {
    this.occupiedMemory = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.usedPerAllocatedMemory = null;
    } else {
    this.usedPerAllocatedMemory = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.cpuTimeSpentTotal = null;
    } else {
    this.cpuTimeSpentTotal = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.usedPerAllocatedCPU = null;
    } else {
    this.usedPerAllocatedCPU = Double.valueOf(__dataIn.readDouble());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.allocatedMemory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.allocatedMemory);
    }
    if (null == this.occupiedMemory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.occupiedMemory);
    }
    if (null == this.usedPerAllocatedMemory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.usedPerAllocatedMemory);
    }
    if (null == this.cpuTimeSpentTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cpuTimeSpentTotal);
    }
    if (null == this.usedPerAllocatedCPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.usedPerAllocatedCPU);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, id);
    }
    if (null == this.allocatedMemory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.allocatedMemory);
    }
    if (null == this.occupiedMemory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.occupiedMemory);
    }
    if (null == this.usedPerAllocatedMemory) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.usedPerAllocatedMemory);
    }
    if (null == this.cpuTimeSpentTotal) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.cpuTimeSpentTotal);
    }
    if (null == this.usedPerAllocatedCPU) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.usedPerAllocatedCPU);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(allocatedMemory==null?"null":"" + allocatedMemory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(occupiedMemory==null?"null":"" + occupiedMemory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(usedPerAllocatedMemory==null?"null":"" + usedPerAllocatedMemory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cpuTimeSpentTotal==null?"null":"" + cpuTimeSpentTotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(usedPerAllocatedCPU==null?"null":"" + usedPerAllocatedCPU, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(allocatedMemory==null?"null":"" + allocatedMemory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(occupiedMemory==null?"null":"" + occupiedMemory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(usedPerAllocatedMemory==null?"null":"" + usedPerAllocatedMemory, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cpuTimeSpentTotal==null?"null":"" + cpuTimeSpentTotal, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(usedPerAllocatedCPU==null?"null":"" + usedPerAllocatedCPU, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.allocatedMemory = null; } else {
      this.allocatedMemory = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.occupiedMemory = null; } else {
      this.occupiedMemory = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.usedPerAllocatedMemory = null; } else {
      this.usedPerAllocatedMemory = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cpuTimeSpentTotal = null; } else {
      this.cpuTimeSpentTotal = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.usedPerAllocatedCPU = null; } else {
      this.usedPerAllocatedCPU = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.id = null; } else {
      this.id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.allocatedMemory = null; } else {
      this.allocatedMemory = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.occupiedMemory = null; } else {
      this.occupiedMemory = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.usedPerAllocatedMemory = null; } else {
      this.usedPerAllocatedMemory = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.cpuTimeSpentTotal = null; } else {
      this.cpuTimeSpentTotal = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.usedPerAllocatedCPU = null; } else {
      this.usedPerAllocatedCPU = Double.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    FinishedInfo o = (FinishedInfo) super.clone();
    return o;
  }

  public void clone0(FinishedInfo o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("allocatedMemory", this.allocatedMemory);
    __sqoop$field_map.put("occupiedMemory", this.occupiedMemory);
    __sqoop$field_map.put("usedPerAllocatedMemory", this.usedPerAllocatedMemory);
    __sqoop$field_map.put("cpuTimeSpentTotal", this.cpuTimeSpentTotal);
    __sqoop$field_map.put("usedPerAllocatedCPU", this.usedPerAllocatedCPU);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("allocatedMemory", this.allocatedMemory);
    __sqoop$field_map.put("occupiedMemory", this.occupiedMemory);
    __sqoop$field_map.put("usedPerAllocatedMemory", this.usedPerAllocatedMemory);
    __sqoop$field_map.put("cpuTimeSpentTotal", this.cpuTimeSpentTotal);
    __sqoop$field_map.put("usedPerAllocatedCPU", this.usedPerAllocatedCPU);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
