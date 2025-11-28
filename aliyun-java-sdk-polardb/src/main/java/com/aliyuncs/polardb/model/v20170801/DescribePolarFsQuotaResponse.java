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
import com.aliyuncs.polardb.transform.v20170801.DescribePolarFsQuotaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolarFsQuotaResponse extends AcsResponse {

	private String requestId;

	private String polarFsInstanceId;

	private String quotaNameMatch;

	private String patternMatch;

	private String pageSize;

	private String pageNumber;

	private String totalRecordCount;

	private String pageRecordCount;

	private List<PolicyItem> policyItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPolarFsInstanceId() {
		return this.polarFsInstanceId;
	}

	public void setPolarFsInstanceId(String polarFsInstanceId) {
		this.polarFsInstanceId = polarFsInstanceId;
	}

	public String getQuotaNameMatch() {
		return this.quotaNameMatch;
	}

	public void setQuotaNameMatch(String quotaNameMatch) {
		this.quotaNameMatch = quotaNameMatch;
	}

	public String getPatternMatch() {
		return this.patternMatch;
	}

	public void setPatternMatch(String patternMatch) {
		this.patternMatch = patternMatch;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(String totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public String getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(String pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<PolicyItem> getPolicyItems() {
		return this.policyItems;
	}

	public void setPolicyItems(List<PolicyItem> policyItems) {
		this.policyItems = policyItems;
	}

	public static class PolicyItem {

		private Long id;

		private String name;

		private String description;

		private String include;

		private String exclude;

		private Long sizeLimit;

		private Long fileCountLimit;

		private Long accessTTL;

		private Long changeTTL;

		private Integer priority;

		private Boolean enabled;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getInclude() {
			return this.include;
		}

		public void setInclude(String include) {
			this.include = include;
		}

		public String getExclude() {
			return this.exclude;
		}

		public void setExclude(String exclude) {
			this.exclude = exclude;
		}

		public Long getSizeLimit() {
			return this.sizeLimit;
		}

		public void setSizeLimit(Long sizeLimit) {
			this.sizeLimit = sizeLimit;
		}

		public Long getFileCountLimit() {
			return this.fileCountLimit;
		}

		public void setFileCountLimit(Long fileCountLimit) {
			this.fileCountLimit = fileCountLimit;
		}

		public Long getAccessTTL() {
			return this.accessTTL;
		}

		public void setAccessTTL(Long accessTTL) {
			this.accessTTL = accessTTL;
		}

		public Long getChangeTTL() {
			return this.changeTTL;
		}

		public void setChangeTTL(Long changeTTL) {
			this.changeTTL = changeTTL;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
	}

	@Override
	public DescribePolarFsQuotaResponse getInstance(UnmarshallerContext context) {
		return	DescribePolarFsQuotaResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
