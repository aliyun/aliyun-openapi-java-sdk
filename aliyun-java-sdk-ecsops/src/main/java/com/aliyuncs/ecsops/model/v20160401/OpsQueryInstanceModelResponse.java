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

	private String requestId;

	private Long instanceNumericId;

	private Long aliUid;

	private String bid;

	private Integer agentId;

	private String instanceId;

	private String securityGroupId;

	private String status;

	private String businessStatus;

	private String ecsBusinessStatus;

	private Long imageNumericId;

	private String imageType;

	private String imageId;

	private String imageName;

	private String osName;

	private String osType;

	private Boolean isWin;

	private Long regionNumericId;

	private Long zoneNumericId;

	private Long clusterNumericId;

	private Boolean recoverable;

	private String recoverPolicy;

	private String gmtCreated;

	private String gmtModified;

	private String gmtSync;

	private String gmtRelease;

	private String gmtStarted;

	private String hostname;

	private Integer cores;

	private Integer diskSize;

	private Integer memory;

	private String intranetIp;

	private String internetIp;

	private Integer intranetRx;

	private Integer intranetTx;

	private Integer internetRx;

	private Integer internetTx;

	private String systemDiskCategory;

	private String imagePc;

	private Boolean ioOptimized;

	private RegionModel regionModel;

	private ZoneModel zoneModel;

	private ClusterModel clusterModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
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

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

	public String getEcsBusinessStatus() {
		return this.ecsBusinessStatus;
	}

	public void setEcsBusinessStatus(String ecsBusinessStatus) {
		this.ecsBusinessStatus = ecsBusinessStatus;
	}

	public Long getImageNumericId() {
		return this.imageNumericId;
	}

	public void setImageNumericId(Long imageNumericId) {
		this.imageNumericId = imageNumericId;
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

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public Boolean getIsWin() {
		return this.isWin;
	}

	public void setIsWin(Boolean isWin) {
		this.isWin = isWin;
	}

	public Long getRegionNumericId() {
		return this.regionNumericId;
	}

	public void setRegionNumericId(Long regionNumericId) {
		this.regionNumericId = regionNumericId;
	}

	public Long getZoneNumericId() {
		return this.zoneNumericId;
	}

	public void setZoneNumericId(Long zoneNumericId) {
		this.zoneNumericId = zoneNumericId;
	}

	public Long getClusterNumericId() {
		return this.clusterNumericId;
	}

	public void setClusterNumericId(Long clusterNumericId) {
		this.clusterNumericId = clusterNumericId;
	}

	public Boolean getRecoverable() {
		return this.recoverable;
	}

	public void setRecoverable(Boolean recoverable) {
		this.recoverable = recoverable;
	}

	public String getRecoverPolicy() {
		return this.recoverPolicy;
	}

	public void setRecoverPolicy(String recoverPolicy) {
		this.recoverPolicy = recoverPolicy;
	}

	public String getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getGmtSync() {
		return this.gmtSync;
	}

	public void setGmtSync(String gmtSync) {
		this.gmtSync = gmtSync;
	}

	public String getGmtRelease() {
		return this.gmtRelease;
	}

	public void setGmtRelease(String gmtRelease) {
		this.gmtRelease = gmtRelease;
	}

	public String getGmtStarted() {
		return this.gmtStarted;
	}

	public void setGmtStarted(String gmtStarted) {
		this.gmtStarted = gmtStarted;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public Integer getCores() {
		return this.cores;
	}

	public void setCores(Integer cores) {
		this.cores = cores;
	}

	public Integer getDiskSize() {
		return this.diskSize;
	}

	public void setDiskSize(Integer diskSize) {
		this.diskSize = diskSize;
	}

	public Integer getMemory() {
		return this.memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
	}

	public Integer getIntranetRx() {
		return this.intranetRx;
	}

	public void setIntranetRx(Integer intranetRx) {
		this.intranetRx = intranetRx;
	}

	public Integer getIntranetTx() {
		return this.intranetTx;
	}

	public void setIntranetTx(Integer intranetTx) {
		this.intranetTx = intranetTx;
	}

	public Integer getInternetRx() {
		return this.internetRx;
	}

	public void setInternetRx(Integer internetRx) {
		this.internetRx = internetRx;
	}

	public Integer getInternetTx() {
		return this.internetTx;
	}

	public void setInternetTx(Integer internetTx) {
		this.internetTx = internetTx;
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
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

	public RegionModel getRegionModel() {
		return this.regionModel;
	}

	public void setRegionModel(RegionModel regionModel) {
		this.regionModel = regionModel;
	}

	public ZoneModel getZoneModel() {
		return this.zoneModel;
	}

	public void setZoneModel(ZoneModel zoneModel) {
		this.zoneModel = zoneModel;
	}

	public ClusterModel getClusterModel() {
		return this.clusterModel;
	}

	public void setClusterModel(ClusterModel clusterModel) {
		this.clusterModel = clusterModel;
	}

	public static class RegionModel {

		private Long regionNumericId;

		private String regionIsActive;

		private String regionMemo;

		private String regionId;

		private String regionName;

		private String regionIdAlias;

		public Long getRegionNumericId() {
			return this.regionNumericId;
		}

		public void setRegionNumericId(Long regionNumericId) {
			this.regionNumericId = regionNumericId;
		}

		public String getRegionIsActive() {
			return this.regionIsActive;
		}

		public void setRegionIsActive(String regionIsActive) {
			this.regionIsActive = regionIsActive;
		}

		public String getRegionMemo() {
			return this.regionMemo;
		}

		public void setRegionMemo(String regionMemo) {
			this.regionMemo = regionMemo;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getRegionIdAlias() {
			return this.regionIdAlias;
		}

		public void setRegionIdAlias(String regionIdAlias) {
			this.regionIdAlias = regionIdAlias;
		}
	}

	public static class ZoneModel {

		private String zoneId;

		private String regionId;

		private String zoneCnName;

		private String zoneEnName;

		private String zoneStatus;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneCnName() {
			return this.zoneCnName;
		}

		public void setZoneCnName(String zoneCnName) {
			this.zoneCnName = zoneCnName;
		}

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
	}

	public static class ClusterModel {

		private Long clusterNumericId;

		private String clusterIsActive;

		private Long regionNumericId;

		private String clusterId;

		private String clusterName;

		private String clusterIdAlias;

		private String clusterRouteIpSegment;

		private String clusterMemo;

		private Boolean clusterIsWritable;

		private String availableZoneID;

		public Long getClusterNumericId() {
			return this.clusterNumericId;
		}

		public void setClusterNumericId(Long clusterNumericId) {
			this.clusterNumericId = clusterNumericId;
		}

		public String getClusterIsActive() {
			return this.clusterIsActive;
		}

		public void setClusterIsActive(String clusterIsActive) {
			this.clusterIsActive = clusterIsActive;
		}

		public Long getRegionNumericId() {
			return this.regionNumericId;
		}

		public void setRegionNumericId(Long regionNumericId) {
			this.regionNumericId = regionNumericId;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public String getClusterIdAlias() {
			return this.clusterIdAlias;
		}

		public void setClusterIdAlias(String clusterIdAlias) {
			this.clusterIdAlias = clusterIdAlias;
		}

		public String getClusterRouteIpSegment() {
			return this.clusterRouteIpSegment;
		}

		public void setClusterRouteIpSegment(String clusterRouteIpSegment) {
			this.clusterRouteIpSegment = clusterRouteIpSegment;
		}

		public String getClusterMemo() {
			return this.clusterMemo;
		}

		public void setClusterMemo(String clusterMemo) {
			this.clusterMemo = clusterMemo;
		}

		public Boolean getClusterIsWritable() {
			return this.clusterIsWritable;
		}

		public void setClusterIsWritable(Boolean clusterIsWritable) {
			this.clusterIsWritable = clusterIsWritable;
		}

		public String getAvailableZoneID() {
			return this.availableZoneID;
		}

		public void setAvailableZoneID(String availableZoneID) {
			this.availableZoneID = availableZoneID;
		}
	}

	@Override
	public OpsQueryInstanceModelResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryInstanceModelResponseUnmarshaller.unmarshall(this, context);
	}
}
