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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClustersZonalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClustersZonalResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private Integer maxResults;

	private String nextToken;

	private List<DBCluster> items;

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<DBCluster> getItems() {
		return this.items;
	}

	public void setItems(List<DBCluster> items) {
		this.items = items;
	}

	public static class DBCluster {

		private String category;

		private String dBClusterId;

		private String dBType;

		private String centralControlRegionId;

		private String dBVersion;

		private String cloudProvider;

		private String storageType;

		private String zoneId;

		private String dBClusterStatus;

		private String createTime;

		private String dBClusterDescription;

		private String expired;

		private String payType;

		private String lockMode;

		private String vswitchId;

		private String strictConsistency;

		private String dBNodeClass;

		private Long storageUsed;

		private String eNSRegionId;

		private Integer cnNodeCount;

		private Integer dBNodeNumber;

		private String vpcId;

		private String cnClass;

		private Long storageSpace;

		private String serverlessType;

		private String aiType;

		private String cpuCores;

		private String cloudInstanceIp;

		private String subCategory;

		private String expireTime;

		private List<Tag> tags;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getCentralControlRegionId() {
			return this.centralControlRegionId;
		}

		public void setCentralControlRegionId(String centralControlRegionId) {
			this.centralControlRegionId = centralControlRegionId;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getCloudProvider() {
			return this.cloudProvider;
		}

		public void setCloudProvider(String cloudProvider) {
			this.cloudProvider = cloudProvider;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getDBClusterStatus() {
			return this.dBClusterStatus;
		}

		public void setDBClusterStatus(String dBClusterStatus) {
			this.dBClusterStatus = dBClusterStatus;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getLockMode() {
			return this.lockMode;
		}

		public void setLockMode(String lockMode) {
			this.lockMode = lockMode;
		}

		public String getVswitchId() {
			return this.vswitchId;
		}

		public void setVswitchId(String vswitchId) {
			this.vswitchId = vswitchId;
		}

		public String getStrictConsistency() {
			return this.strictConsistency;
		}

		public void setStrictConsistency(String strictConsistency) {
			this.strictConsistency = strictConsistency;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public Long getStorageUsed() {
			return this.storageUsed;
		}

		public void setStorageUsed(Long storageUsed) {
			this.storageUsed = storageUsed;
		}

		public String getENSRegionId() {
			return this.eNSRegionId;
		}

		public void setENSRegionId(String eNSRegionId) {
			this.eNSRegionId = eNSRegionId;
		}

		public Integer getCnNodeCount() {
			return this.cnNodeCount;
		}

		public void setCnNodeCount(Integer cnNodeCount) {
			this.cnNodeCount = cnNodeCount;
		}

		public Integer getDBNodeNumber() {
			return this.dBNodeNumber;
		}

		public void setDBNodeNumber(Integer dBNodeNumber) {
			this.dBNodeNumber = dBNodeNumber;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCnClass() {
			return this.cnClass;
		}

		public void setCnClass(String cnClass) {
			this.cnClass = cnClass;
		}

		public Long getStorageSpace() {
			return this.storageSpace;
		}

		public void setStorageSpace(Long storageSpace) {
			this.storageSpace = storageSpace;
		}

		public String getServerlessType() {
			return this.serverlessType;
		}

		public void setServerlessType(String serverlessType) {
			this.serverlessType = serverlessType;
		}

		public String getAiType() {
			return this.aiType;
		}

		public void setAiType(String aiType) {
			this.aiType = aiType;
		}

		public String getCpuCores() {
			return this.cpuCores;
		}

		public void setCpuCores(String cpuCores) {
			this.cpuCores = cpuCores;
		}

		public String getCloudInstanceIp() {
			return this.cloudInstanceIp;
		}

		public void setCloudInstanceIp(String cloudInstanceIp) {
			this.cloudInstanceIp = cloudInstanceIp;
		}

		public String getSubCategory() {
			return this.subCategory;
		}

		public void setSubCategory(String subCategory) {
			this.subCategory = subCategory;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class Tag {

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
	}

	@Override
	public DescribeDBClustersZonalResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClustersZonalResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
