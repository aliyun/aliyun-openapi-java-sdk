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

import com.aliyuncs.devops.model.v20210625.DeletePipelineResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeletePipelineResponseUnmarshaller {

	public static DeletePipelineResponse unmarshall(DeletePipelineResponse deletePipelineResponse, UnmarshallerContext _ctx) {
		
		deletePipelineResponse.setRequestId(_ctx.stringValue("DeletePipelineResponse.requestId"));
		deletePipelineResponse.setErrorMessage(_ctx.stringValue("DeletePipelineResponse.errorMessage"));
		deletePipelineResponse.setErrorCode(_ctx.stringValue("DeletePipelineResponse.errorCode"));
		deletePipelineResponse.setSuccess(_ctx.booleanValue("DeletePipelineResponse.success"));
	 
	 	return deletePipelineResponse;
	}
}