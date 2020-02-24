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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.RecordFailureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecordFailureResponseUnmarshaller {

	public static RecordFailureResponse unmarshall(RecordFailureResponse recordFailureResponse, UnmarshallerContext _ctx) {
		
		recordFailureResponse.setRequestId(_ctx.stringValue("RecordFailureResponse.RequestId"));
		recordFailureResponse.setSuccess(_ctx.booleanValue("RecordFailureResponse.Success"));
		recordFailureResponse.setCode(_ctx.stringValue("RecordFailureResponse.Code"));
		recordFailureResponse.setMessage(_ctx.stringValue("RecordFailureResponse.Message"));
		recordFailureResponse.setHttpStatusCode(_ctx.integerValue("RecordFailureResponse.HttpStatusCode"));
	 
	 	return recordFailureResponse;
	}
}