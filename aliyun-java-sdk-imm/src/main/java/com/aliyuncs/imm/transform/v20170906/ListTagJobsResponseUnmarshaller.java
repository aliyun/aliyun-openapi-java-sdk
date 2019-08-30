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

import com.aliyuncs.imm.model.v20170906.ListTagJobsResponse;
import com.aliyuncs.imm.model.v20170906.ListTagJobsResponse.JobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagJobsResponseUnmarshaller {

	public static ListTagJobsResponse unmarshall(ListTagJobsResponse listTagJobsResponse, UnmarshallerContext _ctx) {
		
		listTagJobsResponse.setRequestId(_ctx.stringValue("ListTagJobsResponse.RequestId"));
		listTagJobsResponse.setNextMarker(_ctx.stringValue("ListTagJobsResponse.NextMarker"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTagJobsResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setJobId(_ctx.stringValue("ListTagJobsResponse.Jobs["+ i +"].JobId"));
			jobsItem.setSetId(_ctx.stringValue("ListTagJobsResponse.Jobs["+ i +"].SetId"));
			jobsItem.setSrcUri(_ctx.stringValue("ListTagJobsResponse.Jobs["+ i +"].SrcUri"));
			jobsItem.setStatus(_ctx.stringValue("ListTagJobsResponse.Jobs["+ i +"].Status"));
			jobsItem.setPercent(_ctx.integerValue("ListTagJobsResponse.Jobs["+ i +"].Percent"));
			jobsItem.setCreateTime(_ctx.stringValue("ListTagJobsResponse.Jobs["+ i +"].CreateTime"));
			jobsItem.setFinishTime(_ctx.stringValue("ListTagJobsResponse.Jobs["+ i +"].FinishTime"));

			jobs.add(jobsItem);
		}
		listTagJobsResponse.setJobs(jobs);
	 
	 	return listTagJobsResponse;
	}
}