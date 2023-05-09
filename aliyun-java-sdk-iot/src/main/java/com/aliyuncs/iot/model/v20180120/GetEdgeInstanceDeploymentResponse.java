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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.GetEdgeInstanceDeploymentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEdgeInstanceDeploymentResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long gmtCreateTimestamp;

		private String type;

		private Integer status;

		private String deploymentId;

		private String description;

		private Long gmtModifiedTimestamp;

		private String gmtCompleted;

		private String gmtCreate;

		private Long gmtCompletedTimestamp;

		private String gmtModified;

		private List<Task> taskList;

		public Long getGmtCreateTimestamp() {
			return this.gmtCreateTimestamp;
		}

		public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
			this.gmtCreateTimestamp = gmtCreateTimestamp;
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

		public String getDeploymentId() {
			return this.deploymentId;
		}

		public void setDeploymentId(String deploymentId) {
			this.deploymentId = deploymentId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getGmtModifiedTimestamp() {
			return this.gmtModifiedTimestamp;
		}

		public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
			this.gmtModifiedTimestamp = gmtModifiedTimestamp;
		}

		public String getGmtCompleted() {
			return this.gmtCompleted;
		}

		public void setGmtCompleted(String gmtCompleted) {
			this.gmtCompleted = gmtCompleted;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtCompletedTimestamp() {
			return this.gmtCompletedTimestamp;
		}

		public void setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
			this.gmtCompletedTimestamp = gmtCompletedTimestamp;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<Task> getTaskList() {
			return this.taskList;
		}

		public void setTaskList(List<Task> taskList) {
			this.taskList = taskList;
		}

		public static class Task {

			private Long gmtCreateTimestamp;

			private Integer status;

			private Integer stage;

			private String gatewayId;

			private Long gmtModifiedTimestamp;

			private String gmtCompleted;

			private String gmtCreate;

			private Long gmtCompletedTimestamp;

			private String gmtModified;

			private String taskId;

			private List<ResourceSnapshot> resourceSnapshotList;

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getStage() {
				return this.stage;
			}

			public void setStage(Integer stage) {
				this.stage = stage;
			}

			public String getGatewayId() {
				return this.gatewayId;
			}

			public void setGatewayId(String gatewayId) {
				this.gatewayId = gatewayId;
			}

			public Long getGmtModifiedTimestamp() {
				return this.gmtModifiedTimestamp;
			}

			public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
				this.gmtModifiedTimestamp = gmtModifiedTimestamp;
			}

			public String getGmtCompleted() {
				return this.gmtCompleted;
			}

			public void setGmtCompleted(String gmtCompleted) {
				this.gmtCompleted = gmtCompleted;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtCompletedTimestamp() {
				return this.gmtCompletedTimestamp;
			}

			public void setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
				this.gmtCompletedTimestamp = gmtCompletedTimestamp;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public List<ResourceSnapshot> getResourceSnapshotList() {
				return this.resourceSnapshotList;
			}

			public void setResourceSnapshotList(List<ResourceSnapshot> resourceSnapshotList) {
				this.resourceSnapshotList = resourceSnapshotList;
			}

			public static class ResourceSnapshot {

				private Integer status;

				private Long gmtCreateTimestamp;

				private Integer stage;

				private Long gmtModifiedTimestamp;

				private String gmtModified;

				private String log;

				private Integer operateType;

				private String resourceType;

				private String snapshotId;

				private String gmtCompleted;

				private String gmtCreate;

				private Long gmtCompletedTimestamp;

				private String resourceId;

				private String resourceName;

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public Long getGmtCreateTimestamp() {
					return this.gmtCreateTimestamp;
				}

				public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
					this.gmtCreateTimestamp = gmtCreateTimestamp;
				}

				public Integer getStage() {
					return this.stage;
				}

				public void setStage(Integer stage) {
					this.stage = stage;
				}

				public Long getGmtModifiedTimestamp() {
					return this.gmtModifiedTimestamp;
				}

				public void setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
					this.gmtModifiedTimestamp = gmtModifiedTimestamp;
				}

				public String getGmtModified() {
					return this.gmtModified;
				}

				public void setGmtModified(String gmtModified) {
					this.gmtModified = gmtModified;
				}

				public String getLog() {
					return this.log;
				}

				public void setLog(String log) {
					this.log = log;
				}

				public Integer getOperateType() {
					return this.operateType;
				}

				public void setOperateType(Integer operateType) {
					this.operateType = operateType;
				}

				public String getResourceType() {
					return this.resourceType;
				}

				public void setResourceType(String resourceType) {
					this.resourceType = resourceType;
				}

				public String getSnapshotId() {
					return this.snapshotId;
				}

				public void setSnapshotId(String snapshotId) {
					this.snapshotId = snapshotId;
				}

				public String getGmtCompleted() {
					return this.gmtCompleted;
				}

				public void setGmtCompleted(String gmtCompleted) {
					this.gmtCompleted = gmtCompleted;
				}

				public String getGmtCreate() {
					return this.gmtCreate;
				}

				public void setGmtCreate(String gmtCreate) {
					this.gmtCreate = gmtCreate;
				}

				public Long getGmtCompletedTimestamp() {
					return this.gmtCompletedTimestamp;
				}

				public void setGmtCompletedTimestamp(Long gmtCompletedTimestamp) {
					this.gmtCompletedTimestamp = gmtCompletedTimestamp;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getResourceName() {
					return this.resourceName;
				}

				public void setResourceName(String resourceName) {
					this.resourceName = resourceName;
				}
			}
		}
	}

	@Override
	public GetEdgeInstanceDeploymentResponse getInstance(UnmarshallerContext context) {
		return	GetEdgeInstanceDeploymentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
