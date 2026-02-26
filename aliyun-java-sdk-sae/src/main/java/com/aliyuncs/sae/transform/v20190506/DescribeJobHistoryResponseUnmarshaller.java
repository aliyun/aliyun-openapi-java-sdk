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

import com.aliyuncs.sae.model.v20190506.DescribeJobHistoryResponse;
import com.aliyuncs.sae.model.v20190506.DescribeJobHistoryResponse.Data;
import com.aliyuncs.sae.model.v20190506.DescribeJobHistoryResponse.Data.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJobHistoryResponseUnmarshaller {

	public static DescribeJobHistoryResponse unmarshall(DescribeJobHistoryResponse describeJobHistoryResponse, UnmarshallerContext _ctx) {
		
		describeJobHistoryResponse.setRequestId(_ctx.stringValue("DescribeJobHistoryResponse.RequestId"));
		describeJobHistoryResponse.setMessage(_ctx.stringValue("DescribeJobHistoryResponse.Message"));
		describeJobHistoryResponse.setTraceId(_ctx.stringValue("DescribeJobHistoryResponse.TraceId"));
		describeJobHistoryResponse.setErrorCode(_ctx.stringValue("DescribeJobHistoryResponse.ErrorCode"));
		describeJobHistoryResponse.setCode(_ctx.stringValue("DescribeJobHistoryResponse.Code"));
		describeJobHistoryResponse.setSuccess(_ctx.booleanValue("DescribeJobHistoryResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.longValue("DescribeJobHistoryResponse.Data.CurrentPage"));
		data.setTotalSize(_ctx.longValue("DescribeJobHistoryResponse.Data.TotalSize"));
		data.setPageSize(_ctx.longValue("DescribeJobHistoryResponse.Data.PageSize"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("DescribeJobHistoryResponse.Data.Jobs.Length"); i++) {
			Job job = new Job();
			job.setJobId(_ctx.stringValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].JobId"));
			job.setActive(_ctx.longValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].Active"));
			job.setSucceeded(_ctx.longValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].Succeeded"));
			job.setFailed(_ctx.longValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].Failed"));
			job.setStartTime(_ctx.longValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].StartTime"));
			job.setCompletionTime(_ctx.longValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].CompletionTime"));
			job.setMessage(_ctx.stringValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].Message"));
			job.setState(_ctx.stringValue("DescribeJobHistoryResponse.Data.Jobs["+ i +"].State"));

			jobs.add(job);
		}
		data.setJobs(jobs);
		describeJobHistoryResponse.setData(data);
	 
	 	return describeJobHistoryResponse;
	}
}