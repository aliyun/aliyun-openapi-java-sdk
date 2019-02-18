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

package com.aliyuncs.industry_brain.model.v20180712;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.industry_brain.transform.v20180712.GetOSSImageAccessResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOSSImageAccessResponse extends AcsResponse {

	private String requestId;

	private StsInfo stsInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public StsInfo getStsInfo() {
		return this.stsInfo;
	}

	public void setStsInfo(StsInfo stsInfo) {
		this.stsInfo = stsInfo;
	}

	public static class StsInfo {

		private String accessKeyId;

		private String accessKeySecret;

		private String securityToken;

		private String expiration;

		private String bucketName;

		private String endpoint;

		private List<String> prefixList;

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getBizSecurityToken() {
			return this.securityToken;
		}

		public void setBizSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		/**
		 * @deprecated use getBizSecurityToken instead of this.
		 */
		@Deprecated
		public String getSecurityToken() {
			return this.securityToken;
		}

		/**
		 * @deprecated use setBizSecurityToken instead of this.
		 */
		@Deprecated
		public void setSecurityToken(String securityToken) {
			this.securityToken = securityToken;
		}

		public String getExpiration() {
			return this.expiration;
		}

		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getEndpoint() {
			return this.endpoint;
		}

		public void setEndpoint(String endpoint) {
			this.endpoint = endpoint;
		}

		public List<String> getPrefixList() {
			return this.prefixList;
		}

		public void setPrefixList(List<String> prefixList) {
			this.prefixList = prefixList;
		}
	}

	@Override
	public GetOSSImageAccessResponse getInstance(UnmarshallerContext context) {
		return	GetOSSImageAccessResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
