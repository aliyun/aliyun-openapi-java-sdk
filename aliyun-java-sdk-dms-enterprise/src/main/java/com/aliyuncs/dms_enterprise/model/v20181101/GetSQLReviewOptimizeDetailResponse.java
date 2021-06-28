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
import com.aliyuncs.dms_enterprise.transform.v20181101.GetSQLReviewOptimizeDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSQLReviewOptimizeDetailResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private OptimizeDetail optimizeDetail;

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

	public OptimizeDetail getOptimizeDetail() {
		return this.optimizeDetail;
	}

	public void setOptimizeDetail(OptimizeDetail optimizeDetail) {
		this.optimizeDetail = optimizeDetail;
	}

	public static class OptimizeDetail {

		private String queryKey;

		private Integer instanceId;

		private Integer dbId;

		private String sqlType;

		private QualityResult qualityResult;

		public String getQueryKey() {
			return this.queryKey;
		}

		public void setQueryKey(String queryKey) {
			this.queryKey = queryKey;
		}

		public Integer getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(Integer instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getDbId() {
			return this.dbId;
		}

		public void setDbId(Integer dbId) {
			this.dbId = dbId;
		}

		public String getSqlType() {
			return this.sqlType;
		}

		public void setSqlType(String sqlType) {
			this.sqlType = sqlType;
		}

		public QualityResult getQualityResult() {
			return this.qualityResult;
		}

		public void setQualityResult(QualityResult qualityResult) {
			this.qualityResult = qualityResult;
		}

		public static class QualityResult {

			private String errorMessage;

			private Boolean occurError;

			private List<ResultsItem> results;

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public Boolean getOccurError() {
				return this.occurError;
			}

			public void setOccurError(Boolean occurError) {
				this.occurError = occurError;
			}

			public List<ResultsItem> getResults() {
				return this.results;
			}

			public void setResults(List<ResultsItem> results) {
				this.results = results;
			}

			public static class ResultsItem {

				private String ruleName;

				private String feedback;

				private String comments;

				private String ruleType;

				private List<ScriptsItem> scripts;

				private List<String> messages;

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public String getFeedback() {
					return this.feedback;
				}

				public void setFeedback(String feedback) {
					this.feedback = feedback;
				}

				public String getComments() {
					return this.comments;
				}

				public void setComments(String comments) {
					this.comments = comments;
				}

				public String getRuleType() {
					return this.ruleType;
				}

				public void setRuleType(String ruleType) {
					this.ruleType = ruleType;
				}

				public List<ScriptsItem> getScripts() {
					return this.scripts;
				}

				public void setScripts(List<ScriptsItem> scripts) {
					this.scripts = scripts;
				}

				public List<String> getMessages() {
					return this.messages;
				}

				public void setMessages(List<String> messages) {
					this.messages = messages;
				}

				public static class ScriptsItem {

					private String opType;

					private String content;

					private String tableName;

					public String getOpType() {
						return this.opType;
					}

					public void setOpType(String opType) {
						this.opType = opType;
					}

					public String getContent() {
						return this.content;
					}

					public void setContent(String content) {
						this.content = content;
					}

					public String getTableName() {
						return this.tableName;
					}

					public void setTableName(String tableName) {
						this.tableName = tableName;
					}
				}
			}
		}
	}

	@Override
	public GetSQLReviewOptimizeDetailResponse getInstance(UnmarshallerContext context) {
		return	GetSQLReviewOptimizeDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
