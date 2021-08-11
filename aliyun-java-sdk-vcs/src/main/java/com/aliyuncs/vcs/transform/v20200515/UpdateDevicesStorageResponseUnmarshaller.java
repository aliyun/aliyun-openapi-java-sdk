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

import com.aliyuncs.vcs.model.v20200515.UpdateDevicesStorageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDevicesStorageResponseUnmarshaller {

	public static UpdateDevicesStorageResponse unmarshall(UpdateDevicesStorageResponse updateDevicesStorageResponse, UnmarshallerContext _ctx) {
		
		updateDevicesStorageResponse.setRequestId(_ctx.stringValue("UpdateDevicesStorageResponse.RequestId"));
		updateDevicesStorageResponse.setSuccess(_ctx.booleanValue("UpdateDevicesStorageResponse.Success"));
		updateDevicesStorageResponse.setData(_ctx.booleanValue("UpdateDevicesStorageResponse.Data"));
		updateDevicesStorageResponse.setCode(_ctx.stringValue("UpdateDevicesStorageResponse.Code"));
		updateDevicesStorageResponse.setMessage(_ctx.stringValue("UpdateDevicesStorageResponse.Message"));
	 
	 	return updateDevicesStorageResponse;
	}
}