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

import com.aliyuncs.cloudesl.model.v20200201.VerifyNotificationConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyNotificationConfigResponseUnmarshaller {

	public static VerifyNotificationConfigResponse unmarshall(VerifyNotificationConfigResponse verifyNotificationConfigResponse, UnmarshallerContext _ctx) {
		
		verifyNotificationConfigResponse.setRequestId(_ctx.stringValue("VerifyNotificationConfigResponse.RequestId"));
		verifyNotificationConfigResponse.setErrorMessage(_ctx.stringValue("VerifyNotificationConfigResponse.ErrorMessage"));
		verifyNotificationConfigResponse.setSuccess(_ctx.booleanValue("VerifyNotificationConfigResponse.Success"));
		verifyNotificationConfigResponse.setErrorCode(_ctx.stringValue("VerifyNotificationConfigResponse.ErrorCode"));
		verifyNotificationConfigResponse.setCode(_ctx.stringValue("VerifyNotificationConfigResponse.Code"));
		verifyNotificationConfigResponse.setMessage(_ctx.stringValue("VerifyNotificationConfigResponse.Message"));
		verifyNotificationConfigResponse.setDynamicMessage(_ctx.stringValue("VerifyNotificationConfigResponse.DynamicMessage"));
		verifyNotificationConfigResponse.setDynamicCode(_ctx.stringValue("VerifyNotificationConfigResponse.DynamicCode"));
		verifyNotificationConfigResponse.setResult(_ctx.booleanValue("VerifyNotificationConfigResponse.Result"));
		verifyNotificationConfigResponse.setSendTime(_ctx.stringValue("VerifyNotificationConfigResponse.SendTime"));
		verifyNotificationConfigResponse.setExceptionMessage(_ctx.stringValue("VerifyNotificationConfigResponse.ExceptionMessage"));
	 
	 	return verifyNotificationConfigResponse;
	}
}