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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.GetAudioContentInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAudioContentInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer taskType;

		private List<SentenceResult> recognizeDialogue;

		private List<DiffAsrContentInfoItem> diffAsrContentInfo;

		public Integer getTaskType() {
			return this.taskType;
		}

		public void setTaskType(Integer taskType) {
			this.taskType = taskType;
		}

		public List<SentenceResult> getRecognizeDialogue() {
			return this.recognizeDialogue;
		}

		public void setRecognizeDialogue(List<SentenceResult> recognizeDialogue) {
			this.recognizeDialogue = recognizeDialogue;
		}

		public List<DiffAsrContentInfoItem> getDiffAsrContentInfo() {
			return this.diffAsrContentInfo;
		}

		public void setDiffAsrContentInfo(List<DiffAsrContentInfoItem> diffAsrContentInfo) {
			this.diffAsrContentInfo = diffAsrContentInfo;
		}

		public static class SentenceResult {

			private Long beginTime;

			private Integer channelId;

			private Long endTime;

			private String text;

			private Integer emotionValue;

			private Integer silenceDuration;

			private Integer speechRate;

			private String speakerId;

			private String channelKey;

			private String agentId;

			private Integer identificationId;

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}

			public Integer getChannelId() {
				return this.channelId;
			}

			public void setChannelId(Integer channelId) {
				this.channelId = channelId;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Integer getEmotionValue() {
				return this.emotionValue;
			}

			public void setEmotionValue(Integer emotionValue) {
				this.emotionValue = emotionValue;
			}

			public Integer getSilenceDuration() {
				return this.silenceDuration;
			}

			public void setSilenceDuration(Integer silenceDuration) {
				this.silenceDuration = silenceDuration;
			}

			public Integer getSpeechRate() {
				return this.speechRate;
			}

			public void setSpeechRate(Integer speechRate) {
				this.speechRate = speechRate;
			}

			public String getSpeakerId() {
				return this.speakerId;
			}

			public void setSpeakerId(String speakerId) {
				this.speakerId = speakerId;
			}

			public String getChannelKey() {
				return this.channelKey;
			}

			public void setChannelKey(String channelKey) {
				this.channelKey = channelKey;
			}

			public String getAgentId() {
				return this.agentId;
			}

			public void setAgentId(String agentId) {
				this.agentId = agentId;
			}

			public Integer getIdentificationId() {
				return this.identificationId;
			}

			public void setIdentificationId(Integer identificationId) {
				this.identificationId = identificationId;
			}
		}

		public static class DiffAsrContentInfoItem {

			private List<SentenceResult1> ordinaryModelDialogues;

			private List<SentenceResult> customModelDialogues;

			private List<DiffContentHighlightItem> diffContentHighlight;

			public List<SentenceResult1> getOrdinaryModelDialogues() {
				return this.ordinaryModelDialogues;
			}

			public void setOrdinaryModelDialogues(List<SentenceResult1> ordinaryModelDialogues) {
				this.ordinaryModelDialogues = ordinaryModelDialogues;
			}

			public List<SentenceResult> getCustomModelDialogues() {
				return this.customModelDialogues;
			}

			public void setCustomModelDialogues(List<SentenceResult> customModelDialogues) {
				this.customModelDialogues = customModelDialogues;
			}

			public List<DiffContentHighlightItem> getDiffContentHighlight() {
				return this.diffContentHighlight;
			}

			public void setDiffContentHighlight(List<DiffContentHighlightItem> diffContentHighlight) {
				this.diffContentHighlight = diffContentHighlight;
			}

			public static class SentenceResult1 {

				private Long beginTime;

				private Integer channelId;

				private Long endTime;

				private String text;

				private Integer emotionValue;

				private Integer silenceDuration;

				private Integer speechRate;

				private String speakerId;

				private String channelKey;

				private String agentId;

				private Integer identificationId;

				public Long getBeginTime() {
					return this.beginTime;
				}

				public void setBeginTime(Long beginTime) {
					this.beginTime = beginTime;
				}

				public Integer getChannelId() {
					return this.channelId;
				}

				public void setChannelId(Integer channelId) {
					this.channelId = channelId;
				}

				public Long getEndTime() {
					return this.endTime;
				}

				public void setEndTime(Long endTime) {
					this.endTime = endTime;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public Integer getEmotionValue() {
					return this.emotionValue;
				}

				public void setEmotionValue(Integer emotionValue) {
					this.emotionValue = emotionValue;
				}

				public Integer getSilenceDuration() {
					return this.silenceDuration;
				}

				public void setSilenceDuration(Integer silenceDuration) {
					this.silenceDuration = silenceDuration;
				}

				public Integer getSpeechRate() {
					return this.speechRate;
				}

				public void setSpeechRate(Integer speechRate) {
					this.speechRate = speechRate;
				}

				public String getSpeakerId() {
					return this.speakerId;
				}

				public void setSpeakerId(String speakerId) {
					this.speakerId = speakerId;
				}

				public String getChannelKey() {
					return this.channelKey;
				}

				public void setChannelKey(String channelKey) {
					this.channelKey = channelKey;
				}

				public String getAgentId() {
					return this.agentId;
				}

				public void setAgentId(String agentId) {
					this.agentId = agentId;
				}

				public Integer getIdentificationId() {
					return this.identificationId;
				}

				public void setIdentificationId(Integer identificationId) {
					this.identificationId = identificationId;
				}
			}

			public static class DiffContentHighlightItem {

				private String ordinaryModelContent;

				private String customModelContent;

				private String identificationId;

				private List<DiffContentPositionItem> diffContentPosition;

				public String getOrdinaryModelContent() {
					return this.ordinaryModelContent;
				}

				public void setOrdinaryModelContent(String ordinaryModelContent) {
					this.ordinaryModelContent = ordinaryModelContent;
				}

				public String getCustomModelContent() {
					return this.customModelContent;
				}

				public void setCustomModelContent(String customModelContent) {
					this.customModelContent = customModelContent;
				}

				public String getIdentificationId() {
					return this.identificationId;
				}

				public void setIdentificationId(String identificationId) {
					this.identificationId = identificationId;
				}

				public List<DiffContentPositionItem> getDiffContentPosition() {
					return this.diffContentPosition;
				}

				public void setDiffContentPosition(List<DiffContentPositionItem> diffContentPosition) {
					this.diffContentPosition = diffContentPosition;
				}

				public static class DiffContentPositionItem {

					private Integer ordinaryModelfrom;

					private Integer ordinaryModelto;

					private String ordinaryModelKeyWord;

					private Integer customModelModelfrom;

					private Integer customModelModelto;

					private String customModellKeyWord;

					public Integer getOrdinaryModelfrom() {
						return this.ordinaryModelfrom;
					}

					public void setOrdinaryModelfrom(Integer ordinaryModelfrom) {
						this.ordinaryModelfrom = ordinaryModelfrom;
					}

					public Integer getOrdinaryModelto() {
						return this.ordinaryModelto;
					}

					public void setOrdinaryModelto(Integer ordinaryModelto) {
						this.ordinaryModelto = ordinaryModelto;
					}

					public String getOrdinaryModelKeyWord() {
						return this.ordinaryModelKeyWord;
					}

					public void setOrdinaryModelKeyWord(String ordinaryModelKeyWord) {
						this.ordinaryModelKeyWord = ordinaryModelKeyWord;
					}

					public Integer getCustomModelModelfrom() {
						return this.customModelModelfrom;
					}

					public void setCustomModelModelfrom(Integer customModelModelfrom) {
						this.customModelModelfrom = customModelModelfrom;
					}

					public Integer getCustomModelModelto() {
						return this.customModelModelto;
					}

					public void setCustomModelModelto(Integer customModelModelto) {
						this.customModelModelto = customModelModelto;
					}

					public String getCustomModellKeyWord() {
						return this.customModellKeyWord;
					}

					public void setCustomModellKeyWord(String customModellKeyWord) {
						this.customModellKeyWord = customModellKeyWord;
					}
				}
			}
		}
	}

	@Override
	public GetAudioContentInfoResponse getInstance(UnmarshallerContext context) {
		return	GetAudioContentInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
