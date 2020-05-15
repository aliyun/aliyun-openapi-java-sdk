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

import com.aliyuncs.iovcc.model.v20180501.FindVersionMessageSendRecordsResponse;
import com.aliyuncs.iovcc.model.v20180501.FindVersionMessageSendRecordsResponse.MessageSendRecordList;
import com.aliyuncs.iovcc.model.v20180501.FindVersionMessageSendRecordsResponse.MessageSendRecordList.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindVersionMessageSendRecordsResponseUnmarshaller {

	public static FindVersionMessageSendRecordsResponse unmarshall(FindVersionMessageSendRecordsResponse findVersionMessageSendRecordsResponse, UnmarshallerContext _ctx) {
		
		findVersionMessageSendRecordsResponse.setRequestId(_ctx.stringValue("FindVersionMessageSendRecordsResponse.RequestId"));

		MessageSendRecordList messageSendRecordList = new MessageSendRecordList();
		messageSendRecordList.setTotalCount(_ctx.integerValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.TotalCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setId(_ctx.longValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].Id"));
			itemsItem.setMessageType(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].MessageType"));
			itemsItem.setVersionId(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].VersionId"));
			itemsItem.setTargetId(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].TargetId"));
			itemsItem.setResult(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].Result"));
			itemsItem.setResultDesc(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].ResultDesc"));
			itemsItem.setSucceededCount(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].SucceededCount"));
			itemsItem.setFailedCount(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].FailedCount"));
			itemsItem.setSkippedCount(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].SkippedCount"));
			itemsItem.setGmtCreate(_ctx.stringValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].GmtCreate"));
			itemsItem.setGmtCreateTimestamp(_ctx.longValue("FindVersionMessageSendRecordsResponse.MessageSendRecordList.Items["+ i +"].GmtCreateTimestamp"));

			items.add(itemsItem);
		}
		messageSendRecordList.setItems(items);
		findVersionMessageSendRecordsResponse.setMessageSendRecordList(messageSendRecordList);
	 
	 	return findVersionMessageSendRecordsResponse;
	}
}