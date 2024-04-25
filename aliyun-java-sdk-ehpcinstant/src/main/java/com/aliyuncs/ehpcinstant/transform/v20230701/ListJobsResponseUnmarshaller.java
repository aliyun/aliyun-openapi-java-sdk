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

package com.aliyuncs.ehpcinstant.transform.v20230701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpcinstant.model.v20230701.ListJobsResponse;
import com.aliyuncs.ehpcinstant.model.v20230701.ListJobsResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setTotalCount(_ctx.integerValue("ListJobsResponse.TotalCount"));
		listJobsResponse.setPageSize(_ctx.integerValue("ListJobsResponse.PageSize"));
		listJobsResponse.setPageNumber(_ctx.integerValue("ListJobsResponse.PageNumber"));

		List<Job> jobList = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.JobList.Length"); i++) {
			Job job = new Job();
			job.setJobName(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].JobName"));
			job.setJobId(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].JobId"));
			job.setJobDescription(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].JobDescription"));
			job.setCreateTime(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].CreateTime"));
			job.setOwnerUid(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].OwnerUid"));
			job.setStatus(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].Status"));
			job.setTaskCount(_ctx.integerValue("ListJobsResponse.JobList["+ i +"].TaskCount"));
			job.setExecutorCount(_ctx.integerValue("ListJobsResponse.JobList["+ i +"].ExecutorCount"));
			job.setStartTime(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].StartTime"));
			job.setEndTime(_ctx.stringValue("ListJobsResponse.JobList["+ i +"].EndTime"));
			job.setTaskSustainable(_ctx.booleanValue("ListJobsResponse.JobList["+ i +"].TaskSustainable"));

			jobList.add(job);
		}
		listJobsResponse.setJobList(jobList);
	 
	 	return listJobsResponse;
	}
}