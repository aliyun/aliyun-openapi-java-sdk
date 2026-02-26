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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private String errorCode;

	private Task task;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Task getTask() {
		return this.task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public static class Task {

		private String gmtCreateTime;

		private String gmtModifiedTime;

		private String taskName;

		private String taskId;

		private String templateId;

		private String taskType;

		private String tenantId;

		private String remark;

		private String labelStyle;

		private Boolean archived;

		private String stage;

		private String archivedInfos;

		private String status;

		private String refTaskId;

		private String uUID;

		private Map<Object,Object> exif;

		private Map<Object,Object> assignConfig;

		private String tenantName;

		private Boolean allowAppendData;

		private Map<Object,Object> relateTaskConfig;

		private Map<Object,Object> periodConfig;

		private Map<Object,Object> mineConfigs;

		private Map<Object,Object> voteConfigs;

		private Map<Object,Object> noticeConfig;

		private Map<Object,Object> resultCallbackConfig;

		private String runMsg;

		private Long alertTime;

		private List<TaskWorkflowItem> taskWorkflow;

		private List<AdminsItem> admins;

		private List<DatasetProxyRelationsItem> datasetProxyRelations;

		private List<String> workflowNodes;

		private List<String> tags;

		private Creator creator;

		private Modifier modifier;

		private TaskTemplateConfig taskTemplateConfig;

		public String getGmtCreateTime() {
			return this.gmtCreateTime;
		}

		public void setGmtCreateTime(String gmtCreateTime) {
			this.gmtCreateTime = gmtCreateTime;
		}

		public String getGmtModifiedTime() {
			return this.gmtModifiedTime;
		}

		public void setGmtModifiedTime(String gmtModifiedTime) {
			this.gmtModifiedTime = gmtModifiedTime;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(String tenantId) {
			this.tenantId = tenantId;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getLabelStyle() {
			return this.labelStyle;
		}

		public void setLabelStyle(String labelStyle) {
			this.labelStyle = labelStyle;
		}

		public Boolean getArchived() {
			return this.archived;
		}

		public void setArchived(Boolean archived) {
			this.archived = archived;
		}

		public String getStage() {
			return this.stage;
		}

		public void setStage(String stage) {
			this.stage = stage;
		}

		public String getArchivedInfos() {
			return this.archivedInfos;
		}

		public void setArchivedInfos(String archivedInfos) {
			this.archivedInfos = archivedInfos;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRefTaskId() {
			return this.refTaskId;
		}

		public void setRefTaskId(String refTaskId) {
			this.refTaskId = refTaskId;
		}

		public String getUUID() {
			return this.uUID;
		}

		public void setUUID(String uUID) {
			this.uUID = uUID;
		}

		public Map<Object,Object> getExif() {
			return this.exif;
		}

		public void setExif(Map<Object,Object> exif) {
			this.exif = exif;
		}

		public Map<Object,Object> getAssignConfig() {
			return this.assignConfig;
		}

		public void setAssignConfig(Map<Object,Object> assignConfig) {
			this.assignConfig = assignConfig;
		}

		public String getTenantName() {
			return this.tenantName;
		}

		public void setTenantName(String tenantName) {
			this.tenantName = tenantName;
		}

		public Boolean getAllowAppendData() {
			return this.allowAppendData;
		}

		public void setAllowAppendData(Boolean allowAppendData) {
			this.allowAppendData = allowAppendData;
		}

		public Map<Object,Object> getRelateTaskConfig() {
			return this.relateTaskConfig;
		}

		public void setRelateTaskConfig(Map<Object,Object> relateTaskConfig) {
			this.relateTaskConfig = relateTaskConfig;
		}

		public Map<Object,Object> getPeriodConfig() {
			return this.periodConfig;
		}

		public void setPeriodConfig(Map<Object,Object> periodConfig) {
			this.periodConfig = periodConfig;
		}

		public Map<Object,Object> getMineConfigs() {
			return this.mineConfigs;
		}

		public void setMineConfigs(Map<Object,Object> mineConfigs) {
			this.mineConfigs = mineConfigs;
		}

		public Map<Object,Object> getVoteConfigs() {
			return this.voteConfigs;
		}

		public void setVoteConfigs(Map<Object,Object> voteConfigs) {
			this.voteConfigs = voteConfigs;
		}

		public Map<Object,Object> getNoticeConfig() {
			return this.noticeConfig;
		}

		public void setNoticeConfig(Map<Object,Object> noticeConfig) {
			this.noticeConfig = noticeConfig;
		}

		public Map<Object,Object> getResultCallbackConfig() {
			return this.resultCallbackConfig;
		}

		public void setResultCallbackConfig(Map<Object,Object> resultCallbackConfig) {
			this.resultCallbackConfig = resultCallbackConfig;
		}

		public String getRunMsg() {
			return this.runMsg;
		}

		public void setRunMsg(String runMsg) {
			this.runMsg = runMsg;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
		}

		public List<TaskWorkflowItem> getTaskWorkflow() {
			return this.taskWorkflow;
		}

		public void setTaskWorkflow(List<TaskWorkflowItem> taskWorkflow) {
			this.taskWorkflow = taskWorkflow;
		}

		public List<AdminsItem> getAdmins() {
			return this.admins;
		}

		public void setAdmins(List<AdminsItem> admins) {
			this.admins = admins;
		}

		public List<DatasetProxyRelationsItem> getDatasetProxyRelations() {
			return this.datasetProxyRelations;
		}

		public void setDatasetProxyRelations(List<DatasetProxyRelationsItem> datasetProxyRelations) {
			this.datasetProxyRelations = datasetProxyRelations;
		}

		public List<String> getWorkflowNodes() {
			return this.workflowNodes;
		}

		public void setWorkflowNodes(List<String> workflowNodes) {
			this.workflowNodes = workflowNodes;
		}

		public List<String> getTags() {
			return this.tags;
		}

		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public Modifier getModifier() {
			return this.modifier;
		}

		public void setModifier(Modifier modifier) {
			this.modifier = modifier;
		}

		public TaskTemplateConfig getTaskTemplateConfig() {
			return this.taskTemplateConfig;
		}

		public void setTaskTemplateConfig(TaskTemplateConfig taskTemplateConfig) {
			this.taskTemplateConfig = taskTemplateConfig;
		}

		public static class TaskWorkflowItem {

			private String nodeName;

			private Map<Object,Object> exif;

			private List<UsersItem> users;

			private List<String> groups;

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Map<Object,Object> getExif() {
				return this.exif;
			}

			public void setExif(Map<Object,Object> exif) {
				this.exif = exif;
			}

			public List<UsersItem> getUsers() {
				return this.users;
			}

			public void setUsers(List<UsersItem> users) {
				this.users = users;
			}

			public List<String> getGroups() {
				return this.groups;
			}

			public void setGroups(List<String> groups) {
				this.groups = groups;
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

		public static class AdminsItem {

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

		public static class DatasetProxyRelationsItem {

			private String datasetId;

			private String source;

			private String sourceBizId;

			private String datasetType;

			private Map<Object,Object> exif;

			private String sourceDatasetId;

			public String getDatasetId() {
				return this.datasetId;
			}

			public void setDatasetId(String datasetId) {
				this.datasetId = datasetId;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}

			public String getSourceBizId() {
				return this.sourceBizId;
			}

			public void setSourceBizId(String sourceBizId) {
				this.sourceBizId = sourceBizId;
			}

			public String getDatasetType() {
				return this.datasetType;
			}

			public void setDatasetType(String datasetType) {
				this.datasetType = datasetType;
			}

			public Map<Object,Object> getExif() {
				return this.exif;
			}

			public void setExif(Map<Object,Object> exif) {
				this.exif = exif;
			}

			public String getSourceDatasetId() {
				return this.sourceDatasetId;
			}

			public void setSourceDatasetId(String sourceDatasetId) {
				this.sourceDatasetId = sourceDatasetId;
			}
		}

		public static class Creator {

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

		public static class Modifier {

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

		public static class TaskTemplateConfig {

			private Map<Object,Object> exif;

			private Map<Object,Object> templateOptionMap;

			private Map<Object,Object> robotConfig;

			private String templateRelationId;

			private String resourceKey;

			private List<String> selectQuestions;

			public Map<Object,Object> getExif() {
				return this.exif;
			}

			public void setExif(Map<Object,Object> exif) {
				this.exif = exif;
			}

			public Map<Object,Object> getTemplateOptionMap() {
				return this.templateOptionMap;
			}

			public void setTemplateOptionMap(Map<Object,Object> templateOptionMap) {
				this.templateOptionMap = templateOptionMap;
			}

			public Map<Object,Object> getRobotConfig() {
				return this.robotConfig;
			}

			public void setRobotConfig(Map<Object,Object> robotConfig) {
				this.robotConfig = robotConfig;
			}

			public String getTemplateRelationId() {
				return this.templateRelationId;
			}

			public void setTemplateRelationId(String templateRelationId) {
				this.templateRelationId = templateRelationId;
			}

			public String getResourceKey() {
				return this.resourceKey;
			}

			public void setResourceKey(String resourceKey) {
				this.resourceKey = resourceKey;
			}

			public List<String> getSelectQuestions() {
				return this.selectQuestions;
			}

			public void setSelectQuestions(List<String> selectQuestions) {
				this.selectQuestions = selectQuestions;
			}
		}
	}

	@Override
	public GetTaskResponse getInstance(UnmarshallerContext context) {
		return	GetTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
