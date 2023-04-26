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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20160314.ListServiceSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceSettingsResponse extends AcsResponse {

	private String requestId;

	private CloudAssistantDeliverySettings cloudAssistantDeliverySettings;

	private SessionManagerDeliverySetting sessionManagerDeliverySetting;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public CloudAssistantDeliverySettings getCloudAssistantDeliverySettings() {
		return this.cloudAssistantDeliverySettings;
	}

	public void setCloudAssistantDeliverySettings(CloudAssistantDeliverySettings cloudAssistantDeliverySettings) {
		this.cloudAssistantDeliverySettings = cloudAssistantDeliverySettings;
	}

	public SessionManagerDeliverySetting getSessionManagerDeliverySetting() {
		return this.sessionManagerDeliverySetting;
	}

	public void setSessionManagerDeliverySetting(SessionManagerDeliverySetting sessionManagerDeliverySetting) {
		this.sessionManagerDeliverySetting = sessionManagerDeliverySetting;
	}

	public static class CloudAssistantDeliverySettings {

		private String slsProjectName;

		private String ossKeyPrefix;

		private Boolean slsEnabled;

		private Boolean ossEnabled;

		private String slsLogstoreName;

		private String ossBucketName;

		public String getSlsProjectName() {
			return this.slsProjectName;
		}

		public void setSlsProjectName(String slsProjectName) {
			this.slsProjectName = slsProjectName;
		}

		public String getOssKeyPrefix() {
			return this.ossKeyPrefix;
		}

		public void setOssKeyPrefix(String ossKeyPrefix) {
			this.ossKeyPrefix = ossKeyPrefix;
		}

		public Boolean getSlsEnabled() {
			return this.slsEnabled;
		}

		public void setSlsEnabled(Boolean slsEnabled) {
			this.slsEnabled = slsEnabled;
		}

		public Boolean getOssEnabled() {
			return this.ossEnabled;
		}

		public void setOssEnabled(Boolean ossEnabled) {
			this.ossEnabled = ossEnabled;
		}

		public String getSlsLogstoreName() {
			return this.slsLogstoreName;
		}

		public void setSlsLogstoreName(String slsLogstoreName) {
			this.slsLogstoreName = slsLogstoreName;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}
	}

	public static class SessionManagerDeliverySetting {

		private Boolean ossEnabled;

		private String ossBucketName;

		private String ossKeyPrefix;

		private String ossEncryptionType;

		private String ossEncryptionAlgorithm;

		private String ossEncryptionKeyId;

		private Boolean slsEnabled;

		private String slsProjectName;

		private String slsLogstoreName;

		public Boolean getOssEnabled() {
			return this.ossEnabled;
		}

		public void setOssEnabled(Boolean ossEnabled) {
			this.ossEnabled = ossEnabled;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getOssKeyPrefix() {
			return this.ossKeyPrefix;
		}

		public void setOssKeyPrefix(String ossKeyPrefix) {
			this.ossKeyPrefix = ossKeyPrefix;
		}

		public String getOssEncryptionType() {
			return this.ossEncryptionType;
		}

		public void setOssEncryptionType(String ossEncryptionType) {
			this.ossEncryptionType = ossEncryptionType;
		}

		public String getOssEncryptionAlgorithm() {
			return this.ossEncryptionAlgorithm;
		}

		public void setOssEncryptionAlgorithm(String ossEncryptionAlgorithm) {
			this.ossEncryptionAlgorithm = ossEncryptionAlgorithm;
		}

		public String getOssEncryptionKeyId() {
			return this.ossEncryptionKeyId;
		}

		public void setOssEncryptionKeyId(String ossEncryptionKeyId) {
			this.ossEncryptionKeyId = ossEncryptionKeyId;
		}

		public Boolean getSlsEnabled() {
			return this.slsEnabled;
		}

		public void setSlsEnabled(Boolean slsEnabled) {
			this.slsEnabled = slsEnabled;
		}

		public String getSlsProjectName() {
			return this.slsProjectName;
		}

		public void setSlsProjectName(String slsProjectName) {
			this.slsProjectName = slsProjectName;
		}

		public String getSlsLogstoreName() {
			return this.slsLogstoreName;
		}

		public void setSlsLogstoreName(String slsLogstoreName) {
			this.slsLogstoreName = slsLogstoreName;
		}
	}

	@Override
	public ListServiceSettingsResponse getInstance(UnmarshallerContext context) {
		return	ListServiceSettingsResponseUnmarshaller.unmarshall(this, context);
	}
}
