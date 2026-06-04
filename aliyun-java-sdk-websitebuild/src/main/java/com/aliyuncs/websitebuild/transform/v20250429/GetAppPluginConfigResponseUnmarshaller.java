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

package com.aliyuncs.websitebuild.transform.v20250429;

import com.aliyuncs.websitebuild.model.v20250429.GetAppPluginConfigResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppPluginConfigResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppPluginConfigResponseUnmarshaller {

	public static GetAppPluginConfigResponse unmarshall(GetAppPluginConfigResponse getAppPluginConfigResponse, UnmarshallerContext _ctx) {
		
		getAppPluginConfigResponse.setRequestId(_ctx.stringValue("GetAppPluginConfigResponse.RequestId"));
		getAppPluginConfigResponse.setMessage(_ctx.stringValue("GetAppPluginConfigResponse.Message"));
		getAppPluginConfigResponse.setCode(_ctx.stringValue("GetAppPluginConfigResponse.Code"));
		getAppPluginConfigResponse.setSuccess(_ctx.booleanValue("GetAppPluginConfigResponse.Success"));

		Module module = new Module();
		module.setBizId(_ctx.stringValue("GetAppPluginConfigResponse.Module.BizId"));
		module.setGmtCreate(_ctx.stringValue("GetAppPluginConfigResponse.Module.GmtCreate"));
		module.setGmtModified(_ctx.stringValue("GetAppPluginConfigResponse.Module.GmtModified"));
		module.setId(_ctx.longValue("GetAppPluginConfigResponse.Module.Id"));
		module.setPluginConfig(_ctx.stringValue("GetAppPluginConfigResponse.Module.PluginConfig"));
		module.setPluginDesc(_ctx.stringValue("GetAppPluginConfigResponse.Module.PluginDesc"));
		module.setPluginId(_ctx.stringValue("GetAppPluginConfigResponse.Module.PluginId"));
		module.setPluginName(_ctx.stringValue("GetAppPluginConfigResponse.Module.PluginName"));
		module.setUserId(_ctx.stringValue("GetAppPluginConfigResponse.Module.UserId"));
		getAppPluginConfigResponse.setModule(module);
	 
	 	return getAppPluginConfigResponse;
	}
}