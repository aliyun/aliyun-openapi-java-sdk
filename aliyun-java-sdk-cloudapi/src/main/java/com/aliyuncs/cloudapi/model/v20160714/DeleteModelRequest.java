package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

public class DeleteModelRequest extends RpcAcsRequest<DeleteModelResponse> {
    public DeleteModelRequest() {
        super("CloudAPI", "2016-07-14", "DeleteModel", "apigateway");
    }

    private String modelName;
    private String groupId;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
        putQueryParameter("ModelName",modelName);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
        putQueryParameter("GroupId",groupId);
    }

    @Override
    public Class<DeleteModelResponse> getResponseClass() {
        return DeleteModelResponse.class;
    }
}
