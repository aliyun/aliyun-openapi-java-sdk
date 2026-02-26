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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetSyntheticTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSyntheticTaskListResponse extends AcsResponse {

	private String requestId;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class PageInfo {

		private Long total;

		private Long size;

		private String pages;

		private String prepage;

		private String nextPage;

		private Boolean isFirstPage;

		private Boolean isLastPage;

		private Boolean hasPreviousPage;

		private String hasNextPage;

		private String navigatePageNums;

		private String navigateFirstPage;

		private String navigateLastPage;

		private List<ListItem> list;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getPages() {
			return this.pages;
		}

		public void setPages(String pages) {
			this.pages = pages;
		}

		public String getPrepage() {
			return this.prepage;
		}

		public void setPrepage(String prepage) {
			this.prepage = prepage;
		}

		public String getNextPage() {
			return this.nextPage;
		}

		public void setNextPage(String nextPage) {
			this.nextPage = nextPage;
		}

		public Boolean getIsFirstPage() {
			return this.isFirstPage;
		}

		public void setIsFirstPage(Boolean isFirstPage) {
			this.isFirstPage = isFirstPage;
		}

		public Boolean getIsLastPage() {
			return this.isLastPage;
		}

		public void setIsLastPage(Boolean isLastPage) {
			this.isLastPage = isLastPage;
		}

		public Boolean getHasPreviousPage() {
			return this.hasPreviousPage;
		}

		public void setHasPreviousPage(Boolean hasPreviousPage) {
			this.hasPreviousPage = hasPreviousPage;
		}

		public String getHasNextPage() {
			return this.hasNextPage;
		}

		public void setHasNextPage(String hasNextPage) {
			this.hasNextPage = hasNextPage;
		}

		public String getNavigatePageNums() {
			return this.navigatePageNums;
		}

		public void setNavigatePageNums(String navigatePageNums) {
			this.navigatePageNums = navigatePageNums;
		}

		public String getNavigateFirstPage() {
			return this.navigateFirstPage;
		}

		public void setNavigateFirstPage(String navigateFirstPage) {
			this.navigateFirstPage = navigateFirstPage;
		}

		public String getNavigateLastPage() {
			return this.navigateLastPage;
		}

		public void setNavigateLastPage(String navigateLastPage) {
			this.navigateLastPage = navigateLastPage;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String taskId;

			private String taskName;

			private String url;

			private Long taskType;

			private String taskTypeName;

			private Long monitorNumber;

			private String taskStatus;

			private Float usable;

			private String createTime;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getTaskName() {
				return this.taskName;
			}

			public void setTaskName(String taskName) {
				this.taskName = taskName;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public Long getTaskType() {
				return this.taskType;
			}

			public void setTaskType(Long taskType) {
				this.taskType = taskType;
			}

			public String getTaskTypeName() {
				return this.taskTypeName;
			}

			public void setTaskTypeName(String taskTypeName) {
				this.taskTypeName = taskTypeName;
			}

			public Long getMonitorNumber() {
				return this.monitorNumber;
			}

			public void setMonitorNumber(Long monitorNumber) {
				this.monitorNumber = monitorNumber;
			}

			public String getTaskStatus() {
				return this.taskStatus;
			}

			public void setTaskStatus(String taskStatus) {
				this.taskStatus = taskStatus;
			}

			public Float getUsable() {
				return this.usable;
			}

			public void setUsable(Float usable) {
				this.usable = usable;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}
		}
	}

	@Override
	public GetSyntheticTaskListResponse getInstance(UnmarshallerContext context) {
		return	GetSyntheticTaskListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
