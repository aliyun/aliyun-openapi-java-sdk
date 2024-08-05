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
import com.aliyuncs.arms.transform.v20190808.DescribeEnvironmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnvironmentResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String environmentId;

		private String environmentType;

		private String environmentName;

		private String environmentSubType;

		private String regionId;

		private String userId;

		private String bindResourceId;

		private String bindResourceType;

		private String bindResourceStatus;

		private String bindResourceProfile;

		private String bindVpcCidr;

		private String prometheusInstanceId;

		private String prometheusInstanceName;

		private String grafanaWorkspaceId;

		private String grafanaFolderUid;

		private String grafanaDatasourceUid;

		private String vpcId;

		private String grafanaFolderUrl;

		private String bindResourceStoreDuration;

		private String grafaDataSourceName;

		private String grafanaFolderTitle;

		private String managedType;

		private String feePackage;

		private String dbInstanceStatus;

		private String securityGroupId;

		private String vswitchId;

		private String resourceGroupId;

		private List<TagsItem> tags;

		public String getEnvironmentId() {
			return this.environmentId;
		}

		public void setEnvironmentId(String environmentId) {
			this.environmentId = environmentId;
		}

		public String getEnvironmentType() {
			return this.environmentType;
		}

		public void setEnvironmentType(String environmentType) {
			this.environmentType = environmentType;
		}

		public String getEnvironmentName() {
			return this.environmentName;
		}

		public void setEnvironmentName(String environmentName) {
			this.environmentName = environmentName;
		}

		public String getEnvironmentSubType() {
			return this.environmentSubType;
		}

		public void setEnvironmentSubType(String environmentSubType) {
			this.environmentSubType = environmentSubType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getBindResourceId() {
			return this.bindResourceId;
		}

		public void setBindResourceId(String bindResourceId) {
			this.bindResourceId = bindResourceId;
		}

		public String getBindResourceType() {
			return this.bindResourceType;
		}

		public void setBindResourceType(String bindResourceType) {
			this.bindResourceType = bindResourceType;
		}

		public String getBindResourceStatus() {
			return this.bindResourceStatus;
		}

		public void setBindResourceStatus(String bindResourceStatus) {
			this.bindResourceStatus = bindResourceStatus;
		}

		public String getBindResourceProfile() {
			return this.bindResourceProfile;
		}

		public void setBindResourceProfile(String bindResourceProfile) {
			this.bindResourceProfile = bindResourceProfile;
		}

		public String getBindVpcCidr() {
			return this.bindVpcCidr;
		}

		public void setBindVpcCidr(String bindVpcCidr) {
			this.bindVpcCidr = bindVpcCidr;
		}

		public String getPrometheusInstanceId() {
			return this.prometheusInstanceId;
		}

		public void setPrometheusInstanceId(String prometheusInstanceId) {
			this.prometheusInstanceId = prometheusInstanceId;
		}

		public String getPrometheusInstanceName() {
			return this.prometheusInstanceName;
		}

		public void setPrometheusInstanceName(String prometheusInstanceName) {
			this.prometheusInstanceName = prometheusInstanceName;
		}

		public String getGrafanaWorkspaceId() {
			return this.grafanaWorkspaceId;
		}

		public void setGrafanaWorkspaceId(String grafanaWorkspaceId) {
			this.grafanaWorkspaceId = grafanaWorkspaceId;
		}

		public String getGrafanaFolderUid() {
			return this.grafanaFolderUid;
		}

		public void setGrafanaFolderUid(String grafanaFolderUid) {
			this.grafanaFolderUid = grafanaFolderUid;
		}

		public String getGrafanaDatasourceUid() {
			return this.grafanaDatasourceUid;
		}

		public void setGrafanaDatasourceUid(String grafanaDatasourceUid) {
			this.grafanaDatasourceUid = grafanaDatasourceUid;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getGrafanaFolderUrl() {
			return this.grafanaFolderUrl;
		}

		public void setGrafanaFolderUrl(String grafanaFolderUrl) {
			this.grafanaFolderUrl = grafanaFolderUrl;
		}

		public String getBindResourceStoreDuration() {
			return this.bindResourceStoreDuration;
		}

		public void setBindResourceStoreDuration(String bindResourceStoreDuration) {
			this.bindResourceStoreDuration = bindResourceStoreDuration;
		}

		public String getGrafaDataSourceName() {
			return this.grafaDataSourceName;
		}

		public void setGrafaDataSourceName(String grafaDataSourceName) {
			this.grafaDataSourceName = grafaDataSourceName;
		}

		public String getGrafanaFolderTitle() {
			return this.grafanaFolderTitle;
		}

		public void setGrafanaFolderTitle(String grafanaFolderTitle) {
			this.grafanaFolderTitle = grafanaFolderTitle;
		}

		public String getManagedType() {
			return this.managedType;
		}

		public void setManagedType(String managedType) {
			this.managedType = managedType;
		}

		public String getFeePackage() {
			return this.feePackage;
		}

		public void setFeePackage(String feePackage) {
			this.feePackage = feePackage;
		}

		public String getDbInstanceStatus() {
			return this.dbInstanceStatus;
		}

		public void setDbInstanceStatus(String dbInstanceStatus) {
			this.dbInstanceStatus = dbInstanceStatus;
		}

		public String getSecurityGroupId() {
			return this.securityGroupId;
		}

		public void setSecurityGroupId(String securityGroupId) {
			this.securityGroupId = securityGroupId;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
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
	public DescribeEnvironmentResponse getInstance(UnmarshallerContext context) {
		return	DescribeEnvironmentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
