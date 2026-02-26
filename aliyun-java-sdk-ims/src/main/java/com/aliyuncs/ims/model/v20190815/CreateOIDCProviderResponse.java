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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.CreateOIDCProviderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOIDCProviderResponse extends AcsResponse {

	private String requestId;

	private OIDCProvider oIDCProvider;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OIDCProvider getOIDCProvider() {
		return this.oIDCProvider;
	}

	public void setOIDCProvider(OIDCProvider oIDCProvider) {
		this.oIDCProvider = oIDCProvider;
	}

	public static class OIDCProvider {

		private String updateDate;

		private String description;

		private String oIDCProviderName;

		private String createDate;

		private String arn;

		private String issuerUrl;

		private String fingerprints;

		private String clientIds;

		private String gmtCreate;

		private String gmtModified;

		private Long issuanceLimitTime;

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getOIDCProviderName() {
			return this.oIDCProviderName;
		}

		public void setOIDCProviderName(String oIDCProviderName) {
			this.oIDCProviderName = oIDCProviderName;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}

		public String getIssuerUrl() {
			return this.issuerUrl;
		}

		public void setIssuerUrl(String issuerUrl) {
			this.issuerUrl = issuerUrl;
		}

		public String getFingerprints() {
			return this.fingerprints;
		}

		public void setFingerprints(String fingerprints) {
			this.fingerprints = fingerprints;
		}

		public String getClientIds() {
			return this.clientIds;
		}

		public void setClientIds(String clientIds) {
			this.clientIds = clientIds;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getIssuanceLimitTime() {
			return this.issuanceLimitTime;
		}

		public void setIssuanceLimitTime(Long issuanceLimitTime) {
			this.issuanceLimitTime = issuanceLimitTime;
		}
	}

	@Override
	public CreateOIDCProviderResponse getInstance(UnmarshallerContext context) {
		return	CreateOIDCProviderResponseUnmarshaller.unmarshall(this, context);
	}
}
