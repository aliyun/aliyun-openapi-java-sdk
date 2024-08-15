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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeInvocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<Invocation> invocations;

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

	public List<Invocation> getInvocations() {
		return this.invocations;
	}

	public void setInvocations(List<Invocation> invocations) {
		this.invocations = invocations;
	}

	public static class Invocation {

		private String invokeId;

		private String commandContent;

		private String commandType;

		private String invocationStatus;

		private String creationTime;

		private String endUserId;

		private Integer invokeDesktopCount;

		private Integer invokeDesktopSucceedCount;

		private List<InvokeDesktop> invokeDesktops;

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getCommandContent() {
			return this.commandContent;
		}

		public void setCommandContent(String commandContent) {
			this.commandContent = commandContent;
		}

		public String getCommandType() {
			return this.commandType;
		}

		public void setCommandType(String commandType) {
			this.commandType = commandType;
		}

		public String getInvocationStatus() {
			return this.invocationStatus;
		}

		public void setInvocationStatus(String invocationStatus) {
			this.invocationStatus = invocationStatus;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getEndUserId() {
			return this.endUserId;
		}

		public void setEndUserId(String endUserId) {
			this.endUserId = endUserId;
		}

		public Integer getInvokeDesktopCount() {
			return this.invokeDesktopCount;
		}

		public void setInvokeDesktopCount(Integer invokeDesktopCount) {
			this.invokeDesktopCount = invokeDesktopCount;
		}

		public Integer getInvokeDesktopSucceedCount() {
			return this.invokeDesktopSucceedCount;
		}

		public void setInvokeDesktopSucceedCount(Integer invokeDesktopSucceedCount) {
			this.invokeDesktopSucceedCount = invokeDesktopSucceedCount;
		}

		public List<InvokeDesktop> getInvokeDesktops() {
			return this.invokeDesktops;
		}

		public void setInvokeDesktops(List<InvokeDesktop> invokeDesktops) {
			this.invokeDesktops = invokeDesktops;
		}

		public static class InvokeDesktop {

			private String invocationStatus;

			private String output;

			private String creationTime;

			private String updateTime;

			private Integer repeats;

			private String desktopId;

			private Integer dropped;

			private String startTime;

			private String stopTime;

			private String finishTime;

			private Long exitCode;

			private String errorCode;

			private String errorInfo;

			private String desktopName;

			public String getInvocationStatus() {
				return this.invocationStatus;
			}

			public void setInvocationStatus(String invocationStatus) {
				this.invocationStatus = invocationStatus;
			}

			public String getOutput() {
				return this.output;
			}

			public void setOutput(String output) {
				this.output = output;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}

			public Integer getRepeats() {
				return this.repeats;
			}

			public void setRepeats(Integer repeats) {
				this.repeats = repeats;
			}

			public String getDesktopId() {
				return this.desktopId;
			}

			public void setDesktopId(String desktopId) {
				this.desktopId = desktopId;
			}

			public Integer getDropped() {
				return this.dropped;
			}

			public void setDropped(Integer dropped) {
				this.dropped = dropped;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getStopTime() {
				return this.stopTime;
			}

			public void setStopTime(String stopTime) {
				this.stopTime = stopTime;
			}

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public Long getExitCode() {
				return this.exitCode;
			}

			public void setExitCode(Long exitCode) {
				this.exitCode = exitCode;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorInfo() {
				return this.errorInfo;
			}

			public void setErrorInfo(String errorInfo) {
				this.errorInfo = errorInfo;
			}

			public String getDesktopName() {
				return this.desktopName;
			}

			public void setDesktopName(String desktopName) {
				this.desktopName = desktopName;
			}
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
