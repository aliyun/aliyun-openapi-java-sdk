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

import com.aliyuncs.devops.model.v20210625.UpdatePipelineBaseInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePipelineBaseInfoResponseUnmarshaller {

	public static UpdatePipelineBaseInfoResponse unmarshall(UpdatePipelineBaseInfoResponse updatePipelineBaseInfoResponse, UnmarshallerContext _ctx) {
		
		updatePipelineBaseInfoResponse.setRequestId(_ctx.stringValue("UpdatePipelineBaseInfoResponse.requestId"));
		updatePipelineBaseInfoResponse.setErrorMessage(_ctx.stringValue("UpdatePipelineBaseInfoResponse.errorMessage"));
		updatePipelineBaseInfoResponse.setSuccess(_ctx.booleanValue("UpdatePipelineBaseInfoResponse.success"));
		updatePipelineBaseInfoResponse.setErrorCode(_ctx.stringValue("UpdatePipelineBaseInfoResponse.errorCode"));
	 
	 	return updatePipelineBaseInfoResponse;
	}
}