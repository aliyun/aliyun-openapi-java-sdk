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

import com.aliyuncs.devops.model.v20210625.ListPipelineRunsResponse;
import com.aliyuncs.devops.model.v20210625.ListPipelineRunsResponse.PipelineRun;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelineRunsResponseUnmarshaller {

	public static ListPipelineRunsResponse unmarshall(ListPipelineRunsResponse listPipelineRunsResponse, UnmarshallerContext _ctx) {
		
		listPipelineRunsResponse.setRequestId(_ctx.stringValue("ListPipelineRunsResponse.requestId"));
		listPipelineRunsResponse.setErrorMessage(_ctx.stringValue("ListPipelineRunsResponse.errorMessage"));
		listPipelineRunsResponse.setErrorCode(_ctx.stringValue("ListPipelineRunsResponse.errorCode"));
		listPipelineRunsResponse.setSuccess(_ctx.booleanValue("ListPipelineRunsResponse.success"));
		listPipelineRunsResponse.setTotalCount(_ctx.longValue("ListPipelineRunsResponse.totalCount"));
		listPipelineRunsResponse.setNextToken(_ctx.stringValue("ListPipelineRunsResponse.nextToken"));

		List<PipelineRun> pipelineRuns = new ArrayList<PipelineRun>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelineRunsResponse.pipelineRuns.Length"); i++) {
			PipelineRun pipelineRun = new PipelineRun();
			pipelineRun.setPipelineId(_ctx.longValue("ListPipelineRunsResponse.pipelineRuns["+ i +"].pipelineId"));
			pipelineRun.setStartTime(_ctx.longValue("ListPipelineRunsResponse.pipelineRuns["+ i +"].startTime"));
			pipelineRun.setCreatorAccountId(_ctx.stringValue("ListPipelineRunsResponse.pipelineRuns["+ i +"].creatorAccountId"));
			pipelineRun.setEndTime(_ctx.longValue("ListPipelineRunsResponse.pipelineRuns["+ i +"].endTime"));
			pipelineRun.setPipelineRunId(_ctx.longValue("ListPipelineRunsResponse.pipelineRuns["+ i +"].pipelineRunId"));
			pipelineRun.setTriggerMode(_ctx.longValue("ListPipelineRunsResponse.pipelineRuns["+ i +"].triggerMode"));
			pipelineRun.setStatus(_ctx.stringValue("ListPipelineRunsResponse.pipelineRuns["+ i +"].status"));

			pipelineRuns.add(pipelineRun);
		}
		listPipelineRunsResponse.setPipelineRuns(pipelineRuns);
	 
	 	return listPipelineRunsResponse;
	}
}