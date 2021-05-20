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

package com.aliyuncs.imageprocess.model.v20200320;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageprocess.transform.v20200320.RunMedQAResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RunMedQAResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> reports;

		private String questionType;

		private String answerType;

		private String question;

		private String sessionId;

		private List<String> options;

		public Map<Object,Object> getReports() {
			return this.reports;
		}

		public void setReports(Map<Object,Object> reports) {
			this.reports = reports;
		}

		public String getQuestionType() {
			return this.questionType;
		}

		public void setQuestionType(String questionType) {
			this.questionType = questionType;
		}

		public String getAnswerType() {
			return this.answerType;
		}

		public void setAnswerType(String answerType) {
			this.answerType = answerType;
		}

		public String getQuestion() {
			return this.question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public List<String> getOptions() {
			return this.options;
		}

		public void setOptions(List<String> options) {
			this.options = options;
		}
	}

	@Override
	public RunMedQAResponse getInstance(UnmarshallerContext context) {
		return	RunMedQAResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
