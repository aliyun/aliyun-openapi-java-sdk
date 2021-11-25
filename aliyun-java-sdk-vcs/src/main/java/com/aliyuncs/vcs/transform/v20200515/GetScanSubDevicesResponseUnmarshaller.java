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

import com.aliyuncs.vcs.model.v20200515.GetScanSubDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.GetScanSubDevicesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.GetScanSubDevicesResponse.Data.SubDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetScanSubDevicesResponseUnmarshaller {

	public static GetScanSubDevicesResponse unmarshall(GetScanSubDevicesResponse getScanSubDevicesResponse, UnmarshallerContext _ctx) {
		
		getScanSubDevicesResponse.setRequestId(_ctx.stringValue("GetScanSubDevicesResponse.RequestId"));
		getScanSubDevicesResponse.setCode(_ctx.stringValue("GetScanSubDevicesResponse.Code"));
		getScanSubDevicesResponse.setMessage(_ctx.stringValue("GetScanSubDevicesResponse.Message"));

		Data data = new Data();

		List<SubDevice> subDeviceList = new ArrayList<SubDevice>();
		for (int i = 0; i < _ctx.lengthValue("GetScanSubDevicesResponse.Data.SubDeviceList.Length"); i++) {
			SubDevice subDevice = new SubDevice();
			subDevice.setSubDeviceIp(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].SubDeviceIp"));
			subDevice.setSubDevicePort(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].SubDevicePort"));
			subDevice.setDeviceModel(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].DeviceModel"));
			subDevice.setDeviceSn(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].DeviceSn"));
			subDevice.setFirmwareVersion(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].FirmwareVersion"));
			subDevice.setDeviceMac(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].DeviceMac"));
			subDevice.setManufacturer(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].Manufacturer"));
			subDevice.setAssociatedNvr(_ctx.stringValue("GetScanSubDevicesResponse.Data.SubDeviceList["+ i +"].AssociatedNvr"));

			subDeviceList.add(subDevice);
		}
		data.setSubDeviceList(subDeviceList);
		getScanSubDevicesResponse.setData(data);
	 
	 	return getScanSubDevicesResponse;
	}
}