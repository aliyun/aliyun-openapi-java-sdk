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

import com.aliyuncs.websitebuild.model.v20250429.ListAppChatMessagesResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppChatMessagesResponse.ChatMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppChatMessagesResponseUnmarshaller {

	public static ListAppChatMessagesResponse unmarshall(ListAppChatMessagesResponse listAppChatMessagesResponse, UnmarshallerContext _ctx) {
		
		listAppChatMessagesResponse.setRequestId(_ctx.stringValue("ListAppChatMessagesResponse.RequestId"));
		listAppChatMessagesResponse.setDynamicCode(_ctx.stringValue("ListAppChatMessagesResponse.DynamicCode"));
		listAppChatMessagesResponse.setDynamicMessage(_ctx.stringValue("ListAppChatMessagesResponse.DynamicMessage"));
		listAppChatMessagesResponse.setSynchro(_ctx.booleanValue("ListAppChatMessagesResponse.Synchro"));
		listAppChatMessagesResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppChatMessagesResponse.AccessDeniedDetail"));
		listAppChatMessagesResponse.setRootErrorMsg(_ctx.stringValue("ListAppChatMessagesResponse.RootErrorMsg"));
		listAppChatMessagesResponse.setRootErrorCode(_ctx.stringValue("ListAppChatMessagesResponse.RootErrorCode"));
		listAppChatMessagesResponse.setAllowRetry(_ctx.booleanValue("ListAppChatMessagesResponse.AllowRetry"));
		listAppChatMessagesResponse.setAppName(_ctx.stringValue("ListAppChatMessagesResponse.AppName"));
		listAppChatMessagesResponse.setNextToken(_ctx.stringValue("ListAppChatMessagesResponse.NextToken"));
		listAppChatMessagesResponse.setMaxResults(_ctx.integerValue("ListAppChatMessagesResponse.MaxResults"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppChatMessagesResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppChatMessagesResponse.ErrorArgs["+ i +"]"));
		}
		listAppChatMessagesResponse.setErrorArgs(errorArgs);

		List<ChatMessage> module = new ArrayList<ChatMessage>();
		for (int i = 0; i < _ctx.lengthValue("ListAppChatMessagesResponse.Module.Length"); i++) {
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setNo(_ctx.integerValue("ListAppChatMessagesResponse.Module["+ i +"].No"));
			chatMessage.setConversationId(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].ConversationId"));
			chatMessage.setSectionId(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].SectionId"));
			chatMessage.setChatId(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].ChatId"));
			chatMessage.setMessageId(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].MessageId"));
			chatMessage.setBotId(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].BotId"));
			chatMessage.setSiteId(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].SiteId"));
			chatMessage.setRole(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].Role"));
			chatMessage.setType(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].Type"));
			chatMessage.setContentType(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].ContentType"));
			chatMessage.setContent(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].Content"));
			chatMessage.setChatStatus(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].ChatStatus"));
			chatMessage.setMetaData(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].MetaData"));
			chatMessage.setGmtCreateTime(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].GmtCreateTime"));
			chatMessage.setGmtModifiedTime(_ctx.stringValue("ListAppChatMessagesResponse.Module["+ i +"].GmtModifiedTime"));

			module.add(chatMessage);
		}
		listAppChatMessagesResponse.setModule(module);
	 
	 	return listAppChatMessagesResponse;
	}
}