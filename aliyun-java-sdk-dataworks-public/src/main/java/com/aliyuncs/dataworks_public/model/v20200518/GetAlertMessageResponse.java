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
import com.aliyuncs.dataworks_public.transform.v20200518.GetAlertMessageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAlertMessageResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long remindId;

		private String alertMessageStatus;

		private String alertUser;

		private Long alertTime;

		private String alertMethod;

		private String source;

		private String content;

		private String remindName;

		private Long alertId;

		private List<Instance> instances;

		private List<Topic> topics;

		private List<Node> nodes;

		private SlaAlert slaAlert;

		public Long getRemindId() {
			return this.remindId;
		}

		public void setRemindId(Long remindId) {
			this.remindId = remindId;
		}

		public String getAlertMessageStatus() {
			return this.alertMessageStatus;
		}

		public void setAlertMessageStatus(String alertMessageStatus) {
			this.alertMessageStatus = alertMessageStatus;
		}

		public String getAlertUser() {
			return this.alertUser;
		}

		public void setAlertUser(String alertUser) {
			this.alertUser = alertUser;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
		}

		public String getAlertMethod() {
			return this.alertMethod;
		}

		public void setAlertMethod(String alertMethod) {
			this.alertMethod = alertMethod;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getRemindName() {
			return this.remindName;
		}

		public void setRemindName(String remindName) {
			this.remindName = remindName;
		}

		public Long getAlertId() {
			return this.alertId;
		}

		public void setAlertId(Long alertId) {
			this.alertId = alertId;
		}

		public List<Instance> getInstances() {
			return this.instances;
		}

		public void setInstances(List<Instance> instances) {
			this.instances = instances;
		}

		public List<Topic> getTopics() {
			return this.topics;
		}

		public void setTopics(List<Topic> topics) {
			this.topics = topics;
		}

		public List<Node> getNodes() {
			return this.nodes;
		}

		public void setNodes(List<Node> nodes) {
			this.nodes = nodes;
		}

		public SlaAlert getSlaAlert() {
			return this.slaAlert;
		}

		public void setSlaAlert(SlaAlert slaAlert) {
			this.slaAlert = slaAlert;
		}

		public static class Instance {

			private String status;

			private Long instanceId;

			private String nodeName;

			private Long nodeId;

			private Long projectId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Long getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(Long instanceId) {
				this.instanceId = instanceId;
			}

			public String getNodeName() {
				return this.nodeName;
			}

			public void setNodeName(String nodeName) {
				this.nodeName = nodeName;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}
		}

		public static class Topic {

			private String topicName;

			private Long instanceId;

			private Long topicId;

			private String topicOwner;

			private Long nodeId;

			private String topicStatus;

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
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

			public String getTopicOwner() {
				return this.topicOwner;
			}

			public void setTopicOwner(String topicOwner) {
				this.topicOwner = topicOwner;
			}

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public String getTopicStatus() {
				return this.topicStatus;
			}

			public void setTopicStatus(String topicStatus) {
				this.topicStatus = topicStatus;
			}
		}

		public static class Node {

			private String owner;

			private String nodeName;

			private Long nodeId;

			private Long projectId;

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

			public Long getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(Long nodeId) {
				this.nodeId = nodeId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}
		}

		public static class SlaAlert {

			private String status;

			private String baselineOwner;

			private Long baselineId;

			private String baselineName;

			private Long bizdate;

			private Long projectId;

			private Integer inGroupId;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getBaselineOwner() {
				return this.baselineOwner;
			}

			public void setBaselineOwner(String baselineOwner) {
				this.baselineOwner = baselineOwner;
			}

			public Long getBaselineId() {
				return this.baselineId;
			}

			public void setBaselineId(Long baselineId) {
				this.baselineId = baselineId;
			}

			public String getBaselineName() {
				return this.baselineName;
			}

			public void setBaselineName(String baselineName) {
				this.baselineName = baselineName;
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

			public Integer getInGroupId() {
				return this.inGroupId;
			}

			public void setInGroupId(Integer inGroupId) {
				this.inGroupId = inGroupId;
			}
		}
	}

	@Override
	public GetAlertMessageResponse getInstance(UnmarshallerContext context) {
		return	GetAlertMessageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
