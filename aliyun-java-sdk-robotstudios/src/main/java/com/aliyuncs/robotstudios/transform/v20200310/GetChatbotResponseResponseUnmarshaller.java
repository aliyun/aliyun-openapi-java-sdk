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

package com.aliyuncs.robotstudios.transform.v20200310;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.robotstudios.model.v20200310.GetChatbotResponseResponse;
import com.aliyuncs.robotstudios.model.v20200310.GetChatbotResponseResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChatbotResponseResponseUnmarshaller {

	public static GetChatbotResponseResponse unmarshall(GetChatbotResponseResponse getChatbotResponseResponse, UnmarshallerContext _ctx) {
		
		getChatbotResponseResponse.setRequestId(_ctx.stringValue("GetChatbotResponseResponse.RequestId"));
		getChatbotResponseResponse.setCode(_ctx.stringValue("GetChatbotResponseResponse.Code"));
		getChatbotResponseResponse.setCurrentPage(_ctx.stringValue("GetChatbotResponseResponse.CurrentPage"));
		getChatbotResponseResponse.setErrorCode(_ctx.stringValue("GetChatbotResponseResponse.ErrorCode"));
		getChatbotResponseResponse.setErrorMessage(_ctx.stringValue("GetChatbotResponseResponse.ErrorMessage"));
		getChatbotResponseResponse.setPageSize(_ctx.stringValue("GetChatbotResponseResponse.PageSize"));
		getChatbotResponseResponse.setSuccess(_ctx.stringValue("GetChatbotResponseResponse.Success"));
		getChatbotResponseResponse.setTotalNumber(_ctx.stringValue("GetChatbotResponseResponse.TotalNumber"));
		getChatbotResponseResponse.setTotalPages(_ctx.stringValue("GetChatbotResponseResponse.TotalPages"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetChatbotResponseResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClientType(_ctx.stringValue("GetChatbotResponseResponse.Data["+ i +"].ClientType"));
			dataItem.setCreateTime(_ctx.stringValue("GetChatbotResponseResponse.Data["+ i +"].CreateTime"));
			dataItem.setId(_ctx.stringValue("GetChatbotResponseResponse.Data["+ i +"].Id"));
			dataItem.setMessageContent(_ctx.stringValue("GetChatbotResponseResponse.Data["+ i +"].MessageContent"));
			dataItem.setModifiedTime(_ctx.stringValue("GetChatbotResponseResponse.Data["+ i +"].ModifiedTime"));
			dataItem.setSenderName(_ctx.stringValue("GetChatbotResponseResponse.Data["+ i +"].SenderName"));
			dataItem.setSenderRole(_ctx.stringValue("GetChatbotResponseResponse.Data["+ i +"].SenderRole"));

			data.add(dataItem);
		}
		getChatbotResponseResponse.setData(data);
	 
	 	return getChatbotResponseResponse;
	}
}