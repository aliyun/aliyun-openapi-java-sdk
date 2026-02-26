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

import com.aliyuncs.devops.model.v20210625.DeletePipelineGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePipelineGroupResponseUnmarshaller {

	public static DeletePipelineGroupResponse unmarshall(DeletePipelineGroupResponse deletePipelineGroupResponse, UnmarshallerContext _ctx) {
		
		deletePipelineGroupResponse.setRequestId(_ctx.stringValue("DeletePipelineGroupResponse.requestId"));
		deletePipelineGroupResponse.setErrorMessage(_ctx.stringValue("DeletePipelineGroupResponse.errorMessage"));
		deletePipelineGroupResponse.setSuccess(_ctx.booleanValue("DeletePipelineGroupResponse.success"));
		deletePipelineGroupResponse.setErrorCode(_ctx.stringValue("DeletePipelineGroupResponse.errorCode"));
	 
	 	return deletePipelineGroupResponse;
	}
}