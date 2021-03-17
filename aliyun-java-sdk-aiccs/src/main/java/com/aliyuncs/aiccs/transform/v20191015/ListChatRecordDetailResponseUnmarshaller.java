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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.ListChatRecordDetailResponse;
import com.aliyuncs.aiccs.model.v20191015.ListChatRecordDetailResponse.ResultData;
import com.aliyuncs.aiccs.model.v20191015.ListChatRecordDetailResponse.ResultData.DataItem;
import com.aliyuncs.aiccs.model.v20191015.ListChatRecordDetailResponse.ResultData.DataItem.MessageListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChatRecordDetailResponseUnmarshaller {

	public static ListChatRecordDetailResponse unmarshall(ListChatRecordDetailResponse listChatRecordDetailResponse, UnmarshallerContext _ctx) {
		
		listChatRecordDetailResponse.setRequestId(_ctx.stringValue("ListChatRecordDetailResponse.RequestId"));
		listChatRecordDetailResponse.setMessage(_ctx.stringValue("ListChatRecordDetailResponse.Message"));
		listChatRecordDetailResponse.setHttpStatusCode(_ctx.integerValue("ListChatRecordDetailResponse.HttpStatusCode"));
		listChatRecordDetailResponse.setCode(_ctx.stringValue("ListChatRecordDetailResponse.Code"));
		listChatRecordDetailResponse.setSuccess(_ctx.booleanValue("ListChatRecordDetailResponse.Success"));

		ResultData resultData = new ResultData();
		resultData.setOnePageSize(_ctx.longValue("ListChatRecordDetailResponse.ResultData.OnePageSize"));
		resultData.setTotalPage(_ctx.longValue("ListChatRecordDetailResponse.ResultData.TotalPage"));
		resultData.setCurrentPage(_ctx.longValue("ListChatRecordDetailResponse.ResultData.CurrentPage"));
		resultData.setTotalResults(_ctx.longValue("ListChatRecordDetailResponse.ResultData.TotalResults"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListChatRecordDetailResponse.ResultData.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setServicerName(_ctx.stringValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].ServicerName"));
			dataItem.setEndTime(_ctx.longValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].EndTime"));
			dataItem.setStartTime(_ctx.longValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].StartTime"));

			List<MessageListItem> messageList = new ArrayList<MessageListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].MessageList.Length"); j++) {
				MessageListItem messageListItem = new MessageListItem();
				messageListItem.setSenderName(_ctx.stringValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].MessageList["+ j +"].SenderName"));
				messageListItem.setContent(_ctx.stringValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].MessageList["+ j +"].Content"));
				messageListItem.setCreateTime(_ctx.longValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].MessageList["+ j +"].CreateTime"));
				messageListItem.setSenderType(_ctx.longValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].MessageList["+ j +"].SenderType"));
				messageListItem.setMsgType(_ctx.stringValue("ListChatRecordDetailResponse.ResultData.Data["+ i +"].MessageList["+ j +"].MsgType"));

				messageList.add(messageListItem);
			}
			dataItem.setMessageList(messageList);

			data.add(dataItem);
		}
		resultData.setData(data);
		listChatRecordDetailResponse.setResultData(resultData);
	 
	 	return listChatRecordDetailResponse;
	}
}