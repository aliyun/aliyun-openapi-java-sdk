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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeLifecyclePoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecyclePoliciesResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<LifecyclePolicy> lifecyclePolicies;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<LifecyclePolicy> getLifecyclePolicies() {
		return this.lifecyclePolicies;
	}

	public void setLifecyclePolicies(List<LifecyclePolicy> lifecyclePolicies) {
		this.lifecyclePolicies = lifecyclePolicies;
	}

	public static class LifecyclePolicy {

		private String path;

		private String status;

		private String storageType;

		private String description;

		private String lifecycleRuleName;

		private String lifecyclePolicyId;

		private String createTime;

		private String lifecyclePolicyType;

		private String lifecyclePolicyName;

		private String fileSystemId;

		private String lifecycleRuleType;

		private Boolean enableLifecycle;

		private List<Rule> retrieveRules;

		private List<Rule> deleteRules;

		private List<Rule> transitRules;

		private List<String> fsetIds;

		private List<String> paths;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLifecycleRuleName() {
			return this.lifecycleRuleName;
		}

		public void setLifecycleRuleName(String lifecycleRuleName) {
			this.lifecycleRuleName = lifecycleRuleName;
		}

		public String getLifecyclePolicyId() {
			return this.lifecyclePolicyId;
		}

		public void setLifecyclePolicyId(String lifecyclePolicyId) {
			this.lifecyclePolicyId = lifecyclePolicyId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getLifecyclePolicyType() {
			return this.lifecyclePolicyType;
		}

		public void setLifecyclePolicyType(String lifecyclePolicyType) {
			this.lifecyclePolicyType = lifecyclePolicyType;
		}

		public String getLifecyclePolicyName() {
			return this.lifecyclePolicyName;
		}

		public void setLifecyclePolicyName(String lifecyclePolicyName) {
			this.lifecyclePolicyName = lifecyclePolicyName;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getLifecycleRuleType() {
			return this.lifecycleRuleType;
		}

		public void setLifecycleRuleType(String lifecycleRuleType) {
			this.lifecycleRuleType = lifecycleRuleType;
		}

		public Boolean getEnableLifecycle() {
			return this.enableLifecycle;
		}

		public void setEnableLifecycle(Boolean enableLifecycle) {
			this.enableLifecycle = enableLifecycle;
		}

		public List<Rule> getRetrieveRules() {
			return this.retrieveRules;
		}

		public void setRetrieveRules(List<Rule> retrieveRules) {
			this.retrieveRules = retrieveRules;
		}

		public List<Rule> getDeleteRules() {
			return this.deleteRules;
		}

		public void setDeleteRules(List<Rule> deleteRules) {
			this.deleteRules = deleteRules;
		}

		public List<Rule> getTransitRules() {
			return this.transitRules;
		}

		public void setTransitRules(List<Rule> transitRules) {
			this.transitRules = transitRules;
		}

		public List<String> getFsetIds() {
			return this.fsetIds;
		}

		public void setFsetIds(List<String> fsetIds) {
			this.fsetIds = fsetIds;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}

		public static class Rule {

			private String attribute;

			private String threshold;

			public String getAttribute() {
				return this.attribute;
			}

			public void setAttribute(String attribute) {
				this.attribute = attribute;
			}

			public String getThreshold() {
				return this.threshold;
			}

			public void setThreshold(String threshold) {
				this.threshold = threshold;
			}
		}
	}

	@Override
	public DescribeLifecyclePoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLifecyclePoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
