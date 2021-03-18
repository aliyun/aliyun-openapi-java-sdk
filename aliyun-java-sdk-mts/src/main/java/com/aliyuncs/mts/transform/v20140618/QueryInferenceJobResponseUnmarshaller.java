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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.QueryInferenceJobResponse;
import com.aliyuncs.mts.model.v20140618.QueryInferenceJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInferenceJobResponseUnmarshaller {

	public static QueryInferenceJobResponse unmarshall(QueryInferenceJobResponse queryInferenceJobResponse, UnmarshallerContext _ctx) {
		
		queryInferenceJobResponse.setRequestId(_ctx.stringValue("QueryInferenceJobResponse.RequestId"));
		queryInferenceJobResponse.setCode(_ctx.stringValue("QueryInferenceJobResponse.Code"));
		queryInferenceJobResponse.setMessage(_ctx.stringValue("QueryInferenceJobResponse.Message"));

		Job job = new Job();
		job.setUserId(_ctx.longValue("QueryInferenceJobResponse.Job.UserId"));
		job.setJobId(_ctx.stringValue("QueryInferenceJobResponse.Job.JobId"));
		job.setStatus(_ctx.stringValue("QueryInferenceJobResponse.Job.Status"));
		job.setMessage(_ctx.stringValue("QueryInferenceJobResponse.Job.Message"));
		job.setResult(_ctx.stringValue("QueryInferenceJobResponse.Job.Result"));
		queryInferenceJobResponse.setJob(job);
	 
	 	return queryInferenceJobResponse;
	}
}