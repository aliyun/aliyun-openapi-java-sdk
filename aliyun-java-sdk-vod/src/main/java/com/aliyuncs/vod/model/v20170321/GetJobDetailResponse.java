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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetJobDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetJobDetailResponse extends AcsResponse {

	private String requestId;

	private String jobType;

	private TranscodeJobDetail transcodeJobDetail;

	private SnapshotJobDetail snapshotJobDetail;

	private AIJobDetail aIJobDetail;

	private WorkflowTaskDetail workflowTaskDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getJobType() {
		return this.jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public TranscodeJobDetail getTranscodeJobDetail() {
		return this.transcodeJobDetail;
	}

	public void setTranscodeJobDetail(TranscodeJobDetail transcodeJobDetail) {
		this.transcodeJobDetail = transcodeJobDetail;
	}

	public SnapshotJobDetail getSnapshotJobDetail() {
		return this.snapshotJobDetail;
	}

	public void setSnapshotJobDetail(SnapshotJobDetail snapshotJobDetail) {
		this.snapshotJobDetail = snapshotJobDetail;
	}

	public AIJobDetail getAIJobDetail() {
		return this.aIJobDetail;
	}

	public void setAIJobDetail(AIJobDetail aIJobDetail) {
		this.aIJobDetail = aIJobDetail;
	}

	public WorkflowTaskDetail getWorkflowTaskDetail() {
		return this.workflowTaskDetail;
	}

	public void setWorkflowTaskDetail(WorkflowTaskDetail workflowTaskDetail) {
		this.workflowTaskDetail = workflowTaskDetail;
	}

	public static class TranscodeJobDetail {

		private String jobId;

		private Long userId;

		private String videoId;

		private String status;

		private String templateId;

		private String definition;

		private String createTime;

		private String completeTime;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getDefinition() {
			return this.definition;
		}

		public void setDefinition(String definition) {
			this.definition = definition;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}
	}

	public static class SnapshotJobDetail {

		private String jobId;

		private Long userId;

		private String videoId;

		private String status;

		private String trigger;

		private String normalConfig;

		private String spriteConfig;

		private String createTime;

		private String completeTime;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTrigger() {
			return this.trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}

		public String getNormalConfig() {
			return this.normalConfig;
		}

		public void setNormalConfig(String normalConfig) {
			this.normalConfig = normalConfig;
		}

		public String getSpriteConfig() {
			return this.spriteConfig;
		}

		public void setSpriteConfig(String spriteConfig) {
			this.spriteConfig = spriteConfig;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}
	}

	public static class AIJobDetail {

		private String jobId;

		private Long userId;

		private String mediaId;

		private String jobType;

		private String status;

		private String trigger;

		private String templateConfig;

		private String createTime;

		private String completeTime;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getUserId() {
			return this.userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTrigger() {
			return this.trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}

		public String getTemplateConfig() {
			return this.templateConfig;
		}

		public void setTemplateConfig(String templateConfig) {
			this.templateConfig = templateConfig;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}
	}

	public static class WorkflowTaskDetail {

		private String taskId;

		private String status;

		private String taskInput;

		private String createTime;

		private String finishTime;

		private String activityResults;

		private String userData;

		private Workflow workflow;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTaskInput() {
			return this.taskInput;
		}

		public void setTaskInput(String taskInput) {
			this.taskInput = taskInput;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public String getActivityResults() {
			return this.activityResults;
		}

		public void setActivityResults(String activityResults) {
			this.activityResults = activityResults;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public Workflow getWorkflow() {
			return this.workflow;
		}

		public void setWorkflow(Workflow workflow) {
			this.workflow = workflow;
		}

		public static class Workflow {

			private String workflowId;

			private String name;

			private String status;

			private String type;

			private String createTime;

			private String modifiedTime;

			private String appId;

			public String getWorkflowId() {
				return this.workflowId;
			}

			public void setWorkflowId(String workflowId) {
				this.workflowId = workflowId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}
		}
	}

	@Override
	public GetJobDetailResponse getInstance(UnmarshallerContext context) {
		return	GetJobDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
