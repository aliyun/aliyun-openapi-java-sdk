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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.UpdateMarkResultByAdminResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateMarkResultByAdminResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean canCommit;

		private String commitMsg;

		private Boolean allUpdateSucc;

		private List<FailListItem> failList;

		public Boolean getCanCommit() {
			return this.canCommit;
		}

		public void setCanCommit(Boolean canCommit) {
			this.canCommit = canCommit;
		}

		public String getCommitMsg() {
			return this.commitMsg;
		}

		public void setCommitMsg(String commitMsg) {
			this.commitMsg = commitMsg;
		}

		public Boolean getAllUpdateSucc() {
			return this.allUpdateSucc;
		}

		public void setAllUpdateSucc(Boolean allUpdateSucc) {
			this.allUpdateSucc = allUpdateSucc;
		}

		public List<FailListItem> getFailList() {
			return this.failList;
		}

		public void setFailList(List<FailListItem> failList) {
			this.failList = failList;
		}

		public static class FailListItem {

			private String markResultId;

			private String questionId;

			private String markResult;

			private String questionTitle;

			private String questionType;

			private String version;

			public String getMarkResultId() {
				return this.markResultId;
			}

			public void setMarkResultId(String markResultId) {
				this.markResultId = markResultId;
			}

			public String getQuestionId() {
				return this.questionId;
			}

			public void setQuestionId(String questionId) {
				this.questionId = questionId;
			}

			public String getMarkResult() {
				return this.markResult;
			}

			public void setMarkResult(String markResult) {
				this.markResult = markResult;
			}

			public String getQuestionTitle() {
				return this.questionTitle;
			}

			public void setQuestionTitle(String questionTitle) {
				this.questionTitle = questionTitle;
			}

			public String getQuestionType() {
				return this.questionType;
			}

			public void setQuestionType(String questionType) {
				this.questionType = questionType;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public UpdateMarkResultByAdminResponse getInstance(UnmarshallerContext context) {
		return	UpdateMarkResultByAdminResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
