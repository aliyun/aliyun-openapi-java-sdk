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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeRCInvocationResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRCInvocationResultsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private String pageNumber;

	private String pageSize;

	private List<InvocationResultsItem> invocationResults;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public List<InvocationResultsItem> getInvocationResults() {
		return this.invocationResults;
	}

	public void setInvocationResults(List<InvocationResultsItem> invocationResults) {
		this.invocationResults = invocationResults;
	}

	public static class InvocationResultsItem {

		private Integer dropped;

		private String invocationStatus;

		private String instanceId;

		private String errorInfo;

		private Integer exitCode;

		private String startTime;

		private String repeats;

		private String invokeRecordStatus;

		private String finishedTime;

		private String containerId;

		private String containerName;

		private String username;

		private String output;

		private String commandId;

		private String errorCode;

		private String invokeId;

		private String stopTime;

		private List<TagsItem> tags;

		public Integer getDropped() {
			return this.dropped;
		}

		public void setDropped(Integer dropped) {
			this.dropped = dropped;
		}

		public String getInvocationStatus() {
			return this.invocationStatus;
		}

		public void setInvocationStatus(String invocationStatus) {
			this.invocationStatus = invocationStatus;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getErrorInfo() {
			return this.errorInfo;
		}

		public void setErrorInfo(String errorInfo) {
			this.errorInfo = errorInfo;
		}

		public Integer getExitCode() {
			return this.exitCode;
		}

		public void setExitCode(Integer exitCode) {
			this.exitCode = exitCode;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getRepeats() {
			return this.repeats;
		}

		public void setRepeats(String repeats) {
			this.repeats = repeats;
		}

		public String getInvokeRecordStatus() {
			return this.invokeRecordStatus;
		}

		public void setInvokeRecordStatus(String invokeRecordStatus) {
			this.invokeRecordStatus = invokeRecordStatus;
		}

		public String getFinishedTime() {
			return this.finishedTime;
		}

		public void setFinishedTime(String finishedTime) {
			this.finishedTime = finishedTime;
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

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getOutput() {
			return this.output;
		}

		public void setOutput(String output) {
			this.output = output;
		}

		public String getCommandId() {
			return this.commandId;
		}

		public void setCommandId(String commandId) {
			this.commandId = commandId;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getInvokeId() {
			return this.invokeId;
		}

		public void setInvokeId(String invokeId) {
			this.invokeId = invokeId;
		}

		public String getStopTime() {
			return this.stopTime;
		}

		public void setStopTime(String stopTime) {
			this.stopTime = stopTime;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public static class TagsItem {

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
	public DescribeRCInvocationResultsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRCInvocationResultsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
