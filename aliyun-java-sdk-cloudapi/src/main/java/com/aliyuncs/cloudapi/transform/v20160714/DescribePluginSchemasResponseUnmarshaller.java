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

import com.aliyuncs.cloudapi.model.v20160714.DescribePluginSchemasResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribePluginSchemasResponse.PluginSchema;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePluginSchemasResponseUnmarshaller {

	public static DescribePluginSchemasResponse unmarshall(DescribePluginSchemasResponse describePluginSchemasResponse, UnmarshallerContext _ctx) {
		
		describePluginSchemasResponse.setRequestId(_ctx.stringValue("DescribePluginSchemasResponse.RequestId"));

		List<PluginSchema> pluginSchemas = new ArrayList<PluginSchema>();
		for (int i = 0; i < _ctx.lengthValue("DescribePluginSchemasResponse.PluginSchemas.Length"); i++) {
			PluginSchema pluginSchema = new PluginSchema();
			pluginSchema.setTitle(_ctx.stringValue("DescribePluginSchemasResponse.PluginSchemas["+ i +"].Title"));
			pluginSchema.setDescription(_ctx.stringValue("DescribePluginSchemasResponse.PluginSchemas["+ i +"].Description"));
			pluginSchema.setName(_ctx.stringValue("DescribePluginSchemasResponse.PluginSchemas["+ i +"].Name"));
			pluginSchema.setDocumentId(_ctx.stringValue("DescribePluginSchemasResponse.PluginSchemas["+ i +"].DocumentId"));
			pluginSchema.setSupportClassic(_ctx.booleanValue("DescribePluginSchemasResponse.PluginSchemas["+ i +"].SupportClassic"));

			pluginSchemas.add(pluginSchema);
		}
		describePluginSchemasResponse.setPluginSchemas(pluginSchemas);
	 
	 	return describePluginSchemasResponse;
	}
}