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

import com.aliyuncs.ram.model.v20150501.CreateVirtualMFADeviceResponse;
import com.aliyuncs.ram.model.v20150501.CreateVirtualMFADeviceResponse.VirtualMFADevice;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVirtualMFADeviceResponseUnmarshaller {

	public static CreateVirtualMFADeviceResponse unmarshall(CreateVirtualMFADeviceResponse createVirtualMFADeviceResponse, UnmarshallerContext context) {
		
		createVirtualMFADeviceResponse.setRequestId(context.stringValue("CreateVirtualMFADeviceResponse.RequestId"));

		VirtualMFADevice virtualMFADevice = new VirtualMFADevice();
		virtualMFADevice.setSerialNumber(context.stringValue("CreateVirtualMFADeviceResponse.VirtualMFADevice.SerialNumber"));
		virtualMFADevice.setBase32StringSeed(context.stringValue("CreateVirtualMFADeviceResponse.VirtualMFADevice.Base32StringSeed"));
		virtualMFADevice.setQRCodePNG(context.stringValue("CreateVirtualMFADeviceResponse.VirtualMFADevice.QRCodePNG"));
		createVirtualMFADeviceResponse.setVirtualMFADevice(virtualMFADevice);
	 
	 	return createVirtualMFADeviceResponse;
	}
}