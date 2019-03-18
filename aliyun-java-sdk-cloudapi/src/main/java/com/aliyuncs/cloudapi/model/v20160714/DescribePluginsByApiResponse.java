package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribePluginApisResponseUnmarshaller;
import com.aliyuncs.cloudapi.transform.v20160714.DescribePluginsByApiResponseUnmarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.List;

/**
 * @author auto create
 * @version
 */
public class DescribePluginsByApiResponse extends AcsResponse {

    private String requestId;

    private Integer totalCount;

    private Integer pageSize;

    private Integer pageNumber;

    private List<DescribePluginsResponse.PluginAttribute> plugins;

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

    public List<DescribePluginsResponse.PluginAttribute> getPlugins() {
        return plugins;
    }

    public void setPlugins(List<DescribePluginsResponse.PluginAttribute> plugins) {
        this.plugins = plugins;
    }


    @Override
    public AcsResponse getInstance(UnmarshallerContext unmarshallerContext) throws ClientException, ServerException {
        return DescribePluginsByApiResponseUnmarshaller.unmarshall(this,unmarshallerContext);
    }
}
