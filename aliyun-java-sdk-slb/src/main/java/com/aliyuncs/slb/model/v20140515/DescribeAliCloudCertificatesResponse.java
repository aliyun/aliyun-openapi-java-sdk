/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeAliCloudCertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAliCloudCertificatesResponse extends AcsResponse {

	private String requestId;

	private List<AliCloudCertificate> aliCloudCertificates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AliCloudCertificate> getAliCloudCertificates() {
		return this.aliCloudCertificates;
	}

	public void setAliCloudCertificates(List<AliCloudCertificate> aliCloudCertificates) {
		this.aliCloudCertificates = aliCloudCertificates;
	}

	public static class AliCloudCertificate {

		private String aliCloudCertificateId;

		private String aliCloudCertificateName;

		private String fingerprint;

		private String domainName;

		private String issuer;

		public String getAliCloudCertificateId() {
			return this.aliCloudCertificateId;
		}

		public void setAliCloudCertificateId(String aliCloudCertificateId) {
			this.aliCloudCertificateId = aliCloudCertificateId;
		}

		public String getAliCloudCertificateName() {
			return this.aliCloudCertificateName;
		}

		public void setAliCloudCertificateName(String aliCloudCertificateName) {
			this.aliCloudCertificateName = aliCloudCertificateName;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getIssuer() {
			return this.issuer;
		}

		public void setIssuer(String issuer) {
			this.issuer = issuer;
		}
	}

	@Override
	public DescribeAliCloudCertificatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAliCloudCertificatesResponseUnmarshaller.unmarshall(this, context);
	}
}
