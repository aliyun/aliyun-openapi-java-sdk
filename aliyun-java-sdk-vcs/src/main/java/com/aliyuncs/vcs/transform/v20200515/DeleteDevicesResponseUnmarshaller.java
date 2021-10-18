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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DeleteDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.DeleteDevicesResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteDevicesResponseUnmarshaller {

	public static DeleteDevicesResponse unmarshall(DeleteDevicesResponse deleteDevicesResponse, UnmarshallerContext _ctx) {
		
		deleteDevicesResponse.setRequestId(_ctx.stringValue("DeleteDevicesResponse.RequestId"));
		deleteDevicesResponse.setCode(_ctx.stringValue("DeleteDevicesResponse.Code"));
		deleteDevicesResponse.setMessage(_ctx.stringValue("DeleteDevicesResponse.Message"));

		List<DeviceInfo> data = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DeleteDevicesResponse.Data.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setDeviceId(_ctx.stringValue("DeleteDevicesResponse.Data["+ i +"].DeviceId"));
			deviceInfo.setCode(_ctx.stringValue("DeleteDevicesResponse.Data["+ i +"].Code"));
			deviceInfo.setDescription(_ctx.stringValue("DeleteDevicesResponse.Data["+ i +"].Description"));

			data.add(deviceInfo);
		}
		deleteDevicesResponse.setData(data);
	 
	 	return deleteDevicesResponse;
	}
}