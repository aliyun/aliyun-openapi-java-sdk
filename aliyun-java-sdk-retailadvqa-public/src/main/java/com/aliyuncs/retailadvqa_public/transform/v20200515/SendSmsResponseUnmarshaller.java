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

package com.aliyuncs.retailadvqa_public.transform.v20200515;

import com.aliyuncs.retailadvqa_public.model.v20200515.SendSmsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendSmsResponseUnmarshaller {

	public static SendSmsResponse unmarshall(SendSmsResponse sendSmsResponse, UnmarshallerContext _ctx) {
		
		sendSmsResponse.setRequestId(_ctx.stringValue("SendSmsResponse.RequestId"));
		sendSmsResponse.setData(_ctx.stringValue("SendSmsResponse.Data"));
		sendSmsResponse.setErrorCode(_ctx.stringValue("SendSmsResponse.ErrorCode"));
		sendSmsResponse.setErrorDesc(_ctx.stringValue("SendSmsResponse.ErrorDesc"));
		sendSmsResponse.setSuccess(_ctx.booleanValue("SendSmsResponse.Success"));
		sendSmsResponse.setTraceId(_ctx.stringValue("SendSmsResponse.TraceId"));
	 
	 	return sendSmsResponse;
	}
}