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

import com.aliyuncs.devops.model.v20210625.CreatePipelineGroupResponse;
import com.aliyuncs.devops.model.v20210625.CreatePipelineGroupResponse.PipelineGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePipelineGroupResponseUnmarshaller {

	public static CreatePipelineGroupResponse unmarshall(CreatePipelineGroupResponse createPipelineGroupResponse, UnmarshallerContext _ctx) {
		
		createPipelineGroupResponse.setRequestId(_ctx.stringValue("CreatePipelineGroupResponse.requestId"));
		createPipelineGroupResponse.setErrorMessage(_ctx.stringValue("CreatePipelineGroupResponse.errorMessage"));
		createPipelineGroupResponse.setSuccess(_ctx.booleanValue("CreatePipelineGroupResponse.success"));
		createPipelineGroupResponse.setErrorCode(_ctx.stringValue("CreatePipelineGroupResponse.errorCode"));

		PipelineGroup pipelineGroup = new PipelineGroup();
		pipelineGroup.setId(_ctx.longValue("CreatePipelineGroupResponse.pipelineGroup.id"));
		pipelineGroup.setName(_ctx.stringValue("CreatePipelineGroupResponse.pipelineGroup.name"));
		createPipelineGroupResponse.setPipelineGroup(pipelineGroup);
	 
	 	return createPipelineGroupResponse;
	}
}