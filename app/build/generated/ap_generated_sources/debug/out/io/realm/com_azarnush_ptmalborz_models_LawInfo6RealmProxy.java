package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_azarnush_ptmalborz_models_LawInfo6RealmProxy extends com.azarnush.ptmalborz.models.LawInfo6
    implements RealmObjectProxy, com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface {

    static final class LawInfo6ColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long lawIdIndex;
        long lawTitleIndex;
        long lawSummaryIndex;
        long lawContentIndex;
        long lawSourceLinkIndex;
        long lawTagIndex;
        long shortKeyIndex;
        long visibleStatusIdIndex;
        long registerDateIndex;
        long lawGroupRefIdIndex;

        LawInfo6ColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("LawInfo6");
            this.lawIdIndex = addColumnDetails("lawId", "lawId", objectSchemaInfo);
            this.lawTitleIndex = addColumnDetails("lawTitle", "lawTitle", objectSchemaInfo);
            this.lawSummaryIndex = addColumnDetails("lawSummary", "lawSummary", objectSchemaInfo);
            this.lawContentIndex = addColumnDetails("lawContent", "lawContent", objectSchemaInfo);
            this.lawSourceLinkIndex = addColumnDetails("lawSourceLink", "lawSourceLink", objectSchemaInfo);
            this.lawTagIndex = addColumnDetails("lawTag", "lawTag", objectSchemaInfo);
            this.shortKeyIndex = addColumnDetails("shortKey", "shortKey", objectSchemaInfo);
            this.visibleStatusIdIndex = addColumnDetails("visibleStatusId", "visibleStatusId", objectSchemaInfo);
            this.registerDateIndex = addColumnDetails("registerDate", "registerDate", objectSchemaInfo);
            this.lawGroupRefIdIndex = addColumnDetails("lawGroupRefId", "lawGroupRefId", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        LawInfo6ColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LawInfo6ColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LawInfo6ColumnInfo src = (LawInfo6ColumnInfo) rawSrc;
            final LawInfo6ColumnInfo dst = (LawInfo6ColumnInfo) rawDst;
            dst.lawIdIndex = src.lawIdIndex;
            dst.lawTitleIndex = src.lawTitleIndex;
            dst.lawSummaryIndex = src.lawSummaryIndex;
            dst.lawContentIndex = src.lawContentIndex;
            dst.lawSourceLinkIndex = src.lawSourceLinkIndex;
            dst.lawTagIndex = src.lawTagIndex;
            dst.shortKeyIndex = src.shortKeyIndex;
            dst.visibleStatusIdIndex = src.visibleStatusIdIndex;
            dst.registerDateIndex = src.registerDateIndex;
            dst.lawGroupRefIdIndex = src.lawGroupRefIdIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private LawInfo6ColumnInfo columnInfo;
    private ProxyState<com.azarnush.ptmalborz.models.LawInfo6> proxyState;

    com_azarnush_ptmalborz_models_LawInfo6RealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LawInfo6ColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.azarnush.ptmalborz.models.LawInfo6>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lawId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lawIdIndex);
    }

    @Override
    public void realmSet$lawId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lawIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lawIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lawIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lawIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lawTitle() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lawTitleIndex);
    }

    @Override
    public void realmSet$lawTitle(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lawTitleIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lawTitleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lawTitleIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lawTitleIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lawSummary() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lawSummaryIndex);
    }

    @Override
    public void realmSet$lawSummary(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lawSummaryIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lawSummaryIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lawSummaryIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lawSummaryIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lawContent() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lawContentIndex);
    }

    @Override
    public void realmSet$lawContent(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lawContentIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lawContentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lawContentIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lawContentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lawSourceLink() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lawSourceLinkIndex);
    }

    @Override
    public void realmSet$lawSourceLink(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lawSourceLinkIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lawSourceLinkIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lawSourceLinkIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lawSourceLinkIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lawTag() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lawTagIndex);
    }

    @Override
    public void realmSet$lawTag(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lawTagIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lawTagIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lawTagIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lawTagIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$shortKey() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.shortKeyIndex);
    }

    @Override
    public void realmSet$shortKey(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.shortKeyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.shortKeyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.shortKeyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.shortKeyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$visibleStatusId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.visibleStatusIdIndex);
    }

    @Override
    public void realmSet$visibleStatusId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.visibleStatusIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.visibleStatusIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.visibleStatusIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.visibleStatusIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$registerDate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.registerDateIndex);
    }

    @Override
    public void realmSet$registerDate(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.registerDateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.registerDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.registerDateIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.registerDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lawGroupRefId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lawGroupRefIdIndex);
    }

    @Override
    public void realmSet$lawGroupRefId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lawGroupRefIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lawGroupRefIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lawGroupRefIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lawGroupRefIdIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("LawInfo6", 10, 0);
        builder.addPersistedProperty("lawId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lawTitle", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lawSummary", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lawContent", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lawSourceLink", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lawTag", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("shortKey", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("visibleStatusId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("registerDate", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lawGroupRefId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LawInfo6ColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new LawInfo6ColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "LawInfo6";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "LawInfo6";
    }

    @SuppressWarnings("cast")
    public static com.azarnush.ptmalborz.models.LawInfo6 createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.azarnush.ptmalborz.models.LawInfo6 obj = realm.createObjectInternal(com.azarnush.ptmalborz.models.LawInfo6.class, true, excludeFields);

        final com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface objProxy = (com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) obj;
        if (json.has("lawId")) {
            if (json.isNull("lawId")) {
                objProxy.realmSet$lawId(null);
            } else {
                objProxy.realmSet$lawId((String) json.getString("lawId"));
            }
        }
        if (json.has("lawTitle")) {
            if (json.isNull("lawTitle")) {
                objProxy.realmSet$lawTitle(null);
            } else {
                objProxy.realmSet$lawTitle((String) json.getString("lawTitle"));
            }
        }
        if (json.has("lawSummary")) {
            if (json.isNull("lawSummary")) {
                objProxy.realmSet$lawSummary(null);
            } else {
                objProxy.realmSet$lawSummary((String) json.getString("lawSummary"));
            }
        }
        if (json.has("lawContent")) {
            if (json.isNull("lawContent")) {
                objProxy.realmSet$lawContent(null);
            } else {
                objProxy.realmSet$lawContent((String) json.getString("lawContent"));
            }
        }
        if (json.has("lawSourceLink")) {
            if (json.isNull("lawSourceLink")) {
                objProxy.realmSet$lawSourceLink(null);
            } else {
                objProxy.realmSet$lawSourceLink((String) json.getString("lawSourceLink"));
            }
        }
        if (json.has("lawTag")) {
            if (json.isNull("lawTag")) {
                objProxy.realmSet$lawTag(null);
            } else {
                objProxy.realmSet$lawTag((String) json.getString("lawTag"));
            }
        }
        if (json.has("shortKey")) {
            if (json.isNull("shortKey")) {
                objProxy.realmSet$shortKey(null);
            } else {
                objProxy.realmSet$shortKey((String) json.getString("shortKey"));
            }
        }
        if (json.has("visibleStatusId")) {
            if (json.isNull("visibleStatusId")) {
                objProxy.realmSet$visibleStatusId(null);
            } else {
                objProxy.realmSet$visibleStatusId((String) json.getString("visibleStatusId"));
            }
        }
        if (json.has("registerDate")) {
            if (json.isNull("registerDate")) {
                objProxy.realmSet$registerDate(null);
            } else {
                objProxy.realmSet$registerDate((String) json.getString("registerDate"));
            }
        }
        if (json.has("lawGroupRefId")) {
            if (json.isNull("lawGroupRefId")) {
                objProxy.realmSet$lawGroupRefId(null);
            } else {
                objProxy.realmSet$lawGroupRefId((String) json.getString("lawGroupRefId"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.azarnush.ptmalborz.models.LawInfo6 createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.azarnush.ptmalborz.models.LawInfo6 obj = new com.azarnush.ptmalborz.models.LawInfo6();
        final com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface objProxy = (com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("lawId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lawId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lawId(null);
                }
            } else if (name.equals("lawTitle")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lawTitle((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lawTitle(null);
                }
            } else if (name.equals("lawSummary")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lawSummary((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lawSummary(null);
                }
            } else if (name.equals("lawContent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lawContent((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lawContent(null);
                }
            } else if (name.equals("lawSourceLink")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lawSourceLink((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lawSourceLink(null);
                }
            } else if (name.equals("lawTag")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lawTag((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lawTag(null);
                }
            } else if (name.equals("shortKey")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$shortKey((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$shortKey(null);
                }
            } else if (name.equals("visibleStatusId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$visibleStatusId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$visibleStatusId(null);
                }
            } else if (name.equals("registerDate")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$registerDate((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$registerDate(null);
                }
            } else if (name.equals("lawGroupRefId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lawGroupRefId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lawGroupRefId(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static com_azarnush_ptmalborz_models_LawInfo6RealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo6.class), false, Collections.<String>emptyList());
        io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy obj = new io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.azarnush.ptmalborz.models.LawInfo6 copyOrUpdate(Realm realm, LawInfo6ColumnInfo columnInfo, com.azarnush.ptmalborz.models.LawInfo6 object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.azarnush.ptmalborz.models.LawInfo6) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.azarnush.ptmalborz.models.LawInfo6 copy(Realm realm, LawInfo6ColumnInfo columnInfo, com.azarnush.ptmalborz.models.LawInfo6 newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.azarnush.ptmalborz.models.LawInfo6) cachedRealmObject;
        }

        com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface realmObjectSource = (com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) newObject;

        Table table = realm.getTable(com.azarnush.ptmalborz.models.LawInfo6.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.lawIdIndex, realmObjectSource.realmGet$lawId());
        builder.addString(columnInfo.lawTitleIndex, realmObjectSource.realmGet$lawTitle());
        builder.addString(columnInfo.lawSummaryIndex, realmObjectSource.realmGet$lawSummary());
        builder.addString(columnInfo.lawContentIndex, realmObjectSource.realmGet$lawContent());
        builder.addString(columnInfo.lawSourceLinkIndex, realmObjectSource.realmGet$lawSourceLink());
        builder.addString(columnInfo.lawTagIndex, realmObjectSource.realmGet$lawTag());
        builder.addString(columnInfo.shortKeyIndex, realmObjectSource.realmGet$shortKey());
        builder.addString(columnInfo.visibleStatusIdIndex, realmObjectSource.realmGet$visibleStatusId());
        builder.addString(columnInfo.registerDateIndex, realmObjectSource.realmGet$registerDate());
        builder.addString(columnInfo.lawGroupRefIdIndex, realmObjectSource.realmGet$lawGroupRefId());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, com.azarnush.ptmalborz.models.LawInfo6 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.azarnush.ptmalborz.models.LawInfo6.class);
        long tableNativePtr = table.getNativePtr();
        LawInfo6ColumnInfo columnInfo = (LawInfo6ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo6.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$lawId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawId();
        if (realmGet$lawId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawIdIndex, rowIndex, realmGet$lawId, false);
        }
        String realmGet$lawTitle = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTitle();
        if (realmGet$lawTitle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawTitleIndex, rowIndex, realmGet$lawTitle, false);
        }
        String realmGet$lawSummary = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSummary();
        if (realmGet$lawSummary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawSummaryIndex, rowIndex, realmGet$lawSummary, false);
        }
        String realmGet$lawContent = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawContent();
        if (realmGet$lawContent != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawContentIndex, rowIndex, realmGet$lawContent, false);
        }
        String realmGet$lawSourceLink = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSourceLink();
        if (realmGet$lawSourceLink != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawSourceLinkIndex, rowIndex, realmGet$lawSourceLink, false);
        }
        String realmGet$lawTag = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTag();
        if (realmGet$lawTag != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawTagIndex, rowIndex, realmGet$lawTag, false);
        }
        String realmGet$shortKey = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$shortKey();
        if (realmGet$shortKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.shortKeyIndex, rowIndex, realmGet$shortKey, false);
        }
        String realmGet$visibleStatusId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$visibleStatusId();
        if (realmGet$visibleStatusId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.visibleStatusIdIndex, rowIndex, realmGet$visibleStatusId, false);
        }
        String realmGet$registerDate = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$registerDate();
        if (realmGet$registerDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.registerDateIndex, rowIndex, realmGet$registerDate, false);
        }
        String realmGet$lawGroupRefId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawGroupRefId();
        if (realmGet$lawGroupRefId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawGroupRefIdIndex, rowIndex, realmGet$lawGroupRefId, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.azarnush.ptmalborz.models.LawInfo6.class);
        long tableNativePtr = table.getNativePtr();
        LawInfo6ColumnInfo columnInfo = (LawInfo6ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo6.class);
        com.azarnush.ptmalborz.models.LawInfo6 object = null;
        while (objects.hasNext()) {
            object = (com.azarnush.ptmalborz.models.LawInfo6) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$lawId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawId();
            if (realmGet$lawId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawIdIndex, rowIndex, realmGet$lawId, false);
            }
            String realmGet$lawTitle = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTitle();
            if (realmGet$lawTitle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawTitleIndex, rowIndex, realmGet$lawTitle, false);
            }
            String realmGet$lawSummary = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSummary();
            if (realmGet$lawSummary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawSummaryIndex, rowIndex, realmGet$lawSummary, false);
            }
            String realmGet$lawContent = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawContent();
            if (realmGet$lawContent != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawContentIndex, rowIndex, realmGet$lawContent, false);
            }
            String realmGet$lawSourceLink = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSourceLink();
            if (realmGet$lawSourceLink != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawSourceLinkIndex, rowIndex, realmGet$lawSourceLink, false);
            }
            String realmGet$lawTag = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTag();
            if (realmGet$lawTag != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawTagIndex, rowIndex, realmGet$lawTag, false);
            }
            String realmGet$shortKey = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$shortKey();
            if (realmGet$shortKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.shortKeyIndex, rowIndex, realmGet$shortKey, false);
            }
            String realmGet$visibleStatusId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$visibleStatusId();
            if (realmGet$visibleStatusId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.visibleStatusIdIndex, rowIndex, realmGet$visibleStatusId, false);
            }
            String realmGet$registerDate = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$registerDate();
            if (realmGet$registerDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.registerDateIndex, rowIndex, realmGet$registerDate, false);
            }
            String realmGet$lawGroupRefId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawGroupRefId();
            if (realmGet$lawGroupRefId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawGroupRefIdIndex, rowIndex, realmGet$lawGroupRefId, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.azarnush.ptmalborz.models.LawInfo6 object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.azarnush.ptmalborz.models.LawInfo6.class);
        long tableNativePtr = table.getNativePtr();
        LawInfo6ColumnInfo columnInfo = (LawInfo6ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo6.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$lawId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawId();
        if (realmGet$lawId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawIdIndex, rowIndex, realmGet$lawId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lawIdIndex, rowIndex, false);
        }
        String realmGet$lawTitle = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTitle();
        if (realmGet$lawTitle != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawTitleIndex, rowIndex, realmGet$lawTitle, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lawTitleIndex, rowIndex, false);
        }
        String realmGet$lawSummary = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSummary();
        if (realmGet$lawSummary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawSummaryIndex, rowIndex, realmGet$lawSummary, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lawSummaryIndex, rowIndex, false);
        }
        String realmGet$lawContent = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawContent();
        if (realmGet$lawContent != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawContentIndex, rowIndex, realmGet$lawContent, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lawContentIndex, rowIndex, false);
        }
        String realmGet$lawSourceLink = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSourceLink();
        if (realmGet$lawSourceLink != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawSourceLinkIndex, rowIndex, realmGet$lawSourceLink, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lawSourceLinkIndex, rowIndex, false);
        }
        String realmGet$lawTag = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTag();
        if (realmGet$lawTag != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawTagIndex, rowIndex, realmGet$lawTag, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lawTagIndex, rowIndex, false);
        }
        String realmGet$shortKey = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$shortKey();
        if (realmGet$shortKey != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.shortKeyIndex, rowIndex, realmGet$shortKey, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.shortKeyIndex, rowIndex, false);
        }
        String realmGet$visibleStatusId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$visibleStatusId();
        if (realmGet$visibleStatusId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.visibleStatusIdIndex, rowIndex, realmGet$visibleStatusId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.visibleStatusIdIndex, rowIndex, false);
        }
        String realmGet$registerDate = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$registerDate();
        if (realmGet$registerDate != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.registerDateIndex, rowIndex, realmGet$registerDate, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.registerDateIndex, rowIndex, false);
        }
        String realmGet$lawGroupRefId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawGroupRefId();
        if (realmGet$lawGroupRefId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lawGroupRefIdIndex, rowIndex, realmGet$lawGroupRefId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lawGroupRefIdIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.azarnush.ptmalborz.models.LawInfo6.class);
        long tableNativePtr = table.getNativePtr();
        LawInfo6ColumnInfo columnInfo = (LawInfo6ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo6.class);
        com.azarnush.ptmalborz.models.LawInfo6 object = null;
        while (objects.hasNext()) {
            object = (com.azarnush.ptmalborz.models.LawInfo6) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$lawId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawId();
            if (realmGet$lawId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawIdIndex, rowIndex, realmGet$lawId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lawIdIndex, rowIndex, false);
            }
            String realmGet$lawTitle = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTitle();
            if (realmGet$lawTitle != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawTitleIndex, rowIndex, realmGet$lawTitle, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lawTitleIndex, rowIndex, false);
            }
            String realmGet$lawSummary = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSummary();
            if (realmGet$lawSummary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawSummaryIndex, rowIndex, realmGet$lawSummary, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lawSummaryIndex, rowIndex, false);
            }
            String realmGet$lawContent = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawContent();
            if (realmGet$lawContent != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawContentIndex, rowIndex, realmGet$lawContent, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lawContentIndex, rowIndex, false);
            }
            String realmGet$lawSourceLink = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawSourceLink();
            if (realmGet$lawSourceLink != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawSourceLinkIndex, rowIndex, realmGet$lawSourceLink, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lawSourceLinkIndex, rowIndex, false);
            }
            String realmGet$lawTag = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawTag();
            if (realmGet$lawTag != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawTagIndex, rowIndex, realmGet$lawTag, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lawTagIndex, rowIndex, false);
            }
            String realmGet$shortKey = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$shortKey();
            if (realmGet$shortKey != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.shortKeyIndex, rowIndex, realmGet$shortKey, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.shortKeyIndex, rowIndex, false);
            }
            String realmGet$visibleStatusId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$visibleStatusId();
            if (realmGet$visibleStatusId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.visibleStatusIdIndex, rowIndex, realmGet$visibleStatusId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.visibleStatusIdIndex, rowIndex, false);
            }
            String realmGet$registerDate = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$registerDate();
            if (realmGet$registerDate != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.registerDateIndex, rowIndex, realmGet$registerDate, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.registerDateIndex, rowIndex, false);
            }
            String realmGet$lawGroupRefId = ((com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) object).realmGet$lawGroupRefId();
            if (realmGet$lawGroupRefId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lawGroupRefIdIndex, rowIndex, realmGet$lawGroupRefId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lawGroupRefIdIndex, rowIndex, false);
            }
        }
    }

    public static com.azarnush.ptmalborz.models.LawInfo6 createDetachedCopy(com.azarnush.ptmalborz.models.LawInfo6 realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.azarnush.ptmalborz.models.LawInfo6 unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.azarnush.ptmalborz.models.LawInfo6();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.azarnush.ptmalborz.models.LawInfo6) cachedObject.object;
            }
            unmanagedObject = (com.azarnush.ptmalborz.models.LawInfo6) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface unmanagedCopy = (com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) unmanagedObject;
        com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface realmSource = (com_azarnush_ptmalborz_models_LawInfo6RealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$lawId(realmSource.realmGet$lawId());
        unmanagedCopy.realmSet$lawTitle(realmSource.realmGet$lawTitle());
        unmanagedCopy.realmSet$lawSummary(realmSource.realmGet$lawSummary());
        unmanagedCopy.realmSet$lawContent(realmSource.realmGet$lawContent());
        unmanagedCopy.realmSet$lawSourceLink(realmSource.realmGet$lawSourceLink());
        unmanagedCopy.realmSet$lawTag(realmSource.realmGet$lawTag());
        unmanagedCopy.realmSet$shortKey(realmSource.realmGet$shortKey());
        unmanagedCopy.realmSet$visibleStatusId(realmSource.realmGet$visibleStatusId());
        unmanagedCopy.realmSet$registerDate(realmSource.realmGet$registerDate());
        unmanagedCopy.realmSet$lawGroupRefId(realmSource.realmGet$lawGroupRefId());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("LawInfo6 = proxy[");
        stringBuilder.append("{lawId:");
        stringBuilder.append(realmGet$lawId() != null ? realmGet$lawId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lawTitle:");
        stringBuilder.append(realmGet$lawTitle() != null ? realmGet$lawTitle() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lawSummary:");
        stringBuilder.append(realmGet$lawSummary() != null ? realmGet$lawSummary() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lawContent:");
        stringBuilder.append(realmGet$lawContent() != null ? realmGet$lawContent() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lawSourceLink:");
        stringBuilder.append(realmGet$lawSourceLink() != null ? realmGet$lawSourceLink() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lawTag:");
        stringBuilder.append(realmGet$lawTag() != null ? realmGet$lawTag() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{shortKey:");
        stringBuilder.append(realmGet$shortKey() != null ? realmGet$shortKey() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{visibleStatusId:");
        stringBuilder.append(realmGet$visibleStatusId() != null ? realmGet$visibleStatusId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{registerDate:");
        stringBuilder.append(realmGet$registerDate() != null ? realmGet$registerDate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lawGroupRefId:");
        stringBuilder.append(realmGet$lawGroupRefId() != null ? realmGet$lawGroupRefId() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_azarnush_ptmalborz_models_LawInfo6RealmProxy aLawInfo6 = (com_azarnush_ptmalborz_models_LawInfo6RealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aLawInfo6.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLawInfo6.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aLawInfo6.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
