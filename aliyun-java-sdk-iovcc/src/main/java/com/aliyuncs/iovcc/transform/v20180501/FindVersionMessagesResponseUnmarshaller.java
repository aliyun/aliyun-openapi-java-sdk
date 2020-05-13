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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.FindVersionMessagesResponse;
import com.aliyuncs.iovcc.model.v20180501.FindVersionMessagesResponse.MessageList;
import com.aliyuncs.iovcc.model.v20180501.FindVersionMessagesResponse.MessageList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindVersionMessagesResponseUnmarshaller {

	public static FindVersionMessagesResponse unmarshall(FindVersionMessagesResponse findVersionMessagesResponse, UnmarshallerContext _ctx) {
		
		findVersionMessagesResponse.setRequestId(_ctx.stringValue("FindVersionMessagesResponse.RequestId"));

		MessageList messageList = new MessageList();
		messageList.setTotalCount(_ctx.integerValue("FindVersionMessagesResponse.MessageList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindVersionMessagesResponse.MessageList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].Id"));
			itemsItem.setMessageId(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].MessageId"));
			itemsItem.setVersionId(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].VersionId"));
			itemsItem.setTestId(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].TestId"));
			itemsItem.setStatus(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].Status"));
			itemsItem.setStatusDesc(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].StatusDesc"));
			itemsItem.setDeviceId(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].DeviceId"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtModify(_ctx.stringValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].GmtModify"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].GmtCreateTimestamp"));
			itemsItem.setGmtModifyTimestamp(_ctx.longValue("FindVersionMessagesResponse.MessageList.Items["+ i +"].GmtModifyTimestamp"));

			items.add(itemsItem);
		}
		messageList.setItems(items);
		findVersionMessagesResponse.setMessageList(messageList);
	 
	 	return findVersionMessagesResponse;
	}
}