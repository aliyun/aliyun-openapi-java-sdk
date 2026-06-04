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

import com.aliyuncs.websitebuild.model.v20250429.UpdateAppChatMessageResponse;
import com.aliyuncs.websitebuild.model.v20250429.UpdateAppChatMessageResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAppChatMessageResponseUnmarshaller {

	public static UpdateAppChatMessageResponse unmarshall(UpdateAppChatMessageResponse updateAppChatMessageResponse, UnmarshallerContext _ctx) {
		
		updateAppChatMessageResponse.setRequestId(_ctx.stringValue("UpdateAppChatMessageResponse.RequestId"));
		updateAppChatMessageResponse.setDynamicCode(_ctx.stringValue("UpdateAppChatMessageResponse.DynamicCode"));
		updateAppChatMessageResponse.setDynamicMessage(_ctx.stringValue("UpdateAppChatMessageResponse.DynamicMessage"));
		updateAppChatMessageResponse.setSynchro(_ctx.booleanValue("UpdateAppChatMessageResponse.Synchro"));
		updateAppChatMessageResponse.setAccessDeniedDetail(_ctx.stringValue("UpdateAppChatMessageResponse.AccessDeniedDetail"));
		updateAppChatMessageResponse.setRootErrorMsg(_ctx.stringValue("UpdateAppChatMessageResponse.RootErrorMsg"));
		updateAppChatMessageResponse.setRootErrorCode(_ctx.stringValue("UpdateAppChatMessageResponse.RootErrorCode"));
		updateAppChatMessageResponse.setAllowRetry(_ctx.booleanValue("UpdateAppChatMessageResponse.AllowRetry"));
		updateAppChatMessageResponse.setAppName(_ctx.stringValue("UpdateAppChatMessageResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAppChatMessageResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("UpdateAppChatMessageResponse.ErrorArgs["+ i +"]"));
		}
		updateAppChatMessageResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setNo(_ctx.integerValue("UpdateAppChatMessageResponse.Module.No"));
		module.setConversationId(_ctx.stringValue("UpdateAppChatMessageResponse.Module.ConversationId"));
		module.setSectionId(_ctx.stringValue("UpdateAppChatMessageResponse.Module.SectionId"));
		module.setChatId(_ctx.stringValue("UpdateAppChatMessageResponse.Module.ChatId"));
		module.setMessageId(_ctx.stringValue("UpdateAppChatMessageResponse.Module.MessageId"));
		module.setBotId(_ctx.stringValue("UpdateAppChatMessageResponse.Module.BotId"));
		module.setSiteId(_ctx.stringValue("UpdateAppChatMessageResponse.Module.SiteId"));
		module.setRole(_ctx.stringValue("UpdateAppChatMessageResponse.Module.Role"));
		module.setType(_ctx.stringValue("UpdateAppChatMessageResponse.Module.Type"));
		module.setContentType(_ctx.stringValue("UpdateAppChatMessageResponse.Module.ContentType"));
		module.setContent(_ctx.stringValue("UpdateAppChatMessageResponse.Module.Content"));
		module.setChatStatus(_ctx.stringValue("UpdateAppChatMessageResponse.Module.ChatStatus"));
		module.setMetaData(_ctx.stringValue("UpdateAppChatMessageResponse.Module.MetaData"));
		module.setGmtCreateTime(_ctx.stringValue("UpdateAppChatMessageResponse.Module.GmtCreateTime"));
		module.setGmtModifiedTime(_ctx.stringValue("UpdateAppChatMessageResponse.Module.GmtModifiedTime"));
		updateAppChatMessageResponse.setModule(module);
	 
	 	return updateAppChatMessageResponse;
	}
}