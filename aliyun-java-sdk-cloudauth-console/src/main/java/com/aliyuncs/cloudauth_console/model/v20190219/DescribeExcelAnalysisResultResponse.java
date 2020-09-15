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

package com.aliyuncs.cloudauth_console.model.v20190219;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth_console.transform.v20190219.DescribeExcelAnalysisResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExcelAnalysisResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private ExcelResult excelResult;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public ExcelResult getExcelResult() {
		return this.excelResult;
	}

	public void setExcelResult(ExcelResult excelResult) {
		this.excelResult = excelResult;
	}

	public static class ExcelResult {

		private Integer total;

		private Integer updateCount;

		private Integer insertCount;

		private Integer errorCount;

		private List<String> errorLine;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getUpdateCount() {
			return this.updateCount;
		}

		public void setUpdateCount(Integer updateCount) {
			this.updateCount = updateCount;
		}

		public Integer getInsertCount() {
			return this.insertCount;
		}

		public void setInsertCount(Integer insertCount) {
			this.insertCount = insertCount;
		}

		public Integer getErrorCount() {
			return this.errorCount;
		}

		public void setErrorCount(Integer errorCount) {
			this.errorCount = errorCount;
		}

		public List<String> getErrorLine() {
			return this.errorLine;
		}

		public void setErrorLine(List<String> errorLine) {
			this.errorLine = errorLine;
		}
	}

	@Override
	public DescribeExcelAnalysisResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeExcelAnalysisResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
