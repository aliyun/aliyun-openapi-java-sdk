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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListAsynJobsResponse;
import com.aliyuncs.alb.model.v20200616.ListAsynJobsResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAsynJobsResponseUnmarshaller {

	public static ListAsynJobsResponse unmarshall(ListAsynJobsResponse listAsynJobsResponse, UnmarshallerContext _ctx) {
		
		listAsynJobsResponse.setRequestId(_ctx.stringValue("ListAsynJobsResponse.RequestId"));
		listAsynJobsResponse.setMaxResults(_ctx.longValue("ListAsynJobsResponse.MaxResults"));
		listAsynJobsResponse.setNextToken(_ctx.stringValue("ListAsynJobsResponse.NextToken"));
		listAsynJobsResponse.setTotalCount(_ctx.longValue("ListAsynJobsResponse.TotalCount"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListAsynJobsResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setApiName(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].ApiName"));
			job.setCreateTime(_ctx.longValue("ListAsynJobsResponse.Jobs["+ i +"].CreateTime"));
			job.setErrorCode(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].ErrorCode"));
			job.setErrorMessage(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].ErrorMessage"));
			job.setId(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].Id"));
			job.setModifyTime(_ctx.longValue("ListAsynJobsResponse.Jobs["+ i +"].ModifyTime"));
			job.setOperateType(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].OperateType"));
			job.setResourceId(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].ResourceId"));
			job.setResourceType(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].ResourceType"));
			job.setStatus(_ctx.stringValue("ListAsynJobsResponse.Jobs["+ i +"].Status"));

			jobs.add(job);
		}
		listAsynJobsResponse.setJobs(jobs);
	 
	 	return listAsynJobsResponse;
	}
}