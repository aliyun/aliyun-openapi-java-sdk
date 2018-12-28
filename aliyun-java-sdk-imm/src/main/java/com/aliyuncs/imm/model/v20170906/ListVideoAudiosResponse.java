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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.ListVideoAudiosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVideoAudiosResponse extends AcsResponse {

	private String setId;

	private String videoUri;

	private String nextMarker;

	private String requestId;

	private List<AudiosItem> audios;

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getVideoUri() {
		return this.videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AudiosItem> getAudios() {
		return this.audios;
	}

	public void setAudios(List<AudiosItem> audios) {
		this.audios = audios;
	}

	public static class AudiosItem {

		private Float audioDuration;

		private String audioUri;

		private Integer audioRate;

		private String sourceType;

		private String modifyTime;

		private Integer fileSize;

		private String sourceUri;

		private String createTime;

		private String remarksA;

		private String remarksB;

		private String audioTextsStatus;

		private String audioTextsModifyTime;

		private String processModifyTime;

		private String processStatus;

		private String sourcePosition;

		private String audioFormat;

		private String audioTextsFailReason;

		private String processFailReason;

		private List<AudioTextsItem> audioTexts;

		public Float getAudioDuration() {
			return this.audioDuration;
		}

		public void setAudioDuration(Float audioDuration) {
			this.audioDuration = audioDuration;
		}

		public String getAudioUri() {
			return this.audioUri;
		}

		public void setAudioUri(String audioUri) {
			this.audioUri = audioUri;
		}

		public Integer getAudioRate() {
			return this.audioRate;
		}

		public void setAudioRate(Integer audioRate) {
			this.audioRate = audioRate;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Integer getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Integer fileSize) {
			this.fileSize = fileSize;
		}

		public String getSourceUri() {
			return this.sourceUri;
		}

		public void setSourceUri(String sourceUri) {
			this.sourceUri = sourceUri;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getRemarksA() {
			return this.remarksA;
		}

		public void setRemarksA(String remarksA) {
			this.remarksA = remarksA;
		}

		public String getRemarksB() {
			return this.remarksB;
		}

		public void setRemarksB(String remarksB) {
			this.remarksB = remarksB;
		}

		public String getAudioTextsStatus() {
			return this.audioTextsStatus;
		}

		public void setAudioTextsStatus(String audioTextsStatus) {
			this.audioTextsStatus = audioTextsStatus;
		}

		public String getAudioTextsModifyTime() {
			return this.audioTextsModifyTime;
		}

		public void setAudioTextsModifyTime(String audioTextsModifyTime) {
			this.audioTextsModifyTime = audioTextsModifyTime;
		}

		public String getProcessModifyTime() {
			return this.processModifyTime;
		}

		public void setProcessModifyTime(String processModifyTime) {
			this.processModifyTime = processModifyTime;
		}

		public String getProcessStatus() {
			return this.processStatus;
		}

		public void setProcessStatus(String processStatus) {
			this.processStatus = processStatus;
		}

		public String getSourcePosition() {
			return this.sourcePosition;
		}

		public void setSourcePosition(String sourcePosition) {
			this.sourcePosition = sourcePosition;
		}

		public String getAudioFormat() {
			return this.audioFormat;
		}

		public void setAudioFormat(String audioFormat) {
			this.audioFormat = audioFormat;
		}

		public String getAudioTextsFailReason() {
			return this.audioTextsFailReason;
		}

		public void setAudioTextsFailReason(String audioTextsFailReason) {
			this.audioTextsFailReason = audioTextsFailReason;
		}

		public String getProcessFailReason() {
			return this.processFailReason;
		}

		public void setProcessFailReason(String processFailReason) {
			this.processFailReason = processFailReason;
		}

		public List<AudioTextsItem> getAudioTexts() {
			return this.audioTexts;
		}

		public void setAudioTexts(List<AudioTextsItem> audioTexts) {
			this.audioTexts = audioTexts;
		}

		public static class AudioTextsItem {

			private String text;

			private Float beginTime;

			private Float endTime;

			private Float silenceDuration;

			private Float emotionValue;

			private Integer channelId;

			private Integer speechRate;

			private Float confidence;

			private String person;

			private String library;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Float getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Float beginTime) {
				this.beginTime = beginTime;
			}

			public Float getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Float endTime) {
				this.endTime = endTime;
			}

			public Float getSilenceDuration() {
				return this.silenceDuration;
			}

			public void setSilenceDuration(Float silenceDuration) {
				this.silenceDuration = silenceDuration;
			}

			public Float getEmotionValue() {
				return this.emotionValue;
			}

			public void setEmotionValue(Float emotionValue) {
				this.emotionValue = emotionValue;
			}

			public Integer getChannelId() {
				return this.channelId;
			}

			public void setChannelId(Integer channelId) {
				this.channelId = channelId;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public Float getConfidence() {
				return this.confidence;
			}

			public void setConfidence(Float confidence) {
				this.confidence = confidence;
			}

			public String getPerson() {
				return this.person;
			}

			public void setPerson(String person) {
				this.person = person;
			}

			public String getLibrary() {
				return this.library;
			}

			public void setLibrary(String library) {
				this.library = library;
			}
		}
	}

	@Override
	public ListVideoAudiosResponse getInstance(UnmarshallerContext context) {
		return	ListVideoAudiosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
