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

import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceModelResponse;
import com.aliyuncs.iovcc.model.v20180501.DescribeDeviceModelResponse.DeviceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceModelResponseUnmarshaller {

	public static DescribeDeviceModelResponse unmarshall(DescribeDeviceModelResponse describeDeviceModelResponse, UnmarshallerContext _ctx) {
		
		describeDeviceModelResponse.setRequestId(_ctx.stringValue("DescribeDeviceModelResponse.RequestId"));

		DeviceModel deviceModel = new DeviceModel();
		deviceModel.setDeviceModelId(_ctx.longValue("DescribeDeviceModelResponse.DeviceModel.DeviceModelId"));
		deviceModel.setDeviceType(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.DeviceType"));
		deviceModel.setHardwareType(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.HardwareType"));
		deviceModel.setDeviceModel(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.DeviceModel"));
		deviceModel.setDeviceBrand(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.DeviceBrand"));
		deviceModel.setCanCreateDeviceId(_ctx.integerValue("DescribeDeviceModelResponse.DeviceModel.CanCreateDeviceId"));
		deviceModel.setInitUsageType(_ctx.integerValue("DescribeDeviceModelResponse.DeviceModel.InitUsageType"));
		deviceModel.setInitUsageTypeDesc(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.InitUsageTypeDesc"));
		deviceModel.setDescription(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.Description"));
		deviceModel.setProjectId(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.ProjectId"));
		deviceModel.setSecurityChip(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.SecurityChip"));
		deviceModel.setOsPlatform(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.OsPlatform"));
		deviceModel.setObjectKey(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.ObjectKey"));
		deviceModel.setDeviceLogoUrl(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.DeviceLogoUrl"));
		deviceModel.setDeviceName(_ctx.stringValue("DescribeDeviceModelResponse.DeviceModel.DeviceName"));
		describeDeviceModelResponse.setDeviceModel(deviceModel);
	 
	 	return describeDeviceModelResponse;
	}
}