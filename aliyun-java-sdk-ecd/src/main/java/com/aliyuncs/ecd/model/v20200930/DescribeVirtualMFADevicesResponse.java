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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeVirtualMFADevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVirtualMFADevicesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<VirtualMFADevice> virtualMFADevices;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<VirtualMFADevice> getVirtualMFADevices() {
		return this.virtualMFADevices;
	}

	public void setVirtualMFADevices(List<VirtualMFADevice> virtualMFADevices) {
		this.virtualMFADevices = virtualMFADevices;
	}

	public static class VirtualMFADevice {

		private String serialNumber;

		private String gmtUnlock;

		private String endUserId;

		private Integer consecutiveFails;

		private String officeSiteId;

		private String status;

		private String directoryId;

		private String gmtEnabled;

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getGmtUnlock() {
			return this.gmtUnlock;
		}

		public void setGmtUnlock(String gmtUnlock) {
			this.gmtUnlock = gmtUnlock;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public Integer getConsecutiveFails() {
			return this.consecutiveFails;
		}

		public void setConsecutiveFails(Integer consecutiveFails) {
			this.consecutiveFails = consecutiveFails;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDirectoryId() {
			return this.directoryId;
		}

		public void setDirectoryId(String directoryId) {
			this.directoryId = directoryId;
		}

		public String getGmtEnabled() {
			return this.gmtEnabled;
		}

		public void setGmtEnabled(String gmtEnabled) {
			this.gmtEnabled = gmtEnabled;
		}
	}

	@Override
	public DescribeVirtualMFADevicesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVirtualMFADevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
