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
import com.aliyuncs.dataworks_public.transform.v20200518.ListNodesByOutputResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodesByOutputResponse extends AcsResponse {

	private Boolean success;

	private Integer httpStatusCode;

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private List<OutputNodePair> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OutputNodePair> getData() {
		return this.data;
	}

	public void setData(List<OutputNodePair> data) {
		this.data = data;
	}

	public static class OutputNodePair {

		private String output;

		private List<Node> nodeList;

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public List<Node> getNodeList() {
			return this.nodeList;
		}

		public void setNodeList(List<Node> nodeList) {
			this.nodeList = nodeList;
		}

		public static class Node {

			private Long nodeId;

			private String nodeName;

			private String ownerId;

			private String description;

			private String resGroupName;

			private String cronExpress;

			private Boolean repeatability;

			private String programType;

			private Long projectId;

			private String schedulerType;

			private String paramValues;

			private Integer priority;

			private Long baselineId;

			private Integer repeatInterval;

			private String connection;

			private Integer dqcType;

			private String dqcDescription;

			private Long relatedFlowId;

			private String fileType;

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

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getResGroupName() {
				return this.resGroupName;
			}

			public void setResGroupName(String resGroupName) {
				this.resGroupName = resGroupName;
			}

			public String getCronExpress() {
				return this.cronExpress;
			}

			public void setCronExpress(String cronExpress) {
				this.cronExpress = cronExpress;
			}

			public Boolean getRepeatability() {
				return this.repeatability;
			}

			public void setRepeatability(Boolean repeatability) {
				this.repeatability = repeatability;
			}

			public String getProgramType() {
				return this.programType;
			}

			public void setProgramType(String programType) {
				this.programType = programType;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getSchedulerType() {
				return this.schedulerType;
			}

			public void setSchedulerType(String schedulerType) {
				this.schedulerType = schedulerType;
			}

			public String getParamValues() {
				return this.paramValues;
			}

			public void setParamValues(String paramValues) {
				this.paramValues = paramValues;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public Integer getRepeatInterval() {
				return this.repeatInterval;
			}

			public void setRepeatInterval(Integer repeatInterval) {
				this.repeatInterval = repeatInterval;
			}

			public String getConnection() {
				return this.connection;
			}

			public void setConnection(String connection) {
				this.connection = connection;
			}

			public Integer getDqcType() {
				return this.dqcType;
			}

			public void setDqcType(Integer dqcType) {
				this.dqcType = dqcType;
			}

			public String getDqcDescription() {
				return this.dqcDescription;
			}

			public void setDqcDescription(String dqcDescription) {
				this.dqcDescription = dqcDescription;
			}

			public Long getRelatedFlowId() {
				return this.relatedFlowId;
			}

			public void setRelatedFlowId(Long relatedFlowId) {
				this.relatedFlowId = relatedFlowId;
			}

			public String getFileType() {
				return this.fileType;
			}

			public void setFileType(String fileType) {
				this.fileType = fileType;
			}
		}
	}

	@Override
	public ListNodesByOutputResponse getInstance(UnmarshallerContext context) {
		return	ListNodesByOutputResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
