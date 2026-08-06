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
import com.aliyuncs.nas.transform.v20170626.DescribeLifecyclePolicyLogsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLifecyclePolicyLogsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Boolean success;

	private List<LifecyclePolicyLog> lifecyclePolicyLogs;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<LifecyclePolicyLog> getLifecyclePolicyLogs() {
		return this.lifecyclePolicyLogs;
	}

	public void setLifecyclePolicyLogs(List<LifecyclePolicyLog> lifecyclePolicyLogs) {
		this.lifecyclePolicyLogs = lifecyclePolicyLogs;
	}

	public static class LifecyclePolicyLog {

		private String status;

		private String storageType;

		private String createTime;

		private String summary;

		private List<Rule> retrieveRules;

		private List<Rule> deleteRules;

		private List<Rule> transitRules;

		private List<String> paths;

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

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSummary() {
			return this.summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
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
	public DescribeLifecyclePolicyLogsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLifecyclePolicyLogsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
