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

package com.aliyuncs.videosearch.model.v20200225;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.videosearch.transform.v20200225.GetTaskStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskStatusResponse extends AcsResponse {

	private String requestId;

	private Integer data;

	private TaskInfo taskInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getData() {
		return this.data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

	public TaskInfo getTaskInfo() {
		return this.taskInfo;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	public static class TaskInfo {

		private Long analysisUseTime;

		private Float duration;

		private String processResultOss;

		private String resolution;

		private Integer status;

		private Long submitTime;

		private Long finishTime;

		private Long taskId;

		private String errorInfo;

		private Integer storageInfo;

		private String description;

		private String videoId;

		private String videoTags;

		private String videoUrl;

		private String queryTags;

		public Long getAnalysisUseTime() {
			return this.analysisUseTime;
		}

		public void setAnalysisUseTime(Long analysisUseTime) {
			this.analysisUseTime = analysisUseTime;
		}

		public Float getDuration() {
			return this.duration;
		}

		public void setDuration(Float duration) {
			this.duration = duration;
		}

		public String getProcessResultOss() {
			return this.processResultOss;
		}

		public void setProcessResultOss(String processResultOss) {
			this.processResultOss = processResultOss;
		}

		public String getResolution() {
			return this.resolution;
		}

		public void setResolution(String resolution) {
			this.resolution = resolution;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getSubmitTime() {
			return this.submitTime;
		}

		public void setSubmitTime(Long submitTime) {
			this.submitTime = submitTime;
		}

		public Long getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(Long finishTime) {
			this.finishTime = finishTime;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getErrorInfo() {
			return this.errorInfo;
		}

		public void setErrorInfo(String errorInfo) {
			this.errorInfo = errorInfo;
		}

		public Integer getStorageInfo() {
			return this.storageInfo;
		}

		public void setStorageInfo(Integer storageInfo) {
			this.storageInfo = storageInfo;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getVideoTags() {
			return this.videoTags;
		}

		public void setVideoTags(String videoTags) {
			this.videoTags = videoTags;
		}

		public String getVideoUrl() {
			return this.videoUrl;
		}

		public void setVideoUrl(String videoUrl) {
			this.videoUrl = videoUrl;
		}

		public String getQueryTags() {
			return this.queryTags;
		}

		public void setQueryTags(String queryTags) {
			this.queryTags = queryTags;
		}
	}

	@Override
	public GetTaskStatusResponse getInstance(UnmarshallerContext context) {
		return	GetTaskStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
