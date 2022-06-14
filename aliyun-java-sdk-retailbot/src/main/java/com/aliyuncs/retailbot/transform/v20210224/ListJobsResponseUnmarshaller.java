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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.ListJobsResponse;
import com.aliyuncs.retailbot.model.v20210224.ListJobsResponse.Data;
import com.aliyuncs.retailbot.model.v20210224.ListJobsResponse.Data.JobListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListJobsResponseUnmarshaller {

	public static ListJobsResponse unmarshall(ListJobsResponse listJobsResponse, UnmarshallerContext _ctx) {
		
		listJobsResponse.setRequestId(_ctx.stringValue("ListJobsResponse.RequestId"));
		listJobsResponse.setSuccess(_ctx.booleanValue("ListJobsResponse.Success"));
		listJobsResponse.setCode(_ctx.stringValue("ListJobsResponse.Code"));
		listJobsResponse.setMessage(_ctx.stringValue("ListJobsResponse.Message"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListJobsResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListJobsResponse.Data.PageSize"));
		data.setTotalSize(_ctx.longValue("ListJobsResponse.Data.TotalSize"));
		data.setTotalPage(_ctx.integerValue("ListJobsResponse.Data.TotalPage"));

		List<JobListItem> jobList = new ArrayList<JobListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListJobsResponse.Data.JobList.Length"); i++) {
			JobListItem jobListItem = new JobListItem();
			jobListItem.setJobId(_ctx.stringValue("ListJobsResponse.Data.JobList["+ i +"].JobId"));
			jobListItem.setGmtCreate(_ctx.longValue("ListJobsResponse.Data.JobList["+ i +"].GmtCreate"));
			jobListItem.setGmtModified(_ctx.longValue("ListJobsResponse.Data.JobList["+ i +"].GmtModified"));
			jobListItem.setInstanceId(_ctx.stringValue("ListJobsResponse.Data.JobList["+ i +"].InstanceId"));
			jobListItem.setShopId(_ctx.stringValue("ListJobsResponse.Data.JobList["+ i +"].ShopId"));
			jobListItem.setAppCode(_ctx.stringValue("ListJobsResponse.Data.JobList["+ i +"].AppCode"));
			jobListItem.setAppVersion(_ctx.stringValue("ListJobsResponse.Data.JobList["+ i +"].AppVersion"));
			jobListItem.setJobName(_ctx.stringValue("ListJobsResponse.Data.JobList["+ i +"].JobName"));
			jobListItem.setStatus(_ctx.integerValue("ListJobsResponse.Data.JobList["+ i +"].Status"));
			jobListItem.setStartTime(_ctx.longValue("ListJobsResponse.Data.JobList["+ i +"].StartTime"));
			jobListItem.setEndTime(_ctx.longValue("ListJobsResponse.Data.JobList["+ i +"].EndTime"));
			jobListItem.setConfig(_ctx.stringValue("ListJobsResponse.Data.JobList["+ i +"].Config"));

			jobList.add(jobListItem);
		}
		data.setJobList(jobList);
		listJobsResponse.setData(data);
	 
	 	return listJobsResponse;
	}
}