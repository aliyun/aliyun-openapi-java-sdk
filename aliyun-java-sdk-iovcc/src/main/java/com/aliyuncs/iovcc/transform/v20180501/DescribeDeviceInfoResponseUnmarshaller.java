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

import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceInfoResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceInfoResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceInfoResponseUnmarshaller {

	public static DescribeDeviceInfoResponse unmarshall(DescribeDeviceInfoResponse describeDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		describeDeviceInfoResponse.setRequestId(_ctx.stringValue("DescribeDeviceInfoResponse.RequestId"));

		DeviceInfo deviceInfo = new DeviceInfo();
		deviceInfo.setDeviceId(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.DeviceId"));
		deviceInfo.setDeviceType(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.DeviceType"));
		deviceInfo.setUsageType(_ctx.integerValue("DescribeDeviceInfoResponse.DeviceInfo.UsageType"));
		deviceInfo.setUsageTypeDesc(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.UsageTypeDesc"));
		deviceInfo.setDeviceModel(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.DeviceModel"));
		deviceInfo.setDeviceModelId(_ctx.longValue("DescribeDeviceInfoResponse.DeviceInfo.DeviceModelId"));
		deviceInfo.setDeviceBrand(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.DeviceBrand"));
		deviceInfo.setUuid(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.Uuid"));
		deviceInfo.setVin(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.Vin"));
		deviceInfo.setSerialNumber(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.SerialNumber"));
		deviceInfo.setMacAddress(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.MacAddress"));
		deviceInfo.setHardwareId(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.HardwareId"));
		deviceInfo.setSoftwareId(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.SoftwareId"));
		deviceInfo.setRegion(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.Region"));
		deviceInfo.setName(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.Name"));
		deviceInfo.setProjectId(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.ProjectId"));
		deviceInfo.setStatus(_ctx.stringValue("DescribeDeviceInfoResponse.DeviceInfo.Status"));
		describeDeviceInfoResponse.setDeviceInfo(deviceInfo);
	 
	 	return describeDeviceInfoResponse;
	}
}