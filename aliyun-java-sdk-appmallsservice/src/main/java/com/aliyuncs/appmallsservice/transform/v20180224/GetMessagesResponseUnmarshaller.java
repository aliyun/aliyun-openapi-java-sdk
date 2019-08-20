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

package com.aliyuncs.appmallsservice.transform.v20180224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.appmallsservice.model.v20180224.GetMessagesResponse;
import com.aliyuncs.appmallsservice.model.v20180224.GetMessagesResponse.BizMessagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMessagesResponseUnmarshaller {

	public static GetMessagesResponse unmarshall(GetMessagesResponse getMessagesResponse, UnmarshallerContext _ctx) {
		
		getMessagesResponse.setRequestId(_ctx.stringValue("GetMessagesResponse.RequestId"));
		getMessagesResponse.setErrorCode(_ctx.stringValue("GetMessagesResponse.ErrorCode"));
		getMessagesResponse.setMsg(_ctx.stringValue("GetMessagesResponse.Msg"));
		getMessagesResponse.setSubCode(_ctx.stringValue("GetMessagesResponse.SubCode"));
		getMessagesResponse.setSubMsg(_ctx.stringValue("GetMessagesResponse.SubMsg"));
		getMessagesResponse.setLogsId(_ctx.stringValue("GetMessagesResponse.LogsId"));

		List<BizMessagesItem> bizMessages = new ArrayList<BizMessagesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMessagesResponse.BizMessages.Length"); i++) {
			BizMessagesItem bizMessagesItem = new BizMessagesItem();
			bizMessagesItem.setPubTime(_ctx.stringValue("GetMessagesResponse.BizMessages["+ i +"].PubTime"));
			bizMessagesItem.setTopic(_ctx.stringValue("GetMessagesResponse.BizMessages["+ i +"].Topic"));
			bizMessagesItem.setDataId(_ctx.longValue("GetMessagesResponse.BizMessages["+ i +"].DataId"));
			bizMessagesItem.setContentMapJson(_ctx.stringValue("GetMessagesResponse.BizMessages["+ i +"].ContentMapJson"));

			bizMessages.add(bizMessagesItem);
		}
		getMessagesResponse.setBizMessages(bizMessages);
	 
	 	return getMessagesResponse;
	}
}