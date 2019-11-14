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

package com.aliyuncs.dysmsapi.transform.v20170525;

import com.aliyuncs.dysmsapi.model.v20170525.SendBatchSmsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendBatchSmsResponseUnmarshaller {

	public static SendBatchSmsResponse unmarshall(SendBatchSmsResponse sendBatchSmsResponse, UnmarshallerContext _ctx) {
		
		sendBatchSmsResponse.setRequestId(_ctx.stringValue("SendBatchSmsResponse.RequestId"));
		sendBatchSmsResponse.setBizId(_ctx.stringValue("SendBatchSmsResponse.BizId"));
		sendBatchSmsResponse.setCode(_ctx.stringValue("SendBatchSmsResponse.Code"));
		sendBatchSmsResponse.setMessage(_ctx.stringValue("SendBatchSmsResponse.Message"));
	 
	 	return sendBatchSmsResponse;
	}
}