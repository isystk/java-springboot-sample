package com.isystk.sample.domain.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.27.1" }, date = "2020-03-24T15:31:00.366+0900")
public final class _TImage extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.isystk.sample.domain.entity.TImage> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.27.1");
    }

    private static final _TImage __singleton = new _TImage();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the imageId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.isystk.sample.domain.entity.TImage, java.lang.Integer, java.lang.Integer> $imageId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(com.isystk.sample.domain.entity.TImage.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.IntegerWrapper::new), "imageId", "IMAGE_ID", __namingType, false);

    /** the registTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<com.isystk.sample.domain.entity.TImage, java.sql.Timestamp, java.sql.Timestamp> $registTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.isystk.sample.domain.entity.TImage.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.TimestampWrapper::new), "registTime", "REGIST_TIME", __namingType, true, true, false);

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<com.isystk.sample.domain.entity.TImage, java.sql.Timestamp, java.sql.Timestamp> $updateTime = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.isystk.sample.domain.entity.TImage.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.TimestampWrapper::new), "updateTime", "UPDATE_TIME", __namingType, true, true, false);

    /** the deleteFlg */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<com.isystk.sample.domain.entity.TImage, java.lang.Boolean, java.lang.Boolean> $deleteFlg = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.isystk.sample.domain.entity.TImage.class, () -> new org.seasar.doma.internal.jdbc.scalar.BasicScalar<>(org.seasar.doma.wrapper.BooleanWrapper::new), "deleteFlg", "DELETE_FLG", __namingType, true, true, false);

    private final java.util.function.Supplier<com.isystk.sample.domain.entity.TImageListener> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> __entityPropertyTypeMap;

    private _TImage() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "TImage";
        __catalogName = "";
        __schemaName = "";
        __tableName = "t_image";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($imageId);
        __list.add($imageId);
        __map.put("imageId", $imageId);
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
    public void preInsert(com.isystk.sample.domain.entity.TImage entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.isystk.sample.domain.entity.TImage> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TImageListener.class;
        com.isystk.sample.domain.entity.TImageListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.isystk.sample.domain.entity.TImage entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.isystk.sample.domain.entity.TImage> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TImageListener.class;
        com.isystk.sample.domain.entity.TImageListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.isystk.sample.domain.entity.TImage entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.isystk.sample.domain.entity.TImage> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TImageListener.class;
        com.isystk.sample.domain.entity.TImageListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.isystk.sample.domain.entity.TImage entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.isystk.sample.domain.entity.TImage> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TImageListener.class;
        com.isystk.sample.domain.entity.TImageListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.isystk.sample.domain.entity.TImage entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.isystk.sample.domain.entity.TImage> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TImageListener.class;
        com.isystk.sample.domain.entity.TImageListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.isystk.sample.domain.entity.TImage entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.isystk.sample.domain.entity.TImage> context) {
        Class __listenerClass = com.isystk.sample.domain.entity.TImageListener.class;
        com.isystk.sample.domain.entity.TImageListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.isystk.sample.domain.entity.TImage, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<com.isystk.sample.domain.entity.TImage, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<com.isystk.sample.domain.entity.TImage, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.TenantIdPropertyType<com.isystk.sample.domain.entity.TImage, ?, ?> getTenantIdPropertyType() {
        return null;
    }

    @Override
    public com.isystk.sample.domain.entity.TImage newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.isystk.sample.domain.entity.TImage, ?>> __args) {
        com.isystk.sample.domain.entity.TImage entity = new com.isystk.sample.domain.entity.TImage();
        if (__args.get("imageId") != null) __args.get("imageId").save(entity);
        if (__args.get("registTime") != null) __args.get("registTime").save(entity);
        if (__args.get("updateTime") != null) __args.get("updateTime").save(entity);
        if (__args.get("deleteFlg") != null) __args.get("deleteFlg").save(entity);
        return entity;
    }

    @Override
    public Class<com.isystk.sample.domain.entity.TImage> getEntityClass() {
        return com.isystk.sample.domain.entity.TImage.class;
    }

    @Override
    public com.isystk.sample.domain.entity.TImage getOriginalStates(com.isystk.sample.domain.entity.TImage __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.isystk.sample.domain.entity.TImage __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TImage getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TImage newInstance() {
        return new _TImage();
    }

    private static class ListenerHolder {
        private static com.isystk.sample.domain.entity.TImageListener listener = new com.isystk.sample.domain.entity.TImageListener();
    }

}