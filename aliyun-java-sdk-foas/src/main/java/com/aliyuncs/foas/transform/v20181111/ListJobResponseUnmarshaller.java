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

	public static ListJobResponse unmarshall(ListJobResponse listJobResponse, UnmarshallerContext _ctx) {
		
		listJobResponse.setRequestId(_ctx.stringValue("ListJobResponse.RequestId"));
		listJobResponse.setPageIndex(_ctx.integerValue("ListJobResponse.PageIndex"));
		listJobResponse.setPageSize(_ctx.integerValue("ListJobResponse.PageSize"));
		listJobResponse.setTotalPage(_ctx.integerValue("ListJobResponse.TotalPage"));
		listJobResponse.setTotalCount(_ctx.longValue("ListJobResponse.TotalCount"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListJobResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobName(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].JobName"));
			job.setProjectName(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].ProjectName"));
			job.setJobType(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].JobType"));
			job.setApiType(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].ApiType"));
			job.setCode(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].Code"));
			job.setPlanJson(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].PlanJson"));
			job.setProperties(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].Properties"));
			job.setPackages(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].Packages"));
			job.setIsCommitted(_ctx.booleanValue("ListJobResponse.Jobs["+ i +"].IsCommitted"));
			job.setCreator(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].Creator"));
			job.setCreateTime(_ctx.longValue("ListJobResponse.Jobs["+ i +"].CreateTime"));
			job.setModifier(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].Modifier"));
			job.setModifyTime(_ctx.longValue("ListJobResponse.Jobs["+ i +"].ModifyTime"));
			job.setDescription(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].Description"));
			job.setEngineVersion(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].EngineVersion"));
			job.setClusterId(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].ClusterId"));
			job.setQueueName(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].QueueName"));
			job.setFolderId(_ctx.longValue("ListJobResponse.Jobs["+ i +"].FolderId"));
			job.setJobId(_ctx.stringValue("ListJobResponse.Jobs["+ i +"].JobId"));

			jobs.add(job);
		}
		listJobResponse.setJobs(jobs);
	 
	 	return listJobResponse;
	}
}