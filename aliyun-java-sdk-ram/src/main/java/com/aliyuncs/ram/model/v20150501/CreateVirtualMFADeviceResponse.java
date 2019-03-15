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

package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ram.transform.v20150501.CreateVirtualMFADeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateVirtualMFADeviceResponse extends AcsResponse {

	private String requestId;

	private VirtualMFADevice virtualMFADevice;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public VirtualMFADevice getVirtualMFADevice() {
		return this.virtualMFADevice;
	}

	public void setVirtualMFADevice(VirtualMFADevice virtualMFADevice) {
		this.virtualMFADevice = virtualMFADevice;
	}

	public static class VirtualMFADevice {

		private String serialNumber;

		private String base32StringSeed;

		private String qRCodePNG;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getBase32StringSeed() {
			return this.base32StringSeed;
		}

		public void setBase32StringSeed(String base32StringSeed) {
			this.base32StringSeed = base32StringSeed;
		}

		public String getQRCodePNG() {
			return this.qRCodePNG;
		}

		public void setQRCodePNG(String qRCodePNG) {
			this.qRCodePNG = qRCodePNG;
		}
	}

	@Override
	public CreateVirtualMFADeviceResponse getInstance(UnmarshallerContext context) {
		return	CreateVirtualMFADeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
