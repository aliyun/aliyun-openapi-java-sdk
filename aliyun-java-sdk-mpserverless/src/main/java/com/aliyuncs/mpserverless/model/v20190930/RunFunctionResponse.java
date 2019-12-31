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

package com.aliyuncs.mpserverless.model.v20190930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpserverless.transform.v20190930.RunFunctionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RunFunctionResponse extends AcsResponse {

	private String httpStatusCode;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private String runResult;

	private RuntimeMeta runtimeMeta;

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRunResult() {
		return this.runResult;
	}

	public void setRunResult(String runResult) {
		this.runResult = runResult;
	}

	public RuntimeMeta getRuntimeMeta() {
		return this.runtimeMeta;
	}

	public void setRuntimeMeta(RuntimeMeta runtimeMeta) {
		this.runtimeMeta = runtimeMeta;
	}

	public static class RuntimeMeta {

		private String logSummary;

		private String logRequestId;

		private String maxMemoryUsage;

		private String billingDuration;

		private String invocationDuration;

		public String getLogSummary() {
			return this.logSummary;
		}

		public void setLogSummary(String logSummary) {
			this.logSummary = logSummary;
		}

		public String getLogRequestId() {
			return this.logRequestId;
		}

		public void setLogRequestId(String logRequestId) {
			this.logRequestId = logRequestId;
		}

		public String getMaxMemoryUsage() {
			return this.maxMemoryUsage;
		}

		public void setMaxMemoryUsage(String maxMemoryUsage) {
			this.maxMemoryUsage = maxMemoryUsage;
		}

		public String getBillingDuration() {
			return this.billingDuration;
		}

		public void setBillingDuration(String billingDuration) {
			this.billingDuration = billingDuration;
		}

		public String getInvocationDuration() {
			return this.invocationDuration;
		}

		public void setInvocationDuration(String invocationDuration) {
			this.invocationDuration = invocationDuration;
		}
	}

	@Override
	public RunFunctionResponse getInstance(UnmarshallerContext context) {
		return	RunFunctionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
