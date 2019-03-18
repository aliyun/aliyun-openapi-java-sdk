package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

public class DescribeModelsRequest extends RpcAcsRequest<DescribeModelsResponse> {

    public DescribeModelsRequest() {
        super("CloudAPI", "2016-07-14", "DescribeModels", "apigateway");

    }

    private String groupId;
    private String modelName;
    private String modelId;
    private Integer pageNumber;
    private Integer pageSize;

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

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
        putQueryParameter("ModelId",modelId);
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        putQueryParameter("PageNumber",pageNumber);
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        putQueryParameter("PageSize",pageSize);
    }

    @Override
    public Class<DescribeModelsResponse> getResponseClass() {
        return DescribeModelsResponse.class;
    }
}
