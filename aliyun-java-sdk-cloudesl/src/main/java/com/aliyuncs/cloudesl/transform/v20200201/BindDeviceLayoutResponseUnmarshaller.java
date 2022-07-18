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

import com.aliyuncs.cloudesl.model.v20200201.BindDeviceLayoutResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindDeviceLayoutResponseUnmarshaller {

	public static BindDeviceLayoutResponse unmarshall(BindDeviceLayoutResponse bindDeviceLayoutResponse, UnmarshallerContext _ctx) {
		
		bindDeviceLayoutResponse.setRequestId(_ctx.stringValue("BindDeviceLayoutResponse.RequestId"));
		bindDeviceLayoutResponse.setSuccess(_ctx.booleanValue("BindDeviceLayoutResponse.Success"));
		bindDeviceLayoutResponse.setMessage(_ctx.stringValue("BindDeviceLayoutResponse.Message"));
		bindDeviceLayoutResponse.setErrorCode(_ctx.stringValue("BindDeviceLayoutResponse.ErrorCode"));
		bindDeviceLayoutResponse.setErrorMessage(_ctx.stringValue("BindDeviceLayoutResponse.ErrorMessage"));
		bindDeviceLayoutResponse.setCode(_ctx.stringValue("BindDeviceLayoutResponse.Code"));
		bindDeviceLayoutResponse.setDynamicCode(_ctx.stringValue("BindDeviceLayoutResponse.DynamicCode"));
		bindDeviceLayoutResponse.setDynamicMessage(_ctx.stringValue("BindDeviceLayoutResponse.DynamicMessage"));
	 
	 	return bindDeviceLayoutResponse;
	}
}