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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListDDLPublishRecordsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDDLPublishRecordsResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<DDLPublishRecord> dDLPublishRecordList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DDLPublishRecord> getDDLPublishRecordList() {
		return this.dDLPublishRecordList;
	}

	public void setDDLPublishRecordList(List<DDLPublishRecord> dDLPublishRecordList) {
		this.dDLPublishRecordList = dDLPublishRecordList;
	}

	public static class DDLPublishRecord {

		private String statusDesc;

		private String auditStatus;

		private Long creatorId;

		private Boolean finality;

		private String auditExpireTime;

		private Long workflowInstanceId;

		private String riskLevel;

		private String finalityReason;

		private String publishStatus;

		private List<PublishTaskInfo> publishTaskInfoList;

		public String getStatusDesc() {
			return this.statusDesc;
		}

		public void setStatusDesc(String statusDesc) {
			this.statusDesc = statusDesc;
		}

		public String getAuditStatus() {
			return this.auditStatus;
		}

		public void setAuditStatus(String auditStatus) {
			this.auditStatus = auditStatus;
		}

		public Long getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(Long creatorId) {
			this.creatorId = creatorId;
		}

		public Boolean getFinality() {
			return this.finality;
		}

		public void setFinality(Boolean finality) {
			this.finality = finality;
		}

		public String getAuditExpireTime() {
			return this.auditExpireTime;
		}

		public void setAuditExpireTime(String auditExpireTime) {
			this.auditExpireTime = auditExpireTime;
		}

		public Long getWorkflowInstanceId() {
			return this.workflowInstanceId;
		}

		public void setWorkflowInstanceId(Long workflowInstanceId) {
			this.workflowInstanceId = workflowInstanceId;
		}

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public String getFinalityReason() {
			return this.finalityReason;
		}

		public void setFinalityReason(String finalityReason) {
			this.finalityReason = finalityReason;
		}

		public String getPublishStatus() {
			return this.publishStatus;
		}

		public void setPublishStatus(String publishStatus) {
			this.publishStatus = publishStatus;
		}

		public List<PublishTaskInfo> getPublishTaskInfoList() {
			return this.publishTaskInfoList;
		}

		public void setPublishTaskInfoList(List<PublishTaskInfo> publishTaskInfoList) {
			this.publishTaskInfoList = publishTaskInfoList;
		}

		public static class PublishTaskInfo {

			private String statusDesc;

			private String taskJobStatus;

			private String publishStrategy;

			private Long dbId;

			private String planTime;

			private Boolean logic;

			private List<PublishJob> publishJobList;

			public String getStatusDesc() {
				return this.statusDesc;
			}

			public void setStatusDesc(String statusDesc) {
				this.statusDesc = statusDesc;
			}

			public String getTaskJobStatus() {
				return this.taskJobStatus;
			}

			public void setTaskJobStatus(String taskJobStatus) {
				this.taskJobStatus = taskJobStatus;
			}

			public String getPublishStrategy() {
				return this.publishStrategy;
			}

			public void setPublishStrategy(String publishStrategy) {
				this.publishStrategy = publishStrategy;
			}

			public Long getDbId() {
				return this.dbId;
			}

			public void setDbId(Long dbId) {
				this.dbId = dbId;
			}

			public String getPlanTime() {
				return this.planTime;
			}

			public void setPlanTime(String planTime) {
				this.planTime = planTime;
			}

			public Boolean getLogic() {
				return this.logic;
			}

			public void setLogic(Boolean logic) {
				this.logic = logic;
			}

			public List<PublishJob> getPublishJobList() {
				return this.publishJobList;
			}

			public void setPublishJobList(List<PublishJob> publishJobList) {
				this.publishJobList = publishJobList;
			}

			public static class PublishJob {

				private String statusDesc;

				private String tableName;

				private String scripts;

				private String taskJobStatus;

				private Long executeCount;

				private Long dBTaskGroupId;

				public String getStatusDesc() {
					return this.statusDesc;
				}

				public void setStatusDesc(String statusDesc) {
					this.statusDesc = statusDesc;
				}

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getScripts() {
					return this.scripts;
				}

				public void setScripts(String scripts) {
					this.scripts = scripts;
				}

				public String getTaskJobStatus() {
					return this.taskJobStatus;
				}

				public void setTaskJobStatus(String taskJobStatus) {
					this.taskJobStatus = taskJobStatus;
				}

				public Long getExecuteCount() {
					return this.executeCount;
				}

				public void setExecuteCount(Long executeCount) {
					this.executeCount = executeCount;
				}

				public Long getDBTaskGroupId() {
					return this.dBTaskGroupId;
				}

				public void setDBTaskGroupId(Long dBTaskGroupId) {
					this.dBTaskGroupId = dBTaskGroupId;
				}
			}
		}
	}

	@Override
	public ListDDLPublishRecordsResponse getInstance(UnmarshallerContext context) {
		return	ListDDLPublishRecordsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
