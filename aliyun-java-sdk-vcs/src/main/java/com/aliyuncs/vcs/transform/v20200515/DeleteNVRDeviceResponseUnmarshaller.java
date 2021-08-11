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

package com.aliyuncs.vcs.transform.v20200515;

import com.aliyuncs.vcs.model.v20200515.DeleteNVRDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNVRDeviceResponseUnmarshaller {

	public static DeleteNVRDeviceResponse unmarshall(DeleteNVRDeviceResponse deleteNVRDeviceResponse, UnmarshallerContext _ctx) {
		
		deleteNVRDeviceResponse.setRequestId(_ctx.stringValue("DeleteNVRDeviceResponse.RequestId"));
		deleteNVRDeviceResponse.setCode(_ctx.stringValue("DeleteNVRDeviceResponse.Code"));
		deleteNVRDeviceResponse.setMessage(_ctx.stringValue("DeleteNVRDeviceResponse.Message"));
		deleteNVRDeviceResponse.setData(_ctx.stringValue("DeleteNVRDeviceResponse.Data"));
	 
	 	return deleteNVRDeviceResponse;
	}
}