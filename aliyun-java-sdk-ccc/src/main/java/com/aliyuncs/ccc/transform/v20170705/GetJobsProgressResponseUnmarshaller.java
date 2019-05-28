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

	public static GetJobsProgressResponse unmarshall(GetJobsProgressResponse getJobsProgressResponse, UnmarshallerContext context) {
		
		getJobsProgressResponse.setRequestId(context.stringValue("GetJobsProgressResponse.RequestId"));
		getJobsProgressResponse.setSuccess(context.booleanValue("GetJobsProgressResponse.Success"));
		getJobsProgressResponse.setCode(context.stringValue("GetJobsProgressResponse.Code"));
		getJobsProgressResponse.setMessage(context.stringValue("GetJobsProgressResponse.Message"));
		getJobsProgressResponse.setHttpStatusCode(context.integerValue("GetJobsProgressResponse.HttpStatusCode"));

		JobsProgress jobsProgress = new JobsProgress();
		jobsProgress.setStatus(context.stringValue("GetJobsProgressResponse.JobsProgress.Status"));
		jobsProgress.setStartTime(context.longValue("GetJobsProgressResponse.JobsProgress.StartTime"));
		jobsProgress.setDuration(context.integerValue("GetJobsProgressResponse.JobsProgress.Duration"));
		jobsProgress.setTotalJobs(context.integerValue("GetJobsProgressResponse.JobsProgress.TotalJobs"));
		jobsProgress.setTotalNotAnswered(context.integerValue("GetJobsProgressResponse.JobsProgress.TotalNotAnswered"));
		jobsProgress.setTotalCompleted(context.integerValue("GetJobsProgressResponse.JobsProgress.TotalCompleted"));
		jobsProgress.setScheduling(context.integerValue("GetJobsProgressResponse.JobsProgress.Scheduling"));
		jobsProgress.setExecuting(context.integerValue("GetJobsProgressResponse.JobsProgress.Executing"));
		jobsProgress.setPaused(context.integerValue("GetJobsProgressResponse.JobsProgress.Paused"));
		jobsProgress.setFailed(context.integerValue("GetJobsProgressResponse.JobsProgress.Failed"));
		jobsProgress.setCancelled(context.integerValue("GetJobsProgressResponse.JobsProgress.Cancelled"));
		jobsProgress.setRepeatCall(context.integerValue("GetJobsProgressResponse.JobsProgress.RepeatCall"));
		getJobsProgressResponse.setJobsProgress(jobsProgress);
	 
	 	return getJobsProgressResponse;
	}
}