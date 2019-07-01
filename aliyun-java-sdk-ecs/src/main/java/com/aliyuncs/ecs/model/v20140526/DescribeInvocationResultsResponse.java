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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInvocationResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationResultsResponse extends AcsResponse {

	private String requestId;

	private Invocation invocation;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Invocation getInvocation() {
		return this.invocation;
	}

	public void setInvocation(Invocation invocation) {
		this.invocation = invocation;
	}

	public static class Invocation {

		private Long pageSize;

		private Long pageNumber;

		private Long totalCount;

		private List<InvocationResult> invocationResults;

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<InvocationResult> getInvocationResults() {
			return this.invocationResults;
		}

		public void setInvocationResults(List<InvocationResult> invocationResults) {
			this.invocationResults = invocationResults;
		}

		public static class InvocationResult {

			private String commandId;

			private String invokeId;

			private String instanceId;

			private String startTime;

			private String finishedTime;

			private String output;

			private String invokeRecordStatus;

			private Long exitCode;

			public String getCommandId() {
				return this.commandId;
			}

			public void setCommandId(String commandId) {
				this.commandId = commandId;
			}

			public String getInvokeId() {
				return this.invokeId;
			}

			public void setInvokeId(String invokeId) {
				this.invokeId = invokeId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getFinishedTime() {
				return this.finishedTime;
			}

			public void setFinishedTime(String finishedTime) {
				this.finishedTime = finishedTime;
			}

			public String getOutput() {
				return this.output;
			}

			public void setOutput(String output) {
				this.output = output;
			}

			public String getInvokeRecordStatus() {
				return this.invokeRecordStatus;
			}

			public void setInvokeRecordStatus(String invokeRecordStatus) {
				this.invokeRecordStatus = invokeRecordStatus;
			}

			public Long getExitCode() {
				return this.exitCode;
			}

			public void setExitCode(Long exitCode) {
				this.exitCode = exitCode;
			}
		}
	}

	@Override
	public DescribeInvocationResultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInvocationResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
