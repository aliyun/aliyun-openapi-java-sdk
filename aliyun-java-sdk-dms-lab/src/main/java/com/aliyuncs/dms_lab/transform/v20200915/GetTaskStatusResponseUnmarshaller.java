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

package com.aliyuncs.dms_lab.transform.v20200915;

import com.aliyuncs.dms_lab.model.v20200915.GetTaskStatusResponse;
import com.aliyuncs.dms_lab.model.v20200915.GetTaskStatusResponse.LabDbTaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskStatusResponseUnmarshaller {

	public static GetTaskStatusResponse unmarshall(GetTaskStatusResponse getTaskStatusResponse, UnmarshallerContext _ctx) {
		
		getTaskStatusResponse.setRequestId(_ctx.stringValue("GetTaskStatusResponse.RequestId"));
		getTaskStatusResponse.setSuccess(_ctx.booleanValue("GetTaskStatusResponse.Success"));
		getTaskStatusResponse.setErrorMessage(_ctx.stringValue("GetTaskStatusResponse.ErrorMessage"));
		getTaskStatusResponse.setErrorCode(_ctx.stringValue("GetTaskStatusResponse.ErrorCode"));

		LabDbTaskResult labDbTaskResult = new LabDbTaskResult();
		labDbTaskResult.setType(_ctx.stringValue("GetTaskStatusResponse.LabDbTaskResult.Type"));
		labDbTaskResult.setStatus(_ctx.stringValue("GetTaskStatusResponse.LabDbTaskResult.Status"));
		labDbTaskResult.setTotalCount(_ctx.integerValue("GetTaskStatusResponse.LabDbTaskResult.TotalCount"));
		labDbTaskResult.setSuccessCount(_ctx.integerValue("GetTaskStatusResponse.LabDbTaskResult.SuccessCount"));
		labDbTaskResult.setFailureCount(_ctx.integerValue("GetTaskStatusResponse.LabDbTaskResult.FailureCount"));
		getTaskStatusResponse.setLabDbTaskResult(labDbTaskResult);
	 
	 	return getTaskStatusResponse;
	}
}