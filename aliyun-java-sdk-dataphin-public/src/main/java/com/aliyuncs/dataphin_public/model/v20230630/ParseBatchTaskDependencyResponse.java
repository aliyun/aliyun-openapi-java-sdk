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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ParseBatchTaskDependencyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ParseBatchTaskDependencyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private ParseResult parseResult;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ParseResult getParseResult() {
		return this.parseResult;
	}

	public void setParseResult(ParseResult parseResult) {
		this.parseResult = parseResult;
	}

	public static class ParseResult {

		private List<DependNode> dependNodeList;

		public List<DependNode> getDependNodeList() {
			return this.dependNodeList;
		}

		public void setDependNodeList(List<DependNode> dependNodeList) {
			this.dependNodeList = dependNodeList;
		}

		public static class DependNode {

			private String nodeIoType;

			private List<NodeInfo> scheduleNodeInfoList;

			public String getNodeIoType() {
				return this.nodeIoType;
			}

			public void setNodeIoType(String nodeIoType) {
				this.nodeIoType = nodeIoType;
			}

			public List<NodeInfo> getScheduleNodeInfoList() {
				return this.scheduleNodeInfoList;
			}

			public void setScheduleNodeInfoList(List<NodeInfo> scheduleNodeInfoList) {
				this.scheduleNodeInfoList = scheduleNodeInfoList;
			}

			public static class NodeInfo {

				private String tableName;

				private String outputName;

				private String ownerUserId;

				private String ownerName;

				private String nodeId;

				private String nodeName;

				private List<String> fieldList;

				public String getTableName() {
					return this.tableName;
				}

				public void setTableName(String tableName) {
					this.tableName = tableName;
				}

				public String getOutputName() {
					return this.outputName;
				}

				public void setOutputName(String outputName) {
					this.outputName = outputName;
				}

				public String getOwnerUserId() {
					return this.ownerUserId;
				}

				public void setOwnerUserId(String ownerUserId) {
					this.ownerUserId = ownerUserId;
				}

				public String getOwnerName() {
					return this.ownerName;
				}

				public void setOwnerName(String ownerName) {
					this.ownerName = ownerName;
				}

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public String getNodeName() {
					return this.nodeName;
				}

				public void setNodeName(String nodeName) {
					this.nodeName = nodeName;
				}

				public List<String> getFieldList() {
					return this.fieldList;
				}

				public void setFieldList(List<String> fieldList) {
					this.fieldList = fieldList;
				}
			}
		}
	}

	@Override
	public ParseBatchTaskDependencyResponse getInstance(UnmarshallerContext context) {
		return	ParseBatchTaskDependencyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
