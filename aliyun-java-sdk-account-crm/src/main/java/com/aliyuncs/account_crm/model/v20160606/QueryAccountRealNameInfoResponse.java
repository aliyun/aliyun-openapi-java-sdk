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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryAccountRealNameInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountRealNameInfoResponse extends AcsResponse {

	private String requestId;

	private ProfileInfo profileInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ProfileInfo getProfileInfo() {
		return this.profileInfo;
	}

	public void setProfileInfo(ProfileInfo profileInfo) {
		this.profileInfo = profileInfo;
	}

	public static class ProfileInfo {

		private Boolean processingEnterpriseCertify;

		private String isBankIDAuth;

		private String authBeiAnCid;

		private String authDomain;

		private String certifiedTime;

		private String certifiedFrom;

		private String authAlipay;

		private String accountCertifyType;

		private String licenseNumber;

		private String licenseType;

		private String name;

		private String isCertified;

		public Boolean getProcessingEnterpriseCertify() {
			return this.processingEnterpriseCertify;
		}

		public void setProcessingEnterpriseCertify(Boolean processingEnterpriseCertify) {
			this.processingEnterpriseCertify = processingEnterpriseCertify;
		}

		public String getIsBankIDAuth() {
			return this.isBankIDAuth;
		}

		public void setIsBankIDAuth(String isBankIDAuth) {
			this.isBankIDAuth = isBankIDAuth;
		}

		public String getAuthBeiAnCid() {
			return this.authBeiAnCid;
		}

		public void setAuthBeiAnCid(String authBeiAnCid) {
			this.authBeiAnCid = authBeiAnCid;
		}

		public String getAuthDomain() {
			return this.authDomain;
		}

		public void setAuthDomain(String authDomain) {
			this.authDomain = authDomain;
		}

		public String getCertifiedTime() {
			return this.certifiedTime;
		}

		public void setCertifiedTime(String certifiedTime) {
			this.certifiedTime = certifiedTime;
		}

		public String getCertifiedFrom() {
			return this.certifiedFrom;
		}

		public void setCertifiedFrom(String certifiedFrom) {
			this.certifiedFrom = certifiedFrom;
		}

		public String getAuthAlipay() {
			return this.authAlipay;
		}

		public void setAuthAlipay(String authAlipay) {
			this.authAlipay = authAlipay;
		}

		public String getAccountCertifyType() {
			return this.accountCertifyType;
		}

		public void setAccountCertifyType(String accountCertifyType) {
			this.accountCertifyType = accountCertifyType;
		}

		public String getLicenseNumber() {
			return this.licenseNumber;
		}

		public void setLicenseNumber(String licenseNumber) {
			this.licenseNumber = licenseNumber;
		}

		public String getLicenseType() {
			return this.licenseType;
		}

		public void setLicenseType(String licenseType) {
			this.licenseType = licenseType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIsCertified() {
			return this.isCertified;
		}

		public void setIsCertified(String isCertified) {
			this.isCertified = isCertified;
		}
	}

	@Override
	public QueryAccountRealNameInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountRealNameInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
