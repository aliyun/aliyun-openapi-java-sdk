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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.GetSQLReviewCheckResultStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSQLReviewCheckResultStatusResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private CheckResultStatus checkResultStatus;

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

	public CheckResultStatus getCheckResultStatus() {
		return this.checkResultStatus;
	}

	public void setCheckResultStatus(CheckResultStatus checkResultStatus) {
		this.checkResultStatus = checkResultStatus;
	}

	public static class CheckResultStatus {

		private Long totalSQLCount;

		private Long checkedCount;

		private CheckStatusResult checkStatusResult;

		private SQLReviewResult sQLReviewResult;

		public Long getTotalSQLCount() {
			return this.totalSQLCount;
		}

		public void setTotalSQLCount(Long totalSQLCount) {
			this.totalSQLCount = totalSQLCount;
		}

		public Long getCheckedCount() {
			return this.checkedCount;
		}

		public void setCheckedCount(Long checkedCount) {
			this.checkedCount = checkedCount;
		}

		public CheckStatusResult getCheckStatusResult() {
			return this.checkStatusResult;
		}

		public void setCheckStatusResult(CheckStatusResult checkStatusResult) {
			this.checkStatusResult = checkStatusResult;
		}

		public SQLReviewResult getSQLReviewResult() {
			return this.sQLReviewResult;
		}

		public void setSQLReviewResult(SQLReviewResult sQLReviewResult) {
			this.sQLReviewResult = sQLReviewResult;
		}

		public static class CheckStatusResult {

			private Long _new;

			private Long unknown;

			private Long checkNotPass;

			private Long checkPass;

			private Long forcePass;

			private Long forceNotPass;

			public Long get_New() {
				return this._new;
			}

			public void set_New(Long _new) {
				this._new = _new;
			}

			public Long getUnknown() {
				return this.unknown;
			}

			public void setUnknown(Long unknown) {
				this.unknown = unknown;
			}

			public Long getCheckNotPass() {
				return this.checkNotPass;
			}

			public void setCheckNotPass(Long checkNotPass) {
				this.checkNotPass = checkNotPass;
			}

			public Long getCheckPass() {
				return this.checkPass;
			}

			public void setCheckPass(Long checkPass) {
				this.checkPass = checkPass;
			}

			public Long getForcePass() {
				return this.forcePass;
			}

			public void setForcePass(Long forcePass) {
				this.forcePass = forcePass;
			}

			public Long getForceNotPass() {
				return this.forceNotPass;
			}

			public void setForceNotPass(Long forceNotPass) {
				this.forceNotPass = forceNotPass;
			}
		}

		public static class SQLReviewResult {

			private Long mustImprove;

			private Long potentialIssue;

			private Long suggestImprove;

			private Long useDmsToolkit;

			private Long useDmsDmlUnlock;

			private Long tableIndexSuggest;

			public Long getMustImprove() {
				return this.mustImprove;
			}

			public void setMustImprove(Long mustImprove) {
				this.mustImprove = mustImprove;
			}

			public Long getPotentialIssue() {
				return this.potentialIssue;
			}

			public void setPotentialIssue(Long potentialIssue) {
				this.potentialIssue = potentialIssue;
			}

			public Long getSuggestImprove() {
				return this.suggestImprove;
			}

			public void setSuggestImprove(Long suggestImprove) {
				this.suggestImprove = suggestImprove;
			}

			public Long getUseDmsToolkit() {
				return this.useDmsToolkit;
			}

			public void setUseDmsToolkit(Long useDmsToolkit) {
				this.useDmsToolkit = useDmsToolkit;
			}

			public Long getUseDmsDmlUnlock() {
				return this.useDmsDmlUnlock;
			}

			public void setUseDmsDmlUnlock(Long useDmsDmlUnlock) {
				this.useDmsDmlUnlock = useDmsDmlUnlock;
			}

			public Long getTableIndexSuggest() {
				return this.tableIndexSuggest;
			}

			public void setTableIndexSuggest(Long tableIndexSuggest) {
				this.tableIndexSuggest = tableIndexSuggest;
			}
		}
	}

	@Override
	public GetSQLReviewCheckResultStatusResponse getInstance(UnmarshallerContext context) {
		return	GetSQLReviewCheckResultStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
