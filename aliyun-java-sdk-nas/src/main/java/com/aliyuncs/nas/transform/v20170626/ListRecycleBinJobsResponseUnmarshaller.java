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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.ListRecycleBinJobsResponse;
import com.aliyuncs.nas.model.v20170626.ListRecycleBinJobsResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRecycleBinJobsResponseUnmarshaller {

	public static ListRecycleBinJobsResponse unmarshall(ListRecycleBinJobsResponse listRecycleBinJobsResponse, UnmarshallerContext _ctx) {
		
		listRecycleBinJobsResponse.setRequestId(_ctx.stringValue("ListRecycleBinJobsResponse.RequestId"));
		listRecycleBinJobsResponse.setTotalCount(_ctx.longValue("ListRecycleBinJobsResponse.TotalCount"));
		listRecycleBinJobsResponse.setPageNumber(_ctx.longValue("ListRecycleBinJobsResponse.PageNumber"));
		listRecycleBinJobsResponse.setPageSize(_ctx.longValue("ListRecycleBinJobsResponse.PageSize"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListRecycleBinJobsResponse.Jobs.Length"); i++) {
			Job job = new Job();
			job.setId(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].Id"));
			job.setType(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].Type"));
			job.setFileId(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].FileId"));
			job.setStatus(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].Status"));
			job.setErrorCode(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].ErrorCode"));
			job.setProgress(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].Progress"));
			job.setCreateTime(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].CreateTime"));
			job.setFileName(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].FileName"));
			job.setErrorMessage(_ctx.stringValue("ListRecycleBinJobsResponse.Jobs["+ i +"].ErrorMessage"));

			jobs.add(job);
		}
		listRecycleBinJobsResponse.setJobs(jobs);
	 
	 	return listRecycleBinJobsResponse;
	}
}