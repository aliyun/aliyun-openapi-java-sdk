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

package com.aliyuncs.devops_rdc.transform.v20200303;

import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineStepLogResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetPipelineStepLogResponse.Object;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPipelineStepLogResponseUnmarshaller {

	public static GetPipelineStepLogResponse unmarshall(GetPipelineStepLogResponse getPipelineStepLogResponse, UnmarshallerContext _ctx) {
		
		getPipelineStepLogResponse.setRequestId(_ctx.stringValue("GetPipelineStepLogResponse.RequestId"));
		getPipelineStepLogResponse.setSuccess(_ctx.booleanValue("GetPipelineStepLogResponse.Success"));
		getPipelineStepLogResponse.setErrorCode(_ctx.stringValue("GetPipelineStepLogResponse.ErrorCode"));
		getPipelineStepLogResponse.setErrorMessage(_ctx.stringValue("GetPipelineStepLogResponse.ErrorMessage"));

		Object object = new Object();
		object.setLast(_ctx.integerValue("GetPipelineStepLogResponse.Object.Last"));
		object.setMore(_ctx.booleanValue("GetPipelineStepLogResponse.Object.More"));
		object.setLogs(_ctx.stringValue("GetPipelineStepLogResponse.Object.Logs"));
		getPipelineStepLogResponse.setObject(object);
	 
	 	return getPipelineStepLogResponse;
	}
}