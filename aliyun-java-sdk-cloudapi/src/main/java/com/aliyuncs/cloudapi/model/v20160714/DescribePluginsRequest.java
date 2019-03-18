package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version
 */
public class DescribePluginsRequest extends RpcAcsRequest<DescribePluginsResponse> {

    public DescribePluginsRequest() {
        super("CloudAPI", "2016-07-14", "DescribePlugins", "apigateway");
    }

    private String pluginId;
    private String pluginType;
    private String pluginName;
    private Integer pageNumber;
    private Integer pageSize;

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
        putQueryParameter("PluginId",pluginId);
    }

    public String getPluginType() {
        return pluginType;
    }

    public void setPluginType(String pluginType) {
        this.pluginType = pluginType;
        putQueryParameter("PluginType",pluginType);
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
        putQueryParameter("PluginName",pluginName);
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
    public Class<DescribePluginsResponse> getResponseClass() {
        return DescribePluginsResponse.class;
    }
}
