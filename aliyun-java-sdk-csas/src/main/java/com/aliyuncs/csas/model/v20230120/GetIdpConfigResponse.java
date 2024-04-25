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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.GetIdpConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIdpConfigResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private String name;

		private String type;

		private String idpMetadata;

		private String accessKey;

		private String accessKeySecret;

		private String status;

		private String mfaConfigType;

		private String updateTime;

		private String getGroupUrl;

		private String description;

		private String multiIdpInfo;

		private String pcLoginType;

		private String mobileLoginType;

		private String mobileMfaConfigType;

		private String verifyToken;

		private String verifyAesKey;

		private String verifyUrl;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIdpMetadata() {
			return this.idpMetadata;
		}

		public void setIdpMetadata(String idpMetadata) {
			this.idpMetadata = idpMetadata;
		}

		public String getAccessKey() {
			return this.accessKey;
		}

		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		public String getAccessKeySecret() {
			return this.accessKeySecret;
		}

		public void setAccessKeySecret(String accessKeySecret) {
			this.accessKeySecret = accessKeySecret;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMfaConfigType() {
			return this.mfaConfigType;
		}

		public void setMfaConfigType(String mfaConfigType) {
			this.mfaConfigType = mfaConfigType;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getGetGroupUrl() {
			return this.getGroupUrl;
		}

		public void setGetGroupUrl(String getGroupUrl) {
			this.getGroupUrl = getGroupUrl;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMultiIdpInfo() {
			return this.multiIdpInfo;
		}

		public void setMultiIdpInfo(String multiIdpInfo) {
			this.multiIdpInfo = multiIdpInfo;
		}

		public String getPcLoginType() {
			return this.pcLoginType;
		}

		public void setPcLoginType(String pcLoginType) {
			this.pcLoginType = pcLoginType;
		}

		public String getMobileLoginType() {
			return this.mobileLoginType;
		}

		public void setMobileLoginType(String mobileLoginType) {
			this.mobileLoginType = mobileLoginType;
		}

		public String getMobileMfaConfigType() {
			return this.mobileMfaConfigType;
		}

		public void setMobileMfaConfigType(String mobileMfaConfigType) {
			this.mobileMfaConfigType = mobileMfaConfigType;
		}

		public String getVerifyToken() {
			return this.verifyToken;
		}

		public void setVerifyToken(String verifyToken) {
			this.verifyToken = verifyToken;
		}

		public String getVerifyAesKey() {
			return this.verifyAesKey;
		}

		public void setVerifyAesKey(String verifyAesKey) {
			this.verifyAesKey = verifyAesKey;
		}

		public String getVerifyUrl() {
			return this.verifyUrl;
		}

		public void setVerifyUrl(String verifyUrl) {
			this.verifyUrl = verifyUrl;
		}
	}

	@Override
	public GetIdpConfigResponse getInstance(UnmarshallerContext context) {
		return	GetIdpConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
