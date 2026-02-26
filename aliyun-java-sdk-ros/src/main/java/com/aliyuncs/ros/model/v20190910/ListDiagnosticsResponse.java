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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ListDiagnosticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDiagnosticsResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private String success;

	private String nextToken;

	private List<诊断结果> diagnostics;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<诊断结果> getDiagnostics() {
		return this.diagnostics;
	}

	public void setDiagnostics(List<诊断结果> diagnostics) {
		this.diagnostics = diagnostics;
	}

	public static class 诊断结果 {

		private String createTime;

		private String diagnosticKey;

		private String diagnosticProduct;

		private String reportId;

		private String status;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDiagnosticKey() {
			return this.diagnosticKey;
		}

		public void setDiagnosticKey(String diagnosticKey) {
			this.diagnosticKey = diagnosticKey;
		}

		public String getDiagnosticProduct() {
			return this.diagnosticProduct;
		}

		public void setDiagnosticProduct(String diagnosticProduct) {
			this.diagnosticProduct = diagnosticProduct;
		}

		public String getReportId() {
			return this.reportId;
		}

		public void setReportId(String reportId) {
			this.reportId = reportId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListDiagnosticsResponse getInstance(UnmarshallerContext context) {
		return	ListDiagnosticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
