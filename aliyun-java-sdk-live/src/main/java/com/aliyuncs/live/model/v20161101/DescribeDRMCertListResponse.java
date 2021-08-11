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
import com.aliyuncs.live.transform.v20161101.DescribeDRMCertListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDRMCertListResponse extends AcsResponse {

	private String requestId;

	private List<CertInfo> dRMCertInfoListList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CertInfo> getDRMCertInfoListList() {
		return this.dRMCertInfoListList;
	}

	public void setDRMCertInfoListList(List<CertInfo> dRMCertInfoListList) {
		this.dRMCertInfoListList = dRMCertInfoListList;
	}

	public static class CertInfo {

		private String certId;

		private String certName;

		private String servCert;

		private String privateKey;

		private String passphrase;

		private String ask;

		private String description;

		private String createDate;

		public String getCertId() {
			return this.certId;
		}

		public void setCertId(String certId) {
			this.certId = certId;
		}

		public String getCertName() {
			return this.certName;
		}

		public void setCertName(String certName) {
			this.certName = certName;
		}

		public String getServCert() {
			return this.servCert;
		}

		public void setServCert(String servCert) {
			this.servCert = servCert;
		}

		public String getPrivateKey() {
			return this.privateKey;
		}

		public void setPrivateKey(String privateKey) {
			this.privateKey = privateKey;
		}

		public String getPassphrase() {
			return this.passphrase;
		}

		public void setPassphrase(String passphrase) {
			this.passphrase = passphrase;
		}

		public String getAsk() {
			return this.ask;
		}

		public void setAsk(String ask) {
			this.ask = ask;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}

	@Override
	public DescribeDRMCertListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDRMCertListResponseUnmarshaller.unmarshall(this, context);
	}
}
