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

import com.aliyuncs.ccc.model.v20200701.ListGroupChatMessagesResponse;
import com.aliyuncs.ccc.model.v20200701.ListGroupChatMessagesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListGroupChatMessagesResponse.Data.GroupChatMessage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupChatMessagesResponseUnmarshaller {

	public static ListGroupChatMessagesResponse unmarshall(ListGroupChatMessagesResponse listGroupChatMessagesResponse, UnmarshallerContext _ctx) {
		
		listGroupChatMessagesResponse.setRequestId(_ctx.stringValue("ListGroupChatMessagesResponse.RequestId"));
		listGroupChatMessagesResponse.setHttpStatusCode(_ctx.integerValue("ListGroupChatMessagesResponse.HttpStatusCode"));
		listGroupChatMessagesResponse.setMessage(_ctx.stringValue("ListGroupChatMessagesResponse.Message"));
		listGroupChatMessagesResponse.setCode(_ctx.stringValue("ListGroupChatMessagesResponse.Code"));

		Data data = new Data();
		data.setNextPageToken(_ctx.stringValue("ListGroupChatMessagesResponse.Data.NextPageToken"));

		List<GroupChatMessage> messages = new ArrayList<GroupChatMessage>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupChatMessagesResponse.Data.Messages.Length"); i++) {
			GroupChatMessage groupChatMessage = new GroupChatMessage();
			groupChatMessage.setJobId(_ctx.stringValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].JobId"));
			groupChatMessage.setSenderId(_ctx.stringValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].SenderId"));
			groupChatMessage.setSenderType(_ctx.stringValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].SenderType"));
			groupChatMessage.setTimestamp(_ctx.longValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].Timestamp"));
			groupChatMessage.setContent(_ctx.stringValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].Content"));
			groupChatMessage.setSenderName(_ctx.stringValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].SenderName"));
			groupChatMessage.setSenderAvatarUrl(_ctx.stringValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].SenderAvatarUrl"));
			groupChatMessage.setRecalled(_ctx.booleanValue("ListGroupChatMessagesResponse.Data.Messages["+ i +"].Recalled"));

			messages.add(groupChatMessage);
		}
		data.setMessages(messages);
		listGroupChatMessagesResponse.setData(data);
	 
	 	return listGroupChatMessagesResponse;
	}
}