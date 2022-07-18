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

import com.aliyuncs.cloudesl.model.v20200201.GetEslDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEslDevicesResponseUnmarshaller {

	public static GetEslDevicesResponse unmarshall(GetEslDevicesResponse getEslDevicesResponse, UnmarshallerContext _ctx) {
		
		getEslDevicesResponse.setRequestId(_ctx.stringValue("GetEslDevicesResponse.RequestId"));
		getEslDevicesResponse.setSuccess(_ctx.booleanValue("GetEslDevicesResponse.Success"));
		getEslDevicesResponse.setMessage(_ctx.stringValue("GetEslDevicesResponse.Message"));
		getEslDevicesResponse.setErrorCode(_ctx.stringValue("GetEslDevicesResponse.ErrorCode"));
		getEslDevicesResponse.setErrorMessage(_ctx.stringValue("GetEslDevicesResponse.ErrorMessage"));
		getEslDevicesResponse.setCode(_ctx.stringValue("GetEslDevicesResponse.Code"));
		getEslDevicesResponse.setDynamicCode(_ctx.stringValue("GetEslDevicesResponse.DynamicCode"));
		getEslDevicesResponse.setDynamicMessage(_ctx.stringValue("GetEslDevicesResponse.DynamicMessage"));
		getEslDevicesResponse.setEslBarCode(_ctx.stringValue("GetEslDevicesResponse.EslBarCode"));
		getEslDevicesResponse.setType(_ctx.stringValue("GetEslDevicesResponse.Type"));
	 
	 	return getEslDevicesResponse;
	}
}