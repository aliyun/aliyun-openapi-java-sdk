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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.UpdateNotificationConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNotificationConfigResponseUnmarshaller {

	public static UpdateNotificationConfigResponse unmarshall(UpdateNotificationConfigResponse updateNotificationConfigResponse, UnmarshallerContext _ctx) {
		
		updateNotificationConfigResponse.setRequestId(_ctx.stringValue("UpdateNotificationConfigResponse.RequestId"));
		updateNotificationConfigResponse.setErrorMessage(_ctx.stringValue("UpdateNotificationConfigResponse.ErrorMessage"));
		updateNotificationConfigResponse.setSuccess(_ctx.booleanValue("UpdateNotificationConfigResponse.Success"));
		updateNotificationConfigResponse.setErrorCode(_ctx.stringValue("UpdateNotificationConfigResponse.ErrorCode"));
		updateNotificationConfigResponse.setCode(_ctx.stringValue("UpdateNotificationConfigResponse.Code"));
		updateNotificationConfigResponse.setMessage(_ctx.stringValue("UpdateNotificationConfigResponse.Message"));
		updateNotificationConfigResponse.setDynamicMessage(_ctx.stringValue("UpdateNotificationConfigResponse.DynamicMessage"));
		updateNotificationConfigResponse.setDynamicCode(_ctx.stringValue("UpdateNotificationConfigResponse.DynamicCode"));
	 
	 	return updateNotificationConfigResponse;
	}
}