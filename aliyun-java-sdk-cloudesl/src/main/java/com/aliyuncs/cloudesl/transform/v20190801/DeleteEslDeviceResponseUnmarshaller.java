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

import com.aliyuncs.cloudesl.model.v20190801.DeleteEslDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteEslDeviceResponseUnmarshaller {

	public static DeleteEslDeviceResponse unmarshall(DeleteEslDeviceResponse deleteEslDeviceResponse, UnmarshallerContext _ctx) {
		
		deleteEslDeviceResponse.setRequestId(_ctx.stringValue("DeleteEslDeviceResponse.RequestId"));
		deleteEslDeviceResponse.setErrorMessage(_ctx.stringValue("DeleteEslDeviceResponse.ErrorMessage"));
		deleteEslDeviceResponse.setErrorCode(_ctx.stringValue("DeleteEslDeviceResponse.ErrorCode"));
		deleteEslDeviceResponse.setMessage(_ctx.stringValue("DeleteEslDeviceResponse.Message"));
		deleteEslDeviceResponse.setDynamicCode(_ctx.stringValue("DeleteEslDeviceResponse.DynamicCode"));
		deleteEslDeviceResponse.setCode(_ctx.stringValue("DeleteEslDeviceResponse.Code"));
		deleteEslDeviceResponse.setDynamicMessage(_ctx.stringValue("DeleteEslDeviceResponse.DynamicMessage"));
		deleteEslDeviceResponse.setSuccess(_ctx.booleanValue("DeleteEslDeviceResponse.Success"));
	 
	 	return deleteEslDeviceResponse;
	}
}