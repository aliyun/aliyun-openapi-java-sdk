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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.DescribeIntentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIntentResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Intent intent;

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

	public Intent getIntent() {
		return this.intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public static class Intent {

		private String intentId;

		private String scriptId;

		private String intentName;

		private String intentDescription;

		private String utterances;

		private String keywords;

		private Long createTime;

		private Long updateTime;

		public String getIntentId() {
			return this.intentId;
		}

		public void setIntentId(String intentId) {
			this.intentId = intentId;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getIntentName() {
			return this.intentName;
		}

		public void setIntentName(String intentName) {
			this.intentName = intentName;
		}

		public String getIntentDescription() {
			return this.intentDescription;
		}

		public void setIntentDescription(String intentDescription) {
			this.intentDescription = intentDescription;
		}

		public String getUtterances() {
			return this.utterances;
		}

		public void setUtterances(String utterances) {
			this.utterances = utterances;
		}

		public String getKeywords() {
			return this.keywords;
		}

		public void setKeywords(String keywords) {
			this.keywords = keywords;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public DescribeIntentResponse getInstance(UnmarshallerContext context) {
		return	DescribeIntentResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
