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

package com.aliyuncs.ros.model.v20190910;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetDiagnosticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDiagnosticResponse extends AcsResponse {

	private String code;

	private String diagnosticProduct;

	private Integer httpStatusCode;

	private String message;

	private Map<Object,Object> recommends;

	private String reportId;

	private String requestId;

	private String status;

	private String statusReason;

	private String success;

	private String diagnosticKey;

	private String diagnosticTime;

	private String httpCode;

	private DiagnosticResult diagnosticResult;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDiagnosticProduct() {
		return this.diagnosticProduct;
	}

	public void setDiagnosticProduct(String diagnosticProduct) {
		this.diagnosticProduct = diagnosticProduct;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<Object,Object> getRecommends() {
		return this.recommends;
	}

	public void setRecommends(Map<Object,Object> recommends) {
		this.recommends = recommends;
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getDiagnosticKey() {
		return this.diagnosticKey;
	}

	public void setDiagnosticKey(String diagnosticKey) {
		this.diagnosticKey = diagnosticKey;
	}

	public String getDiagnosticTime() {
		return this.diagnosticTime;
	}

	public void setDiagnosticTime(String diagnosticTime) {
		this.diagnosticTime = diagnosticTime;
	}

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public DiagnosticResult getDiagnosticResult() {
		return this.diagnosticResult;
	}

	public void setDiagnosticResult(DiagnosticResult diagnosticResult) {
		this.diagnosticResult = diagnosticResult;
	}

	public static class DiagnosticResult {

		private Map<Object,Object> stackMessages;

		private Map<Object,Object> rosActionMessages;

		private Map<Object,Object> failedResources;

		public Map<Object,Object> getStackMessages() {
			return this.stackMessages;
		}

		public void setStackMessages(Map<Object,Object> stackMessages) {
			this.stackMessages = stackMessages;
		}

		public Map<Object,Object> getRosActionMessages() {
			return this.rosActionMessages;
		}

		public void setRosActionMessages(Map<Object,Object> rosActionMessages) {
			this.rosActionMessages = rosActionMessages;
		}

		public Map<Object,Object> getFailedResources() {
			return this.failedResources;
		}

		public void setFailedResources(Map<Object,Object> failedResources) {
			this.failedResources = failedResources;
		}
	}

	@Override
	public GetDiagnosticResponse getInstance(UnmarshallerContext context) {
		return	GetDiagnosticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
