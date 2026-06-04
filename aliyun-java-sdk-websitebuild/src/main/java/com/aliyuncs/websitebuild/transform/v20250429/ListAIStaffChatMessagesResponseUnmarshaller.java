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

import com.aliyuncs.websitebuild.model.v20250429.ListAIStaffChatMessagesResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAIStaffChatMessagesResponse.Module;
import com.aliyuncs.websitebuild.model.v20250429.ListAIStaffChatMessagesResponse.Module.Message;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAIStaffChatMessagesResponseUnmarshaller {

	public static ListAIStaffChatMessagesResponse unmarshall(ListAIStaffChatMessagesResponse listAIStaffChatMessagesResponse, UnmarshallerContext _ctx) {
		
		listAIStaffChatMessagesResponse.setRequestId(_ctx.stringValue("ListAIStaffChatMessagesResponse.RequestId"));
		listAIStaffChatMessagesResponse.setDynamicCode(_ctx.stringValue("ListAIStaffChatMessagesResponse.DynamicCode"));
		listAIStaffChatMessagesResponse.setDynamicMessage(_ctx.stringValue("ListAIStaffChatMessagesResponse.DynamicMessage"));
		listAIStaffChatMessagesResponse.setSynchro(_ctx.booleanValue("ListAIStaffChatMessagesResponse.Synchro"));
		listAIStaffChatMessagesResponse.setAccessDeniedDetail(_ctx.stringValue("ListAIStaffChatMessagesResponse.AccessDeniedDetail"));
		listAIStaffChatMessagesResponse.setRootErrorMsg(_ctx.stringValue("ListAIStaffChatMessagesResponse.RootErrorMsg"));
		listAIStaffChatMessagesResponse.setRootErrorCode(_ctx.stringValue("ListAIStaffChatMessagesResponse.RootErrorCode"));
		listAIStaffChatMessagesResponse.setAllowRetry(_ctx.booleanValue("ListAIStaffChatMessagesResponse.AllowRetry"));
		listAIStaffChatMessagesResponse.setAppName(_ctx.stringValue("ListAIStaffChatMessagesResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAIStaffChatMessagesResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAIStaffChatMessagesResponse.ErrorArgs["+ i +"]"));
		}
		listAIStaffChatMessagesResponse.setErrorArgs(errorArgs);

		Module module = new Module();

		List<Message> messages = new ArrayList<Message>();
		for (int i = 0; i < _ctx.lengthValue("ListAIStaffChatMessagesResponse.Module.Messages.Length"); i++) {
			Message message = new Message();
			message.setConversationId(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].ConversationId"));
			message.setSectionId(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].SectionId"));
			message.setChatId(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].ChatId"));
			message.setMessageId(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].MessageId"));
			message.setBotId(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].BotId"));
			message.setSiteId(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].SiteId"));
			message.setRole(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].Role"));
			message.setType(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].Type"));
			message.setContentType(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].ContentType"));
			message.setContent(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].Content"));
			message.setChatStatus(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].ChatStatus"));
			message.setMetaData(_ctx.mapValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].MetaData"));
			message.setGmtCreate(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].GmtCreate"));
			message.setGmtModified(_ctx.stringValue("ListAIStaffChatMessagesResponse.Module.Messages["+ i +"].GmtModified"));

			messages.add(message);
		}
		module.setMessages(messages);
		listAIStaffChatMessagesResponse.setModule(module);
	 
	 	return listAIStaffChatMessagesResponse;
	}
}