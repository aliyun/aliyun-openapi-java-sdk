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

import com.aliyuncs.ccc.model.v20170705.ResumePredictiveJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumePredictiveJobsResponseUnmarshaller {

	public static ResumePredictiveJobsResponse unmarshall(ResumePredictiveJobsResponse resumePredictiveJobsResponse, UnmarshallerContext _ctx) {
		
		resumePredictiveJobsResponse.setRequestId(_ctx.stringValue("ResumePredictiveJobsResponse.RequestId"));
		resumePredictiveJobsResponse.setCode(_ctx.stringValue("ResumePredictiveJobsResponse.Code"));
		resumePredictiveJobsResponse.setHttpStatusCode(_ctx.integerValue("ResumePredictiveJobsResponse.HttpStatusCode"));
		resumePredictiveJobsResponse.setMessage(_ctx.stringValue("ResumePredictiveJobsResponse.Message"));
		resumePredictiveJobsResponse.setSuccess(_ctx.booleanValue("ResumePredictiveJobsResponse.Success"));
	 
	 	return resumePredictiveJobsResponse;
	}
}