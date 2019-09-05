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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.PredictiveRecordFailureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PredictiveRecordFailureResponseUnmarshaller {

	public static PredictiveRecordFailureResponse unmarshall(PredictiveRecordFailureResponse predictiveRecordFailureResponse, UnmarshallerContext _ctx) {
		
		predictiveRecordFailureResponse.setRequestId(_ctx.stringValue("PredictiveRecordFailureResponse.RequestId"));
		predictiveRecordFailureResponse.setSuccess(_ctx.booleanValue("PredictiveRecordFailureResponse.Success"));
		predictiveRecordFailureResponse.setCode(_ctx.stringValue("PredictiveRecordFailureResponse.Code"));
		predictiveRecordFailureResponse.setMessage(_ctx.stringValue("PredictiveRecordFailureResponse.Message"));
		predictiveRecordFailureResponse.setHttpStatusCode(_ctx.integerValue("PredictiveRecordFailureResponse.HttpStatusCode"));
	 
	 	return predictiveRecordFailureResponse;
	}
}