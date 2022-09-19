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

import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskFlowNotificationResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetTaskFlowNotificationResponse.Notification;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskFlowNotificationResponseUnmarshaller {

	public static GetTaskFlowNotificationResponse unmarshall(GetTaskFlowNotificationResponse getTaskFlowNotificationResponse, UnmarshallerContext _ctx) {
		
		getTaskFlowNotificationResponse.setRequestId(_ctx.stringValue("GetTaskFlowNotificationResponse.RequestId"));
		getTaskFlowNotificationResponse.setErrorCode(_ctx.stringValue("GetTaskFlowNotificationResponse.ErrorCode"));
		getTaskFlowNotificationResponse.setErrorMessage(_ctx.stringValue("GetTaskFlowNotificationResponse.ErrorMessage"));
		getTaskFlowNotificationResponse.setSuccess(_ctx.booleanValue("GetTaskFlowNotificationResponse.Success"));

		Notification notification = new Notification();
		notification.setDagNotificationFail(_ctx.booleanValue("GetTaskFlowNotificationResponse.Notification.DagNotificationFail"));
		notification.setDagNotificationSuccess(_ctx.booleanValue("GetTaskFlowNotificationResponse.Notification.DagNotificationSuccess"));
		notification.setDagNotificationSla(_ctx.booleanValue("GetTaskFlowNotificationResponse.Notification.DagNotificationSla"));
		getTaskFlowNotificationResponse.setNotification(notification);
	 
	 	return getTaskFlowNotificationResponse;
	}
}