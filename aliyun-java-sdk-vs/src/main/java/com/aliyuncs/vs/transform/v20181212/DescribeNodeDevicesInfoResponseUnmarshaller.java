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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeNodeDevicesInfoResponse;
import com.aliyuncs.vs.model.v20181212.DescribeNodeDevicesInfoResponse.NodeDevice;
import com.aliyuncs.vs.model.v20181212.DescribeNodeDevicesInfoResponse.NodeDevice.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodeDevicesInfoResponseUnmarshaller {

	public static DescribeNodeDevicesInfoResponse unmarshall(DescribeNodeDevicesInfoResponse describeNodeDevicesInfoResponse, UnmarshallerContext _ctx) {
		
		describeNodeDevicesInfoResponse.setRequestId(_ctx.stringValue("DescribeNodeDevicesInfoResponse.RequestId"));

		List<NodeDevice> nodeDevices = new ArrayList<NodeDevice>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodeDevicesInfoResponse.NodeDevices.Length"); i++) {
			NodeDevice nodeDevice = new NodeDevice();
			nodeDevice.setNodeName(_ctx.stringValue("DescribeNodeDevicesInfoResponse.NodeDevices["+ i +"].NodeName"));

			List<DeviceInfo> deviceInfos = new ArrayList<DeviceInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNodeDevicesInfoResponse.NodeDevices["+ i +"].DeviceInfos.Length"); j++) {
				DeviceInfo deviceInfo = new DeviceInfo();
				deviceInfo.setInstanceId(_ctx.stringValue("DescribeNodeDevicesInfoResponse.NodeDevices["+ i +"].DeviceInfos["+ j +"].InstanceId"));
				deviceInfo.setName(_ctx.stringValue("DescribeNodeDevicesInfoResponse.NodeDevices["+ i +"].DeviceInfos["+ j +"].Name"));
				deviceInfo.setIP(_ctx.stringValue("DescribeNodeDevicesInfoResponse.NodeDevices["+ i +"].DeviceInfos["+ j +"].IP"));
				deviceInfo.setServer(_ctx.stringValue("DescribeNodeDevicesInfoResponse.NodeDevices["+ i +"].DeviceInfos["+ j +"].Server"));

				deviceInfos.add(deviceInfo);
			}
			nodeDevice.setDeviceInfos(deviceInfos);

			nodeDevices.add(nodeDevice);
		}
		describeNodeDevicesInfoResponse.setNodeDevices(nodeDevices);
	 
	 	return describeNodeDevicesInfoResponse;
	}
}