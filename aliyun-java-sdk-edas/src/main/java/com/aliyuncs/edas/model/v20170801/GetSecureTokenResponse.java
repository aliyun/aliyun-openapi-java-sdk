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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.GetSecureTokenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecureTokenResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private SecureToken secureToken;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SecureToken getSecureToken() {
		return this.secureToken;
	}

	public void setSecureToken(SecureToken secureToken) {
		this.secureToken = secureToken;
	}

	public static class SecureToken {

		private String secretKey;

		private String accessKey;

		private String belongRegion;

		private String description;

		private String regionName;

		private String edasId;

		private String addressServerHost;

		private String userId;

		private Long id;

		private String tenantId;

		private String regionId;

		private String mseRegistryType;

		private String mseInstanceId;

		private String mseInternetAddress;

		private String mseIntranetAddress;

		public String getSecretKey() {
			return this.secretKey;
		}

		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}

		public String getAccessKey() {
			return this.accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getBelongRegion() {
			return this.belongRegion;
		}

		public void setBelongRegion(String belongRegion) {
			this.belongRegion = belongRegion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getEdasId() {
			return this.edasId;
		}

		public void setEdasId(String edasId) {
			this.edasId = edasId;
		}

		public String getAddressServerHost() {
			return this.addressServerHost;
		}

		public void setAddressServerHost(String addressServerHost) {
			this.addressServerHost = addressServerHost;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getMseRegistryType() {
			return this.mseRegistryType;
		}

		public void setMseRegistryType(String mseRegistryType) {
			this.mseRegistryType = mseRegistryType;
		}

		public String getMseInstanceId() {
			return this.mseInstanceId;
		}

		public void setMseInstanceId(String mseInstanceId) {
			this.mseInstanceId = mseInstanceId;
		}

		public String getMseInternetAddress() {
			return this.mseInternetAddress;
		}

		public void setMseInternetAddress(String mseInternetAddress) {
			this.mseInternetAddress = mseInternetAddress;
		}

		public String getMseIntranetAddress() {
			return this.mseIntranetAddress;
		}

		public void setMseIntranetAddress(String mseIntranetAddress) {
			this.mseIntranetAddress = mseIntranetAddress;
		}
	}

	@Override
	public GetSecureTokenResponse getInstance(UnmarshallerContext context) {
		return	GetSecureTokenResponseUnmarshaller.unmarshall(this, context);
	}
}
