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
import com.aliyuncs.account_crm.transform.v20160606.LoadRealNameInfoByPkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class LoadRealNameInfoByPkResponse extends AcsResponse {

	private String code;

	private String msg;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String newUnityRealNameAccount;

		private Long cicCertifyProduct;

		private String authAlipayDomain;

		private Boolean processingEnterpriseCertify;

		private String authAlipayLoginId;

		private Boolean isBankIDAuth;

		private String authBeiAnCid;

		private Integer cicCertifyFrom;

		private String authDomain;

		private String certifiedTime;

		private Integer certifyStatus;

		private String authAlipay;

		private String certifiedFrom;

		private String accountCertifyType;

		private String licenseNumber;

		private String licenseType;

		private String name;

		private Boolean isCertified;

		public String getNewUnityRealNameAccount() {
			return this.newUnityRealNameAccount;
		}

		public void setNewUnityRealNameAccount(String newUnityRealNameAccount) {
			this.newUnityRealNameAccount = newUnityRealNameAccount;
		}

		public Long getCicCertifyProduct() {
			return this.cicCertifyProduct;
		}

		public void setCicCertifyProduct(Long cicCertifyProduct) {
			this.cicCertifyProduct = cicCertifyProduct;
		}

		public String getAuthAlipayDomain() {
			return this.authAlipayDomain;
		}

		public void setAuthAlipayDomain(String authAlipayDomain) {
			this.authAlipayDomain = authAlipayDomain;
		}

		public Boolean getProcessingEnterpriseCertify() {
			return this.processingEnterpriseCertify;
		}

		public void setProcessingEnterpriseCertify(Boolean processingEnterpriseCertify) {
			this.processingEnterpriseCertify = processingEnterpriseCertify;
		}

		public String getAuthAlipayLoginId() {
			return this.authAlipayLoginId;
		}

		public void setAuthAlipayLoginId(String authAlipayLoginId) {
			this.authAlipayLoginId = authAlipayLoginId;
		}

		public Boolean getIsBankIDAuth() {
			return this.isBankIDAuth;
		}

		public void setIsBankIDAuth(Boolean isBankIDAuth) {
			this.isBankIDAuth = isBankIDAuth;
		}

		public String getAuthBeiAnCid() {
			return this.authBeiAnCid;
		}

		public void setAuthBeiAnCid(String authBeiAnCid) {
			this.authBeiAnCid = authBeiAnCid;
		}

		public Integer getCicCertifyFrom() {
			return this.cicCertifyFrom;
		}

		public void setCicCertifyFrom(Integer cicCertifyFrom) {
			this.cicCertifyFrom = cicCertifyFrom;
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

		public Integer getCertifyStatus() {
			return this.certifyStatus;
		}

		public void setCertifyStatus(Integer certifyStatus) {
			this.certifyStatus = certifyStatus;
		}

		public String getAuthAlipay() {
			return this.authAlipay;
		}

		public void setAuthAlipay(String authAlipay) {
			this.authAlipay = authAlipay;
		}

		public String getCertifiedFrom() {
			return this.certifiedFrom;
		}

		public void setCertifiedFrom(String certifiedFrom) {
			this.certifiedFrom = certifiedFrom;
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

		public Boolean getIsCertified() {
			return this.isCertified;
		}

		public void setIsCertified(Boolean isCertified) {
			this.isCertified = isCertified;
		}
	}

	@Override
	public LoadRealNameInfoByPkResponse getInstance(UnmarshallerContext context) {
		return	LoadRealNameInfoByPkResponseUnmarshaller.unmarshall(this, context);
	}
}
