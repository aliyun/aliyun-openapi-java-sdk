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

	private String requestId;

	private String nextToken;

	private List<ExecutionsItem> executions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ExecutionsItem> getExecutions() {
		return this.executions;
	}

	public void setExecutions(List<ExecutionsItem> executions) {
		this.executions = executions;
	}

	public static class ExecutionsItem {

		private String name;

		private String flowName;

		private String flowDefinition;

		private String input;

		private String output;

		private String status;

		private String startedTime;

		private String stoppedTime;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFlowName() {
			return this.flowName;
		}

		public void setFlowName(String flowName) {
			this.flowName = flowName;
		}

		public String getFlowDefinition() {
			return this.flowDefinition;
		}

		public void setFlowDefinition(String flowDefinition) {
			this.flowDefinition = flowDefinition;
		}

		public String getInput() {
			return this.input;
		}

		public void setInput(String input) {
			this.input = input;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStartedTime() {
			return this.startedTime;
		}

		public void setStartedTime(String startedTime) {
			this.startedTime = startedTime;
		}

		public String getStoppedTime() {
			return this.stoppedTime;
		}

		public void setStoppedTime(String stoppedTime) {
			this.stoppedTime = stoppedTime;
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
