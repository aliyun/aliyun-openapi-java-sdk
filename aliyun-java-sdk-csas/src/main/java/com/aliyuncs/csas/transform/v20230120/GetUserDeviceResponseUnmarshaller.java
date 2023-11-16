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

import com.aliyuncs.csas.model.v20230120.GetUserDeviceResponse;
import com.aliyuncs.csas.model.v20230120.GetUserDeviceResponse.Device;
import com.aliyuncs.csas.model.v20230120.GetUserDeviceResponse.Device.HistoryUsersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserDeviceResponseUnmarshaller {

	public static GetUserDeviceResponse unmarshall(GetUserDeviceResponse getUserDeviceResponse, UnmarshallerContext _ctx) {
		
		getUserDeviceResponse.setRequestId(_ctx.stringValue("GetUserDeviceResponse.RequestId"));

		Device device = new Device();
		device.setDeviceTag(_ctx.stringValue("GetUserDeviceResponse.Device.DeviceTag"));
		device.setDeviceType(_ctx.stringValue("GetUserDeviceResponse.Device.DeviceType"));
		device.setDeviceModel(_ctx.stringValue("GetUserDeviceResponse.Device.DeviceModel"));
		device.setDeviceVersion(_ctx.stringValue("GetUserDeviceResponse.Device.DeviceVersion"));
		device.setHostname(_ctx.stringValue("GetUserDeviceResponse.Device.Hostname"));
		device.setUsername(_ctx.stringValue("GetUserDeviceResponse.Device.Username"));
		device.setSaseUserId(_ctx.stringValue("GetUserDeviceResponse.Device.SaseUserId"));
		device.setDepartment(_ctx.stringValue("GetUserDeviceResponse.Device.Department"));
		device.setInnerIP(_ctx.stringValue("GetUserDeviceResponse.Device.InnerIP"));
		device.setSrcIP(_ctx.stringValue("GetUserDeviceResponse.Device.SrcIP"));
		device.setMemory(_ctx.stringValue("GetUserDeviceResponse.Device.Memory"));
		device.setCPU(_ctx.stringValue("GetUserDeviceResponse.Device.CPU"));
		device.setDisk(_ctx.stringValue("GetUserDeviceResponse.Device.Disk"));
		device.setMac(_ctx.stringValue("GetUserDeviceResponse.Device.Mac"));
		device.setAppVersion(_ctx.stringValue("GetUserDeviceResponse.Device.AppVersion"));
		device.setDeviceBelong(_ctx.stringValue("GetUserDeviceResponse.Device.DeviceBelong"));
		device.setSharingStatus(_ctx.booleanValue("GetUserDeviceResponse.Device.SharingStatus"));
		device.setDeviceStatus(_ctx.stringValue("GetUserDeviceResponse.Device.DeviceStatus"));
		device.setAppStatus(_ctx.stringValue("GetUserDeviceResponse.Device.AppStatus"));
		device.setPaStatus(_ctx.stringValue("GetUserDeviceResponse.Device.PaStatus"));
		device.setIaStatus(_ctx.stringValue("GetUserDeviceResponse.Device.IaStatus"));
		device.setDlpStatus(_ctx.stringValue("GetUserDeviceResponse.Device.DlpStatus"));
		device.setNacStatus(_ctx.stringValue("GetUserDeviceResponse.Device.NacStatus"));
		device.setCreateTime(_ctx.stringValue("GetUserDeviceResponse.Device.CreateTime"));
		device.setUpdateTime(_ctx.stringValue("GetUserDeviceResponse.Device.UpdateTime"));

		List<HistoryUsersItem> historyUsers = new ArrayList<HistoryUsersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetUserDeviceResponse.Device.HistoryUsers.Length"); i++) {
			HistoryUsersItem historyUsersItem = new HistoryUsersItem();
			historyUsersItem.setUsername(_ctx.stringValue("GetUserDeviceResponse.Device.HistoryUsers["+ i +"].Username"));
			historyUsersItem.setSaseUserId(_ctx.stringValue("GetUserDeviceResponse.Device.HistoryUsers["+ i +"].SaseUserId"));

			historyUsers.add(historyUsersItem);
		}
		device.setHistoryUsers(historyUsers);
		getUserDeviceResponse.setDevice(device);
	 
	 	return getUserDeviceResponse;
	}
}