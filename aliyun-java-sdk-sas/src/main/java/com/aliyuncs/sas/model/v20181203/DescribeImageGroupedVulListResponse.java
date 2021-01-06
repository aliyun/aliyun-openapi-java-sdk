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
import com.aliyuncs.sas.transform.v20181203.DescribeImageGroupedVulListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageGroupedVulListResponse extends AcsResponse {

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

		private String name;

		private String aliasName;

		private String type;

		private Integer status;

		private Long lastScanTime;

		private Long gmtLast;

		private Integer asapCount;

		private Integer laterCount;

		private Integer nntfCount;

		private String tags;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAliasName() {
			return this.aliasName;
		}

		public void setAliasName(String aliasName) {
			this.aliasName = aliasName;
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

		public Long getLastScanTime() {
			return this.lastScanTime;
		}

		public void setLastScanTime(Long lastScanTime) {
			this.lastScanTime = lastScanTime;
		}

		public Long getGmtLast() {
			return this.gmtLast;
		}

		public void setGmtLast(Long gmtLast) {
			this.gmtLast = gmtLast;
		}

		public Integer getAsapCount() {
			return this.asapCount;
		}

		public void setAsapCount(Integer asapCount) {
			this.asapCount = asapCount;
		}

		public Integer getLaterCount() {
			return this.laterCount;
		}

		public void setLaterCount(Integer laterCount) {
			this.laterCount = laterCount;
		}

		public Integer getNntfCount() {
			return this.nntfCount;
		}

		public void setNntfCount(Integer nntfCount) {
			this.nntfCount = nntfCount;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}
	}

	@Override
	public DescribeImageGroupedVulListResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageGroupedVulListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
