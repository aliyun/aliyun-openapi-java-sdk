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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetGrafanaWorkspaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetGrafanaWorkspaceResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private Boolean success;

	private String traceId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private String description;

		private String grafanaWorkspaceEdition;

		private Float endTime;

		private String grafanaWorkspaceId;

		private String grafanaWorkspaceIp;

		private String snatIp;

		private String grafanaWorkspaceDomain;

		private String grafanaWorkspaceDomainStatus;

		private Boolean commercial;

		private String grafanaWorkspaceName;

		private String grafanaVersion;

		private Float gmtCreate;

		private String userId;

		private String maxAccount;

		private String regionId;

		private String protocol;

		private Boolean shareSynced;

		private String ntmId;

		private String personalDomain;

		private String personalDomainPrefix;

		private String resourceGroupId;

		private String deployType;

		private String privateIp;

		private String privateDomain;

		private List<TagsItem> tags;

		private List<String> upgradeVersion;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGrafanaWorkspaceEdition() {
			return this.grafanaWorkspaceEdition;
		}

		public void setGrafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
			this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
		}

		public Float getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Float endTime) {
			this.endTime = endTime;
		}

		public String getGrafanaWorkspaceId() {
			return this.grafanaWorkspaceId;
		}

		public void setGrafanaWorkspaceId(String grafanaWorkspaceId) {
			this.grafanaWorkspaceId = grafanaWorkspaceId;
		}

		public String getGrafanaWorkspaceIp() {
			return this.grafanaWorkspaceIp;
		}

		public void setGrafanaWorkspaceIp(String grafanaWorkspaceIp) {
			this.grafanaWorkspaceIp = grafanaWorkspaceIp;
		}

		public String getSnatIp() {
			return this.snatIp;
		}

		public void setSnatIp(String snatIp) {
			this.snatIp = snatIp;
		}

		public String getGrafanaWorkspaceDomain() {
			return this.grafanaWorkspaceDomain;
		}

		public void setGrafanaWorkspaceDomain(String grafanaWorkspaceDomain) {
			this.grafanaWorkspaceDomain = grafanaWorkspaceDomain;
		}

		public String getGrafanaWorkspaceDomainStatus() {
			return this.grafanaWorkspaceDomainStatus;
		}

		public void setGrafanaWorkspaceDomainStatus(String grafanaWorkspaceDomainStatus) {
			this.grafanaWorkspaceDomainStatus = grafanaWorkspaceDomainStatus;
		}

		public Boolean getCommercial() {
			return this.commercial;
		}

		public void setCommercial(Boolean commercial) {
			this.commercial = commercial;
		}

		public String getGrafanaWorkspaceName() {
			return this.grafanaWorkspaceName;
		}

		public void setGrafanaWorkspaceName(String grafanaWorkspaceName) {
			this.grafanaWorkspaceName = grafanaWorkspaceName;
		}

		public String getGrafanaVersion() {
			return this.grafanaVersion;
		}

		public void setGrafanaVersion(String grafanaVersion) {
			this.grafanaVersion = grafanaVersion;
		}

		public Float getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Float gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getMaxAccount() {
			return this.maxAccount;
		}

		public void setMaxAccount(String maxAccount) {
			this.maxAccount = maxAccount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Boolean getShareSynced() {
			return this.shareSynced;
		}

		public void setShareSynced(Boolean shareSynced) {
			this.shareSynced = shareSynced;
		}

		public String getNtmId() {
			return this.ntmId;
		}

		public void setNtmId(String ntmId) {
			this.ntmId = ntmId;
		}

		public String getPersonalDomain() {
			return this.personalDomain;
		}

		public void setPersonalDomain(String personalDomain) {
			this.personalDomain = personalDomain;
		}

		public String getPersonalDomainPrefix() {
			return this.personalDomainPrefix;
		}

		public void setPersonalDomainPrefix(String personalDomainPrefix) {
			this.personalDomainPrefix = personalDomainPrefix;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getPrivateIp() {
			return this.privateIp;
		}

		public void setPrivateIp(String privateIp) {
			this.privateIp = privateIp;
		}

		public String getPrivateDomain() {
			return this.privateDomain;
		}

		public void setPrivateDomain(String privateDomain) {
			this.privateDomain = privateDomain;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<String> getUpgradeVersion() {
			return this.upgradeVersion;
		}

		public void setUpgradeVersion(List<String> upgradeVersion) {
			this.upgradeVersion = upgradeVersion;
		}

		public static class TagsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public GetGrafanaWorkspaceResponse getInstance(UnmarshallerContext context) {
		return	GetGrafanaWorkspaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
