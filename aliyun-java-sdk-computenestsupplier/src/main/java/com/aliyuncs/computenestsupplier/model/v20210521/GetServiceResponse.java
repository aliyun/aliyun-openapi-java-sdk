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

	private List<ServiceInfo> serviceInfos;

	private List<CommoditySpecification> commoditySpecifications;

	private List<Tag> tags;

	private List<CommodityEntitiesItem> commodityEntities;

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

	public List<ServiceInfo> getServiceInfos() {
		return this.serviceInfos;
	}

	public void setServiceInfos(List<ServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;
	}

	public List<CommoditySpecification> getCommoditySpecifications() {
		return this.commoditySpecifications;
	}

	public void setCommoditySpecifications(List<CommoditySpecification> commoditySpecifications) {
		this.commoditySpecifications = commoditySpecifications;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public List<CommodityEntitiesItem> getCommodityEntities() {
		return this.commodityEntities;
	}

	public void setCommodityEntities(List<CommodityEntitiesItem> commodityEntities) {
		this.commodityEntities = commodityEntities;
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

	public static class CommoditySpecification {

		private String specificationCode;

		private String templateName;

		private String predefinedParameterName;

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

		public String getPredefinedParameterName() {
			return this.predefinedParameterName;
		}

		public void setPredefinedParameterName(String predefinedParameterName) {
			this.predefinedParameterName = predefinedParameterName;
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

	public static class CommodityEntitiesItem {

		private String templateName;

		private String predefinedParameterName;

		private List<String> entityIds;

		public String getTemplateName() {
			return this.templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getPredefinedParameterName() {
			return this.predefinedParameterName;
		}

		public void setPredefinedParameterName(String predefinedParameterName) {
			this.predefinedParameterName = predefinedParameterName;
		}

		public List<String> getEntityIds() {
			return this.entityIds;
		}

		public void setEntityIds(List<String> entityIds) {
			this.entityIds = entityIds;
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
