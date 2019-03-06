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

package com.aliyuncs.drcloud.model.v20190213;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.drcloud.transform.v20190213.GetAnswerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAnswerResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String message;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String requestId;

		private QuestionDTO questionDTO;

		private ReplyDTO replyDTO;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public QuestionDTO getQuestionDTO() {
			return this.questionDTO;
		}

		public void setQuestionDTO(QuestionDTO questionDTO) {
			this.questionDTO = questionDTO;
		}

		public ReplyDTO getReplyDTO() {
			return this.replyDTO;
		}

		public void setReplyDTO(ReplyDTO replyDTO) {
			this.replyDTO = replyDTO;
		}

		public static class QuestionDTO {

			private String productQuestionCode;

			private String productCode;

			private String intentionType;

			public String getProductQuestionCode() {
				return this.productQuestionCode;
			}

			public void setProductQuestionCode(String productQuestionCode) {
				this.productQuestionCode = productQuestionCode;
			}

			public String getProductCode() {
				return this.productCode;
			}

			public void setProductCode(String productCode) {
				this.productCode = productCode;
			}

			public String getIntentionType() {
				return this.intentionType;
			}

			public void setIntentionType(String intentionType) {
				this.intentionType = intentionType;
			}
		}

		public static class ReplyDTO {

			private String question;

			private String answer;

			private String link;

			private String type;

			private String docTitle;

			public String getQuestion() {
				return this.question;
			}

			public void setQuestion(String question) {
				this.question = question;
			}

			public String getAnswer() {
				return this.answer;
			}

			public void setAnswer(String answer) {
				this.answer = answer;
			}

			public String getLink() {
				return this.link;
			}

			public void setLink(String link) {
				this.link = link;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDocTitle() {
				return this.docTitle;
			}

			public void setDocTitle(String docTitle) {
				this.docTitle = docTitle;
			}
		}
	}

	@Override
	public GetAnswerResponse getInstance(UnmarshallerContext context) {
		return	GetAnswerResponseUnmarshaller.unmarshall(this, context);
	}
}
