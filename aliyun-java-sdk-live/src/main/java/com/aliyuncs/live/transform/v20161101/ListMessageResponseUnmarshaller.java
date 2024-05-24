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

import com.aliyuncs.live.model.v20161101.ListMessageResponse;
import com.aliyuncs.live.model.v20161101.ListMessageResponse.Result;
import com.aliyuncs.live.model.v20161101.ListMessageResponse.Result.MessageListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMessageResponseUnmarshaller {

	public static ListMessageResponse unmarshall(ListMessageResponse listMessageResponse, UnmarshallerContext _ctx) {
		
		listMessageResponse.setRequestId(_ctx.stringValue("ListMessageResponse.RequestId"));

		Result result = new Result();
		result.setHasMore(_ctx.booleanValue("ListMessageResponse.Result.HasMore"));

		List<MessageListItem> messageList = new ArrayList<MessageListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMessageResponse.Result.MessageList.Length"); i++) {
			MessageListItem messageListItem = new MessageListItem();
			messageListItem.setData(_ctx.stringValue("ListMessageResponse.Result.MessageList["+ i +"].Data"));
			messageListItem.setGroupId(_ctx.stringValue("ListMessageResponse.Result.MessageList["+ i +"].GroupId"));
			messageListItem.setMessageId(_ctx.stringValue("ListMessageResponse.Result.MessageList["+ i +"].MessageId"));
			messageListItem.setSenderId(_ctx.stringValue("ListMessageResponse.Result.MessageList["+ i +"].SenderId"));
			messageListItem.setType(_ctx.integerValue("ListMessageResponse.Result.MessageList["+ i +"].Type"));

			messageList.add(messageListItem);
		}
		result.setMessageList(messageList);
		listMessageResponse.setResult(result);
	 
	 	return listMessageResponse;
	}
}