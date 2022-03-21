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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetBaselineKeyPathResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBaselineKeyPathResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private List<DataItem> data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String owner;

		private String nodeName;

		private Long bizdate;

		private Long projectId;

		private Long instanceId;

		private Integer prgType;

		private Long nodeId;

		private Integer inGroupId;

		private List<RunsItem> runs;

		private List<TopicsItem> topics;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Long getBizdate() {
			return this.bizdate;
		}

		public void setBizdate(Long bizdate) {
			this.bizdate = bizdate;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getPrgType() {
			return this.prgType;
		}

		public void setPrgType(Integer prgType) {
			this.prgType = prgType;
		}

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}

		public Integer getInGroupId() {
			return this.inGroupId;
		}

		public void setInGroupId(Integer inGroupId) {
			this.inGroupId = inGroupId;
		}

		public List<RunsItem> getRuns() {
			return this.runs;
		}

		public void setRuns(List<RunsItem> runs) {
			this.runs = runs;
		}

		public List<TopicsItem> getTopics() {
			return this.topics;
		}

		public void setTopics(List<TopicsItem> topics) {
			this.topics = topics;
		}

		public static class RunsItem {

			private String status;

			private Long absTime;

			private Long beginRunningTime;

			private Long cycTime;

			private String owner;

			private Long finishTime;

			private Long projectId;

			private Long beginCast;

			private Long instanceId;

			private Long endCast;

			private Long beginWaitResTime;

			private Integer inGroupId;

			private String nodeName;

			private Long bizdate;

			private Long beginWaitTimeTime;

			private Long nodeId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getAbsTime() {
				return this.absTime;
			}

			public void setAbsTime(Long absTime) {
				this.absTime = absTime;
			}

			public Long getBeginRunningTime() {
				return this.beginRunningTime;
			}

			public void setBeginRunningTime(Long beginRunningTime) {
				this.beginRunningTime = beginRunningTime;
			}

			public Long getCycTime() {
				return this.cycTime;
			}

			public void setCycTime(Long cycTime) {
				this.cycTime = cycTime;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(Long finishTime) {
				this.finishTime = finishTime;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public Long getBeginCast() {
				return this.beginCast;
			}

			public void setBeginCast(Long beginCast) {
				this.beginCast = beginCast;
			}

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public Long getEndCast() {
				return this.endCast;
			}

			public void setEndCast(Long endCast) {
				this.endCast = endCast;
			}

			public Long getBeginWaitResTime() {
				return this.beginWaitResTime;
			}

			public void setBeginWaitResTime(Long beginWaitResTime) {
				this.beginWaitResTime = beginWaitResTime;
			}

			public Integer getInGroupId() {
				return this.inGroupId;
			}

			public void setInGroupId(Integer inGroupId) {
				this.inGroupId = inGroupId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Long getBizdate() {
				return this.bizdate;
			}

			public void setBizdate(Long bizdate) {
				this.bizdate = bizdate;
			}

			public Long getBeginWaitTimeTime() {
				return this.beginWaitTimeTime;
			}

			public void setBeginWaitTimeTime(Long beginWaitTimeTime) {
				this.beginWaitTimeTime = beginWaitTimeTime;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}
		}

		public static class TopicsItem {

			private Long topicName;

			private Long instanceId;

			private Long topicId;

			private Long addTime;

			public Long getTopicName() {
				return this.topicName;
			}

			public void setTopicName(Long topicName) {
				this.topicName = topicName;
			}

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public Long getTopicId() {
				return this.topicId;
			}

			public void setTopicId(Long topicId) {
				this.topicId = topicId;
			}

			public Long getAddTime() {
				return this.addTime;
			}

			public void setAddTime(Long addTime) {
				this.addTime = addTime;
			}
		}
	}

	@Override
	public GetBaselineKeyPathResponse getInstance(UnmarshallerContext context) {
		return	GetBaselineKeyPathResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
