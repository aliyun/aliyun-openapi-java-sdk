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
import com.aliyuncs.sas.transform.v20181203.DescribeEmgVulItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEmgVulItemResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private List<GroupedVulItem> groupedVulItems;

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

	public List<GroupedVulItem> getGroupedVulItems() {
		return this.groupedVulItems;
	}

	public void setGroupedVulItems(List<GroupedVulItem> groupedVulItems) {
		this.groupedVulItems = groupedVulItems;
	}

	public static class GroupedVulItem {

		private String aliasName;

		private Integer pendingCount;

		private String name;

		private Long gmtPublish;

		private String description;

		private String type;

		private Integer status;

		private Integer progress;

		private Long gmtLastCheck;

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
		}

		public Integer getPendingCount() {
			return this.pendingCount;
		}

		public void setPendingCount(Integer pendingCount) {
			this.pendingCount = pendingCount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getGmtPublish() {
			return this.gmtPublish;
		}

		public void setGmtPublish(Long gmtPublish) {
			this.gmtPublish = gmtPublish;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getProgress() {
			return this.progress;
		}

		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		public Long getGmtLastCheck() {
			return this.gmtLastCheck;
		}

		public void setGmtLastCheck(Long gmtLastCheck) {
			this.gmtLastCheck = gmtLastCheck;
		}
	}

	@Override
	public DescribeEmgVulItemResponse getInstance(UnmarshallerContext context) {
		return	DescribeEmgVulItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
