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

import com.aliyuncs.ccc.model.v20170705.CancelPredictiveJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelPredictiveJobsResponseUnmarshaller {

	public static CancelPredictiveJobsResponse unmarshall(CancelPredictiveJobsResponse cancelPredictiveJobsResponse, UnmarshallerContext _ctx) {
		
		cancelPredictiveJobsResponse.setRequestId(_ctx.stringValue("CancelPredictiveJobsResponse.RequestId"));
		cancelPredictiveJobsResponse.setSuccess(_ctx.booleanValue("CancelPredictiveJobsResponse.Success"));
		cancelPredictiveJobsResponse.setCode(_ctx.stringValue("CancelPredictiveJobsResponse.Code"));
		cancelPredictiveJobsResponse.setMessage(_ctx.stringValue("CancelPredictiveJobsResponse.Message"));
		cancelPredictiveJobsResponse.setHttpStatusCode(_ctx.integerValue("CancelPredictiveJobsResponse.HttpStatusCode"));
	 
	 	return cancelPredictiveJobsResponse;
	}
}