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

package com.aliyuncs.ram.transform.v20150501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ram.model.v20150501.ListVirtualMFADevicesResponse;
import com.aliyuncs.ram.model.v20150501.ListVirtualMFADevicesResponse.VirtualMFADevice;
import com.aliyuncs.ram.model.v20150501.ListVirtualMFADevicesResponse.VirtualMFADevice.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVirtualMFADevicesResponseUnmarshaller {

	public static ListVirtualMFADevicesResponse unmarshall(ListVirtualMFADevicesResponse listVirtualMFADevicesResponse, UnmarshallerContext _ctx) {
		
		listVirtualMFADevicesResponse.setRequestId(_ctx.stringValue("ListVirtualMFADevicesResponse.RequestId"));

		List<VirtualMFADevice> virtualMFADevices = new ArrayList<VirtualMFADevice>();
		for (int i = 0; i < _ctx.lengthValue("ListVirtualMFADevicesResponse.VirtualMFADevices.Length"); i++) {
			VirtualMFADevice virtualMFADevice = new VirtualMFADevice();
			virtualMFADevice.setSerialNumber(_ctx.stringValue("ListVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].SerialNumber"));
			virtualMFADevice.setActivateDate(_ctx.stringValue("ListVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].ActivateDate"));

			User user = new User();
			user.setDisplayName(_ctx.stringValue("ListVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].User.DisplayName"));
			user.setUserId(_ctx.stringValue("ListVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].User.UserId"));
			user.setUserName(_ctx.stringValue("ListVirtualMFADevicesResponse.VirtualMFADevices["+ i +"].User.UserName"));
			virtualMFADevice.setUser(user);

			virtualMFADevices.add(virtualMFADevice);
		}
		listVirtualMFADevicesResponse.setVirtualMFADevices(virtualMFADevices);
	 
	 	return listVirtualMFADevicesResponse;
	}
}