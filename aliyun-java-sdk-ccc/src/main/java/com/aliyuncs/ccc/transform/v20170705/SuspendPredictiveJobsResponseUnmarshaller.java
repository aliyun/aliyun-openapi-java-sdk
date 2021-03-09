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

import com.aliyuncs.ccc.model.v20170705.SuspendPredictiveJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SuspendPredictiveJobsResponseUnmarshaller {

	public static SuspendPredictiveJobsResponse unmarshall(SuspendPredictiveJobsResponse suspendPredictiveJobsResponse, UnmarshallerContext _ctx) {
		
		suspendPredictiveJobsResponse.setRequestId(_ctx.stringValue("SuspendPredictiveJobsResponse.RequestId"));
		suspendPredictiveJobsResponse.setCode(_ctx.stringValue("SuspendPredictiveJobsResponse.Code"));
		suspendPredictiveJobsResponse.setHttpStatusCode(_ctx.integerValue("SuspendPredictiveJobsResponse.HttpStatusCode"));
		suspendPredictiveJobsResponse.setMessage(_ctx.stringValue("SuspendPredictiveJobsResponse.Message"));
		suspendPredictiveJobsResponse.setSuccess(_ctx.booleanValue("SuspendPredictiveJobsResponse.Success"));
	 
	 	return suspendPredictiveJobsResponse;
	}
}