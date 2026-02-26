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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListWaitingChatsResponse;
import com.aliyuncs.ccc.model.v20200701.ListWaitingChatsResponse.Chat;
import com.aliyuncs.ccc.model.v20200701.ListWaitingChatsResponse.Chat.Message;
import com.aliyuncs.ccc.model.v20200701.ListWaitingChatsResponse.Chat.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWaitingChatsResponseUnmarshaller {

	public static ListWaitingChatsResponse unmarshall(ListWaitingChatsResponse listWaitingChatsResponse, UnmarshallerContext _ctx) {
		
		listWaitingChatsResponse.setRequestId(_ctx.stringValue("ListWaitingChatsResponse.RequestId"));
		listWaitingChatsResponse.setCode(_ctx.stringValue("ListWaitingChatsResponse.Code"));
		listWaitingChatsResponse.setHttpStatusCode(_ctx.integerValue("ListWaitingChatsResponse.HttpStatusCode"));
		listWaitingChatsResponse.setMessage(_ctx.stringValue("ListWaitingChatsResponse.Message"));

		List<Chat> data = new ArrayList<Chat>();
		for (int i = 0; i < _ctx.lengthValue("ListWaitingChatsResponse.Data.Length"); i++) {
			Chat chat = new Chat();
			chat.setChatConversationId(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].ChatConversationId"));
			chat.setBeingAssigned(_ctx.booleanValue("ListWaitingChatsResponse.Data["+ i +"].BeingAssigned"));
			chat.setJobId(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].JobId"));
			chat.setEnqueueTime(_ctx.longValue("ListWaitingChatsResponse.Data["+ i +"].EnqueueTime"));
			chat.setAccessChannelId(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].AccessChannelId"));
			chat.setAccessChannelType(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].AccessChannelType"));
			chat.setSkillGroupId(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].SkillGroupId"));

			List<User> userList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListWaitingChatsResponse.Data["+ i +"].UserList.Length"); j++) {
				User user = new User();
				user.setUserName(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].UserList["+ j +"].UserName"));
				user.setUserId(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].UserList["+ j +"].UserId"));
				user.setUserType(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].UserList["+ j +"].UserType"));
				user.setAvatarUrl(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].UserList["+ j +"].AvatarUrl"));

				userList.add(user);
			}
			chat.setUserList(userList);

			List<Message> messages = new ArrayList<Message>();
			for (int j = 0; j < _ctx.lengthValue("ListWaitingChatsResponse.Data["+ i +"].Messages.Length"); j++) {
				Message message = new Message();
				message.setSenderId(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].Messages["+ j +"].SenderId"));
				message.setContent(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].Messages["+ j +"].Content"));
				message.setSenderType(_ctx.stringValue("ListWaitingChatsResponse.Data["+ i +"].Messages["+ j +"].SenderType"));

				messages.add(message);
			}
			chat.setMessages(messages);

			data.add(chat);
		}
		listWaitingChatsResponse.setData(data);
	 
	 	return listWaitingChatsResponse;
	}
}