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

package com.aliyuncs.foas.transform.v20181111;

import com.aliyuncs.foas.model.v20181111.GetJobResponse;
import com.aliyuncs.foas.model.v20181111.GetJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext _ctx) {
		
		getJobResponse.setRequestId(_ctx.stringValue("GetJobResponse.RequestId"));

		Job job = new Job();
		job.setJobName(_ctx.stringValue("GetJobResponse.Job.JobName"));
		job.setProjectName(_ctx.stringValue("GetJobResponse.Job.ProjectName"));
		job.setJobType(_ctx.stringValue("GetJobResponse.Job.JobType"));
		job.setApiType(_ctx.stringValue("GetJobResponse.Job.ApiType"));
		job.setCode(_ctx.stringValue("GetJobResponse.Job.Code"));
		job.setPlanJson(_ctx.stringValue("GetJobResponse.Job.PlanJson"));
		job.setProperties(_ctx.stringValue("GetJobResponse.Job.Properties"));
		job.setPackages(_ctx.stringValue("GetJobResponse.Job.Packages"));
		job.setIsCommitted(_ctx.booleanValue("GetJobResponse.Job.IsCommitted"));
		job.setCreator(_ctx.stringValue("GetJobResponse.Job.Creator"));
		job.setCreateTime(_ctx.longValue("GetJobResponse.Job.CreateTime"));
		job.setModifier(_ctx.stringValue("GetJobResponse.Job.Modifier"));
		job.setModifyTime(_ctx.longValue("GetJobResponse.Job.ModifyTime"));
		job.setDescription(_ctx.stringValue("GetJobResponse.Job.Description"));
		job.setEngineVersion(_ctx.stringValue("GetJobResponse.Job.EngineVersion"));
		job.setClusterId(_ctx.stringValue("GetJobResponse.Job.ClusterId"));
		job.setQueueName(_ctx.stringValue("GetJobResponse.Job.QueueName"));
		job.setFolderId(_ctx.longValue("GetJobResponse.Job.FolderId"));
		job.setJobId(_ctx.stringValue("GetJobResponse.Job.JobId"));
		job.setFileId(_ctx.stringValue("GetJobResponse.Job.FileId"));
		getJobResponse.setJob(job);
	 
	 	return getJobResponse;
	}
}