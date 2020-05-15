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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CheckLinkeBahamutNextstageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckLinkeBahamutNextstageResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String message;

	private Boolean success;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

		private Boolean passed;

		private List<String> content;

		private List<String> warnContent;

		private BatchGuardCheckResult batchGuardCheckResult;

		public Boolean getPassed() {
			return this.passed;
		}

		public void setPassed(Boolean passed) {
			this.passed = passed;
		}

		public List<String> getContent() {
			return this.content;
		}

		public void setContent(List<String> content) {
			this.content = content;
		}

		public List<String> getWarnContent() {
			return this.warnContent;
		}

		public void setWarnContent(List<String> warnContent) {
			this.warnContent = warnContent;
		}

		public BatchGuardCheckResult getBatchGuardCheckResult() {
			return this.batchGuardCheckResult;
		}

		public void setBatchGuardCheckResult(BatchGuardCheckResult batchGuardCheckResult) {
			this.batchGuardCheckResult = batchGuardCheckResult;
		}

		public static class BatchGuardCheckResult {

			private Long failCount;

			private Long passCount;

			private Long total;

			private List<GuardCheckResultListItem> guardCheckResultList;

			public Long getFailCount() {
				return this.failCount;
			}

			public void setFailCount(Long failCount) {
				this.failCount = failCount;
			}

			public Long getPassCount() {
				return this.passCount;
			}

			public void setPassCount(Long passCount) {
				this.passCount = passCount;
			}

			public Long getTotal() {
				return this.total;
			}

			public void setTotal(Long total) {
				this.total = total;
			}

			public List<GuardCheckResultListItem> getGuardCheckResultList() {
				return this.guardCheckResultList;
			}

			public void setGuardCheckResultList(List<GuardCheckResultListItem> guardCheckResultList) {
				this.guardCheckResultList = guardCheckResultList;
			}

			public static class GuardCheckResultListItem {

				private String description;

				private String name;

				private Boolean pass;

				private List<CheckResultsItem> checkResults;

				public String getDescription() {
					return this.description;
				}

				public void setDescription(String description) {
					this.description = description;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public Boolean getPass() {
					return this.pass;
				}

				public void setPass(Boolean pass) {
					this.pass = pass;
				}

				public List<CheckResultsItem> getCheckResults() {
					return this.checkResults;
				}

				public void setCheckResults(List<CheckResultsItem> checkResults) {
					this.checkResults = checkResults;
				}

				public static class CheckResultsItem {

					private Boolean pass;

					private String type;

					private String ruleKey;

					private String ruleName;

					private String solution;

					public Boolean getPass() {
						return this.pass;
					}

					public void setPass(Boolean pass) {
						this.pass = pass;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getRuleKey() {
						return this.ruleKey;
					}

					public void setRuleKey(String ruleKey) {
						this.ruleKey = ruleKey;
					}

					public String getRuleName() {
						return this.ruleName;
					}

					public void setRuleName(String ruleName) {
						this.ruleName = ruleName;
					}

					public String getSolution() {
						return this.solution;
					}

					public void setSolution(String solution) {
						this.solution = solution;
					}
				}
			}
		}
	}

	@Override
	public CheckLinkeBahamutNextstageResponse getInstance(UnmarshallerContext context) {
		return	CheckLinkeBahamutNextstageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
