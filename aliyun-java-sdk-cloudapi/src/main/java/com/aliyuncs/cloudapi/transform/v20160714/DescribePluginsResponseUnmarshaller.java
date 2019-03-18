package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.AttachPluginResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsResponse;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author auto create
 * @version
 */
public class DescribePluginsResponseUnmarshaller {
    public static DescribePluginsResponse unmarshall(DescribePluginsResponse describePluginsResponse, UnmarshallerContext context) {

        describePluginsResponse.setRequestId(context.stringValue("DescribePluginsResponse.RequestId"));
        describePluginsResponse.setTotalCount(context.integerValue("DescribePluginsResponse.TotalCount"));
        describePluginsResponse.setPageSize(context.integerValue("DescribePluginsResponse.PageSize"));
        describePluginsResponse.setPageNumber(context.integerValue("DescribePluginsResponse.PageNumber"));
        List<DescribePluginsResponse.PluginAttribute>
            pluginAttributes = new ArrayList <DescribePluginsResponse.PluginAttribute>();
        for (int i = 0; i < context.lengthValue("DescribePluginsResponse.Plugins.Length"); i++) {
            DescribePluginsResponse.PluginAttribute pluginAttribute = new DescribePluginsResponse.PluginAttribute();
            pluginAttribute.setRegionId(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].RegionId"));
            pluginAttribute.setPluginId(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginId"));
            pluginAttribute.setPluginType(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginType"));
            pluginAttribute.setPluginName(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginName"));
            pluginAttribute.setPluginData(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginData"));
            pluginAttribute.setDescription(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].Description"));
            pluginAttribute.setCreatedTime(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].CreatedTime"));
            pluginAttribute.setModifiedTime(context.stringValue("DescribePluginsResponse.Plugins["+ i +"].ModifiedTime"));

            pluginAttributes.add(pluginAttribute);
        }
        describePluginsResponse.setPlugins(pluginAttributes);

        return describePluginsResponse;
    }
}
