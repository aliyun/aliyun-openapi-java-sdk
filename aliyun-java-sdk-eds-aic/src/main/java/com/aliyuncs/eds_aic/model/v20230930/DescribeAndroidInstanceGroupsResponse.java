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
import com.aliyuncs.eds_aic.transform.v20230930.DescribeAndroidInstanceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAndroidInstanceGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private String code;

	private String message;

	private List<Data> instanceGroupModel;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Data> getInstanceGroupModel() {
		return this.instanceGroupModel;
	}

	public void setInstanceGroupModel(List<Data> instanceGroupModel) {
		this.instanceGroupModel = instanceGroupModel;
	}

	public static class Data {

		private String instanceGroupId;

		private String instanceGroupName;

		private String instanceGroupStatus;

		private String instanceGroupSpec;

		private String instanceGroupSpecDescribe;

		private String officeSiteId;

		private String imageType;

		private String imageId;

		private String imageName;

		private String numberOfInstances;

		private String chargeType;

		private String regionId;

		private String gmtCreate;

		private String gmtModified;

		private String saleMode;

		private String installedAppList;

		private String authorizedUserList;

		private String gmtExpired;

		private String appInstanceGroupId;

		private String propertiesTemplateId;

		private String policyGroupId;

		private String keyPairId;

		private Integer reserveMinAmount;

		private Integer maxInstanceAmount;

		private String scalingUsageThreshold;

		private String scalingStep;

		private String scalingDownAfterIdleMinutes;

		private Integer inUsedInstanceAmount;

		private Integer idleInstanceAmount;

		private String fileSystemId;

		private Integer sessionTimeout;

		private String vSwitchId;

		private Integer resolutionHeight;

		private Integer resolutionWidth;

		private String systemVersion;

		private String architectureType;

		private Integer memory;

		private String cpu;

		private String errorCode;

		private String renderingType;

		private Integer availableInstanceAmount;

		private Boolean enableIpv6;

		private Integer ipv6Bandwidth;

		private List<DisksItem> disks;

		public String getInstanceGroupId() {
			return this.instanceGroupId;
		}

		public void setInstanceGroupId(String instanceGroupId) {
			this.instanceGroupId = instanceGroupId;
		}

		public String getInstanceGroupName() {
			return this.instanceGroupName;
		}

		public void setInstanceGroupName(String instanceGroupName) {
			this.instanceGroupName = instanceGroupName;
		}

		public String getInstanceGroupStatus() {
			return this.instanceGroupStatus;
		}

		public void setInstanceGroupStatus(String instanceGroupStatus) {
			this.instanceGroupStatus = instanceGroupStatus;
		}

		public String getInstanceGroupSpec() {
			return this.instanceGroupSpec;
		}

		public void setInstanceGroupSpec(String instanceGroupSpec) {
			this.instanceGroupSpec = instanceGroupSpec;
		}

		public String getInstanceGroupSpecDescribe() {
			return this.instanceGroupSpecDescribe;
		}

		public void setInstanceGroupSpecDescribe(String instanceGroupSpecDescribe) {
			this.instanceGroupSpecDescribe = instanceGroupSpecDescribe;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getNumberOfInstances() {
			return this.numberOfInstances;
		}

		public void setNumberOfInstances(String numberOfInstances) {
			this.numberOfInstances = numberOfInstances;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getSaleMode() {
			return this.saleMode;
		}

		public void setSaleMode(String saleMode) {
			this.saleMode = saleMode;
		}

		public String getInstalledAppList() {
			return this.installedAppList;
		}

		public void setInstalledAppList(String installedAppList) {
			this.installedAppList = installedAppList;
		}

		public String getAuthorizedUserList() {
			return this.authorizedUserList;
		}

		public void setAuthorizedUserList(String authorizedUserList) {
			this.authorizedUserList = authorizedUserList;
		}

		public String getGmtExpired() {
			return this.gmtExpired;
		}

		public void setGmtExpired(String gmtExpired) {
			this.gmtExpired = gmtExpired;
		}

		public String getAppInstanceGroupId() {
			return this.appInstanceGroupId;
		}

		public void setAppInstanceGroupId(String appInstanceGroupId) {
			this.appInstanceGroupId = appInstanceGroupId;
		}

		public String getPropertiesTemplateId() {
			return this.propertiesTemplateId;
		}

		public void setPropertiesTemplateId(String propertiesTemplateId) {
			this.propertiesTemplateId = propertiesTemplateId;
		}

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getKeyPairId() {
			return this.keyPairId;
		}

		public void setKeyPairId(String keyPairId) {
			this.keyPairId = keyPairId;
		}

		public Integer getReserveMinAmount() {
			return this.reserveMinAmount;
		}

		public void setReserveMinAmount(Integer reserveMinAmount) {
			this.reserveMinAmount = reserveMinAmount;
		}

		public Integer getMaxInstanceAmount() {
			return this.maxInstanceAmount;
		}

		public void setMaxInstanceAmount(Integer maxInstanceAmount) {
			this.maxInstanceAmount = maxInstanceAmount;
		}

		public String getScalingUsageThreshold() {
			return this.scalingUsageThreshold;
		}

		public void setScalingUsageThreshold(String scalingUsageThreshold) {
			this.scalingUsageThreshold = scalingUsageThreshold;
		}

		public String getScalingStep() {
			return this.scalingStep;
		}

		public void setScalingStep(String scalingStep) {
			this.scalingStep = scalingStep;
		}

		public String getScalingDownAfterIdleMinutes() {
			return this.scalingDownAfterIdleMinutes;
		}

		public void setScalingDownAfterIdleMinutes(String scalingDownAfterIdleMinutes) {
			this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
		}

		public Integer getInUsedInstanceAmount() {
			return this.inUsedInstanceAmount;
		}

		public void setInUsedInstanceAmount(Integer inUsedInstanceAmount) {
			this.inUsedInstanceAmount = inUsedInstanceAmount;
		}

		public Integer getIdleInstanceAmount() {
			return this.idleInstanceAmount;
		}

		public void setIdleInstanceAmount(Integer idleInstanceAmount) {
			this.idleInstanceAmount = idleInstanceAmount;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public Integer getSessionTimeout() {
			return this.sessionTimeout;
		}

		public void setSessionTimeout(Integer sessionTimeout) {
			this.sessionTimeout = sessionTimeout;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public Integer getResolutionHeight() {
			return this.resolutionHeight;
		}

		public void setResolutionHeight(Integer resolutionHeight) {
			this.resolutionHeight = resolutionHeight;
		}

		public Integer getResolutionWidth() {
			return this.resolutionWidth;
		}

		public void setResolutionWidth(Integer resolutionWidth) {
			this.resolutionWidth = resolutionWidth;
		}

		public String getSystemVersion() {
			return this.systemVersion;
		}

		public void setSystemVersion(String systemVersion) {
			this.systemVersion = systemVersion;
		}

		public String getArchitectureType() {
			return this.architectureType;
		}

		public void setArchitectureType(String architectureType) {
			this.architectureType = architectureType;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getRenderingType() {
			return this.renderingType;
		}

		public void setRenderingType(String renderingType) {
			this.renderingType = renderingType;
		}

		public Integer getAvailableInstanceAmount() {
			return this.availableInstanceAmount;
		}

		public void setAvailableInstanceAmount(Integer availableInstanceAmount) {
			this.availableInstanceAmount = availableInstanceAmount;
		}

		public Boolean getEnableIpv6() {
			return this.enableIpv6;
		}

		public void setEnableIpv6(Boolean enableIpv6) {
			this.enableIpv6 = enableIpv6;
		}

		public Integer getIpv6Bandwidth() {
			return this.ipv6Bandwidth;
		}

		public void setIpv6Bandwidth(Integer ipv6Bandwidth) {
			this.ipv6Bandwidth = ipv6Bandwidth;
		}

		public List<DisksItem> getDisks() {
			return this.disks;
		}

		public void setDisks(List<DisksItem> disks) {
			this.disks = disks;
		}

		public static class DisksItem {

			private String diskType;

			private Integer diskSize;

			public String getDiskType() {
				return this.diskType;
			}

			public void setDiskType(String diskType) {
				this.diskType = diskType;
			}

			public Integer getDiskSize() {
				return this.diskSize;
			}

			public void setDiskSize(Integer diskSize) {
				this.diskSize = diskSize;
			}
		}
	}

	@Override
	public DescribeAndroidInstanceGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAndroidInstanceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
