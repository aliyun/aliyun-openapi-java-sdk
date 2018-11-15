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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInvocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private Long pageNumber;

	private Long pageSize;

	private List<Invocation> invocations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<Invocation> getInvocations() {
		return this.invocations;
	}

	public void setInvocations(List<Invocation> invocations) {
		this.invocations = invocations;
	}

	public static class Invocation {

		private String invokeId;

		private String commandId;

		private String commandType;

		private String commandName;

		private String frequency;

		private Boolean timed;

		private String invokeStatus;

		private List<InvokeInstance> invokeInstances;

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getCommandId() {
			return this.commandId;
		}

		public void setCommandId(String commandId) {
			this.commandId = commandId;
		}

		public String getCommandType() {
			return this.commandType;
		}

		public void setCommandType(String commandType) {
			this.commandType = commandType;
		}

		public String getCommandName() {
			return this.commandName;
		}

		public void setCommandName(String commandName) {
			this.commandName = commandName;
		}

		public String getFrequency() {
			return this.frequency;
		}

		public void setFrequency(String frequency) {
			this.frequency = frequency;
		}

		public Boolean getTimed() {
			return this.timed;
		}

		public void setTimed(Boolean timed) {
			this.timed = timed;
		}

		public String getInvokeStatus() {
			return this.invokeStatus;
		}

		public void setInvokeStatus(String invokeStatus) {
			this.invokeStatus = invokeStatus;
		}

		public List<InvokeInstance> getInvokeInstances() {
			return this.invokeInstances;
		}

		public void setInvokeInstances(List<InvokeInstance> invokeInstances) {
			this.invokeInstances = invokeInstances;
		}

		public static class InvokeInstance {

			private String instanceId;

			private String instanceInvokeStatus;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getInstanceInvokeStatus() {
				return this.instanceInvokeStatus;
			}

			public void setInstanceInvokeStatus(String instanceInvokeStatus) {
				this.instanceInvokeStatus = instanceInvokeStatus;
			}
		}
	}

	@Override
	public DescribeInvocationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInvocationsResponseUnmarshaller.unmarshall(this, context);
	}
}
