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
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainByCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainByCertificateResponse extends AcsResponse {

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

		private String certStartTime;

		private String certType;

		private String certSubjectCommonName;

		private String certCaIsLegacy;

		private String domainNames;

		private String certExpired;

		private String issuer;

		private String domainList;

		public String getCertExpireTime() {
			return this.certExpireTime;
		}

		public void setCertExpireTime(String certExpireTime) {
			this.certExpireTime = certExpireTime;
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

		public String getCertSubjectCommonName() {
			return this.certSubjectCommonName;
		}

		public void setCertSubjectCommonName(String certSubjectCommonName) {
			this.certSubjectCommonName = certSubjectCommonName;
		}

		public String getCertCaIsLegacy() {
			return this.certCaIsLegacy;
		}

		public void setCertCaIsLegacy(String certCaIsLegacy) {
			this.certCaIsLegacy = certCaIsLegacy;
		}

		public String getDomainNames() {
			return this.domainNames;
		}

		public void setDomainNames(String domainNames) {
			this.domainNames = domainNames;
		}

		public String getCertExpired() {
			return this.certExpired;
		}

		public void setCertExpired(String certExpired) {
			this.certExpired = certExpired;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}

		public String getDomainList() {
			return this.domainList;
		}

		public void setDomainList(String domainList) {
			this.domainList = domainList;
		}
	}

	@Override
	public DescribeLiveDomainByCertificateResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainByCertificateResponseUnmarshaller.unmarshall(this, context);
	}
}
