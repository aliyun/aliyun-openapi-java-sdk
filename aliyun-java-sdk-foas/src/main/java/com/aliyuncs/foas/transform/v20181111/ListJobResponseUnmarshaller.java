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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ListJobResponse;
import com.aliyuncs.foas.model.v20181111.ListJobResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobResponseUnmarshaller {

	public static ListJobResponse unmarshall(ListJobResponse listJobResponse, UnmarshallerContext context) {
		
		listJobResponse.setRequestId(context.stringValue("ListJobResponse.RequestId"));
		listJobResponse.setPageIndex(context.integerValue("ListJobResponse.PageIndex"));
		listJobResponse.setPageSize(context.integerValue("ListJobResponse.PageSize"));
		listJobResponse.setTotalPage(context.integerValue("ListJobResponse.TotalPage"));
		listJobResponse.setTotalCount(context.longValue("ListJobResponse.TotalCount"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < context.lengthValue("ListJobResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobName(context.stringValue("ListJobResponse.Jobs["+ i +"].JobName"));
			job.setProjectName(context.stringValue("ListJobResponse.Jobs["+ i +"].ProjectName"));
			job.setJobType(context.stringValue("ListJobResponse.Jobs["+ i +"].JobType"));
			job.setApiType(context.stringValue("ListJobResponse.Jobs["+ i +"].ApiType"));
			job.setCode(context.stringValue("ListJobResponse.Jobs["+ i +"].Code"));
			job.setPlanJson(context.stringValue("ListJobResponse.Jobs["+ i +"].PlanJson"));
			job.setProperties(context.stringValue("ListJobResponse.Jobs["+ i +"].Properties"));
			job.setPackages(context.stringValue("ListJobResponse.Jobs["+ i +"].Packages"));
			job.setIsCommitted(context.booleanValue("ListJobResponse.Jobs["+ i +"].IsCommitted"));
			job.setCreator(context.stringValue("ListJobResponse.Jobs["+ i +"].Creator"));
			job.setCreateTime(context.longValue("ListJobResponse.Jobs["+ i +"].CreateTime"));
			job.setModifier(context.stringValue("ListJobResponse.Jobs["+ i +"].Modifier"));
			job.setModifyTime(context.longValue("ListJobResponse.Jobs["+ i +"].ModifyTime"));
			job.setDescription(context.stringValue("ListJobResponse.Jobs["+ i +"].Description"));
			job.setEngineVersion(context.stringValue("ListJobResponse.Jobs["+ i +"].EngineVersion"));
			job.setClusterId(context.stringValue("ListJobResponse.Jobs["+ i +"].ClusterId"));
			job.setQueueName(context.stringValue("ListJobResponse.Jobs["+ i +"].QueueName"));
			job.setFolderId(context.longValue("ListJobResponse.Jobs["+ i +"].FolderId"));

			jobs.add(job);
		}
		listJobResponse.setJobs(jobs);
	 
	 	return listJobResponse;
	}
}