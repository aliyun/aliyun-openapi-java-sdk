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
import com.aliyuncs.sas.transform.v20181203.ListCheckResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCheckResultResponse extends AcsResponse {

	private String requestId;

	private List<ChecksItem> checks;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ChecksItem> getChecks() {
		return this.checks;
	}

	public void setChecks(List<ChecksItem> checks) {
		this.checks = checks;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ChecksItem {

		private Long checkId;

		private String checkShowName;

		private String vendor;

		private String vendorShowName;

		private String instanceType;

		private String instanceSubType;

		private String riskLevel;

		private String status;

		private String taskId;

		private Long lastCheckTime;

		private Boolean trialPermission;

		private List<CheckPolicie> checkPolicies;

		public Long getCheckId() {
			return this.checkId;
		}

		public void setCheckId(Long checkId) {
			this.checkId = checkId;
		}

		public String getCheckShowName() {
			return this.checkShowName;
		}

		public void setCheckShowName(String checkShowName) {
			this.checkShowName = checkShowName;
		}

		public String getVendor() {
			return this.vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public String getVendorShowName() {
			return this.vendorShowName;
		}

		public void setVendorShowName(String vendorShowName) {
			this.vendorShowName = vendorShowName;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceSubType() {
			return this.instanceSubType;
		}

		public void setInstanceSubType(String instanceSubType) {
			this.instanceSubType = instanceSubType;
		}

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Long getLastCheckTime() {
			return this.lastCheckTime;
		}

		public void setLastCheckTime(Long lastCheckTime) {
			this.lastCheckTime = lastCheckTime;
		}

		public Boolean getTrialPermission() {
			return this.trialPermission;
		}

		public void setTrialPermission(Boolean trialPermission) {
			this.trialPermission = trialPermission;
		}

		public List<CheckPolicie> getCheckPolicies() {
			return this.checkPolicies;
		}

		public void setCheckPolicies(List<CheckPolicie> checkPolicies) {
			this.checkPolicies = checkPolicies;
		}

		public static class CheckPolicie {

			private Long standardId;

			private String standardShowName;

			private Long requirementId;

			private String requirementShowName;

			private Long sectionId;

			private String sectionShowName;

			public Long getStandardId() {
				return this.standardId;
			}

			public void setStandardId(Long standardId) {
				this.standardId = standardId;
			}

			public String getStandardShowName() {
				return this.standardShowName;
			}

			public void setStandardShowName(String standardShowName) {
				this.standardShowName = standardShowName;
			}

			public Long getRequirementId() {
				return this.requirementId;
			}

			public void setRequirementId(Long requirementId) {
				this.requirementId = requirementId;
			}

			public String getRequirementShowName() {
				return this.requirementShowName;
			}

			public void setRequirementShowName(String requirementShowName) {
				this.requirementShowName = requirementShowName;
			}

			public Long getSectionId() {
				return this.sectionId;
			}

			public void setSectionId(Long sectionId) {
				this.sectionId = sectionId;
			}

			public String getSectionShowName() {
				return this.sectionShowName;
			}

			public void setSectionShowName(String sectionShowName) {
				this.sectionShowName = sectionShowName;
			}
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private String nextToken;

		private Integer maxResults;

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

		public String getNextToken() {
			return this.nextToken;
		}

		public void setNextToken(String nextToken) {
			this.nextToken = nextToken;
		}

		public Integer getMaxResults() {
			return this.maxResults;
		}

		public void setMaxResults(Integer maxResults) {
			this.maxResults = maxResults;
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
	public ListCheckResultResponse getInstance(UnmarshallerContext context) {
		return	ListCheckResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
