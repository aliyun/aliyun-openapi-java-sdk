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

package com.aliyuncs.fnf.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.fnf.transform.v20190315.ListExecutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExecutionsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<ExecutionsItem> executions;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ExecutionsItem> getExecutions() {
		return this.executions;
	}

	public void setExecutions(List<ExecutionsItem> executions) {
		this.executions = executions;
	}

	public static class ExecutionsItem {

		private String status;

		private String stoppedTime;

		private String startedTime;

		private String flowDefinition;

		private String externalInputUri;

		private String output;

		private String flowName;

		private String externalOutputUri;

		private String name;

		private String input;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStoppedTime() {
			return this.stoppedTime;
		}

		public void setStoppedTime(String stoppedTime) {
			this.stoppedTime = stoppedTime;
		}

		public String getStartedTime() {
			return this.startedTime;
		}

		public void setStartedTime(String startedTime) {
			this.startedTime = startedTime;
		}

		public String getFlowDefinition() {
			return this.flowDefinition;
		}

		public void setFlowDefinition(String flowDefinition) {
			this.flowDefinition = flowDefinition;
		}

		public String getExternalInputUri() {
			return this.externalInputUri;
		}

		public void setExternalInputUri(String externalInputUri) {
			this.externalInputUri = externalInputUri;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public String getFlowName() {
			return this.flowName;
		}

		public void setFlowName(String flowName) {
			this.flowName = flowName;
		}

		public String getExternalOutputUri() {
			return this.externalOutputUri;
		}

		public void setExternalOutputUri(String externalOutputUri) {
			this.externalOutputUri = externalOutputUri;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInput() {
			return this.input;
		}

		public void setInput(String input) {
			this.input = input;
		}
	}

	@Override
	public ListExecutionsResponse getInstance(UnmarshallerContext context) {
		return	ListExecutionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
