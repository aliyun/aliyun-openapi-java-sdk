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

import com.aliyuncs.cloudesl.model.v20190801.AddApDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddApDeviceResponseUnmarshaller {

	public static AddApDeviceResponse unmarshall(AddApDeviceResponse addApDeviceResponse, UnmarshallerContext _ctx) {
		
		addApDeviceResponse.setRequestId(_ctx.stringValue("AddApDeviceResponse.RequestId"));
		addApDeviceResponse.setErrorMessage(_ctx.stringValue("AddApDeviceResponse.ErrorMessage"));
		addApDeviceResponse.setErrorCode(_ctx.stringValue("AddApDeviceResponse.ErrorCode"));
		addApDeviceResponse.setMessage(_ctx.stringValue("AddApDeviceResponse.Message"));
		addApDeviceResponse.setDynamicCode(_ctx.stringValue("AddApDeviceResponse.DynamicCode"));
		addApDeviceResponse.setCode(_ctx.stringValue("AddApDeviceResponse.Code"));
		addApDeviceResponse.setDynamicMessage(_ctx.stringValue("AddApDeviceResponse.DynamicMessage"));
		addApDeviceResponse.setSuccess(_ctx.booleanValue("AddApDeviceResponse.Success"));
	 
	 	return addApDeviceResponse;
	}
}