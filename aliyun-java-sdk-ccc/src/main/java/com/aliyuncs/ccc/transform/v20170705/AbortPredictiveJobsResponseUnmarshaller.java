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

import com.aliyuncs.ccc.model.v20170705.AbortPredictiveJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AbortPredictiveJobsResponseUnmarshaller {

	public static AbortPredictiveJobsResponse unmarshall(AbortPredictiveJobsResponse abortPredictiveJobsResponse, UnmarshallerContext _ctx) {
		
		abortPredictiveJobsResponse.setRequestId(_ctx.stringValue("AbortPredictiveJobsResponse.RequestId"));
		abortPredictiveJobsResponse.setCode(_ctx.stringValue("AbortPredictiveJobsResponse.Code"));
		abortPredictiveJobsResponse.setHttpStatusCode(_ctx.integerValue("AbortPredictiveJobsResponse.HttpStatusCode"));
		abortPredictiveJobsResponse.setMessage(_ctx.stringValue("AbortPredictiveJobsResponse.Message"));
		abortPredictiveJobsResponse.setSuccess(_ctx.booleanValue("AbortPredictiveJobsResponse.Success"));
	 
	 	return abortPredictiveJobsResponse;
	}
}