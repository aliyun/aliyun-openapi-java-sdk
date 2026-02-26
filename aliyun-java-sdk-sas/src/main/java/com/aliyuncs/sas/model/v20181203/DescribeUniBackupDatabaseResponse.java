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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeUniBackupDatabaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUniBackupDatabaseResponse extends AcsResponse {

	private String requestId;

	private List<Database> databaseList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Database> getDatabaseList() {
		return this.databaseList;
	}

	public void setDatabaseList(List<Database> databaseList) {
		this.databaseList = databaseList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class Database {

		private String status;

		private String databaseType;

		private String databaseVersion;

		private String databaseName;

		private String instanceName;

		private String instanceUuid;

		private String createdByProduct;

		private String instanceId;

		private Long policyId;

		private String agentStatus;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDatabaseType() {
			return this.databaseType;
		}

		public void setDatabaseType(String databaseType) {
			this.databaseType = databaseType;
		}

		public String getDatabaseVersion() {
			return this.databaseVersion;
		}

		public void setDatabaseVersion(String databaseVersion) {
			this.databaseVersion = databaseVersion;
		}

		public String getDatabaseName() {
			return this.databaseName;
		}

		public void setDatabaseName(String databaseName) {
			this.databaseName = databaseName;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getInstanceUuid() {
			return this.instanceUuid;
		}

		public void setInstanceUuid(String instanceUuid) {
			this.instanceUuid = instanceUuid;
		}

		public String getCreatedByProduct() {
			return this.createdByProduct;
		}

		public void setCreatedByProduct(String createdByProduct) {
			this.createdByProduct = createdByProduct;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(Long policyId) {
			this.policyId = policyId;
		}

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public DescribeUniBackupDatabaseResponse getInstance(UnmarshallerContext context) {
		return	DescribeUniBackupDatabaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
