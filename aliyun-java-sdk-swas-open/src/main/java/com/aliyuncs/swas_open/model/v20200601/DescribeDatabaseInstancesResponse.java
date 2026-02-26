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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeDatabaseInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<DatabaseInstance> databaseInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<DatabaseInstance> getDatabaseInstances() {
		return this.databaseInstances;
	}

	public void setDatabaseInstances(List<DatabaseInstance> databaseInstances) {
		this.databaseInstances = databaseInstances;
	}

	public static class DatabaseInstance {

		private String regionId;

		private String databaseInstanceId;

		private String databaseInstanceName;

		private String databaseInstanceEdition;

		private String databaseVersion;

		private String cpu;

		private String memory;

		private Integer storage;

		private String privateConnection;

		private String publicConnection;

		private String databaseInstanceStatus;

		private String businessStatus;

		private String creationTime;

		private String expiredTime;

		private String chargeType;

		private String superAccountName;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getDatabaseInstanceId() {
			return this.databaseInstanceId;
		}

		public void setDatabaseInstanceId(String databaseInstanceId) {
			this.databaseInstanceId = databaseInstanceId;
		}

		public String getDatabaseInstanceName() {
			return this.databaseInstanceName;
		}

		public void setDatabaseInstanceName(String databaseInstanceName) {
			this.databaseInstanceName = databaseInstanceName;
		}

		public String getDatabaseInstanceEdition() {
			return this.databaseInstanceEdition;
		}

		public void setDatabaseInstanceEdition(String databaseInstanceEdition) {
			this.databaseInstanceEdition = databaseInstanceEdition;
		}

		public String getDatabaseVersion() {
			return this.databaseVersion;
		}

		public void setDatabaseVersion(String databaseVersion) {
			this.databaseVersion = databaseVersion;
		}

		public String getCpu() {
			return this.cpu;
		}

		public void setCpu(String cpu) {
			this.cpu = cpu;
		}

		public String getMemory() {
			return this.memory;
		}

		public void setMemory(String memory) {
			this.memory = memory;
		}

		public Integer getStorage() {
			return this.storage;
		}

		public void setStorage(Integer storage) {
			this.storage = storage;
		}

		public String getPrivateConnection() {
			return this.privateConnection;
		}

		public void setPrivateConnection(String privateConnection) {
			this.privateConnection = privateConnection;
		}

		public String getPublicConnection() {
			return this.publicConnection;
		}

		public void setPublicConnection(String publicConnection) {
			this.publicConnection = publicConnection;
		}

		public String getDatabaseInstanceStatus() {
			return this.databaseInstanceStatus;
		}

		public void setDatabaseInstanceStatus(String databaseInstanceStatus) {
			this.databaseInstanceStatus = databaseInstanceStatus;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getSuperAccountName() {
			return this.superAccountName;
		}

		public void setSuperAccountName(String superAccountName) {
			this.superAccountName = superAccountName;
		}
	}

	@Override
	public DescribeDatabaseInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabaseInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
