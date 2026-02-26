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
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeSoarRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSoarRecordsResponse extends AcsResponse {

	private String requestId;

	private List<Data> soarExecuteRecords;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getSoarExecuteRecords() {
		return this.soarExecuteRecords;
	}

	public void setSoarExecuteRecords(List<Data> soarExecuteRecords) {
		this.soarExecuteRecords = soarExecuteRecords;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Data {

		private String triggerType;

		private String taskName;

		private Long startTime;

		private Long endTime;

		private String status;

		private String requestUuid;

		private String triggerUser;

		private String errorMsg;

		private String rawEventReq;

		private String taskflowMd5;

		private List<Output> outputList;

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
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

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRequestUuid() {
			return this.requestUuid;
		}

		public void setRequestUuid(String requestUuid) {
			this.requestUuid = requestUuid;
		}

		public String getTriggerUser() {
			return this.triggerUser;
		}

		public void setTriggerUser(String triggerUser) {
			this.triggerUser = triggerUser;
		}

		public String getErrorMsg() {
			return this.errorMsg;
		}

		public void setErrorMsg(String errorMsg) {
			this.errorMsg = errorMsg;
		}

		public String getRawEventReq() {
			return this.rawEventReq;
		}

		public void setRawEventReq(String rawEventReq) {
			this.rawEventReq = rawEventReq;
		}

		public String getTaskflowMd5() {
			return this.taskflowMd5;
		}

		public void setTaskflowMd5(String taskflowMd5) {
			this.taskflowMd5 = taskflowMd5;
		}

		public List<Output> getOutputList() {
			return this.outputList;
		}

		public void setOutputList(List<Output> outputList) {
			this.outputList = outputList;
		}

		public static class Output {

			private String content;

			private String nodeName;

			private String actionUuid;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getActionUuid() {
				return this.actionUuid;
			}

			public void setActionUuid(String actionUuid) {
				this.actionUuid = actionUuid;
			}
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
	public DescribeSoarRecordsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSoarRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
