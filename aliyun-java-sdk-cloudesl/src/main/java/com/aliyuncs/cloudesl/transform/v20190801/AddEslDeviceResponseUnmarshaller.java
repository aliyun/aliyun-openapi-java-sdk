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

package com.aliyuncs.cloudesl.transform.v20190801;

import com.aliyuncs.cloudesl.model.v20190801.AddEslDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddEslDeviceResponseUnmarshaller {

	public static AddEslDeviceResponse unmarshall(AddEslDeviceResponse addEslDeviceResponse, UnmarshallerContext _ctx) {
		
		addEslDeviceResponse.setRequestId(_ctx.stringValue("AddEslDeviceResponse.RequestId"));
		addEslDeviceResponse.setErrorMessage(_ctx.stringValue("AddEslDeviceResponse.ErrorMessage"));
		addEslDeviceResponse.setErrorCode(_ctx.stringValue("AddEslDeviceResponse.ErrorCode"));
		addEslDeviceResponse.setMessage(_ctx.stringValue("AddEslDeviceResponse.Message"));
		addEslDeviceResponse.setDynamicCode(_ctx.stringValue("AddEslDeviceResponse.DynamicCode"));
		addEslDeviceResponse.setCode(_ctx.stringValue("AddEslDeviceResponse.Code"));
		addEslDeviceResponse.setDynamicMessage(_ctx.stringValue("AddEslDeviceResponse.DynamicMessage"));
		addEslDeviceResponse.setSuccess(_ctx.booleanValue("AddEslDeviceResponse.Success"));
	 
	 	return addEslDeviceResponse;
	}
}