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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDeviceServiceResponse.DeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeviceServiceResponseUnmarshaller {

	public static DescribeDeviceServiceResponse unmarshall(DescribeDeviceServiceResponse describeDeviceServiceResponse, UnmarshallerContext _ctx) {
		
		describeDeviceServiceResponse.setRequestId(_ctx.stringValue("DescribeDeviceServiceResponse.RequestId"));

		List<DeviceInfo> resourceDetailInfos = new ArrayList<DeviceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeviceServiceResponse.ResourceDetailInfos.Length"); i++) {
			DeviceInfo deviceInfo = new DeviceInfo();
			deviceInfo.setRegionID(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].RegionID"));
			deviceInfo.setID(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].ID"));
			deviceInfo.setIP(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].IP"));
			deviceInfo.setServer(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Server"));
			deviceInfo.setStatus(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Status"));
			deviceInfo.setType(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Type"));
			deviceInfo.setMac(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].Mac"));
			deviceInfo.setISP(_ctx.stringValue("DescribeDeviceServiceResponse.ResourceDetailInfos["+ i +"].ISP"));

			resourceDetailInfos.add(deviceInfo);
		}
		describeDeviceServiceResponse.setResourceDetailInfos(resourceDetailInfos);
	 
	 	return describeDeviceServiceResponse;
	}
}