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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetTrainAlgorithResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTrainAlgorithResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long trainProgress;

		private String deployVersion;

		private Long trainQueueSize;

		private String deployStatus;

		private Long trainEstimateTime;

		private String gmtModified;

		private Long testSampleCount;

		private String noReadyReason;

		private String algorithmName;

		private Long trainSampleCount;

		private String trainStatus;

		private String gmtCreate;

		private String readyTrain;

		private String algorithmType;

		private Float precision;

		private String userId;

		private Float recall;

		private String deleted;

		private String id;

		private List<InstanceListItem> instanceList;

		public Long getTrainProgress() {
			return this.trainProgress;
		}

		public void setTrainProgress(Long trainProgress) {
			this.trainProgress = trainProgress;
		}

		public String getDeployVersion() {
			return this.deployVersion;
		}

		public void setDeployVersion(String deployVersion) {
			this.deployVersion = deployVersion;
		}

		public Long getTrainQueueSize() {
			return this.trainQueueSize;
		}

		public void setTrainQueueSize(Long trainQueueSize) {
			this.trainQueueSize = trainQueueSize;
		}

		public String getDeployStatus() {
			return this.deployStatus;
		}

		public void setDeployStatus(String deployStatus) {
			this.deployStatus = deployStatus;
		}

		public Long getTrainEstimateTime() {
			return this.trainEstimateTime;
		}

		public void setTrainEstimateTime(Long trainEstimateTime) {
			this.trainEstimateTime = trainEstimateTime;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getTestSampleCount() {
			return this.testSampleCount;
		}

		public void setTestSampleCount(Long testSampleCount) {
			this.testSampleCount = testSampleCount;
		}

		public String getNoReadyReason() {
			return this.noReadyReason;
		}

		public void setNoReadyReason(String noReadyReason) {
			this.noReadyReason = noReadyReason;
		}

		public String getAlgorithmName() {
			return this.algorithmName;
		}

		public void setAlgorithmName(String algorithmName) {
			this.algorithmName = algorithmName;
		}

		public Long getTrainSampleCount() {
			return this.trainSampleCount;
		}

		public void setTrainSampleCount(Long trainSampleCount) {
			this.trainSampleCount = trainSampleCount;
		}

		public String getTrainStatus() {
			return this.trainStatus;
		}

		public void setTrainStatus(String trainStatus) {
			this.trainStatus = trainStatus;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getReadyTrain() {
			return this.readyTrain;
		}

		public void setReadyTrain(String readyTrain) {
			this.readyTrain = readyTrain;
		}

		public String getAlgorithmType() {
			return this.algorithmType;
		}

		public void setAlgorithmType(String algorithmType) {
			this.algorithmType = algorithmType;
		}

		public Float getPrecision() {
			return this.precision;
		}

		public void setPrecision(Float precision) {
			this.precision = precision;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Float getRecall() {
			return this.recall;
		}

		public void setRecall(Float recall) {
			this.recall = recall;
		}

		public String getDeleted() {
			return this.deleted;
		}

		public void setDeleted(String deleted) {
			this.deleted = deleted;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public List<InstanceListItem> getInstanceList() {
			return this.instanceList;
		}

		public void setInstanceList(List<InstanceListItem> instanceList) {
			this.instanceList = instanceList;
		}

		public static class InstanceListItem {

			private String instanceName;

			private String instaceId;

			private String projectId;

			public String getInstanceName() {
				return this.instanceName;
			}

			public void setInstanceName(String instanceName) {
				this.instanceName = instanceName;
			}

			public String getInstaceId() {
				return this.instaceId;
			}

			public void setInstaceId(String instaceId) {
				this.instaceId = instaceId;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}
		}
	}

	@Override
	public GetTrainAlgorithResponse getInstance(UnmarshallerContext context) {
		return	GetTrainAlgorithResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
