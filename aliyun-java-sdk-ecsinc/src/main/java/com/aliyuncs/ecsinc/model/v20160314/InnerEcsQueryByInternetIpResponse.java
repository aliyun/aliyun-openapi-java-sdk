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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerEcsQueryByInternetIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerEcsQueryByInternetIpResponse extends AcsResponse {

	private String requestId;

	private ErrorCode errorCode;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class ErrorCode {

		private String code;

		private String message;

		private Boolean isSuccess;

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

		public Boolean getIsSuccess() {
			return this.isSuccess;
		}

		public void setIsSuccess(Boolean isSuccess) {
			this.isSuccess = isSuccess;
		}
	}

	public static class Data {

		private Boolean recoverable;

		private String eipInstanceId;

		private Boolean isWin;

		private String gmtRelease;

		private String serialNumber;

		private String instanceTypeGeneration;

		private Integer intranetRx;

		private String imageProductCode;

		private String ecsBusinessStatus;

		private String description;

		private String internetIp;

		private String imageNo;

		private Integer internetRx;

		private String status;

		private String imageName;

		private String osType;

		private String hostname;

		private Integer eipBandwidth;

		private String netWorkType;

		private String natIp;

		private String instanceType;

		private String recoverPolicy;

		private Boolean ioOptimized;

		private String osName;

		private String intranetIp;

		private String eip;

		private String gmtModified;

		private Integer iopsSize;

		private String systemDiskCategory;

		private Integer intranetTx;

		private String gmtStarted;

		private String gmtSync;

		private Integer cores;

		private Long aliUid;

		private Long imageId;

		private String gmtCreated;

		private String groupNo;

		private String vpcInstanceId;

		private String bid;

		private Long id;

		private Integer agentId;

		private String realHostname;

		private String instanceId;

		private String instanceTypeFamily;

		private Boolean networkValidation;

		private Long zoneId;

		private Integer memory;

		private Integer internetTx;

		private String vswitchInstanceId;

		private String imageType;

		private Long izId;

		private Integer diskSize;

		private Region region;

		private Iz iz;

		private Zone zone;

		public Boolean getRecoverable() {
			return this.recoverable;
		}

		public void setRecoverable(Boolean recoverable) {
			this.recoverable = recoverable;
		}

		public String getEipInstanceId() {
			return this.eipInstanceId;
		}

		public void setEipInstanceId(String eipInstanceId) {
			this.eipInstanceId = eipInstanceId;
		}

		public Boolean getIsWin() {
			return this.isWin;
		}

		public void setIsWin(Boolean isWin) {
			this.isWin = isWin;
		}

		public String getGmtRelease() {
			return this.gmtRelease;
		}

		public void setGmtRelease(String gmtRelease) {
			this.gmtRelease = gmtRelease;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getInstanceTypeGeneration() {
			return this.instanceTypeGeneration;
		}

		public void setInstanceTypeGeneration(String instanceTypeGeneration) {
			this.instanceTypeGeneration = instanceTypeGeneration;
		}

		public Integer getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(Integer intranetRx) {
			this.intranetRx = intranetRx;
		}

		public String getImageProductCode() {
			return this.imageProductCode;
		}

		public void setImageProductCode(String imageProductCode) {
			this.imageProductCode = imageProductCode;
		}

		public String getEcsBusinessStatus() {
			return this.ecsBusinessStatus;
		}

		public void setEcsBusinessStatus(String ecsBusinessStatus) {
			this.ecsBusinessStatus = ecsBusinessStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getImageNo() {
			return this.imageNo;
		}

		public void setImageNo(String imageNo) {
			this.imageNo = imageNo;
		}

		public Integer getInternetRx() {
			return this.internetRx;
		}

		public void setInternetRx(Integer internetRx) {
			this.internetRx = internetRx;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Integer getEipBandwidth() {
			return this.eipBandwidth;
		}

		public void setEipBandwidth(Integer eipBandwidth) {
			this.eipBandwidth = eipBandwidth;
		}

		public String getNetWorkType() {
			return this.netWorkType;
		}

		public void setNetWorkType(String netWorkType) {
			this.netWorkType = netWorkType;
		}

		public String getNatIp() {
			return this.natIp;
		}

		public void setNatIp(String natIp) {
			this.natIp = natIp;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getRecoverPolicy() {
			return this.recoverPolicy;
		}

		public void setRecoverPolicy(String recoverPolicy) {
			this.recoverPolicy = recoverPolicy;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getEip() {
			return this.eip;
		}

		public void setEip(String eip) {
			this.eip = eip;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getIopsSize() {
			return this.iopsSize;
		}

		public void setIopsSize(Integer iopsSize) {
			this.iopsSize = iopsSize;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public Integer getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(Integer intranetTx) {
			this.intranetTx = intranetTx;
		}

		public String getGmtStarted() {
			return this.gmtStarted;
		}

		public void setGmtStarted(String gmtStarted) {
			this.gmtStarted = gmtStarted;
		}

		public String getGmtSync() {
			return this.gmtSync;
		}

		public void setGmtSync(String gmtSync) {
			this.gmtSync = gmtSync;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Long getImageId() {
			return this.imageId;
		}

		public void setImageId(Long imageId) {
			this.imageId = imageId;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGroupNo() {
			return this.groupNo;
		}

		public void setGroupNo(String groupNo) {
			this.groupNo = groupNo;
		}

		public String getVpcInstanceId() {
			return this.vpcInstanceId;
		}

		public void setVpcInstanceId(String vpcInstanceId) {
			this.vpcInstanceId = vpcInstanceId;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getAgentId() {
			return this.agentId;
		}

		public void setAgentId(Integer agentId) {
			this.agentId = agentId;
		}

		public String getRealHostname() {
			return this.realHostname;
		}

		public void setRealHostname(String realHostname) {
			this.realHostname = realHostname;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceTypeFamily() {
			return this.instanceTypeFamily;
		}

		public void setInstanceTypeFamily(String instanceTypeFamily) {
			this.instanceTypeFamily = instanceTypeFamily;
		}

		public Boolean getNetworkValidation() {
			return this.networkValidation;
		}

		public void setNetworkValidation(Boolean networkValidation) {
			this.networkValidation = networkValidation;
		}

		public Long getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(Long zoneId) {
			this.zoneId = zoneId;
		}

		public Integer getMemory() {
			return this.memory;
		}

		public void setMemory(Integer memory) {
			this.memory = memory;
		}

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
		}

		public String getVswitchInstanceId() {
			return this.vswitchInstanceId;
		}

		public void setVswitchInstanceId(String vswitchInstanceId) {
			this.vswitchInstanceId = vswitchInstanceId;
		}

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}

		public Long getIzId() {
			return this.izId;
		}

		public void setIzId(Long izId) {
			this.izId = izId;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public Region getRegion() {
			return this.region;
		}

		public void setRegion(Region region) {
			this.region = region;
		}

		public Iz getIz() {
			return this.iz;
		}

		public void setIz(Iz iz) {
			this.iz = iz;
		}

		public Zone getZone() {
			return this.zone;
		}

		public void setZone(Zone zone) {
			this.zone = zone;
		}

		public static class Region {

			private Long id;

			private String isActive;

			private String regionEnName;

			private String regionNoAlias;

			private String regionName;

			private String regionMemo;

			private String regionNo;

			private Attributes attributes;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getIsActive() {
				return this.isActive;
			}

			public void setIsActive(String isActive) {
				this.isActive = isActive;
			}

			public String getRegionEnName() {
				return this.regionEnName;
			}

			public void setRegionEnName(String regionEnName) {
				this.regionEnName = regionEnName;
			}

			public String getRegionNoAlias() {
				return this.regionNoAlias;
			}

			public void setRegionNoAlias(String regionNoAlias) {
				this.regionNoAlias = regionNoAlias;
			}

			public String getRegionName() {
				return this.regionName;
			}

			public void setRegionName(String regionName) {
				this.regionName = regionName;
			}

			public String getRegionMemo() {
				return this.regionMemo;
			}

			public void setRegionMemo(String regionMemo) {
				this.regionMemo = regionMemo;
			}

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public Attributes getAttributes() {
				return this.attributes;
			}

			public void setAttributes(Attributes attributes) {
				this.attributes = attributes;
			}

			public static class Attributes {

				private String support_image_copy;

				private String internal_use;

				private String ak_name;

				public String getSupport_image_copy() {
					return this.support_image_copy;
				}

				public void setSupport_image_copy(String support_image_copy) {
					this.support_image_copy = support_image_copy;
				}

				public String getInternal_use() {
					return this.internal_use;
				}

				public void setInternal_use(String internal_use) {
					this.internal_use = internal_use;
				}

				public String getAk_name() {
					return this.ak_name;
				}

				public void setAk_name(String ak_name) {
					this.ak_name = ak_name;
				}
			}
		}

		public static class Iz {

			private String regionNo;

			private String status;

			private String no;

			private String enName;

			private String cnName;

			private List<IzResourceModelItem> izResourceModel;

			private List<String> supportedInstanceGenerations;

			private List<String> supportedInstanceTypeFamilies;

			private List<String> supportedInstanceTypeNames;

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getNo() {
				return this.no;
			}

			public void setNo(String no) {
				this.no = no;
			}

			public String getEnName() {
				return this.enName;
			}

			public void setEnName(String enName) {
				this.enName = enName;
			}

			public String getCnName() {
				return this.cnName;
			}

			public void setCnName(String cnName) {
				this.cnName = cnName;
			}

			public List<IzResourceModelItem> getIzResourceModel() {
				return this.izResourceModel;
			}

			public void setIzResourceModel(List<IzResourceModelItem> izResourceModel) {
				this.izResourceModel = izResourceModel;
			}

			public List<String> getSupportedInstanceGenerations() {
				return this.supportedInstanceGenerations;
			}

			public void setSupportedInstanceGenerations(List<String> supportedInstanceGenerations) {
				this.supportedInstanceGenerations = supportedInstanceGenerations;
			}

			public List<String> getSupportedInstanceTypeFamilies() {
				return this.supportedInstanceTypeFamilies;
			}

			public void setSupportedInstanceTypeFamilies(List<String> supportedInstanceTypeFamilies) {
				this.supportedInstanceTypeFamilies = supportedInstanceTypeFamilies;
			}

			public List<String> getSupportedInstanceTypeNames() {
				return this.supportedInstanceTypeNames;
			}

			public void setSupportedInstanceTypeNames(List<String> supportedInstanceTypeNames) {
				this.supportedInstanceTypeNames = supportedInstanceTypeNames;
			}

			public static class IzResourceModelItem {

				private Boolean supportIoOptimized;

				private List<String> allowedResourceCreation;

				private List<String> supportedDataDiskCategories;

				private List<String> supportedInstanceGenerations1;

				private List<String> supportedNetworkCategories;

				private List<String> supportedSystemDiskCategories;

				private List<String> supportedInstanceTypeFamilies2;

				private List<String> supportedInstanceTypes;

				public Boolean getSupportIoOptimized() {
					return this.supportIoOptimized;
				}

				public void setSupportIoOptimized(Boolean supportIoOptimized) {
					this.supportIoOptimized = supportIoOptimized;
				}

				public List<String> getAllowedResourceCreation() {
					return this.allowedResourceCreation;
				}

				public void setAllowedResourceCreation(List<String> allowedResourceCreation) {
					this.allowedResourceCreation = allowedResourceCreation;
				}

				public List<String> getSupportedDataDiskCategories() {
					return this.supportedDataDiskCategories;
				}

				public void setSupportedDataDiskCategories(List<String> supportedDataDiskCategories) {
					this.supportedDataDiskCategories = supportedDataDiskCategories;
				}

				public List<String> getSupportedInstanceGenerations1() {
					return this.supportedInstanceGenerations1;
				}

				public void setSupportedInstanceGenerations1(List<String> supportedInstanceGenerations1) {
					this.supportedInstanceGenerations1 = supportedInstanceGenerations1;
				}

				public List<String> getSupportedNetworkCategories() {
					return this.supportedNetworkCategories;
				}

				public void setSupportedNetworkCategories(List<String> supportedNetworkCategories) {
					this.supportedNetworkCategories = supportedNetworkCategories;
				}

				public List<String> getSupportedSystemDiskCategories() {
					return this.supportedSystemDiskCategories;
				}

				public void setSupportedSystemDiskCategories(List<String> supportedSystemDiskCategories) {
					this.supportedSystemDiskCategories = supportedSystemDiskCategories;
				}

				public List<String> getSupportedInstanceTypeFamilies2() {
					return this.supportedInstanceTypeFamilies2;
				}

				public void setSupportedInstanceTypeFamilies2(List<String> supportedInstanceTypeFamilies2) {
					this.supportedInstanceTypeFamilies2 = supportedInstanceTypeFamilies2;
				}

				public List<String> getSupportedInstanceTypes() {
					return this.supportedInstanceTypes;
				}

				public void setSupportedInstanceTypes(List<String> supportedInstanceTypes) {
					this.supportedInstanceTypes = supportedInstanceTypes;
				}
			}
		}

		public static class Zone {

			private String zoneMemo;

			private Boolean isWritable;

			private String zoneName;

			private String zoneNoAlias;

			private String isActive;

			private Long id;

			private String zoneEnName;

			private String zoneNo;

			private String routeIpSegment;

			private Long regionId;

			private List<String> supportedDeviceCategories;

			public String getZoneMemo() {
				return this.zoneMemo;
			}

			public void setZoneMemo(String zoneMemo) {
				this.zoneMemo = zoneMemo;
			}

			public Boolean getIsWritable() {
				return this.isWritable;
			}

			public void setIsWritable(Boolean isWritable) {
				this.isWritable = isWritable;
			}

			public String getZoneName() {
				return this.zoneName;
			}

			public void setZoneName(String zoneName) {
				this.zoneName = zoneName;
			}

			public String getZoneNoAlias() {
				return this.zoneNoAlias;
			}

			public void setZoneNoAlias(String zoneNoAlias) {
				this.zoneNoAlias = zoneNoAlias;
			}

			public String getIsActive() {
				return this.isActive;
			}

			public void setIsActive(String isActive) {
				this.isActive = isActive;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getZoneEnName() {
				return this.zoneEnName;
			}

			public void setZoneEnName(String zoneEnName) {
				this.zoneEnName = zoneEnName;
			}

			public String getZoneNo() {
				return this.zoneNo;
			}

			public void setZoneNo(String zoneNo) {
				this.zoneNo = zoneNo;
			}

			public String getRouteIpSegment() {
				return this.routeIpSegment;
			}

			public void setRouteIpSegment(String routeIpSegment) {
				this.routeIpSegment = routeIpSegment;
			}

			public Long getBizRegionId() {
				return this.regionId;
			}

			public void setBizRegionId(Long regionId) {
				this.regionId = regionId;
			}

			/**
			 * @deprecated use getBizRegionId instead of this.
			 */
			@Deprecated
			public Long getRegionId() {
				return this.regionId;
			}

			/**
			 * @deprecated use setBizRegionId instead of this.
			 */
			@Deprecated
			public void setRegionId(Long regionId) {
				this.regionId = regionId;
			}

			public List<String> getSupportedDeviceCategories() {
				return this.supportedDeviceCategories;
			}

			public void setSupportedDeviceCategories(List<String> supportedDeviceCategories) {
				this.supportedDeviceCategories = supportedDeviceCategories;
			}
		}
	}

	@Override
	public InnerEcsQueryByInternetIpResponse getInstance(UnmarshallerContext context) {
		return	InnerEcsQueryByInternetIpResponseUnmarshaller.unmarshall(this, context);
	}
}
