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
import com.aliyuncs.dataworks_public.transform.v20200518.GetNodeChildrenResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeChildrenResponse extends AcsResponse {

	private Boolean success;

	private Integer httpStatusCode;

	private String errorCode;

	private String errorMessage;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<NodesItem> nodes;

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public static class NodesItem {

			private Long nodeId;

			private String nodeName;

			private String cronExpress;

			private String schedulerType;

			private String programType;

			private String ownerId;

			private Long projectId;

			private Boolean repeatability;

			private Integer priority;

			private Long baselineId;

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

			public String getCronExpress() {
				return this.cronExpress;
			}

			public void setCronExpress(String cronExpress) {
				this.cronExpress = cronExpress;
			}

			public String getSchedulerType() {
				return this.schedulerType;
			}

			public void setSchedulerType(String schedulerType) {
				this.schedulerType = schedulerType;
			}

			public String getProgramType() {
				return this.programType;
			}

			public void setProgramType(String programType) {
				this.programType = programType;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Boolean getRepeatability() {
				return this.repeatability;
			}

			public void setRepeatability(Boolean repeatability) {
				this.repeatability = repeatability;
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
		}
	}

	@Override
	public GetNodeChildrenResponse getInstance(UnmarshallerContext context) {
		return	GetNodeChildrenResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
