package com.isystk.sample.domain.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.27.1" }, date = "2020-03-24T15:30:59.511+0900")
public final class _MPostTag extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.isystk.sample.domain.entity.MPostTag> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.27.1");
    }

    private static final _MPostTag __singleton = new _MPostTag();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the postTagId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.isystk.sample.domain.entity.MPostTag, java.lang.Integer, java.lang.Integer> $postTagId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(com.isystk.sample.domain.entity.MPostTag.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.IntegerWrapper::new), "postTagId", "POST_TAG_ID", __namingType, false, __idGenerator);

    /** the name */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<com.isystk.sample.domain.entity.MPostTag, java.lang.String, java.lang.String> $name = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.isystk.sample.domain.entity.MPostTag.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.StringWrapper::new), "name", "NAME", __namingType, true, true, false);

    /** the registTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<com.isystk.sample.domain.entity.MPostTag, java.sql.Timestamp, java.sql.Timestamp> $registTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.isystk.sample.domain.entity.MPostTag.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.TimestampWrapper::new), "registTime", "REGIST_TIME", __namingType, true, true, false);

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<com.isystk.sample.domain.entity.MPostTag, java.sql.Timestamp, java.sql.Timestamp> $updateTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.isystk.sample.domain.entity.MPostTag.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.TimestampWrapper::new), "updateTime", "UPDATE_TIME", __namingType, true, true, false);

    /** the deleteFlg */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<com.isystk.sample.domain.entity.MPostTag, java.lang.Boolean, java.lang.Boolean> $deleteFlg = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.isystk.sample.domain.entity.MPostTag.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.BooleanWrapper::new), "deleteFlg", "DELETE_FLG", __namingType, true, true, false);

    private final java.util.function.Supplier<com.isystk.sample.domain.entity.MPostTagListener> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> __entityPropertyTypeMap;

    private _MPostTag() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "MPostTag";
        __catalogName = "";
        __schemaName = "";
        __tableName = "m_post_tag";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> __list = new java.util.ArrayList<>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> __map = new java.util.HashMap<>(5);
        __idList.add($postTagId);
        __list.add($postTagId);
        __map.put("postTagId", $postTagId);
        __list.add($name);
        __map.put("name", $name);
        __list.add($registTime);
        __map.put("registTime", $registTime);
        __list.add($updateTime);
        __map.put("updateTime", $updateTime);
        __list.add($deleteFlg);
        __map.put("deleteFlg", $deleteFlg);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.isystk.sample.domain.entity.MPostTag entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.isystk.sample.domain.entity.MPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.MPostTagListener.class;
        com.isystk.sample.domain.entity.MPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.isystk.sample.domain.entity.MPostTag entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.isystk.sample.domain.entity.MPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.MPostTagListener.class;
        com.isystk.sample.domain.entity.MPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.isystk.sample.domain.entity.MPostTag entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.isystk.sample.domain.entity.MPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.MPostTagListener.class;
        com.isystk.sample.domain.entity.MPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.isystk.sample.domain.entity.MPostTag entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.isystk.sample.domain.entity.MPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.MPostTagListener.class;
        com.isystk.sample.domain.entity.MPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.isystk.sample.domain.entity.MPostTag entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.isystk.sample.domain.entity.MPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.MPostTagListener.class;
        com.isystk.sample.domain.entity.MPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.isystk.sample.domain.entity.MPostTag entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.isystk.sample.domain.entity.MPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.MPostTagListener.class;
        com.isystk.sample.domain.entity.MPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.MPostTag, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.isystk.sample.domain.entity.MPostTag, ?, ?> getGeneratedIdPropertyType() {
        return $postTagId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.isystk.sample.domain.entity.MPostTag, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.isystk.sample.domain.entity.MPostTag, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public com.isystk.sample.domain.entity.MPostTag newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.isystk.sample.domain.entity.MPostTag, ?>> __args) {
        com.isystk.sample.domain.entity.MPostTag entity = new com.isystk.sample.domain.entity.MPostTag();
        if (__args.get("postTagId") != null) __args.get("postTagId").save(entity);
        if (__args.get("name") != null) __args.get("name").save(entity);
        if (__args.get("registTime") != null) __args.get("registTime").save(entity);
        if (__args.get("updateTime") != null) __args.get("updateTime").save(entity);
        if (__args.get("deleteFlg") != null) __args.get("deleteFlg").save(entity);
        return entity;
    }

    @Override
    public Class<com.isystk.sample.domain.entity.MPostTag> getEntityClass() {
        return com.isystk.sample.domain.entity.MPostTag.class;
    }

    @Override
    public com.isystk.sample.domain.entity.MPostTag getOriginalStates(com.isystk.sample.domain.entity.MPostTag __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.isystk.sample.domain.entity.MPostTag __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MPostTag getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MPostTag newInstance() {
        return new _MPostTag();
    }

    private static class ListenerHolder {
        private static com.isystk.sample.domain.entity.MPostTagListener listener = new com.isystk.sample.domain.entity.MPostTagListener();
    }

}