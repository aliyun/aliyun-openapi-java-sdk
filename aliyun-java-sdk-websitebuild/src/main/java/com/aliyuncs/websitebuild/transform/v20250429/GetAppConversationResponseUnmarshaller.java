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

import com.aliyuncs.websitebuild.model.v20250429.GetAppConversationResponse;
import com.aliyuncs.websitebuild.model.v20250429.GetAppConversationResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppConversationResponseUnmarshaller {

	public static GetAppConversationResponse unmarshall(GetAppConversationResponse getAppConversationResponse, UnmarshallerContext _ctx) {
		
		getAppConversationResponse.setRequestId(_ctx.stringValue("GetAppConversationResponse.RequestId"));
		getAppConversationResponse.setDynamicCode(_ctx.stringValue("GetAppConversationResponse.DynamicCode"));
		getAppConversationResponse.setDynamicMessage(_ctx.stringValue("GetAppConversationResponse.DynamicMessage"));
		getAppConversationResponse.setSynchro(_ctx.booleanValue("GetAppConversationResponse.Synchro"));
		getAppConversationResponse.setAccessDeniedDetail(_ctx.stringValue("GetAppConversationResponse.AccessDeniedDetail"));
		getAppConversationResponse.setRootErrorMsg(_ctx.stringValue("GetAppConversationResponse.RootErrorMsg"));
		getAppConversationResponse.setRootErrorCode(_ctx.stringValue("GetAppConversationResponse.RootErrorCode"));
		getAppConversationResponse.setAllowRetry(_ctx.booleanValue("GetAppConversationResponse.AllowRetry"));
		getAppConversationResponse.setAppName(_ctx.stringValue("GetAppConversationResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppConversationResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetAppConversationResponse.ErrorArgs["+ i +"]"));
		}
		getAppConversationResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setConversationId(_ctx.stringValue("GetAppConversationResponse.Module.ConversationId"));
		module.setUserId(_ctx.stringValue("GetAppConversationResponse.Module.UserId"));
		module.setAliyunPk(_ctx.stringValue("GetAppConversationResponse.Module.AliyunPk"));
		module.setSectionId(_ctx.stringValue("GetAppConversationResponse.Module.SectionId"));
		module.setSiteId(_ctx.stringValue("GetAppConversationResponse.Module.SiteId"));
		module.setBotId(_ctx.stringValue("GetAppConversationResponse.Module.BotId"));
		module.setTitle(_ctx.stringValue("GetAppConversationResponse.Module.Title"));
		module.setMetaData(_ctx.stringValue("GetAppConversationResponse.Module.MetaData"));
		module.setGmtCreateTime(_ctx.stringValue("GetAppConversationResponse.Module.GmtCreateTime"));
		module.setGmtModifiedTime(_ctx.stringValue("GetAppConversationResponse.Module.GmtModifiedTime"));
		module.setChatNum(_ctx.integerValue("GetAppConversationResponse.Module.ChatNum"));
		getAppConversationResponse.setModule(module);
	 
	 	return getAppConversationResponse;
	}
}