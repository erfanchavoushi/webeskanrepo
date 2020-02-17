package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(5);
        modelClasses.add(com.azarnush.ptmalborz.models.LawInfo2.class);
        modelClasses.add(com.azarnush.ptmalborz.models.LawInfo3.class);
        modelClasses.add(com.azarnush.ptmalborz.models.LawInfo6.class);
        modelClasses.add(com.azarnush.ptmalborz.models.LawInfo4.class);
        modelClasses.add(com.azarnush.ptmalborz.models.LawInfo5.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(5);
        infoMap.put(com.azarnush.ptmalborz.models.LawInfo2.class, io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.azarnush.ptmalborz.models.LawInfo3.class, io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.azarnush.ptmalborz.models.LawInfo6.class, io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.azarnush.ptmalborz.models.LawInfo4.class, io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.azarnush.ptmalborz.models.LawInfo5.class, io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            return io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            return io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            return io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            return io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            return io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            return "LawInfo2";
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            return "LawInfo3";
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            return "LawInfo6";
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            return "LawInfo4";
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            return "LawInfo5";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
                return clazz.cast(new io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy());
            }
            if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
                return clazz.cast(new io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy());
            }
            if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
                return clazz.cast(new io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy());
            }
            if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
                return clazz.cast(new io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy());
            }
            if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
                return clazz.cast(new io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            com_azarnush_ptmalborz_models_LawInfo2RealmProxy.LawInfo2ColumnInfo columnInfo = (com_azarnush_ptmalborz_models_LawInfo2RealmProxy.LawInfo2ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo2.class);
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.copyOrUpdate(realm, columnInfo, (com.azarnush.ptmalborz.models.LawInfo2) obj, update, cache, flags));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            com_azarnush_ptmalborz_models_LawInfo3RealmProxy.LawInfo3ColumnInfo columnInfo = (com_azarnush_ptmalborz_models_LawInfo3RealmProxy.LawInfo3ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo3.class);
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.copyOrUpdate(realm, columnInfo, (com.azarnush.ptmalborz.models.LawInfo3) obj, update, cache, flags));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            com_azarnush_ptmalborz_models_LawInfo6RealmProxy.LawInfo6ColumnInfo columnInfo = (com_azarnush_ptmalborz_models_LawInfo6RealmProxy.LawInfo6ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo6.class);
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.copyOrUpdate(realm, columnInfo, (com.azarnush.ptmalborz.models.LawInfo6) obj, update, cache, flags));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            com_azarnush_ptmalborz_models_LawInfo4RealmProxy.LawInfo4ColumnInfo columnInfo = (com_azarnush_ptmalborz_models_LawInfo4RealmProxy.LawInfo4ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo4.class);
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.copyOrUpdate(realm, columnInfo, (com.azarnush.ptmalborz.models.LawInfo4) obj, update, cache, flags));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            com_azarnush_ptmalborz_models_LawInfo5RealmProxy.LawInfo5ColumnInfo columnInfo = (com_azarnush_ptmalborz_models_LawInfo5RealmProxy.LawInfo5ColumnInfo) realm.getSchema().getColumnInfo(com.azarnush.ptmalborz.models.LawInfo5.class);
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.copyOrUpdate(realm, columnInfo, (com.azarnush.ptmalborz.models.LawInfo5) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo2) object, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo3) object, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo6) object, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo4) object, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo5) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo2) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo3) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo6) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo4) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.insert(realm, (com.azarnush.ptmalborz.models.LawInfo5) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo2) obj, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo3) obj, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo6) obj, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo4) obj, cache);
        } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo5) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo2) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo3) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo6) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo4) object, cache);
            } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
                io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.insertOrUpdate(realm, (com.azarnush.ptmalborz.models.LawInfo5) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
                    io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo2.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo2RealmProxy.createDetachedCopy((com.azarnush.ptmalborz.models.LawInfo2) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo3.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo3RealmProxy.createDetachedCopy((com.azarnush.ptmalborz.models.LawInfo3) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo6.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo6RealmProxy.createDetachedCopy((com.azarnush.ptmalborz.models.LawInfo6) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo4.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo4RealmProxy.createDetachedCopy((com.azarnush.ptmalborz.models.LawInfo4) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.azarnush.ptmalborz.models.LawInfo5.class)) {
            return clazz.cast(io.realm.com_azarnush_ptmalborz_models_LawInfo5RealmProxy.createDetachedCopy((com.azarnush.ptmalborz.models.LawInfo5) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
