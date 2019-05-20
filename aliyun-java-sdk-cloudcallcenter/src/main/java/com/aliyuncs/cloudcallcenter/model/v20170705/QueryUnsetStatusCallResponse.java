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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.QueryUnsetStatusCallResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUnsetStatusCallResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private CallStatusList callStatusList;

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

	public CallStatusList getCallStatusList() {
		return this.callStatusList;
	}

	public void setCallStatusList(CallStatusList callStatusList) {
		this.callStatusList = callStatusList;
	}

	public static class CallStatusList {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<CallStatus> list;

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

		public List<CallStatus> getList() {
			return this.list;
		}

		public void setList(List<CallStatus> list) {
			this.list = list;
		}

		public static class CallStatus {

			private String statusCode;

			private String statusDesc;

			private String taskId;

			private String taskState;

			private String acid;

			private Integer taskCode;

			private String endTime;

			public String getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(String statusCode) {
				this.statusCode = statusCode;
			}

			public String getStatusDesc() {
				return this.statusDesc;
			}

			public void setStatusDesc(String statusDesc) {
				this.statusDesc = statusDesc;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getTaskState() {
				return this.taskState;
			}

			public void setTaskState(String taskState) {
				this.taskState = taskState;
			}

			public String getAcid() {
				return this.acid;
			}

			public void setAcid(String acid) {
				this.acid = acid;
			}

			public Integer getTaskCode() {
				return this.taskCode;
			}

			public void setTaskCode(Integer taskCode) {
				this.taskCode = taskCode;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public QueryUnsetStatusCallResponse getInstance(UnmarshallerContext context) {
		return	QueryUnsetStatusCallResponseUnmarshaller.unmarshall(this, context);
	}
}
