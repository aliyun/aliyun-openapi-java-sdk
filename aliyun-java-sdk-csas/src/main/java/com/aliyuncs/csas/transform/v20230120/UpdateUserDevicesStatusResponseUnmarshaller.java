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

import com.aliyuncs.csas.model.v20230120.UpdateUserDevicesStatusResponse;
import com.aliyuncs.csas.model.v20230120.UpdateUserDevicesStatusResponse.Data;
import com.aliyuncs.csas.model.v20230120.UpdateUserDevicesStatusResponse.Data.NetInterfaceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateUserDevicesStatusResponseUnmarshaller {

	public static UpdateUserDevicesStatusResponse unmarshall(UpdateUserDevicesStatusResponse updateUserDevicesStatusResponse, UnmarshallerContext _ctx) {
		
		updateUserDevicesStatusResponse.setRequestId(_ctx.stringValue("UpdateUserDevicesStatusResponse.RequestId"));

		List<Data> devices = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("UpdateUserDevicesStatusResponse.Devices.Length"); i++) {
			Data data = new Data();
			data.setDeviceTag(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].DeviceTag"));
			data.setDeviceType(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].DeviceType"));
			data.setDeviceModel(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].DeviceModel"));
			data.setDeviceVersion(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].DeviceVersion"));
			data.setHostname(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].Hostname"));
			data.setUsername(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].Username"));
			data.setSaseUserId(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].SaseUserId"));
			data.setDepartment(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].Department"));
			data.setInnerIP(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].InnerIP"));
			data.setSrcIP(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].SrcIP"));
			data.setMemory(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].Memory"));
			data.setCPU(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].CPU"));
			data.setDisk(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].Disk"));
			data.setMac(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].Mac"));
			data.setAppVersion(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].AppVersion"));
			data.setDeviceBelong(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].DeviceBelong"));
			data.setSharingStatus(_ctx.booleanValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].SharingStatus"));
			data.setDeviceStatus(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].DeviceStatus"));
			data.setAppStatus(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].AppStatus"));
			data.setPaStatus(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].PaStatus"));
			data.setIaStatus(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].IaStatus"));
			data.setDlpStatus(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].DlpStatus"));
			data.setNacStatus(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].NacStatus"));
			data.setCreateTime(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].CreateTime"));
			data.setUpdateTime(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].UpdateTime"));

			List<NetInterfaceInfoItem> netInterfaceInfo = new ArrayList<NetInterfaceInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].NetInterfaceInfo.Length"); j++) {
				NetInterfaceInfoItem netInterfaceInfoItem = new NetInterfaceInfoItem();
				netInterfaceInfoItem.setName(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].NetInterfaceInfo["+ j +"].Name"));
				netInterfaceInfoItem.setMac(_ctx.stringValue("UpdateUserDevicesStatusResponse.Devices["+ i +"].NetInterfaceInfo["+ j +"].Mac"));

				netInterfaceInfo.add(netInterfaceInfoItem);
			}
			data.setNetInterfaceInfo(netInterfaceInfo);

			devices.add(data);
		}
		updateUserDevicesStatusResponse.setDevices(devices);
	 
	 	return updateUserDevicesStatusResponse;
	}
}