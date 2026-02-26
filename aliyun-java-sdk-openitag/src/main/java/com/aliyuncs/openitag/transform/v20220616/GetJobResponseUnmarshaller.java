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

package com.aliyuncs.openitag.transform.v20220616;

import com.aliyuncs.openitag.model.v20220616.GetJobResponse;
import com.aliyuncs.openitag.model.v20220616.GetJobResponse.Job;
import com.aliyuncs.openitag.model.v20220616.GetJobResponse.Job.Creator;
import com.aliyuncs.openitag.model.v20220616.GetJobResponse.Job.JobResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext _ctx) {
		
		getJobResponse.setRequestId(_ctx.stringValue("GetJobResponse.RequestId"));
		getJobResponse.setCode(_ctx.integerValue("GetJobResponse.Code"));
		getJobResponse.setMessage(_ctx.stringValue("GetJobResponse.Message"));
		getJobResponse.setDetails(_ctx.stringValue("GetJobResponse.Details"));
		getJobResponse.setSuccess(_ctx.booleanValue("GetJobResponse.Success"));
		getJobResponse.setErrorCode(_ctx.stringValue("GetJobResponse.ErrorCode"));

		Job job = new Job();
		job.setStatus(_ctx.stringValue("GetJobResponse.Job.Status"));
		job.setJobType(_ctx.stringValue("GetJobResponse.Job.JobType"));
		job.setGmtCreateTime(_ctx.stringValue("GetJobResponse.Job.GmtCreateTime"));
		job.setGmtModifiedTime(_ctx.stringValue("GetJobResponse.Job.GmtModifiedTime"));
		job.setJobId(_ctx.stringValue("GetJobResponse.Job.JobId"));

		JobResult jobResult = new JobResult();
		jobResult.setResultLink(_ctx.stringValue("GetJobResponse.Job.JobResult.ResultLink"));
		job.setJobResult(jobResult);

		Creator creator = new Creator();
		creator.setUserId(_ctx.longValue("GetJobResponse.Job.Creator.UserId"));
		creator.setAccountType(_ctx.stringValue("GetJobResponse.Job.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetJobResponse.Job.Creator.AccountNo"));
		creator.setUserName(_ctx.stringValue("GetJobResponse.Job.Creator.UserName"));
		creator.setRole(_ctx.stringValue("GetJobResponse.Job.Creator.Role"));
		job.setCreator(creator);
		getJobResponse.setJob(job);
	 
	 	return getJobResponse;
	}
}