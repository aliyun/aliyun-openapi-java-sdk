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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListTicketsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTicketsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Long httpStatusCode;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long pageNumber;

		private Long pageSize;

		private List<ListItem> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String instanceId;

			private String ticketId;

			private String title;

			private String templateId;

			private String templateVersion;

			private String categoryId;

			private String categoryName;

			private Long startTime;

			private Long endTime;

			private String state;

			private String closeCode;

			private String assignee;

			private String comment;

			private String assigneeName;

			private String creator;

			private String creatorName;

			private String context;

			private String createdTime;

			private String updatedTime;

			private String currentTaskId;

			private String currentTaskName;

			private Long currentTaskStartTime;

			private String customerId;

			private String jobId;

			private String source;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTicketId() {
				return this.ticketId;
			}

			public void setTicketId(String ticketId) {
				this.ticketId = ticketId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}

			public String getTemplateVersion() {
				return this.templateVersion;
			}

			public void setTemplateVersion(String templateVersion) {
				this.templateVersion = templateVersion;
			}

			public String getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(String categoryId) {
				this.categoryId = categoryId;
			}

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getCloseCode() {
				return this.closeCode;
			}

			public void setCloseCode(String closeCode) {
				this.closeCode = closeCode;
			}

			public String getAssignee() {
				return this.assignee;
			}

			public void setAssignee(String assignee) {
				this.assignee = assignee;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getAssigneeName() {
				return this.assigneeName;
			}

			public void setAssigneeName(String assigneeName) {
				this.assigneeName = assigneeName;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreatorName() {
				return this.creatorName;
			}

			public void setCreatorName(String creatorName) {
				this.creatorName = creatorName;
			}

			public String getContext() {
				return this.context;
			}

			public void setContext(String context) {
				this.context = context;
			}

			public String getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(String createdTime) {
				this.createdTime = createdTime;
			}

			public String getUpdatedTime() {
				return this.updatedTime;
			}

			public void setUpdatedTime(String updatedTime) {
				this.updatedTime = updatedTime;
			}

			public String getCurrentTaskId() {
				return this.currentTaskId;
			}

			public void setCurrentTaskId(String currentTaskId) {
				this.currentTaskId = currentTaskId;
			}

			public String getCurrentTaskName() {
				return this.currentTaskName;
			}

			public void setCurrentTaskName(String currentTaskName) {
				this.currentTaskName = currentTaskName;
			}

			public Long getCurrentTaskStartTime() {
				return this.currentTaskStartTime;
			}

			public void setCurrentTaskStartTime(Long currentTaskStartTime) {
				this.currentTaskStartTime = currentTaskStartTime;
			}

			public String getCustomerId() {
				return this.customerId;
			}

			public void setCustomerId(String customerId) {
				this.customerId = customerId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}
		}
	}

	@Override
	public ListTicketsResponse getInstance(UnmarshallerContext context) {
		return	ListTicketsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
