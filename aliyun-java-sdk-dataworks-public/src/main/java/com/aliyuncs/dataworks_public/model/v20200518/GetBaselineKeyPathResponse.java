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

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Integer httpStatusCode;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long instanceId;

		private Long projectId;

		private Long nodeId;

		private String nodeName;

		private Long bizdate;

		private Integer inGroupId;

		private String owner;

		private Integer prgType;

		private List<RunsItem> runs;

		private List<TopicsItem> topics;

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
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

		public Integer getInGroupId() {
			return this.inGroupId;
		}

		public void setInGroupId(Integer inGroupId) {
			this.inGroupId = inGroupId;
		}

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public Integer getPrgType() {
			return this.prgType;
		}

		public void setPrgType(Integer prgType) {
			this.prgType = prgType;
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

			private Long absTime;

			private Long beginCast;

			private Long beginRunningTime;

			private Long beginWaitResTime;

			private Long beginWaitTimeTime;

			private Long bizdate;

			private Long cycTime;

			private Long endCast;

			private Long finishTime;

			private Integer inGroupId;

			private Long instanceId;

			private Long nodeId;

			private String nodeName;

			private String owner;

			private Long projectId;

			private String status;

			public Long getAbsTime() {
				return this.absTime;
			}

			public void setAbsTime(Long absTime) {
				this.absTime = absTime;
			}

			public Long getBeginCast() {
				return this.beginCast;
			}

			public void setBeginCast(Long beginCast) {
				this.beginCast = beginCast;
			}

			public Long getBeginRunningTime() {
				return this.beginRunningTime;
			}

			public void setBeginRunningTime(Long beginRunningTime) {
				this.beginRunningTime = beginRunningTime;
			}

			public Long getBeginWaitResTime() {
				return this.beginWaitResTime;
			}

			public void setBeginWaitResTime(Long beginWaitResTime) {
				this.beginWaitResTime = beginWaitResTime;
			}

			public Long getBeginWaitTimeTime() {
				return this.beginWaitTimeTime;
			}

			public void setBeginWaitTimeTime(Long beginWaitTimeTime) {
				this.beginWaitTimeTime = beginWaitTimeTime;
			}

			public Long getBizdate() {
				return this.bizdate;
			}

			public void setBizdate(Long bizdate) {
				this.bizdate = bizdate;
			}

			public Long getCycTime() {
				return this.cycTime;
			}

			public void setCycTime(Long cycTime) {
				this.cycTime = cycTime;
			}

			public Long getEndCast() {
				return this.endCast;
			}

			public void setEndCast(Long endCast) {
				this.endCast = endCast;
			}

			public Long getFinishTime() {
				return this.finishTime;
			}

			public void setFinishTime(Long finishTime) {
				this.finishTime = finishTime;
			}

			public Integer getInGroupId() {
				return this.inGroupId;
			}

			public void setInGroupId(Integer inGroupId) {
				this.inGroupId = inGroupId;
			}

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class TopicsItem {

			private Long instanceId;

			private Long topicId;

			private Long topicName;

			private Long addTime;

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

			public Long getTopicName() {
				return this.topicName;
			}

			public void setTopicName(Long topicName) {
				this.topicName = topicName;
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
