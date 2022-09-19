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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetTaskFlowGraphResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskFlowGraphResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private TaskFlowGraph taskFlowGraph;

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

	public TaskFlowGraph getTaskFlowGraph() {
		return this.taskFlowGraph;
	}

	public void setTaskFlowGraph(TaskFlowGraph taskFlowGraph) {
		this.taskFlowGraph = taskFlowGraph;
	}

	public static class TaskFlowGraph {

		private String dagName;

		private Long status;

		private Boolean canEdit;

		private List<Node> nodes;

		private List<Edge> edges;

		public String getDagName() {
			return this.dagName;
		}

		public void setDagName(String dagName) {
			this.dagName = dagName;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Boolean getCanEdit() {
			return this.canEdit;
		}

		public void setCanEdit(Boolean canEdit) {
			this.canEdit = canEdit;
		}

		public List<Node> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<Node> nodes) {
			this.nodes = nodes;
		}

		public List<Edge> getEdges() {
			return this.edges;
		}

		public void setEdges(List<Edge> edges) {
			this.edges = edges;
		}

		public static class Node {

			private Long dagId;

			private Long nodeId;

			private String nodeName;

			private Long nodeType;

			private String nodeContent;

			private String timeVariables;

			private String nodeConfig;

			private String graphParam;

			public Long getDagId() {
				return this.dagId;
			}

			public void setDagId(Long dagId) {
				this.dagId = dagId;
			}

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

			public Long getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(Long nodeType) {
				this.nodeType = nodeType;
			}

			public String getNodeContent() {
				return this.nodeContent;
			}

			public void setNodeContent(String nodeContent) {
				this.nodeContent = nodeContent;
			}

			public String getTimeVariables() {
				return this.timeVariables;
			}

			public void setTimeVariables(String timeVariables) {
				this.timeVariables = timeVariables;
			}

			public String getNodeConfig() {
				return this.nodeConfig;
			}

			public void setNodeConfig(String nodeConfig) {
				this.nodeConfig = nodeConfig;
			}

			public String getGraphParam() {
				return this.graphParam;
			}

			public void setGraphParam(String graphParam) {
				this.graphParam = graphParam;
			}
		}

		public static class Edge {

			private Long dagId;

			private Long id;

			private Long nodeEnd;

			private Long nodeFrom;

			public Long getDagId() {
				return this.dagId;
			}

			public void setDagId(Long dagId) {
				this.dagId = dagId;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getNodeEnd() {
				return this.nodeEnd;
			}

			public void setNodeEnd(Long nodeEnd) {
				this.nodeEnd = nodeEnd;
			}

			public Long getNodeFrom() {
				return this.nodeFrom;
			}

			public void setNodeFrom(Long nodeFrom) {
				this.nodeFrom = nodeFrom;
			}
		}
	}

	@Override
	public GetTaskFlowGraphResponse getInstance(UnmarshallerContext context) {
		return	GetTaskFlowGraphResponseUnmarshaller.unmarshall(this, context);
	}
}
