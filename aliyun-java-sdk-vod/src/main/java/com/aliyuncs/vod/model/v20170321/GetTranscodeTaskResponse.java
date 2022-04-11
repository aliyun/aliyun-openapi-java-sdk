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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetTranscodeTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTranscodeTaskResponse extends AcsResponse {

	private String requestId;

	private TranscodeTask transcodeTask;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TranscodeTask getTranscodeTask() {
		return this.transcodeTask;
	}

	public void setTranscodeTask(TranscodeTask transcodeTask) {
		this.transcodeTask = transcodeTask;
	}

	public static class TranscodeTask {

		private String creationTime;

		private String trigger;

		private String taskStatus;

		private String videoId;

		private String completeTime;

		private String transcodeTemplateGroupId;

		private String transcodeTaskId;

		private List<TranscodeJobInfo> transcodeJobInfoList;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getTrigger() {
			return this.trigger;
		}

		public void setTrigger(String trigger) {
			this.trigger = trigger;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getVideoId() {
			return this.videoId;
		}

		public void setVideoId(String videoId) {
			this.videoId = videoId;
		}

		public String getCompleteTime() {
			return this.completeTime;
		}

		public void setCompleteTime(String completeTime) {
			this.completeTime = completeTime;
		}

		public String getTranscodeTemplateGroupId() {
			return this.transcodeTemplateGroupId;
		}

		public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
			this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		}

		public String getTranscodeTaskId() {
			return this.transcodeTaskId;
		}

		public void setTranscodeTaskId(String transcodeTaskId) {
			this.transcodeTaskId = transcodeTaskId;
		}

		public List<TranscodeJobInfo> getTranscodeJobInfoList() {
			return this.transcodeJobInfoList;
		}

		public void setTranscodeJobInfoList(List<TranscodeJobInfo> transcodeJobInfoList) {
			this.transcodeJobInfoList = transcodeJobInfoList;
		}

		public static class TranscodeJobInfo {

			private String definition;

			private String creationTime;

			private String inputFileUrl;

			private String errorMessage;

			private String errorCode;

			private String completeTime;

			private Long transcodeProgress;

			private String priority;

			private String transcodeJobStatus;

			private String transcodeTemplateId;

			private String transcodeJobId;

			private OutputFile outputFile;

			public String getDefinition() {
				return this.definition;
			}

			public void setDefinition(String definition) {
				this.definition = definition;
			}

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getInputFileUrl() {
				return this.inputFileUrl;
			}

			public void setInputFileUrl(String inputFileUrl) {
				this.inputFileUrl = inputFileUrl;
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

			public String getCompleteTime() {
				return this.completeTime;
			}

			public void setCompleteTime(String completeTime) {
				this.completeTime = completeTime;
			}

			public Long getTranscodeProgress() {
				return this.transcodeProgress;
			}

			public void setTranscodeProgress(Long transcodeProgress) {
				this.transcodeProgress = transcodeProgress;
			}

			public String getPriority() {
				return this.priority;
			}

			public void setPriority(String priority) {
				this.priority = priority;
			}

			public String getTranscodeJobStatus() {
				return this.transcodeJobStatus;
			}

			public void setTranscodeJobStatus(String transcodeJobStatus) {
				this.transcodeJobStatus = transcodeJobStatus;
			}

			public String getTranscodeTemplateId() {
				return this.transcodeTemplateId;
			}

			public void setTranscodeTemplateId(String transcodeTemplateId) {
				this.transcodeTemplateId = transcodeTemplateId;
			}

			public String getTranscodeJobId() {
				return this.transcodeJobId;
			}

			public void setTranscodeJobId(String transcodeJobId) {
				this.transcodeJobId = transcodeJobId;
			}

			public OutputFile getOutputFile() {
				return this.outputFile;
			}

			public void setOutputFile(OutputFile outputFile) {
				this.outputFile = outputFile;
			}

			public static class OutputFile {

				private String videoStreamList;

				private String outputFileUrl;

				private String encryption;

				private String height;

				private String subtitleStreamList;

				private String bitrate;

				private String audioStreamList;

				private String width;

				private String fps;

				private String duration;

				private String format;

				private Long filesize;

				private List<String> watermarkIdList;

				public String getVideoStreamList() {
					return this.videoStreamList;
				}

				public void setVideoStreamList(String videoStreamList) {
					this.videoStreamList = videoStreamList;
				}

				public String getOutputFileUrl() {
					return this.outputFileUrl;
				}

				public void setOutputFileUrl(String outputFileUrl) {
					this.outputFileUrl = outputFileUrl;
				}

				public String getEncryption() {
					return this.encryption;
				}

				public void setEncryption(String encryption) {
					this.encryption = encryption;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}

				public String getSubtitleStreamList() {
					return this.subtitleStreamList;
				}

				public void setSubtitleStreamList(String subtitleStreamList) {
					this.subtitleStreamList = subtitleStreamList;
				}

				public String getBitrate() {
					return this.bitrate;
				}

				public void setBitrate(String bitrate) {
					this.bitrate = bitrate;
				}

				public String getAudioStreamList() {
					return this.audioStreamList;
				}

				public void setAudioStreamList(String audioStreamList) {
					this.audioStreamList = audioStreamList;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getFps() {
					return this.fps;
				}

				public void setFps(String fps) {
					this.fps = fps;
				}

				public String getDuration() {
					return this.duration;
				}

				public void setDuration(String duration) {
					this.duration = duration;
				}

				public String getFormat() {
					return this.format;
				}

				public void setFormat(String format) {
					this.format = format;
				}

				public Long getFilesize() {
					return this.filesize;
				}

				public void setFilesize(Long filesize) {
					this.filesize = filesize;
				}

				public List<String> getWatermarkIdList() {
					return this.watermarkIdList;
				}

				public void setWatermarkIdList(List<String> watermarkIdList) {
					this.watermarkIdList = watermarkIdList;
				}
			}
		}
	}

	@Override
	public GetTranscodeTaskResponse getInstance(UnmarshallerContext context) {
		return	GetTranscodeTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
