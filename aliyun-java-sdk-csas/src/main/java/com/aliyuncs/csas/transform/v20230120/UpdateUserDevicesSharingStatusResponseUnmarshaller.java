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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.UpdateUserDevicesSharingStatusResponse;
import com.aliyuncs.csas.model.v20230120.UpdateUserDevicesSharingStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserDevicesSharingStatusResponseUnmarshaller {

	public static UpdateUserDevicesSharingStatusResponse unmarshall(UpdateUserDevicesSharingStatusResponse updateUserDevicesSharingStatusResponse, UnmarshallerContext _ctx) {
		
		updateUserDevicesSharingStatusResponse.setRequestId(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.RequestId"));

		List<Data> devices = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("UpdateUserDevicesSharingStatusResponse.Devices.Length"); i++) {
			Data data = new Data();
			data.setDeviceTag(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].DeviceTag"));
			data.setDeviceType(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].DeviceType"));
			data.setDeviceModel(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].DeviceModel"));
			data.setDeviceVersion(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].DeviceVersion"));
			data.setHostname(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].Hostname"));
			data.setUsername(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].Username"));
			data.setSaseUserId(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].SaseUserId"));
			data.setDepartment(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].Department"));
			data.setInnerIP(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].InnerIP"));
			data.setSrcIP(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].SrcIP"));
			data.setMemory(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].Memory"));
			data.setCPU(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].CPU"));
			data.setDisk(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].Disk"));
			data.setMac(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].Mac"));
			data.setAppVersion(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].AppVersion"));
			data.setDeviceBelong(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].DeviceBelong"));
			data.setSharingStatus(_ctx.booleanValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].SharingStatus"));
			data.setDeviceStatus(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].DeviceStatus"));
			data.setAppStatus(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].AppStatus"));
			data.setPaStatus(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].PaStatus"));
			data.setIaStatus(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].IaStatus"));
			data.setDlpStatus(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].DlpStatus"));
			data.setNacStatus(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].NacStatus"));
			data.setCreateTime(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].CreateTime"));
			data.setUpdateTime(_ctx.stringValue("UpdateUserDevicesSharingStatusResponse.Devices["+ i +"].UpdateTime"));

			devices.add(data);
		}
		updateUserDevicesSharingStatusResponse.setDevices(devices);
	 
	 	return updateUserDevicesSharingStatusResponse;
	}
}