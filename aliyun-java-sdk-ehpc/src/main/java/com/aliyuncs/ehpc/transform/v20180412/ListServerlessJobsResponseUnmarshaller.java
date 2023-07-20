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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListServerlessJobsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListServerlessJobsResponse.JobInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServerlessJobsResponseUnmarshaller {

	public static ListServerlessJobsResponse unmarshall(ListServerlessJobsResponse listServerlessJobsResponse, UnmarshallerContext _ctx) {
		
		listServerlessJobsResponse.setRequestId(_ctx.stringValue("ListServerlessJobsResponse.RequestId"));
		listServerlessJobsResponse.setTotalCount(_ctx.integerValue("ListServerlessJobsResponse.TotalCount"));
		listServerlessJobsResponse.setPageSize(_ctx.longValue("ListServerlessJobsResponse.PageSize"));
		listServerlessJobsResponse.setPageNumber(_ctx.longValue("ListServerlessJobsResponse.PageNumber"));

		List<JobInfo> jobs = new ArrayList<JobInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListServerlessJobsResponse.Jobs.Length"); i++) {
			JobInfo jobInfo = new JobInfo();
			jobInfo.setJobId(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].JobId"));
			jobInfo.setJobName(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].JobName"));
			jobInfo.setState(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].State"));
			jobInfo.setPriority(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].Priority"));
			jobInfo.setQueue(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].Queue"));
			jobInfo.setUser(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].User"));
			jobInfo.setSubmitTime(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].SubmitTime"));
			jobInfo.setStartTime(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].StartTime"));
			jobInfo.setEndTime(_ctx.stringValue("ListServerlessJobsResponse.Jobs["+ i +"].EndTime"));
			jobInfo.setIsArrayJob(_ctx.booleanValue("ListServerlessJobsResponse.Jobs["+ i +"].IsArrayJob"));

			jobs.add(jobInfo);
		}
		listServerlessJobsResponse.setJobs(jobs);
	 
	 	return listServerlessJobsResponse;
	}
}