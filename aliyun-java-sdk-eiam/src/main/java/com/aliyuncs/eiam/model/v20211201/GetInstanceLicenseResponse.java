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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.GetInstanceLicenseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceLicenseResponse extends AcsResponse {

	private String requestId;

	private License license;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public License getLicense() {
		return this.license;
	}

	public void setLicense(License license) {
		this.license = license;
	}

	public static class License {

		private String licenseId;

		private String licenseStatus;

		private String licenseChargeType;

		private String licenseConfigJson;

		private Long licenseCreateTime;

		private String purchaseChannel;

		private String purchaseInstanceId;

		private String edition;

		private Long userQuota;

		private Long startTime;

		private Long endTime;

		public String getLicenseId() {
			return this.licenseId;
		}

		public void setLicenseId(String licenseId) {
			this.licenseId = licenseId;
		}

		public String getLicenseStatus() {
			return this.licenseStatus;
		}

		public void setLicenseStatus(String licenseStatus) {
			this.licenseStatus = licenseStatus;
		}

		public String getLicenseChargeType() {
			return this.licenseChargeType;
		}

		public void setLicenseChargeType(String licenseChargeType) {
			this.licenseChargeType = licenseChargeType;
		}

		public String getLicenseConfigJson() {
			return this.licenseConfigJson;
		}

		public void setLicenseConfigJson(String licenseConfigJson) {
			this.licenseConfigJson = licenseConfigJson;
		}

		public Long getLicenseCreateTime() {
			return this.licenseCreateTime;
		}

		public void setLicenseCreateTime(Long licenseCreateTime) {
			this.licenseCreateTime = licenseCreateTime;
		}

		public String getPurchaseChannel() {
			return this.purchaseChannel;
		}

		public void setPurchaseChannel(String purchaseChannel) {
			this.purchaseChannel = purchaseChannel;
		}

		public String getPurchaseInstanceId() {
			return this.purchaseInstanceId;
		}

		public void setPurchaseInstanceId(String purchaseInstanceId) {
			this.purchaseInstanceId = purchaseInstanceId;
		}

		public String getEdition() {
			return this.edition;
		}

		public void setEdition(String edition) {
			this.edition = edition;
		}

		public Long getUserQuota() {
			return this.userQuota;
		}

		public void setUserQuota(Long userQuota) {
			this.userQuota = userQuota;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}
	}

	@Override
	public GetInstanceLicenseResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceLicenseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
