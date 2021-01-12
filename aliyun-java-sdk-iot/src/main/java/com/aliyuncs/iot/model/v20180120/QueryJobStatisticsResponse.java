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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryJobStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryJobStatisticsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer total;

		private Integer queued;

		private Integer sent;

		private Integer inProgress;

		private Integer succeeded;

		private Integer failed;

		private Integer rejected;

		private Integer timeOut;

		private Integer cancelled;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getQueued() {
			return this.queued;
		}

		public void setQueued(Integer queued) {
			this.queued = queued;
		}

		public Integer getSent() {
			return this.sent;
		}

		public void setSent(Integer sent) {
			this.sent = sent;
		}

		public Integer getInProgress() {
			return this.inProgress;
		}

		public void setInProgress(Integer inProgress) {
			this.inProgress = inProgress;
		}

		public Integer getSucceeded() {
			return this.succeeded;
		}

		public void setSucceeded(Integer succeeded) {
			this.succeeded = succeeded;
		}

		public Integer getFailed() {
			return this.failed;
		}

		public void setFailed(Integer failed) {
			this.failed = failed;
		}

		public Integer getRejected() {
			return this.rejected;
		}

		public void setRejected(Integer rejected) {
			this.rejected = rejected;
		}

		public Integer getTimeOut() {
			return this.timeOut;
		}

		public void setTimeOut(Integer timeOut) {
			this.timeOut = timeOut;
		}

		public Integer getCancelled() {
			return this.cancelled;
		}

		public void setCancelled(Integer cancelled) {
			this.cancelled = cancelled;
		}
	}

	@Override
	public QueryJobStatisticsResponse getInstance(UnmarshallerContext context) {
		return	QueryJobStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
