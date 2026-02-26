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

package com.aliyuncs.swas_open.model.v20200601;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.swas_open.transform.v20200601.DescribeInvocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<Invocation> invocations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Invocation> getInvocations() {
		return this.invocations;
	}

	public void setInvocations(List<Invocation> invocations) {
		this.invocations = invocations;
	}

	public static class Invocation {

		private String creationTime;

		private String invocationStatus;

		private String commandType;

		private String commandContent;

		private Map<Object,Object> parameters;

		private String invokeStatus;

		private String invokeId;

		private String commandName;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getInvocationStatus() {
			return this.invocationStatus;
		}

		public void setInvocationStatus(String invocationStatus) {
			this.invocationStatus = invocationStatus;
		}

		public String getCommandType() {
			return this.commandType;
		}

		public void setCommandType(String commandType) {
			this.commandType = commandType;
		}

		public String getCommandContent() {
			return this.commandContent;
		}

		public void setCommandContent(String commandContent) {
			this.commandContent = commandContent;
		}

		public Map<Object,Object> getParameters() {
			return this.parameters;
		}

		public void setParameters(Map<Object,Object> parameters) {
			this.parameters = parameters;
		}

		public String getInvokeStatus() {
			return this.invokeStatus;
		}

		public void setInvokeStatus(String invokeStatus) {
			this.invokeStatus = invokeStatus;
		}

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getCommandName() {
			return this.commandName;
		}

		public void setCommandName(String commandName) {
			this.commandName = commandName;
		}
	}

	@Override
	public DescribeInvocationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInvocationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
