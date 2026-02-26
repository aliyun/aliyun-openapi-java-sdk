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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse;
import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse.ResultContent;
import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse.ResultContent.Data;
import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse.ResultContent.Data.Content;
import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigListItem;
import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch;
import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigListItem;
import com.aliyuncs.mpaas.model.v20201028.GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMdsMiniConfigResponseUnmarshaller {

	public static GetMdsMiniConfigResponse unmarshall(GetMdsMiniConfigResponse getMdsMiniConfigResponse, UnmarshallerContext _ctx) {
		
		getMdsMiniConfigResponse.setRequestId(_ctx.stringValue("GetMdsMiniConfigResponse.RequestId"));
		getMdsMiniConfigResponse.setResultMessage(_ctx.stringValue("GetMdsMiniConfigResponse.ResultMessage"));
		getMdsMiniConfigResponse.setResultCode(_ctx.stringValue("GetMdsMiniConfigResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setRequestId(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.RequestId"));

		Data data = new Data();
		data.setRequestId(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.RequestId"));
		data.setSuccess(_ctx.booleanValue("GetMdsMiniConfigResponse.ResultContent.Data.Success"));
		data.setResultMsg(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.ResultMsg"));

		Content content = new Content();
		content.setH5Name(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.H5Name"));
		content.setH5Id(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.H5Id"));
		content.setAppCode(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.AppCode"));
		content.setEnableServerDomainCount(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.EnableServerDomainCount"));

		PrivilegeSwitch privilegeSwitch = new PrivilegeSwitch();
		privilegeSwitch.setDescription(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.Description"));
		privilegeSwitch.setConfigType(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.ConfigType"));
		privilegeSwitch.setAppCode(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.AppCode"));
		privilegeSwitch.setConfigValue(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.ConfigValue"));
		privilegeSwitch.setH5Name(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.H5Name"));
		privilegeSwitch.setH5Id(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.H5Id"));
		privilegeSwitch.setGmtCreate(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.GmtCreate"));
		privilegeSwitch.setConfigStatus(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.ConfigStatus"));
		privilegeSwitch.setGmtModified(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.GmtModified"));
		privilegeSwitch.setId(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.PrivilegeSwitch.Id"));
		content.setPrivilegeSwitch(privilegeSwitch);

		List<ApiConfigListItem> apiConfigList = new ArrayList<ApiConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList.Length"); i++) {
			ApiConfigListItem apiConfigListItem = new ApiConfigListItem();
			apiConfigListItem.setDescription(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].Description"));
			apiConfigListItem.setConfigType(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].ConfigType"));
			apiConfigListItem.setAppCode(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].AppCode"));
			apiConfigListItem.setConfigValue(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].ConfigValue"));
			apiConfigListItem.setH5Name(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].H5Name"));
			apiConfigListItem.setH5Id(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].H5Id"));
			apiConfigListItem.setGmtCreate(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].GmtCreate"));
			apiConfigListItem.setConfigStatus(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].ConfigStatus"));
			apiConfigListItem.setGmtModified(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].GmtModified"));
			apiConfigListItem.setId(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ApiConfigList["+ i +"].Id"));

			apiConfigList.add(apiConfigListItem);
		}
		content.setApiConfigList(apiConfigList);

		List<ServerDomainConfigListItem> serverDomainConfigList = new ArrayList<ServerDomainConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList.Length"); i++) {
			ServerDomainConfigListItem serverDomainConfigListItem = new ServerDomainConfigListItem();
			serverDomainConfigListItem.setDescription(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].Description"));
			serverDomainConfigListItem.setConfigType(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].ConfigType"));
			serverDomainConfigListItem.setAppCode(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].AppCode"));
			serverDomainConfigListItem.setConfigValue(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].ConfigValue"));
			serverDomainConfigListItem.setH5Name(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].H5Name"));
			serverDomainConfigListItem.setH5Id(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].H5Id"));
			serverDomainConfigListItem.setGmtCreate(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].GmtCreate"));
			serverDomainConfigListItem.setConfigStatus(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].ConfigStatus"));
			serverDomainConfigListItem.setGmtModified(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].GmtModified"));
			serverDomainConfigListItem.setId(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.ServerDomainConfigList["+ i +"].Id"));

			serverDomainConfigList.add(serverDomainConfigListItem);
		}
		content.setServerDomainConfigList(serverDomainConfigList);

		List<WebviewDomainConfigListItem> webviewDomainConfigList = new ArrayList<WebviewDomainConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList.Length"); i++) {
			WebviewDomainConfigListItem webviewDomainConfigListItem = new WebviewDomainConfigListItem();
			webviewDomainConfigListItem.setDescription(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].Description"));
			webviewDomainConfigListItem.setConfigType(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].ConfigType"));
			webviewDomainConfigListItem.setAppCode(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].AppCode"));
			webviewDomainConfigListItem.setConfigValue(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].ConfigValue"));
			webviewDomainConfigListItem.setH5Name(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].H5Name"));
			webviewDomainConfigListItem.setH5Id(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].H5Id"));
			webviewDomainConfigListItem.setGmtCreate(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].GmtCreate"));
			webviewDomainConfigListItem.setConfigStatus(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].ConfigStatus"));
			webviewDomainConfigListItem.setGmtModified(_ctx.stringValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].GmtModified"));
			webviewDomainConfigListItem.setId(_ctx.longValue("GetMdsMiniConfigResponse.ResultContent.Data.Content.WebviewDomainConfigList["+ i +"].Id"));

			webviewDomainConfigList.add(webviewDomainConfigListItem);
		}
		content.setWebviewDomainConfigList(webviewDomainConfigList);
		data.setContent(content);
		resultContent.setData(data);
		getMdsMiniConfigResponse.setResultContent(resultContent);
	 
	 	return getMdsMiniConfigResponse;
	}
}