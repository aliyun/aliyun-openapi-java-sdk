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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.DeleteDevicePropResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDevicePropResponseUnmarshaller {

	public static DeleteDevicePropResponse unmarshall(DeleteDevicePropResponse deleteDevicePropResponse, UnmarshallerContext _ctx) {
		
		deleteDevicePropResponse.setRequestId(_ctx.stringValue("DeleteDevicePropResponse.RequestId"));
		deleteDevicePropResponse.setSuccess(_ctx.booleanValue("DeleteDevicePropResponse.Success"));
		deleteDevicePropResponse.setCode(_ctx.stringValue("DeleteDevicePropResponse.Code"));
		deleteDevicePropResponse.setErrorMessage(_ctx.stringValue("DeleteDevicePropResponse.ErrorMessage"));
	 
	 	return deleteDevicePropResponse;
	}
}