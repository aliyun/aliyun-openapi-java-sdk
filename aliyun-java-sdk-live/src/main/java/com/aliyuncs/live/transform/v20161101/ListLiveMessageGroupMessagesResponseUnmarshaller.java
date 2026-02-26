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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupMessagesResponse;
import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupMessagesResponse.Messages;
import com.aliyuncs.live.model.v20161101.ListLiveMessageGroupMessagesResponse.Messages.Sender;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLiveMessageGroupMessagesResponseUnmarshaller {

	public static ListLiveMessageGroupMessagesResponse unmarshall(ListLiveMessageGroupMessagesResponse listLiveMessageGroupMessagesResponse, UnmarshallerContext _ctx) {
		
		listLiveMessageGroupMessagesResponse.setRequestId(_ctx.stringValue("ListLiveMessageGroupMessagesResponse.RequestId"));
		listLiveMessageGroupMessagesResponse.setGroupId(_ctx.stringValue("ListLiveMessageGroupMessagesResponse.GroupId"));
		listLiveMessageGroupMessagesResponse.setNextPageToken(_ctx.longValue("ListLiveMessageGroupMessagesResponse.NextPageToken"));
		listLiveMessageGroupMessagesResponse.setHasmore(_ctx.booleanValue("ListLiveMessageGroupMessagesResponse.Hasmore"));

		List<Messages> messageList = new ArrayList<Messages>();
		for (int i = 0; i < _ctx.lengthValue("ListLiveMessageGroupMessagesResponse.MessageList.Length"); i++) {
			Messages messages = new Messages();
			messages.setBody(_ctx.stringValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].Body"));
			messages.setTimestamp(_ctx.longValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].Timestamp"));
			messages.setMsgTid(_ctx.stringValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].MsgTid"));
			messages.setMsgType(_ctx.longValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].MsgType"));
			messages.setSeqNumber(_ctx.longValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].SeqNumber"));
			messages.setTotalMessages(_ctx.longValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].TotalMessages"));

			Sender sender = new Sender();
			sender.setUserId(_ctx.stringValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].Sender.UserId"));
			sender.setUserInfo(_ctx.stringValue("ListLiveMessageGroupMessagesResponse.MessageList["+ i +"].Sender.UserInfo"));
			messages.setSender(sender);

			messageList.add(messages);
		}
		listLiveMessageGroupMessagesResponse.setMessageList(messageList);
	 
	 	return listLiveMessageGroupMessagesResponse;
	}
}