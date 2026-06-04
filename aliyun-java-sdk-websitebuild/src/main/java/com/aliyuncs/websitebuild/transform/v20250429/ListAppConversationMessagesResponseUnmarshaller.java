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

import com.aliyuncs.websitebuild.model.v20250429.ListAppConversationMessagesResponse;
import com.aliyuncs.websitebuild.model.v20250429.ListAppConversationMessagesResponse.ChatMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppConversationMessagesResponseUnmarshaller {

	public static ListAppConversationMessagesResponse unmarshall(ListAppConversationMessagesResponse listAppConversationMessagesResponse, UnmarshallerContext _ctx) {
		
		listAppConversationMessagesResponse.setRequestId(_ctx.stringValue("ListAppConversationMessagesResponse.RequestId"));
		listAppConversationMessagesResponse.setDynamicCode(_ctx.stringValue("ListAppConversationMessagesResponse.DynamicCode"));
		listAppConversationMessagesResponse.setDynamicMessage(_ctx.stringValue("ListAppConversationMessagesResponse.DynamicMessage"));
		listAppConversationMessagesResponse.setSynchro(_ctx.booleanValue("ListAppConversationMessagesResponse.Synchro"));
		listAppConversationMessagesResponse.setAccessDeniedDetail(_ctx.stringValue("ListAppConversationMessagesResponse.AccessDeniedDetail"));
		listAppConversationMessagesResponse.setRootErrorMsg(_ctx.stringValue("ListAppConversationMessagesResponse.RootErrorMsg"));
		listAppConversationMessagesResponse.setRootErrorCode(_ctx.stringValue("ListAppConversationMessagesResponse.RootErrorCode"));
		listAppConversationMessagesResponse.setAllowRetry(_ctx.booleanValue("ListAppConversationMessagesResponse.AllowRetry"));
		listAppConversationMessagesResponse.setAppName(_ctx.stringValue("ListAppConversationMessagesResponse.AppName"));
		listAppConversationMessagesResponse.setMaxResults(_ctx.integerValue("ListAppConversationMessagesResponse.MaxResults"));
		listAppConversationMessagesResponse.setNextToken(_ctx.stringValue("ListAppConversationMessagesResponse.NextToken"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListAppConversationMessagesResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ListAppConversationMessagesResponse.ErrorArgs["+ i +"]"));
		}
		listAppConversationMessagesResponse.setErrorArgs(errorArgs);

		List<ChatMessage> module = new ArrayList<ChatMessage>();
		for (int i = 0; i < _ctx.lengthValue("ListAppConversationMessagesResponse.Module.Length"); i++) {
			ChatMessage chatMessage = new ChatMessage();
			chatMessage.setNo(_ctx.integerValue("ListAppConversationMessagesResponse.Module["+ i +"].No"));
			chatMessage.setConversationId(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].ConversationId"));
			chatMessage.setSectionId(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].SectionId"));
			chatMessage.setChatId(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].ChatId"));
			chatMessage.setMessageId(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].MessageId"));
			chatMessage.setBotId(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].BotId"));
			chatMessage.setSiteId(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].SiteId"));
			chatMessage.setRole(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].Role"));
			chatMessage.setType(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].Type"));
			chatMessage.setContentType(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].ContentType"));
			chatMessage.setContent(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].Content"));
			chatMessage.setChatStatus(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].ChatStatus"));
			chatMessage.setMetaData(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].MetaData"));
			chatMessage.setGmtCreate(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].GmtCreate"));
			chatMessage.setGmtModified(_ctx.stringValue("ListAppConversationMessagesResponse.Module["+ i +"].GmtModified"));

			module.add(chatMessage);
		}
		listAppConversationMessagesResponse.setModule(module);
	 
	 	return listAppConversationMessagesResponse;
	}
}