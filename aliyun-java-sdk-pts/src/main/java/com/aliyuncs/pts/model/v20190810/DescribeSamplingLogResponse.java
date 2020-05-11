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

package com.aliyuncs.pts.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20190810.DescribeSamplingLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSamplingLogResponse extends AcsResponse {

	private String message;

	private Integer httpStatusCode;

	private Boolean success;

	private String code;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<SamplingLog> samplingLogs;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<SamplingLog> getSamplingLogs() {
		return this.samplingLogs;
	}

	public void setSamplingLogs(List<SamplingLog> samplingLogs) {
		this.samplingLogs = samplingLogs;
	}

	public static class SamplingLog {

		private String chainId;

		private String timestamp;

		private String httpRequestMethod;

		private String httpRequestBody;

		private String httpRequestHeaders;

		private String httpRequestUrl;

		private String httpStartTime;

		private String httpResponseBody;

		private String httpResponseFailMsg;

		private String httpResponseHeaders;

		private String importContent;

		private String exportConfig;

		private String exportContent;

		private String checkResult;

		private String httpTiming;

		private String rt;

		private String httpResponseStatus;

		private Integer transId;

		private String groupTag;

		public String getChainId() {
			return this.chainId;
		}

		public void setChainId(String chainId) {
			this.chainId = chainId;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getHttpRequestMethod() {
			return this.httpRequestMethod;
		}

		public void setHttpRequestMethod(String httpRequestMethod) {
			this.httpRequestMethod = httpRequestMethod;
		}

		public String getHttpRequestBody() {
			return this.httpRequestBody;
		}

		public void setHttpRequestBody(String httpRequestBody) {
			this.httpRequestBody = httpRequestBody;
		}

		public String getHttpRequestHeaders() {
			return this.httpRequestHeaders;
		}

		public void setHttpRequestHeaders(String httpRequestHeaders) {
			this.httpRequestHeaders = httpRequestHeaders;
		}

		public String getHttpRequestUrl() {
			return this.httpRequestUrl;
		}

		public void setHttpRequestUrl(String httpRequestUrl) {
			this.httpRequestUrl = httpRequestUrl;
		}

		public String getHttpStartTime() {
			return this.httpStartTime;
		}

		public void setHttpStartTime(String httpStartTime) {
			this.httpStartTime = httpStartTime;
		}

		public String getHttpResponseBody() {
			return this.httpResponseBody;
		}

		public void setHttpResponseBody(String httpResponseBody) {
			this.httpResponseBody = httpResponseBody;
		}

		public String getHttpResponseFailMsg() {
			return this.httpResponseFailMsg;
		}

		public void setHttpResponseFailMsg(String httpResponseFailMsg) {
			this.httpResponseFailMsg = httpResponseFailMsg;
		}

		public String getHttpResponseHeaders() {
			return this.httpResponseHeaders;
		}

		public void setHttpResponseHeaders(String httpResponseHeaders) {
			this.httpResponseHeaders = httpResponseHeaders;
		}

		public String getImportContent() {
			return this.importContent;
		}

		public void setImportContent(String importContent) {
			this.importContent = importContent;
		}

		public String getExportConfig() {
			return this.exportConfig;
		}

		public void setExportConfig(String exportConfig) {
			this.exportConfig = exportConfig;
		}

		public String getExportContent() {
			return this.exportContent;
		}

		public void setExportContent(String exportContent) {
			this.exportContent = exportContent;
		}

		public String getCheckResult() {
			return this.checkResult;
		}

		public void setCheckResult(String checkResult) {
			this.checkResult = checkResult;
		}

		public String getHttpTiming() {
			return this.httpTiming;
		}

		public void setHttpTiming(String httpTiming) {
			this.httpTiming = httpTiming;
		}

		public String getRt() {
			return this.rt;
		}

		public void setRt(String rt) {
			this.rt = rt;
		}

		public String getHttpResponseStatus() {
			return this.httpResponseStatus;
		}

		public void setHttpResponseStatus(String httpResponseStatus) {
			this.httpResponseStatus = httpResponseStatus;
		}

		public Integer getTransId() {
			return this.transId;
		}

		public void setTransId(Integer transId) {
			this.transId = transId;
		}

		public String getGroupTag() {
			return this.groupTag;
		}

		public void setGroupTag(String groupTag) {
			this.groupTag = groupTag;
		}
	}

	@Override
	public DescribeSamplingLogResponse getInstance(UnmarshallerContext context) {
		return	DescribeSamplingLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
