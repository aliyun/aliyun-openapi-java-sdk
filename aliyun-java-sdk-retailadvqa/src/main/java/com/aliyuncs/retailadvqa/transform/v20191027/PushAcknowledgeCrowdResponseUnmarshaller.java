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

package com.aliyuncs.retailadvqa.transform.v20191027;

import com.aliyuncs.retailadvqa.model.v20191027.PushAcknowledgeCrowdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushAcknowledgeCrowdResponseUnmarshaller {

	public static PushAcknowledgeCrowdResponse unmarshall(PushAcknowledgeCrowdResponse pushAcknowledgeCrowdResponse, UnmarshallerContext _ctx) {
		
		pushAcknowledgeCrowdResponse.setRequestId(_ctx.stringValue("PushAcknowledgeCrowdResponse.RequestId"));
		pushAcknowledgeCrowdResponse.setData(_ctx.stringValue("PushAcknowledgeCrowdResponse.Data"));
		pushAcknowledgeCrowdResponse.setErrorCode(_ctx.stringValue("PushAcknowledgeCrowdResponse.ErrorCode"));
		pushAcknowledgeCrowdResponse.setSuccess(_ctx.booleanValue("PushAcknowledgeCrowdResponse.Success"));
		pushAcknowledgeCrowdResponse.setTraceId(_ctx.stringValue("PushAcknowledgeCrowdResponse.TraceId"));
		pushAcknowledgeCrowdResponse.setErrorDesc(_ctx.stringValue("PushAcknowledgeCrowdResponse.ErrorDesc"));
	 
	 	return pushAcknowledgeCrowdResponse;
	}
}