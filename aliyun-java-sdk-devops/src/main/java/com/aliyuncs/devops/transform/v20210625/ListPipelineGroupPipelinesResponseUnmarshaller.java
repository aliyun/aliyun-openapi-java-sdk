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

import com.aliyuncs.devops.model.v20210625.ListPipelineGroupPipelinesResponse;
import com.aliyuncs.devops.model.v20210625.ListPipelineGroupPipelinesResponse.Pipeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelineGroupPipelinesResponseUnmarshaller {

	public static ListPipelineGroupPipelinesResponse unmarshall(ListPipelineGroupPipelinesResponse listPipelineGroupPipelinesResponse, UnmarshallerContext _ctx) {
		
		listPipelineGroupPipelinesResponse.setRequestId(_ctx.stringValue("ListPipelineGroupPipelinesResponse.requestId"));
		listPipelineGroupPipelinesResponse.setErrorMessage(_ctx.stringValue("ListPipelineGroupPipelinesResponse.errorMessage"));
		listPipelineGroupPipelinesResponse.setSuccess(_ctx.booleanValue("ListPipelineGroupPipelinesResponse.success"));
		listPipelineGroupPipelinesResponse.setErrorCode(_ctx.stringValue("ListPipelineGroupPipelinesResponse.errorCode"));
		listPipelineGroupPipelinesResponse.setTotalCount(_ctx.integerValue("ListPipelineGroupPipelinesResponse.totalCount"));
		listPipelineGroupPipelinesResponse.setNextToken(_ctx.stringValue("ListPipelineGroupPipelinesResponse.nextToken"));

		List<Pipeline> pipelines = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelineGroupPipelinesResponse.pipelines.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setPipelineName(_ctx.stringValue("ListPipelineGroupPipelinesResponse.pipelines["+ i +"].pipelineName"));
			pipeline.setCreateTime(_ctx.longValue("ListPipelineGroupPipelinesResponse.pipelines["+ i +"].createTime"));
			pipeline.setPipelineId(_ctx.longValue("ListPipelineGroupPipelinesResponse.pipelines["+ i +"].pipelineId"));

			pipelines.add(pipeline);
		}
		listPipelineGroupPipelinesResponse.setPipelines(pipelines);
	 
	 	return listPipelineGroupPipelinesResponse;
	}
}