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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.ListConfigTrackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConfigTrackResponse extends AcsResponse {

	private String httpCode;

	private Long pageSize;

	private Long pageNumber;

	private Long totalCount;

	private String requestId;

	private String message;

	private String errorCode;

	private Boolean success;

	private List<Trace> traces;

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Trace> getTraces() {
		return this.traces;
	}

	public void setTraces(List<Trace> traces) {
		this.traces = traces;
	}

	public static class Trace {

		private String logDate;

		private String ts;

		private String requestIp;

		private String responseIp;

		private String dataId;

		private String group;

		private String event;

		private String result;

		private String delay;

		private String md5;

		private String type;

		private Boolean push;

		private Boolean client;

		public String getLogDate() {
			return this.logDate;
		}

		public void setLogDate(String logDate) {
			this.logDate = logDate;
		}

		public String getTs() {
			return this.ts;
		}

		public void setTs(String ts) {
			this.ts = ts;
		}

		public String getRequestIp() {
			return this.requestIp;
		}

		public void setRequestIp(String requestIp) {
			this.requestIp = requestIp;
		}

		public String getResponseIp() {
			return this.responseIp;
		}

		public void setResponseIp(String responseIp) {
			this.responseIp = responseIp;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getGroup() {
			return this.group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getEvent() {
			return this.event;
		}

		public void setEvent(String event) {
			this.event = event;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getDelay() {
			return this.delay;
		}

		public void setDelay(String delay) {
			this.delay = delay;
		}

		public String getMd5() {
			return this.md5;
		}

		public void setMd5(String md5) {
			this.md5 = md5;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getPush() {
			return this.push;
		}

		public void setPush(Boolean push) {
			this.push = push;
		}

		public Boolean getClient() {
			return this.client;
		}

		public void setClient(Boolean client) {
			this.client = client;
		}
	}

	@Override
	public ListConfigTrackResponse getInstance(UnmarshallerContext context) {
		return	ListConfigTrackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
