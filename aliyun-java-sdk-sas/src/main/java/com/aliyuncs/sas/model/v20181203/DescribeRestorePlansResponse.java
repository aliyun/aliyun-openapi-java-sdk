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
import com.aliyuncs.sas.transform.v20181203.DescribeRestorePlansResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRestorePlansResponse extends AcsResponse {

	private String requestId;

	private List<RestorePlan> restorePlans;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RestorePlan> getRestorePlans() {
		return this.restorePlans;
	}

	public void setRestorePlans(List<RestorePlan> restorePlans) {
		this.restorePlans = restorePlans;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class RestorePlan {

		private String status;

		private Long restorePoint;

		private Long updatedTime;

		private String databaseName;

		private String instanceName;

		private String targetInstanceName;

		private String targetDatabaseName;

		private String policyName;

		private Long policyId;

		private String targetInstanceId;

		private Long createdTime;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getRestorePoint() {
			return this.restorePoint;
		}

		public void setRestorePoint(Long restorePoint) {
			this.restorePoint = restorePoint;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
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

		public String getTargetInstanceName() {
			return this.targetInstanceName;
		}

		public void setTargetInstanceName(String targetInstanceName) {
			this.targetInstanceName = targetInstanceName;
		}

		public String getTargetDatabaseName() {
			return this.targetDatabaseName;
		}

		public void setTargetDatabaseName(String targetDatabaseName) {
			this.targetDatabaseName = targetDatabaseName;
		}

		public String getPolicyName() {
			return this.policyName;
		}

		public void setPolicyName(String policyName) {
			this.policyName = policyName;
		}

		public Long getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(Long policyId) {
			this.policyId = policyId;
		}

		public String getTargetInstanceId() {
			return this.targetInstanceId;
		}

		public void setTargetInstanceId(String targetInstanceId) {
			this.targetInstanceId = targetInstanceId;
		}

		public Long getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(Long createdTime) {
			this.createdTime = createdTime;
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
	public DescribeRestorePlansResponse getInstance(UnmarshallerContext context) {
		return	DescribeRestorePlansResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
