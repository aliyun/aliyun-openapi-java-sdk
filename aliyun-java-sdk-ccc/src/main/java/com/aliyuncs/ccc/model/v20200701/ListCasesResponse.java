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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListCasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCasesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Long httpStatusCode;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Long httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

		private Long pageNumber;

		private Long pageSize;

		private Long totalCount;

		private List<ListItem> list;

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String abandonType;

			private Long attemptCount;

			private String failureReason;

			private String phoneNumber;

			private String state;

			private String caseId;

			private String customVariables;

			public String getAbandonType() {
				return this.abandonType;
			}

			public void setAbandonType(String abandonType) {
				this.abandonType = abandonType;
			}

			public Long getAttemptCount() {
				return this.attemptCount;
			}

			public void setAttemptCount(Long attemptCount) {
				this.attemptCount = attemptCount;
			}

			public String getFailureReason() {
				return this.failureReason;
			}

			public void setFailureReason(String failureReason) {
				this.failureReason = failureReason;
			}

			public String getPhoneNumber() {
				return this.phoneNumber;
			}

			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getCaseId() {
				return this.caseId;
			}

			public void setCaseId(String caseId) {
				this.caseId = caseId;
			}

			public String getCustomVariables() {
				return this.customVariables;
			}

			public void setCustomVariables(String customVariables) {
				this.customVariables = customVariables;
			}
		}
	}

	@Override
	public ListCasesResponse getInstance(UnmarshallerContext context) {
		return	ListCasesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
