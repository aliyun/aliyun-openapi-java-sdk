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
import com.aliyuncs.outboundbot.transform.v20191226.DescribeGlobalQuestionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGlobalQuestionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private GlobalQuestion globalQuestion;

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

	public GlobalQuestion getGlobalQuestion() {
		return this.globalQuestion;
	}

	public void setGlobalQuestion(GlobalQuestion globalQuestion) {
		this.globalQuestion = globalQuestion;
	}

	public static class GlobalQuestion {

		private String globalQuestionId;

		private String scriptId;

		private String globalQuestionName;

		private String globalQuestionType;

		private String questions;

		private String answers;

		public String getGlobalQuestionId() {
			return this.globalQuestionId;
		}

		public void setGlobalQuestionId(String globalQuestionId) {
			this.globalQuestionId = globalQuestionId;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getGlobalQuestionName() {
			return this.globalQuestionName;
		}

		public void setGlobalQuestionName(String globalQuestionName) {
			this.globalQuestionName = globalQuestionName;
		}

		public String getGlobalQuestionType() {
			return this.globalQuestionType;
		}

		public void setGlobalQuestionType(String globalQuestionType) {
			this.globalQuestionType = globalQuestionType;
		}

		public String getQuestions() {
			return this.questions;
		}

		public void setQuestions(String questions) {
			this.questions = questions;
		}

		public String getAnswers() {
			return this.answers;
		}

		public void setAnswers(String answers) {
			this.answers = answers;
		}
	}

	@Override
	public DescribeGlobalQuestionResponse getInstance(UnmarshallerContext context) {
		return	DescribeGlobalQuestionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
