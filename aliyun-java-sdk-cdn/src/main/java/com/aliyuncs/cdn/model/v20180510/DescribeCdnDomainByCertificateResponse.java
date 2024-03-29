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
import com.aliyuncs.cdn.transform.v20180510.DescribeCdnDomainByCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCdnDomainByCertificateResponse extends AcsResponse {

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

		private String certStartTime;

		private String certExpireTime;

		private String certCaIsLegacy;

		private String certSubjectCommonName;

		private String certType;

		private String domainNames;

		private String certExpired;

		private String issuer;

		private String domainList;

		public String getCertStartTime() {
			return this.certStartTime;
		}

		public void setCertStartTime(String certStartTime) {
			this.certStartTime = certStartTime;
		}

		public String getCertExpireTime() {
			return this.certExpireTime;
		}

		public void setCertExpireTime(String certExpireTime) {
			this.certExpireTime = certExpireTime;
		}

		public String getCertCaIsLegacy() {
			return this.certCaIsLegacy;
		}

		public void setCertCaIsLegacy(String certCaIsLegacy) {
			this.certCaIsLegacy = certCaIsLegacy;
		}

		public String getCertSubjectCommonName() {
			return this.certSubjectCommonName;
		}

		public void setCertSubjectCommonName(String certSubjectCommonName) {
			this.certSubjectCommonName = certSubjectCommonName;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
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
	public DescribeCdnDomainByCertificateResponse getInstance(UnmarshallerContext context) {
		return	DescribeCdnDomainByCertificateResponseUnmarshaller.unmarshall(this, context);
	}
}
