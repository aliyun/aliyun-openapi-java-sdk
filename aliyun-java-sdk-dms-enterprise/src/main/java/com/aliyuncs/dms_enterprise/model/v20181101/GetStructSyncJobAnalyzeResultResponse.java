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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetStructSyncJobAnalyzeResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStructSyncJobAnalyzeResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String errorCode;

	private StructSyncJobAnalyzeResult structSyncJobAnalyzeResult;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public StructSyncJobAnalyzeResult getStructSyncJobAnalyzeResult() {
		return this.structSyncJobAnalyzeResult;
	}

	public void setStructSyncJobAnalyzeResult(StructSyncJobAnalyzeResult structSyncJobAnalyzeResult) {
		this.structSyncJobAnalyzeResult = structSyncJobAnalyzeResult;
	}

	public static class StructSyncJobAnalyzeResult {

		private List<Summary> summaryList;

		private List<Result> resultList;

		public List<Summary> getSummaryList() {
			return this.summaryList;
		}

		public void setSummaryList(List<Summary> summaryList) {
			this.summaryList = summaryList;
		}

		public List<Result> getResultList() {
			return this.resultList;
		}

		public void setResultList(List<Result> resultList) {
			this.resultList = resultList;
		}

		public static class Summary {

			private String compareType;

			private Long count;

			public String getCompareType() {
				return this.compareType;
			}

			public void setCompareType(String compareType) {
				this.compareType = compareType;
			}

			public Long getCount() {
				return this.count;
			}

			public void setCount(Long count) {
				this.count = count;
			}
		}

		public static class Result {

			private String sourceTableName;

			private String targetTableName;

			private String script;

			public String getSourceTableName() {
				return this.sourceTableName;
			}

			public void setSourceTableName(String sourceTableName) {
				this.sourceTableName = sourceTableName;
			}

			public String getTargetTableName() {
				return this.targetTableName;
			}

			public void setTargetTableName(String targetTableName) {
				this.targetTableName = targetTableName;
			}

			public String getScript() {
				return this.script;
			}

			public void setScript(String script) {
				this.script = script;
			}
		}
	}

	@Override
	public GetStructSyncJobAnalyzeResultResponse getInstance(UnmarshallerContext context) {
		return	GetStructSyncJobAnalyzeResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
