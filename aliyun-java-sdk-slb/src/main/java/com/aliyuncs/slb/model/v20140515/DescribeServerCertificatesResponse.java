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
import com.aliyuncs.slb.transform.v20140515.DescribeServerCertificatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServerCertificatesResponse extends AcsResponse {

	private String requestId;

	private List<ServerCertificate> serverCertificates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ServerCertificate> getServerCertificates() {
		return this.serverCertificates;
	}

	public void setServerCertificates(List<ServerCertificate> serverCertificates) {
		this.serverCertificates = serverCertificates;
	}

	public static class ServerCertificate {

		private String serverCertificateId;

		private String fingerprint;

		private String serverCertificateName;

		private String regionId;

		private String regionIdAlias;

		public String getServerCertificateId() {
			return this.serverCertificateId;
		}

		public void setServerCertificateId(String serverCertificateId) {
			this.serverCertificateId = serverCertificateId;
		}

		public String getFingerprint() {
			return this.fingerprint;
		}

		public void setFingerprint(String fingerprint) {
			this.fingerprint = fingerprint;
		}

		public String getServerCertificateName() {
			return this.serverCertificateName;
		}

		public void setServerCertificateName(String serverCertificateName) {
			this.serverCertificateName = serverCertificateName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionIdAlias() {
			return this.regionIdAlias;
		}

		public void setRegionIdAlias(String regionIdAlias) {
			this.regionIdAlias = regionIdAlias;
		}
	}

	@Override
	public DescribeServerCertificatesResponse getInstance(UnmarshallerContext context) {
		return	DescribeServerCertificatesResponseUnmarshaller.unmarshall(this, context);
	}
}
