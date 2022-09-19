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

import com.aliyuncs.dms_enterprise.model.v20181101.UpdateTaskFlowCooperatorsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskFlowCooperatorsResponseUnmarshaller {

	public static UpdateTaskFlowCooperatorsResponse unmarshall(UpdateTaskFlowCooperatorsResponse updateTaskFlowCooperatorsResponse, UnmarshallerContext _ctx) {
		
		updateTaskFlowCooperatorsResponse.setRequestId(_ctx.stringValue("UpdateTaskFlowCooperatorsResponse.RequestId"));
		updateTaskFlowCooperatorsResponse.setErrorCode(_ctx.stringValue("UpdateTaskFlowCooperatorsResponse.ErrorCode"));
		updateTaskFlowCooperatorsResponse.setErrorMessage(_ctx.stringValue("UpdateTaskFlowCooperatorsResponse.ErrorMessage"));
		updateTaskFlowCooperatorsResponse.setSuccess(_ctx.booleanValue("UpdateTaskFlowCooperatorsResponse.Success"));
	 
	 	return updateTaskFlowCooperatorsResponse;
	}
}