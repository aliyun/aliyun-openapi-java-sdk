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

package com.aliyuncs.mns.transform.v20210319;

import com.aliyuncs.mns.model.v20210319.ReceiveMessageResponse;
import com.aliyuncs.mns.model.v20210319.ReceiveMessageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReceiveMessageResponseUnmarshaller {

	public static ReceiveMessageResponse unmarshall(ReceiveMessageResponse receiveMessageResponse, UnmarshallerContext _ctx) {
		
		receiveMessageResponse.setRequestId(_ctx.stringValue("ReceiveMessageResponse.RequestId"));
		receiveMessageResponse.setCode(_ctx.longValue("ReceiveMessageResponse.Code"));
		receiveMessageResponse.setStatus(_ctx.stringValue("ReceiveMessageResponse.Status"));
		receiveMessageResponse.setMessage(_ctx.stringValue("ReceiveMessageResponse.Message"));
		receiveMessageResponse.setSuccess(_ctx.booleanValue("ReceiveMessageResponse.Success"));

		Data data = new Data();
		data.setMessageId(_ctx.stringValue("ReceiveMessageResponse.Data.MessageId"));
		data.setReceiptHandle(_ctx.stringValue("ReceiveMessageResponse.Data.ReceiptHandle"));
		data.setMessageBody(_ctx.stringValue("ReceiveMessageResponse.Data.MessageBody"));
		data.setMessageBodyMd5(_ctx.stringValue("ReceiveMessageResponse.Data.MessageBodyMd5"));
		data.setEnqueueTime(_ctx.longValue("ReceiveMessageResponse.Data.EnqueueTime"));
		data.setNextVisibleTime(_ctx.longValue("ReceiveMessageResponse.Data.NextVisibleTime"));
		data.setFirstDequeueTime(_ctx.longValue("ReceiveMessageResponse.Data.FirstDequeueTime"));
		data.setDequeueCount(_ctx.longValue("ReceiveMessageResponse.Data.DequeueCount"));
		data.setPriority(_ctx.longValue("ReceiveMessageResponse.Data.Priority"));
		receiveMessageResponse.setData(data);
	 
	 	return receiveMessageResponse;
	}
}