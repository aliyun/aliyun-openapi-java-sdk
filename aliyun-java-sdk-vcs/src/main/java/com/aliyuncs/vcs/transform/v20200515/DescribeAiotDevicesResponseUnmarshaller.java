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

import com.aliyuncs.vcs.model.v20200515.DescribeAiotDevicesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotDevicesResponse.AiotDevices;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotDevicesResponse.AiotDevices.AiotDeviceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAiotDevicesResponseUnmarshaller {

	public static DescribeAiotDevicesResponse unmarshall(DescribeAiotDevicesResponse describeAiotDevicesResponse, UnmarshallerContext _ctx) {
		
		describeAiotDevicesResponse.setRequestId(_ctx.stringValue("DescribeAiotDevicesResponse.RequestId"));
		describeAiotDevicesResponse.setMessage(_ctx.stringValue("DescribeAiotDevicesResponse.Message"));
		describeAiotDevicesResponse.setCode(_ctx.stringValue("DescribeAiotDevicesResponse.Code"));

		AiotDevices aiotDevices = new AiotDevices();
		aiotDevices.setPageNum(_ctx.longValue("DescribeAiotDevicesResponse.AiotDevices.PageNum"));
		aiotDevices.setPageSize(_ctx.longValue("DescribeAiotDevicesResponse.AiotDevices.PageSize"));
		aiotDevices.setTotalNum(_ctx.longValue("DescribeAiotDevicesResponse.AiotDevices.TotalNum"));

		List<AiotDeviceType> aiotDeviceList = new ArrayList<AiotDeviceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList.Length"); i++) {
			AiotDeviceType aiotDeviceType = new AiotDeviceType();
			aiotDeviceType.setCorpId(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].CorpId"));
			aiotDeviceType.setDeviceId(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].DeviceId"));
			aiotDeviceType.setName(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Name"));
			aiotDeviceType.setModel(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Model"));
			aiotDeviceType.setIPAddr(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].IPAddr"));
			aiotDeviceType.setIPV6Addr(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].IPV6Addr"));
			aiotDeviceType.setPort(_ctx.longValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Port"));
			aiotDeviceType.setLongitude(_ctx.floatValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Longitude"));
			aiotDeviceType.setLatitude(_ctx.floatValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Latitude"));
			aiotDeviceType.setPlaceCode(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].PlaceCode"));
			aiotDeviceType.setPlace(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Place"));
			aiotDeviceType.setOrgCode(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].OrgCode"));
			aiotDeviceType.setCapDirection(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].CapDirection"));
			aiotDeviceType.setMonitorDirection(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].MonitorDirection"));
			aiotDeviceType.setMonitorAreaDesc(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].MonitorAreaDesc"));
			aiotDeviceType.setIsOnline(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].IsOnline"));
			aiotDeviceType.setOwnerApsID(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].OwnerApsID"));
			aiotDeviceType.setUserId(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].UserId"));
			aiotDeviceType.setPassword(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Password"));
			aiotDeviceType.setMAC(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].MAC"));
			aiotDeviceType.setIPv4Netmask(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].IPv4Netmask"));
			aiotDeviceType.setIPv4Gateway(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].IPv4Gateway"));
			aiotDeviceType.setDeviceType(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].DeviceType"));
			aiotDeviceType.setFirmwareVersion(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].FirmwareVersion"));
			aiotDeviceType.setSerialNuber(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].SerialNuber"));
			aiotDeviceType.setManufacturer(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Manufacturer"));
			aiotDeviceType.setId(_ctx.stringValue("DescribeAiotDevicesResponse.AiotDevices.AiotDeviceList["+ i +"].Id"));

			aiotDeviceList.add(aiotDeviceType);
		}
		aiotDevices.setAiotDeviceList(aiotDeviceList);
		describeAiotDevicesResponse.setAiotDevices(aiotDevices);
	 
	 	return describeAiotDevicesResponse;
	}
}