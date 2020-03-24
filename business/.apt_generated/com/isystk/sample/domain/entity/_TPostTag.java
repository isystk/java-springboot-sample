package com.isystk.sample.domain.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.27.1" }, date = "2020-03-24T15:30:59.163+0900")
public final class _TPostTag extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.isystk.sample.domain.entity.TPostTag> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.27.1");
    }

    private static final _TPostTag __singleton = new _TPostTag();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the postId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.isystk.sample.domain.entity.TPostTag, java.lang.Integer, java.lang.Integer> $postId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(com.isystk.sample.domain.entity.TPostTag.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.IntegerWrapper::new), "postId", "POST_ID", __namingType, false);

    /** the postTagId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.isystk.sample.domain.entity.TPostTag, java.lang.Integer, java.lang.Integer> $postTagId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(com.isystk.sample.domain.entity.TPostTag.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.IntegerWrapper::new), "postTagId", "POST_TAG_ID", __namingType, false);

    private final java.util.function.Supplier<com.isystk.sample.domain.entity.TPostTagListener> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> __entityPropertyTypeMap;

    private _TPostTag() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "TPostTag";
        __catalogName = "";
        __schemaName = "";
        __tableName = "t_post_tag";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> __list = new java.util.ArrayList<>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> __map = new java.util.HashMap<>(2);
        __idList.add($postId);
        __list.add($postId);
        __map.put("postId", $postId);
        __idList.add($postTagId);
        __list.add($postTagId);
        __map.put("postTagId", $postTagId);
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
    public void preInsert(com.isystk.sample.domain.entity.TPostTag entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.isystk.sample.domain.entity.TPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TPostTagListener.class;
        com.isystk.sample.domain.entity.TPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.isystk.sample.domain.entity.TPostTag entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.isystk.sample.domain.entity.TPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TPostTagListener.class;
        com.isystk.sample.domain.entity.TPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.isystk.sample.domain.entity.TPostTag entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.isystk.sample.domain.entity.TPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TPostTagListener.class;
        com.isystk.sample.domain.entity.TPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.isystk.sample.domain.entity.TPostTag entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.isystk.sample.domain.entity.TPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TPostTagListener.class;
        com.isystk.sample.domain.entity.TPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.isystk.sample.domain.entity.TPostTag entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.isystk.sample.domain.entity.TPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TPostTagListener.class;
        com.isystk.sample.domain.entity.TPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.isystk.sample.domain.entity.TPostTag entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.isystk.sample.domain.entity.TPostTag> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TPostTagListener.class;
        com.isystk.sample.domain.entity.TPostTagListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TPostTag, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.isystk.sample.domain.entity.TPostTag, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.isystk.sample.domain.entity.TPostTag, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.isystk.sample.domain.entity.TPostTag, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public com.isystk.sample.domain.entity.TPostTag newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.isystk.sample.domain.entity.TPostTag, ?>> __args) {
        com.isystk.sample.domain.entity.TPostTag entity = new com.isystk.sample.domain.entity.TPostTag();
        if (__args.get("postId") != null) __args.get("postId").save(entity);
        if (__args.get("postTagId") != null) __args.get("postTagId").save(entity);
        return entity;
    }

    @Override
    public Class<com.isystk.sample.domain.entity.TPostTag> getEntityClass() {
        return com.isystk.sample.domain.entity.TPostTag.class;
    }

    @Override
    public com.isystk.sample.domain.entity.TPostTag getOriginalStates(com.isystk.sample.domain.entity.TPostTag __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.isystk.sample.domain.entity.TPostTag __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TPostTag getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TPostTag newInstance() {
        return new _TPostTag();
    }

    private static class ListenerHolder {
        private static com.isystk.sample.domain.entity.TPostTagListener listener = new com.isystk.sample.domain.entity.TPostTagListener();
    }

}