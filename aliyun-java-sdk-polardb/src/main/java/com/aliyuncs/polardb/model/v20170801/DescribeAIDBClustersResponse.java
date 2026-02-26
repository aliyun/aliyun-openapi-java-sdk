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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeAIDBClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAIDBClustersResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private Integer pageNumber;

	private String engine;

	private String engineVersion;

	private String dBClusterId;

	private List<DBCluster> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getEngineVersion() {
		return this.engineVersion;
	}

	public void setEngineVersion(String engineVersion) {
		this.engineVersion = engineVersion;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<DBCluster> getItems() {
		return this.items;
	}

	public void setItems(List<DBCluster> items) {
		this.items = items;
	}

	public static class DBCluster {

		private String dBClusterId;

		private String regionId;

		private String zoneId;

		private String payType;

		private String dBClusterStatus;

		private String dBClusterDescription;

		private String vpcId;

		private String dBNodeClass;

		private String storageType;

		private Integer storageSpace;

		private String expireTime;

		private Boolean expired;

		private String lockMode;

		private String createTime;

		private Boolean mounted;

		private String mountDir;

		private String cloudInstanceIp;

		private String kubeClusterId;

		private String runType;

		private String dBType;

		private String dBNodeStatus;

		private String engineVersion;

		private String modelName;

		private String dBNodeStatusDesc;

		private String dataZoneId;

		private String dBNodeId;

		private String creationTime;

		private String maxQpm;

		private String engine;

		private String dBNodeDescription;

		private String aiNodeType;

		private String vswitchId;

		private String relativeDBClusterId;

		private List<Tag> tags;

		private List<String> connAddrs;

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getDBClusterStatus() {
			return this.dBClusterStatus;
		}

		public void setDBClusterStatus(String dBClusterStatus) {
			this.dBClusterStatus = dBClusterStatus;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Integer getStorageSpace() {
			return this.storageSpace;
		}

		public void setStorageSpace(Integer storageSpace) {
			this.storageSpace = storageSpace;
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

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Boolean getMounted() {
			return this.mounted;
		}

		public void setMounted(Boolean mounted) {
			this.mounted = mounted;
		}

		public String getMountDir() {
			return this.mountDir;
		}

		public void setMountDir(String mountDir) {
			this.mountDir = mountDir;
		}

		public String getCloudInstanceIp() {
			return this.cloudInstanceIp;
		}

		public void setCloudInstanceIp(String cloudInstanceIp) {
			this.cloudInstanceIp = cloudInstanceIp;
		}

		public String getKubeClusterId() {
			return this.kubeClusterId;
		}

		public void setKubeClusterId(String kubeClusterId) {
			this.kubeClusterId = kubeClusterId;
		}

		public String getRunType() {
			return this.runType;
		}

		public void setRunType(String runType) {
			this.runType = runType;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getDBNodeStatus() {
			return this.dBNodeStatus;
		}

		public void setDBNodeStatus(String dBNodeStatus) {
			this.dBNodeStatus = dBNodeStatus;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getModelName() {
			return this.modelName;
		}

		public void setModelName(String modelName) {
			this.modelName = modelName;
		}

		public String getDBNodeStatusDesc() {
			return this.dBNodeStatusDesc;
		}

		public void setDBNodeStatusDesc(String dBNodeStatusDesc) {
			this.dBNodeStatusDesc = dBNodeStatusDesc;
		}

		public String getDataZoneId() {
			return this.dataZoneId;
		}

		public void setDataZoneId(String dataZoneId) {
			this.dataZoneId = dataZoneId;
		}

		public String getDBNodeId() {
			return this.dBNodeId;
		}

		public void setDBNodeId(String dBNodeId) {
			this.dBNodeId = dBNodeId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getMaxQpm() {
			return this.maxQpm;
		}

		public void setMaxQpm(String maxQpm) {
			this.maxQpm = maxQpm;
		}

		public String getEngine() {
			return this.engine;
		}

		public void setEngine(String engine) {
			this.engine = engine;
		}

		public String getDBNodeDescription() {
			return this.dBNodeDescription;
		}

		public void setDBNodeDescription(String dBNodeDescription) {
			this.dBNodeDescription = dBNodeDescription;
		}

		public String getAiNodeType() {
			return this.aiNodeType;
		}

		public void setAiNodeType(String aiNodeType) {
			this.aiNodeType = aiNodeType;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getRelativeDBClusterId() {
			return this.relativeDBClusterId;
		}

		public void setRelativeDBClusterId(String relativeDBClusterId) {
			this.relativeDBClusterId = relativeDBClusterId;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getConnAddrs() {
			return this.connAddrs;
		}

		public void setConnAddrs(List<String> connAddrs) {
			this.connAddrs = connAddrs;
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
	}

	@Override
	public DescribeAIDBClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeAIDBClustersResponseUnmarshaller.unmarshall(this, context);
	}
}
