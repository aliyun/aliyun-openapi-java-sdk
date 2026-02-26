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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.ListServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServicesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<Service> services;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<Service> getServices() {
		return this.services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public static class Service {

		private String status;

		private Boolean defaultVersion;

		private String publishTime;

		private String version;

		private String deployType;

		private String serviceId;

		private String supplierUrl;

		private String serviceType;

		private String supplierName;

		private String commodityCode;

		private String createTime;

		private String updateTime;

		private String shareType;

		private String approvalType;

		private String versionName;

		private String artifactId;

		private String artifactVersion;

		private String sourceImage;

		private String relationType;

		private String trialType;

		private String tenantType;

		private String resourceGroupId;

		private String sourceServiceId;

		private String sourceServiceVersion;

		private String sourceSupplierName;

		private String resellServiceId;

		private String latestResellSourceServiceVersion;

		private String resellApplyStatus;

		private String virtualInternetService;

		private String categories;

		private String serviceDiscoverable;

		private Boolean hasDraft;

		private Boolean hasBeta;

		private String buildInfo;

		private List<ServiceInfo> serviceInfos;

		private List<Tag> tags;

		private Commodity commodity;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getDefaultVersion() {
			return this.defaultVersion;
		}

		public void setDefaultVersion(Boolean defaultVersion) {
			this.defaultVersion = defaultVersion;
		}

		public String getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(String publishTime) {
			this.publishTime = publishTime;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getDeployType() {
			return this.deployType;
		}

		public void setDeployType(String deployType) {
			this.deployType = deployType;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getSupplierUrl() {
			return this.supplierUrl;
		}

		public void setSupplierUrl(String supplierUrl) {
			this.supplierUrl = supplierUrl;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getSupplierName() {
			return this.supplierName;
		}

		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getShareType() {
			return this.shareType;
		}

		public void setShareType(String shareType) {
			this.shareType = shareType;
		}

		public String getApprovalType() {
			return this.approvalType;
		}

		public void setApprovalType(String approvalType) {
			this.approvalType = approvalType;
		}

		public String getVersionName() {
			return this.versionName;
		}

		public void setVersionName(String versionName) {
			this.versionName = versionName;
		}

		public String getArtifactId() {
			return this.artifactId;
		}

		public void setArtifactId(String artifactId) {
			this.artifactId = artifactId;
		}

		public String getArtifactVersion() {
			return this.artifactVersion;
		}

		public void setArtifactVersion(String artifactVersion) {
			this.artifactVersion = artifactVersion;
		}

		public String getSourceImage() {
			return this.sourceImage;
		}

		public void setSourceImage(String sourceImage) {
			this.sourceImage = sourceImage;
		}

		public String getRelationType() {
			return this.relationType;
		}

		public void setRelationType(String relationType) {
			this.relationType = relationType;
		}

		public String getTrialType() {
			return this.trialType;
		}

		public void setTrialType(String trialType) {
			this.trialType = trialType;
		}

		public String getTenantType() {
			return this.tenantType;
		}

		public void setTenantType(String tenantType) {
			this.tenantType = tenantType;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getSourceServiceId() {
			return this.sourceServiceId;
		}

		public void setSourceServiceId(String sourceServiceId) {
			this.sourceServiceId = sourceServiceId;
		}

		public String getSourceServiceVersion() {
			return this.sourceServiceVersion;
		}

		public void setSourceServiceVersion(String sourceServiceVersion) {
			this.sourceServiceVersion = sourceServiceVersion;
		}

		public String getSourceSupplierName() {
			return this.sourceSupplierName;
		}

		public void setSourceSupplierName(String sourceSupplierName) {
			this.sourceSupplierName = sourceSupplierName;
		}

		public String getResellServiceId() {
			return this.resellServiceId;
		}

		public void setResellServiceId(String resellServiceId) {
			this.resellServiceId = resellServiceId;
		}

		public String getLatestResellSourceServiceVersion() {
			return this.latestResellSourceServiceVersion;
		}

		public void setLatestResellSourceServiceVersion(String latestResellSourceServiceVersion) {
			this.latestResellSourceServiceVersion = latestResellSourceServiceVersion;
		}

		public String getResellApplyStatus() {
			return this.resellApplyStatus;
		}

		public void setResellApplyStatus(String resellApplyStatus) {
			this.resellApplyStatus = resellApplyStatus;
		}

		public String getVirtualInternetService() {
			return this.virtualInternetService;
		}

		public void setVirtualInternetService(String virtualInternetService) {
			this.virtualInternetService = virtualInternetService;
		}

		public String getCategories() {
			return this.categories;
		}

		public void setCategories(String categories) {
			this.categories = categories;
		}

		public String getServiceDiscoverable() {
			return this.serviceDiscoverable;
		}

		public void setServiceDiscoverable(String serviceDiscoverable) {
			this.serviceDiscoverable = serviceDiscoverable;
		}

		public Boolean getHasDraft() {
			return this.hasDraft;
		}

		public void setHasDraft(Boolean hasDraft) {
			this.hasDraft = hasDraft;
		}

		public Boolean getHasBeta() {
			return this.hasBeta;
		}

		public void setHasBeta(Boolean hasBeta) {
			this.hasBeta = hasBeta;
		}

		public String getBuildInfo() {
			return this.buildInfo;
		}

		public void setBuildInfo(String buildInfo) {
			this.buildInfo = buildInfo;
		}

		public List<ServiceInfo> getServiceInfos() {
			return this.serviceInfos;
		}

		public void setServiceInfos(List<ServiceInfo> serviceInfos) {
			this.serviceInfos = serviceInfos;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public Commodity getCommodity() {
			return this.commodity;
		}

		public void setCommodity(Commodity commodity) {
			this.commodity = commodity;
		}

		public static class ServiceInfo {

			private String locale;

			private String image;

			private String name;

			private String shortDescription;

			public String getLocale() {
				return this.locale;
			}

			public void setLocale(String locale) {
				this.locale = locale;
			}

			public String getImage() {
				return this.image;
			}

			public void setImage(String image) {
				this.image = image;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getShortDescription() {
				return this.shortDescription;
			}

			public void setShortDescription(String shortDescription) {
				this.shortDescription = shortDescription;
			}
		}

		public static class Tag {

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

		public static class Commodity {

			private String commodityCode;

			private String type;

			private String saasBoostMetadata;

			public String getCommodityCode() {
				return this.commodityCode;
			}

			public void setCommodityCode(String commodityCode) {
				this.commodityCode = commodityCode;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getSaasBoostMetadata() {
				return this.saasBoostMetadata;
			}

			public void setSaasBoostMetadata(String saasBoostMetadata) {
				this.saasBoostMetadata = saasBoostMetadata;
			}
		}
	}

	@Override
	public ListServicesResponse getInstance(UnmarshallerContext context) {
		return	ListServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
