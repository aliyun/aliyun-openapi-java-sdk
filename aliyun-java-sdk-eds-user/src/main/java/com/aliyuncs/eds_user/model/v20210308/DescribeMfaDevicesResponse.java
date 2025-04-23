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

package com.aliyuncs.eds_user.model.v20210308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.DescribeMfaDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMfaDevicesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Data> mfaDevices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Data> getMfaDevices() {
		return this.mfaDevices;
	}

	public void setMfaDevices(List<Data> mfaDevices) {
		this.mfaDevices = mfaDevices;
	}

	public static class Data {

		private Long id;

		private String endUserId;

		private String email;

		private String gmtEnabled;

		private String gmtUnlock;

		private Integer consecutiveFails;

		private String serialNumber;

		private String status;

		private String deviceType;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGmtEnabled() {
			return this.gmtEnabled;
		}

		public void setGmtEnabled(String gmtEnabled) {
			this.gmtEnabled = gmtEnabled;
		}

		public String getGmtUnlock() {
			return this.gmtUnlock;
		}

		public void setGmtUnlock(String gmtUnlock) {
			this.gmtUnlock = gmtUnlock;
		}

		public Integer getConsecutiveFails() {
			return this.consecutiveFails;
		}

		public void setConsecutiveFails(Integer consecutiveFails) {
			this.consecutiveFails = consecutiveFails;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}
	}

	@Override
	public DescribeMfaDevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMfaDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
