package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class DescribePluginApisRequest extends RpcAcsRequest<DescribePluginApisResponse> {

    public DescribePluginApisRequest() {
        super("CloudAPI", "2016-07-14", "DescribePluginApis", "apigateway");
    }

    private String pluginId;
    private Integer pageSize;
    private Integer pageNumber;

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
        putQueryParameter("PluginId",pluginId);
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        putQueryParameter("PageSize", pageSize);
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        putQueryParameter("PageNumber", pageNumber);
    }

    @Override
    public Class<DescribePluginApisResponse> getResponseClass() {
        return DescribePluginApisResponse.class;
    }
}
