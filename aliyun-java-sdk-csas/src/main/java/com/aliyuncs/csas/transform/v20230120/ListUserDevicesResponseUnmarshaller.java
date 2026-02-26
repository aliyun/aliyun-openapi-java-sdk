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

import com.aliyuncs.csas.model.v20230120.ListUserDevicesResponse;
import com.aliyuncs.csas.model.v20230120.ListUserDevicesResponse.DataList;
import com.aliyuncs.csas.model.v20230120.ListUserDevicesResponse.DataList.NetInterfaceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserDevicesResponseUnmarshaller {

	public static ListUserDevicesResponse unmarshall(ListUserDevicesResponse listUserDevicesResponse, UnmarshallerContext _ctx) {
		
		listUserDevicesResponse.setRequestId(_ctx.stringValue("ListUserDevicesResponse.RequestId"));
		listUserDevicesResponse.setTotalNum(_ctx.longValue("ListUserDevicesResponse.TotalNum"));

		List<DataList> devices = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListUserDevicesResponse.Devices.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setDeviceTag(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].DeviceTag"));
			dataList.setDeviceType(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].DeviceType"));
			dataList.setDeviceModel(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].DeviceModel"));
			dataList.setDeviceVersion(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].DeviceVersion"));
			dataList.setHostname(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].Hostname"));
			dataList.setUsername(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].Username"));
			dataList.setSaseUserId(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].SaseUserId"));
			dataList.setDepartment(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].Department"));
			dataList.setInnerIP(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].InnerIP"));
			dataList.setSrcIP(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].SrcIP"));
			dataList.setMemory(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].Memory"));
			dataList.setCPU(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].CPU"));
			dataList.setDisk(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].Disk"));
			dataList.setMac(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].Mac"));
			dataList.setAppVersion(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].AppVersion"));
			dataList.setDeviceBelong(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].DeviceBelong"));
			dataList.setSharingStatus(_ctx.booleanValue("ListUserDevicesResponse.Devices["+ i +"].SharingStatus"));
			dataList.setDeviceStatus(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].DeviceStatus"));
			dataList.setAppStatus(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].AppStatus"));
			dataList.setPaStatus(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].PaStatus"));
			dataList.setIaStatus(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].IaStatus"));
			dataList.setDlpStatus(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].DlpStatus"));
			dataList.setNacStatus(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].NacStatus"));
			dataList.setCreateTime(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].CreateTime"));
			dataList.setUpdateTime(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].UpdateTime"));

			List<NetInterfaceInfoItem> netInterfaceInfo = new ArrayList<NetInterfaceInfoItem>();
			for (int j = 0; j < _ctx.lengthValue("ListUserDevicesResponse.Devices["+ i +"].NetInterfaceInfo.Length"); j++) {
				NetInterfaceInfoItem netInterfaceInfoItem = new NetInterfaceInfoItem();
				netInterfaceInfoItem.setName(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].NetInterfaceInfo["+ j +"].Name"));
				netInterfaceInfoItem.setMac(_ctx.stringValue("ListUserDevicesResponse.Devices["+ i +"].NetInterfaceInfo["+ j +"].Mac"));

				netInterfaceInfo.add(netInterfaceInfoItem);
			}
			dataList.setNetInterfaceInfo(netInterfaceInfo);

			devices.add(dataList);
		}
		listUserDevicesResponse.setDevices(devices);
	 
	 	return listUserDevicesResponse;
	}
}