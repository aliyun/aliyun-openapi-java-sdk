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

package com.aliyuncs.waf_openapi.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20190910.DescribeCertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCertificatesResponse extends AcsResponse {

	private String requestId;

	private List<Certificate> certificates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Certificate> getCertificates() {
		return this.certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	public static class Certificate {

		private String commonName;

		private Boolean isUsing;

		private String certificateName;

		private Long certificateId;

		private List<String> sans;

		public String getCommonName() {
			return this.commonName;
		}

		public void setCommonName(String commonName) {
			this.commonName = commonName;
		}

		public Boolean getIsUsing() {
			return this.isUsing;
		}

		public void setIsUsing(Boolean isUsing) {
			this.isUsing = isUsing;
		}

		public String getCertificateName() {
			return this.certificateName;
		}

		public void setCertificateName(String certificateName) {
			this.certificateName = certificateName;
		}

		public Long getCertificateId() {
			return this.certificateId;
		}

		public void setCertificateId(Long certificateId) {
			this.certificateId = certificateId;
		}

		public List<String> getSans() {
			return this.sans;
		}

		public void setSans(List<String> sans) {
			this.sans = sans;
		}
	}

	@Override
	public DescribeCertificatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCertificatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
