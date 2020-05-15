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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListUnrecognizedIntentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUnrecognizedIntentsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private UnrecognizedIntents unrecognizedIntents;

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

	public UnrecognizedIntents getUnrecognizedIntents() {
		return this.unrecognizedIntents;
	}

	public void setUnrecognizedIntents(UnrecognizedIntents unrecognizedIntents) {
		this.unrecognizedIntents = unrecognizedIntents;
	}

	public static class UnrecognizedIntents {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<UnrecognizedIntent> list;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public List<UnrecognizedIntent> getList() {
			return this.list;
		}

		public void setList(List<UnrecognizedIntent> list) {
			this.list = list;
		}

		public static class UnrecognizedIntent {

			private String question;

			private String nodeId;

			private Integer totalCount;

			private Integer unrecognizedCount;

			private Integer unrecognizedPercentage;

			public String getQuestion() {
				return this.question;
			}

			public void setQuestion(String question) {
				this.question = question;
			}

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public Integer getUnrecognizedCount() {
				return this.unrecognizedCount;
			}

			public void setUnrecognizedCount(Integer unrecognizedCount) {
				this.unrecognizedCount = unrecognizedCount;
			}

			public Integer getUnrecognizedPercentage() {
				return this.unrecognizedPercentage;
			}

			public void setUnrecognizedPercentage(Integer unrecognizedPercentage) {
				this.unrecognizedPercentage = unrecognizedPercentage;
			}
		}
	}

	@Override
	public ListUnrecognizedIntentsResponse getInstance(UnmarshallerContext context) {
		return	ListUnrecognizedIntentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
