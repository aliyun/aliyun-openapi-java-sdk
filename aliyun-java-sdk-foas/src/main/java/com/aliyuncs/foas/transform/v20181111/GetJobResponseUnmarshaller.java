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

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext context) {
		
		getJobResponse.setRequestId(context.stringValue("GetJobResponse.RequestId"));

		Job job = new Job();
		job.setJobName(context.stringValue("GetJobResponse.Job.JobName"));
		job.setProjectName(context.stringValue("GetJobResponse.Job.ProjectName"));
		job.setJobType(context.stringValue("GetJobResponse.Job.JobType"));
		job.setApiType(context.stringValue("GetJobResponse.Job.ApiType"));
		job.setCode(context.stringValue("GetJobResponse.Job.Code"));
		job.setPlanJson(context.stringValue("GetJobResponse.Job.PlanJson"));
		job.setProperties(context.stringValue("GetJobResponse.Job.Properties"));
		job.setPackages(context.stringValue("GetJobResponse.Job.Packages"));
		job.setIsCommitted(context.booleanValue("GetJobResponse.Job.IsCommitted"));
		job.setCreator(context.stringValue("GetJobResponse.Job.Creator"));
		job.setCreateTime(context.longValue("GetJobResponse.Job.CreateTime"));
		job.setModifier(context.stringValue("GetJobResponse.Job.Modifier"));
		job.setModifyTime(context.longValue("GetJobResponse.Job.ModifyTime"));
		job.setDescription(context.stringValue("GetJobResponse.Job.Description"));
		job.setEngineVersion(context.stringValue("GetJobResponse.Job.EngineVersion"));
		job.setClusterId(context.stringValue("GetJobResponse.Job.ClusterId"));
		job.setQueueName(context.stringValue("GetJobResponse.Job.QueueName"));
		job.setFolderId(context.longValue("GetJobResponse.Job.FolderId"));
		getJobResponse.setJob(job);
	 
	 	return getJobResponse;
	}
}