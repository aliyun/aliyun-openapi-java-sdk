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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsDataTopksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsDataTopksResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Response response;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Response getResponse() {
		return this.response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public static class Response {

		private String error;

		private String errorType;

		private String query;

		private String status;

		private Data data;

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public String getErrorType() {
			return this.errorType;
		}

		public void setErrorType(String errorType) {
			this.errorType = errorType;
		}

		public String getQuery() {
			return this.query;
		}

		public void setQuery(String query) {
			this.query = query;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Data getData() {
			return this.data;
		}

		public void setData(Data data) {
			this.data = data;
		}

		public static class Data {

			private String resultType;

			private List<ResultItem> result;

			public String getResultType() {
				return this.resultType;
			}

			public void setResultType(String resultType) {
				this.resultType = resultType;
			}

			public List<ResultItem> getResult() {
				return this.result;
			}

			public void setResult(List<ResultItem> result) {
				this.result = result;
			}

			public static class ResultItem {

				private String port;

				private String targetId;

				private String targetName;

				private String timestamp;

				private Long value;

				public String getPort() {
					return this.port;
				}

				public void setPort(String port) {
					this.port = port;
				}

				public String getTargetId() {
					return this.targetId;
				}

				public void setTargetId(String targetId) {
					this.targetId = targetId;
				}

				public String getTargetName() {
					return this.targetName;
				}

				public void setTargetName(String targetName) {
					this.targetName = targetName;
				}

				public String getTimestamp() {
					return this.timestamp;
				}

				public void setTimestamp(String timestamp) {
					this.timestamp = timestamp;
				}

				public Long getValue() {
					return this.value;
				}

				public void setValue(Long value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public QueryRmsDataTopksResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsDataTopksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
