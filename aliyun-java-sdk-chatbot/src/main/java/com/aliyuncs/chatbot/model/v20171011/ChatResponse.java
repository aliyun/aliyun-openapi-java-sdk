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

package com.aliyuncs.chatbot.model.v20171011;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.chatbot.transform.v20171011.ChatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ChatResponse extends AcsResponse {

	private String requestId;

	private String sessionId;

	private String messageId;

	private String tag;

	private List<Message> messages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public static class Message {

		private String type;

		private List<Recommend> recommends;

		private Text text;

		private Knowledge knowledge;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<Recommend> getRecommends() {
			return this.recommends;
		}

		public void setRecommends(List<Recommend> recommends) {
			this.recommends = recommends;
		}

		public Text getText() {
			return this.text;
		}

		public void setText(Text text) {
			this.text = text;
		}

		public Knowledge getKnowledge() {
			return this.knowledge;
		}

		public void setKnowledge(Knowledge knowledge) {
			this.knowledge = knowledge;
		}

		public static class Recommend {

			private String knowledgeId;

			private String title;

			private String answerSource;

			private String summary;

			private String content;

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

			public String getSummary() {
				return this.summary;
			}

			public void setSummary(String summary) {
				this.summary = summary;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}

		public static class Text {

			private String content;

			private String answerSource;

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
		}

		public static class Knowledge {

			private String id;

			private String title;

			private String summary;

			private String content;

			private String answerSource;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getSummary() {
				return this.summary;
			}

			public void setSummary(String summary) {
				this.summary = summary;
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
		}
	}

	@Override
	public ChatResponse getInstance(UnmarshallerContext context) {
		return	ChatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
