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
import com.aliyuncs.arms.transform.v20190808.ListEnvironmentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvironmentsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

		private Long total;

		private List<EnvironmentsItem> environments;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<EnvironmentsItem> getEnvironments() {
			return this.environments;
		}

		public void setEnvironments(List<EnvironmentsItem> environments) {
			this.environments = environments;
		}

		public static class EnvironmentsItem {

			private String userId;

			private String bindResourceId;

			private String bindResourceProfile;

			private String bindResourceType;

			private String bindVpcCidr;

			private String createTime;

			private String createdUserId;

			private String environmentId;

			private String environmentName;

			private String environmentType;

			private String grafanaFolderTitle;

			private String grafanaFolderUid;

			private Long prometheusId;

			private String prometheusInstanceId;

			private String regionId;

			private String resourceGroupId;

			private String grafanaDatasourceUid;

			private Integer releaseCount;

			private String latestReleaseCreateTime;

			private String managedType;

			private String feePackage;

			private List<AddonsItem> addons;

			private List<FeaturesItem> features;

			private List<TagsItem> tags;

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

			public String getBindResourceProfile() {
				return this.bindResourceProfile;
			}

			public void setBindResourceProfile(String bindResourceProfile) {
				this.bindResourceProfile = bindResourceProfile;
			}

			public String getBindResourceType() {
				return this.bindResourceType;
			}

			public void setBindResourceType(String bindResourceType) {
				this.bindResourceType = bindResourceType;
			}

			public String getBindVpcCidr() {
				return this.bindVpcCidr;
			}

			public void setBindVpcCidr(String bindVpcCidr) {
				this.bindVpcCidr = bindVpcCidr;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getCreatedUserId() {
				return this.createdUserId;
			}

			public void setCreatedUserId(String createdUserId) {
				this.createdUserId = createdUserId;
			}

			public String getEnvironmentId() {
				return this.environmentId;
			}

			public void setEnvironmentId(String environmentId) {
				this.environmentId = environmentId;
			}

			public String getEnvironmentName() {
				return this.environmentName;
			}

			public void setEnvironmentName(String environmentName) {
				this.environmentName = environmentName;
			}

			public String getEnvironmentType() {
				return this.environmentType;
			}

			public void setEnvironmentType(String environmentType) {
				this.environmentType = environmentType;
			}

			public String getGrafanaFolderTitle() {
				return this.grafanaFolderTitle;
			}

			public void setGrafanaFolderTitle(String grafanaFolderTitle) {
				this.grafanaFolderTitle = grafanaFolderTitle;
			}

			public String getGrafanaFolderUid() {
				return this.grafanaFolderUid;
			}

			public void setGrafanaFolderUid(String grafanaFolderUid) {
				this.grafanaFolderUid = grafanaFolderUid;
			}

			public Long getPrometheusId() {
				return this.prometheusId;
			}

			public void setPrometheusId(Long prometheusId) {
				this.prometheusId = prometheusId;
			}

			public String getPrometheusInstanceId() {
				return this.prometheusInstanceId;
			}

			public void setPrometheusInstanceId(String prometheusInstanceId) {
				this.prometheusInstanceId = prometheusInstanceId;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getResourceGroupId() {
				return this.resourceGroupId;
			}

			public void setResourceGroupId(String resourceGroupId) {
				this.resourceGroupId = resourceGroupId;
			}

			public String getGrafanaDatasourceUid() {
				return this.grafanaDatasourceUid;
			}

			public void setGrafanaDatasourceUid(String grafanaDatasourceUid) {
				this.grafanaDatasourceUid = grafanaDatasourceUid;
			}

			public Integer getReleaseCount() {
				return this.releaseCount;
			}

			public void setReleaseCount(Integer releaseCount) {
				this.releaseCount = releaseCount;
			}

			public String getLatestReleaseCreateTime() {
				return this.latestReleaseCreateTime;
			}

			public void setLatestReleaseCreateTime(String latestReleaseCreateTime) {
				this.latestReleaseCreateTime = latestReleaseCreateTime;
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

			public List<AddonsItem> getAddons() {
				return this.addons;
			}

			public void setAddons(List<AddonsItem> addons) {
				this.addons = addons;
			}

			public List<FeaturesItem> getFeatures() {
				return this.features;
			}

			public void setFeatures(List<FeaturesItem> features) {
				this.features = features;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public static class AddonsItem {

				private String alias;

				private String description;

				private String icon;

				private String name;

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getIcon() {
					return this.icon;
				}

				public void setIcon(String icon) {
					this.icon = icon;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
			}

			public static class FeaturesItem {

				private String alias;

				private String description;

				private String icon;

				private String name;

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getIcon() {
					return this.icon;
				}

				public void setIcon(String icon) {
					this.icon = icon;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}
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
	}

	@Override
	public ListEnvironmentsResponse getInstance(UnmarshallerContext context) {
		return	ListEnvironmentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
