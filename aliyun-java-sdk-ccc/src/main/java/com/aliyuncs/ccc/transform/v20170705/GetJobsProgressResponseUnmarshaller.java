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

import com.aliyuncs.ccc.model.v20170705.GetJobsProgressResponse;
import com.aliyuncs.ccc.model.v20170705.GetJobsProgressResponse.JobsProgress;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobsProgressResponseUnmarshaller {

	public static GetJobsProgressResponse unmarshall(GetJobsProgressResponse getJobsProgressResponse, UnmarshallerContext _ctx) {
		
		getJobsProgressResponse.setRequestId(_ctx.stringValue("GetJobsProgressResponse.RequestId"));
		getJobsProgressResponse.setSuccess(_ctx.booleanValue("GetJobsProgressResponse.Success"));
		getJobsProgressResponse.setCode(_ctx.stringValue("GetJobsProgressResponse.Code"));
		getJobsProgressResponse.setMessage(_ctx.stringValue("GetJobsProgressResponse.Message"));
		getJobsProgressResponse.setHttpStatusCode(_ctx.integerValue("GetJobsProgressResponse.HttpStatusCode"));

		JobsProgress jobsProgress = new JobsProgress();
		jobsProgress.setStatus(_ctx.stringValue("GetJobsProgressResponse.JobsProgress.Status"));
		jobsProgress.setStartTime(_ctx.longValue("GetJobsProgressResponse.JobsProgress.StartTime"));
		jobsProgress.setDuration(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.Duration"));
		jobsProgress.setTotalJobs(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.TotalJobs"));
		jobsProgress.setTotalNotAnswered(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.TotalNotAnswered"));
		jobsProgress.setTotalCompleted(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.TotalCompleted"));
		jobsProgress.setScheduling(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.Scheduling"));
		jobsProgress.setExecuting(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.Executing"));
		jobsProgress.setPaused(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.Paused"));
		jobsProgress.setFailed(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.Failed"));
		jobsProgress.setCancelled(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.Cancelled"));
		jobsProgress.setRepeatCall(_ctx.integerValue("GetJobsProgressResponse.JobsProgress.RepeatCall"));
		getJobsProgressResponse.setJobsProgress(jobsProgress);
	 
	 	return getJobsProgressResponse;
	}
}