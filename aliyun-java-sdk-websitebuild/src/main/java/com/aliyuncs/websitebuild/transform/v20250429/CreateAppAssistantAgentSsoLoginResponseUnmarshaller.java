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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.CreateAppAssistantAgentSsoLoginResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppAssistantAgentSsoLoginResponse.Module;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppAssistantAgentSsoLoginResponseUnmarshaller {

	public static CreateAppAssistantAgentSsoLoginResponse unmarshall(CreateAppAssistantAgentSsoLoginResponse createAppAssistantAgentSsoLoginResponse, UnmarshallerContext _ctx) {
		
		createAppAssistantAgentSsoLoginResponse.setRequestId(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.RequestId"));
		createAppAssistantAgentSsoLoginResponse.setDynamicCode(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.DynamicCode"));
		createAppAssistantAgentSsoLoginResponse.setDynamicMessage(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.DynamicMessage"));
		createAppAssistantAgentSsoLoginResponse.setSynchro(_ctx.booleanValue("CreateAppAssistantAgentSsoLoginResponse.Synchro"));
		createAppAssistantAgentSsoLoginResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.AccessDeniedDetail"));
		createAppAssistantAgentSsoLoginResponse.setRootErrorMsg(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.RootErrorMsg"));
		createAppAssistantAgentSsoLoginResponse.setRootErrorCode(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.RootErrorCode"));
		createAppAssistantAgentSsoLoginResponse.setAllowRetry(_ctx.booleanValue("CreateAppAssistantAgentSsoLoginResponse.AllowRetry"));
		createAppAssistantAgentSsoLoginResponse.setAppName(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAppAssistantAgentSsoLoginResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.ErrorArgs["+ i +"]"));
		}
		createAppAssistantAgentSsoLoginResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setSsoUrl(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.Module.SsoUrl"));
		module.setPlatformType(_ctx.stringValue("CreateAppAssistantAgentSsoLoginResponse.Module.PlatformType"));
		module.setExpireTime(_ctx.longValue("CreateAppAssistantAgentSsoLoginResponse.Module.ExpireTime"));
		module.setExtra(_ctx.mapValue("CreateAppAssistantAgentSsoLoginResponse.Module.Extra"));
		createAppAssistantAgentSsoLoginResponse.setModule(module);
	 
	 	return createAppAssistantAgentSsoLoginResponse;
	}
}