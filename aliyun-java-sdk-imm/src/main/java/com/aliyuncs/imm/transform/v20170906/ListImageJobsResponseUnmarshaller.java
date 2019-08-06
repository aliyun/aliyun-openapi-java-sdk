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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListImageJobsResponse;
import com.aliyuncs.imm.model.v20170906.ListImageJobsResponse.JobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImageJobsResponseUnmarshaller {

	public static ListImageJobsResponse unmarshall(ListImageJobsResponse listImageJobsResponse, UnmarshallerContext _ctx) {
		
		listImageJobsResponse.setRequestId(_ctx.stringValue("ListImageJobsResponse.RequestId"));
		listImageJobsResponse.setNextMarker(_ctx.stringValue("ListImageJobsResponse.NextMarker"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListImageJobsResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setStatus(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].Status"));
			jobsItem.setJobId(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].JobId"));
			jobsItem.setJobType(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].JobType"));
			jobsItem.setParameters(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].Parameters"));
			jobsItem.setResult(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].Result"));
			jobsItem.setStartTime(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].StartTime"));
			jobsItem.setEndTime(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].EndTime"));
			jobsItem.setErrorMessage(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].ErrorMessage"));
			jobsItem.setNotifyEndpoint(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].NotifyEndpoint"));
			jobsItem.setNotifyTopicName(_ctx.stringValue("ListImageJobsResponse.Jobs["+ i +"].NotifyTopicName"));
			jobsItem.setProgress(_ctx.integerValue("ListImageJobsResponse.Jobs["+ i +"].Progress"));

			jobs.add(jobsItem);
		}
		listImageJobsResponse.setJobs(jobs);
	 
	 	return listImageJobsResponse;
	}
}