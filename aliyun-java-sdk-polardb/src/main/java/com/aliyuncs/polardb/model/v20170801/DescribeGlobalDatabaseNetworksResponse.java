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
import com.aliyuncs.polardb.transform.v20170801.DescribeGlobalDatabaseNetworksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalDatabaseNetworksResponse extends AcsResponse {

	private Integer totalRecordCount;

	private Integer pageRecordCount;

	private String requestId;

	private Integer pageNumber;

	private List<GlobalDatabaseNetwork> items;

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

	public List<GlobalDatabaseNetwork> getItems() {
		return this.items;
	}

	public void setItems(List<GlobalDatabaseNetwork> items) {
		this.items = items;
	}

	public static class GlobalDatabaseNetwork {

		private String dBVersion;

		private String gDNId;

		private String createTime;

		private String gDNStatus;

		private String dBType;

		private String gDNDescription;

		private List<DBCluster> dBClusters;

		public String getDBVersion() {
			return this.dBVersion;
		}

		public void setDBVersion(String dBVersion) {
			this.dBVersion = dBVersion;
		}

		public String getGDNId() {
			return this.gDNId;
		}

		public void setGDNId(String gDNId) {
			this.gDNId = gDNId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getGDNStatus() {
			return this.gDNStatus;
		}

		public void setGDNStatus(String gDNStatus) {
			this.gDNStatus = gDNStatus;
		}

		public String getDBType() {
			return this.dBType;
		}

		public void setDBType(String dBType) {
			this.dBType = dBType;
		}

		public String getGDNDescription() {
			return this.gDNDescription;
		}

		public void setGDNDescription(String gDNDescription) {
			this.gDNDescription = gDNDescription;
		}

		public List<DBCluster> getDBClusters() {
			return this.dBClusters;
		}

		public void setDBClusters(List<DBCluster> dBClusters) {
			this.dBClusters = dBClusters;
		}

		public static class DBCluster {

			private String dBClusterId;

			private String role;

			private String regionId;

			public String getDBClusterId() {
				return this.dBClusterId;
			}

			public void setDBClusterId(String dBClusterId) {
				this.dBClusterId = dBClusterId;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}
		}
	}

	@Override
	public DescribeGlobalDatabaseNetworksResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalDatabaseNetworksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
