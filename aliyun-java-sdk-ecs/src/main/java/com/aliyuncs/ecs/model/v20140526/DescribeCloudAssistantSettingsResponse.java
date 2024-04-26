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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeCloudAssistantSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudAssistantSettingsResponse extends AcsResponse {

	private String requestId;

	private List<OssDeliveryConfig> ossDeliveryConfigs;

	private List<SlsDeliveryConfig> slsDeliveryConfigs;

	private AgentUpgradeConfig agentUpgradeConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OssDeliveryConfig> getOssDeliveryConfigs() {
		return this.ossDeliveryConfigs;
	}

	public void setOssDeliveryConfigs(List<OssDeliveryConfig> ossDeliveryConfigs) {
		this.ossDeliveryConfigs = ossDeliveryConfigs;
	}

	public List<SlsDeliveryConfig> getSlsDeliveryConfigs() {
		return this.slsDeliveryConfigs;
	}

	public void setSlsDeliveryConfigs(List<SlsDeliveryConfig> slsDeliveryConfigs) {
		this.slsDeliveryConfigs = slsDeliveryConfigs;
	}

	public AgentUpgradeConfig getAgentUpgradeConfig() {
		return this.agentUpgradeConfig;
	}

	public void setAgentUpgradeConfig(AgentUpgradeConfig agentUpgradeConfig) {
		this.agentUpgradeConfig = agentUpgradeConfig;
	}

	public static class OssDeliveryConfig {

		private String encryptionType;

		private String encryptionAlgorithm;

		private String deliveryType;

		private Boolean enabled;

		private String bucketName;

		private String prefix;

		private String encryptionKeyId;

		public String getEncryptionType() {
			return this.encryptionType;
		}

		public void setEncryptionType(String encryptionType) {
			this.encryptionType = encryptionType;
		}

		public String getEncryptionAlgorithm() {
			return this.encryptionAlgorithm;
		}

		public void setEncryptionAlgorithm(String encryptionAlgorithm) {
			this.encryptionAlgorithm = encryptionAlgorithm;
		}

		public String getDeliveryType() {
			return this.deliveryType;
		}

		public void setDeliveryType(String deliveryType) {
			this.deliveryType = deliveryType;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getEncryptionKeyId() {
			return this.encryptionKeyId;
		}

		public void setEncryptionKeyId(String encryptionKeyId) {
			this.encryptionKeyId = encryptionKeyId;
		}
	}

	public static class SlsDeliveryConfig {

		private String deliveryType;

		private String logstoreName;

		private Boolean enabled;

		private String projectName;

		public String getDeliveryType() {
			return this.deliveryType;
		}

		public void setDeliveryType(String deliveryType) {
			this.deliveryType = deliveryType;
		}

		public String getLogstoreName() {
			return this.logstoreName;
		}

		public void setLogstoreName(String logstoreName) {
			this.logstoreName = logstoreName;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
	}

	public static class AgentUpgradeConfig {

		private Boolean enabled;

		private String timeZone;

		private List<String> allowedUpgradeWindows;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}

		public List<String> getAllowedUpgradeWindows() {
			return this.allowedUpgradeWindows;
		}

		public void setAllowedUpgradeWindows(List<String> allowedUpgradeWindows) {
			this.allowedUpgradeWindows = allowedUpgradeWindows;
		}
	}

	@Override
	public DescribeCloudAssistantSettingsResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudAssistantSettingsResponseUnmarshaller.unmarshall(this, context);
	}
}
