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

import com.aliyuncs.websitebuild.model.v20250429.SwitchAppConversationResponse;
import com.aliyuncs.websitebuild.model.v20250429.SwitchAppConversationResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class SwitchAppConversationResponseUnmarshaller {

	public static SwitchAppConversationResponse unmarshall(SwitchAppConversationResponse switchAppConversationResponse, UnmarshallerContext _ctx) {
		
		switchAppConversationResponse.setRequestId(_ctx.stringValue("SwitchAppConversationResponse.RequestId"));
		switchAppConversationResponse.setDynamicCode(_ctx.stringValue("SwitchAppConversationResponse.DynamicCode"));
		switchAppConversationResponse.setDynamicMessage(_ctx.stringValue("SwitchAppConversationResponse.DynamicMessage"));
		switchAppConversationResponse.setSynchro(_ctx.booleanValue("SwitchAppConversationResponse.Synchro"));
		switchAppConversationResponse.setAccessDeniedDetail(_ctx.stringValue("SwitchAppConversationResponse.AccessDeniedDetail"));
		switchAppConversationResponse.setRootErrorMsg(_ctx.stringValue("SwitchAppConversationResponse.RootErrorMsg"));
		switchAppConversationResponse.setRootErrorCode(_ctx.stringValue("SwitchAppConversationResponse.RootErrorCode"));
		switchAppConversationResponse.setAllowRetry(_ctx.booleanValue("SwitchAppConversationResponse.AllowRetry"));
		switchAppConversationResponse.setAppName(_ctx.stringValue("SwitchAppConversationResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SwitchAppConversationResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("SwitchAppConversationResponse.ErrorArgs["+ i +"]"));
		}
		switchAppConversationResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setConversationId(_ctx.stringValue("SwitchAppConversationResponse.Module.ConversationId"));
		module.setUserId(_ctx.stringValue("SwitchAppConversationResponse.Module.UserId"));
		module.setAliyunPk(_ctx.stringValue("SwitchAppConversationResponse.Module.AliyunPk"));
		module.setSectionId(_ctx.stringValue("SwitchAppConversationResponse.Module.SectionId"));
		module.setSiteId(_ctx.stringValue("SwitchAppConversationResponse.Module.SiteId"));
		module.setBotId(_ctx.stringValue("SwitchAppConversationResponse.Module.BotId"));
		module.setTitle(_ctx.stringValue("SwitchAppConversationResponse.Module.Title"));
		module.setMetaData(_ctx.stringValue("SwitchAppConversationResponse.Module.MetaData"));
		module.setGmtCreate(_ctx.stringValue("SwitchAppConversationResponse.Module.GmtCreate"));
		module.setGmtModified(_ctx.stringValue("SwitchAppConversationResponse.Module.GmtModified"));
		module.setChatNum(_ctx.integerValue("SwitchAppConversationResponse.Module.ChatNum"));
		switchAppConversationResponse.setModule(module);
	 
	 	return switchAppConversationResponse;
	}
}