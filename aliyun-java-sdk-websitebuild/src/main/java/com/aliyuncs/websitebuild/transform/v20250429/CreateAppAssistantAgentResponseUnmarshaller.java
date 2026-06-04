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

import com.aliyuncs.websitebuild.model.v20250429.CreateAppAssistantAgentResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppAssistantAgentResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppAssistantAgentResponse.Module.Credential;
import com.aliyuncs.websitebuild.model.v20250429.CreateAppAssistantAgentResponse.Module.EmbedConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAppAssistantAgentResponseUnmarshaller {

	public static CreateAppAssistantAgentResponse unmarshall(CreateAppAssistantAgentResponse createAppAssistantAgentResponse, UnmarshallerContext _ctx) {
		
		createAppAssistantAgentResponse.setRequestId(_ctx.stringValue("CreateAppAssistantAgentResponse.RequestId"));
		createAppAssistantAgentResponse.setDynamicCode(_ctx.stringValue("CreateAppAssistantAgentResponse.DynamicCode"));
		createAppAssistantAgentResponse.setDynamicMessage(_ctx.stringValue("CreateAppAssistantAgentResponse.DynamicMessage"));
		createAppAssistantAgentResponse.setSynchro(_ctx.booleanValue("CreateAppAssistantAgentResponse.Synchro"));
		createAppAssistantAgentResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAppAssistantAgentResponse.AccessDeniedDetail"));
		createAppAssistantAgentResponse.setRootErrorMsg(_ctx.stringValue("CreateAppAssistantAgentResponse.RootErrorMsg"));
		createAppAssistantAgentResponse.setRootErrorCode(_ctx.stringValue("CreateAppAssistantAgentResponse.RootErrorCode"));
		createAppAssistantAgentResponse.setAllowRetry(_ctx.booleanValue("CreateAppAssistantAgentResponse.AllowRetry"));
		createAppAssistantAgentResponse.setAppName(_ctx.stringValue("CreateAppAssistantAgentResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAppAssistantAgentResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAppAssistantAgentResponse.ErrorArgs["+ i +"]"));
		}
		createAppAssistantAgentResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setAgentId(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.AgentId"));
		module.setAgentName(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.AgentName"));
		module.setBizId(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.BizId"));
		module.setUserId(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.UserId"));
		module.setPlatformType(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.PlatformType"));
		module.setStatus(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.Status"));
		module.setPlatformAppId(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.PlatformAppId"));
		module.setExtraParams(_ctx.mapValue("CreateAppAssistantAgentResponse.Module.ExtraParams"));
		module.setGmtCreate(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.GmtCreate"));
		module.setGmtModified(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.GmtModified"));

		Credential credential = new Credential();
		credential.setUsername(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.Credential.Username"));
		credential.setExtra(_ctx.mapValue("CreateAppAssistantAgentResponse.Module.Credential.Extra"));
		module.setCredential(credential);

		EmbedConfig embedConfig = new EmbedConfig();
		embedConfig.setRawScript(_ctx.stringValue("CreateAppAssistantAgentResponse.Module.EmbedConfig.RawScript"));
		embedConfig.setExtra(_ctx.mapValue("CreateAppAssistantAgentResponse.Module.EmbedConfig.Extra"));
		module.setEmbedConfig(embedConfig);
		createAppAssistantAgentResponse.setModule(module);
	 
	 	return createAppAssistantAgentResponse;
	}
}