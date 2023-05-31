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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.ListJobsResponse;
import com.aliyuncs.openitag.model.v20220616.ListJobsResponse.JobsItem;
import com.aliyuncs.openitag.model.v20220616.ListJobsResponse.JobsItem.Creator;
import com.aliyuncs.openitag.model.v20220616.ListJobsResponse.JobsItem.JobResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setCode(_ctx.integerValue("ListJobsResponse.Code"));
		listJobsResponse.setMessage(_ctx.stringValue("ListJobsResponse.Message"));
		listJobsResponse.setDetails(_ctx.stringValue("ListJobsResponse.Details"));
		listJobsResponse.setSuccess(_ctx.booleanValue("ListJobsResponse.Success"));
		listJobsResponse.setPageNumber(_ctx.integerValue("ListJobsResponse.PageNumber"));
		listJobsResponse.setPageSize(_ctx.integerValue("ListJobsResponse.PageSize"));
		listJobsResponse.setTotalPage(_ctx.integerValue("ListJobsResponse.TotalPage"));
		listJobsResponse.setTotalCount(_ctx.integerValue("ListJobsResponse.TotalCount"));
		listJobsResponse.setErrorCode(_ctx.stringValue("ListJobsResponse.ErrorCode"));

		List<JobsItem> jobs = new ArrayList<JobsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Jobs.Length"); i++) {
			JobsItem jobsItem = new JobsItem();
			jobsItem.setStatus(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Status"));
			jobsItem.setJobType(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].JobType"));
			jobsItem.setGmtCreateTime(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].GmtCreateTime"));
			jobsItem.setGmtModifiedTime(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].GmtModifiedTime"));
			jobsItem.setJobId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].JobId"));

			JobResult jobResult = new JobResult();
			jobResult.setResultLink(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].JobResult.ResultLink"));
			jobsItem.setJobResult(jobResult);

			Creator creator = new Creator();
			creator.setUserId(_ctx.longValue("ListJobsResponse.Jobs["+ i +"].Creator.UserId"));
			creator.setAccountType(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Creator.AccountType"));
			creator.setAccountNo(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Creator.AccountNo"));
			creator.setUserName(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Creator.UserName"));
			creator.setRole(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Creator.Role"));
			jobsItem.setCreator(creator);

			jobs.add(jobsItem);
		}
		listJobsResponse.setJobs(jobs);
	 
	 	return listJobsResponse;
	}
}