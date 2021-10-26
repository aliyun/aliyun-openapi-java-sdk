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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetTopicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTopicResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private String errorCode;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String owner;

		private String topicName;

		private String baselineStatus;

		private Long projectId;

		private Long nextAlertTime;

		private Long instanceId;

		private Long fixTime;

		private Integer baselineInGroupId;

		private Long baselineBuffer;

		private String topicType;

		private String topicStatus;

		private Long happenTime;

		private Long dealTime;

		private String dealUser;

		private String baselineName;

		private Long baselineId;

		private String nodeName;

		private Long alertTime;

		private Long buffer;

		private String assigner;

		private Long topicId;

		private Long addTime;

		private Long nodeId;

		public String getOwner() {
			return this.owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public String getTopicName() {
			return this.topicName;
		}

		public void setTopicName(String topicName) {
			this.topicName = topicName;
		}

		public String getBaselineStatus() {
			return this.baselineStatus;
		}

		public void setBaselineStatus(String baselineStatus) {
			this.baselineStatus = baselineStatus;
		}

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public Long getNextAlertTime() {
			return this.nextAlertTime;
		}

		public void setNextAlertTime(Long nextAlertTime) {
			this.nextAlertTime = nextAlertTime;
		}

		public Long getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Long instanceId) {
			this.instanceId = instanceId;
		}

		public Long getFixTime() {
			return this.fixTime;
		}

		public void setFixTime(Long fixTime) {
			this.fixTime = fixTime;
		}

		public Integer getBaselineInGroupId() {
			return this.baselineInGroupId;
		}

		public void setBaselineInGroupId(Integer baselineInGroupId) {
			this.baselineInGroupId = baselineInGroupId;
		}

		public Long getBaselineBuffer() {
			return this.baselineBuffer;
		}

		public void setBaselineBuffer(Long baselineBuffer) {
			this.baselineBuffer = baselineBuffer;
		}

		public String getTopicType() {
			return this.topicType;
		}

		public void setTopicType(String topicType) {
			this.topicType = topicType;
		}

		public String getTopicStatus() {
			return this.topicStatus;
		}

		public void setTopicStatus(String topicStatus) {
			this.topicStatus = topicStatus;
		}

		public Long getHappenTime() {
			return this.happenTime;
		}

		public void setHappenTime(Long happenTime) {
			this.happenTime = happenTime;
		}

		public Long getDealTime() {
			return this.dealTime;
		}

		public void setDealTime(Long dealTime) {
			this.dealTime = dealTime;
		}

		public String getDealUser() {
			return this.dealUser;
		}

		public void setDealUser(String dealUser) {
			this.dealUser = dealUser;
		}

		public String getBaselineName() {
			return this.baselineName;
		}

		public void setBaselineName(String baselineName) {
			this.baselineName = baselineName;
		}

		public Long getBaselineId() {
			return this.baselineId;
		}

		public void setBaselineId(Long baselineId) {
			this.baselineId = baselineId;
		}

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public Long getAlertTime() {
			return this.alertTime;
		}

		public void setAlertTime(Long alertTime) {
			this.alertTime = alertTime;
		}

		public Long getBuffer() {
			return this.buffer;
		}

		public void setBuffer(Long buffer) {
			this.buffer = buffer;
		}

		public String getAssigner() {
			return this.assigner;
		}

		public void setAssigner(String assigner) {
			this.assigner = assigner;
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

		public Long getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(Long nodeId) {
			this.nodeId = nodeId;
		}
	}

	@Override
	public GetTopicResponse getInstance(UnmarshallerContext context) {
		return	GetTopicResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
