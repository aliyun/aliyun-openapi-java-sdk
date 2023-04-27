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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetDataExportPreCheckDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDataExportPreCheckDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private PreCheckResult preCheckResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public PreCheckResult getPreCheckResult() {
		return this.preCheckResult;
	}

	public void setPreCheckResult(PreCheckResult preCheckResult) {
		this.preCheckResult = preCheckResult;
	}

	public static class PreCheckResult {

		private Boolean ignoreAffectRows;

		private List<PreCheckDetailListItem> preCheckDetailList;

		public Boolean getIgnoreAffectRows() {
			return this.ignoreAffectRows;
		}

		public void setIgnoreAffectRows(Boolean ignoreAffectRows) {
			this.ignoreAffectRows = ignoreAffectRows;
		}

		public List<PreCheckDetailListItem> getPreCheckDetailList() {
			return this.preCheckDetailList;
		}

		public void setPreCheckDetailList(List<PreCheckDetailListItem> preCheckDetailList) {
			this.preCheckDetailList = preCheckDetailList;
		}

		public static class PreCheckDetailListItem {

			private Long affectRows;

			private String sQL;

			public Long getAffectRows() {
				return this.affectRows;
			}

			public void setAffectRows(Long affectRows) {
				this.affectRows = affectRows;
			}

			public String getSQL() {
				return this.sQL;
			}

			public void setSQL(String sQL) {
				this.sQL = sQL;
			}
		}
	}

	@Override
	public GetDataExportPreCheckDetailResponse getInstance(UnmarshallerContext context) {
		return	GetDataExportPreCheckDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
