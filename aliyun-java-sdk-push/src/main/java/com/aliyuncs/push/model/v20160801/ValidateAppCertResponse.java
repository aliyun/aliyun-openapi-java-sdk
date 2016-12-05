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
package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.ValidateAppCertResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ValidateAppCertResponse extends AcsResponse {

	private String requestId;

	private AppCertInfo appCertInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppCertInfo getAppCertInfo() {
		return this.appCertInfo;
	}

	public void setAppCertInfo(AppCertInfo appCertInfo) {
		this.appCertInfo = appCertInfo;
	}

	public static class AppCertInfo {

		private String appName;

		private String certType;

		private Boolean devCert;

		private Long expirationDate;

		private Long generateDate;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public Boolean getDevCert() {
			return this.devCert;
		}

		public void setDevCert(Boolean devCert) {
			this.devCert = devCert;
		}

		public Long getExpirationDate() {
			return this.expirationDate;
		}

		public void setExpirationDate(Long expirationDate) {
			this.expirationDate = expirationDate;
		}

		public Long getGenerateDate() {
			return this.generateDate;
		}

		public void setGenerateDate(Long generateDate) {
			this.generateDate = generateDate;
		}
	}

	@Override
	public ValidateAppCertResponse getInstance(UnmarshallerContext context) {
		return	ValidateAppCertResponseUnmarshaller.unmarshall(this, context);
	}
}
