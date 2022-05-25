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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeHybridMonitorTaskListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHybridMonitorTaskListResponse extends AcsResponse {

	private String requestId;

	private String success;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer total;

	private List<TaskListItem> taskList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<TaskListItem> getTaskList() {
		return this.taskList;
	}

	public void setTaskList(List<TaskListItem> taskList) {
		this.taskList = taskList;
	}

	public static class TaskListItem {

		private String yARMConfig;

		private String createTime;

		private String taskName;

		private String namespace;

		private String uploadRegion;

		private String networkType;

		private Integer collectTimout;

		private String collectTargetEndpoint;

		private String taskType;

		private String matchExpressRelation;

		private String description;

		private String groupId;

		private Integer collectInterval;

		private String targetUserId;

		private String collectTargetPath;

		private String collectTargetType;

		private String taskId;

		private String extraInfo;

		private String logFilePath;

		private String logSplit;

		private String logProcess;

		private String logSample;

		private String sLSProcess;

		private List<AttachLabelsItem> attachLabels;

		private List<MatchExpressItem> matchExpress;

		private List<String> instances;

		public String getYARMConfig() {
			return this.yARMConfig;
		}

		public void setYARMConfig(String yARMConfig) {
			this.yARMConfig = yARMConfig;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getUploadRegion() {
			return this.uploadRegion;
		}

		public void setUploadRegion(String uploadRegion) {
			this.uploadRegion = uploadRegion;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Integer getCollectTimout() {
			return this.collectTimout;
		}

		public void setCollectTimout(Integer collectTimout) {
			this.collectTimout = collectTimout;
		}

		public String getCollectTargetEndpoint() {
			return this.collectTargetEndpoint;
		}

		public void setCollectTargetEndpoint(String collectTargetEndpoint) {
			this.collectTargetEndpoint = collectTargetEndpoint;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getMatchExpressRelation() {
			return this.matchExpressRelation;
		}

		public void setMatchExpressRelation(String matchExpressRelation) {
			this.matchExpressRelation = matchExpressRelation;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Integer getCollectInterval() {
			return this.collectInterval;
		}

		public void setCollectInterval(Integer collectInterval) {
			this.collectInterval = collectInterval;
		}

		public String getTargetUserId() {
			return this.targetUserId;
		}

		public void setTargetUserId(String targetUserId) {
			this.targetUserId = targetUserId;
		}

		public String getCollectTargetPath() {
			return this.collectTargetPath;
		}

		public void setCollectTargetPath(String collectTargetPath) {
			this.collectTargetPath = collectTargetPath;
		}

		public String getCollectTargetType() {
			return this.collectTargetType;
		}

		public void setCollectTargetType(String collectTargetType) {
			this.collectTargetType = collectTargetType;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
		}

		public String getLogFilePath() {
			return this.logFilePath;
		}

		public void setLogFilePath(String logFilePath) {
			this.logFilePath = logFilePath;
		}

		public String getLogSplit() {
			return this.logSplit;
		}

		public void setLogSplit(String logSplit) {
			this.logSplit = logSplit;
		}

		public String getLogProcess() {
			return this.logProcess;
		}

		public void setLogProcess(String logProcess) {
			this.logProcess = logProcess;
		}

		public String getLogSample() {
			return this.logSample;
		}

		public void setLogSample(String logSample) {
			this.logSample = logSample;
		}

		public String getSLSProcess() {
			return this.sLSProcess;
		}

		public void setSLSProcess(String sLSProcess) {
			this.sLSProcess = sLSProcess;
		}

		public List<AttachLabelsItem> getAttachLabels() {
			return this.attachLabels;
		}

		public void setAttachLabels(List<AttachLabelsItem> attachLabels) {
			this.attachLabels = attachLabels;
		}

		public List<MatchExpressItem> getMatchExpress() {
			return this.matchExpress;
		}

		public void setMatchExpress(List<MatchExpressItem> matchExpress) {
			this.matchExpress = matchExpress;
		}

		public List<String> getInstances() {
			return this.instances;
		}

		public void setInstances(List<String> instances) {
			this.instances = instances;
		}

		public static class AttachLabelsItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class MatchExpressItem {

			private String value;

			private String name;

			private String function;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getFunction() {
				return this.function;
			}

			public void setFunction(String function) {
				this.function = function;
			}
		}
	}

	@Override
	public DescribeHybridMonitorTaskListResponse getInstance(UnmarshallerContext context) {
		return	DescribeHybridMonitorTaskListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
