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
import com.aliyuncs.eds_aic.transform.v20230930.DescribeAndroidInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAndroidInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private List<Data> instanceModel;

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

	public List<Data> getInstanceModel() {
		return this.instanceModel;
	}

	public void setInstanceModel(List<Data> instanceModel) {
		this.instanceModel = instanceModel;
	}

	public static class Data {

		private String androidInstanceGroupId;

		private String androidInstanceGroupName;

		private String androidInstanceId;

		private String androidInstanceName;

		private String androidInstanceStatus;

		private String networkInterfaceIp;

		private String installedAppList;

		private String authorizedUserId;

		private String bindUserId;

		private String persistentAppInstanceId;

		private String appInstanceId;

		private String keyPairId;

		private String gmtCreate;

		private String gmtModified;

		private String appInstanceGroupId;

		private String regionId;

		private Integer rate;

		private String errorCode;

		private String renderingType;

		private String instanceType;

		private String chargeType;

		private String gmtExpired;

		private String policyGroupId;

		private String officeSiteId;

		private String vSwitchId;

		private Integer memory;

		private String cpu;

		private String imageVersion;

		private String publicIpAddress;

		private String sessionStatus;

		private String networkInterfaceIpv6Address;

		private String publicIpv6Address;

		private String imageId;

		private String qosRuleId;

		private String zoneId;

		private Integer streamMode;

		private String networkType;

		private String bandwidthPackageType;

		private String bandwidthPackageId;

		private Integer upBandwidthLimit;

		private Integer downBandwidthLimit;

		private String serverType;

		private List<DisksItem> disks;

		private List<Tag> tags;

		private List<BizTagsItem> bizTags;

		private DisplayConfig displayConfig;

		private AppManagePolicy appManagePolicy;

		private PhoneDataInfo phoneDataInfo;

		public String getAndroidInstanceGroupId() {
			return this.androidInstanceGroupId;
		}

		public void setAndroidInstanceGroupId(String androidInstanceGroupId) {
			this.androidInstanceGroupId = androidInstanceGroupId;
		}

		public String getAndroidInstanceGroupName() {
			return this.androidInstanceGroupName;
		}

		public void setAndroidInstanceGroupName(String androidInstanceGroupName) {
			this.androidInstanceGroupName = androidInstanceGroupName;
		}

		public String getAndroidInstanceId() {
			return this.androidInstanceId;
		}

		public void setAndroidInstanceId(String androidInstanceId) {
			this.androidInstanceId = androidInstanceId;
		}

		public String getAndroidInstanceName() {
			return this.androidInstanceName;
		}

		public void setAndroidInstanceName(String androidInstanceName) {
			this.androidInstanceName = androidInstanceName;
		}

		public String getAndroidInstanceStatus() {
			return this.androidInstanceStatus;
		}

		public void setAndroidInstanceStatus(String androidInstanceStatus) {
			this.androidInstanceStatus = androidInstanceStatus;
		}

		public String getNetworkInterfaceIp() {
			return this.networkInterfaceIp;
		}

		public void setNetworkInterfaceIp(String networkInterfaceIp) {
			this.networkInterfaceIp = networkInterfaceIp;
		}

		public String getInstalledAppList() {
			return this.installedAppList;
		}

		public void setInstalledAppList(String installedAppList) {
			this.installedAppList = installedAppList;
		}

		public String getAuthorizedUserId() {
			return this.authorizedUserId;
		}

		public void setAuthorizedUserId(String authorizedUserId) {
			this.authorizedUserId = authorizedUserId;
		}

		public String getBindUserId() {
			return this.bindUserId;
		}

		public void setBindUserId(String bindUserId) {
			this.bindUserId = bindUserId;
		}

		public String getPersistentAppInstanceId() {
			return this.persistentAppInstanceId;
		}

		public void setPersistentAppInstanceId(String persistentAppInstanceId) {
			this.persistentAppInstanceId = persistentAppInstanceId;
		}

		public String getAppInstanceId() {
			return this.appInstanceId;
		}

		public void setAppInstanceId(String appInstanceId) {
			this.appInstanceId = appInstanceId;
		}

		public String getKeyPairId() {
			return this.keyPairId;
		}

		public void setKeyPairId(String keyPairId) {
			this.keyPairId = keyPairId;
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

		public String getAppInstanceGroupId() {
			return this.appInstanceGroupId;
		}

		public void setAppInstanceGroupId(String appInstanceGroupId) {
			this.appInstanceGroupId = appInstanceGroupId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getRate() {
			return this.rate;
		}

		public void setRate(Integer rate) {
			this.rate = rate;
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

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getGmtExpired() {
			return this.gmtExpired;
		}

		public void setGmtExpired(String gmtExpired) {
			this.gmtExpired = gmtExpired;
		}

		public String getPolicyGroupId() {
			return this.policyGroupId;
		}

		public void setPolicyGroupId(String policyGroupId) {
			this.policyGroupId = policyGroupId;
		}

		public String getOfficeSiteId() {
			return this.officeSiteId;
		}

		public void setOfficeSiteId(String officeSiteId) {
			this.officeSiteId = officeSiteId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
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

		public String getImageVersion() {
			return this.imageVersion;
		}

		public void setImageVersion(String imageVersion) {
			this.imageVersion = imageVersion;
		}

		public String getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(String publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public String getSessionStatus() {
			return this.sessionStatus;
		}

		public void setSessionStatus(String sessionStatus) {
			this.sessionStatus = sessionStatus;
		}

		public String getNetworkInterfaceIpv6Address() {
			return this.networkInterfaceIpv6Address;
		}

		public void setNetworkInterfaceIpv6Address(String networkInterfaceIpv6Address) {
			this.networkInterfaceIpv6Address = networkInterfaceIpv6Address;
		}

		public String getPublicIpv6Address() {
			return this.publicIpv6Address;
		}

		public void setPublicIpv6Address(String publicIpv6Address) {
			this.publicIpv6Address = publicIpv6Address;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getQosRuleId() {
			return this.qosRuleId;
		}

		public void setQosRuleId(String qosRuleId) {
			this.qosRuleId = qosRuleId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getStreamMode() {
			return this.streamMode;
		}

		public void setStreamMode(Integer streamMode) {
			this.streamMode = streamMode;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getBandwidthPackageType() {
			return this.bandwidthPackageType;
		}

		public void setBandwidthPackageType(String bandwidthPackageType) {
			this.bandwidthPackageType = bandwidthPackageType;
		}

		public String getBandwidthPackageId() {
			return this.bandwidthPackageId;
		}

		public void setBandwidthPackageId(String bandwidthPackageId) {
			this.bandwidthPackageId = bandwidthPackageId;
		}

		public Integer getUpBandwidthLimit() {
			return this.upBandwidthLimit;
		}

		public void setUpBandwidthLimit(Integer upBandwidthLimit) {
			this.upBandwidthLimit = upBandwidthLimit;
		}

		public Integer getDownBandwidthLimit() {
			return this.downBandwidthLimit;
		}

		public void setDownBandwidthLimit(Integer downBandwidthLimit) {
			this.downBandwidthLimit = downBandwidthLimit;
		}

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public List<DisksItem> getDisks() {
			return this.disks;
		}

		public void setDisks(List<DisksItem> disks) {
			this.disks = disks;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<BizTagsItem> getBizTags() {
			return this.bizTags;
		}

		public void setBizTags(List<BizTagsItem> bizTags) {
			this.bizTags = bizTags;
		}

		public DisplayConfig getDisplayConfig() {
			return this.displayConfig;
		}

		public void setDisplayConfig(DisplayConfig displayConfig) {
			this.displayConfig = displayConfig;
		}

		public AppManagePolicy getAppManagePolicy() {
			return this.appManagePolicy;
		}

		public void setAppManagePolicy(AppManagePolicy appManagePolicy) {
			this.appManagePolicy = appManagePolicy;
		}

		public PhoneDataInfo getPhoneDataInfo() {
			return this.phoneDataInfo;
		}

		public void setPhoneDataInfo(PhoneDataInfo phoneDataInfo) {
			this.phoneDataInfo = phoneDataInfo;
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

		public static class BizTagsItem {

			private String value;

			private String key;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}
		}

		public static class DisplayConfig {

			private Integer resolutionHeight;

			private Integer resolutionWidth;

			private Integer dpi;

			private Integer fps;

			private String lockResolution;

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

			public Integer getDpi() {
				return this.dpi;
			}

			public void setDpi(Integer dpi) {
				this.dpi = dpi;
			}

			public Integer getFps() {
				return this.fps;
			}

			public void setFps(Integer fps) {
				this.fps = fps;
			}

			public String getLockResolution() {
				return this.lockResolution;
			}

			public void setLockResolution(String lockResolution) {
				this.lockResolution = lockResolution;
			}
		}

		public static class AppManagePolicy {

			private String appManagePolicyId;

			private String appManagePolicyName;

			public String getAppManagePolicyId() {
				return this.appManagePolicyId;
			}

			public void setAppManagePolicyId(String appManagePolicyId) {
				this.appManagePolicyId = appManagePolicyId;
			}

			public String getAppManagePolicyName() {
				return this.appManagePolicyName;
			}

			public void setAppManagePolicyName(String appManagePolicyName) {
				this.appManagePolicyName = appManagePolicyName;
			}
		}

		public static class PhoneDataInfo {

			private String phoneDataId;

			private Integer phoneDataVolume;

			public String getPhoneDataId() {
				return this.phoneDataId;
			}

			public void setPhoneDataId(String phoneDataId) {
				this.phoneDataId = phoneDataId;
			}

			public Integer getPhoneDataVolume() {
				return this.phoneDataVolume;
			}

			public void setPhoneDataVolume(Integer phoneDataVolume) {
				this.phoneDataVolume = phoneDataVolume;
			}
		}
	}

	@Override
	public DescribeAndroidInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAndroidInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
