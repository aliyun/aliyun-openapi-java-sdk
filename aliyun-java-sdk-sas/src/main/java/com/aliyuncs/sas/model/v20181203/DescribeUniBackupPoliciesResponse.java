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
import com.aliyuncs.sas.transform.v20181203.DescribeUniBackupPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUniBackupPoliciesResponse extends AcsResponse {

	private String requestId;

	private List<UniBackupPolicyDTO> uniBackupPolicies;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UniBackupPolicyDTO> getUniBackupPolicies() {
		return this.uniBackupPolicies;
	}

	public void setUniBackupPolicies(List<UniBackupPolicyDTO> uniBackupPolicies) {
		this.uniBackupPolicies = uniBackupPolicies;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class UniBackupPolicyDTO {

		private String policyStatus;

		private String errorMessage;

		private String latestBackResult;

		private String uniRegionId;

		private String planStatus;

		private String instanceUuid;

		private String policyName;

		private String agentErrorMessage;

		private String instanceId;

		private String agentStatus;

		private String databaseType;

		private Integer uniBackUpCount;

		private String errorCode;

		private String databaseName;

		private String instanceName;

		private String latestBackupTime;

		private String instanceStatus;

		private Long policyId;

		public String getPolicyStatus() {
			return this.policyStatus;
		}

		public void setPolicyStatus(String policyStatus) {
			this.policyStatus = policyStatus;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

		public String getLatestBackResult() {
			return this.latestBackResult;
		}

		public void setLatestBackResult(String latestBackResult) {
			this.latestBackResult = latestBackResult;
		}

		public String getUniRegionId() {
			return this.uniRegionId;
		}

		public void setUniRegionId(String uniRegionId) {
			this.uniRegionId = uniRegionId;
		}

		public String getPlanStatus() {
			return this.planStatus;
		}

		public void setPlanStatus(String planStatus) {
			this.planStatus = planStatus;
		}

		public String getInstanceUuid() {
			return this.instanceUuid;
		}

		public void setInstanceUuid(String instanceUuid) {
			this.instanceUuid = instanceUuid;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public String getAgentErrorMessage() {
			return this.agentErrorMessage;
		}

		public void setAgentErrorMessage(String agentErrorMessage) {
			this.agentErrorMessage = agentErrorMessage;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}

		public String getDatabaseType() {
			return this.databaseType;
		}

		public void setDatabaseType(String databaseType) {
			this.databaseType = databaseType;
		}

		public Integer getUniBackUpCount() {
			return this.uniBackUpCount;
		}

		public void setUniBackUpCount(Integer uniBackUpCount) {
			this.uniBackUpCount = uniBackUpCount;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
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

		public String getLatestBackupTime() {
			return this.latestBackupTime;
		}

		public void setLatestBackupTime(String latestBackupTime) {
			this.latestBackupTime = latestBackupTime;
		}

		public String getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(String instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public Long getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(Long policyId) {
			this.policyId = policyId;
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
	public DescribeUniBackupPoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUniBackupPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
