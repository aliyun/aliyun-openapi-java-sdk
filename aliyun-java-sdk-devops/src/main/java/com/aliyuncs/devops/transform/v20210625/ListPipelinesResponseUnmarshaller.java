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

import com.aliyuncs.devops.model.v20210625.ListPipelinesResponse;
import com.aliyuncs.devops.model.v20210625.ListPipelinesResponse.Pipeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelinesResponseUnmarshaller {

	public static ListPipelinesResponse unmarshall(ListPipelinesResponse listPipelinesResponse, UnmarshallerContext _ctx) {
		
		listPipelinesResponse.setRequestId(_ctx.stringValue("ListPipelinesResponse.requestId"));
		listPipelinesResponse.setErrorMessage(_ctx.stringValue("ListPipelinesResponse.errorMessage"));
		listPipelinesResponse.setErrorCode(_ctx.stringValue("ListPipelinesResponse.errorCode"));
		listPipelinesResponse.setSuccess(_ctx.booleanValue("ListPipelinesResponse.success"));
		listPipelinesResponse.setTotalCount(_ctx.longValue("ListPipelinesResponse.totalCount"));
		listPipelinesResponse.setNextToken(_ctx.stringValue("ListPipelinesResponse.nextToken"));

		List<Pipeline> pipelines = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelinesResponse.pipelines.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setPipelineName(_ctx.stringValue("ListPipelinesResponse.pipelines["+ i +"].pipelineName"));
			pipeline.setPipelineId(_ctx.longValue("ListPipelinesResponse.pipelines["+ i +"].pipelineId"));
			pipeline.setCreateTime(_ctx.longValue("ListPipelinesResponse.pipelines["+ i +"].createTime"));
			pipeline.setCreatorAccountId(_ctx.stringValue("ListPipelinesResponse.pipelines["+ i +"].creatorAccountId"));
			pipeline.setGroupId(_ctx.longValue("ListPipelinesResponse.pipelines["+ i +"].groupId"));

			pipelines.add(pipeline);
		}
		listPipelinesResponse.setPipelines(pipelines);
	 
	 	return listPipelinesResponse;
	}
}