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
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeSoarTaskAndActionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSoarTaskAndActionsResponse extends AcsResponse {

	private String requestId;

	private Details details;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Details getDetails() {
		return this.details;
	}

	public void setDetails(Details details) {
		this.details = details;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Details {

		private String triggerType;

		private String taskName;

		private Long startTime;

		private Long endTime;

		private String status;

		private String requestUuid;

		private String taskUuid;

		private String triggerUser;

		private String errorMsg;

		private String rawEventReq;

		private String taskFlowMd5;

		private Integer actionLogNum;

		private List<Action> actions;

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

		public String getTaskUuid() {
			return this.taskUuid;
		}

		public void setTaskUuid(String taskUuid) {
			this.taskUuid = taskUuid;
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

		public String getTaskFlowMd5() {
			return this.taskFlowMd5;
		}

		public void setTaskFlowMd5(String taskFlowMd5) {
			this.taskFlowMd5 = taskFlowMd5;
		}

		public Integer getActionLogNum() {
			return this.actionLogNum;
		}

		public void setActionLogNum(Integer actionLogNum) {
			this.actionLogNum = actionLogNum;
		}

		public List<Action> getActions() {
			return this.actions;
		}

		public void setActions(List<Action> actions) {
			this.actions = actions;
		}

		public static class Action {

			private String component;

			private String action;

			private Long startTime;

			private Long endTime;

			private String status;

			private String actionUuid;

			private String assetName;

			private String nodeName;

			private String nodeId;

			private String nodeType;

			public String getComponent() {
				return this.component;
			}

			public void setComponent(String component) {
				this.component = component;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
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

			public String getActionUuid() {
				return this.actionUuid;
			}

			public void setActionUuid(String actionUuid) {
				this.actionUuid = actionUuid;
			}

			public String getAssetName() {
				return this.assetName;
			}

			public void setAssetName(String assetName) {
				this.assetName = assetName;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}
		}
	}

	public static class Page {

		private String totalCount;

		private String pageNumber;

		private String pageSize;

		public String getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(String totalCount) {
			this.totalCount = totalCount;
		}

		public String getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(String pageNumber) {
			this.pageNumber = pageNumber;
		}

		public String getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(String pageSize) {
			this.pageSize = pageSize;
		}
	}

	@Override
	public DescribeSoarTaskAndActionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSoarTaskAndActionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
