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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryInstanceModelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryInstanceModelResponse extends AcsResponse {

	private String recoverPolicy;

	private Integer memory;

	private String gmtModified;

	private Boolean isWin;

	private String gmtCreated;

	private String intranetIp;

	private String businessStatus;

	private String gmtSync;

	private Long clusterNumericId;

	private String imageType;

	private String internetIp;

	private String osType;

	private String imageId;

	private Integer diskSize;

	private Integer agentId;

	private String bid;

	private String gmtStarted;

	private Boolean recoverable;

	private String status;

	private String imagePc;

	private Boolean ioOptimized;

	private String requestId;

	private Long regionNumericId;

	private String instanceId;

	private String ecsBusinessStatus;

	private String securityGroupId;

	private String osName;

	private Integer intranetTx;

	private String hostname;

	private Long zoneNumericId;

	private Integer intranetRx;

	private String systemDiskCategory;

	private Integer cores;

	private String imageName;

	private Integer internetTx;

	private String gmtRelease;

	private Integer internetRx;

	private Long imageNumericId;

	private Long instanceNumericId;

	private Long aliUid;

	private ZoneModel zoneModel;

	private RegionModel regionModel;

	private ClusterModel clusterModel;

	public String getRecoverPolicy() {
		return this.recoverPolicy;
	}

	public void setRecoverPolicy(String recoverPolicy) {
		this.recoverPolicy = recoverPolicy;
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
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

	public String getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getGmtSync() {
		return this.gmtSync;
	}

	public void setGmtSync(String gmtSync) {
		this.gmtSync = gmtSync;
	}

	public Long getClusterNumericId() {
		return this.clusterNumericId;
	}

	public void setClusterNumericId(Long clusterNumericId) {
		this.clusterNumericId = clusterNumericId;
	}

	public String getImageType() {
		return this.imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Integer getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Integer diskSize) {
		this.diskSize = diskSize;
	}

	public Integer getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Integer agentId) {
		this.agentId = agentId;
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getGmtStarted() {
		return this.gmtStarted;
	}

	public void setGmtStarted(String gmtStarted) {
		this.gmtStarted = gmtStarted;
	}

	public Boolean getRecoverable() {
		return this.recoverable;
	}

	public void setRecoverable(Boolean recoverable) {
		this.recoverable = recoverable;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImagePc() {
		return this.imagePc;
	}

	public void setImagePc(String imagePc) {
		this.imagePc = imagePc;
	}

	public Boolean getIoOptimized() {
		return this.ioOptimized;
	}

	public void setIoOptimized(Boolean ioOptimized) {
		this.ioOptimized = ioOptimized;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getRegionNumericId() {
		return this.regionNumericId;
	}

	public void setRegionNumericId(Long regionNumericId) {
		this.regionNumericId = regionNumericId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getEcsBusinessStatus() {
		return this.ecsBusinessStatus;
	}

	public void setEcsBusinessStatus(String ecsBusinessStatus) {
		this.ecsBusinessStatus = ecsBusinessStatus;
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public Integer getIntranetTx() {
		return this.intranetTx;
	}

	public void setIntranetTx(Integer intranetTx) {
		this.intranetTx = intranetTx;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Long getZoneNumericId() {
		return this.zoneNumericId;
	}

	public void setZoneNumericId(Long zoneNumericId) {
		this.zoneNumericId = zoneNumericId;
	}

	public Integer getIntranetRx() {
		return this.intranetRx;
	}

	public void setIntranetRx(Integer intranetRx) {
		this.intranetRx = intranetRx;
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Integer getInternetTx() {
		return this.internetTx;
	}

	public void setInternetTx(Integer internetTx) {
		this.internetTx = internetTx;
	}

	public String getGmtRelease() {
		return this.gmtRelease;
	}

	public void setGmtRelease(String gmtRelease) {
		this.gmtRelease = gmtRelease;
	}

	public Integer getInternetRx() {
		return this.internetRx;
	}

	public void setInternetRx(Integer internetRx) {
		this.internetRx = internetRx;
	}

	public Long getImageNumericId() {
		return this.imageNumericId;
	}

	public void setImageNumericId(Long imageNumericId) {
		this.imageNumericId = imageNumericId;
	}

	public Long getInstanceNumericId() {
		return this.instanceNumericId;
	}

	public void setInstanceNumericId(Long instanceNumericId) {
		this.instanceNumericId = instanceNumericId;
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
	}

	public ZoneModel getZoneModel() {
		return this.zoneModel;
	}

	public void setZoneModel(ZoneModel zoneModel) {
		this.zoneModel = zoneModel;
	}

	public RegionModel getRegionModel() {
		return this.regionModel;
	}

	public void setRegionModel(RegionModel regionModel) {
		this.regionModel = regionModel;
	}

	public ClusterModel getClusterModel() {
		return this.clusterModel;
	}

	public void setClusterModel(ClusterModel clusterModel) {
		this.clusterModel = clusterModel;
	}

	public static class ZoneModel {

		private String zoneEnName;

		private String zoneStatus;

		private String zoneId;

		private String zoneCnName;

		private String regionId;

		public String getZoneEnName() {
			return this.zoneEnName;
		}

		public void setZoneEnName(String zoneEnName) {
			this.zoneEnName = zoneEnName;
		}

		public String getZoneStatus() {
			return this.zoneStatus;
		}

		public void setZoneStatus(String zoneStatus) {
			this.zoneStatus = zoneStatus;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getZoneCnName() {
			return this.zoneCnName;
		}

		public void setZoneCnName(String zoneCnName) {
			this.zoneCnName = zoneCnName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	public static class RegionModel {

		private String regionMemo;

		private String regionName;

		private Long regionNumericId;

		private String regionIdAlias;

		private String regionIsActive;

		private String regionId;

		public String getRegionMemo() {
			return this.regionMemo;
		}

		public void setRegionMemo(String regionMemo) {
			this.regionMemo = regionMemo;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public Long getRegionNumericId() {
			return this.regionNumericId;
		}

		public void setRegionNumericId(Long regionNumericId) {
			this.regionNumericId = regionNumericId;
		}

		public String getRegionIdAlias() {
			return this.regionIdAlias;
		}

		public void setRegionIdAlias(String regionIdAlias) {
			this.regionIdAlias = regionIdAlias;
		}

		public String getRegionIsActive() {
			return this.regionIsActive;
		}

		public void setRegionIsActive(String regionIsActive) {
			this.regionIsActive = regionIsActive;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	public static class ClusterModel {

		private String clusterRouteIpSegment;

		private String availableZoneID;

		private Long clusterNumericId;

		private String clusterName;

		private Long regionNumericId;

		private Boolean clusterIsWritable;

		private String clusterMemo;

		private String clusterIsActive;

		private String clusterIdAlias;

		private String clusterId;

		public String getClusterRouteIpSegment() {
			return this.clusterRouteIpSegment;
		}

		public void setClusterRouteIpSegment(String clusterRouteIpSegment) {
			this.clusterRouteIpSegment = clusterRouteIpSegment;
		}

		public String getAvailableZoneID() {
			return this.availableZoneID;
		}

		public void setAvailableZoneID(String availableZoneID) {
			this.availableZoneID = availableZoneID;
		}

		public Long getClusterNumericId() {
			return this.clusterNumericId;
		}

		public void setClusterNumericId(Long clusterNumericId) {
			this.clusterNumericId = clusterNumericId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public Long getRegionNumericId() {
			return this.regionNumericId;
		}

		public void setRegionNumericId(Long regionNumericId) {
			this.regionNumericId = regionNumericId;
		}

		public Boolean getClusterIsWritable() {
			return this.clusterIsWritable;
		}

		public void setClusterIsWritable(Boolean clusterIsWritable) {
			this.clusterIsWritable = clusterIsWritable;
		}

		public String getClusterMemo() {
			return this.clusterMemo;
		}

		public void setClusterMemo(String clusterMemo) {
			this.clusterMemo = clusterMemo;
		}

		public String getClusterIsActive() {
			return this.clusterIsActive;
		}

		public void setClusterIsActive(String clusterIsActive) {
			this.clusterIsActive = clusterIsActive;
		}

		public String getClusterIdAlias() {
			return this.clusterIdAlias;
		}

		public void setClusterIdAlias(String clusterIdAlias) {
			this.clusterIdAlias = clusterIdAlias;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}
	}

	@Override
	public OpsQueryInstanceModelResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryInstanceModelResponseUnmarshaller.unmarshall(this, context);
	}
}
