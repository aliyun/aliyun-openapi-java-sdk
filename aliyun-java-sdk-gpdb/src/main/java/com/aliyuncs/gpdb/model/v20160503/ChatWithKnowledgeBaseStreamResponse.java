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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.ChatWithKnowledgeBaseStreamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ChatWithKnowledgeBaseStreamResponse extends AcsResponse {

	private String status;

	private String message;

	private String requestId;

	private ChatCompletion chatCompletion;

	private MultiCollectionRecallResult multiCollectionRecallResult;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ChatCompletion getChatCompletion() {
		return this.chatCompletion;
	}

	public void setChatCompletion(ChatCompletion chatCompletion) {
		this.chatCompletion = chatCompletion;
	}

	public MultiCollectionRecallResult getMultiCollectionRecallResult() {
		return this.multiCollectionRecallResult;
	}

	public void setMultiCollectionRecallResult(MultiCollectionRecallResult multiCollectionRecallResult) {
		this.multiCollectionRecallResult = multiCollectionRecallResult;
	}

	public static class ChatCompletion {

		private String model;

		private String id;

		private Long created;

		private List<Choice> choices;

		private Usage usage;

		public String getModel() {
			return this.model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getCreated() {
			return this.created;
		}

		public void setCreated(Long created) {
			this.created = created;
		}

		public List<Choice> getChoices() {
			return this.choices;
		}

		public void setChoices(List<Choice> choices) {
			this.choices = choices;
		}

		public Usage getUsage() {
			return this.usage;
		}

		public void setUsage(Usage usage) {
			this.usage = usage;
		}

		public static class Choice {

			private Long index;

			private String finishReason;

			private Message message;

			public Long getIndex() {
				return this.index;
			}

			public void setIndex(Long index) {
				this.index = index;
			}

			public String getFinishReason() {
				return this.finishReason;
			}

			public void setFinishReason(String finishReason) {
				this.finishReason = finishReason;
			}

			public Message getMessage() {
				return this.message;
			}

			public void setMessage(Message message) {
				this.message = message;
			}

			public static class Message {

				private String role;

				private String reasoningContent;

				private String content;

				private List<Toolcall> toolCalls;

				public String getRole() {
					return this.role;
				}

				public void setRole(String role) {
					this.role = role;
				}

				public String getReasoningContent() {
					return this.reasoningContent;
				}

				public void setReasoningContent(String reasoningContent) {
					this.reasoningContent = reasoningContent;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public List<Toolcall> getToolCalls() {
					return this.toolCalls;
				}

				public void setToolCalls(List<Toolcall> toolCalls) {
					this.toolCalls = toolCalls;
				}

				public static class Toolcall {

					private Long index;

					private String id;

					private Function function;

					public Long getIndex() {
						return this.index;
					}

					public void setIndex(Long index) {
						this.index = index;
					}

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public Function getFunction() {
						return this.function;
					}

					public void setFunction(Function function) {
						this.function = function;
					}

					public static class Function {

						private String arguments;

						private String name;

						public String getArguments() {
							return this.arguments;
						}

						public void setArguments(String arguments) {
							this.arguments = arguments;
						}

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}
					}
				}
			}
		}

		public static class Usage {

			private Long totalTokens;

			private Long completionTokens;

			private Long promptTokens;

			private PromptTokensDetails promptTokensDetails;

			public Long getTotalTokens() {
				return this.totalTokens;
			}

			public void setTotalTokens(Long totalTokens) {
				this.totalTokens = totalTokens;
			}

			public Long getCompletionTokens() {
				return this.completionTokens;
			}

			public void setCompletionTokens(Long completionTokens) {
				this.completionTokens = completionTokens;
			}

			public Long getPromptTokens() {
				return this.promptTokens;
			}

			public void setPromptTokens(Long promptTokens) {
				this.promptTokens = promptTokens;
			}

			public PromptTokensDetails getPromptTokensDetails() {
				return this.promptTokensDetails;
			}

			public void setPromptTokensDetails(PromptTokensDetails promptTokensDetails) {
				this.promptTokensDetails = promptTokensDetails;
			}

			public static class PromptTokensDetails {

				private Long cachedTokens;

				public Long getCachedTokens() {
					return this.cachedTokens;
				}

				public void setCachedTokens(Long cachedTokens) {
					this.cachedTokens = cachedTokens;
				}
			}
		}
	}

	public static class MultiCollectionRecallResult {

		private String status;

		private String requestId;

		private Long tokens;

		private List<Match> matches;

		private List<String> relations;

		private List<String> entities;

		private Usage1 usage1;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Long getTokens() {
			return this.tokens;
		}

		public void setTokens(Long tokens) {
			this.tokens = tokens;
		}

		public List<Match> getMatches() {
			return this.matches;
		}

		public void setMatches(List<Match> matches) {
			this.matches = matches;
		}

		public List<String> getRelations() {
			return this.relations;
		}

		public void setRelations(List<String> relations) {
			this.relations = relations;
		}

		public List<String> getEntities() {
			return this.entities;
		}

		public void setEntities(List<String> entities) {
			this.entities = entities;
		}

		public Usage1 getUsage1() {
			return this.usage1;
		}

		public void setUsage1(Usage1 usage1) {
			this.usage1 = usage1;
		}

		public static class Match {

			private String fileURL;

			private Long retrievalSource;

			private Double score;

			private String content;

			private String fileName;

			private Map<Object,Object> metadata;

			private Double rerankScore;

			private Object loaderMetadata;

			private String id;

			private List<Double> vector;

			public String getFileURL() {
				return this.fileURL;
			}

			public void setFileURL(String fileURL) {
				this.fileURL = fileURL;
			}

			public Long getRetrievalSource() {
				return this.retrievalSource;
			}

			public void setRetrievalSource(Long retrievalSource) {
				this.retrievalSource = retrievalSource;
			}

			public Double getScore() {
				return this.score;
			}

			public void setScore(Double score) {
				this.score = score;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public Map<Object,Object> getMetadata() {
				return this.metadata;
			}

			public void setMetadata(Map<Object,Object> metadata) {
				this.metadata = metadata;
			}

			public Double getRerankScore() {
				return this.rerankScore;
			}

			public void setRerankScore(Double rerankScore) {
				this.rerankScore = rerankScore;
			}

			public Object getLoaderMetadata() {
				return this.loaderMetadata;
			}

			public void setLoaderMetadata(Object loaderMetadata) {
				this.loaderMetadata = loaderMetadata;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public List<Double> getVector() {
				return this.vector;
			}

			public void setVector(List<Double> vector) {
				this.vector = vector;
			}
		}

		public static class Usage1 {

			private Long embeddingTokens;

			public Long getEmbeddingTokens() {
				return this.embeddingTokens;
			}

			public void setEmbeddingTokens(Long embeddingTokens) {
				this.embeddingTokens = embeddingTokens;
			}
		}
	}

	@Override
	public ChatWithKnowledgeBaseStreamResponse getInstance(UnmarshallerContext context) {
		return	ChatWithKnowledgeBaseStreamResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
