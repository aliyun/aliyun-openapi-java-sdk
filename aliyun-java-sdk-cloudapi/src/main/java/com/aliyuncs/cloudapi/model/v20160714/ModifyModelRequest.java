package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

public class ModifyModelRequest extends RpcAcsRequest<ModifyModelResponse> {

    public ModifyModelRequest() {
        super("CloudAPI", "2016-07-14", "ModifyModel", "apigateway");
    }

    private String groupId;
    private String modelName;
    private String description;
    private String schema;
    private String newModelName;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
        putQueryParameter("GroupId",groupId);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
        putQueryParameter("ModelName",modelName);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        putQueryParameter("Description",description);
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
        putQueryParameter("Schema",schema);
    }

    public String getNewModelName() {
        return newModelName;
    }

    public void setNewModelName(String newModelName) {
        this.newModelName = newModelName;
        putQueryParameter("NewModelName",newModelName);
    }

    @Override
    public Class<ModifyModelResponse> getResponseClass() {
        return ModifyModelResponse.class;
    }
}
