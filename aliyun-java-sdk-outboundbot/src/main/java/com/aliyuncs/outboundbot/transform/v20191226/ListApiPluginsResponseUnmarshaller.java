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

package com.aliyuncs.outboundbot.transform.v20191226;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.outboundbot.model.v20191226.ListApiPluginsResponse;
import com.aliyuncs.outboundbot.model.v20191226.ListApiPluginsResponse.ApiPlugin;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiPluginsResponseUnmarshaller {

	public static ListApiPluginsResponse unmarshall(ListApiPluginsResponse listApiPluginsResponse, UnmarshallerContext _ctx) {
		
		listApiPluginsResponse.setRequestId(_ctx.stringValue("ListApiPluginsResponse.RequestId"));
		listApiPluginsResponse.setHttpStatusCode(_ctx.integerValue("ListApiPluginsResponse.HttpStatusCode"));
		listApiPluginsResponse.setCode(_ctx.stringValue("ListApiPluginsResponse.Code"));
		listApiPluginsResponse.setMessage(_ctx.stringValue("ListApiPluginsResponse.Message"));
		listApiPluginsResponse.setSuccess(_ctx.booleanValue("ListApiPluginsResponse.Success"));
		listApiPluginsResponse.setPageSize(_ctx.integerValue("ListApiPluginsResponse.PageSize"));
		listApiPluginsResponse.setPageNumber(_ctx.integerValue("ListApiPluginsResponse.PageNumber"));
		listApiPluginsResponse.setTotalCount(_ctx.longValue("ListApiPluginsResponse.TotalCount"));

		List<ApiPlugin> apiPlugins = new ArrayList<ApiPlugin>();
		for (int i = 0; i < _ctx.lengthValue("ListApiPluginsResponse.ApiPlugins.Length"); i++) {
			ApiPlugin apiPlugin = new ApiPlugin();
			apiPlugin.setDraftedConfigJson(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].DraftedConfigJson"));
			apiPlugin.setStatus(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].Status"));
			apiPlugin.setType(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].Type"));
			apiPlugin.setPublishedConfigJson(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].PublishedConfigJson"));
			apiPlugin.setUuid(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].Uuid"));
			apiPlugin.setDescription(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].Description"));
			apiPlugin.setGmtCreate(_ctx.longValue("ListApiPluginsResponse.ApiPlugins["+ i +"].GmtCreate"));
			apiPlugin.setInstanceId(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].InstanceId"));
			apiPlugin.setGmtModified(_ctx.longValue("ListApiPluginsResponse.ApiPlugins["+ i +"].GmtModified"));
			apiPlugin.setName(_ctx.stringValue("ListApiPluginsResponse.ApiPlugins["+ i +"].Name"));

			apiPlugins.add(apiPlugin);
		}
		listApiPluginsResponse.setApiPlugins(apiPlugins);
	 
	 	return listApiPluginsResponse;
	}
}