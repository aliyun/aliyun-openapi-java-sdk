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

package com.aliyuncs.resellertrade.transform.v20191227;

import com.aliyuncs.resellertrade.model.v20191227.PayResultCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PayResultCallbackResponseUnmarshaller {

	public static PayResultCallbackResponse unmarshall(PayResultCallbackResponse payResultCallbackResponse, UnmarshallerContext _ctx) {
		
		payResultCallbackResponse.setRequestId(_ctx.stringValue("PayResultCallbackResponse.RequestId"));
		payResultCallbackResponse.setSuccess(_ctx.booleanValue("PayResultCallbackResponse.Success"));
		payResultCallbackResponse.setCode(_ctx.stringValue("PayResultCallbackResponse.Code"));
		payResultCallbackResponse.setMessage(_ctx.stringValue("PayResultCallbackResponse.Message"));
		payResultCallbackResponse.setData(_ctx.booleanValue("PayResultCallbackResponse.Data"));
	 
	 	return payResultCallbackResponse;
	}
}