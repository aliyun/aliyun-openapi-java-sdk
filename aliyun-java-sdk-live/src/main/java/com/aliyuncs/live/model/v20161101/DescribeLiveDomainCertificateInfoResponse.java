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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainCertificateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainCertificateInfoResponse extends AcsResponse {

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

		private String status;

		private String certLife;

		private String certExpireTime;

		private String sSLPub;

		private String sSLProtocol;

		private String certType;

		private String certDomainName;

		private String certName;

		private String certOrg;

		private String domainName;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCertLife() {
			return this.certLife;
		}

		public void setCertLife(String certLife) {
			this.certLife = certLife;
		}

		public String getCertExpireTime() {
			return this.certExpireTime;
		}

		public void setCertExpireTime(String certExpireTime) {
			this.certExpireTime = certExpireTime;
		}

		public String getSSLPub() {
			return this.sSLPub;
		}

		public void setSSLPub(String sSLPub) {
			this.sSLPub = sSLPub;
		}

		public String getSSLProtocol() {
			return this.sSLProtocol;
		}

		public void setSSLProtocol(String sSLProtocol) {
			this.sSLProtocol = sSLProtocol;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getCertDomainName() {
			return this.certDomainName;
		}

		public void setCertDomainName(String certDomainName) {
			this.certDomainName = certDomainName;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
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
	}

	@Override
	public DescribeLiveDomainCertificateInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainCertificateInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
