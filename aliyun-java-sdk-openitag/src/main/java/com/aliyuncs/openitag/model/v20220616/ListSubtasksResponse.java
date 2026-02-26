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

package com.aliyuncs.openitag.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.ListSubtasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSubtasksResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalPage;

	private Integer totalCount;

	private String errorCode;

	private List<SubtasksItem> subtasks;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<SubtasksItem> getSubtasks() {
		return this.subtasks;
	}

	public void setSubtasks(List<SubtasksItem> subtasks) {
		this.subtasks = subtasks;
	}

	public static class SubtasksItem {

		private String subtaskId;

		private String status;

		private String taskId;

		private String currentWorkNode;

		private String workNodeState;

		private Boolean canReassign;

		private Boolean canRelease;

		private Boolean canDiscard;

		private Long weight;

		private String extConfigs;

		private List<ItemsItem> items;

		private List<WorkforceItem> workforce;

		public String getSubtaskId() {
			return this.subtaskId;
		}

		public void setSubtaskId(String subtaskId) {
			this.subtaskId = subtaskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getCurrentWorkNode() {
			return this.currentWorkNode;
		}

		public void setCurrentWorkNode(String currentWorkNode) {
			this.currentWorkNode = currentWorkNode;
		}

		public String getWorkNodeState() {
			return this.workNodeState;
		}

		public void setWorkNodeState(String workNodeState) {
			this.workNodeState = workNodeState;
		}

		public Boolean getCanReassign() {
			return this.canReassign;
		}

		public void setCanReassign(Boolean canReassign) {
			this.canReassign = canReassign;
		}

		public Boolean getCanRelease() {
			return this.canRelease;
		}

		public void setCanRelease(Boolean canRelease) {
			this.canRelease = canRelease;
		}

		public Boolean getCanDiscard() {
			return this.canDiscard;
		}

		public void setCanDiscard(Boolean canDiscard) {
			this.canDiscard = canDiscard;
		}

		public Long getWeight() {
			return this.weight;
		}

		public void setWeight(Long weight) {
			this.weight = weight;
		}

		public String getExtConfigs() {
			return this.extConfigs;
		}

		public void setExtConfigs(String extConfigs) {
			this.extConfigs = extConfigs;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public List<WorkforceItem> getWorkforce() {
			return this.workforce;
		}

		public void setWorkforce(List<WorkforceItem> workforce) {
			this.workforce = workforce;
		}

		public static class ItemsItem {

			private String feedbackRemark;

			private Boolean feedbackFlag;

			private String dataId;

			private String state;

			private Long mine;

			private Boolean rejectFlag;

			private Boolean fixedFlag;

			private Boolean abandonFlag;

			private String abandonRemark;

			private Long weight;

			public String getFeedbackRemark() {
				return this.feedbackRemark;
			}

			public void setFeedbackRemark(String feedbackRemark) {
				this.feedbackRemark = feedbackRemark;
			}

			public Boolean getFeedbackFlag() {
				return this.feedbackFlag;
			}

			public void setFeedbackFlag(Boolean feedbackFlag) {
				this.feedbackFlag = feedbackFlag;
			}

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public Long getMine() {
				return this.mine;
			}

			public void setMine(Long mine) {
				this.mine = mine;
			}

			public Boolean getRejectFlag() {
				return this.rejectFlag;
			}

			public void setRejectFlag(Boolean rejectFlag) {
				this.rejectFlag = rejectFlag;
			}

			public Boolean getFixedFlag() {
				return this.fixedFlag;
			}

			public void setFixedFlag(Boolean fixedFlag) {
				this.fixedFlag = fixedFlag;
			}

			public Boolean getAbandonFlag() {
				return this.abandonFlag;
			}

			public void setAbandonFlag(Boolean abandonFlag) {
				this.abandonFlag = abandonFlag;
			}

			public String getAbandonRemark() {
				return this.abandonRemark;
			}

			public void setAbandonRemark(String abandonRemark) {
				this.abandonRemark = abandonRemark;
			}

			public Long getWeight() {
				return this.weight;
			}

			public void setWeight(Long weight) {
				this.weight = weight;
			}
		}

		public static class WorkforceItem {

			private String nodeType;

			private Integer workNodeId;

			private List<UsersItem> users;

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public Integer getWorkNodeId() {
				return this.workNodeId;
			}

			public void setWorkNodeId(Integer workNodeId) {
				this.workNodeId = workNodeId;
			}

			public List<UsersItem> getUsers() {
				return this.users;
			}

			public void setUsers(List<UsersItem> users) {
				this.users = users;
			}

			public static class UsersItem {

				private Long userId;

				private String accountType;

				private String accountNo;

				private String userName;

				private String role;

				public Long getUserId() {
					return this.userId;
				}

				public void setUserId(Long userId) {
					this.userId = userId;
				}

				public String getAccountType() {
					return this.accountType;
				}

				public void setAccountType(String accountType) {
					this.accountType = accountType;
				}

				public String getAccountNo() {
					return this.accountNo;
				}

				public void setAccountNo(String accountNo) {
					this.accountNo = accountNo;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}
			}
		}
	}

	@Override
	public ListSubtasksResponse getInstance(UnmarshallerContext context) {
		return	ListSubtasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
