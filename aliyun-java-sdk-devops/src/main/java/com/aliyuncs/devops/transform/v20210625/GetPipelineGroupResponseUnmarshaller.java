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

import com.aliyuncs.devops.model.v20210625.GetPipelineGroupResponse;
import com.aliyuncs.devops.model.v20210625.GetPipelineGroupResponse.PipelineGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineGroupResponseUnmarshaller {

	public static GetPipelineGroupResponse unmarshall(GetPipelineGroupResponse getPipelineGroupResponse, UnmarshallerContext _ctx) {
		
		getPipelineGroupResponse.setRequestId(_ctx.stringValue("GetPipelineGroupResponse.requestId"));
		getPipelineGroupResponse.setErrorMessage(_ctx.stringValue("GetPipelineGroupResponse.errorMessage"));
		getPipelineGroupResponse.setSuccess(_ctx.booleanValue("GetPipelineGroupResponse.success"));
		getPipelineGroupResponse.setErrorCode(_ctx.stringValue("GetPipelineGroupResponse.errorCode"));

		PipelineGroup pipelineGroup = new PipelineGroup();
		pipelineGroup.setCreateTime(_ctx.longValue("GetPipelineGroupResponse.pipelineGroup.createTime"));
		pipelineGroup.setId(_ctx.longValue("GetPipelineGroupResponse.pipelineGroup.id"));
		pipelineGroup.setName(_ctx.stringValue("GetPipelineGroupResponse.pipelineGroup.name"));
		getPipelineGroupResponse.setPipelineGroup(pipelineGroup);
	 
	 	return getPipelineGroupResponse;
	}
}