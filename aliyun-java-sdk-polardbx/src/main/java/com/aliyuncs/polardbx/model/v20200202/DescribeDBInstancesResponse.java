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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeDBInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalNumber;

	private List<DBInstance> dBInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalNumber() {
		return this.totalNumber;
	}

	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	public List<DBInstance> getDBInstances() {
		return this.dBInstances;
	}

	public void setDBInstances(List<DBInstance> dBInstances) {
		this.dBInstances = dBInstances;
	}

	public static class DBInstance {

		private String type;

		private String status;

		private String commodityCode;

		private String expireTime;

		private Boolean expired;

		private String createTime;

		private String payType;

		private String lockReason;

		private String dBType;

		private String lockMode;

		private String vPCId;

		private String minorVersion;

		private String regionId;

		private String network;

		private String dBVersion;

		private String description;

		private String nodeClass;

		private Long storageUsed;

		private Integer nodeCount;

		private String zoneId;

		private String engine;

		private String id;

		private String resourceGroupId;

		private String dBInstanceName;

		private Integer dnNodeCount;

		private Integer cnNodeCount;

		private String cnNodeClassCode;

		private String dnNodeClassCode;

		private String series;

		private Boolean containBinlogX;

		private Boolean supportBinlogX;

		private String cdcInstanceName;

		private String topologyType;

		private String tertiaryZone;

		private String primaryZone;

		private String secondaryZone;

		private String columnarInstanceName;

		private Boolean isInGdn;

		private String gdnRole;

		private String cpuType;

		private List<PolarDBXNode> nodes;

		private List<TagSetItem> tagSet;

		private List<String> readDBInstances;

		private List<String> columnarReadDBInstances;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public Boolean getExpired() {
			return this.expired;
		}

		public void setExpired(Boolean expired) {
			this.expired = expired;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getVPCId() {
			return this.vPCId;
		}

		public void setVPCId(String vPCId) {
			this.vPCId = vPCId;
		}

		public String getMinorVersion() {
			return this.minorVersion;
		}

		public void setMinorVersion(String minorVersion) {
			this.minorVersion = minorVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getNetwork() {
			return this.network;
		}

		public void setNetwork(String network) {
			this.network = network;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getNodeClass() {
			return this.nodeClass;
		}

		public void setNodeClass(String nodeClass) {
			this.nodeClass = nodeClass;
		}

		public Long getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(Long storageUsed) {
			this.storageUsed = storageUsed;
		}

		public Integer getNodeCount() {
			return this.nodeCount;
		}

		public void setNodeCount(Integer nodeCount) {
			this.nodeCount = nodeCount;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public String getDBInstanceName() {
			return this.dBInstanceName;
		}

		public void setDBInstanceName(String dBInstanceName) {
			this.dBInstanceName = dBInstanceName;
		}

		public Integer getDnNodeCount() {
			return this.dnNodeCount;
		}

		public void setDnNodeCount(Integer dnNodeCount) {
			this.dnNodeCount = dnNodeCount;
		}

		public Integer getCnNodeCount() {
			return this.cnNodeCount;
		}

		public void setCnNodeCount(Integer cnNodeCount) {
			this.cnNodeCount = cnNodeCount;
		}

		public String getCnNodeClassCode() {
			return this.cnNodeClassCode;
		}

		public void setCnNodeClassCode(String cnNodeClassCode) {
			this.cnNodeClassCode = cnNodeClassCode;
		}

		public String getDnNodeClassCode() {
			return this.dnNodeClassCode;
		}

		public void setDnNodeClassCode(String dnNodeClassCode) {
			this.dnNodeClassCode = dnNodeClassCode;
		}

		public String getSeries() {
			return this.series;
		}

		public void setSeries(String series) {
			this.series = series;
		}

		public Boolean getContainBinlogX() {
			return this.containBinlogX;
		}

		public void setContainBinlogX(Boolean containBinlogX) {
			this.containBinlogX = containBinlogX;
		}

		public Boolean getSupportBinlogX() {
			return this.supportBinlogX;
		}

		public void setSupportBinlogX(Boolean supportBinlogX) {
			this.supportBinlogX = supportBinlogX;
		}

		public String getCdcInstanceName() {
			return this.cdcInstanceName;
		}

		public void setCdcInstanceName(String cdcInstanceName) {
			this.cdcInstanceName = cdcInstanceName;
		}

		public String getTopologyType() {
			return this.topologyType;
		}

		public void setTopologyType(String topologyType) {
			this.topologyType = topologyType;
		}

		public String getTertiaryZone() {
			return this.tertiaryZone;
		}

		public void setTertiaryZone(String tertiaryZone) {
			this.tertiaryZone = tertiaryZone;
		}

		public String getPrimaryZone() {
			return this.primaryZone;
		}

		public void setPrimaryZone(String primaryZone) {
			this.primaryZone = primaryZone;
		}

		public String getSecondaryZone() {
			return this.secondaryZone;
		}

		public void setSecondaryZone(String secondaryZone) {
			this.secondaryZone = secondaryZone;
		}

		public String getColumnarInstanceName() {
			return this.columnarInstanceName;
		}

		public void setColumnarInstanceName(String columnarInstanceName) {
			this.columnarInstanceName = columnarInstanceName;
		}

		public Boolean getIsInGdn() {
			return this.isInGdn;
		}

		public void setIsInGdn(Boolean isInGdn) {
			this.isInGdn = isInGdn;
		}

		public String getGdnRole() {
			return this.gdnRole;
		}

		public void setGdnRole(String gdnRole) {
			this.gdnRole = gdnRole;
		}

		public String getCpuType() {
			return this.cpuType;
		}

		public void setCpuType(String cpuType) {
			this.cpuType = cpuType;
		}

		public List<PolarDBXNode> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<PolarDBXNode> nodes) {
			this.nodes = nodes;
		}

		public List<TagSetItem> getTagSet() {
			return this.tagSet;
		}

		public void setTagSet(List<TagSetItem> tagSet) {
			this.tagSet = tagSet;
		}

		public List<String> getReadDBInstances() {
			return this.readDBInstances;
		}

		public void setReadDBInstances(List<String> readDBInstances) {
			this.readDBInstances = readDBInstances;
		}

		public List<String> getColumnarReadDBInstances() {
			return this.columnarReadDBInstances;
		}

		public void setColumnarReadDBInstances(List<String> columnarReadDBInstances) {
			this.columnarReadDBInstances = columnarReadDBInstances;
		}

		public static class PolarDBXNode {

			private String zoneId;

			private String id;

			private String classCode;

			private String regionId;

			public String getZoneId() {
				return this.zoneId;
			}

			public void setZoneId(String zoneId) {
				this.zoneId = zoneId;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getClassCode() {
				return this.classCode;
			}

			public void setClassCode(String classCode) {
				this.classCode = classCode;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}

		public static class TagSetItem {

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

	@Override
	public DescribeDBInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
