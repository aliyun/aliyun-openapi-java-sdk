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

package com.aliyuncs.mpaas.model.v20200415;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200415.QueryMdsBatchUploadNebulaResourceResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMdsBatchUploadNebulaResourceResultResponse extends AcsResponse {

	private String resultMessage;

	private String resultCode;

	private String requestId;

	private ResultContent resultContent;

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResultContent getResultContent() {
		return this.resultContent;
	}

	public void setResultContent(ResultContent resultContent) {
		this.resultContent = resultContent;
	}

	public static class ResultContent {

		private String requestId;

		private Data data;

		public String getRequestId() {
			return this.requestId;
		}

		public void setRequestId(String requestId) {
			this.requestId = requestId;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String requestId;

			private Boolean success;

			private String resultMsg;

			private List<ContentItem> content;

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

			public String getResultMsg() {
				return this.resultMsg;
			}

			public void setResultMsg(String resultMsg) {
				this.resultMsg = resultMsg;
			}

			public List<ContentItem> getContent() {
				return this.content;
			}

			public void setContent(List<ContentItem> content) {
				this.content = content;
			}

			public static class ContentItem {

				private Boolean success;

				private String h5Id;

				private String message;

				private String h5Version;

				private String uploadCode;

				private String operator;

				private String id;

				public Boolean getSuccess() {
					return this.success;
				}

				public void setSuccess(Boolean success) {
					this.success = success;
				}

				public String getH5Id() {
					return this.h5Id;
				}

				public void setH5Id(String h5Id) {
					this.h5Id = h5Id;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getH5Version() {
					return this.h5Version;
				}

				public void setH5Version(String h5Version) {
					this.h5Version = h5Version;
				}

				public String getUploadCode() {
					return this.uploadCode;
				}

				public void setUploadCode(String uploadCode) {
					this.uploadCode = uploadCode;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}
			}
		}
	}

	@Override
	public QueryMdsBatchUploadNebulaResourceResultResponse getInstance(UnmarshallerContext context) {
		return	QueryMdsBatchUploadNebulaResourceResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
