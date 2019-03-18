package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class DescribePluginsByApiRequest extends RpcAcsRequest<DescribePluginsByApiResponse> {

    public DescribePluginsByApiRequest() {
        super("CloudAPI", "2016-07-14", "DescribePluginsByApi", "apigateway");
    }

    private String groupId;
    private String stageName;
    private String apiId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
        putQueryParameter("GroupId",groupId);
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
        putQueryParameter("StageName",stageName);
    }

    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
        putQueryParameter("ApiId",apiId);
    }

    @Override
    public Class<DescribePluginsByApiResponse> getResponseClass() {
        return DescribePluginsByApiResponse.class;
    }
}
