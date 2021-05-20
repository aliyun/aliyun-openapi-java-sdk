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

import com.aliyuncs.vcs.model.v20200515.UpdateAiotDeviceResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateAiotDeviceResponse.AiotDevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAiotDeviceResponseUnmarshaller {

	public static UpdateAiotDeviceResponse unmarshall(UpdateAiotDeviceResponse updateAiotDeviceResponse, UnmarshallerContext _ctx) {
		
		updateAiotDeviceResponse.setRequestId(_ctx.stringValue("UpdateAiotDeviceResponse.RequestId"));
		updateAiotDeviceResponse.setMessage(_ctx.stringValue("UpdateAiotDeviceResponse.Message"));
		updateAiotDeviceResponse.setCode(_ctx.stringValue("UpdateAiotDeviceResponse.Code"));

		AiotDevice aiotDevice = new AiotDevice();
		aiotDevice.setDeviceId(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.DeviceId"));
		aiotDevice.setPort(_ctx.longValue("UpdateAiotDeviceResponse.AiotDevice.Port"));
		aiotDevice.setPlaceCode(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.PlaceCode"));
		aiotDevice.setLatitude(_ctx.floatValue("UpdateAiotDeviceResponse.AiotDevice.Latitude"));
		aiotDevice.setOwnerApsID(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.OwnerApsID"));
		aiotDevice.setIsOnline(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.IsOnline"));
		aiotDevice.setName(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.Name"));
		aiotDevice.setMonitorAreaDesc(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.MonitorAreaDesc"));
		aiotDevice.setManufacturer(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.Manufacturer"));
		aiotDevice.setMonitorDirection(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.MonitorDirection"));
		aiotDevice.setIPV6Addr(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.IPV6Addr"));
		aiotDevice.setPassword(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.Password"));
		aiotDevice.setIPAddr(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.IPAddr"));
		aiotDevice.setIPv4Netmask(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.IPv4Netmask"));
		aiotDevice.setCorpId(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.CorpId"));
		aiotDevice.setLongitude(_ctx.floatValue("UpdateAiotDeviceResponse.AiotDevice.Longitude"));
		aiotDevice.setFirmwareVersion(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.FirmwareVersion"));
		aiotDevice.setMAC(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.MAC"));
		aiotDevice.setDeviceType(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.DeviceType"));
		aiotDevice.setOrgCode(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.OrgCode"));
		aiotDevice.setSerialNumber(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.SerialNumber"));
		aiotDevice.setCapDirection(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.CapDirection"));
		aiotDevice.setUserId(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.UserId"));
		aiotDevice.setModel(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.Model"));
		aiotDevice.setIPv4Gateway(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.IPv4Gateway"));
		aiotDevice.setPlace(_ctx.stringValue("UpdateAiotDeviceResponse.AiotDevice.Place"));
		updateAiotDeviceResponse.setAiotDevice(aiotDevice);
	 
	 	return updateAiotDeviceResponse;
	}
}