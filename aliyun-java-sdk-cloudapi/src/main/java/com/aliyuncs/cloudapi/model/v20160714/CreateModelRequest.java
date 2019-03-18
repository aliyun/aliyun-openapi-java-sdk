package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class CreateModelRequest extends RpcAcsRequest<CreateModelResponse> {

    public CreateModelRequest() {
        super("CloudAPI", "2016-07-14", "CreateModel", "apigateway");
    }

    private String groupId;
    private String modelName;
    private String schema;
    private String description;

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

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
        putQueryParameter("Schema",schema);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        putQueryParameter("Description",description);
    }

    @Override
    public Class<CreateModelResponse> getResponseClass() {
        return CreateModelResponse.class;
    }
}
