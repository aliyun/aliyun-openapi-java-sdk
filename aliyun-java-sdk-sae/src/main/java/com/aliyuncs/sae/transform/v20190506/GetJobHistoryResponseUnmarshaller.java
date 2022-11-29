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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.GetJobHistoryResponse;
import com.aliyuncs.sae.model.v20190506.GetJobHistoryResponse.Data;
import com.aliyuncs.sae.model.v20190506.GetJobHistoryResponse.Data.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobHistoryResponseUnmarshaller {

	public static GetJobHistoryResponse unmarshall(GetJobHistoryResponse getJobHistoryResponse, UnmarshallerContext _ctx) {
		
		getJobHistoryResponse.setRequestId(_ctx.stringValue("GetJobHistoryResponse.RequestId"));
		getJobHistoryResponse.setMessage(_ctx.stringValue("GetJobHistoryResponse.Message"));
		getJobHistoryResponse.setTraceId(_ctx.stringValue("GetJobHistoryResponse.TraceId"));
		getJobHistoryResponse.setErrorCode(_ctx.stringValue("GetJobHistoryResponse.ErrorCode"));
		getJobHistoryResponse.setCode(_ctx.stringValue("GetJobHistoryResponse.Code"));
		getJobHistoryResponse.setSuccess(_ctx.booleanValue("GetJobHistoryResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("GetJobHistoryResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.longValue("GetJobHistoryResponse.Data.TotalSize"));
		data.setPageSize(_ctx.longValue("GetJobHistoryResponse.Data.PageSize"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("GetJobHistoryResponse.Data.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("GetJobHistoryResponse.Data.Jobs["+ i +"].JobId"));
			job.setActive(_ctx.longValue("GetJobHistoryResponse.Data.Jobs["+ i +"].Active"));
			job.setSucceeded(_ctx.longValue("GetJobHistoryResponse.Data.Jobs["+ i +"].Succeeded"));
			job.setFailed(_ctx.longValue("GetJobHistoryResponse.Data.Jobs["+ i +"].Failed"));
			job.setStartTime(_ctx.longValue("GetJobHistoryResponse.Data.Jobs["+ i +"].StartTime"));
			job.setCompletionTime(_ctx.longValue("GetJobHistoryResponse.Data.Jobs["+ i +"].CompletionTime"));
			job.setMessage(_ctx.stringValue("GetJobHistoryResponse.Data.Jobs["+ i +"].Message"));

			jobs.add(job);
		}
		data.setJobs(jobs);
		getJobHistoryResponse.setData(data);
	 
	 	return getJobHistoryResponse;
	}
}