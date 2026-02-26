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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListDIJobsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIJobsResponse.DIJobPaging;
import com.aliyuncs.dataworks_public.model.v20200518.ListDIJobsResponse.DIJobPaging.DIJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDIJobsResponseUnmarshaller {

	public static ListDIJobsResponse unmarshall(ListDIJobsResponse listDIJobsResponse, UnmarshallerContext _ctx) {
		
		listDIJobsResponse.setRequestId(_ctx.stringValue("ListDIJobsResponse.RequestId"));

		DIJobPaging dIJobPaging = new DIJobPaging();
		dIJobPaging.setTotalCount(_ctx.integerValue("ListDIJobsResponse.DIJobPaging.TotalCount"));
		dIJobPaging.setPageNumber(_ctx.integerValue("ListDIJobsResponse.DIJobPaging.PageNumber"));
		dIJobPaging.setPageSize(_ctx.integerValue("ListDIJobsResponse.DIJobPaging.PageSize"));

		List<DIJob> dIJobs = new ArrayList<DIJob>();
		for (int i = 0; i < _ctx.lengthValue("ListDIJobsResponse.DIJobPaging.DIJobs.Length"); i++) {
			DIJob dIJob = new DIJob();
			dIJob.setDIJobId(_ctx.longValue("ListDIJobsResponse.DIJobPaging.DIJobs["+ i +"].DIJobId"));
			dIJob.setProjectId(_ctx.longValue("ListDIJobsResponse.DIJobPaging.DIJobs["+ i +"].ProjectId"));
			dIJob.setJobName(_ctx.stringValue("ListDIJobsResponse.DIJobPaging.DIJobs["+ i +"].JobName"));
			dIJob.setMigrationType(_ctx.stringValue("ListDIJobsResponse.DIJobPaging.DIJobs["+ i +"].MigrationType"));
			dIJob.setSourceDataSourceType(_ctx.stringValue("ListDIJobsResponse.DIJobPaging.DIJobs["+ i +"].SourceDataSourceType"));
			dIJob.setDestinationDataSourceType(_ctx.stringValue("ListDIJobsResponse.DIJobPaging.DIJobs["+ i +"].DestinationDataSourceType"));
			dIJob.setJobStatus(_ctx.stringValue("ListDIJobsResponse.DIJobPaging.DIJobs["+ i +"].JobStatus"));

			dIJobs.add(dIJob);
		}
		dIJobPaging.setDIJobs(dIJobs);
		listDIJobsResponse.setDIJobPaging(dIJobPaging);
	 
	 	return listDIJobsResponse;
	}
}