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
import com.aliyuncs.ecs.transform.v20140526.DescribeInvocationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInvocationsResponse extends AcsResponse {

	private Long pageSize;

	private String requestId;

	private Long pageNumber;

	private Long totalCount;

	private String nextToken;

	private List<Invocation> invocations;

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<Invocation> getInvocations() {
		return this.invocations;
	}

	public void setInvocations(List<Invocation> invocations) {
		this.invocations = invocations;
	}

	public static class Invocation {

		private String creationTime;

		private String frequency;

		private String invocationStatus;

		private String repeatMode;

		private String commandId;

		private String commandType;

		private String invokeStatus;

		private String parameters;

		private Boolean timed;

		private String commandContent;

		private String commandName;

		private String commandDescription;

		private String invokeId;

		private String username;

		private String workingDir;

		private Long timeout;

		private String containerId;

		private String containerName;

		private String terminationMode;

		private String launcher;

		private List<InvokeInstance> invokeInstances;

		private List<Tag> tags;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getFrequency() {
			return this.frequency;
		}

		public void setFrequency(String frequency) {
			this.frequency = frequency;
		}

		public String getInvocationStatus() {
			return this.invocationStatus;
		}

		public void setInvocationStatus(String invocationStatus) {
			this.invocationStatus = invocationStatus;
		}

		public String getRepeatMode() {
			return this.repeatMode;
		}

		public void setRepeatMode(String repeatMode) {
			this.repeatMode = repeatMode;
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

		public String getInvokeStatus() {
			return this.invokeStatus;
		}

		public void setInvokeStatus(String invokeStatus) {
			this.invokeStatus = invokeStatus;
		}

		public String getParameters() {
			return this.parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}

		public Boolean getTimed() {
			return this.timed;
		}

		public void setTimed(Boolean timed) {
			this.timed = timed;
		}

		public String getCommandContent() {
			return this.commandContent;
		}

		public void setCommandContent(String commandContent) {
			this.commandContent = commandContent;
		}

		public String getCommandName() {
			return this.commandName;
		}

		public void setCommandName(String commandName) {
			this.commandName = commandName;
		}

		public String getCommandDescription() {
			return this.commandDescription;
		}

		public void setCommandDescription(String commandDescription) {
			this.commandDescription = commandDescription;
		}

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getWorkingDir() {
			return this.workingDir;
		}

		public void setWorkingDir(String workingDir) {
			this.workingDir = workingDir;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public String getContainerId() {
			return this.containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}

		public String getContainerName() {
			return this.containerName;
		}

		public void setContainerName(String containerName) {
			this.containerName = containerName;
		}

		public String getTerminationMode() {
			return this.terminationMode;
		}

		public void setTerminationMode(String terminationMode) {
			this.terminationMode = terminationMode;
		}

		public String getLauncher() {
			return this.launcher;
		}

		public void setLauncher(String launcher) {
			this.launcher = launcher;
		}

		public List<InvokeInstance> getInvokeInstances() {
			return this.invokeInstances;
		}

		public void setInvokeInstances(List<InvokeInstance> invokeInstances) {
			this.invokeInstances = invokeInstances;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class InvokeInstance {

			private String creationTime;

			private String updateTime;

			private String finishTime;

			private String invocationStatus;

			private Integer repeats;

			private String instanceId;

			private String output;

			private Integer dropped;

			private String stopTime;

			private Long exitCode;

			private String startTime;

			private String errorInfo;

			private Boolean timed;

			private String errorCode;

			private String instanceInvokeStatus;

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

			public String getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(String finishTime) {
				this.finishTime = finishTime;
			}

			public String getInvocationStatus() {
				return this.invocationStatus;
			}

			public void setInvocationStatus(String invocationStatus) {
				this.invocationStatus = invocationStatus;
			}

			public Integer getRepeats() {
				return this.repeats;
			}

			public void setRepeats(Integer repeats) {
				this.repeats = repeats;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getOutput() {
				return this.output;
			}

			public void setOutput(String output) {
				this.output = output;
			}

			public Integer getDropped() {
				return this.dropped;
			}

			public void setDropped(Integer dropped) {
				this.dropped = dropped;
			}

			public String getStopTime() {
				return this.stopTime;
			}

			public void setStopTime(String stopTime) {
				this.stopTime = stopTime;
			}

			public Long getExitCode() {
				return this.exitCode;
			}

			public void setExitCode(Long exitCode) {
				this.exitCode = exitCode;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getErrorInfo() {
				return this.errorInfo;
			}

			public void setErrorInfo(String errorInfo) {
				this.errorInfo = errorInfo;
			}

			public Boolean getTimed() {
				return this.timed;
			}

			public void setTimed(Boolean timed) {
				this.timed = timed;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getInstanceInvokeStatus() {
				return this.instanceInvokeStatus;
			}

			public void setInstanceInvokeStatus(String instanceInvokeStatus) {
				this.instanceInvokeStatus = instanceInvokeStatus;
			}
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeInvocationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeInvocationsResponseUnmarshaller.unmarshall(this, context);
	}
}
