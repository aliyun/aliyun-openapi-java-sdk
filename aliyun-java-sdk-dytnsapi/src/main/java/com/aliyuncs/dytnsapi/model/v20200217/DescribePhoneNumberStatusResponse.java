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

package com.aliyuncs.dytnsapi.model.v20200217;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dytnsapi.transform.v20200217.DescribePhoneNumberStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePhoneNumberStatusResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private PhoneStatus phoneStatus;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PhoneStatus getPhoneStatus() {
		return this.phoneStatus;
	}

	public void setPhoneStatus(PhoneStatus phoneStatus) {
		this.phoneStatus = phoneStatus;
	}

	public static class PhoneStatus {

		private String status;

		private String serialId;

		private String carrier;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSerialId() {
			return this.serialId;
		}

		public void setSerialId(String serialId) {
			this.serialId = serialId;
		}

		public String getCarrier() {
			return this.carrier;
		}

		public void setCarrier(String carrier) {
			this.carrier = carrier;
		}
	}

	@Override
	public DescribePhoneNumberStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribePhoneNumberStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
