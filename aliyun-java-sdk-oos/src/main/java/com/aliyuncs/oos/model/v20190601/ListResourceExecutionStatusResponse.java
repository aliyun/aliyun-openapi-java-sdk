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

package com.aliyuncs.oos.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oos.transform.v20190601.ListResourceExecutionStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourceExecutionStatusResponse extends AcsResponse {

	private String requestId;

	private Integer maxResults;

	private String nextToken;

	private List<Status> resourceExecutionStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Status> getResourceExecutionStatus() {
		return this.resourceExecutionStatus;
	}

	public void setResourceExecutionStatus(List<Status> resourceExecutionStatus) {
		this.resourceExecutionStatus = resourceExecutionStatus;
	}

	public static class Status {

		private String resourceId;

		private String executionTime;

		private String status;

		private String outputs;

		private String executionId;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getExecutionTime() {
			return this.executionTime;
		}

		public void setExecutionTime(String executionTime) {
			this.executionTime = executionTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOutputs() {
			return this.outputs;
		}

		public void setOutputs(String outputs) {
			this.outputs = outputs;
		}

		public String getExecutionId() {
			return this.executionId;
		}

		public void setExecutionId(String executionId) {
			this.executionId = executionId;
		}
	}

	@Override
	public ListResourceExecutionStatusResponse getInstance(UnmarshallerContext context) {
		return	ListResourceExecutionStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
