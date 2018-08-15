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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveCertificateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveCertificateListResponse extends AcsResponse {

	private String requestId;

	private CertificateListModel certificateListModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CertificateListModel getCertificateListModel() {
		return this.certificateListModel;
	}

	public void setCertificateListModel(CertificateListModel certificateListModel) {
		this.certificateListModel = certificateListModel;
	}

	public static class CertificateListModel {

		private Integer count;

		private List<Cert> certList;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<Cert> getCertList() {
			return this.certList;
		}

		public void setCertList(List<Cert> certList) {
			this.certList = certList;
		}

		public static class Cert {

			private String certName;

			private Long certId;

			private String fingerprint;

			private String common;

			private String issuer;

			private Long lastTime;

			public String getCertName() {
				return this.certName;
			}

			public void setCertName(String certName) {
				this.certName = certName;
			}

			public Long getCertId() {
				return this.certId;
			}

			public void setCertId(Long certId) {
				this.certId = certId;
			}

			public String getFingerprint() {
				return this.fingerprint;
			}

			public void setFingerprint(String fingerprint) {
				this.fingerprint = fingerprint;
			}

			public String getCommon() {
				return this.common;
			}

			public void setCommon(String common) {
				this.common = common;
			}

			public String getIssuer() {
				return this.issuer;
			}

			public void setIssuer(String issuer) {
				this.issuer = issuer;
			}

			public Long getLastTime() {
				return this.lastTime;
			}

			public void setLastTime(Long lastTime) {
				this.lastTime = lastTime;
			}
		}
	}

	@Override
	public DescribeLiveCertificateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveCertificateListResponseUnmarshaller.unmarshall(this, context);
	}
}
