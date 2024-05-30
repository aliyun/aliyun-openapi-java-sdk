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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.GetServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetServiceResponse extends AcsResponse {

	private String status;

	private String deployMetadata;

	private String publishTime;

	private String requestId;

	private String version;

	private String deployType;

	private String serviceId;

	private String supplierUrl;

	private String serviceDocUrl;

	private String serviceProductUrl;

	private String serviceType;

	private String supplierName;

	private String commodityCode;

	private Boolean isSupportOperated;

	private String policyNames;

	private Long duration;

	private Long progress;

	private String statusDetail;

	private String createTime;

	private String updateTime;

	private String shareType;

	private String alarmMetadata;

	private String upgradeMetadata;

	private String versionName;

	private String payFromType;

	private String payType;

	private Long defaultLicenseDays;

	private Long trialDuration;

	private String trialType;

	private String tenantType;

	private String licenseMetadata;

	private String operationMetadata;

	private String testStatus;

	private String approvalType;

	private String registrationId;

	private String resourceGroupId;

	private String permission;

	private String sourceServiceId;

	private String sourceServiceVersion;

	private String sourceSupplierName;

	private String logMetadata;

	private Boolean resellable;

	private String virtualInternetService;

	private String serviceDiscoverable;

	private String categories;

	private String shareTypeStatus;

	private String serviceAuditDocumentUrl;

	private Map<Object,Object> entitySource;

	private String crossRegionConnectionStatus;

	private String virtualInternetServiceId;

	private String buildInfo;

	private List<ServiceInfo> serviceInfos;

	private List<Tag> tags;

	private Statistic statistic;

	private Commodity commodity;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeployMetadata() {
		return this.deployMetadata;
	}

	public void setDeployMetadata(String deployMetadata) {
		this.deployMetadata = deployMetadata;
	}

	public String getPublishTime() {
		return this.publishTime;
	}

	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getServiceDocUrl() {
		return this.serviceDocUrl;
	}

	public void setServiceDocUrl(String serviceDocUrl) {
		this.serviceDocUrl = serviceDocUrl;
	}

	public String getServiceProductUrl() {
		return this.serviceProductUrl;
	}

	public void setServiceProductUrl(String serviceProductUrl) {
		this.serviceProductUrl = serviceProductUrl;
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

	public Boolean getIsSupportOperated() {
		return this.isSupportOperated;
	}

	public void setIsSupportOperated(Boolean isSupportOperated) {
		this.isSupportOperated = isSupportOperated;
	}

	public String getPolicyNames() {
		return this.policyNames;
	}

	public void setPolicyNames(String policyNames) {
		this.policyNames = policyNames;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Long getProgress() {
		return this.progress;
	}

	public void setProgress(Long progress) {
		this.progress = progress;
	}

	public String getStatusDetail() {
		return this.statusDetail;
	}

	public void setStatusDetail(String statusDetail) {
		this.statusDetail = statusDetail;
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

	public String getAlarmMetadata() {
		return this.alarmMetadata;
	}

	public void setAlarmMetadata(String alarmMetadata) {
		this.alarmMetadata = alarmMetadata;
	}

	public String getUpgradeMetadata() {
		return this.upgradeMetadata;
	}

	public void setUpgradeMetadata(String upgradeMetadata) {
		this.upgradeMetadata = upgradeMetadata;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getPayFromType() {
		return this.payFromType;
	}

	public void setPayFromType(String payFromType) {
		this.payFromType = payFromType;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Long getDefaultLicenseDays() {
		return this.defaultLicenseDays;
	}

	public void setDefaultLicenseDays(Long defaultLicenseDays) {
		this.defaultLicenseDays = defaultLicenseDays;
	}

	public Long getTrialDuration() {
		return this.trialDuration;
	}

	public void setTrialDuration(Long trialDuration) {
		this.trialDuration = trialDuration;
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

	public String getLicenseMetadata() {
		return this.licenseMetadata;
	}

	public void setLicenseMetadata(String licenseMetadata) {
		this.licenseMetadata = licenseMetadata;
	}

	public String getOperationMetadata() {
		return this.operationMetadata;
	}

	public void setOperationMetadata(String operationMetadata) {
		this.operationMetadata = operationMetadata;
	}

	public String getTestStatus() {
		return this.testStatus;
	}

	public void setTestStatus(String testStatus) {
		this.testStatus = testStatus;
	}

	public String getApprovalType() {
		return this.approvalType;
	}

	public void setApprovalType(String approvalType) {
		this.approvalType = approvalType;
	}

	public String getRegistrationId() {
		return this.registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
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

	public String getLogMetadata() {
		return this.logMetadata;
	}

	public void setLogMetadata(String logMetadata) {
		this.logMetadata = logMetadata;
	}

	public Boolean getResellable() {
		return this.resellable;
	}

	public void setResellable(Boolean resellable) {
		this.resellable = resellable;
	}

	public String getVirtualInternetService() {
		return this.virtualInternetService;
	}

	public void setVirtualInternetService(String virtualInternetService) {
		this.virtualInternetService = virtualInternetService;
	}

	public String getServiceDiscoverable() {
		return this.serviceDiscoverable;
	}

	public void setServiceDiscoverable(String serviceDiscoverable) {
		this.serviceDiscoverable = serviceDiscoverable;
	}

	public String getCategories() {
		return this.categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public String getShareTypeStatus() {
		return this.shareTypeStatus;
	}

	public void setShareTypeStatus(String shareTypeStatus) {
		this.shareTypeStatus = shareTypeStatus;
	}

	public String getServiceAuditDocumentUrl() {
		return this.serviceAuditDocumentUrl;
	}

	public void setServiceAuditDocumentUrl(String serviceAuditDocumentUrl) {
		this.serviceAuditDocumentUrl = serviceAuditDocumentUrl;
	}

	public Map<Object,Object> getEntitySource() {
		return this.entitySource;
	}

	public void setEntitySource(Map<Object,Object> entitySource) {
		this.entitySource = entitySource;
	}

	public String getCrossRegionConnectionStatus() {
		return this.crossRegionConnectionStatus;
	}

	public void setCrossRegionConnectionStatus(String crossRegionConnectionStatus) {
		this.crossRegionConnectionStatus = crossRegionConnectionStatus;
	}

	public String getVirtualInternetServiceId() {
		return this.virtualInternetServiceId;
	}

	public void setVirtualInternetServiceId(String virtualInternetServiceId) {
		this.virtualInternetServiceId = virtualInternetServiceId;
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

	public Statistic getStatistic() {
		return this.statistic;
	}

	public void setStatistic(Statistic statistic) {
		this.statistic = statistic;
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

		private String longDescriptionUrl;

		private List<AgreementsItem> agreements;

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

		public String getLongDescriptionUrl() {
			return this.longDescriptionUrl;
		}

		public void setLongDescriptionUrl(String longDescriptionUrl) {
			this.longDescriptionUrl = longDescriptionUrl;
		}

		public List<AgreementsItem> getAgreements() {
			return this.agreements;
		}

		public void setAgreements(List<AgreementsItem> agreements) {
			this.agreements = agreements;
		}

		public static class AgreementsItem {

			private String name;

			private String url;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
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

	public static class Statistic {

		private Integer accumulativeInstanceCount;

		private Integer accumulativeUserCount;

		private Integer deployedServiceInstanceCount;

		private Integer deployedUserCount;

		private Integer submittedUsageCount;

		private Double accumulativePocAmount;

		private Double averagePocAmount;

		private Double averagePocUnitAmount;

		private Double averagePocDuration;

		public Integer getAccumulativeInstanceCount() {
			return this.accumulativeInstanceCount;
		}

		public void setAccumulativeInstanceCount(Integer accumulativeInstanceCount) {
			this.accumulativeInstanceCount = accumulativeInstanceCount;
		}

		public Integer getAccumulativeUserCount() {
			return this.accumulativeUserCount;
		}

		public void setAccumulativeUserCount(Integer accumulativeUserCount) {
			this.accumulativeUserCount = accumulativeUserCount;
		}

		public Integer getDeployedServiceInstanceCount() {
			return this.deployedServiceInstanceCount;
		}

		public void setDeployedServiceInstanceCount(Integer deployedServiceInstanceCount) {
			this.deployedServiceInstanceCount = deployedServiceInstanceCount;
		}

		public Integer getDeployedUserCount() {
			return this.deployedUserCount;
		}

		public void setDeployedUserCount(Integer deployedUserCount) {
			this.deployedUserCount = deployedUserCount;
		}

		public Integer getSubmittedUsageCount() {
			return this.submittedUsageCount;
		}

		public void setSubmittedUsageCount(Integer submittedUsageCount) {
			this.submittedUsageCount = submittedUsageCount;
		}

		public Double getAccumulativePocAmount() {
			return this.accumulativePocAmount;
		}

		public void setAccumulativePocAmount(Double accumulativePocAmount) {
			this.accumulativePocAmount = accumulativePocAmount;
		}

		public Double getAveragePocAmount() {
			return this.averagePocAmount;
		}

		public void setAveragePocAmount(Double averagePocAmount) {
			this.averagePocAmount = averagePocAmount;
		}

		public Double getAveragePocUnitAmount() {
			return this.averagePocUnitAmount;
		}

		public void setAveragePocUnitAmount(Double averagePocUnitAmount) {
			this.averagePocUnitAmount = averagePocUnitAmount;
		}

		public Double getAveragePocDuration() {
			return this.averagePocDuration;
		}

		public void setAveragePocDuration(Double averagePocDuration) {
			this.averagePocDuration = averagePocDuration;
		}
	}

	public static class Commodity {

		private String type;

		private String chargeType;

		private String commodityCode;

		private String saasBoostMetadata;

		private List<SpecificationsItem> specifications;

		private List<MeteringEntitiesItem> meteringEntities;

		private List<String> components;

		private MarketplaceMetadata marketplaceMetadata;

		private CssMetadata cssMetadata;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getSaasBoostMetadata() {
			return this.saasBoostMetadata;
		}

		public void setSaasBoostMetadata(String saasBoostMetadata) {
			this.saasBoostMetadata = saasBoostMetadata;
		}

		public List<SpecificationsItem> getSpecifications() {
			return this.specifications;
		}

		public void setSpecifications(List<SpecificationsItem> specifications) {
			this.specifications = specifications;
		}

		public List<MeteringEntitiesItem> getMeteringEntities() {
			return this.meteringEntities;
		}

		public void setMeteringEntities(List<MeteringEntitiesItem> meteringEntities) {
			this.meteringEntities = meteringEntities;
		}

		public List<String> getComponents() {
			return this.components;
		}

		public void setComponents(List<String> components) {
			this.components = components;
		}

		public MarketplaceMetadata getMarketplaceMetadata() {
			return this.marketplaceMetadata;
		}

		public void setMarketplaceMetadata(MarketplaceMetadata marketplaceMetadata) {
			this.marketplaceMetadata = marketplaceMetadata;
		}

		public CssMetadata getCssMetadata() {
			return this.cssMetadata;
		}

		public void setCssMetadata(CssMetadata cssMetadata) {
			this.cssMetadata = cssMetadata;
		}

		public static class SpecificationsItem {

			private String code;

			private String name;

			private List<String> times;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<String> getTimes() {
				return this.times;
			}

			public void setTimes(List<String> times) {
				this.times = times;
			}
		}

		public static class MeteringEntitiesItem {

			private String entityId;

			private String name;

			public String getEntityId() {
				return this.entityId;
			}

			public void setEntityId(String entityId) {
				this.entityId = entityId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class MarketplaceMetadata {

			private List<SpecificationMappingsItem> specificationMappings;

			private List<MeteringEntityMappingsItem> meteringEntityMappings;

			private List<MeteringEntityExtraInfosItem> meteringEntityExtraInfos;

			public List<SpecificationMappingsItem> getSpecificationMappings() {
				return this.specificationMappings;
			}

			public void setSpecificationMappings(List<SpecificationMappingsItem> specificationMappings) {
				this.specificationMappings = specificationMappings;
			}

			public List<MeteringEntityMappingsItem> getMeteringEntityMappings() {
				return this.meteringEntityMappings;
			}

			public void setMeteringEntityMappings(List<MeteringEntityMappingsItem> meteringEntityMappings) {
				this.meteringEntityMappings = meteringEntityMappings;
			}

			public List<MeteringEntityExtraInfosItem> getMeteringEntityExtraInfos() {
				return this.meteringEntityExtraInfos;
			}

			public void setMeteringEntityExtraInfos(List<MeteringEntityExtraInfosItem> meteringEntityExtraInfos) {
				this.meteringEntityExtraInfos = meteringEntityExtraInfos;
			}

			public static class SpecificationMappingsItem {

				private String specificationCode;

				private String templateName;

				private String specificationName;

				private String trialType;

				public String getSpecificationCode() {
					return this.specificationCode;
				}

				public void setSpecificationCode(String specificationCode) {
					this.specificationCode = specificationCode;
				}

				public String getTemplateName() {
					return this.templateName;
				}

				public void setTemplateName(String templateName) {
					this.templateName = templateName;
				}

				public String getSpecificationName() {
					return this.specificationName;
				}

				public void setSpecificationName(String specificationName) {
					this.specificationName = specificationName;
				}

				public String getTrialType() {
					return this.trialType;
				}

				public void setTrialType(String trialType) {
					this.trialType = trialType;
				}
			}

			public static class MeteringEntityMappingsItem {

				private String entityIds;

				private String templateName;

				private String specificationName;

				public String getEntityIds() {
					return this.entityIds;
				}

				public void setEntityIds(String entityIds) {
					this.entityIds = entityIds;
				}

				public String getTemplateName() {
					return this.templateName;
				}

				public void setTemplateName(String templateName) {
					this.templateName = templateName;
				}

				public String getSpecificationName() {
					return this.specificationName;
				}

				public void setSpecificationName(String specificationName) {
					this.specificationName = specificationName;
				}
			}

			public static class MeteringEntityExtraInfosItem {

				private String entityId;

				private String type;

				private String metricName;

				private String promql;

				public String getEntityId() {
					return this.entityId;
				}

				public void setEntityId(String entityId) {
					this.entityId = entityId;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public String getPromql() {
					return this.promql;
				}

				public void setPromql(String promql) {
					this.promql = promql;
				}
			}
		}

		public static class CssMetadata {

			private List<ComponentsMappingsItem> componentsMappings;

			private List<MeteringEntityMappingsItem3> meteringEntityMappings1;

			private List<MeteringEntityExtraInfosItem4> meteringEntityExtraInfos2;

			public List<ComponentsMappingsItem> getComponentsMappings() {
				return this.componentsMappings;
			}

			public void setComponentsMappings(List<ComponentsMappingsItem> componentsMappings) {
				this.componentsMappings = componentsMappings;
			}

			public List<MeteringEntityMappingsItem3> getMeteringEntityMappings1() {
				return this.meteringEntityMappings1;
			}

			public void setMeteringEntityMappings1(List<MeteringEntityMappingsItem3> meteringEntityMappings1) {
				this.meteringEntityMappings1 = meteringEntityMappings1;
			}

			public List<MeteringEntityExtraInfosItem4> getMeteringEntityExtraInfos2() {
				return this.meteringEntityExtraInfos2;
			}

			public void setMeteringEntityExtraInfos2(List<MeteringEntityExtraInfosItem4> meteringEntityExtraInfos2) {
				this.meteringEntityExtraInfos2 = meteringEntityExtraInfos2;
			}

			public static class ComponentsMappingsItem {

				private Map<Object,Object> mappings;

				private String templateName;

				public Map<Object,Object> getMappings() {
					return this.mappings;
				}

				public void setMappings(Map<Object,Object> mappings) {
					this.mappings = mappings;
				}

				public String getTemplateName() {
					return this.templateName;
				}

				public void setTemplateName(String templateName) {
					this.templateName = templateName;
				}
			}

			public static class MeteringEntityMappingsItem3 {

				private String entityIds;

				private String templateName;

				private String specificationName;

				public String getEntityIds() {
					return this.entityIds;
				}

				public void setEntityIds(String entityIds) {
					this.entityIds = entityIds;
				}

				public String getTemplateName() {
					return this.templateName;
				}

				public void setTemplateName(String templateName) {
					this.templateName = templateName;
				}

				public String getSpecificationName() {
					return this.specificationName;
				}

				public void setSpecificationName(String specificationName) {
					this.specificationName = specificationName;
				}
			}

			public static class MeteringEntityExtraInfosItem4 {

				private String entityId;

				private String type;

				private String metricName;

				private String promql;

				public String getEntityId() {
					return this.entityId;
				}

				public void setEntityId(String entityId) {
					this.entityId = entityId;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public String getPromql() {
					return this.promql;
				}

				public void setPromql(String promql) {
					this.promql = promql;
				}
			}
		}
	}

	@Override
	public GetServiceResponse getInstance(UnmarshallerContext context) {
		return	GetServiceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
