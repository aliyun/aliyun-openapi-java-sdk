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
import com.aliyuncs.ram.transform.v20150501.UnbindMFADeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UnbindMFADeviceResponse extends AcsResponse {

	private String requestId;

	private MFADevice mFADevice;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MFADevice getMFADevice() {
		return this.mFADevice;
	}

	public void setMFADevice(MFADevice mFADevice) {
		this.mFADevice = mFADevice;
	}

	public static class MFADevice {

		private String serialNumber;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}
	}

	@Override
	public UnbindMFADeviceResponse getInstance(UnmarshallerContext context) {
		return	UnbindMFADeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
