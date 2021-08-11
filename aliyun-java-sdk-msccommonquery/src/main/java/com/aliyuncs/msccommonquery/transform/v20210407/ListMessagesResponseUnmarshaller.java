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

package com.aliyuncs.msccommonquery.transform.v20210407;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.msccommonquery.model.v20210407.ListMessagesResponse;
import com.aliyuncs.msccommonquery.model.v20210407.ListMessagesResponse.Message;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMessagesResponseUnmarshaller {

	public static ListMessagesResponse unmarshall(ListMessagesResponse listMessagesResponse, UnmarshallerContext _ctx) {
		
		listMessagesResponse.setRequestId(_ctx.stringValue("ListMessagesResponse.RequestId"));
		listMessagesResponse.setCode(_ctx.stringValue("ListMessagesResponse.Code"));
		listMessagesResponse.setMessage(_ctx.stringValue("ListMessagesResponse.Message"));
		listMessagesResponse.setSuccess(_ctx.booleanValue("ListMessagesResponse.Success"));

		List<Message> data = new ArrayList<Message>();
		for (int i = 0; i < _ctx.lengthValue("ListMessagesResponse.Data.Length"); i++) {
			Message message = new Message();
			message.setMessageId(_ctx.stringValue("ListMessagesResponse.Data["+ i +"].MessageId"));
			message.setReceiver(_ctx.stringValue("ListMessagesResponse.Data["+ i +"].Receiver"));
			message.setChannelType(_ctx.stringValue("ListMessagesResponse.Data["+ i +"].ChannelType"));
			message.setTitle(_ctx.stringValue("ListMessagesResponse.Data["+ i +"].Title"));
			message.setContent(_ctx.stringValue("ListMessagesResponse.Data["+ i +"].Content"));
			message.setStatus(_ctx.stringValue("ListMessagesResponse.Data["+ i +"].Status"));
			message.setTimestamp(_ctx.longValue("ListMessagesResponse.Data["+ i +"].Timestamp"));

			data.add(message);
		}
		listMessagesResponse.setData(data);
	 
	 	return listMessagesResponse;
	}
}