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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeGroupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<RuleGroupsItem> ruleGroups;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<RuleGroupsItem> getRuleGroups() {
		return this.ruleGroups;
	}

	public void setRuleGroups(List<RuleGroupsItem> ruleGroups) {
		this.ruleGroups = ruleGroups;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class RuleGroupsItem {

		private String groupName;

		private Integer ruleNum;

		private Long modified;

		private Long create;

		private String description;

		private Integer id;

		private Long aliUid;

		private Integer status;

		private String machineGroupIds;

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getRuleNum() {
			return this.ruleNum;
		}

		public void setRuleNum(Integer ruleNum) {
			this.ruleNum = ruleNum;
		}

		public Long getModified() {
			return this.modified;
		}

		public void setModified(Long modified) {
			this.modified = modified;
		}

		public Long getCreate() {
			return this.create;
		}

		public void setCreate(Long create) {
			this.create = create;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getMachineGroupIds() {
			return this.machineGroupIds;
		}

		public void setMachineGroupIds(String machineGroupIds) {
			this.machineGroupIds = machineGroupIds;
		}
	}

	public static class PageInfo {

		private Integer count;

		private Integer pageSize;

		private Integer currentPage;

		private Integer totalCount;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}
	}

	@Override
	public DescribeGroupListResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
