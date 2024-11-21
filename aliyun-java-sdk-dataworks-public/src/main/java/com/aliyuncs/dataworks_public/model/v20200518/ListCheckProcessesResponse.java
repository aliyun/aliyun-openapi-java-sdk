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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListCheckProcessesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCheckProcessesResponse extends AcsResponse {

	private String requestId;

	private PagingInfo pagingInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PagingInfo getPagingInfo() {
		return this.pagingInfo;
	}

	public void setPagingInfo(PagingInfo pagingInfo) {
		this.pagingInfo = pagingInfo;
	}

	public static class PagingInfo {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<CheckProcessesItem> checkProcesses;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<CheckProcessesItem> getCheckProcesses() {
			return this.checkProcesses;
		}

		public void setCheckProcesses(List<CheckProcessesItem> checkProcesses) {
			this.checkProcesses = checkProcesses;
		}

		public static class CheckProcessesItem {

			private Long projectId;

			private String status;

			private String eventCode;

			private String eventName;

			private String eventNameEn;

			private String processName;

			private String messageId;

			private String processId;

			private String operator;

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getEventCode() {
				return this.eventCode;
			}

			public void setEventCode(String eventCode) {
				this.eventCode = eventCode;
			}

			public String getEventName() {
				return this.eventName;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}

			public String getEventNameEn() {
				return this.eventNameEn;
			}

			public void setEventNameEn(String eventNameEn) {
				this.eventNameEn = eventNameEn;
			}

			public String getProcessName() {
				return this.processName;
			}

			public void setProcessName(String processName) {
				this.processName = processName;
			}

			public String getMessageId() {
				return this.messageId;
			}

			public void setMessageId(String messageId) {
				this.messageId = messageId;
			}

			public String getProcessId() {
				return this.processId;
			}

			public void setProcessId(String processId) {
				this.processId = processId;
			}

			public String getOperator() {
				return this.operator;
			}

			public void setOperator(String operator) {
				this.operator = operator;
			}
		}
	}

	@Override
	public ListCheckProcessesResponse getInstance(UnmarshallerContext context) {
		return	ListCheckProcessesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
