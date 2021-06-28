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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeVirtualMFADevicesResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeVirtualMFADevicesResponse.VirtualMFADevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVirtualMFADevicesResponseUnmarshaller {

	public static DescribeVirtualMFADevicesResponse unmarshall(DescribeVirtualMFADevicesResponse describeVirtualMFADevicesResponse, UnmarshallerContext _ctx) {
		
		describeVirtualMFADevicesResponse.setRequestId(_ctx.stringValue("DescribeVirtualMFADevicesResponse.RequestId"));
		describeVirtualMFADevicesResponse.setNextToken(_ctx.stringValue("DescribeVirtualMFADevicesResponse.NextToken"));

		List<VirtualMFADevice> virtualMFADevices = new ArrayList<VirtualMFADevice>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices.Length"); i++) {
			VirtualMFADevice virtualMFADevice = new VirtualMFADevice();
			virtualMFADevice.setDirectoryId(_ctx.stringValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].DirectoryId"));
			virtualMFADevice.setOfficeSiteId(_ctx.stringValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].OfficeSiteId"));
			virtualMFADevice.setEndUserId(_ctx.stringValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].EndUserId"));
			virtualMFADevice.setGmtEnabled(_ctx.stringValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].GmtEnabled"));
			virtualMFADevice.setGmtUnlock(_ctx.stringValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].GmtUnlock"));
			virtualMFADevice.setConsecutiveFails(_ctx.integerValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].ConsecutiveFails"));
			virtualMFADevice.setSerialNumber(_ctx.stringValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].SerialNumber"));
			virtualMFADevice.setStatus(_ctx.stringValue("DescribeVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].status"));

			virtualMFADevices.add(virtualMFADevice);
		}
		describeVirtualMFADevicesResponse.setVirtualMFADevices(virtualMFADevices);
	 
	 	return describeVirtualMFADevicesResponse;
	}
}