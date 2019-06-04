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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveDomainDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveDomainDetailResponse extends AcsResponse {

	private String requestId;

	private DomainDetail domainDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DomainDetail getDomainDetail() {
		return this.domainDetail;
	}

	public void setDomainDetail(DomainDetail domainDetail) {
		this.domainDetail = domainDetail;
	}

	public static class DomainDetail {

		private String gmtCreated;

		private String gmtModified;

		private String domainStatus;

		private String cname;

		private String domainName;

		private String liveDomainType;

		private String region;

		private String description;

		private String sSLProtocol;

		private String sSLPub;

		private String scope;

		private String certName;

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getDomainStatus() {
			return this.domainStatus;
		}

		public void setDomainStatus(String domainStatus) {
			this.domainStatus = domainStatus;
		}

		public String getCname() {
			return this.cname;
		}

		public void setCname(String cname) {
			this.cname = cname;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getLiveDomainType() {
			return this.liveDomainType;
		}

		public void setLiveDomainType(String liveDomainType) {
			this.liveDomainType = liveDomainType;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSSLProtocol() {
			return this.sSLProtocol;
		}

		public void setSSLProtocol(String sSLProtocol) {
			this.sSLProtocol = sSLProtocol;
		}

		public String getSSLPub() {
			return this.sSLPub;
		}

		public void setSSLPub(String sSLPub) {
			this.sSLPub = sSLPub;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
		}
	}

	@Override
	public DescribeLiveDomainDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveDomainDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
