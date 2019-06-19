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

package com.aliyuncs.linkedmall.model.v20180116;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkedmall.transform.v20180116.QueryMessagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMessagesResponse extends AcsResponse {

	private String requestId;

	private String logsId;

	private String subCode;

	private String subMessage;

	private String code;

	private String message;

	private Boolean success;

	private List<BizMessage> bizMessages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLogsId() {
		return this.logsId;
	}

	public void setLogsId(String logsId) {
		this.logsId = logsId;
	}

	public String getSubCode() {
		return this.subCode;
	}

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}

	public String getSubMessage() {
		return this.subMessage;
	}

	public void setSubMessage(String subMessage) {
		this.subMessage = subMessage;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<BizMessage> getBizMessages() {
		return this.bizMessages;
	}

	public void setBizMessages(List<BizMessage> bizMessages) {
		this.bizMessages = bizMessages;
	}

	public static class BizMessage {

		private String topic;

		private Long dataId;

		private String pubTime;

		private String contentMapJson;

		public String getTopic() {
			return this.topic;
		}

		public void setTopic(String topic) {
			this.topic = topic;
		}

		public Long getDataId() {
			return this.dataId;
		}

		public void setDataId(Long dataId) {
			this.dataId = dataId;
		}

		public String getPubTime() {
			return this.pubTime;
		}

		public void setPubTime(String pubTime) {
			this.pubTime = pubTime;
		}

		public String getContentMapJson() {
			return this.contentMapJson;
		}

		public void setContentMapJson(String contentMapJson) {
			this.contentMapJson = contentMapJson;
		}
	}

	@Override
	public QueryMessagesResponse getInstance(UnmarshallerContext context) {
		return	QueryMessagesResponseUnmarshaller.unmarshall(this, context);
	}
}
