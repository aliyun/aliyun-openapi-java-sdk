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

import com.aliyuncs.mns.model.v20210319.PublishMessageResponse;
import com.aliyuncs.mns.model.v20210319.PublishMessageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class PublishMessageResponseUnmarshaller {

	public static PublishMessageResponse unmarshall(PublishMessageResponse publishMessageResponse, UnmarshallerContext _ctx) {
		
		publishMessageResponse.setRequestId(_ctx.stringValue("PublishMessageResponse.RequestId"));
		publishMessageResponse.setCode(_ctx.longValue("PublishMessageResponse.Code"));
		publishMessageResponse.setStatus(_ctx.stringValue("PublishMessageResponse.Status"));
		publishMessageResponse.setMessage(_ctx.stringValue("PublishMessageResponse.Message"));
		publishMessageResponse.setSuccess(_ctx.booleanValue("PublishMessageResponse.Success"));

		Data data = new Data();
		data.setMessagebodymd5(_ctx.stringValue("PublishMessageResponse.Data.Messagebodymd5"));
		data.setMessageId(_ctx.stringValue("PublishMessageResponse.Data.MessageId"));
		publishMessageResponse.setData(data);
	 
	 	return publishMessageResponse;
	}
}