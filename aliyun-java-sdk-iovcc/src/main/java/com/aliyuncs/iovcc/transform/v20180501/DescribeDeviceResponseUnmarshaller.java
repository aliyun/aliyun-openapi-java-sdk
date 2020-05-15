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

package com.aliyuncs.iovcc.transform.v20180501;

import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceResponseUnmarshaller {

	public static DescribeDeviceResponse unmarshall(DescribeDeviceResponse describeDeviceResponse, UnmarshallerContext _ctx) {
		
		describeDeviceResponse.setRequestId(_ctx.stringValue("DescribeDeviceResponse.RequestId"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setDeviceId(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.DeviceId"));
		deviceInfo.setDeviceType(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.DeviceType"));
		deviceInfo.setUsageType(_ctx.integerValue("DescribeDeviceResponse.DeviceInfo.UsageType"));
		deviceInfo.setUsageTypeDesc(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.UsageTypeDesc"));
		deviceInfo.setDeviceModel(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.DeviceModel"));
		deviceInfo.setDeviceModelId(_ctx.longValue("DescribeDeviceResponse.DeviceInfo.DeviceModelId"));
		deviceInfo.setDeviceProduct(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.DeviceProduct"));
		deviceInfo.setDeviceBrandId(_ctx.longValue("DescribeDeviceResponse.DeviceInfo.DeviceBrandId"));
		deviceInfo.setDeviceBrand(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.DeviceBrand"));
		deviceInfo.setUuid(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.Uuid"));
		deviceInfo.setVin(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.Vin"));
		deviceInfo.setSerialNumber(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.SerialNumber"));
		deviceInfo.setMacAddress(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.MacAddress"));
		deviceInfo.setHardwareId(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.HardwareId"));
		deviceInfo.setSoftwareId(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.SoftwareId"));
		deviceInfo.setRegion(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.Region"));
		deviceInfo.setName(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.Name"));
		deviceInfo.setAttributes(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.Attributes"));
		deviceInfo.setProjectId(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.ProjectId"));
		deviceInfo.setOsPlatform(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.OsPlatform"));
		deviceInfo.setStatus(_ctx.stringValue("DescribeDeviceResponse.DeviceInfo.Status"));
		describeDeviceResponse.setDeviceInfo(deviceInfo);
	 
	 	return describeDeviceResponse;
	}
}