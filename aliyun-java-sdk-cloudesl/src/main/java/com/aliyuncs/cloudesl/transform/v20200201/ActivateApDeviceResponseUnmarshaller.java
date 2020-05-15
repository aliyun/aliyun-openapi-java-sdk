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

import com.aliyuncs.cloudesl.model.v20200201.ActivateApDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateApDeviceResponseUnmarshaller {

	public static ActivateApDeviceResponse unmarshall(ActivateApDeviceResponse activateApDeviceResponse, UnmarshallerContext _ctx) {
		
		activateApDeviceResponse.setRequestId(_ctx.stringValue("ActivateApDeviceResponse.RequestId"));
		activateApDeviceResponse.setErrorMessage(_ctx.stringValue("ActivateApDeviceResponse.ErrorMessage"));
		activateApDeviceResponse.setErrorCode(_ctx.stringValue("ActivateApDeviceResponse.ErrorCode"));
		activateApDeviceResponse.setMessage(_ctx.stringValue("ActivateApDeviceResponse.Message"));
		activateApDeviceResponse.setDynamicCode(_ctx.stringValue("ActivateApDeviceResponse.DynamicCode"));
		activateApDeviceResponse.setCode(_ctx.stringValue("ActivateApDeviceResponse.Code"));
		activateApDeviceResponse.setDynamicMessage(_ctx.stringValue("ActivateApDeviceResponse.DynamicMessage"));
		activateApDeviceResponse.setSuccess(_ctx.booleanValue("ActivateApDeviceResponse.Success"));
	 
	 	return activateApDeviceResponse;
	}
}