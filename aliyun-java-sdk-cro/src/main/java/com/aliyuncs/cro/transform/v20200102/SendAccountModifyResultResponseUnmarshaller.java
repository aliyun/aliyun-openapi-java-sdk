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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.SendAccountModifyResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SendAccountModifyResultResponseUnmarshaller {

	public static SendAccountModifyResultResponse unmarshall(SendAccountModifyResultResponse sendAccountModifyResultResponse, UnmarshallerContext _ctx) {
		
		sendAccountModifyResultResponse.setRequestId(_ctx.stringValue("SendAccountModifyResultResponse.RequestId"));
		sendAccountModifyResultResponse.setCode(_ctx.integerValue("SendAccountModifyResultResponse.Code"));
		sendAccountModifyResultResponse.setMessage(_ctx.stringValue("SendAccountModifyResultResponse.Message"));
		sendAccountModifyResultResponse.setSuccess(_ctx.booleanValue("SendAccountModifyResultResponse.Success"));
	 
	 	return sendAccountModifyResultResponse;
	}
}