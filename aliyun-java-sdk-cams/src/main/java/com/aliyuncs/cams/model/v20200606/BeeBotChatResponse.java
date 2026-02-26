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

package com.aliyuncs.cams.model.v20200606;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cams.transform.v20200606.BeeBotChatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BeeBotChatResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String accessDeniedDetail;

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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String messageId;

		private String sessionId;

		private List<消息的列表> messages;

		public String getMessageId() {
			return this.messageId;
		}

		public void setMessageId(String messageId) {
			this.messageId = messageId;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public List<消息的列表> getMessages() {
			return this.messages;
		}

		public void setMessages(List<消息的列表> messages) {
			this.messages = messages;
		}

		public static class 消息的列表 {

			private String answerType;

			private String answerSource;

			private List<Recommend> recommends;

			private Knowledge knowledge;

			private Text text;

			public String getAnswerType() {
				return this.answerType;
			}

			public void setAnswerType(String answerType) {
				this.answerType = answerType;
			}

			public String getAnswerSource() {
				return this.answerSource;
			}

			public void setAnswerSource(String answerSource) {
				this.answerSource = answerSource;
			}

			public List<Recommend> getRecommends() {
				return this.recommends;
			}

			public void setRecommends(List<Recommend> recommends) {
				this.recommends = recommends;
			}

			public Knowledge getKnowledge() {
				return this.knowledge;
			}

			public void setKnowledge(Knowledge knowledge) {
				this.knowledge = knowledge;
			}

			public Text getText() {
				return this.text;
			}

			public void setText(Text text) {
				this.text = text;
			}

			public static class Recommend {

				private String knowledgeId;

				private String title;

				private String answerSource;

				public String getKnowledgeId() {
					return this.knowledgeId;
				}

				public void setKnowledgeId(String knowledgeId) {
					this.knowledgeId = knowledgeId;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getAnswerSource() {
					return this.answerSource;
				}

				public void setAnswerSource(String answerSource) {
					this.answerSource = answerSource;
				}
			}

			public static class Knowledge {

				private String hitStatement;

				private String summary;

				private String category;

				private String title;

				private String content;

				private String answerSource;

				private String id;

				private String contentType;

				private List<RelatedKnowledgesItem> relatedKnowledges;

				public String getHitStatement() {
					return this.hitStatement;
				}

				public void setHitStatement(String hitStatement) {
					this.hitStatement = hitStatement;
				}

				public String getSummary() {
					return this.summary;
				}

				public void setSummary(String summary) {
					this.summary = summary;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getAnswerSource() {
					return this.answerSource;
				}

				public void setAnswerSource(String answerSource) {
					this.answerSource = answerSource;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getContentType() {
					return this.contentType;
				}

				public void setContentType(String contentType) {
					this.contentType = contentType;
				}

				public List<RelatedKnowledgesItem> getRelatedKnowledges() {
					return this.relatedKnowledges;
				}

				public void setRelatedKnowledges(List<RelatedKnowledgesItem> relatedKnowledges) {
					this.relatedKnowledges = relatedKnowledges;
				}

				public static class RelatedKnowledgesItem {

					private String knowledgeId;

					private String title;

					public String getKnowledgeId() {
						return this.knowledgeId;
					}

					public void setKnowledgeId(String knowledgeId) {
						this.knowledgeId = knowledgeId;
					}

					public String getTitle() {
						return this.title;
					}

					public void setTitle(String title) {
						this.title = title;
					}
				}
			}

			public static class Text {

				private String hitStatement;

				private String dialogName;

				private String answerSource;

				private String nodeName;

				private String intentName;

				private String metaData;

				private Map<Object,Object> externalFlags;

				private Map<Object,Object> ext;

				private String userDefinedChatTitle;

				private String content;

				private String nodeId;

				private String contentType;

				private List<SlotsItem> slots;

				public String getHitStatement() {
					return this.hitStatement;
				}

				public void setHitStatement(String hitStatement) {
					this.hitStatement = hitStatement;
				}

				public String getDialogName() {
					return this.dialogName;
				}

				public void setDialogName(String dialogName) {
					this.dialogName = dialogName;
				}

				public String getAnswerSource() {
					return this.answerSource;
				}

				public void setAnswerSource(String answerSource) {
					this.answerSource = answerSource;
				}

				public String getNodeName() {
					return this.nodeName;
				}

				public void setNodeName(String nodeName) {
					this.nodeName = nodeName;
				}

				public String getIntentName() {
					return this.intentName;
				}

				public void setIntentName(String intentName) {
					this.intentName = intentName;
				}

				public String getMetaData() {
					return this.metaData;
				}

				public void setMetaData(String metaData) {
					this.metaData = metaData;
				}

				public Map<Object,Object> getExternalFlags() {
					return this.externalFlags;
				}

				public void setExternalFlags(Map<Object,Object> externalFlags) {
					this.externalFlags = externalFlags;
				}

				public Map<Object,Object> getExt() {
					return this.ext;
				}

				public void setExt(Map<Object,Object> ext) {
					this.ext = ext;
				}

				public String getUserDefinedChatTitle() {
					return this.userDefinedChatTitle;
				}

				public void setUserDefinedChatTitle(String userDefinedChatTitle) {
					this.userDefinedChatTitle = userDefinedChatTitle;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public String getContentType() {
					return this.contentType;
				}

				public void setContentType(String contentType) {
					this.contentType = contentType;
				}

				public List<SlotsItem> getSlots() {
					return this.slots;
				}

				public void setSlots(List<SlotsItem> slots) {
					this.slots = slots;
				}

				public static class SlotsItem {

					private String value;

					private String origin;

					private String name;

					private Boolean hit;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}

					public String getOrigin() {
						return this.origin;
					}

					public void setOrigin(String origin) {
						this.origin = origin;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public Boolean getHit() {
						return this.hit;
					}

					public void setHit(Boolean hit) {
						this.hit = hit;
					}
				}
			}
		}
	}

	@Override
	public BeeBotChatResponse getInstance(UnmarshallerContext context) {
		return	BeeBotChatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
