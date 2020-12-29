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

package com.aliyuncs.paistudio.model.v20201123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.paistudio.transform.v20201123.GetExperimentStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetExperimentStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String experimentId;

		private String status;

		private List<NodesItem> nodes;

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<NodesItem> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<NodesItem> nodes) {
			this.nodes = nodes;
		}

		public static class NodesItem {

			private String nodeId;

			private String executionId;

			private String runId;

			private String runNodeId;

			private String status;

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getExecutionId() {
				return this.executionId;
			}

			public void setExecutionId(String executionId) {
				this.executionId = executionId;
			}

			public String getRunId() {
				return this.runId;
			}

			public void setRunId(String runId) {
				this.runId = runId;
			}

			public String getRunNodeId() {
				return this.runNodeId;
			}

			public void setRunNodeId(String runNodeId) {
				this.runNodeId = runNodeId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public GetExperimentStatusResponse getInstance(UnmarshallerContext context) {
		return	GetExperimentStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
