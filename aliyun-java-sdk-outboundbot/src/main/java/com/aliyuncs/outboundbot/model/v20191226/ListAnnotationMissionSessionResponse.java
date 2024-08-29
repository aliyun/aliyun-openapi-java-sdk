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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListAnnotationMissionSessionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAnnotationMissionSessionResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String annotationMissionId;

		private Boolean success;

		private String message;

		private Long totalCount;

		private List<AnnotationMissionSessionListItem> annotationMissionSessionList;

		public String getAnnotationMissionId() {
			return this.annotationMissionId;
		}

		public void setAnnotationMissionId(String annotationMissionId) {
			this.annotationMissionId = annotationMissionId;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<AnnotationMissionSessionListItem> getAnnotationMissionSessionList() {
			return this.annotationMissionSessionList;
		}

		public void setAnnotationMissionSessionList(List<AnnotationMissionSessionListItem> annotationMissionSessionList) {
			this.annotationMissionSessionList = annotationMissionSessionList;
		}

		public static class AnnotationMissionSessionListItem {

			private String annotationMissionSessionId;

			private Long createTime;

			private Long modifiedTime;

			private String annotationMissionId;

			private String instanceId;

			private String scriptId;

			private String jobGroupId;

			private String jobId;

			private String sessionId;

			private Integer annotationStatus;

			private Integer version;

			private Boolean debugConversation;

			private List<AnnotationMissionChatListItem> annotationMissionChatList;

			public String getAnnotationMissionSessionId() {
				return this.annotationMissionSessionId;
			}

			public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
				this.annotationMissionSessionId = annotationMissionSessionId;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public Long getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(Long modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getAnnotationMissionId() {
				return this.annotationMissionId;
			}

			public void setAnnotationMissionId(String annotationMissionId) {
				this.annotationMissionId = annotationMissionId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getScriptId() {
				return this.scriptId;
			}

			public void setScriptId(String scriptId) {
				this.scriptId = scriptId;
			}

			public String getJobGroupId() {
				return this.jobGroupId;
			}

			public void setJobGroupId(String jobGroupId) {
				this.jobGroupId = jobGroupId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getSessionId() {
				return this.sessionId;
			}

			public void setSessionId(String sessionId) {
				this.sessionId = sessionId;
			}

			public Integer getAnnotationStatus() {
				return this.annotationStatus;
			}

			public void setAnnotationStatus(Integer annotationStatus) {
				this.annotationStatus = annotationStatus;
			}

			public Integer getVersion() {
				return this.version;
			}

			public void setVersion(Integer version) {
				this.version = version;
			}

			public Boolean getDebugConversation() {
				return this.debugConversation;
			}

			public void setDebugConversation(Boolean debugConversation) {
				this.debugConversation = debugConversation;
			}

			public List<AnnotationMissionChatListItem> getAnnotationMissionChatList() {
				return this.annotationMissionChatList;
			}

			public void setAnnotationMissionChatList(List<AnnotationMissionChatListItem> annotationMissionChatList) {
				this.annotationMissionChatList = annotationMissionChatList;
			}

			public static class AnnotationMissionChatListItem {

				private String annotationMissionChatId;

				private Long createTime;

				private Long modifiedTime;

				private String annotationMissionId;

				private String annotationMissionSessionId;

				private String instanceId;

				private String sequenceId;

				private Long occurTime;

				private String answer;

				private Integer annotationStatus;

				private Integer intentAnnotationStatus;

				private Integer asrAnnotationStatus;

				private Integer tagAnnotationStatus;

				private Integer subStatus;

				private Integer translationError;

				private String annotationAsrResult;

				private String originalAsrResult;

				private List<AnnotationMissionChatIntentUserSayInfoListItem> annotationMissionChatIntentUserSayInfoList;

				private List<AnnotationMissionChatVocabularyInfoListItem> annotationMissionChatVocabularyInfoList;

				private List<AnnotationMissionChatCustomizationDataInfoListItem> annotationMissionChatCustomizationDataInfoList;

				private List<AnnotationMissionChatTagInfoListItem> annotationMissionChatTagInfoList;

				public String getAnnotationMissionChatId() {
					return this.annotationMissionChatId;
				}

				public void setAnnotationMissionChatId(String annotationMissionChatId) {
					this.annotationMissionChatId = annotationMissionChatId;
				}

				public Long getCreateTime() {
					return this.createTime;
				}

				public void setCreateTime(Long createTime) {
					this.createTime = createTime;
				}

				public Long getModifiedTime() {
					return this.modifiedTime;
				}

				public void setModifiedTime(Long modifiedTime) {
					this.modifiedTime = modifiedTime;
				}

				public String getAnnotationMissionId() {
					return this.annotationMissionId;
				}

				public void setAnnotationMissionId(String annotationMissionId) {
					this.annotationMissionId = annotationMissionId;
				}

				public String getAnnotationMissionSessionId() {
					return this.annotationMissionSessionId;
				}

				public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
					this.annotationMissionSessionId = annotationMissionSessionId;
				}

				public String getInstanceId() {
					return this.instanceId;
				}

				public void setInstanceId(String instanceId) {
					this.instanceId = instanceId;
				}

				public String getSequenceId() {
					return this.sequenceId;
				}

				public void setSequenceId(String sequenceId) {
					this.sequenceId = sequenceId;
				}

				public Long getOccurTime() {
					return this.occurTime;
				}

				public void setOccurTime(Long occurTime) {
					this.occurTime = occurTime;
				}

				public String getAnswer() {
					return this.answer;
				}

				public void setAnswer(String answer) {
					this.answer = answer;
				}

				public Integer getAnnotationStatus() {
					return this.annotationStatus;
				}

				public void setAnnotationStatus(Integer annotationStatus) {
					this.annotationStatus = annotationStatus;
				}

				public Integer getIntentAnnotationStatus() {
					return this.intentAnnotationStatus;
				}

				public void setIntentAnnotationStatus(Integer intentAnnotationStatus) {
					this.intentAnnotationStatus = intentAnnotationStatus;
				}

				public Integer getAsrAnnotationStatus() {
					return this.asrAnnotationStatus;
				}

				public void setAsrAnnotationStatus(Integer asrAnnotationStatus) {
					this.asrAnnotationStatus = asrAnnotationStatus;
				}

				public Integer getTagAnnotationStatus() {
					return this.tagAnnotationStatus;
				}

				public void setTagAnnotationStatus(Integer tagAnnotationStatus) {
					this.tagAnnotationStatus = tagAnnotationStatus;
				}

				public Integer getSubStatus() {
					return this.subStatus;
				}

				public void setSubStatus(Integer subStatus) {
					this.subStatus = subStatus;
				}

				public Integer getTranslationError() {
					return this.translationError;
				}

				public void setTranslationError(Integer translationError) {
					this.translationError = translationError;
				}

				public String getAnnotationAsrResult() {
					return this.annotationAsrResult;
				}

				public void setAnnotationAsrResult(String annotationAsrResult) {
					this.annotationAsrResult = annotationAsrResult;
				}

				public String getOriginalAsrResult() {
					return this.originalAsrResult;
				}

				public void setOriginalAsrResult(String originalAsrResult) {
					this.originalAsrResult = originalAsrResult;
				}

				public List<AnnotationMissionChatIntentUserSayInfoListItem> getAnnotationMissionChatIntentUserSayInfoList() {
					return this.annotationMissionChatIntentUserSayInfoList;
				}

				public void setAnnotationMissionChatIntentUserSayInfoList(List<AnnotationMissionChatIntentUserSayInfoListItem> annotationMissionChatIntentUserSayInfoList) {
					this.annotationMissionChatIntentUserSayInfoList = annotationMissionChatIntentUserSayInfoList;
				}

				public List<AnnotationMissionChatVocabularyInfoListItem> getAnnotationMissionChatVocabularyInfoList() {
					return this.annotationMissionChatVocabularyInfoList;
				}

				public void setAnnotationMissionChatVocabularyInfoList(List<AnnotationMissionChatVocabularyInfoListItem> annotationMissionChatVocabularyInfoList) {
					this.annotationMissionChatVocabularyInfoList = annotationMissionChatVocabularyInfoList;
				}

				public List<AnnotationMissionChatCustomizationDataInfoListItem> getAnnotationMissionChatCustomizationDataInfoList() {
					return this.annotationMissionChatCustomizationDataInfoList;
				}

				public void setAnnotationMissionChatCustomizationDataInfoList(List<AnnotationMissionChatCustomizationDataInfoListItem> annotationMissionChatCustomizationDataInfoList) {
					this.annotationMissionChatCustomizationDataInfoList = annotationMissionChatCustomizationDataInfoList;
				}

				public List<AnnotationMissionChatTagInfoListItem> getAnnotationMissionChatTagInfoList() {
					return this.annotationMissionChatTagInfoList;
				}

				public void setAnnotationMissionChatTagInfoList(List<AnnotationMissionChatTagInfoListItem> annotationMissionChatTagInfoList) {
					this.annotationMissionChatTagInfoList = annotationMissionChatTagInfoList;
				}

				public static class AnnotationMissionChatIntentUserSayInfoListItem {

					private String annotationMissionChatIntentUserSayInfoId;

					private Long createTime;

					private Long modifiedTime;

					private String instanceId;

					private String annotationMissionId;

					private String annotationMissionSessionId;

					private String annotationMissionChatId;

					private String content;

					private Long intentId;

					private Long dialogId;

					private String botId;

					private Boolean delete;

					private Boolean create;

					public String getAnnotationMissionChatIntentUserSayInfoId() {
						return this.annotationMissionChatIntentUserSayInfoId;
					}

					public void setAnnotationMissionChatIntentUserSayInfoId(String annotationMissionChatIntentUserSayInfoId) {
						this.annotationMissionChatIntentUserSayInfoId = annotationMissionChatIntentUserSayInfoId;
					}

					public Long getCreateTime() {
						return this.createTime;
					}

					public void setCreateTime(Long createTime) {
						this.createTime = createTime;
					}

					public Long getModifiedTime() {
						return this.modifiedTime;
					}

					public void setModifiedTime(Long modifiedTime) {
						this.modifiedTime = modifiedTime;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getAnnotationMissionId() {
						return this.annotationMissionId;
					}

					public void setAnnotationMissionId(String annotationMissionId) {
						this.annotationMissionId = annotationMissionId;
					}

					public String getAnnotationMissionSessionId() {
						return this.annotationMissionSessionId;
					}

					public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
						this.annotationMissionSessionId = annotationMissionSessionId;
					}

					public String getAnnotationMissionChatId() {
						return this.annotationMissionChatId;
					}

					public void setAnnotationMissionChatId(String annotationMissionChatId) {
						this.annotationMissionChatId = annotationMissionChatId;
					}

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}

					public Long getIntentId() {
						return this.intentId;
					}

					public void setIntentId(Long intentId) {
						this.intentId = intentId;
					}

					public Long getDialogId() {
						return this.dialogId;
					}

					public void setDialogId(Long dialogId) {
						this.dialogId = dialogId;
					}

					public String getBotId() {
						return this.botId;
					}

					public void setBotId(String botId) {
						this.botId = botId;
					}

					public Boolean getDelete() {
						return this.delete;
					}

					public void setDelete(Boolean delete) {
						this.delete = delete;
					}

					public Boolean getCreate() {
						return this.create;
					}

					public void setCreate(Boolean create) {
						this.create = create;
					}
				}

				public static class AnnotationMissionChatVocabularyInfoListItem {

					private String annotationMissionChatVocabularyInfoId;

					private Long createTime;

					private Long modifiedTime;

					private String instanceId;

					private String annotationMissionId;

					private String annotationMissionSessionId;

					private String annotationMissionChatId;

					private String vocabularyId;

					private String vocabulary;

					private String vocabularyName;

					private String vocabularyDescription;

					private Integer vocabularyWeight;

					private Boolean delete;

					private Boolean create;

					public String getAnnotationMissionChatVocabularyInfoId() {
						return this.annotationMissionChatVocabularyInfoId;
					}

					public void setAnnotationMissionChatVocabularyInfoId(String annotationMissionChatVocabularyInfoId) {
						this.annotationMissionChatVocabularyInfoId = annotationMissionChatVocabularyInfoId;
					}

					public Long getCreateTime() {
						return this.createTime;
					}

					public void setCreateTime(Long createTime) {
						this.createTime = createTime;
					}

					public Long getModifiedTime() {
						return this.modifiedTime;
					}

					public void setModifiedTime(Long modifiedTime) {
						this.modifiedTime = modifiedTime;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getAnnotationMissionId() {
						return this.annotationMissionId;
					}

					public void setAnnotationMissionId(String annotationMissionId) {
						this.annotationMissionId = annotationMissionId;
					}

					public String getAnnotationMissionSessionId() {
						return this.annotationMissionSessionId;
					}

					public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
						this.annotationMissionSessionId = annotationMissionSessionId;
					}

					public String getAnnotationMissionChatId() {
						return this.annotationMissionChatId;
					}

					public void setAnnotationMissionChatId(String annotationMissionChatId) {
						this.annotationMissionChatId = annotationMissionChatId;
					}

					public String getVocabularyId() {
						return this.vocabularyId;
					}

					public void setVocabularyId(String vocabularyId) {
						this.vocabularyId = vocabularyId;
					}

					public String getVocabulary() {
						return this.vocabulary;
					}

					public void setVocabulary(String vocabulary) {
						this.vocabulary = vocabulary;
					}

					public String getVocabularyName() {
						return this.vocabularyName;
					}

					public void setVocabularyName(String vocabularyName) {
						this.vocabularyName = vocabularyName;
					}

					public String getVocabularyDescription() {
						return this.vocabularyDescription;
					}

					public void setVocabularyDescription(String vocabularyDescription) {
						this.vocabularyDescription = vocabularyDescription;
					}

					public Integer getVocabularyWeight() {
						return this.vocabularyWeight;
					}

					public void setVocabularyWeight(Integer vocabularyWeight) {
						this.vocabularyWeight = vocabularyWeight;
					}

					public Boolean getDelete() {
						return this.delete;
					}

					public void setDelete(Boolean delete) {
						this.delete = delete;
					}

					public Boolean getCreate() {
						return this.create;
					}

					public void setCreate(Boolean create) {
						this.create = create;
					}
				}

				public static class AnnotationMissionChatCustomizationDataInfoListItem {

					private String annotationMissionChatCustomizationDataInfoId;

					private Long createTime;

					private Long modifiedTime;

					private String instanceId;

					private String annotationMissionId;

					private String annotationMissionSessionId;

					private String annotationMissionChatId;

					private String customizationDataId;

					private String content;

					private String customizationDataName;

					private String customizationDataDescription;

					private Integer customizationDataWeight;

					private Boolean delete;

					private Boolean create;

					public String getAnnotationMissionChatCustomizationDataInfoId() {
						return this.annotationMissionChatCustomizationDataInfoId;
					}

					public void setAnnotationMissionChatCustomizationDataInfoId(String annotationMissionChatCustomizationDataInfoId) {
						this.annotationMissionChatCustomizationDataInfoId = annotationMissionChatCustomizationDataInfoId;
					}

					public Long getCreateTime() {
						return this.createTime;
					}

					public void setCreateTime(Long createTime) {
						this.createTime = createTime;
					}

					public Long getModifiedTime() {
						return this.modifiedTime;
					}

					public void setModifiedTime(Long modifiedTime) {
						this.modifiedTime = modifiedTime;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getAnnotationMissionId() {
						return this.annotationMissionId;
					}

					public void setAnnotationMissionId(String annotationMissionId) {
						this.annotationMissionId = annotationMissionId;
					}

					public String getAnnotationMissionSessionId() {
						return this.annotationMissionSessionId;
					}

					public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
						this.annotationMissionSessionId = annotationMissionSessionId;
					}

					public String getAnnotationMissionChatId() {
						return this.annotationMissionChatId;
					}

					public void setAnnotationMissionChatId(String annotationMissionChatId) {
						this.annotationMissionChatId = annotationMissionChatId;
					}

					public String getCustomizationDataId() {
						return this.customizationDataId;
					}

					public void setCustomizationDataId(String customizationDataId) {
						this.customizationDataId = customizationDataId;
					}

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}

					public String getCustomizationDataName() {
						return this.customizationDataName;
					}

					public void setCustomizationDataName(String customizationDataName) {
						this.customizationDataName = customizationDataName;
					}

					public String getCustomizationDataDescription() {
						return this.customizationDataDescription;
					}

					public void setCustomizationDataDescription(String customizationDataDescription) {
						this.customizationDataDescription = customizationDataDescription;
					}

					public Integer getCustomizationDataWeight() {
						return this.customizationDataWeight;
					}

					public void setCustomizationDataWeight(Integer customizationDataWeight) {
						this.customizationDataWeight = customizationDataWeight;
					}

					public Boolean getDelete() {
						return this.delete;
					}

					public void setDelete(Boolean delete) {
						this.delete = delete;
					}

					public Boolean getCreate() {
						return this.create;
					}

					public void setCreate(Boolean create) {
						this.create = create;
					}
				}

				public static class AnnotationMissionChatTagInfoListItem {

					private String annotationMissionChatTagInfoId;

					private Long createTime;

					private Long modifiedTime;

					private String instanceId;

					private String annotationMissionId;

					private String annotationMissionSessionId;

					private String annotationMissionChatId;

					private String annotationMissionTagInfoId;

					private String annotationMissionTagInfoName;

					private Boolean delete;

					private Boolean create;

					public String getAnnotationMissionChatTagInfoId() {
						return this.annotationMissionChatTagInfoId;
					}

					public void setAnnotationMissionChatTagInfoId(String annotationMissionChatTagInfoId) {
						this.annotationMissionChatTagInfoId = annotationMissionChatTagInfoId;
					}

					public Long getCreateTime() {
						return this.createTime;
					}

					public void setCreateTime(Long createTime) {
						this.createTime = createTime;
					}

					public Long getModifiedTime() {
						return this.modifiedTime;
					}

					public void setModifiedTime(Long modifiedTime) {
						this.modifiedTime = modifiedTime;
					}

					public String getInstanceId() {
						return this.instanceId;
					}

					public void setInstanceId(String instanceId) {
						this.instanceId = instanceId;
					}

					public String getAnnotationMissionId() {
						return this.annotationMissionId;
					}

					public void setAnnotationMissionId(String annotationMissionId) {
						this.annotationMissionId = annotationMissionId;
					}

					public String getAnnotationMissionSessionId() {
						return this.annotationMissionSessionId;
					}

					public void setAnnotationMissionSessionId(String annotationMissionSessionId) {
						this.annotationMissionSessionId = annotationMissionSessionId;
					}

					public String getAnnotationMissionChatId() {
						return this.annotationMissionChatId;
					}

					public void setAnnotationMissionChatId(String annotationMissionChatId) {
						this.annotationMissionChatId = annotationMissionChatId;
					}

					public String getAnnotationMissionTagInfoId() {
						return this.annotationMissionTagInfoId;
					}

					public void setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
						this.annotationMissionTagInfoId = annotationMissionTagInfoId;
					}

					public String getAnnotationMissionTagInfoName() {
						return this.annotationMissionTagInfoName;
					}

					public void setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
						this.annotationMissionTagInfoName = annotationMissionTagInfoName;
					}

					public Boolean getDelete() {
						return this.delete;
					}

					public void setDelete(Boolean delete) {
						this.delete = delete;
					}

					public Boolean getCreate() {
						return this.create;
					}

					public void setCreate(Boolean create) {
						this.create = create;
					}
				}
			}
		}
	}

	@Override
	public ListAnnotationMissionSessionResponse getInstance(UnmarshallerContext context) {
		return	ListAnnotationMissionSessionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
