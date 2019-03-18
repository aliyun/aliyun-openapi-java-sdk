package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribePluginApisResponseUnmarshaller;
import com.aliyuncs.cloudapi.transform.v20160714.DescribePluginsResponseUnmarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version
 */
public class DescribePluginsResponse extends AcsResponse {

    private String requestId;

    private Integer totalCount;

    private Integer pageSize;

    private Integer pageNumber;

    private List<PluginAttribute> plugins;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public List<PluginAttribute> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<PluginAttribute> plugins) {
        this.plugins = plugins;
    }

    public static class PluginAttribute{
        private String pluginId;
        private String pluginType;
        private String pluginName;
        private String pluginData;
        private String regionId;
        private String description;
        private String createdTime;
        private String modifiedTime;

        public String getPluginId() {
            return pluginId;
        }

        public void setPluginId(String pluginId) {
            this.pluginId = pluginId;
        }

        public String getPluginType() {
            return pluginType;
        }

        public void setPluginType(String pluginType) {
            this.pluginType = pluginType;
        }

        public String getPluginName() {
            return pluginName;
        }

        public void setPluginName(String pluginName) {
            this.pluginName = pluginName;
        }

        public String getPluginData() {
            return pluginData;
        }

        public void setPluginData(String pluginData) {
            this.pluginData = pluginData;
        }

        public String getRegionId() {
            return regionId;
        }

        public void setRegionId(String regionId) {
            this.regionId = regionId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getModifiedTime() {
            return modifiedTime;
        }

        public void setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
        }
    }

    @Override
    public AcsResponse getInstance(UnmarshallerContext unmarshallerContext) throws ClientException, ServerException {
        return DescribePluginsResponseUnmarshaller.unmarshall(this,unmarshallerContext);
    }
}
