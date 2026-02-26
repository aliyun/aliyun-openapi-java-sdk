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
import com.aliyuncs.outboundbot.transform.v20191226.GetAnnotationMissionSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAnnotationMissionSummaryResponse extends AcsResponse {

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

		private IntentSummaryInfo intentSummaryInfo;

		private AsrSummaryInfo asrSummaryInfo;

		private TagSummaryInfo tagSummaryInfo;

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

		public IntentSummaryInfo getIntentSummaryInfo() {
			return this.intentSummaryInfo;
		}

		public void setIntentSummaryInfo(IntentSummaryInfo intentSummaryInfo) {
			this.intentSummaryInfo = intentSummaryInfo;
		}

		public AsrSummaryInfo getAsrSummaryInfo() {
			return this.asrSummaryInfo;
		}

		public void setAsrSummaryInfo(AsrSummaryInfo asrSummaryInfo) {
			this.asrSummaryInfo = asrSummaryInfo;
		}

		public TagSummaryInfo getTagSummaryInfo() {
			return this.tagSummaryInfo;
		}

		public void setTagSummaryInfo(TagSummaryInfo tagSummaryInfo) {
			this.tagSummaryInfo = tagSummaryInfo;
		}

		public static class IntentSummaryInfo {

			private Integer intentUserSayCount;

			private Integer annotationCorrectCount;

			private Integer matchErrorCount;

			private Integer annotationInvalid;

			private Integer noAnnotation;

			private Integer chatTotalCount;

			private Integer translationUnrecognizedCount;

			private Integer intentionNotCoveredCount;

			public Integer getIntentUserSayCount() {
				return this.intentUserSayCount;
			}

			public void setIntentUserSayCount(Integer intentUserSayCount) {
				this.intentUserSayCount = intentUserSayCount;
			}

			public Integer getAnnotationCorrectCount() {
				return this.annotationCorrectCount;
			}

			public void setAnnotationCorrectCount(Integer annotationCorrectCount) {
				this.annotationCorrectCount = annotationCorrectCount;
			}

			public Integer getMatchErrorCount() {
				return this.matchErrorCount;
			}

			public void setMatchErrorCount(Integer matchErrorCount) {
				this.matchErrorCount = matchErrorCount;
			}

			public Integer getAnnotationInvalid() {
				return this.annotationInvalid;
			}

			public void setAnnotationInvalid(Integer annotationInvalid) {
				this.annotationInvalid = annotationInvalid;
			}

			public Integer getNoAnnotation() {
				return this.noAnnotation;
			}

			public void setNoAnnotation(Integer noAnnotation) {
				this.noAnnotation = noAnnotation;
			}

			public Integer getChatTotalCount() {
				return this.chatTotalCount;
			}

			public void setChatTotalCount(Integer chatTotalCount) {
				this.chatTotalCount = chatTotalCount;
			}

			public Integer getTranslationUnrecognizedCount() {
				return this.translationUnrecognizedCount;
			}

			public void setTranslationUnrecognizedCount(Integer translationUnrecognizedCount) {
				this.translationUnrecognizedCount = translationUnrecognizedCount;
			}

			public Integer getIntentionNotCoveredCount() {
				return this.intentionNotCoveredCount;
			}

			public void setIntentionNotCoveredCount(Integer intentionNotCoveredCount) {
				this.intentionNotCoveredCount = intentionNotCoveredCount;
			}
		}

		public static class AsrSummaryInfo {

			private Integer wordErrorRate;

			private Integer characterErrorRate;

			private Integer sentenceErrorRate;

			private Integer annotationInvalid;

			private Integer noAnnotation;

			private Integer chatTotalCount;

			private Integer addVocabularyDataCount;

			private Integer addCustomizationDataCount;

			private Integer characterCorrectRate;

			public Integer getWordErrorRate() {
				return this.wordErrorRate;
			}

			public void setWordErrorRate(Integer wordErrorRate) {
				this.wordErrorRate = wordErrorRate;
			}

			public Integer getCharacterErrorRate() {
				return this.characterErrorRate;
			}

			public void setCharacterErrorRate(Integer characterErrorRate) {
				this.characterErrorRate = characterErrorRate;
			}

			public Integer getSentenceErrorRate() {
				return this.sentenceErrorRate;
			}

			public void setSentenceErrorRate(Integer sentenceErrorRate) {
				this.sentenceErrorRate = sentenceErrorRate;
			}

			public Integer getAnnotationInvalid() {
				return this.annotationInvalid;
			}

			public void setAnnotationInvalid(Integer annotationInvalid) {
				this.annotationInvalid = annotationInvalid;
			}

			public Integer getNoAnnotation() {
				return this.noAnnotation;
			}

			public void setNoAnnotation(Integer noAnnotation) {
				this.noAnnotation = noAnnotation;
			}

			public Integer getChatTotalCount() {
				return this.chatTotalCount;
			}

			public void setChatTotalCount(Integer chatTotalCount) {
				this.chatTotalCount = chatTotalCount;
			}

			public Integer getAddVocabularyDataCount() {
				return this.addVocabularyDataCount;
			}

			public void setAddVocabularyDataCount(Integer addVocabularyDataCount) {
				this.addVocabularyDataCount = addVocabularyDataCount;
			}

			public Integer getAddCustomizationDataCount() {
				return this.addCustomizationDataCount;
			}

			public void setAddCustomizationDataCount(Integer addCustomizationDataCount) {
				this.addCustomizationDataCount = addCustomizationDataCount;
			}

			public Integer getCharacterCorrectRate() {
				return this.characterCorrectRate;
			}

			public void setCharacterCorrectRate(Integer characterCorrectRate) {
				this.characterCorrectRate = characterCorrectRate;
			}
		}

		public static class TagSummaryInfo {

			private List<TagSummaryInfoDetailListItem> tagSummaryInfoDetailList;

			public List<TagSummaryInfoDetailListItem> getTagSummaryInfoDetailList() {
				return this.tagSummaryInfoDetailList;
			}

			public void setTagSummaryInfoDetailList(List<TagSummaryInfoDetailListItem> tagSummaryInfoDetailList) {
				this.tagSummaryInfoDetailList = tagSummaryInfoDetailList;
			}

			public static class TagSummaryInfoDetailListItem {

				private String name;

				private Integer count;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Integer getCount() {
					return this.count;
				}

				public void setCount(Integer count) {
					this.count = count;
				}
			}
		}
	}

	@Override
	public GetAnnotationMissionSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetAnnotationMissionSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
