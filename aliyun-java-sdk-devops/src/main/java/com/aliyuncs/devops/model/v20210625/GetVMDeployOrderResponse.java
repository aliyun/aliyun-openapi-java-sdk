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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.GetVMDeployOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVMDeployOrderResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private DeployOrder deployOrder;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public DeployOrder getDeployOrder() {
		return this.deployOrder;
	}

	public void setDeployOrder(DeployOrder deployOrder) {
		this.deployOrder = deployOrder;
	}

	public static class DeployOrder {

		private String deployOrderId;

		private Long createTime;

		private Long updateTime;

		private String creator;

		private Integer currentBatch;

		private Integer totalBatch;

		private String status;

		private String exceptionCode;

		private List<Action> actions;

		private DeployMachineInfo deployMachineInfo;

		public String getDeployOrderId() {
			return this.deployOrderId;
		}

		public void setDeployOrderId(String deployOrderId) {
			this.deployOrderId = deployOrderId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public Integer getCurrentBatch() {
			return this.currentBatch;
		}

		public void setCurrentBatch(Integer currentBatch) {
			this.currentBatch = currentBatch;
		}

		public Integer getTotalBatch() {
			return this.totalBatch;
		}

		public void setTotalBatch(Integer totalBatch) {
			this.totalBatch = totalBatch;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getExceptionCode() {
			return this.exceptionCode;
		}

		public void setExceptionCode(String exceptionCode) {
			this.exceptionCode = exceptionCode;
		}

		public List<Action> getActions() {
			return this.actions;
		}

		public void setActions(List<Action> actions) {
			this.actions = actions;
		}

		public DeployMachineInfo getDeployMachineInfo() {
			return this.deployMachineInfo;
		}

		public void setDeployMachineInfo(DeployMachineInfo deployMachineInfo) {
			this.deployMachineInfo = deployMachineInfo;
		}

		public static class Action {

			private String type;

			private Boolean disable;

			private Object params;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Boolean getDisable() {
				return this.disable;
			}

			public void setDisable(Boolean disable) {
				this.disable = disable;
			}

			public Object getParams() {
				return this.params;
			}

			public void setParams(Object params) {
				this.params = params;
			}
		}

		public static class DeployMachineInfo {

			private Long hostGroupId;

			private Integer batchNum;

			private List<DeployMachine> deployMachines;

			public Long getHostGroupId() {
				return this.hostGroupId;
			}

			public void setHostGroupId(Long hostGroupId) {
				this.hostGroupId = hostGroupId;
			}

			public Integer getBatchNum() {
				return this.batchNum;
			}

			public void setBatchNum(Integer batchNum) {
				this.batchNum = batchNum;
			}

			public List<DeployMachine> getDeployMachines() {
				return this.deployMachines;
			}

			public void setDeployMachines(List<DeployMachine> deployMachines) {
				this.deployMachines = deployMachines;
			}

			public static class DeployMachine {

				private Long createTime;

				private Long updateTime;

				private String status;

				private String machineSn;

				private String clientStatus;

				private String ip;

				private Integer batchNum;

				private List<Action2> actions1;

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public Long getUpdateTime() {
					return this.updateTime;
				}

				public void setUpdateTime(Long updateTime) {
					this.updateTime = updateTime;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public String getMachineSn() {
					return this.machineSn;
				}

				public void setMachineSn(String machineSn) {
					this.machineSn = machineSn;
				}

				public String getClientStatus() {
					return this.clientStatus;
				}

				public void setClientStatus(String clientStatus) {
					this.clientStatus = clientStatus;
				}

				public String getIp() {
					return this.ip;
				}

				public void setIp(String ip) {
					this.ip = ip;
				}

				public Integer getBatchNum() {
					return this.batchNum;
				}

				public void setBatchNum(Integer batchNum) {
					this.batchNum = batchNum;
				}

				public List<Action2> getActions1() {
					return this.actions1;
				}

				public void setActions1(List<Action2> actions1) {
					this.actions1 = actions1;
				}

				public static class Action2 {

					private String type;

					private Boolean disable;

					private Object params;

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Boolean getDisable() {
						return this.disable;
					}

					public void setDisable(Boolean disable) {
						this.disable = disable;
					}

					public Object getParams() {
						return this.params;
					}

					public void setParams(Object params) {
						this.params = params;
					}
				}
			}
		}
	}

	@Override
	public GetVMDeployOrderResponse getInstance(UnmarshallerContext context) {
		return	GetVMDeployOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
