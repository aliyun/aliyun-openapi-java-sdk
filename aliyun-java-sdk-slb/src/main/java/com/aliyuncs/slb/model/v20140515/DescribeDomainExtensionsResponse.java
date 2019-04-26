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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeDomainExtensionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainExtensionsResponse extends AcsResponse {

	private String requestId;

	private List<DomainExtension> domainExtensions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainExtension> getDomainExtensions() {
		return this.domainExtensions;
	}

	public void setDomainExtensions(List<DomainExtension> domainExtensions) {
		this.domainExtensions = domainExtensions;
	}

	public static class DomainExtension {

		private String domainExtensionId;

		private String domain;

		private String serverCertificateId;

		public String getDomainExtensionId() {
			return this.domainExtensionId;
		}

		public void setDomainExtensionId(String domainExtensionId) {
			this.domainExtensionId = domainExtensionId;
		}

		public String getBizDomain() {
			return this.domain;
		}

		public void setBizDomain(String domain) {
			this.domain = domain;
		}

		/**
		 * @deprecated use getBizDomain instead of this.
		 */
		@Deprecated
		public String getDomain() {
			return this.domain;
		}

		/**
		 * @deprecated use setBizDomain instead of this.
		 */
		@Deprecated
		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getServerCertificateId() {
			return this.serverCertificateId;
		}

		public void setServerCertificateId(String serverCertificateId) {
			this.serverCertificateId = serverCertificateId;
		}
	}

	@Override
	public DescribeDomainExtensionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainExtensionsResponseUnmarshaller.unmarshall(this, context);
	}
}
