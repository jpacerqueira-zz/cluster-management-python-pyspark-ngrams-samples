// ORM class for table 'VDP_EVENTS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 12 14:47:58 BST 2016
// For connector: org.apache.sqoop.manager.OracleManager
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
import java.util.TreeMap;

public class VDP_EVENTS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private java.math.BigDecimal EVENT_ID;
  public java.math.BigDecimal get_EVENT_ID() {
    return EVENT_ID;
  }
  public void set_EVENT_ID(java.math.BigDecimal EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
  }
  public VDP_EVENTS with_EVENT_ID(java.math.BigDecimal EVENT_ID) {
    this.EVENT_ID = EVENT_ID;
    return this;
  }
  private String DESCRIPTION;
  public String get_DESCRIPTION() {
    return DESCRIPTION;
  }
  public void set_DESCRIPTION(String DESCRIPTION) {
    this.DESCRIPTION = DESCRIPTION;
  }
  public VDP_EVENTS with_DESCRIPTION(String DESCRIPTION) {
    this.DESCRIPTION = DESCRIPTION;
    return this;
  }
  private java.math.BigDecimal RIGHTS_ID;
  public java.math.BigDecimal get_RIGHTS_ID() {
    return RIGHTS_ID;
  }
  public void set_RIGHTS_ID(java.math.BigDecimal RIGHTS_ID) {
    this.RIGHTS_ID = RIGHTS_ID;
  }
  public VDP_EVENTS with_RIGHTS_ID(java.math.BigDecimal RIGHTS_ID) {
    this.RIGHTS_ID = RIGHTS_ID;
    return this;
  }
  private java.sql.Timestamp FEED_START_TIME;
  public java.sql.Timestamp get_FEED_START_TIME() {
    return FEED_START_TIME;
  }
  public void set_FEED_START_TIME(java.sql.Timestamp FEED_START_TIME) {
    this.FEED_START_TIME = FEED_START_TIME;
  }
  public VDP_EVENTS with_FEED_START_TIME(java.sql.Timestamp FEED_START_TIME) {
    this.FEED_START_TIME = FEED_START_TIME;
    return this;
  }
  private java.sql.Timestamp FEED_END_TIME;
  public java.sql.Timestamp get_FEED_END_TIME() {
    return FEED_END_TIME;
  }
  public void set_FEED_END_TIME(java.sql.Timestamp FEED_END_TIME) {
    this.FEED_END_TIME = FEED_END_TIME;
  }
  public VDP_EVENTS with_FEED_END_TIME(java.sql.Timestamp FEED_END_TIME) {
    this.FEED_END_TIME = FEED_END_TIME;
    return this;
  }
  private java.sql.Timestamp EVENT_START_TIME;
  public java.sql.Timestamp get_EVENT_START_TIME() {
    return EVENT_START_TIME;
  }
  public void set_EVENT_START_TIME(java.sql.Timestamp EVENT_START_TIME) {
    this.EVENT_START_TIME = EVENT_START_TIME;
  }
  public VDP_EVENTS with_EVENT_START_TIME(java.sql.Timestamp EVENT_START_TIME) {
    this.EVENT_START_TIME = EVENT_START_TIME;
    return this;
  }
  private java.sql.Timestamp EVENT_END_TIME;
  public java.sql.Timestamp get_EVENT_END_TIME() {
    return EVENT_END_TIME;
  }
  public void set_EVENT_END_TIME(java.sql.Timestamp EVENT_END_TIME) {
    this.EVENT_END_TIME = EVENT_END_TIME;
  }
  public VDP_EVENTS with_EVENT_END_TIME(java.sql.Timestamp EVENT_END_TIME) {
    this.EVENT_END_TIME = EVENT_END_TIME;
    return this;
  }
  private String FEED_INFO;
  public String get_FEED_INFO() {
    return FEED_INFO;
  }
  public void set_FEED_INFO(String FEED_INFO) {
    this.FEED_INFO = FEED_INFO;
  }
  public VDP_EVENTS with_FEED_INFO(String FEED_INFO) {
    this.FEED_INFO = FEED_INFO;
    return this;
  }
  private String STATUS;
  public String get_STATUS() {
    return STATUS;
  }
  public void set_STATUS(String STATUS) {
    this.STATUS = STATUS;
  }
  public VDP_EVENTS with_STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }
  private java.math.BigDecimal GEOBLOCK_ID;
  public java.math.BigDecimal get_GEOBLOCK_ID() {
    return GEOBLOCK_ID;
  }
  public void set_GEOBLOCK_ID(java.math.BigDecimal GEOBLOCK_ID) {
    this.GEOBLOCK_ID = GEOBLOCK_ID;
  }
  public VDP_EVENTS with_GEOBLOCK_ID(java.math.BigDecimal GEOBLOCK_ID) {
    this.GEOBLOCK_ID = GEOBLOCK_ID;
    return this;
  }
  private java.math.BigDecimal CHANNEL_ID;
  public java.math.BigDecimal get_CHANNEL_ID() {
    return CHANNEL_ID;
  }
  public void set_CHANNEL_ID(java.math.BigDecimal CHANNEL_ID) {
    this.CHANNEL_ID = CHANNEL_ID;
  }
  public VDP_EVENTS with_CHANNEL_ID(java.math.BigDecimal CHANNEL_ID) {
    this.CHANNEL_ID = CHANNEL_ID;
    return this;
  }
  private String JOB_ID;
  public String get_JOB_ID() {
    return JOB_ID;
  }
  public void set_JOB_ID(String JOB_ID) {
    this.JOB_ID = JOB_ID;
  }
  public VDP_EVENTS with_JOB_ID(String JOB_ID) {
    this.JOB_ID = JOB_ID;
    return this;
  }
  private String EXTERNAL_URL;
  public String get_EXTERNAL_URL() {
    return EXTERNAL_URL;
  }
  public void set_EXTERNAL_URL(String EXTERNAL_URL) {
    this.EXTERNAL_URL = EXTERNAL_URL;
  }
  public VDP_EVENTS with_EXTERNAL_URL(String EXTERNAL_URL) {
    this.EXTERNAL_URL = EXTERNAL_URL;
    return this;
  }
  private String BACKUP_JOB_ID;
  public String get_BACKUP_JOB_ID() {
    return BACKUP_JOB_ID;
  }
  public void set_BACKUP_JOB_ID(String BACKUP_JOB_ID) {
    this.BACKUP_JOB_ID = BACKUP_JOB_ID;
  }
  public VDP_EVENTS with_BACKUP_JOB_ID(String BACKUP_JOB_ID) {
    this.BACKUP_JOB_ID = BACKUP_JOB_ID;
    return this;
  }
  private String COMMENTATORS_NAMES;
  public String get_COMMENTATORS_NAMES() {
    return COMMENTATORS_NAMES;
  }
  public void set_COMMENTATORS_NAMES(String COMMENTATORS_NAMES) {
    this.COMMENTATORS_NAMES = COMMENTATORS_NAMES;
  }
  public VDP_EVENTS with_COMMENTATORS_NAMES(String COMMENTATORS_NAMES) {
    this.COMMENTATORS_NAMES = COMMENTATORS_NAMES;
    return this;
  }
  private String COMMENTATORS_PHONE_NUMBER;
  public String get_COMMENTATORS_PHONE_NUMBER() {
    return COMMENTATORS_PHONE_NUMBER;
  }
  public void set_COMMENTATORS_PHONE_NUMBER(String COMMENTATORS_PHONE_NUMBER) {
    this.COMMENTATORS_PHONE_NUMBER = COMMENTATORS_PHONE_NUMBER;
  }
  public VDP_EVENTS with_COMMENTATORS_PHONE_NUMBER(String COMMENTATORS_PHONE_NUMBER) {
    this.COMMENTATORS_PHONE_NUMBER = COMMENTATORS_PHONE_NUMBER;
    return this;
  }
  private String COMMENTATORS_EMAIL;
  public String get_COMMENTATORS_EMAIL() {
    return COMMENTATORS_EMAIL;
  }
  public void set_COMMENTATORS_EMAIL(String COMMENTATORS_EMAIL) {
    this.COMMENTATORS_EMAIL = COMMENTATORS_EMAIL;
  }
  public VDP_EVENTS with_COMMENTATORS_EMAIL(String COMMENTATORS_EMAIL) {
    this.COMMENTATORS_EMAIL = COMMENTATORS_EMAIL;
    return this;
  }
  private java.math.BigDecimal VOICE_OVER_BOOTH;
  public java.math.BigDecimal get_VOICE_OVER_BOOTH() {
    return VOICE_OVER_BOOTH;
  }
  public void set_VOICE_OVER_BOOTH(java.math.BigDecimal VOICE_OVER_BOOTH) {
    this.VOICE_OVER_BOOTH = VOICE_OVER_BOOTH;
  }
  public VDP_EVENTS with_VOICE_OVER_BOOTH(java.math.BigDecimal VOICE_OVER_BOOTH) {
    this.VOICE_OVER_BOOTH = VOICE_OVER_BOOTH;
    return this;
  }
  private java.math.BigDecimal CONTACT_ID;
  public java.math.BigDecimal get_CONTACT_ID() {
    return CONTACT_ID;
  }
  public void set_CONTACT_ID(java.math.BigDecimal CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
  }
  public VDP_EVENTS with_CONTACT_ID(java.math.BigDecimal CONTACT_ID) {
    this.CONTACT_ID = CONTACT_ID;
    return this;
  }
  private String REPORTS_PROC_STATUS;
  public String get_REPORTS_PROC_STATUS() {
    return REPORTS_PROC_STATUS;
  }
  public void set_REPORTS_PROC_STATUS(String REPORTS_PROC_STATUS) {
    this.REPORTS_PROC_STATUS = REPORTS_PROC_STATUS;
  }
  public VDP_EVENTS with_REPORTS_PROC_STATUS(String REPORTS_PROC_STATUS) {
    this.REPORTS_PROC_STATUS = REPORTS_PROC_STATUS;
    return this;
  }
  private String LOCATION;
  public String get_LOCATION() {
    return LOCATION;
  }
  public void set_LOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
  }
  public VDP_EVENTS with_LOCATION(String LOCATION) {
    this.LOCATION = LOCATION;
    return this;
  }
  private java.math.BigDecimal ENCODER_OPTION_ID;
  public java.math.BigDecimal get_ENCODER_OPTION_ID() {
    return ENCODER_OPTION_ID;
  }
  public void set_ENCODER_OPTION_ID(java.math.BigDecimal ENCODER_OPTION_ID) {
    this.ENCODER_OPTION_ID = ENCODER_OPTION_ID;
  }
  public VDP_EVENTS with_ENCODER_OPTION_ID(java.math.BigDecimal ENCODER_OPTION_ID) {
    this.ENCODER_OPTION_ID = ENCODER_OPTION_ID;
    return this;
  }
  private String BROADCASTMANAGER_EVENT;
  public String get_BROADCASTMANAGER_EVENT() {
    return BROADCASTMANAGER_EVENT;
  }
  public void set_BROADCASTMANAGER_EVENT(String BROADCASTMANAGER_EVENT) {
    this.BROADCASTMANAGER_EVENT = BROADCASTMANAGER_EVENT;
  }
  public VDP_EVENTS with_BROADCASTMANAGER_EVENT(String BROADCASTMANAGER_EVENT) {
    this.BROADCASTMANAGER_EVENT = BROADCASTMANAGER_EVENT;
    return this;
  }
  private java.math.BigDecimal NO_OF_MATCHES;
  public java.math.BigDecimal get_NO_OF_MATCHES() {
    return NO_OF_MATCHES;
  }
  public void set_NO_OF_MATCHES(java.math.BigDecimal NO_OF_MATCHES) {
    this.NO_OF_MATCHES = NO_OF_MATCHES;
  }
  public VDP_EVENTS with_NO_OF_MATCHES(java.math.BigDecimal NO_OF_MATCHES) {
    this.NO_OF_MATCHES = NO_OF_MATCHES;
    return this;
  }
  private String UUID;
  public String get_UUID() {
    return UUID;
  }
  public void set_UUID(String UUID) {
    this.UUID = UUID;
  }
  public VDP_EVENTS with_UUID(String UUID) {
    this.UUID = UUID;
    return this;
  }
  private String REPORTS2_PROC_STATUS;
  public String get_REPORTS2_PROC_STATUS() {
    return REPORTS2_PROC_STATUS;
  }
  public void set_REPORTS2_PROC_STATUS(String REPORTS2_PROC_STATUS) {
    this.REPORTS2_PROC_STATUS = REPORTS2_PROC_STATUS;
  }
  public VDP_EVENTS with_REPORTS2_PROC_STATUS(String REPORTS2_PROC_STATUS) {
    this.REPORTS2_PROC_STATUS = REPORTS2_PROC_STATUS;
    return this;
  }
  private java.math.BigDecimal REPORTS2_PROC_PRIORITY;
  public java.math.BigDecimal get_REPORTS2_PROC_PRIORITY() {
    return REPORTS2_PROC_PRIORITY;
  }
  public void set_REPORTS2_PROC_PRIORITY(java.math.BigDecimal REPORTS2_PROC_PRIORITY) {
    this.REPORTS2_PROC_PRIORITY = REPORTS2_PROC_PRIORITY;
  }
  public VDP_EVENTS with_REPORTS2_PROC_PRIORITY(java.math.BigDecimal REPORTS2_PROC_PRIORITY) {
    this.REPORTS2_PROC_PRIORITY = REPORTS2_PROC_PRIORITY;
    return this;
  }
  private java.math.BigDecimal PROD_TIER_ID;
  public java.math.BigDecimal get_PROD_TIER_ID() {
    return PROD_TIER_ID;
  }
  public void set_PROD_TIER_ID(java.math.BigDecimal PROD_TIER_ID) {
    this.PROD_TIER_ID = PROD_TIER_ID;
  }
  public VDP_EVENTS with_PROD_TIER_ID(java.math.BigDecimal PROD_TIER_ID) {
    this.PROD_TIER_ID = PROD_TIER_ID;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof VDP_EVENTS)) {
      return false;
    }
    VDP_EVENTS that = (VDP_EVENTS) o;
    boolean equal = true;
    equal = equal && (this.EVENT_ID == null ? that.EVENT_ID == null : this.EVENT_ID.equals(that.EVENT_ID));
    equal = equal && (this.DESCRIPTION == null ? that.DESCRIPTION == null : this.DESCRIPTION.equals(that.DESCRIPTION));
    equal = equal && (this.RIGHTS_ID == null ? that.RIGHTS_ID == null : this.RIGHTS_ID.equals(that.RIGHTS_ID));
    equal = equal && (this.FEED_START_TIME == null ? that.FEED_START_TIME == null : this.FEED_START_TIME.equals(that.FEED_START_TIME));
    equal = equal && (this.FEED_END_TIME == null ? that.FEED_END_TIME == null : this.FEED_END_TIME.equals(that.FEED_END_TIME));
    equal = equal && (this.EVENT_START_TIME == null ? that.EVENT_START_TIME == null : this.EVENT_START_TIME.equals(that.EVENT_START_TIME));
    equal = equal && (this.EVENT_END_TIME == null ? that.EVENT_END_TIME == null : this.EVENT_END_TIME.equals(that.EVENT_END_TIME));
    equal = equal && (this.FEED_INFO == null ? that.FEED_INFO == null : this.FEED_INFO.equals(that.FEED_INFO));
    equal = equal && (this.STATUS == null ? that.STATUS == null : this.STATUS.equals(that.STATUS));
    equal = equal && (this.GEOBLOCK_ID == null ? that.GEOBLOCK_ID == null : this.GEOBLOCK_ID.equals(that.GEOBLOCK_ID));
    equal = equal && (this.CHANNEL_ID == null ? that.CHANNEL_ID == null : this.CHANNEL_ID.equals(that.CHANNEL_ID));
    equal = equal && (this.JOB_ID == null ? that.JOB_ID == null : this.JOB_ID.equals(that.JOB_ID));
    equal = equal && (this.EXTERNAL_URL == null ? that.EXTERNAL_URL == null : this.EXTERNAL_URL.equals(that.EXTERNAL_URL));
    equal = equal && (this.BACKUP_JOB_ID == null ? that.BACKUP_JOB_ID == null : this.BACKUP_JOB_ID.equals(that.BACKUP_JOB_ID));
    equal = equal && (this.COMMENTATORS_NAMES == null ? that.COMMENTATORS_NAMES == null : this.COMMENTATORS_NAMES.equals(that.COMMENTATORS_NAMES));
    equal = equal && (this.COMMENTATORS_PHONE_NUMBER == null ? that.COMMENTATORS_PHONE_NUMBER == null : this.COMMENTATORS_PHONE_NUMBER.equals(that.COMMENTATORS_PHONE_NUMBER));
    equal = equal && (this.COMMENTATORS_EMAIL == null ? that.COMMENTATORS_EMAIL == null : this.COMMENTATORS_EMAIL.equals(that.COMMENTATORS_EMAIL));
    equal = equal && (this.VOICE_OVER_BOOTH == null ? that.VOICE_OVER_BOOTH == null : this.VOICE_OVER_BOOTH.equals(that.VOICE_OVER_BOOTH));
    equal = equal && (this.CONTACT_ID == null ? that.CONTACT_ID == null : this.CONTACT_ID.equals(that.CONTACT_ID));
    equal = equal && (this.REPORTS_PROC_STATUS == null ? that.REPORTS_PROC_STATUS == null : this.REPORTS_PROC_STATUS.equals(that.REPORTS_PROC_STATUS));
    equal = equal && (this.LOCATION == null ? that.LOCATION == null : this.LOCATION.equals(that.LOCATION));
    equal = equal && (this.ENCODER_OPTION_ID == null ? that.ENCODER_OPTION_ID == null : this.ENCODER_OPTION_ID.equals(that.ENCODER_OPTION_ID));
    equal = equal && (this.BROADCASTMANAGER_EVENT == null ? that.BROADCASTMANAGER_EVENT == null : this.BROADCASTMANAGER_EVENT.equals(that.BROADCASTMANAGER_EVENT));
    equal = equal && (this.NO_OF_MATCHES == null ? that.NO_OF_MATCHES == null : this.NO_OF_MATCHES.equals(that.NO_OF_MATCHES));
    equal = equal && (this.UUID == null ? that.UUID == null : this.UUID.equals(that.UUID));
    equal = equal && (this.REPORTS2_PROC_STATUS == null ? that.REPORTS2_PROC_STATUS == null : this.REPORTS2_PROC_STATUS.equals(that.REPORTS2_PROC_STATUS));
    equal = equal && (this.REPORTS2_PROC_PRIORITY == null ? that.REPORTS2_PROC_PRIORITY == null : this.REPORTS2_PROC_PRIORITY.equals(that.REPORTS2_PROC_PRIORITY));
    equal = equal && (this.PROD_TIER_ID == null ? that.PROD_TIER_ID == null : this.PROD_TIER_ID.equals(that.PROD_TIER_ID));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof VDP_EVENTS)) {
      return false;
    }
    VDP_EVENTS that = (VDP_EVENTS) o;
    boolean equal = true;
    equal = equal && (this.EVENT_ID == null ? that.EVENT_ID == null : this.EVENT_ID.equals(that.EVENT_ID));
    equal = equal && (this.DESCRIPTION == null ? that.DESCRIPTION == null : this.DESCRIPTION.equals(that.DESCRIPTION));
    equal = equal && (this.RIGHTS_ID == null ? that.RIGHTS_ID == null : this.RIGHTS_ID.equals(that.RIGHTS_ID));
    equal = equal && (this.FEED_START_TIME == null ? that.FEED_START_TIME == null : this.FEED_START_TIME.equals(that.FEED_START_TIME));
    equal = equal && (this.FEED_END_TIME == null ? that.FEED_END_TIME == null : this.FEED_END_TIME.equals(that.FEED_END_TIME));
    equal = equal && (this.EVENT_START_TIME == null ? that.EVENT_START_TIME == null : this.EVENT_START_TIME.equals(that.EVENT_START_TIME));
    equal = equal && (this.EVENT_END_TIME == null ? that.EVENT_END_TIME == null : this.EVENT_END_TIME.equals(that.EVENT_END_TIME));
    equal = equal && (this.FEED_INFO == null ? that.FEED_INFO == null : this.FEED_INFO.equals(that.FEED_INFO));
    equal = equal && (this.STATUS == null ? that.STATUS == null : this.STATUS.equals(that.STATUS));
    equal = equal && (this.GEOBLOCK_ID == null ? that.GEOBLOCK_ID == null : this.GEOBLOCK_ID.equals(that.GEOBLOCK_ID));
    equal = equal && (this.CHANNEL_ID == null ? that.CHANNEL_ID == null : this.CHANNEL_ID.equals(that.CHANNEL_ID));
    equal = equal && (this.JOB_ID == null ? that.JOB_ID == null : this.JOB_ID.equals(that.JOB_ID));
    equal = equal && (this.EXTERNAL_URL == null ? that.EXTERNAL_URL == null : this.EXTERNAL_URL.equals(that.EXTERNAL_URL));
    equal = equal && (this.BACKUP_JOB_ID == null ? that.BACKUP_JOB_ID == null : this.BACKUP_JOB_ID.equals(that.BACKUP_JOB_ID));
    equal = equal && (this.COMMENTATORS_NAMES == null ? that.COMMENTATORS_NAMES == null : this.COMMENTATORS_NAMES.equals(that.COMMENTATORS_NAMES));
    equal = equal && (this.COMMENTATORS_PHONE_NUMBER == null ? that.COMMENTATORS_PHONE_NUMBER == null : this.COMMENTATORS_PHONE_NUMBER.equals(that.COMMENTATORS_PHONE_NUMBER));
    equal = equal && (this.COMMENTATORS_EMAIL == null ? that.COMMENTATORS_EMAIL == null : this.COMMENTATORS_EMAIL.equals(that.COMMENTATORS_EMAIL));
    equal = equal && (this.VOICE_OVER_BOOTH == null ? that.VOICE_OVER_BOOTH == null : this.VOICE_OVER_BOOTH.equals(that.VOICE_OVER_BOOTH));
    equal = equal && (this.CONTACT_ID == null ? that.CONTACT_ID == null : this.CONTACT_ID.equals(that.CONTACT_ID));
    equal = equal && (this.REPORTS_PROC_STATUS == null ? that.REPORTS_PROC_STATUS == null : this.REPORTS_PROC_STATUS.equals(that.REPORTS_PROC_STATUS));
    equal = equal && (this.LOCATION == null ? that.LOCATION == null : this.LOCATION.equals(that.LOCATION));
    equal = equal && (this.ENCODER_OPTION_ID == null ? that.ENCODER_OPTION_ID == null : this.ENCODER_OPTION_ID.equals(that.ENCODER_OPTION_ID));
    equal = equal && (this.BROADCASTMANAGER_EVENT == null ? that.BROADCASTMANAGER_EVENT == null : this.BROADCASTMANAGER_EVENT.equals(that.BROADCASTMANAGER_EVENT));
    equal = equal && (this.NO_OF_MATCHES == null ? that.NO_OF_MATCHES == null : this.NO_OF_MATCHES.equals(that.NO_OF_MATCHES));
    equal = equal && (this.UUID == null ? that.UUID == null : this.UUID.equals(that.UUID));
    equal = equal && (this.REPORTS2_PROC_STATUS == null ? that.REPORTS2_PROC_STATUS == null : this.REPORTS2_PROC_STATUS.equals(that.REPORTS2_PROC_STATUS));
    equal = equal && (this.REPORTS2_PROC_PRIORITY == null ? that.REPORTS2_PROC_PRIORITY == null : this.REPORTS2_PROC_PRIORITY.equals(that.REPORTS2_PROC_PRIORITY));
    equal = equal && (this.PROD_TIER_ID == null ? that.PROD_TIER_ID == null : this.PROD_TIER_ID.equals(that.PROD_TIER_ID));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.EVENT_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.DESCRIPTION = JdbcWritableBridge.readString(2, __dbResults);
    this.RIGHTS_ID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FEED_START_TIME = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.FEED_END_TIME = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.EVENT_START_TIME = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.EVENT_END_TIME = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.FEED_INFO = JdbcWritableBridge.readString(8, __dbResults);
    this.STATUS = JdbcWritableBridge.readString(9, __dbResults);
    this.GEOBLOCK_ID = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.CHANNEL_ID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.JOB_ID = JdbcWritableBridge.readString(12, __dbResults);
    this.EXTERNAL_URL = JdbcWritableBridge.readString(13, __dbResults);
    this.BACKUP_JOB_ID = JdbcWritableBridge.readString(14, __dbResults);
    this.COMMENTATORS_NAMES = JdbcWritableBridge.readString(15, __dbResults);
    this.COMMENTATORS_PHONE_NUMBER = JdbcWritableBridge.readString(16, __dbResults);
    this.COMMENTATORS_EMAIL = JdbcWritableBridge.readString(17, __dbResults);
    this.VOICE_OVER_BOOTH = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.CONTACT_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.REPORTS_PROC_STATUS = JdbcWritableBridge.readString(20, __dbResults);
    this.LOCATION = JdbcWritableBridge.readString(21, __dbResults);
    this.ENCODER_OPTION_ID = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.BROADCASTMANAGER_EVENT = JdbcWritableBridge.readString(23, __dbResults);
    this.NO_OF_MATCHES = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.UUID = JdbcWritableBridge.readString(25, __dbResults);
    this.REPORTS2_PROC_STATUS = JdbcWritableBridge.readString(26, __dbResults);
    this.REPORTS2_PROC_PRIORITY = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.PROD_TIER_ID = JdbcWritableBridge.readBigDecimal(28, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.EVENT_ID = JdbcWritableBridge.readBigDecimal(1, __dbResults);
    this.DESCRIPTION = JdbcWritableBridge.readString(2, __dbResults);
    this.RIGHTS_ID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.FEED_START_TIME = JdbcWritableBridge.readTimestamp(4, __dbResults);
    this.FEED_END_TIME = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.EVENT_START_TIME = JdbcWritableBridge.readTimestamp(6, __dbResults);
    this.EVENT_END_TIME = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.FEED_INFO = JdbcWritableBridge.readString(8, __dbResults);
    this.STATUS = JdbcWritableBridge.readString(9, __dbResults);
    this.GEOBLOCK_ID = JdbcWritableBridge.readBigDecimal(10, __dbResults);
    this.CHANNEL_ID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.JOB_ID = JdbcWritableBridge.readString(12, __dbResults);
    this.EXTERNAL_URL = JdbcWritableBridge.readString(13, __dbResults);
    this.BACKUP_JOB_ID = JdbcWritableBridge.readString(14, __dbResults);
    this.COMMENTATORS_NAMES = JdbcWritableBridge.readString(15, __dbResults);
    this.COMMENTATORS_PHONE_NUMBER = JdbcWritableBridge.readString(16, __dbResults);
    this.COMMENTATORS_EMAIL = JdbcWritableBridge.readString(17, __dbResults);
    this.VOICE_OVER_BOOTH = JdbcWritableBridge.readBigDecimal(18, __dbResults);
    this.CONTACT_ID = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.REPORTS_PROC_STATUS = JdbcWritableBridge.readString(20, __dbResults);
    this.LOCATION = JdbcWritableBridge.readString(21, __dbResults);
    this.ENCODER_OPTION_ID = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.BROADCASTMANAGER_EVENT = JdbcWritableBridge.readString(23, __dbResults);
    this.NO_OF_MATCHES = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.UUID = JdbcWritableBridge.readString(25, __dbResults);
    this.REPORTS2_PROC_STATUS = JdbcWritableBridge.readString(26, __dbResults);
    this.REPORTS2_PROC_PRIORITY = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.PROD_TIER_ID = JdbcWritableBridge.readBigDecimal(28, __dbResults);
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
    JdbcWritableBridge.writeBigDecimal(EVENT_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DESCRIPTION, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RIGHTS_ID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FEED_START_TIME, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FEED_END_TIME, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EVENT_START_TIME, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EVENT_END_TIME, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FEED_INFO, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATUS, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GEOBLOCK_ID, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CHANNEL_ID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(JOB_ID, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EXTERNAL_URL, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BACKUP_JOB_ID, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMENTATORS_NAMES, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(COMMENTATORS_PHONE_NUMBER, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMENTATORS_EMAIL, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOICE_OVER_BOOTH, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONTACT_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(REPORTS_PROC_STATUS, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOCATION, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ENCODER_OPTION_ID, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BROADCASTMANAGER_EVENT, 23 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NO_OF_MATCHES, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(UUID, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REPORTS2_PROC_STATUS, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPORTS2_PROC_PRIORITY, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PROD_TIER_ID, 28 + __off, 2, __dbStmt);
    return 28;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeBigDecimal(EVENT_ID, 1 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DESCRIPTION, 2 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(RIGHTS_ID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FEED_START_TIME, 4 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(FEED_END_TIME, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EVENT_START_TIME, 6 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(EVENT_END_TIME, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(FEED_INFO, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(STATUS, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GEOBLOCK_ID, 10 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CHANNEL_ID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(JOB_ID, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EXTERNAL_URL, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BACKUP_JOB_ID, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMENTATORS_NAMES, 15 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeString(COMMENTATORS_PHONE_NUMBER, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMENTATORS_EMAIL, 17 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VOICE_OVER_BOOTH, 18 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(CONTACT_ID, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(REPORTS_PROC_STATUS, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LOCATION, 21 + __off, -9, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ENCODER_OPTION_ID, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BROADCASTMANAGER_EVENT, 23 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NO_OF_MATCHES, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(UUID, 25 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REPORTS2_PROC_STATUS, 26 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(REPORTS2_PROC_PRIORITY, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(PROD_TIER_ID, 28 + __off, 2, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.EVENT_ID = null;
    } else {
    this.EVENT_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DESCRIPTION = null;
    } else {
    this.DESCRIPTION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.RIGHTS_ID = null;
    } else {
    this.RIGHTS_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.FEED_START_TIME = null;
    } else {
    this.FEED_START_TIME = new Timestamp(__dataIn.readLong());
    this.FEED_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FEED_END_TIME = null;
    } else {
    this.FEED_END_TIME = new Timestamp(__dataIn.readLong());
    this.FEED_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EVENT_START_TIME = null;
    } else {
    this.EVENT_START_TIME = new Timestamp(__dataIn.readLong());
    this.EVENT_START_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.EVENT_END_TIME = null;
    } else {
    this.EVENT_END_TIME = new Timestamp(__dataIn.readLong());
    this.EVENT_END_TIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FEED_INFO = null;
    } else {
    this.FEED_INFO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STATUS = null;
    } else {
    this.STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GEOBLOCK_ID = null;
    } else {
    this.GEOBLOCK_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CHANNEL_ID = null;
    } else {
    this.CHANNEL_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JOB_ID = null;
    } else {
    this.JOB_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EXTERNAL_URL = null;
    } else {
    this.EXTERNAL_URL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BACKUP_JOB_ID = null;
    } else {
    this.BACKUP_JOB_ID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMENTATORS_NAMES = null;
    } else {
    this.COMMENTATORS_NAMES = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMENTATORS_PHONE_NUMBER = null;
    } else {
    this.COMMENTATORS_PHONE_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMENTATORS_EMAIL = null;
    } else {
    this.COMMENTATORS_EMAIL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.VOICE_OVER_BOOTH = null;
    } else {
    this.VOICE_OVER_BOOTH = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CONTACT_ID = null;
    } else {
    this.CONTACT_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REPORTS_PROC_STATUS = null;
    } else {
    this.REPORTS_PROC_STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LOCATION = null;
    } else {
    this.LOCATION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ENCODER_OPTION_ID = null;
    } else {
    this.ENCODER_OPTION_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BROADCASTMANAGER_EVENT = null;
    } else {
    this.BROADCASTMANAGER_EVENT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NO_OF_MATCHES = null;
    } else {
    this.NO_OF_MATCHES = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UUID = null;
    } else {
    this.UUID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REPORTS2_PROC_STATUS = null;
    } else {
    this.REPORTS2_PROC_STATUS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REPORTS2_PROC_PRIORITY = null;
    } else {
    this.REPORTS2_PROC_PRIORITY = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PROD_TIER_ID = null;
    } else {
    this.PROD_TIER_ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.EVENT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EVENT_ID, __dataOut);
    }
    if (null == this.DESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DESCRIPTION);
    }
    if (null == this.RIGHTS_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RIGHTS_ID, __dataOut);
    }
    if (null == this.FEED_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FEED_START_TIME.getTime());
    __dataOut.writeInt(this.FEED_START_TIME.getNanos());
    }
    if (null == this.FEED_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FEED_END_TIME.getTime());
    __dataOut.writeInt(this.FEED_END_TIME.getNanos());
    }
    if (null == this.EVENT_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EVENT_START_TIME.getTime());
    __dataOut.writeInt(this.EVENT_START_TIME.getNanos());
    }
    if (null == this.EVENT_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EVENT_END_TIME.getTime());
    __dataOut.writeInt(this.EVENT_END_TIME.getNanos());
    }
    if (null == this.FEED_INFO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FEED_INFO);
    }
    if (null == this.STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS);
    }
    if (null == this.GEOBLOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GEOBLOCK_ID, __dataOut);
    }
    if (null == this.CHANNEL_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CHANNEL_ID, __dataOut);
    }
    if (null == this.JOB_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JOB_ID);
    }
    if (null == this.EXTERNAL_URL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EXTERNAL_URL);
    }
    if (null == this.BACKUP_JOB_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BACKUP_JOB_ID);
    }
    if (null == this.COMMENTATORS_NAMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMENTATORS_NAMES);
    }
    if (null == this.COMMENTATORS_PHONE_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMENTATORS_PHONE_NUMBER);
    }
    if (null == this.COMMENTATORS_EMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMENTATORS_EMAIL);
    }
    if (null == this.VOICE_OVER_BOOTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOICE_OVER_BOOTH, __dataOut);
    }
    if (null == this.CONTACT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONTACT_ID, __dataOut);
    }
    if (null == this.REPORTS_PROC_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REPORTS_PROC_STATUS);
    }
    if (null == this.LOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCATION);
    }
    if (null == this.ENCODER_OPTION_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ENCODER_OPTION_ID, __dataOut);
    }
    if (null == this.BROADCASTMANAGER_EVENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BROADCASTMANAGER_EVENT);
    }
    if (null == this.NO_OF_MATCHES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NO_OF_MATCHES, __dataOut);
    }
    if (null == this.UUID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UUID);
    }
    if (null == this.REPORTS2_PROC_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REPORTS2_PROC_STATUS);
    }
    if (null == this.REPORTS2_PROC_PRIORITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPORTS2_PROC_PRIORITY, __dataOut);
    }
    if (null == this.PROD_TIER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PROD_TIER_ID, __dataOut);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.EVENT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.EVENT_ID, __dataOut);
    }
    if (null == this.DESCRIPTION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DESCRIPTION);
    }
    if (null == this.RIGHTS_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.RIGHTS_ID, __dataOut);
    }
    if (null == this.FEED_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FEED_START_TIME.getTime());
    __dataOut.writeInt(this.FEED_START_TIME.getNanos());
    }
    if (null == this.FEED_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.FEED_END_TIME.getTime());
    __dataOut.writeInt(this.FEED_END_TIME.getNanos());
    }
    if (null == this.EVENT_START_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EVENT_START_TIME.getTime());
    __dataOut.writeInt(this.EVENT_START_TIME.getNanos());
    }
    if (null == this.EVENT_END_TIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.EVENT_END_TIME.getTime());
    __dataOut.writeInt(this.EVENT_END_TIME.getNanos());
    }
    if (null == this.FEED_INFO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FEED_INFO);
    }
    if (null == this.STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, STATUS);
    }
    if (null == this.GEOBLOCK_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GEOBLOCK_ID, __dataOut);
    }
    if (null == this.CHANNEL_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CHANNEL_ID, __dataOut);
    }
    if (null == this.JOB_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, JOB_ID);
    }
    if (null == this.EXTERNAL_URL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EXTERNAL_URL);
    }
    if (null == this.BACKUP_JOB_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BACKUP_JOB_ID);
    }
    if (null == this.COMMENTATORS_NAMES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMENTATORS_NAMES);
    }
    if (null == this.COMMENTATORS_PHONE_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMENTATORS_PHONE_NUMBER);
    }
    if (null == this.COMMENTATORS_EMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMENTATORS_EMAIL);
    }
    if (null == this.VOICE_OVER_BOOTH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VOICE_OVER_BOOTH, __dataOut);
    }
    if (null == this.CONTACT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.CONTACT_ID, __dataOut);
    }
    if (null == this.REPORTS_PROC_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REPORTS_PROC_STATUS);
    }
    if (null == this.LOCATION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LOCATION);
    }
    if (null == this.ENCODER_OPTION_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ENCODER_OPTION_ID, __dataOut);
    }
    if (null == this.BROADCASTMANAGER_EVENT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BROADCASTMANAGER_EVENT);
    }
    if (null == this.NO_OF_MATCHES) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NO_OF_MATCHES, __dataOut);
    }
    if (null == this.UUID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UUID);
    }
    if (null == this.REPORTS2_PROC_STATUS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REPORTS2_PROC_STATUS);
    }
    if (null == this.REPORTS2_PROC_PRIORITY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.REPORTS2_PROC_PRIORITY, __dataOut);
    }
    if (null == this.PROD_TIER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.PROD_TIER_ID, __dataOut);
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
    __sb.append(FieldFormatter.escapeAndEnclose(EVENT_ID==null?"null":EVENT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DESCRIPTION==null?"null":DESCRIPTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RIGHTS_ID==null?"null":RIGHTS_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEED_START_TIME==null?"null":"" + FEED_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEED_END_TIME==null?"null":"" + FEED_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EVENT_START_TIME==null?"null":"" + EVENT_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EVENT_END_TIME==null?"null":"" + EVENT_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEED_INFO==null?"null":FEED_INFO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS==null?"null":STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GEOBLOCK_ID==null?"null":GEOBLOCK_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANNEL_ID==null?"null":CHANNEL_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JOB_ID==null?"null":JOB_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTERNAL_URL==null?"null":EXTERNAL_URL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BACKUP_JOB_ID==null?"null":BACKUP_JOB_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMENTATORS_NAMES==null?"null":COMMENTATORS_NAMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMENTATORS_PHONE_NUMBER==null?"null":COMMENTATORS_PHONE_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMENTATORS_EMAIL==null?"null":COMMENTATORS_EMAIL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOICE_OVER_BOOTH==null?"null":VOICE_OVER_BOOTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_ID==null?"null":CONTACT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPORTS_PROC_STATUS==null?"null":REPORTS_PROC_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCATION==null?"null":LOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ENCODER_OPTION_ID==null?"null":ENCODER_OPTION_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BROADCASTMANAGER_EVENT==null?"null":BROADCASTMANAGER_EVENT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_OF_MATCHES==null?"null":NO_OF_MATCHES.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UUID==null?"null":UUID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPORTS2_PROC_STATUS==null?"null":REPORTS2_PROC_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPORTS2_PROC_PRIORITY==null?"null":REPORTS2_PROC_PRIORITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROD_TIER_ID==null?"null":PROD_TIER_ID.toPlainString(), delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(EVENT_ID==null?"null":EVENT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DESCRIPTION==null?"null":DESCRIPTION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(RIGHTS_ID==null?"null":RIGHTS_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEED_START_TIME==null?"null":"" + FEED_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEED_END_TIME==null?"null":"" + FEED_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EVENT_START_TIME==null?"null":"" + EVENT_START_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EVENT_END_TIME==null?"null":"" + EVENT_END_TIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FEED_INFO==null?"null":FEED_INFO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STATUS==null?"null":STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GEOBLOCK_ID==null?"null":GEOBLOCK_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CHANNEL_ID==null?"null":CHANNEL_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JOB_ID==null?"null":JOB_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EXTERNAL_URL==null?"null":EXTERNAL_URL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BACKUP_JOB_ID==null?"null":BACKUP_JOB_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMENTATORS_NAMES==null?"null":COMMENTATORS_NAMES, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMENTATORS_PHONE_NUMBER==null?"null":COMMENTATORS_PHONE_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMENTATORS_EMAIL==null?"null":COMMENTATORS_EMAIL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VOICE_OVER_BOOTH==null?"null":VOICE_OVER_BOOTH.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CONTACT_ID==null?"null":CONTACT_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPORTS_PROC_STATUS==null?"null":REPORTS_PROC_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LOCATION==null?"null":LOCATION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ENCODER_OPTION_ID==null?"null":ENCODER_OPTION_ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BROADCASTMANAGER_EVENT==null?"null":BROADCASTMANAGER_EVENT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NO_OF_MATCHES==null?"null":NO_OF_MATCHES.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UUID==null?"null":UUID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPORTS2_PROC_STATUS==null?"null":REPORTS2_PROC_STATUS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REPORTS2_PROC_PRIORITY==null?"null":REPORTS2_PROC_PRIORITY.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PROD_TIER_ID==null?"null":PROD_TIER_ID.toPlainString(), delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EVENT_ID = null; } else {
      this.EVENT_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DESCRIPTION = null; } else {
      this.DESCRIPTION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RIGHTS_ID = null; } else {
      this.RIGHTS_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FEED_START_TIME = null; } else {
      this.FEED_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FEED_END_TIME = null; } else {
      this.FEED_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EVENT_START_TIME = null; } else {
      this.EVENT_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EVENT_END_TIME = null; } else {
      this.EVENT_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FEED_INFO = null; } else {
      this.FEED_INFO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATUS = null; } else {
      this.STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GEOBLOCK_ID = null; } else {
      this.GEOBLOCK_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CHANNEL_ID = null; } else {
      this.CHANNEL_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JOB_ID = null; } else {
      this.JOB_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EXTERNAL_URL = null; } else {
      this.EXTERNAL_URL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BACKUP_JOB_ID = null; } else {
      this.BACKUP_JOB_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMENTATORS_NAMES = null; } else {
      this.COMMENTATORS_NAMES = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMENTATORS_PHONE_NUMBER = null; } else {
      this.COMMENTATORS_PHONE_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMENTATORS_EMAIL = null; } else {
      this.COMMENTATORS_EMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOICE_OVER_BOOTH = null; } else {
      this.VOICE_OVER_BOOTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CONTACT_ID = null; } else {
      this.CONTACT_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REPORTS_PROC_STATUS = null; } else {
      this.REPORTS_PROC_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOCATION = null; } else {
      this.LOCATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ENCODER_OPTION_ID = null; } else {
      this.ENCODER_OPTION_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BROADCASTMANAGER_EVENT = null; } else {
      this.BROADCASTMANAGER_EVENT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NO_OF_MATCHES = null; } else {
      this.NO_OF_MATCHES = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UUID = null; } else {
      this.UUID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REPORTS2_PROC_STATUS = null; } else {
      this.REPORTS2_PROC_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.REPORTS2_PROC_PRIORITY = null; } else {
      this.REPORTS2_PROC_PRIORITY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PROD_TIER_ID = null; } else {
      this.PROD_TIER_ID = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EVENT_ID = null; } else {
      this.EVENT_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DESCRIPTION = null; } else {
      this.DESCRIPTION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.RIGHTS_ID = null; } else {
      this.RIGHTS_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FEED_START_TIME = null; } else {
      this.FEED_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.FEED_END_TIME = null; } else {
      this.FEED_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EVENT_START_TIME = null; } else {
      this.EVENT_START_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EVENT_END_TIME = null; } else {
      this.EVENT_END_TIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FEED_INFO = null; } else {
      this.FEED_INFO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.STATUS = null; } else {
      this.STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GEOBLOCK_ID = null; } else {
      this.GEOBLOCK_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CHANNEL_ID = null; } else {
      this.CHANNEL_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.JOB_ID = null; } else {
      this.JOB_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EXTERNAL_URL = null; } else {
      this.EXTERNAL_URL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BACKUP_JOB_ID = null; } else {
      this.BACKUP_JOB_ID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMENTATORS_NAMES = null; } else {
      this.COMMENTATORS_NAMES = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMENTATORS_PHONE_NUMBER = null; } else {
      this.COMMENTATORS_PHONE_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMENTATORS_EMAIL = null; } else {
      this.COMMENTATORS_EMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VOICE_OVER_BOOTH = null; } else {
      this.VOICE_OVER_BOOTH = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CONTACT_ID = null; } else {
      this.CONTACT_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REPORTS_PROC_STATUS = null; } else {
      this.REPORTS_PROC_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LOCATION = null; } else {
      this.LOCATION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ENCODER_OPTION_ID = null; } else {
      this.ENCODER_OPTION_ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BROADCASTMANAGER_EVENT = null; } else {
      this.BROADCASTMANAGER_EVENT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NO_OF_MATCHES = null; } else {
      this.NO_OF_MATCHES = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UUID = null; } else {
      this.UUID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REPORTS2_PROC_STATUS = null; } else {
      this.REPORTS2_PROC_STATUS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.REPORTS2_PROC_PRIORITY = null; } else {
      this.REPORTS2_PROC_PRIORITY = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.PROD_TIER_ID = null; } else {
      this.PROD_TIER_ID = new java.math.BigDecimal(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    VDP_EVENTS o = (VDP_EVENTS) super.clone();
    o.FEED_START_TIME = (o.FEED_START_TIME != null) ? (java.sql.Timestamp) o.FEED_START_TIME.clone() : null;
    o.FEED_END_TIME = (o.FEED_END_TIME != null) ? (java.sql.Timestamp) o.FEED_END_TIME.clone() : null;
    o.EVENT_START_TIME = (o.EVENT_START_TIME != null) ? (java.sql.Timestamp) o.EVENT_START_TIME.clone() : null;
    o.EVENT_END_TIME = (o.EVENT_END_TIME != null) ? (java.sql.Timestamp) o.EVENT_END_TIME.clone() : null;
    return o;
  }

  public void clone0(VDP_EVENTS o) throws CloneNotSupportedException {
    o.FEED_START_TIME = (o.FEED_START_TIME != null) ? (java.sql.Timestamp) o.FEED_START_TIME.clone() : null;
    o.FEED_END_TIME = (o.FEED_END_TIME != null) ? (java.sql.Timestamp) o.FEED_END_TIME.clone() : null;
    o.EVENT_START_TIME = (o.EVENT_START_TIME != null) ? (java.sql.Timestamp) o.EVENT_START_TIME.clone() : null;
    o.EVENT_END_TIME = (o.EVENT_END_TIME != null) ? (java.sql.Timestamp) o.EVENT_END_TIME.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("EVENT_ID", this.EVENT_ID);
    __sqoop$field_map.put("DESCRIPTION", this.DESCRIPTION);
    __sqoop$field_map.put("RIGHTS_ID", this.RIGHTS_ID);
    __sqoop$field_map.put("FEED_START_TIME", this.FEED_START_TIME);
    __sqoop$field_map.put("FEED_END_TIME", this.FEED_END_TIME);
    __sqoop$field_map.put("EVENT_START_TIME", this.EVENT_START_TIME);
    __sqoop$field_map.put("EVENT_END_TIME", this.EVENT_END_TIME);
    __sqoop$field_map.put("FEED_INFO", this.FEED_INFO);
    __sqoop$field_map.put("STATUS", this.STATUS);
    __sqoop$field_map.put("GEOBLOCK_ID", this.GEOBLOCK_ID);
    __sqoop$field_map.put("CHANNEL_ID", this.CHANNEL_ID);
    __sqoop$field_map.put("JOB_ID", this.JOB_ID);
    __sqoop$field_map.put("EXTERNAL_URL", this.EXTERNAL_URL);
    __sqoop$field_map.put("BACKUP_JOB_ID", this.BACKUP_JOB_ID);
    __sqoop$field_map.put("COMMENTATORS_NAMES", this.COMMENTATORS_NAMES);
    __sqoop$field_map.put("COMMENTATORS_PHONE_NUMBER", this.COMMENTATORS_PHONE_NUMBER);
    __sqoop$field_map.put("COMMENTATORS_EMAIL", this.COMMENTATORS_EMAIL);
    __sqoop$field_map.put("VOICE_OVER_BOOTH", this.VOICE_OVER_BOOTH);
    __sqoop$field_map.put("CONTACT_ID", this.CONTACT_ID);
    __sqoop$field_map.put("REPORTS_PROC_STATUS", this.REPORTS_PROC_STATUS);
    __sqoop$field_map.put("LOCATION", this.LOCATION);
    __sqoop$field_map.put("ENCODER_OPTION_ID", this.ENCODER_OPTION_ID);
    __sqoop$field_map.put("BROADCASTMANAGER_EVENT", this.BROADCASTMANAGER_EVENT);
    __sqoop$field_map.put("NO_OF_MATCHES", this.NO_OF_MATCHES);
    __sqoop$field_map.put("UUID", this.UUID);
    __sqoop$field_map.put("REPORTS2_PROC_STATUS", this.REPORTS2_PROC_STATUS);
    __sqoop$field_map.put("REPORTS2_PROC_PRIORITY", this.REPORTS2_PROC_PRIORITY);
    __sqoop$field_map.put("PROD_TIER_ID", this.PROD_TIER_ID);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("EVENT_ID", this.EVENT_ID);
    __sqoop$field_map.put("DESCRIPTION", this.DESCRIPTION);
    __sqoop$field_map.put("RIGHTS_ID", this.RIGHTS_ID);
    __sqoop$field_map.put("FEED_START_TIME", this.FEED_START_TIME);
    __sqoop$field_map.put("FEED_END_TIME", this.FEED_END_TIME);
    __sqoop$field_map.put("EVENT_START_TIME", this.EVENT_START_TIME);
    __sqoop$field_map.put("EVENT_END_TIME", this.EVENT_END_TIME);
    __sqoop$field_map.put("FEED_INFO", this.FEED_INFO);
    __sqoop$field_map.put("STATUS", this.STATUS);
    __sqoop$field_map.put("GEOBLOCK_ID", this.GEOBLOCK_ID);
    __sqoop$field_map.put("CHANNEL_ID", this.CHANNEL_ID);
    __sqoop$field_map.put("JOB_ID", this.JOB_ID);
    __sqoop$field_map.put("EXTERNAL_URL", this.EXTERNAL_URL);
    __sqoop$field_map.put("BACKUP_JOB_ID", this.BACKUP_JOB_ID);
    __sqoop$field_map.put("COMMENTATORS_NAMES", this.COMMENTATORS_NAMES);
    __sqoop$field_map.put("COMMENTATORS_PHONE_NUMBER", this.COMMENTATORS_PHONE_NUMBER);
    __sqoop$field_map.put("COMMENTATORS_EMAIL", this.COMMENTATORS_EMAIL);
    __sqoop$field_map.put("VOICE_OVER_BOOTH", this.VOICE_OVER_BOOTH);
    __sqoop$field_map.put("CONTACT_ID", this.CONTACT_ID);
    __sqoop$field_map.put("REPORTS_PROC_STATUS", this.REPORTS_PROC_STATUS);
    __sqoop$field_map.put("LOCATION", this.LOCATION);
    __sqoop$field_map.put("ENCODER_OPTION_ID", this.ENCODER_OPTION_ID);
    __sqoop$field_map.put("BROADCASTMANAGER_EVENT", this.BROADCASTMANAGER_EVENT);
    __sqoop$field_map.put("NO_OF_MATCHES", this.NO_OF_MATCHES);
    __sqoop$field_map.put("UUID", this.UUID);
    __sqoop$field_map.put("REPORTS2_PROC_STATUS", this.REPORTS2_PROC_STATUS);
    __sqoop$field_map.put("REPORTS2_PROC_PRIORITY", this.REPORTS2_PROC_PRIORITY);
    __sqoop$field_map.put("PROD_TIER_ID", this.PROD_TIER_ID);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("EVENT_ID".equals(__fieldName)) {
      this.EVENT_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("DESCRIPTION".equals(__fieldName)) {
      this.DESCRIPTION = (String) __fieldVal;
    }
    else    if ("RIGHTS_ID".equals(__fieldName)) {
      this.RIGHTS_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("FEED_START_TIME".equals(__fieldName)) {
      this.FEED_START_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("FEED_END_TIME".equals(__fieldName)) {
      this.FEED_END_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("EVENT_START_TIME".equals(__fieldName)) {
      this.EVENT_START_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("EVENT_END_TIME".equals(__fieldName)) {
      this.EVENT_END_TIME = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("FEED_INFO".equals(__fieldName)) {
      this.FEED_INFO = (String) __fieldVal;
    }
    else    if ("STATUS".equals(__fieldName)) {
      this.STATUS = (String) __fieldVal;
    }
    else    if ("GEOBLOCK_ID".equals(__fieldName)) {
      this.GEOBLOCK_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CHANNEL_ID".equals(__fieldName)) {
      this.CHANNEL_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("JOB_ID".equals(__fieldName)) {
      this.JOB_ID = (String) __fieldVal;
    }
    else    if ("EXTERNAL_URL".equals(__fieldName)) {
      this.EXTERNAL_URL = (String) __fieldVal;
    }
    else    if ("BACKUP_JOB_ID".equals(__fieldName)) {
      this.BACKUP_JOB_ID = (String) __fieldVal;
    }
    else    if ("COMMENTATORS_NAMES".equals(__fieldName)) {
      this.COMMENTATORS_NAMES = (String) __fieldVal;
    }
    else    if ("COMMENTATORS_PHONE_NUMBER".equals(__fieldName)) {
      this.COMMENTATORS_PHONE_NUMBER = (String) __fieldVal;
    }
    else    if ("COMMENTATORS_EMAIL".equals(__fieldName)) {
      this.COMMENTATORS_EMAIL = (String) __fieldVal;
    }
    else    if ("VOICE_OVER_BOOTH".equals(__fieldName)) {
      this.VOICE_OVER_BOOTH = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("CONTACT_ID".equals(__fieldName)) {
      this.CONTACT_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("REPORTS_PROC_STATUS".equals(__fieldName)) {
      this.REPORTS_PROC_STATUS = (String) __fieldVal;
    }
    else    if ("LOCATION".equals(__fieldName)) {
      this.LOCATION = (String) __fieldVal;
    }
    else    if ("ENCODER_OPTION_ID".equals(__fieldName)) {
      this.ENCODER_OPTION_ID = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("BROADCASTMANAGER_EVENT".equals(__fieldName)) {
      this.BROADCASTMANAGER_EVENT = (String) __fieldVal;
    }
    else    if ("NO_OF_MATCHES".equals(__fieldName)) {
      this.NO_OF_MATCHES = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("UUID".equals(__fieldName)) {
      this.UUID = (String) __fieldVal;
    }
    else    if ("REPORTS2_PROC_STATUS".equals(__fieldName)) {
      this.REPORTS2_PROC_STATUS = (String) __fieldVal;
    }
    else    if ("REPORTS2_PROC_PRIORITY".equals(__fieldName)) {
      this.REPORTS2_PROC_PRIORITY = (java.math.BigDecimal) __fieldVal;
    }
    else    if ("PROD_TIER_ID".equals(__fieldName)) {
      this.PROD_TIER_ID = (java.math.BigDecimal) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("EVENT_ID".equals(__fieldName)) {
      this.EVENT_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("DESCRIPTION".equals(__fieldName)) {
      this.DESCRIPTION = (String) __fieldVal;
      return true;
    }
    else    if ("RIGHTS_ID".equals(__fieldName)) {
      this.RIGHTS_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("FEED_START_TIME".equals(__fieldName)) {
      this.FEED_START_TIME = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("FEED_END_TIME".equals(__fieldName)) {
      this.FEED_END_TIME = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("EVENT_START_TIME".equals(__fieldName)) {
      this.EVENT_START_TIME = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("EVENT_END_TIME".equals(__fieldName)) {
      this.EVENT_END_TIME = (java.sql.Timestamp) __fieldVal;
      return true;
    }
    else    if ("FEED_INFO".equals(__fieldName)) {
      this.FEED_INFO = (String) __fieldVal;
      return true;
    }
    else    if ("STATUS".equals(__fieldName)) {
      this.STATUS = (String) __fieldVal;
      return true;
    }
    else    if ("GEOBLOCK_ID".equals(__fieldName)) {
      this.GEOBLOCK_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CHANNEL_ID".equals(__fieldName)) {
      this.CHANNEL_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("JOB_ID".equals(__fieldName)) {
      this.JOB_ID = (String) __fieldVal;
      return true;
    }
    else    if ("EXTERNAL_URL".equals(__fieldName)) {
      this.EXTERNAL_URL = (String) __fieldVal;
      return true;
    }
    else    if ("BACKUP_JOB_ID".equals(__fieldName)) {
      this.BACKUP_JOB_ID = (String) __fieldVal;
      return true;
    }
    else    if ("COMMENTATORS_NAMES".equals(__fieldName)) {
      this.COMMENTATORS_NAMES = (String) __fieldVal;
      return true;
    }
    else    if ("COMMENTATORS_PHONE_NUMBER".equals(__fieldName)) {
      this.COMMENTATORS_PHONE_NUMBER = (String) __fieldVal;
      return true;
    }
    else    if ("COMMENTATORS_EMAIL".equals(__fieldName)) {
      this.COMMENTATORS_EMAIL = (String) __fieldVal;
      return true;
    }
    else    if ("VOICE_OVER_BOOTH".equals(__fieldName)) {
      this.VOICE_OVER_BOOTH = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("CONTACT_ID".equals(__fieldName)) {
      this.CONTACT_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("REPORTS_PROC_STATUS".equals(__fieldName)) {
      this.REPORTS_PROC_STATUS = (String) __fieldVal;
      return true;
    }
    else    if ("LOCATION".equals(__fieldName)) {
      this.LOCATION = (String) __fieldVal;
      return true;
    }
    else    if ("ENCODER_OPTION_ID".equals(__fieldName)) {
      this.ENCODER_OPTION_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("BROADCASTMANAGER_EVENT".equals(__fieldName)) {
      this.BROADCASTMANAGER_EVENT = (String) __fieldVal;
      return true;
    }
    else    if ("NO_OF_MATCHES".equals(__fieldName)) {
      this.NO_OF_MATCHES = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("UUID".equals(__fieldName)) {
      this.UUID = (String) __fieldVal;
      return true;
    }
    else    if ("REPORTS2_PROC_STATUS".equals(__fieldName)) {
      this.REPORTS2_PROC_STATUS = (String) __fieldVal;
      return true;
    }
    else    if ("REPORTS2_PROC_PRIORITY".equals(__fieldName)) {
      this.REPORTS2_PROC_PRIORITY = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else    if ("PROD_TIER_ID".equals(__fieldName)) {
      this.PROD_TIER_ID = (java.math.BigDecimal) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
