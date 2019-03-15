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

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext context) {
		
		listJobsResponse.setRequestId(context.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setTotalCount(context.integerValue("ListJobsResponse.TotalCount"));
		listJobsResponse.setPageNumber(context.integerValue("ListJobsResponse.PageNumber"));
		listJobsResponse.setPageSize(context.integerValue("ListJobsResponse.PageSize"));

		List<JobInfo> jobs = new ArrayList<JobInfo>();
		for (int i = 0; i < context.lengthValue("ListJobsResponse.Jobs.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setId(context.stringValue("ListJobsResponse.Jobs["+ i +"].Id"));
			jobInfo.setName(context.stringValue("ListJobsResponse.Jobs["+ i +"].Name"));
			jobInfo.setType(context.stringValue("ListJobsResponse.Jobs["+ i +"].Type"));
			jobInfo.setRunParameter(context.stringValue("ListJobsResponse.Jobs["+ i +"].RunParameter"));
			jobInfo.setFailAct(context.stringValue("ListJobsResponse.Jobs["+ i +"].FailAct"));
			jobInfo.setMaxRetry(context.integerValue("ListJobsResponse.Jobs["+ i +"].MaxRetry"));
			jobInfo.setRetryInterval(context.integerValue("ListJobsResponse.Jobs["+ i +"].RetryInterval"));

			jobs.add(jobInfo);
		}
		listJobsResponse.setJobs(jobs);
	 
	 	return listJobsResponse;
	}
}