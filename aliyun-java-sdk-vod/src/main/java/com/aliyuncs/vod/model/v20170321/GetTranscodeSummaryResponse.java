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
import com.aliyuncs.vod.transform.v20170321.GetTranscodeSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTranscodeSummaryResponse extends AcsResponse {

	private String requestId;

	private List<TranscodeSummary> transcodeSummaryList;

	private List<String> nonExistVideoIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TranscodeSummary> getTranscodeSummaryList() {
		return this.transcodeSummaryList;
	}

	public void setTranscodeSummaryList(List<TranscodeSummary> transcodeSummaryList) {
		this.transcodeSummaryList = transcodeSummaryList;
	}

	public List<String> getNonExistVideoIds() {
		return this.nonExistVideoIds;
	}

	public void setNonExistVideoIds(List<String> nonExistVideoIds) {
		this.nonExistVideoIds = nonExistVideoIds;
	}

	public static class TranscodeSummary {

		private String creationTime;

		private String trigger;

		private String videoId;

		private String completeTime;

		private String transcodeStatus;

		private String transcodeTemplateGroupId;

		private List<TranscodeJobInfoSummary> transcodeJobInfoSummaryList;

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

		public String getTranscodeStatus() {
			return this.transcodeStatus;
		}

		public void setTranscodeStatus(String transcodeStatus) {
			this.transcodeStatus = transcodeStatus;
		}

		public String getTranscodeTemplateGroupId() {
			return this.transcodeTemplateGroupId;
		}

		public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
			this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		}

		public List<TranscodeJobInfoSummary> getTranscodeJobInfoSummaryList() {
			return this.transcodeJobInfoSummaryList;
		}

		public void setTranscodeJobInfoSummaryList(List<TranscodeJobInfoSummary> transcodeJobInfoSummaryList) {
			this.transcodeJobInfoSummaryList = transcodeJobInfoSummaryList;
		}

		public static class TranscodeJobInfoSummary {

			private String creationTime;

			private String errorMessage;

			private String encryption;

			private String height;

			private Long transcodeProgress;

			private String transcodeTemplateId;

			private String bitrate;

			private String definition;

			private String errorCode;

			private String completeTime;

			private String width;

			private String duration;

			private String fps;

			private String transcodeJobStatus;

			private Long filesize;

			private String format;

			private List<String> watermarkIdList;

			public String getCreationTime() {
				return this.creationTime;
			}

			public void setCreationTime(String creationTime) {
				this.creationTime = creationTime;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
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

			public Long getTranscodeProgress() {
				return this.transcodeProgress;
			}

			public void setTranscodeProgress(Long transcodeProgress) {
				this.transcodeProgress = transcodeProgress;
			}

			public String getTranscodeTemplateId() {
				return this.transcodeTemplateId;
			}

			public void setTranscodeTemplateId(String transcodeTemplateId) {
				this.transcodeTemplateId = transcodeTemplateId;
			}

			public String getBitrate() {
				return this.bitrate;
			}

			public void setBitrate(String bitrate) {
				this.bitrate = bitrate;
			}

			public String getDefinition() {
				return this.definition;
			}

			public void setDefinition(String definition) {
				this.definition = definition;
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

			public String getWidth() {
				return this.width;
			}

			public void setWidth(String width) {
				this.width = width;
			}

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public String getFps() {
				return this.fps;
			}

			public void setFps(String fps) {
				this.fps = fps;
			}

			public String getTranscodeJobStatus() {
				return this.transcodeJobStatus;
			}

			public void setTranscodeJobStatus(String transcodeJobStatus) {
				this.transcodeJobStatus = transcodeJobStatus;
			}

			public Long getFilesize() {
				return this.filesize;
			}

			public void setFilesize(Long filesize) {
				this.filesize = filesize;
			}

			public String getFormat() {
				return this.format;
			}

			public void setFormat(String format) {
				this.format = format;
			}

			public List<String> getWatermarkIdList() {
				return this.watermarkIdList;
			}

			public void setWatermarkIdList(List<String> watermarkIdList) {
				this.watermarkIdList = watermarkIdList;
			}
		}
	}

	@Override
	public GetTranscodeSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetTranscodeSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
