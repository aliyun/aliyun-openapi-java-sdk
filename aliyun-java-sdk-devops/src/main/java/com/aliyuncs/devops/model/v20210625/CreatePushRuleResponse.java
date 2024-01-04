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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.CreatePushRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePushRuleResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Result result;

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

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private List<Rule_infos> ruleInfos;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public List<Rule_infos> getRuleInfos() {
			return this.ruleInfos;
		}

		public void setRuleInfos(List<Rule_infos> ruleInfos) {
			this.ruleInfos = ruleInfos;
		}

		public static class Rule_infos {

			private String checkerName;

			private String checkerType;

			private String extraMessage;

			private List<String> fileRuleRegexes;

			public String getCheckerName() {
				return this.checkerName;
			}

			public void setCheckerName(String checkerName) {
				this.checkerName = checkerName;
			}

			public String getCheckerType() {
				return this.checkerType;
			}

			public void setCheckerType(String checkerType) {
				this.checkerType = checkerType;
			}

			public String getExtraMessage() {
				return this.extraMessage;
			}

			public void setExtraMessage(String extraMessage) {
				this.extraMessage = extraMessage;
			}

			public List<String> getFileRuleRegexes() {
				return this.fileRuleRegexes;
			}

			public void setFileRuleRegexes(List<String> fileRuleRegexes) {
				this.fileRuleRegexes = fileRuleRegexes;
			}
		}
	}

	@Override
	public CreatePushRuleResponse getInstance(UnmarshallerContext context) {
		return	CreatePushRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
