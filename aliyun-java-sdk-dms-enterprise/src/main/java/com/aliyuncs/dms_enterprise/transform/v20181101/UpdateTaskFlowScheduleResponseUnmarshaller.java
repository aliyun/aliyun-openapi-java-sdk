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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.UpdateTaskFlowScheduleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskFlowScheduleResponseUnmarshaller {

	public static UpdateTaskFlowScheduleResponse unmarshall(UpdateTaskFlowScheduleResponse updateTaskFlowScheduleResponse, UnmarshallerContext _ctx) {
		
		updateTaskFlowScheduleResponse.setRequestId(_ctx.stringValue("UpdateTaskFlowScheduleResponse.RequestId"));
		updateTaskFlowScheduleResponse.setErrorCode(_ctx.stringValue("UpdateTaskFlowScheduleResponse.ErrorCode"));
		updateTaskFlowScheduleResponse.setErrorMessage(_ctx.stringValue("UpdateTaskFlowScheduleResponse.ErrorMessage"));
		updateTaskFlowScheduleResponse.setSuccess(_ctx.booleanValue("UpdateTaskFlowScheduleResponse.Success"));
	 
	 	return updateTaskFlowScheduleResponse;
	}
}