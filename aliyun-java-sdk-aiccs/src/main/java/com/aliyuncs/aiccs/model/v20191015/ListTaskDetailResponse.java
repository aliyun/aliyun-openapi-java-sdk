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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.ListTaskDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTaskDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long pageNo;

		private Long pageSize;

		private Long total;

		private List<RecordItem> record;

		public Long getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Long pageNo) {
			this.pageNo = pageNo;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<RecordItem> getRecord() {
			return this.record;
		}

		public void setRecord(List<RecordItem> record) {
			this.record = record;
		}

		public static class RecordItem {

			private String status;

			private Integer retryCurTimes;

			private String called;

			private String caller;

			private Integer duration;

			private Long id;

			private String statusCode;

			private String statusCodeDesc;

			private Integer retryTimes;

			private String startTime;

			private String endTime;

			private String direction;

			private String tags;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getRetryCurTimes() {
				return this.retryCurTimes;
			}

			public void setRetryCurTimes(Integer retryCurTimes) {
				this.retryCurTimes = retryCurTimes;
			}

			public String getCalled() {
				return this.called;
			}

			public void setCalled(String called) {
				this.called = called;
			}

			public String getCaller() {
				return this.caller;
			}

			public void setCaller(String caller) {
				this.caller = caller;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getStatusCode() {
				return this.statusCode;
			}

			public void setStatusCode(String statusCode) {
				this.statusCode = statusCode;
			}

			public String getStatusCodeDesc() {
				return this.statusCodeDesc;
			}

			public void setStatusCodeDesc(String statusCodeDesc) {
				this.statusCodeDesc = statusCodeDesc;
			}

			public Integer getRetryTimes() {
				return this.retryTimes;
			}

			public void setRetryTimes(Integer retryTimes) {
				this.retryTimes = retryTimes;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getDirection() {
				return this.direction;
			}

			public void setDirection(String direction) {
				this.direction = direction;
			}

			public String getTags() {
				return this.tags;
			}

			public void setTags(String tags) {
				this.tags = tags;
			}
		}
	}

	@Override
	public ListTaskDetailResponse getInstance(UnmarshallerContext context) {
		return	ListTaskDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
