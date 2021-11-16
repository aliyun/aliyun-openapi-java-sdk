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
import com.aliyuncs.dataworks_public.transform.v20200518.GetRemindResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRemindResponse extends AcsResponse {

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long remindId;

		private String remindName;

		private String dndStart;

		private String dndEnd;

		private String remindUnit;

		private String remindType;

		private String alertUnit;

		private Boolean useflag;

		private String founder;

		private Integer alertInterval;

		private String detail;

		private Integer maxAlertTimes;

		private List<RobotsItem> robots;

		private List<NodesItem> nodes;

		private List<BaselinesItem> baselines;

		private List<ProjectsItem> projects;

		private List<BizProcessesItem> bizProcesses;

		private List<String> alertMethods;

		private List<String> alertTargets;

		public Long getRemindId() {
			return this.remindId;
		}

		public void setRemindId(Long remindId) {
			this.remindId = remindId;
		}

		public String getRemindName() {
			return this.remindName;
		}

		public void setRemindName(String remindName) {
			this.remindName = remindName;
		}

		public String getDndStart() {
			return this.dndStart;
		}

		public void setDndStart(String dndStart) {
			this.dndStart = dndStart;
		}

		public String getDndEnd() {
			return this.dndEnd;
		}

		public void setDndEnd(String dndEnd) {
			this.dndEnd = dndEnd;
		}

		public String getRemindUnit() {
			return this.remindUnit;
		}

		public void setRemindUnit(String remindUnit) {
			this.remindUnit = remindUnit;
		}

		public String getRemindType() {
			return this.remindType;
		}

		public void setRemindType(String remindType) {
			this.remindType = remindType;
		}

		public String getAlertUnit() {
			return this.alertUnit;
		}

		public void setAlertUnit(String alertUnit) {
			this.alertUnit = alertUnit;
		}

		public Boolean getUseflag() {
			return this.useflag;
		}

		public void setUseflag(Boolean useflag) {
			this.useflag = useflag;
		}

		public String getFounder() {
			return this.founder;
		}

		public void setFounder(String founder) {
			this.founder = founder;
		}

		public Integer getAlertInterval() {
			return this.alertInterval;
		}

		public void setAlertInterval(Integer alertInterval) {
			this.alertInterval = alertInterval;
		}

		public String getDetail() {
			return this.detail;
		}

		public void setDetail(String detail) {
			this.detail = detail;
		}

		public Integer getMaxAlertTimes() {
			return this.maxAlertTimes;
		}

		public void setMaxAlertTimes(Integer maxAlertTimes) {
			this.maxAlertTimes = maxAlertTimes;
		}

		public List<RobotsItem> getRobots() {
			return this.robots;
		}

		public void setRobots(List<RobotsItem> robots) {
			this.robots = robots;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public List<BaselinesItem> getBaselines() {
			return this.baselines;
		}

		public void setBaselines(List<BaselinesItem> baselines) {
			this.baselines = baselines;
		}

		public List<ProjectsItem> getProjects() {
			return this.projects;
		}

		public void setProjects(List<ProjectsItem> projects) {
			this.projects = projects;
		}

		public List<BizProcessesItem> getBizProcesses() {
			return this.bizProcesses;
		}

		public void setBizProcesses(List<BizProcessesItem> bizProcesses) {
			this.bizProcesses = bizProcesses;
		}

		public List<String> getAlertMethods() {
			return this.alertMethods;
		}

		public void setAlertMethods(List<String> alertMethods) {
			this.alertMethods = alertMethods;
		}

		public List<String> getAlertTargets() {
			return this.alertTargets;
		}

		public void setAlertTargets(List<String> alertTargets) {
			this.alertTargets = alertTargets;
		}

		public static class RobotsItem {

			private String webUrl;

			private Boolean atAll;

			public String getWebUrl() {
				return this.webUrl;
			}

			public void setWebUrl(String webUrl) {
				this.webUrl = webUrl;
			}

			public Boolean getAtAll() {
				return this.atAll;
			}

			public void setAtAll(Boolean atAll) {
				this.atAll = atAll;
			}
		}

		public static class NodesItem {

			private Long nodeId;

			private String nodeName;

			private String owner;

			private Long projectId;

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}
		}

		public static class BaselinesItem {

			private Long baselineId;

			private String baselineName;

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public String getBaselineName() {
				return this.baselineName;
			}

			public void setBaselineName(String baselineName) {
				this.baselineName = baselineName;
			}
		}

		public static class ProjectsItem {

			private Long projectId;

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}
		}

		public static class BizProcessesItem {

			private Long bizId;

			private String bizProcessName;

			public Long getBizId() {
				return this.bizId;
			}

			public void setBizId(Long bizId) {
				this.bizId = bizId;
			}

			public String getBizProcessName() {
				return this.bizProcessName;
			}

			public void setBizProcessName(String bizProcessName) {
				this.bizProcessName = bizProcessName;
			}
		}
	}

	@Override
	public GetRemindResponse getInstance(UnmarshallerContext context) {
		return	GetRemindResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
