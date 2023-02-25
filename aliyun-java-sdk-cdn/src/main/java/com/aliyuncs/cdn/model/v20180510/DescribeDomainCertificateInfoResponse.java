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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeDomainCertificateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainCertificateInfoResponse extends AcsResponse {

	private String requestId;

	private List<CertInfo> certInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CertInfo> getCertInfos() {
		return this.certInfos;
	}

	public void setCertInfos(List<CertInfo> certInfos) {
		this.certInfos = certInfos;
	}

	public static class CertInfo {

		private String certExpireTime;

		private String certLife;

		private String status;

		private String certUpdateTime;

		private String certDomainName;

		private String serverCertificateStatus;

		private String certOrg;

		private String domainName;

		private String certStartTime;

		private String certType;

		private String certName;

		private String domainCnameStatus;

		private String serverCertificate;

		private String certId;

		private String certRegion;

		public String getCertExpireTime() {
			return this.certExpireTime;
		}

		public void setCertExpireTime(String certExpireTime) {
			this.certExpireTime = certExpireTime;
		}

		public String getCertLife() {
			return this.certLife;
		}

		public void setCertLife(String certLife) {
			this.certLife = certLife;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCertUpdateTime() {
			return this.certUpdateTime;
		}

		public void setCertUpdateTime(String certUpdateTime) {
			this.certUpdateTime = certUpdateTime;
		}

		public String getCertDomainName() {
			return this.certDomainName;
		}

		public void setCertDomainName(String certDomainName) {
			this.certDomainName = certDomainName;
		}

		public String getServerCertificateStatus() {
			return this.serverCertificateStatus;
		}

		public void setServerCertificateStatus(String serverCertificateStatus) {
			this.serverCertificateStatus = serverCertificateStatus;
		}

		public String getCertOrg() {
			return this.certOrg;
		}

		public void setCertOrg(String certOrg) {
			this.certOrg = certOrg;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getCertStartTime() {
			return this.certStartTime;
		}

		public void setCertStartTime(String certStartTime) {
			this.certStartTime = certStartTime;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
		}

		public String getDomainCnameStatus() {
			return this.domainCnameStatus;
		}

		public void setDomainCnameStatus(String domainCnameStatus) {
			this.domainCnameStatus = domainCnameStatus;
		}

		public String getServerCertificate() {
			return this.serverCertificate;
		}

		public void setServerCertificate(String serverCertificate) {
			this.serverCertificate = serverCertificate;
		}

		public String getCertId() {
			return this.certId;
		}

		public void setCertId(String certId) {
			this.certId = certId;
		}

		public String getCertRegion() {
			return this.certRegion;
		}

		public void setCertRegion(String certRegion) {
			this.certRegion = certRegion;
		}
	}

	@Override
	public DescribeDomainCertificateInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainCertificateInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
