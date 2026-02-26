/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsResponse.PluginAttribute;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsResponse.PluginAttribute.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePluginsResponseUnmarshaller {

	public static DescribePluginsResponse unmarshall(DescribePluginsResponse describePluginsResponse, UnmarshallerContext _ctx) {
		
		describePluginsResponse.setRequestId(_ctx.stringValue("DescribePluginsResponse.RequestId"));
		describePluginsResponse.setPageNumber(_ctx.integerValue("DescribePluginsResponse.PageNumber"));
		describePluginsResponse.setPageSize(_ctx.integerValue("DescribePluginsResponse.PageSize"));
		describePluginsResponse.setTotalCount(_ctx.integerValue("DescribePluginsResponse.TotalCount"));

		List<PluginAttribute> plugins = new ArrayList<PluginAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribePluginsResponse.Plugins.Length"); i++) {
			PluginAttribute pluginAttribute = new PluginAttribute();
			pluginAttribute.setPluginId(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginId"));
			pluginAttribute.setModifiedTime(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].ModifiedTime"));
			pluginAttribute.setPluginData(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginData"));
			pluginAttribute.setDescription(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].Description"));
			pluginAttribute.setPluginName(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginName"));
			pluginAttribute.setCreatedTime(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].CreatedTime"));
			pluginAttribute.setPluginType(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].PluginType"));
			pluginAttribute.setRegionId(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].RegionId"));

			List<TagInfo> tags = new ArrayList<TagInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribePluginsResponse.Plugins["+ i +"].Tags.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setKey(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].Tags["+ j +"].Key"));
				tagInfo.setValue(_ctx.stringValue("DescribePluginsResponse.Plugins["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagInfo);
			}
			pluginAttribute.setTags(tags);

			plugins.add(pluginAttribute);
		}
		describePluginsResponse.setPlugins(plugins);
	 
	 	return describePluginsResponse;
	}
}