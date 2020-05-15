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

import com.aliyuncs.cloudesl.model.v20200201.DeleteApDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteApDeviceResponseUnmarshaller {

	public static DeleteApDeviceResponse unmarshall(DeleteApDeviceResponse deleteApDeviceResponse, UnmarshallerContext _ctx) {
		
		deleteApDeviceResponse.setRequestId(_ctx.stringValue("DeleteApDeviceResponse.RequestId"));
		deleteApDeviceResponse.setErrorMessage(_ctx.stringValue("DeleteApDeviceResponse.ErrorMessage"));
		deleteApDeviceResponse.setErrorCode(_ctx.stringValue("DeleteApDeviceResponse.ErrorCode"));
		deleteApDeviceResponse.setMessage(_ctx.stringValue("DeleteApDeviceResponse.Message"));
		deleteApDeviceResponse.setDynamicCode(_ctx.stringValue("DeleteApDeviceResponse.DynamicCode"));
		deleteApDeviceResponse.setCode(_ctx.stringValue("DeleteApDeviceResponse.Code"));
		deleteApDeviceResponse.setDynamicMessage(_ctx.stringValue("DeleteApDeviceResponse.DynamicMessage"));
		deleteApDeviceResponse.setSuccess(_ctx.booleanValue("DeleteApDeviceResponse.Success"));
	 
	 	return deleteApDeviceResponse;
	}
}