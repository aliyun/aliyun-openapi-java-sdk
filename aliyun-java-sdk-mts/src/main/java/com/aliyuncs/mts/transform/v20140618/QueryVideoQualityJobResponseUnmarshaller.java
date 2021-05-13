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

import com.aliyuncs.mts.model.v20140618.QueryVideoQualityJobResponse;
import com.aliyuncs.mts.model.v20140618.QueryVideoQualityJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVideoQualityJobResponseUnmarshaller {

	public static QueryVideoQualityJobResponse unmarshall(QueryVideoQualityJobResponse queryVideoQualityJobResponse, UnmarshallerContext _ctx) {
		
		queryVideoQualityJobResponse.setRequestId(_ctx.stringValue("QueryVideoQualityJobResponse.RequestId"));
		queryVideoQualityJobResponse.setMessage(_ctx.stringValue("QueryVideoQualityJobResponse.Message"));
		queryVideoQualityJobResponse.setCode(_ctx.stringValue("QueryVideoQualityJobResponse.Code"));

		Job job = new Job();
		job.setStatus(_ctx.stringValue("QueryVideoQualityJobResponse.Job.Status"));
		job.setJobId(_ctx.stringValue("QueryVideoQualityJobResponse.Job.JobId"));
		job.setUserId(_ctx.longValue("QueryVideoQualityJobResponse.Job.UserId"));
		job.setVideoQualityResults(_ctx.stringValue("QueryVideoQualityJobResponse.Job.VideoQualityResults"));
		job.setMessage(_ctx.stringValue("QueryVideoQualityJobResponse.Job.Message"));
		job.setOutput(_ctx.stringValue("QueryVideoQualityJobResponse.Job.Output"));
		queryVideoQualityJobResponse.setJob(job);
	 
	 	return queryVideoQualityJobResponse;
	}
}