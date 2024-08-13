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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodCertificateListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodCertificateListResponse extends AcsResponse {

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

			private Long lastTime;

			private String fingerprint;

			private String certName;

			private String issuer;

			private Long certId;

			private String common;

			private Long createTime;

			private Long endTime;

			private String algorithm;

			private String certIdentifier;

			private Boolean domainMatchCert;

			private String instanceId;

			private String signAlgorithm;

			public Long getLastTime() {
				return this.lastTime;
			}

			public void setLastTime(Long lastTime) {
				this.lastTime = lastTime;
			}

			public String getFingerprint() {
				return this.fingerprint;
			}

			public void setFingerprint(String fingerprint) {
				this.fingerprint = fingerprint;
			}

			public String getCertName() {
				return this.certName;
			}

			public void setCertName(String certName) {
				this.certName = certName;
			}

			public String getIssuer() {
				return this.issuer;
			}

			public void setIssuer(String issuer) {
				this.issuer = issuer;
			}

			public Long getCertId() {
				return this.certId;
			}

			public void setCertId(Long certId) {
				this.certId = certId;
			}

			public String getCommon() {
				return this.common;
			}

			public void setCommon(String common) {
				this.common = common;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getAlgorithm() {
				return this.algorithm;
			}

			public void setAlgorithm(String algorithm) {
				this.algorithm = algorithm;
			}

			public String getCertIdentifier() {
				return this.certIdentifier;
			}

			public void setCertIdentifier(String certIdentifier) {
				this.certIdentifier = certIdentifier;
			}

			public Boolean getDomainMatchCert() {
				return this.domainMatchCert;
			}

			public void setDomainMatchCert(Boolean domainMatchCert) {
				this.domainMatchCert = domainMatchCert;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getSignAlgorithm() {
				return this.signAlgorithm;
			}

			public void setSignAlgorithm(String signAlgorithm) {
				this.signAlgorithm = signAlgorithm;
			}
		}
	}

	@Override
	public DescribeVodCertificateListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodCertificateListResponseUnmarshaller.unmarshall(this, context);
	}
}
