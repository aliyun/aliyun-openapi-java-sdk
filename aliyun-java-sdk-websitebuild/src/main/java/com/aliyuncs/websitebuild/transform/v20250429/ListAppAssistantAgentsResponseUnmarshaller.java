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

import com.aliyuncs.websitebuild.model.v20250429.ListAppAssistantAgentsResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppAssistantAgentsResponse.ModuleItem;
import com.aliyuncs.websitebuild.model.v20250429.ListAppAssistantAgentsResponse.ModuleItem.Credential;
import com.aliyuncs.websitebuild.model.v20250429.ListAppAssistantAgentsResponse.ModuleItem.EmbedConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppAssistantAgentsResponseUnmarshaller {

	public static ListAppAssistantAgentsResponse unmarshall(ListAppAssistantAgentsResponse listAppAssistantAgentsResponse, UnmarshallerContext _ctx) {
		
		listAppAssistantAgentsResponse.setRequestId(_ctx.stringValue("ListAppAssistantAgentsResponse.RequestId"));
		listAppAssistantAgentsResponse.setDynamicCode(_ctx.stringValue("ListAppAssistantAgentsResponse.DynamicCode"));
		listAppAssistantAgentsResponse.setDynamicMessage(_ctx.stringValue("ListAppAssistantAgentsResponse.DynamicMessage"));
		listAppAssistantAgentsResponse.setSynchro(_ctx.booleanValue("ListAppAssistantAgentsResponse.Synchro"));
		listAppAssistantAgentsResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppAssistantAgentsResponse.AccessDeniedDetail"));
		listAppAssistantAgentsResponse.setRootErrorMsg(_ctx.stringValue("ListAppAssistantAgentsResponse.RootErrorMsg"));
		listAppAssistantAgentsResponse.setRootErrorCode(_ctx.stringValue("ListAppAssistantAgentsResponse.RootErrorCode"));
		listAppAssistantAgentsResponse.setAllowRetry(_ctx.booleanValue("ListAppAssistantAgentsResponse.AllowRetry"));
		listAppAssistantAgentsResponse.setAppName(_ctx.stringValue("ListAppAssistantAgentsResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppAssistantAgentsResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppAssistantAgentsResponse.ErrorArgs["+ i +"]"));
		}
		listAppAssistantAgentsResponse.setErrorArgs(errorArgs);

		List<ModuleItem> module = new ArrayList<ModuleItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppAssistantAgentsResponse.Module.Length"); i++) {
			ModuleItem moduleItem = new ModuleItem();
			moduleItem.setAgentId(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].AgentId"));
			moduleItem.setAgentName(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].AgentName"));
			moduleItem.setBizId(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].BizId"));
			moduleItem.setUserId(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].UserId"));
			moduleItem.setPlatformType(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].PlatformType"));
			moduleItem.setStatus(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].Status"));
			moduleItem.setPlatformAppId(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].PlatformAppId"));
			moduleItem.setExtraParams(_ctx.mapValue("ListAppAssistantAgentsResponse.Module["+ i +"].ExtraParams"));
			moduleItem.setGmtCreate(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].GmtCreate"));
			moduleItem.setGmtModified(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].GmtModified"));

			Credential credential = new Credential();
			credential.setUsername(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].Credential.Username"));
			credential.setPassword(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].Credential.Password"));
			credential.setApiKey(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].Credential.ApiKey"));
			credential.setApiSecret(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].Credential.ApiSecret"));
			credential.setExtra(_ctx.mapValue("ListAppAssistantAgentsResponse.Module["+ i +"].Credential.Extra"));
			moduleItem.setCredential(credential);

			EmbedConfig embedConfig = new EmbedConfig();
			embedConfig.setRawScript(_ctx.stringValue("ListAppAssistantAgentsResponse.Module["+ i +"].EmbedConfig.RawScript"));
			embedConfig.setExtra(_ctx.mapValue("ListAppAssistantAgentsResponse.Module["+ i +"].EmbedConfig.Extra"));
			moduleItem.setEmbedConfig(embedConfig);

			module.add(moduleItem);
		}
		listAppAssistantAgentsResponse.setModule(module);
	 
	 	return listAppAssistantAgentsResponse;
	}
}