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

import com.aliyuncs.websitebuild.model.v20250429.CreateAIStaffConversationResponse;
import com.aliyuncs.websitebuild.model.v20250429.CreateAIStaffConversationResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAIStaffConversationResponseUnmarshaller {

	public static CreateAIStaffConversationResponse unmarshall(CreateAIStaffConversationResponse createAIStaffConversationResponse, UnmarshallerContext _ctx) {
		
		createAIStaffConversationResponse.setRequestId(_ctx.stringValue("CreateAIStaffConversationResponse.RequestId"));
		createAIStaffConversationResponse.setDynamicCode(_ctx.stringValue("CreateAIStaffConversationResponse.DynamicCode"));
		createAIStaffConversationResponse.setDynamicMessage(_ctx.stringValue("CreateAIStaffConversationResponse.DynamicMessage"));
		createAIStaffConversationResponse.setSynchro(_ctx.booleanValue("CreateAIStaffConversationResponse.Synchro"));
		createAIStaffConversationResponse.setAccessDeniedDetail(_ctx.stringValue("CreateAIStaffConversationResponse.AccessDeniedDetail"));
		createAIStaffConversationResponse.setRootErrorMsg(_ctx.stringValue("CreateAIStaffConversationResponse.RootErrorMsg"));
		createAIStaffConversationResponse.setRootErrorCode(_ctx.stringValue("CreateAIStaffConversationResponse.RootErrorCode"));
		createAIStaffConversationResponse.setAllowRetry(_ctx.booleanValue("CreateAIStaffConversationResponse.AllowRetry"));
		createAIStaffConversationResponse.setAppName(_ctx.stringValue("CreateAIStaffConversationResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateAIStaffConversationResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("CreateAIStaffConversationResponse.ErrorArgs["+ i +"]"));
		}
		createAIStaffConversationResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setConversationId(_ctx.stringValue("CreateAIStaffConversationResponse.Module.ConversationId"));
		module.setSectionId(_ctx.stringValue("CreateAIStaffConversationResponse.Module.SectionId"));
		module.setSiteId(_ctx.stringValue("CreateAIStaffConversationResponse.Module.SiteId"));
		module.setChatId(_ctx.stringValue("CreateAIStaffConversationResponse.Module.ChatId"));
		module.setBotId(_ctx.stringValue("CreateAIStaffConversationResponse.Module.BotId"));
		module.setTitle(_ctx.stringValue("CreateAIStaffConversationResponse.Module.Title"));
		createAIStaffConversationResponse.setModule(module);
	 
	 	return createAIStaffConversationResponse;
	}
}