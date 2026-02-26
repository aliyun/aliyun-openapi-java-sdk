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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribePlaybooksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlaybooksResponse extends AcsResponse {

	private String requestId;

	private List<Data> playbooks;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getPlaybooks() {
		return this.playbooks;
	}

	public void setPlaybooks(List<Data> playbooks) {
		this.playbooks = playbooks;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Data {

		private String displayName;

		private String playbookUuid;

		private String ownType;

		private Integer active;

		private Long lastRuntime;

		private Integer permission;

		private Long gmtCreate;

		private Integer playbookStatus;

		private String gmtModified;

		private String paramType;

		private String description;

		private String tenantId;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getPlaybookUuid() {
			return this.playbookUuid;
		}

		public void setPlaybookUuid(String playbookUuid) {
			this.playbookUuid = playbookUuid;
		}

		public String getOwnType() {
			return this.ownType;
		}

		public void setOwnType(String ownType) {
			this.ownType = ownType;
		}

		public Integer getActive() {
			return this.active;
		}

		public void setActive(Integer active) {
			this.active = active;
		}

		public Long getLastRuntime() {
			return this.lastRuntime;
		}

		public void setLastRuntime(Long lastRuntime) {
			this.lastRuntime = lastRuntime;
		}

		public Integer getPermission() {
			return this.permission;
		}

		public void setPermission(Integer permission) {
			this.permission = permission;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getPlaybookStatus() {
			return this.playbookStatus;
		}

		public void setPlaybookStatus(Integer playbookStatus) {
			this.playbookStatus = playbookStatus;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getParamType() {
			return this.paramType;
		}

		public void setParamType(String paramType) {
			this.paramType = paramType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}
	}

	public static class Page {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}
	}

	@Override
	public DescribePlaybooksResponse getInstance(UnmarshallerContext context) {
		return	DescribePlaybooksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
