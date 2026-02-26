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

package com.aliyuncs.wyota.transform.v20210420;

import com.aliyuncs.wyota.model.v20210420.DeleteDevicesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDevicesResponseUnmarshaller {

	public static DeleteDevicesResponse unmarshall(DeleteDevicesResponse deleteDevicesResponse, UnmarshallerContext _ctx) {
		
		deleteDevicesResponse.setRequestId(_ctx.stringValue("DeleteDevicesResponse.RequestId"));
		deleteDevicesResponse.setMessage(_ctx.stringValue("DeleteDevicesResponse.Message"));
		deleteDevicesResponse.setCode(_ctx.stringValue("DeleteDevicesResponse.Code"));
	 
	 	return deleteDevicesResponse;
	}
}