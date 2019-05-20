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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.DialogueLiteResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DialogueLiteResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Feedback feedback;

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

	public Feedback getFeedback() {
		return this.feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}

	public static class Feedback {

		private String content;

		private String action;

		private String actionParams;

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getBizAction() {
			return this.action;
		}

		public void setBizAction(String action) {
			this.action = action;
		}

		/**
		 * @deprecated use getBizAction instead of this.
		 */
		@Deprecated
		public String getAction() {
			return this.action;
		}

		/**
		 * @deprecated use setBizAction instead of this.
		 */
		@Deprecated
		public void setAction(String action) {
			this.action = action;
		}

		public String getActionParams() {
			return this.actionParams;
		}

		public void setActionParams(String actionParams) {
			this.actionParams = actionParams;
		}
	}

	@Override
	public DialogueLiteResponse getInstance(UnmarshallerContext context) {
		return	DialogueLiteResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
