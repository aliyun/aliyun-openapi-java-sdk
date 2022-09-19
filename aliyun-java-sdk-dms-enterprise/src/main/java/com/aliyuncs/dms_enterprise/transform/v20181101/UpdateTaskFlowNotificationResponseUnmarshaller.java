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

import com.aliyuncs.dms_enterprise.model.v20181101.UpdateTaskFlowNotificationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskFlowNotificationResponseUnmarshaller {

	public static UpdateTaskFlowNotificationResponse unmarshall(UpdateTaskFlowNotificationResponse updateTaskFlowNotificationResponse, UnmarshallerContext _ctx) {
		
		updateTaskFlowNotificationResponse.setRequestId(_ctx.stringValue("UpdateTaskFlowNotificationResponse.RequestId"));
		updateTaskFlowNotificationResponse.setErrorCode(_ctx.stringValue("UpdateTaskFlowNotificationResponse.ErrorCode"));
		updateTaskFlowNotificationResponse.setErrorMessage(_ctx.stringValue("UpdateTaskFlowNotificationResponse.ErrorMessage"));
		updateTaskFlowNotificationResponse.setSuccess(_ctx.booleanValue("UpdateTaskFlowNotificationResponse.Success"));
	 
	 	return updateTaskFlowNotificationResponse;
	}
}