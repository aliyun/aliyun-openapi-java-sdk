package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DeletePluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsByApiResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author auto create
 * @version
 */
public class DescribePluginsByApiResponseUnmarshaller {
    public static DescribePluginsByApiResponse unmarshall(DescribePluginsByApiResponse describePluginsByApiResponse, UnmarshallerContext context) {

        describePluginsByApiResponse.setRequestId(context.stringValue("DescribePluginsByApiResponse.RequestId"));
        describePluginsByApiResponse.setTotalCount(context.integerValue("DescribePluginsByApiResponse.TotalCount"));
        describePluginsByApiResponse.setPageSize(context.integerValue("DescribePluginsByApiResponse.PageSize"));
        describePluginsByApiResponse.setPageNumber(context.integerValue("DescribePluginsByApiResponse.PageNumber"));
        List<DescribePluginsResponse.PluginAttribute>
            pluginAttributes = new ArrayList<DescribePluginsResponse.PluginAttribute>();
        for (int i = 0; i < context.lengthValue("DescribePluginsByApiResponse.Plugins.Length"); i++) {
            DescribePluginsResponse.PluginAttribute pluginAttribute = new DescribePluginsResponse.PluginAttribute();
            pluginAttribute.setRegionId(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].RegionId"));
            pluginAttribute.setPluginId(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginId"));
            pluginAttribute.setPluginType(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginType"));
            pluginAttribute.setPluginName(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginName"));
            pluginAttribute.setPluginData(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginData"));
            pluginAttribute.setDescription(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].Description"));
            pluginAttribute.setCreatedTime(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].CreatedTime"));
            pluginAttribute.setModifiedTime(context.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].ModifiedTime"));
            pluginAttributes.add(pluginAttribute);
        }
        describePluginsByApiResponse.setPlugins(pluginAttributes);

        return describePluginsByApiResponse;
    }
}
