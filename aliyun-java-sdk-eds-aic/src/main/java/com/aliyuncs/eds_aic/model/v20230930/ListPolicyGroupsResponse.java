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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.ListPolicyGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPolicyGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private List<Data> policyGroupModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Data> getPolicyGroupModel() {
		return this.policyGroupModel;
	}

	public void setPolicyGroupModel(List<Data> policyGroupModel) {
		this.policyGroupModel = policyGroupModel;
	}

	public static class Data {

		private String policyGroupId;

		private String policyGroupName;

		private String gmtCreate;

		private String clipboard;

		private String html5FileTransfer;

		private String cameraRedirect;

		private String localDrive;

		private String lockResolution;

		private Integer sessionResolutionHeight;

		private Integer sessionResolutionWidth;

		private List<PolicyConfigList> policyConfigs;

		private NetRedirectPolicy netRedirectPolicy;

		private PolicyRelatedResources policyRelatedResources;

		private Watermark watermark;

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getPolicyGroupName() {
			return this.policyGroupName;
		}

		public void setPolicyGroupName(String policyGroupName) {
			this.policyGroupName = policyGroupName;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getClipboard() {
			return this.clipboard;
		}

		public void setClipboard(String clipboard) {
			this.clipboard = clipboard;
		}

		public String getHtml5FileTransfer() {
			return this.html5FileTransfer;
		}

		public void setHtml5FileTransfer(String html5FileTransfer) {
			this.html5FileTransfer = html5FileTransfer;
		}

		public String getCameraRedirect() {
			return this.cameraRedirect;
		}

		public void setCameraRedirect(String cameraRedirect) {
			this.cameraRedirect = cameraRedirect;
		}

		public String getLocalDrive() {
			return this.localDrive;
		}

		public void setLocalDrive(String localDrive) {
			this.localDrive = localDrive;
		}

		public String getLockResolution() {
			return this.lockResolution;
		}

		public void setLockResolution(String lockResolution) {
			this.lockResolution = lockResolution;
		}

		public Integer getSessionResolutionHeight() {
			return this.sessionResolutionHeight;
		}

		public void setSessionResolutionHeight(Integer sessionResolutionHeight) {
			this.sessionResolutionHeight = sessionResolutionHeight;
		}

		public Integer getSessionResolutionWidth() {
			return this.sessionResolutionWidth;
		}

		public void setSessionResolutionWidth(Integer sessionResolutionWidth) {
			this.sessionResolutionWidth = sessionResolutionWidth;
		}

		public List<PolicyConfigList> getPolicyConfigs() {
			return this.policyConfigs;
		}

		public void setPolicyConfigs(List<PolicyConfigList> policyConfigs) {
			this.policyConfigs = policyConfigs;
		}

		public NetRedirectPolicy getNetRedirectPolicy() {
			return this.netRedirectPolicy;
		}

		public void setNetRedirectPolicy(NetRedirectPolicy netRedirectPolicy) {
			this.netRedirectPolicy = netRedirectPolicy;
		}

		public PolicyRelatedResources getPolicyRelatedResources() {
			return this.policyRelatedResources;
		}

		public void setPolicyRelatedResources(PolicyRelatedResources policyRelatedResources) {
			this.policyRelatedResources = policyRelatedResources;
		}

		public Watermark getWatermark() {
			return this.watermark;
		}

		public void setWatermark(Watermark watermark) {
			this.watermark = watermark;
		}

		public static class PolicyConfigList {

			private String configKey;

			private String configValue;

			public String getConfigKey() {
				return this.configKey;
			}

			public void setConfigKey(String configKey) {
				this.configKey = configKey;
			}

			public String getConfigValue() {
				return this.configValue;
			}

			public void setConfigValue(String configValue) {
				this.configValue = configValue;
			}
		}

		public static class NetRedirectPolicy {

			private String netRedirect;

			private String customProxy;

			private String proxyType;

			private String hostAddr;

			private String port;

			private String proxyUserName;

			private String proxyPassword;

			private List<RulesItem> rules;

			public String getNetRedirect() {
				return this.netRedirect;
			}

			public void setNetRedirect(String netRedirect) {
				this.netRedirect = netRedirect;
			}

			public String getCustomProxy() {
				return this.customProxy;
			}

			public void setCustomProxy(String customProxy) {
				this.customProxy = customProxy;
			}

			public String getProxyType() {
				return this.proxyType;
			}

			public void setProxyType(String proxyType) {
				this.proxyType = proxyType;
			}

			public String getHostAddr() {
				return this.hostAddr;
			}

			public void setHostAddr(String hostAddr) {
				this.hostAddr = hostAddr;
			}

			public String getPort() {
				return this.port;
			}

			public void setPort(String port) {
				this.port = port;
			}

			public String getProxyUserName() {
				return this.proxyUserName;
			}

			public void setProxyUserName(String proxyUserName) {
				this.proxyUserName = proxyUserName;
			}

			public String getProxyPassword() {
				return this.proxyPassword;
			}

			public void setProxyPassword(String proxyPassword) {
				this.proxyPassword = proxyPassword;
			}

			public List<RulesItem> getRules() {
				return this.rules;
			}

			public void setRules(List<RulesItem> rules) {
				this.rules = rules;
			}

			public static class RulesItem {

				private String target;

				private String ruleType;

				public String getTarget() {
					return this.target;
				}

				public void setTarget(String target) {
					this.target = target;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}
			}
		}

		public static class PolicyRelatedResources {

			private List<String> androidInstanceGroupIds;

			private List<String> cloudPhoneMatrixIds;

			public List<String> getAndroidInstanceGroupIds() {
				return this.androidInstanceGroupIds;
			}

			public void setAndroidInstanceGroupIds(List<String> androidInstanceGroupIds) {
				this.androidInstanceGroupIds = androidInstanceGroupIds;
			}

			public List<String> getCloudPhoneMatrixIds() {
				return this.cloudPhoneMatrixIds;
			}

			public void setCloudPhoneMatrixIds(List<String> cloudPhoneMatrixIds) {
				this.cloudPhoneMatrixIds = cloudPhoneMatrixIds;
			}
		}

		public static class Watermark {

			private String watermarkSwitch;

			private String watermarkCustomText;

			private Integer watermarkFontSize;

			private Integer watermarkColor;

			private Integer watermarkTransparencyValue;

			private List<String> watermarkTypes;

			public String getWatermarkSwitch() {
				return this.watermarkSwitch;
			}

			public void setWatermarkSwitch(String watermarkSwitch) {
				this.watermarkSwitch = watermarkSwitch;
			}

			public String getWatermarkCustomText() {
				return this.watermarkCustomText;
			}

			public void setWatermarkCustomText(String watermarkCustomText) {
				this.watermarkCustomText = watermarkCustomText;
			}

			public Integer getWatermarkFontSize() {
				return this.watermarkFontSize;
			}

			public void setWatermarkFontSize(Integer watermarkFontSize) {
				this.watermarkFontSize = watermarkFontSize;
			}

			public Integer getWatermarkColor() {
				return this.watermarkColor;
			}

			public void setWatermarkColor(Integer watermarkColor) {
				this.watermarkColor = watermarkColor;
			}

			public Integer getWatermarkTransparencyValue() {
				return this.watermarkTransparencyValue;
			}

			public void setWatermarkTransparencyValue(Integer watermarkTransparencyValue) {
				this.watermarkTransparencyValue = watermarkTransparencyValue;
			}

			public List<String> getWatermarkTypes() {
				return this.watermarkTypes;
			}

			public void setWatermarkTypes(List<String> watermarkTypes) {
				this.watermarkTypes = watermarkTypes;
			}
		}
	}

	@Override
	public ListPolicyGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListPolicyGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
