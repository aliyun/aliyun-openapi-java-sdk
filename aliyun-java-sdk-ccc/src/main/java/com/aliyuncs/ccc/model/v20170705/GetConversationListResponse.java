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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.GetConversationListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetConversationListResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<ConversationDetail> conversations;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<ConversationDetail> getConversations() {
		return this.conversations;
	}

	public void setConversations(List<ConversationDetail> conversations) {
		this.conversations = conversations;
	}

	public static class ConversationDetail {

		private Long timestamp;

		private String speaker;

		private String script;

		private List<SummaryItem> summary;

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getSpeaker() {
			return this.speaker;
		}

		public void setSpeaker(String speaker) {
			this.speaker = speaker;
		}

		public String getScript() {
			return this.script;
		}

		public void setScript(String script) {
			this.script = script;
		}

		public List<SummaryItem> getSummary() {
			return this.summary;
		}

		public void setSummary(List<SummaryItem> summary) {
			this.summary = summary;
		}

		public static class SummaryItem {

			private String category;

			private String summaryName;

			private String content;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getSummaryName() {
				return this.summaryName;
			}

			public void setSummaryName(String summaryName) {
				this.summaryName = summaryName;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public GetConversationListResponse getInstance(UnmarshallerContext context) {
		return	GetConversationListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
