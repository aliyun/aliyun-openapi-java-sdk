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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.GetVerificationInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVerificationInfoResponse extends AcsResponse {

	private String requestId;

	private SecurityPhoneDevice securityPhoneDevice;

	private SecurityEmailDevice securityEmailDevice;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SecurityPhoneDevice getSecurityPhoneDevice() {
		return this.securityPhoneDevice;
	}

	public void setSecurityPhoneDevice(SecurityPhoneDevice securityPhoneDevice) {
		this.securityPhoneDevice = securityPhoneDevice;
	}

	public SecurityEmailDevice getSecurityEmailDevice() {
		return this.securityEmailDevice;
	}

	public void setSecurityEmailDevice(SecurityEmailDevice securityEmailDevice) {
		this.securityEmailDevice = securityEmailDevice;
	}

	public static class SecurityPhoneDevice {

		private String areaCode;

		private String phoneNumber;

		private String status;

		public String getAreaCode() {
			return this.areaCode;
		}

		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}

		public String getPhoneNumber() {
			return this.phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class SecurityEmailDevice {

		private String email;

		private String status;

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetVerificationInfoResponse getInstance(UnmarshallerContext context) {
		return	GetVerificationInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
