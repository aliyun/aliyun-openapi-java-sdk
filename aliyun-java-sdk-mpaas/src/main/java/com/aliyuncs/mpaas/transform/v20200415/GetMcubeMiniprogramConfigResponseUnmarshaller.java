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

package com.aliyuncs.mpaas.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200415.GetMcubeMiniprogramConfigResponse;
import com.aliyuncs.mpaas.model.v20200415.GetMcubeMiniprogramConfigResponse.GetMiniConfigResult;
import com.aliyuncs.mpaas.model.v20200415.GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail;
import com.aliyuncs.mpaas.model.v20200415.GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigListItem;
import com.aliyuncs.mpaas.model.v20200415.GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch;
import com.aliyuncs.mpaas.model.v20200415.GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigListItem;
import com.aliyuncs.mpaas.model.v20200415.GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcubeMiniprogramConfigResponseUnmarshaller {

	public static GetMcubeMiniprogramConfigResponse unmarshall(GetMcubeMiniprogramConfigResponse getMcubeMiniprogramConfigResponse, UnmarshallerContext _ctx) {
		
		getMcubeMiniprogramConfigResponse.setRequestId(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.RequestId"));
		getMcubeMiniprogramConfigResponse.setResultMessage(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.ResultMessage"));
		getMcubeMiniprogramConfigResponse.setResultCode(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.ResultCode"));

		GetMiniConfigResult getMiniConfigResult = new GetMiniConfigResult();
		getMiniConfigResult.setSuccess(_ctx.booleanValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.Success"));
		getMiniConfigResult.setResultMsg(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.ResultMsg"));

		MiniConfigDetail miniConfigDetail = new MiniConfigDetail();
		miniConfigDetail.setH5Name(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.H5Name"));
		miniConfigDetail.setH5Id(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.H5Id"));
		miniConfigDetail.setAppCode(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.AppCode"));
		miniConfigDetail.setEnableServerDomainCount(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.EnableServerDomainCount"));

		PrivilegeSwitch privilegeSwitch = new PrivilegeSwitch();
		privilegeSwitch.setDescription(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.Description"));
		privilegeSwitch.setConfigType(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.ConfigType"));
		privilegeSwitch.setAppCode(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.AppCode"));
		privilegeSwitch.setConfigValue(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.ConfigValue"));
		privilegeSwitch.setGmtCreate(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.GmtCreate"));
		privilegeSwitch.setH5Name(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.H5Name"));
		privilegeSwitch.setH5Id(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.H5Id"));
		privilegeSwitch.setConfigStatus(_ctx.integerValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.ConfigStatus"));
		privilegeSwitch.setGmtModified(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.GmtModified"));
		privilegeSwitch.setId(_ctx.longValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.PrivilegeSwitch.Id"));
		miniConfigDetail.setPrivilegeSwitch(privilegeSwitch);

		List<ApiConfigListItem> apiConfigList = new ArrayList<ApiConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList.Length"); i++) {
			ApiConfigListItem apiConfigListItem = new ApiConfigListItem();
			apiConfigListItem.setDescription(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].Description"));
			apiConfigListItem.setConfigType(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].ConfigType"));
			apiConfigListItem.setAppCode(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].AppCode"));
			apiConfigListItem.setConfigValue(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].ConfigValue"));
			apiConfigListItem.setGmtCreate(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].GmtCreate"));
			apiConfigListItem.setH5Name(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].H5Name"));
			apiConfigListItem.setH5Id(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].H5Id"));
			apiConfigListItem.setConfigStatus(_ctx.integerValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].ConfigStatus"));
			apiConfigListItem.setGmtModified(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].GmtModified"));
			apiConfigListItem.setId(_ctx.longValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ApiConfigList["+ i +"].Id"));

			apiConfigList.add(apiConfigListItem);
		}
		miniConfigDetail.setApiConfigList(apiConfigList);

		List<ServerDomainConfigListItem> serverDomainConfigList = new ArrayList<ServerDomainConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList.Length"); i++) {
			ServerDomainConfigListItem serverDomainConfigListItem = new ServerDomainConfigListItem();
			serverDomainConfigListItem.setDescription(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].Description"));
			serverDomainConfigListItem.setConfigType(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].ConfigType"));
			serverDomainConfigListItem.setAppCode(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].AppCode"));
			serverDomainConfigListItem.setConfigValue(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].ConfigValue"));
			serverDomainConfigListItem.setGmtCreate(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].GmtCreate"));
			serverDomainConfigListItem.setH5Name(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].H5Name"));
			serverDomainConfigListItem.setH5Id(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].H5Id"));
			serverDomainConfigListItem.setConfigStatus(_ctx.integerValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].ConfigStatus"));
			serverDomainConfigListItem.setGmtModified(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].GmtModified"));
			serverDomainConfigListItem.setId(_ctx.longValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.ServerDomainConfigList["+ i +"].Id"));

			serverDomainConfigList.add(serverDomainConfigListItem);
		}
		miniConfigDetail.setServerDomainConfigList(serverDomainConfigList);

		List<WebviewDomainConfigListItem> webviewDomainConfigList = new ArrayList<WebviewDomainConfigListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList.Length"); i++) {
			WebviewDomainConfigListItem webviewDomainConfigListItem = new WebviewDomainConfigListItem();
			webviewDomainConfigListItem.setDescription(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].Description"));
			webviewDomainConfigListItem.setConfigType(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].ConfigType"));
			webviewDomainConfigListItem.setAppCode(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].AppCode"));
			webviewDomainConfigListItem.setConfigValue(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].ConfigValue"));
			webviewDomainConfigListItem.setGmtCreate(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].GmtCreate"));
			webviewDomainConfigListItem.setH5Name(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].H5Name"));
			webviewDomainConfigListItem.setH5Id(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].H5Id"));
			webviewDomainConfigListItem.setConfigStatus(_ctx.integerValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].ConfigStatus"));
			webviewDomainConfigListItem.setGmtModified(_ctx.stringValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].GmtModified"));
			webviewDomainConfigListItem.setId(_ctx.longValue("GetMcubeMiniprogramConfigResponse.GetMiniConfigResult.MiniConfigDetail.WebviewDomainConfigList["+ i +"].Id"));

			webviewDomainConfigList.add(webviewDomainConfigListItem);
		}
		miniConfigDetail.setWebviewDomainConfigList(webviewDomainConfigList);
		getMiniConfigResult.setMiniConfigDetail(miniConfigDetail);
		getMcubeMiniprogramConfigResponse.setGetMiniConfigResult(getMiniConfigResult);
	 
	 	return getMcubeMiniprogramConfigResponse;
	}
}