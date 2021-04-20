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

import com.aliyuncs.vcs.model.v20200515.DeleteIPCDeviceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteIPCDeviceResponseUnmarshaller {

	public static DeleteIPCDeviceResponse unmarshall(DeleteIPCDeviceResponse deleteIPCDeviceResponse, UnmarshallerContext _ctx) {
		
		deleteIPCDeviceResponse.setRequestId(_ctx.stringValue("DeleteIPCDeviceResponse.RequestId"));
		deleteIPCDeviceResponse.setMessage(_ctx.stringValue("DeleteIPCDeviceResponse.Message"));
		deleteIPCDeviceResponse.setData(_ctx.stringValue("DeleteIPCDeviceResponse.Data"));
		deleteIPCDeviceResponse.setCode(_ctx.stringValue("DeleteIPCDeviceResponse.Code"));
	 
	 	return deleteIPCDeviceResponse;
	}
}