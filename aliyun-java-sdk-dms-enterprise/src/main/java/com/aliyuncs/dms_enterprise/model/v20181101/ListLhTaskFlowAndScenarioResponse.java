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
import com.aliyuncs.dms_enterprise.transform.v20181101.ListLhTaskFlowAndScenarioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLhTaskFlowAndScenarioResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<Dag> rawDAGList;

	private List<ScenarioDAG> scenarioDAGList;

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

	public List<Dag> getRawDAGList() {
		return this.rawDAGList;
	}

	public void setRawDAGList(List<Dag> rawDAGList) {
		this.rawDAGList = rawDAGList;
	}

	public List<ScenarioDAG> getScenarioDAGList() {
		return this.scenarioDAGList;
	}

	public void setScenarioDAGList(List<ScenarioDAG> scenarioDAGList) {
		this.scenarioDAGList = scenarioDAGList;
	}

	public static class Dag {

		private Long id;

		private String creatorId;

		private Boolean isDeleted;

		private String demoId;

		private Long deployId;

		private Long dataFlowId;

		private Long scenarioId;

		private Long spaceId;

		private String creatorNickName;

		private String dagOwnerNickName;

		private Boolean canEdit;

		private Integer status;

		private Integer latestInstanceStatus;

		private Integer latestInstanceTime;

		private String dagName;

		private String dagOwnerId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public Boolean getIsDeleted() {
			return this.isDeleted;
		}

		public void setIsDeleted(Boolean isDeleted) {
			this.isDeleted = isDeleted;
		}

		public String getDemoId() {
			return this.demoId;
		}

		public void setDemoId(String demoId) {
			this.demoId = demoId;
		}

		public Long getDeployId() {
			return this.deployId;
		}

		public void setDeployId(Long deployId) {
			this.deployId = deployId;
		}

		public Long getDataFlowId() {
			return this.dataFlowId;
		}

		public void setDataFlowId(Long dataFlowId) {
			this.dataFlowId = dataFlowId;
		}

		public Long getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(Long scenarioId) {
			this.scenarioId = scenarioId;
		}

		public Long getSpaceId() {
			return this.spaceId;
		}

		public void setSpaceId(Long spaceId) {
			this.spaceId = spaceId;
		}

		public String getCreatorNickName() {
			return this.creatorNickName;
		}

		public void setCreatorNickName(String creatorNickName) {
			this.creatorNickName = creatorNickName;
		}

		public String getDagOwnerNickName() {
			return this.dagOwnerNickName;
		}

		public void setDagOwnerNickName(String dagOwnerNickName) {
			this.dagOwnerNickName = dagOwnerNickName;
		}

		public Boolean getCanEdit() {
			return this.canEdit;
		}

		public void setCanEdit(Boolean canEdit) {
			this.canEdit = canEdit;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getLatestInstanceStatus() {
			return this.latestInstanceStatus;
		}

		public void setLatestInstanceStatus(Integer latestInstanceStatus) {
			this.latestInstanceStatus = latestInstanceStatus;
		}

		public Integer getLatestInstanceTime() {
			return this.latestInstanceTime;
		}

		public void setLatestInstanceTime(Integer latestInstanceTime) {
			this.latestInstanceTime = latestInstanceTime;
		}

		public String getDagName() {
			return this.dagName;
		}

		public void setDagName(String dagName) {
			this.dagName = dagName;
		}

		public String getDagOwnerId() {
			return this.dagOwnerId;
		}

		public void setDagOwnerId(String dagOwnerId) {
			this.dagOwnerId = dagOwnerId;
		}
	}

	public static class ScenarioDAG {

		private List<Dag1> dagList;

		private Scenario scenario;

		public List<Dag1> getDagList() {
			return this.dagList;
		}

		public void setDagList(List<Dag1> dagList) {
			this.dagList = dagList;
		}

		public Scenario getScenario() {
			return this.scenario;
		}

		public void setScenario(Scenario scenario) {
			this.scenario = scenario;
		}

		public static class Dag1 {

			private Long id;

			private String creatorId;

			private Boolean isDeleted;

			private String demoId;

			private Long deployId;

			private Long dataFlowId;

			private Long scenarioId;

			private Long spaceId;

			private String creatorNickName;

			private String dagOwnerNickName;

			private Boolean canEdit;

			private Integer status;

			private Integer latestInstanceStatus;

			private Integer latestInstanceTime;

			private String dagName;

			private String dagOwnerId;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public Boolean getIsDeleted() {
				return this.isDeleted;
			}

			public void setIsDeleted(Boolean isDeleted) {
				this.isDeleted = isDeleted;
			}

			public String getDemoId() {
				return this.demoId;
			}

			public void setDemoId(String demoId) {
				this.demoId = demoId;
			}

			public Long getDeployId() {
				return this.deployId;
			}

			public void setDeployId(Long deployId) {
				this.deployId = deployId;
			}

			public Long getDataFlowId() {
				return this.dataFlowId;
			}

			public void setDataFlowId(Long dataFlowId) {
				this.dataFlowId = dataFlowId;
			}

			public Long getScenarioId() {
				return this.scenarioId;
			}

			public void setScenarioId(Long scenarioId) {
				this.scenarioId = scenarioId;
			}

			public Long getSpaceId() {
				return this.spaceId;
			}

			public void setSpaceId(Long spaceId) {
				this.spaceId = spaceId;
			}

			public String getCreatorNickName() {
				return this.creatorNickName;
			}

			public void setCreatorNickName(String creatorNickName) {
				this.creatorNickName = creatorNickName;
			}

			public String getDagOwnerNickName() {
				return this.dagOwnerNickName;
			}

			public void setDagOwnerNickName(String dagOwnerNickName) {
				this.dagOwnerNickName = dagOwnerNickName;
			}

			public Boolean getCanEdit() {
				return this.canEdit;
			}

			public void setCanEdit(Boolean canEdit) {
				this.canEdit = canEdit;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getLatestInstanceStatus() {
				return this.latestInstanceStatus;
			}

			public void setLatestInstanceStatus(Integer latestInstanceStatus) {
				this.latestInstanceStatus = latestInstanceStatus;
			}

			public Integer getLatestInstanceTime() {
				return this.latestInstanceTime;
			}

			public void setLatestInstanceTime(Integer latestInstanceTime) {
				this.latestInstanceTime = latestInstanceTime;
			}

			public String getDagName() {
				return this.dagName;
			}

			public void setDagName(String dagName) {
				this.dagName = dagName;
			}

			public String getDagOwnerId() {
				return this.dagOwnerId;
			}

			public void setDagOwnerId(String dagOwnerId) {
				this.dagOwnerId = dagOwnerId;
			}
		}

		public static class Scenario {

			private String scenarioName;

			private String creatorId;

			private String description;

			public String getScenarioName() {
				return this.scenarioName;
			}

			public void setScenarioName(String scenarioName) {
				this.scenarioName = scenarioName;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public ListLhTaskFlowAndScenarioResponse getInstance(UnmarshallerContext context) {
		return	ListLhTaskFlowAndScenarioResponseUnmarshaller.unmarshall(this, context);
	}
}
