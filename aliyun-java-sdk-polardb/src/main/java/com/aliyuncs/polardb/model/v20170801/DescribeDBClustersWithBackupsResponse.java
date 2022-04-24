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
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClustersWithBackupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClustersWithBackupsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private Integer totalRecordCount;

	private List<DBCluster> items;

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

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public List<DBCluster> getItems() {
		return this.items;
	}

	public void setItems(List<DBCluster> items) {
		this.items = items;
	}

	public static class DBCluster {

		private String deletedTime;

		private String vpcId;

		private String expireTime;

		private String expired;

		private String createTime;

		private String dBNodeClass;

		private String payType;

		private String dBType;

		private String lockMode;

		private String regionId;

		private Integer deletionLock;

		private String dBVersion;

		private String dBClusterId;

		private String dBClusterStatus;

		private Integer isDeleted;

		private String dBClusterNetworkType;

		private String dBClusterDescription;

		private String zoneId;

		private String engine;

		public String getDeletedTime() {
			return this.deletedTime;
		}

		public void setDeletedTime(String deletedTime) {
			this.deletedTime = deletedTime;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getExpired() {
			return this.expired;
		}

		public void setExpired(String expired) {
			this.expired = expired;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getDeletionLock() {
			return this.deletionLock;
		}

		public void setDeletionLock(Integer deletionLock) {
			this.deletionLock = deletionLock;
		}

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getDBClusterId() {
			return this.dBClusterId;
		}

		public void setDBClusterId(String dBClusterId) {
			this.dBClusterId = dBClusterId;
		}

		public String getDBClusterStatus() {
			return this.dBClusterStatus;
		}

		public void setDBClusterStatus(String dBClusterStatus) {
			this.dBClusterStatus = dBClusterStatus;
		}

		public Integer getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Integer isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getDBClusterNetworkType() {
			return this.dBClusterNetworkType;
		}

		public void setDBClusterNetworkType(String dBClusterNetworkType) {
			this.dBClusterNetworkType = dBClusterNetworkType;
		}

		public String getDBClusterDescription() {
			return this.dBClusterDescription;
		}

		public void setDBClusterDescription(String dBClusterDescription) {
			this.dBClusterDescription = dBClusterDescription;
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
	}

	@Override
	public DescribeDBClustersWithBackupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClustersWithBackupsResponseUnmarshaller.unmarshall(this, context);
	}
}
