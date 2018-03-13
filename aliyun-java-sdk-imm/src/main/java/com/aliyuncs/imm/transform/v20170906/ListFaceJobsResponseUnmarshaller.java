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

import com.aliyuncs.imm.model.v20170906.ListFaceJobsResponse;
import com.aliyuncs.imm.model.v20170906.ListFaceJobsResponse.JobsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceJobsResponseUnmarshaller {

	public static ListFaceJobsResponse unmarshall(ListFaceJobsResponse listFaceJobsResponse, UnmarshallerContext context) {
		
		listFaceJobsResponse.setRequestId(context.stringValue("ListFaceJobsResponse.RequestId"));
		listFaceJobsResponse.setNextMarker(context.stringValue("ListFaceJobsResponse.NextMarker"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < context.lengthValue("ListFaceJobsResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setJobId(context.stringValue("ListFaceJobsResponse.Jobs["+ i +"].JobId"));
			jobsItem.setSetId(context.stringValue("ListFaceJobsResponse.Jobs["+ i +"].SetId"));
			jobsItem.setSrcUri(context.stringValue("ListFaceJobsResponse.Jobs["+ i +"].SrcUri"));
			jobsItem.setStatus(context.stringValue("ListFaceJobsResponse.Jobs["+ i +"].Status"));
			jobsItem.setPercent(context.integerValue("ListFaceJobsResponse.Jobs["+ i +"].Percent"));
			jobsItem.setCreateTime(context.stringValue("ListFaceJobsResponse.Jobs["+ i +"].CreateTime"));
			jobsItem.setFinishTime(context.stringValue("ListFaceJobsResponse.Jobs["+ i +"].FinishTime"));

			jobs.add(jobsItem);
		}
		listFaceJobsResponse.setJobs(jobs);
	 
	 	return listFaceJobsResponse;
	}
}