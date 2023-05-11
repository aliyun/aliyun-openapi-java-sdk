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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryMessageInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMessageInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

	private Message message;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Message getMessage() {
		return this.message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public static class Message {

		private String uniMsgId;

		private String topicFullName;

		private String messageContent;

		private Long generateTime;

		private List<UserProperty> userProperties;

		public String getUniMsgId() {
			return this.uniMsgId;
		}

		public void setUniMsgId(String uniMsgId) {
			this.uniMsgId = uniMsgId;
		}

		public String getTopicFullName() {
			return this.topicFullName;
		}

		public void setTopicFullName(String topicFullName) {
			this.topicFullName = topicFullName;
		}

		public String getMessageContent() {
			return this.messageContent;
		}

		public void setMessageContent(String messageContent) {
			this.messageContent = messageContent;
		}

		public Long getGenerateTime() {
			return this.generateTime;
		}

		public void setGenerateTime(Long generateTime) {
			this.generateTime = generateTime;
		}

		public List<UserProperty> getUserProperties() {
			return this.userProperties;
		}

		public void setUserProperties(List<UserProperty> userProperties) {
			this.userProperties = userProperties;
		}

		public static class UserProperty {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public QueryMessageInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryMessageInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
