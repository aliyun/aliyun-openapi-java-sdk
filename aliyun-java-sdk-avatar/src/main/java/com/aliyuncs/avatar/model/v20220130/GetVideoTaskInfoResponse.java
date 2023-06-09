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

package com.aliyuncs.avatar.model.v20220130;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.avatar.transform.v20220130.GetVideoTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVideoTaskInfoResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private String taskUuid;

		private String type;

		private String status;

		private String process;

		private TaskResult taskResult;

		public String getTaskUuid() {
			return this.taskUuid;
		}

		public void setTaskUuid(String taskUuid) {
			this.taskUuid = taskUuid;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProcess() {
			return this.process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public TaskResult getTaskResult() {
			return this.taskResult;
		}

		public void setTaskResult(TaskResult taskResult) {
			this.taskResult = taskResult;
		}

		public static class TaskResult {

			private String videoUrl;

			private String subtitlesUrl;

			private String wordSubtitlesUrl;

			private String failReason;

			private String failCode;

			private Integer videoDuration;

			public String getVideoUrl() {
				return this.videoUrl;
			}

			public void setVideoUrl(String videoUrl) {
				this.videoUrl = videoUrl;
			}

			public String getSubtitlesUrl() {
				return this.subtitlesUrl;
			}

			public void setSubtitlesUrl(String subtitlesUrl) {
				this.subtitlesUrl = subtitlesUrl;
			}

			public String getWordSubtitlesUrl() {
				return this.wordSubtitlesUrl;
			}

			public void setWordSubtitlesUrl(String wordSubtitlesUrl) {
				this.wordSubtitlesUrl = wordSubtitlesUrl;
			}

			public String getFailReason() {
				return this.failReason;
			}

			public void setFailReason(String failReason) {
				this.failReason = failReason;
			}

			public String getFailCode() {
				return this.failCode;
			}

			public void setFailCode(String failCode) {
				this.failCode = failCode;
			}

			public Integer getVideoDuration() {
				return this.videoDuration;
			}

			public void setVideoDuration(Integer videoDuration) {
				this.videoDuration = videoDuration;
			}
		}
	}

	@Override
	public GetVideoTaskInfoResponse getInstance(UnmarshallerContext context) {
		return	GetVideoTaskInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
