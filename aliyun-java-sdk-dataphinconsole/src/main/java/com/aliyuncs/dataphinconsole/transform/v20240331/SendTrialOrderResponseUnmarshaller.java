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

package com.aliyuncs.dataphinconsole.transform.v20240331;

import com.aliyuncs.dataphinconsole.model.v20240331.SendTrialOrderResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendTrialOrderResponseUnmarshaller {

	public static SendTrialOrderResponse unmarshall(SendTrialOrderResponse sendTrialOrderResponse, UnmarshallerContext _ctx) {
		
		sendTrialOrderResponse.setRequestId(_ctx.stringValue("SendTrialOrderResponse.RequestId"));
		sendTrialOrderResponse.setCode(_ctx.stringValue("SendTrialOrderResponse.Code"));
		sendTrialOrderResponse.setMessage(_ctx.stringValue("SendTrialOrderResponse.Message"));
		sendTrialOrderResponse.setData(_ctx.stringValue("SendTrialOrderResponse.Data"));
		sendTrialOrderResponse.setSuccess(_ctx.booleanValue("SendTrialOrderResponse.Success"));
	 
	 	return sendTrialOrderResponse;
	}
}