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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListKibanaPluginsResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListKibanaPluginsResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListKibanaPluginsResponse.PluginItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListKibanaPluginsResponseUnmarshaller {

	public static ListKibanaPluginsResponse unmarshall(ListKibanaPluginsResponse listKibanaPluginsResponse, UnmarshallerContext _ctx) {
		
		listKibanaPluginsResponse.setRequestId(_ctx.stringValue("ListKibanaPluginsResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListKibanaPluginsResponse.Headers.X-Total-Count"));
		listKibanaPluginsResponse.setHeaders(headers);

		List<PluginItem> result = new ArrayList<PluginItem>();
		for (int i = 0; i < _ctx.lengthValue("ListKibanaPluginsResponse.Result.Length"); i++) {
			PluginItem pluginItem = new PluginItem();
			pluginItem.setName(_ctx.stringValue("ListKibanaPluginsResponse.Result["+ i +"].name"));
			pluginItem.setState(_ctx.stringValue("ListKibanaPluginsResponse.Result["+ i +"].state"));
			pluginItem.setSource(_ctx.stringValue("ListKibanaPluginsResponse.Result["+ i +"].source"));
			pluginItem.setDescription(_ctx.stringValue("ListKibanaPluginsResponse.Result["+ i +"].description"));
			pluginItem.setSpecificationUrl(_ctx.stringValue("ListKibanaPluginsResponse.Result["+ i +"].specificationUrl"));

			result.add(pluginItem);
		}
		listKibanaPluginsResponse.setResult(result);
	 
	 	return listKibanaPluginsResponse;
	}
}