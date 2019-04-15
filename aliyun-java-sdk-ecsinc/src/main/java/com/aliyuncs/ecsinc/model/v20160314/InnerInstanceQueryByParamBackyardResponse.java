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
import com.aliyuncs.ecsinc.transform.v20160314.InnerInstanceQueryByParamBackyardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerInstanceQueryByParamBackyardResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private Integer pageNo;

	private Integer pageSize;

	private List<Item> data;

	private ErrorCode errorCode;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Item> getData() {
		return this.data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public ErrorCode getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public static class Item {

		private String businessStatus;

		private String intranetIp;

		private Integer diskSize;

		private String osName;

		private Long izId;

		private Boolean ioOptimized;

		private String imageType;

		private String recoverPolicy;

		private Integer internetTx;

		private Long zoneId;

		private Integer memory;

		private String hostname;

		private Integer agentId;

		private String instanceId;

		private String osType;

		private String status;

		private String imageName;

		private Integer internetRx;

		private String internetIp;

		private String bid;

		private String imageNo;

		private String ecsBusinessStatus;

		private String groupNo;

		private Long id;

		private Long imageId;

		private String gmtCreated;

		private Integer intranetRx;

		private Long aliUid;

		private String gmtStarted;

		private Integer intranetTx;

		private Integer cores;

		private String gmtSync;

		private String systemDiskCategory;

		private String gmtRelease;

		private String gmtModified;

		private Boolean isWin;

		private Boolean recoverable;

		private String imagePc;

		private Zone zone;

		private Iz iz;

		private Region region;

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Integer getDiskSize() {
			return this.diskSize;
		}

		public void setDiskSize(Integer diskSize) {
			this.diskSize = diskSize;
		}

		public String getOsName() {
			return this.osName;
		}

		public void setOsName(String osName) {
			this.osName = osName;
		}

		public Long getIzId() {
			return this.izId;
		}

		public void setIzId(Long izId) {
			this.izId = izId;
		}

		public Boolean getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Boolean ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}

		public String getRecoverPolicy() {
			return this.recoverPolicy;
		}

		public void setRecoverPolicy(String recoverPolicy) {
			this.recoverPolicy = recoverPolicy;
		}

		public Integer getInternetTx() {
			return this.internetTx;
		}

		public void setInternetTx(Integer internetTx) {
			this.internetTx = internetTx;
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

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public Integer getAgentId() {
			return this.agentId;
		}

		public void setAgentId(Integer agentId) {
			this.agentId = agentId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOsType() {
			return this.osType;
		}

		public void setOsType(String osType) {
			this.osType = osType;
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

		public Integer getInternetRx() {
			return this.internetRx;
		}

		public void setInternetRx(Integer internetRx) {
			this.internetRx = internetRx;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getImageNo() {
			return this.imageNo;
		}

		public void setImageNo(String imageNo) {
			this.imageNo = imageNo;
		}

		public String getEcsBusinessStatus() {
			return this.ecsBusinessStatus;
		}

		public void setEcsBusinessStatus(String ecsBusinessStatus) {
			this.ecsBusinessStatus = ecsBusinessStatus;
		}

		public String getGroupNo() {
			return this.groupNo;
		}

		public void setGroupNo(String groupNo) {
			this.groupNo = groupNo;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public Integer getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(Integer intranetRx) {
			this.intranetRx = intranetRx;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getGmtStarted() {
			return this.gmtStarted;
		}

		public void setGmtStarted(String gmtStarted) {
			this.gmtStarted = gmtStarted;
		}

		public Integer getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(Integer intranetTx) {
			this.intranetTx = intranetTx;
		}

		public Integer getCores() {
			return this.cores;
		}

		public void setCores(Integer cores) {
			this.cores = cores;
		}

		public String getGmtSync() {
			return this.gmtSync;
		}

		public void setGmtSync(String gmtSync) {
			this.gmtSync = gmtSync;
		}

		public String getSystemDiskCategory() {
			return this.systemDiskCategory;
		}

		public void setSystemDiskCategory(String systemDiskCategory) {
			this.systemDiskCategory = systemDiskCategory;
		}

		public String getGmtRelease() {
			return this.gmtRelease;
		}

		public void setGmtRelease(String gmtRelease) {
			this.gmtRelease = gmtRelease;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Boolean getIsWin() {
			return this.isWin;
		}

		public void setIsWin(Boolean isWin) {
			this.isWin = isWin;
		}

		public Boolean getRecoverable() {
			return this.recoverable;
		}

		public void setRecoverable(Boolean recoverable) {
			this.recoverable = recoverable;
		}

		public String getImagePc() {
			return this.imagePc;
		}

		public void setImagePc(String imagePc) {
			this.imagePc = imagePc;
		}

		public Zone getZone() {
			return this.zone;
		}

		public void setZone(Zone zone) {
			this.zone = zone;
		}

		public Iz getIz() {
			return this.iz;
		}

		public void setIz(Iz iz) {
			this.iz = iz;
		}

		public Region getRegion() {
			return this.region;
		}

		public void setRegion(Region region) {
			this.region = region;
		}

		public static class Zone {

			private String zoneNo;

			private Long id;

			private String isActive;

			private String zoneNoAlias;

			private Long regionId;

			private String routeIpSegment;

			private String zoneMemo;

			private String zoneName;

			private Boolean isWritable;

			private String availableZoneID;

			private List<String> supportedDeviceCategories;

			private List<String> networkType;

			private List<String> diskType;

			public String getZoneNo() {
				return this.zoneNo;
			}

			public void setZoneNo(String zoneNo) {
				this.zoneNo = zoneNo;
			}

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

			public String getZoneNoAlias() {
				return this.zoneNoAlias;
			}

			public void setZoneNoAlias(String zoneNoAlias) {
				this.zoneNoAlias = zoneNoAlias;
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

			public String getRouteIpSegment() {
				return this.routeIpSegment;
			}

			public void setRouteIpSegment(String routeIpSegment) {
				this.routeIpSegment = routeIpSegment;
			}

			public String getZoneMemo() {
				return this.zoneMemo;
			}

			public void setZoneMemo(String zoneMemo) {
				this.zoneMemo = zoneMemo;
			}

			public String getZoneName() {
				return this.zoneName;
			}

			public void setZoneName(String zoneName) {
				this.zoneName = zoneName;
			}

			public Boolean getIsWritable() {
				return this.isWritable;
			}

			public void setIsWritable(Boolean isWritable) {
				this.isWritable = isWritable;
			}

			public String getAvailableZoneID() {
				return this.availableZoneID;
			}

			public void setAvailableZoneID(String availableZoneID) {
				this.availableZoneID = availableZoneID;
			}

			public List<String> getSupportedDeviceCategories() {
				return this.supportedDeviceCategories;
			}

			public void setSupportedDeviceCategories(List<String> supportedDeviceCategories) {
				this.supportedDeviceCategories = supportedDeviceCategories;
			}

			public List<String> getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(List<String> networkType) {
				this.networkType = networkType;
			}

			public List<String> getDiskType() {
				return this.diskType;
			}

			public void setDiskType(List<String> diskType) {
				this.diskType = diskType;
			}
		}

		public static class Iz {

			private String regionNo;

			private String enName;

			private String status;

			private String cnName;

			private String no;

			private List<IzResourceMode> izResourceModel;

			private List<String> supportedInstanceGenerations;

			private List<String> supportedInstanceTypeFamilies;

			private List<String> supportedInstanceTypeNames;

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
			}

			public String getEnName() {
				return this.enName;
			}

			public void setEnName(String enName) {
				this.enName = enName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getCnName() {
				return this.cnName;
			}

			public void setCnName(String cnName) {
				this.cnName = cnName;
			}

			public String getNo() {
				return this.no;
			}

			public void setNo(String no) {
				this.no = no;
			}

			public List<IzResourceMode> getIzResourceModel() {
				return this.izResourceModel;
			}

			public void setIzResourceModel(List<IzResourceMode> izResourceModel) {
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

			public static class IzResourceMode {

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

		public static class Region {

			private String regionNoAlias;

			private String regionNo;

			private String regionName;

			private String regionMemo;

			private Long id;

			private String isActive;

			public String getRegionNoAlias() {
				return this.regionNoAlias;
			}

			public void setRegionNoAlias(String regionNoAlias) {
				this.regionNoAlias = regionNoAlias;
			}

			public String getRegionNo() {
				return this.regionNo;
			}

			public void setRegionNo(String regionNo) {
				this.regionNo = regionNo;
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
		}
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

	@Override
	public InnerInstanceQueryByParamBackyardResponse getInstance(UnmarshallerContext context) {
		return	InnerInstanceQueryByParamBackyardResponseUnmarshaller.unmarshall(this, context);
	}
}
