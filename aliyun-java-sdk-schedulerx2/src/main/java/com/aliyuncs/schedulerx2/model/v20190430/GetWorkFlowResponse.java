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

package com.aliyuncs.schedulerx2.model.v20190430;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.schedulerx2.transform.v20190430.GetWorkFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWorkFlowResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

		private WorkFlowNodeInfo workFlowNodeInfo;

		private WorkFlowInfo workFlowInfo;

		public WorkFlowNodeInfo getWorkFlowNodeInfo() {
			return this.workFlowNodeInfo;
		}

		public void setWorkFlowNodeInfo(WorkFlowNodeInfo workFlowNodeInfo) {
			this.workFlowNodeInfo = workFlowNodeInfo;
		}

		public WorkFlowInfo getWorkFlowInfo() {
			return this.workFlowInfo;
		}

		public void setWorkFlowInfo(WorkFlowInfo workFlowInfo) {
			this.workFlowInfo = workFlowInfo;
		}

		public static class WorkFlowNodeInfo {

			private List<Edge> edges;

			private List<Node> nodes;

			public List<Edge> getEdges() {
				return this.edges;
			}

			public void setEdges(List<Edge> edges) {
				this.edges = edges;
			}

			public List<Node> getNodes() {
				return this.nodes;
			}

			public void setNodes(List<Node> nodes) {
				this.nodes = nodes;
			}

			public static class Edge {

				private Long target;

				private Long source;

				public Long getTarget() {
					return this.target;
				}

				public void setTarget(Long target) {
					this.target = target;
				}

				public Long getSource() {
					return this.source;
				}

				public void setSource(Long source) {
					this.source = source;
				}
			}

			public static class Node {

				private Integer status;

				private String label;

				private Long id;

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}
			}
		}

		public static class WorkFlowInfo {

			private String status;

			private String description;

			private String maxConcurrency;

			private String timeExpression;

			private Long workflowId;

			private String namespace;

			private String name;

			private String timeType;

			private String groupId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getMaxConcurrency() {
				return this.maxConcurrency;
			}

			public void setMaxConcurrency(String maxConcurrency) {
				this.maxConcurrency = maxConcurrency;
			}

			public String getTimeExpression() {
				return this.timeExpression;
			}

			public void setTimeExpression(String timeExpression) {
				this.timeExpression = timeExpression;
			}

			public Long getWorkflowId() {
				return this.workflowId;
			}

			public void setWorkflowId(Long workflowId) {
				this.workflowId = workflowId;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTimeType() {
				return this.timeType;
			}

			public void setTimeType(String timeType) {
				this.timeType = timeType;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}
		}
	}

	@Override
	public GetWorkFlowResponse getInstance(UnmarshallerContext context) {
		return	GetWorkFlowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
