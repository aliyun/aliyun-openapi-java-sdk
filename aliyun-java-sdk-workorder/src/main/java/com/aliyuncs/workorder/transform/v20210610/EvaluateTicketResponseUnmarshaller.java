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

package com.aliyuncs.workorder.transform.v20210610;

import com.aliyuncs.workorder.model.v20210610.EvaluateTicketResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class EvaluateTicketResponseUnmarshaller {

	public static EvaluateTicketResponse unmarshall(EvaluateTicketResponse evaluateTicketResponse, UnmarshallerContext _ctx) {
		
		evaluateTicketResponse.setRequestId(_ctx.stringValue("EvaluateTicketResponse.RequestId"));
		evaluateTicketResponse.setCode(_ctx.integerValue("EvaluateTicketResponse.Code"));
		evaluateTicketResponse.setMessage(_ctx.stringValue("EvaluateTicketResponse.Message"));
		evaluateTicketResponse.setSuccess(_ctx.booleanValue("EvaluateTicketResponse.Success"));
	 
	 	return evaluateTicketResponse;
	}
}