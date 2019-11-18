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

import com.aliyuncs.cloudesl.model.v20190801.UnbindEslDeviceShelfResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnbindEslDeviceShelfResponseUnmarshaller {

	public static UnbindEslDeviceShelfResponse unmarshall(UnbindEslDeviceShelfResponse unbindEslDeviceShelfResponse, UnmarshallerContext _ctx) {
		
		unbindEslDeviceShelfResponse.setRequestId(_ctx.stringValue("UnbindEslDeviceShelfResponse.RequestId"));
		unbindEslDeviceShelfResponse.setErrorMessage(_ctx.stringValue("UnbindEslDeviceShelfResponse.ErrorMessage"));
		unbindEslDeviceShelfResponse.setErrorCode(_ctx.stringValue("UnbindEslDeviceShelfResponse.ErrorCode"));
		unbindEslDeviceShelfResponse.setMessage(_ctx.stringValue("UnbindEslDeviceShelfResponse.Message"));
		unbindEslDeviceShelfResponse.setDynamicCode(_ctx.stringValue("UnbindEslDeviceShelfResponse.DynamicCode"));
		unbindEslDeviceShelfResponse.setCode(_ctx.stringValue("UnbindEslDeviceShelfResponse.Code"));
		unbindEslDeviceShelfResponse.setDynamicMessage(_ctx.stringValue("UnbindEslDeviceShelfResponse.DynamicMessage"));
		unbindEslDeviceShelfResponse.setSuccess(_ctx.booleanValue("UnbindEslDeviceShelfResponse.Success"));
	 
	 	return unbindEslDeviceShelfResponse;
	}
}