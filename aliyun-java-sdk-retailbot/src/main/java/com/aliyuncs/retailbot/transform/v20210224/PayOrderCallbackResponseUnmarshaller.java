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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.PayOrderCallbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PayOrderCallbackResponseUnmarshaller {

	public static PayOrderCallbackResponse unmarshall(PayOrderCallbackResponse payOrderCallbackResponse, UnmarshallerContext _ctx) {
		
		payOrderCallbackResponse.setRequestId(_ctx.stringValue("PayOrderCallbackResponse.requestId"));
		payOrderCallbackResponse.setSuccess(_ctx.booleanValue("PayOrderCallbackResponse.success"));
		payOrderCallbackResponse.setData(_ctx.stringValue("PayOrderCallbackResponse.data"));
		payOrderCallbackResponse.setCode(_ctx.stringValue("PayOrderCallbackResponse.code"));
		payOrderCallbackResponse.setMessage(_ctx.stringValue("PayOrderCallbackResponse.message"));
		payOrderCallbackResponse.setSynchro(_ctx.booleanValue("PayOrderCallbackResponse.synchro"));
	 
	 	return payOrderCallbackResponse;
	}
}