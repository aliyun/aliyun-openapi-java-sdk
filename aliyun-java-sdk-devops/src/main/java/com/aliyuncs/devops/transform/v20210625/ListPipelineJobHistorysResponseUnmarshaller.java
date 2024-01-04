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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListPipelineJobHistorysResponse;
import com.aliyuncs.devops.model.v20210625.ListPipelineJobHistorysResponse.Job;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelineJobHistorysResponseUnmarshaller {

	public static ListPipelineJobHistorysResponse unmarshall(ListPipelineJobHistorysResponse listPipelineJobHistorysResponse, UnmarshallerContext _ctx) {
		
		listPipelineJobHistorysResponse.setRequestId(_ctx.stringValue("ListPipelineJobHistorysResponse.requestId"));
		listPipelineJobHistorysResponse.setErrorMessage(_ctx.stringValue("ListPipelineJobHistorysResponse.errorMessage"));
		listPipelineJobHistorysResponse.setSuccess(_ctx.booleanValue("ListPipelineJobHistorysResponse.success"));
		listPipelineJobHistorysResponse.setErrorCode(_ctx.stringValue("ListPipelineJobHistorysResponse.errorCode"));
		listPipelineJobHistorysResponse.setNextToken(_ctx.stringValue("ListPipelineJobHistorysResponse.nextToken"));
		listPipelineJobHistorysResponse.setTotalCount(_ctx.integerValue("ListPipelineJobHistorysResponse.totalCount"));

		List<Job> jobs = new ArrayList<Job>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelineJobHistorysResponse.jobs.Length"); i++) {
			Job job = new Job();
			job.setJobName(_ctx.stringValue("ListPipelineJobHistorysResponse.jobs["+ i +"].jobName"));
			job.setIdentifier(_ctx.stringValue("ListPipelineJobHistorysResponse.jobs["+ i +"].identifier"));
			job.setPipelineId(_ctx.longValue("ListPipelineJobHistorysResponse.jobs["+ i +"].pipelineId"));
			job.setExecuteNumber(_ctx.integerValue("ListPipelineJobHistorysResponse.jobs["+ i +"].executeNumber"));
			job.setJobId(_ctx.longValue("ListPipelineJobHistorysResponse.jobs["+ i +"].jobId"));
			job.setPipelineRunId(_ctx.longValue("ListPipelineJobHistorysResponse.jobs["+ i +"].pipelineRunId"));
			job.setSources(_ctx.stringValue("ListPipelineJobHistorysResponse.jobs["+ i +"].sources"));
			job.setStatus(_ctx.stringValue("ListPipelineJobHistorysResponse.jobs["+ i +"].status"));
			job.setOperatorAccountId(_ctx.stringValue("ListPipelineJobHistorysResponse.jobs["+ i +"].operatorAccountId"));

			jobs.add(job);
		}
		listPipelineJobHistorysResponse.setJobs(jobs);
	 
	 	return listPipelineJobHistorysResponse;
	}
}