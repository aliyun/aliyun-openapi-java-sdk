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
import com.aliyuncs.mse.transform.v20190531.ListZkTrackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListZkTrackResponse extends AcsResponse {

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

		private String timestamp;

		private String sessionId;

		private String path;

		private String traceType;

		private String opType;

		private String eventType;

		private String dataType;

		private Boolean watch;

		private String acl;

		private Long multiSize;

		private String result;

		private Long ttl;

		private Boolean finished;

		public String getLogDate() {
			return this.logDate;
		}

		public void setLogDate(String logDate) {
			this.logDate = logDate;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getTraceType() {
			return this.traceType;
		}

		public void setTraceType(String traceType) {
			this.traceType = traceType;
		}

		public String getOpType() {
			return this.opType;
		}

		public void setOpType(String opType) {
			this.opType = opType;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getDataType() {
			return this.dataType;
		}

		public void setDataType(String dataType) {
			this.dataType = dataType;
		}

		public Boolean getWatch() {
			return this.watch;
		}

		public void setWatch(Boolean watch) {
			this.watch = watch;
		}

		public String getAcl() {
			return this.acl;
		}

		public void setAcl(String acl) {
			this.acl = acl;
		}

		public Long getMultiSize() {
			return this.multiSize;
		}

		public void setMultiSize(Long multiSize) {
			this.multiSize = multiSize;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public Long getTtl() {
			return this.ttl;
		}

		public void setTtl(Long ttl) {
			this.ttl = ttl;
		}

		public Boolean getFinished() {
			return this.finished;
		}

		public void setFinished(Boolean finished) {
			this.finished = finished;
		}
	}

	@Override
	public ListZkTrackResponse getInstance(UnmarshallerContext context) {
		return	ListZkTrackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
