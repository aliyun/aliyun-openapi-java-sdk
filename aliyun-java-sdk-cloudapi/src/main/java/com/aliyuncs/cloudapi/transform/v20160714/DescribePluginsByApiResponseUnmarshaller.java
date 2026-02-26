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

import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsByApiResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginsByApiResponse.PluginAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePluginsByApiResponseUnmarshaller {

	public static DescribePluginsByApiResponse unmarshall(DescribePluginsByApiResponse describePluginsByApiResponse, UnmarshallerContext _ctx) {
		
		describePluginsByApiResponse.setRequestId(_ctx.stringValue("DescribePluginsByApiResponse.RequestId"));
		describePluginsByApiResponse.setPageNumber(_ctx.integerValue("DescribePluginsByApiResponse.PageNumber"));
		describePluginsByApiResponse.setPageSize(_ctx.integerValue("DescribePluginsByApiResponse.PageSize"));
		describePluginsByApiResponse.setTotalCount(_ctx.integerValue("DescribePluginsByApiResponse.TotalCount"));

		List<PluginAttribute> plugins = new ArrayList<PluginAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribePluginsByApiResponse.Plugins.Length"); i++) {
			PluginAttribute pluginAttribute = new PluginAttribute();
			pluginAttribute.setPluginId(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginId"));
			pluginAttribute.setModifiedTime(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].ModifiedTime"));
			pluginAttribute.setPluginData(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginData"));
			pluginAttribute.setDescription(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].Description"));
			pluginAttribute.setPluginName(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginName"));
			pluginAttribute.setCreatedTime(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].CreatedTime"));
			pluginAttribute.setPluginType(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].PluginType"));
			pluginAttribute.setRegionId(_ctx.stringValue("DescribePluginsByApiResponse.Plugins["+ i +"].RegionId"));

			plugins.add(pluginAttribute);
		}
		describePluginsByApiResponse.setPlugins(plugins);
	 
	 	return describePluginsByApiResponse;
	}
}