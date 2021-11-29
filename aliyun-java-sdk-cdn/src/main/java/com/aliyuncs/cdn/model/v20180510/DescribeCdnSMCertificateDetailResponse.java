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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeCdnSMCertificateDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnSMCertificateDetailResponse extends AcsResponse {

	private String requestId;

	private String signCertificate;

	private String encryptCertificate;

	private String certIdentifier;

	private String certName;

	private String commonName;

	private String sans;

	private String certOrg;

	private String certExpireTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSignCertificate() {
		return this.signCertificate;
	}

	public void setSignCertificate(String signCertificate) {
		this.signCertificate = signCertificate;
	}

	public String getEncryptCertificate() {
		return this.encryptCertificate;
	}

	public void setEncryptCertificate(String encryptCertificate) {
		this.encryptCertificate = encryptCertificate;
	}

	public String getCertIdentifier() {
		return this.certIdentifier;
	}

	public void setCertIdentifier(String certIdentifier) {
		this.certIdentifier = certIdentifier;
	}

	public String getCertName() {
		return this.certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getSans() {
		return this.sans;
	}

	public void setSans(String sans) {
		this.sans = sans;
	}

	public String getCertOrg() {
		return this.certOrg;
	}

	public void setCertOrg(String certOrg) {
		this.certOrg = certOrg;
	}

	public String getCertExpireTime() {
		return this.certExpireTime;
	}

	public void setCertExpireTime(String certExpireTime) {
		this.certExpireTime = certExpireTime;
	}

	@Override
	public DescribeCdnSMCertificateDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnSMCertificateDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
