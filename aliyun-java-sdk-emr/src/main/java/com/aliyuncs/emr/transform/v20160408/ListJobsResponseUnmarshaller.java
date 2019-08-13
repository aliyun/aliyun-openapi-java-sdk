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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListJobsResponse;
import com.aliyuncs.emr.model.v20160408.ListJobsResponse.JobInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setTotalCount(_ctx.integerValue("ListJobsResponse.TotalCount"));
		listJobsResponse.setPageNumber(_ctx.integerValue("ListJobsResponse.PageNumber"));
		listJobsResponse.setPageSize(_ctx.integerValue("ListJobsResponse.PageSize"));

		List<JobInfo> jobs = new ArrayList<JobInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Jobs.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setId(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Id"));
			jobInfo.setName(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Name"));
			jobInfo.setType(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].Type"));
			jobInfo.setRunParameter(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].RunParameter"));
			jobInfo.setFailAct(_ctx.stringValue("ListJobsResponse.Jobs["+ i +"].FailAct"));
			jobInfo.setMaxRetry(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].MaxRetry"));
			jobInfo.setRetryInterval(_ctx.integerValue("ListJobsResponse.Jobs["+ i +"].RetryInterval"));

			jobs.add(jobInfo);
		}
		listJobsResponse.setJobs(jobs);
	 
	 	return listJobsResponse;
	}
}