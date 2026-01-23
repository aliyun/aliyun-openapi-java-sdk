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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListQualityWatchTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQualityWatchTasksResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private PageResult pageResult;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<QualityWatchTask> qualityWatchTaskList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<QualityWatchTask> getQualityWatchTaskList() {
			return this.qualityWatchTaskList;
		}

		public void setQualityWatchTaskList(List<QualityWatchTask> qualityWatchTaskList) {
			this.qualityWatchTaskList = qualityWatchTaskList;
		}

		public static class QualityWatchTask {

			private Long id;

			private Long watchId;

			private String startTime;

			private String endTime;

			private String qualityOwner;

			private String qualityOwnerName;

			private String status;

			private String bizDate;

			private String bizDateFormat;

			private String creator;

			private String createTime;

			private String modifyTime;

			private String modifier;

			private List<Long> ruleIdList;

			private RuleCountInfo ruleCountInfo;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getWatchId() {
				return this.watchId;
			}

			public void setWatchId(Long watchId) {
				this.watchId = watchId;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getQualityOwner() {
				return this.qualityOwner;
			}

			public void setQualityOwner(String qualityOwner) {
				this.qualityOwner = qualityOwner;
			}

			public String getQualityOwnerName() {
				return this.qualityOwnerName;
			}

			public void setQualityOwnerName(String qualityOwnerName) {
				this.qualityOwnerName = qualityOwnerName;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getBizDate() {
				return this.bizDate;
			}

			public void setBizDate(String bizDate) {
				this.bizDate = bizDate;
			}

			public String getBizDateFormat() {
				return this.bizDateFormat;
			}

			public void setBizDateFormat(String bizDateFormat) {
				this.bizDateFormat = bizDateFormat;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public List<Long> getRuleIdList() {
				return this.ruleIdList;
			}

			public void setRuleIdList(List<Long> ruleIdList) {
				this.ruleIdList = ruleIdList;
			}

			public RuleCountInfo getRuleCountInfo() {
				return this.ruleCountInfo;
			}

			public void setRuleCountInfo(RuleCountInfo ruleCountInfo) {
				this.ruleCountInfo = ruleCountInfo;
			}

			public static class RuleCountInfo {

				private ValidateRuleCount validateRuleCount;

				private StrongRuleCount strongRuleCount;

				private WeakRuleCount weakRuleCount;

				public ValidateRuleCount getValidateRuleCount() {
					return this.validateRuleCount;
				}

				public void setValidateRuleCount(ValidateRuleCount validateRuleCount) {
					this.validateRuleCount = validateRuleCount;
				}

				public StrongRuleCount getStrongRuleCount() {
					return this.strongRuleCount;
				}

				public void setStrongRuleCount(StrongRuleCount strongRuleCount) {
					this.strongRuleCount = strongRuleCount;
				}

				public WeakRuleCount getWeakRuleCount() {
					return this.weakRuleCount;
				}

				public void setWeakRuleCount(WeakRuleCount weakRuleCount) {
					this.weakRuleCount = weakRuleCount;
				}

				public static class ValidateRuleCount {

					private Long totalRuleCount;

					private Long finishedRuleCount;

					private Long errorRuleCount;

					private Long successRuleCount;

					public Long getTotalRuleCount() {
						return this.totalRuleCount;
					}

					public void setTotalRuleCount(Long totalRuleCount) {
						this.totalRuleCount = totalRuleCount;
					}

					public Long getFinishedRuleCount() {
						return this.finishedRuleCount;
					}

					public void setFinishedRuleCount(Long finishedRuleCount) {
						this.finishedRuleCount = finishedRuleCount;
					}

					public Long getErrorRuleCount() {
						return this.errorRuleCount;
					}

					public void setErrorRuleCount(Long errorRuleCount) {
						this.errorRuleCount = errorRuleCount;
					}

					public Long getSuccessRuleCount() {
						return this.successRuleCount;
					}

					public void setSuccessRuleCount(Long successRuleCount) {
						this.successRuleCount = successRuleCount;
					}
				}

				public static class StrongRuleCount {

					private Long totalRuleCount;

					private Long finishedRuleCount;

					private Long errorRuleCount;

					private Long successRuleCount;

					public Long getTotalRuleCount() {
						return this.totalRuleCount;
					}

					public void setTotalRuleCount(Long totalRuleCount) {
						this.totalRuleCount = totalRuleCount;
					}

					public Long getFinishedRuleCount() {
						return this.finishedRuleCount;
					}

					public void setFinishedRuleCount(Long finishedRuleCount) {
						this.finishedRuleCount = finishedRuleCount;
					}

					public Long getErrorRuleCount() {
						return this.errorRuleCount;
					}

					public void setErrorRuleCount(Long errorRuleCount) {
						this.errorRuleCount = errorRuleCount;
					}

					public Long getSuccessRuleCount() {
						return this.successRuleCount;
					}

					public void setSuccessRuleCount(Long successRuleCount) {
						this.successRuleCount = successRuleCount;
					}
				}

				public static class WeakRuleCount {

					private Long totalRuleCount;

					private Long finishedRuleCount;

					private Long errorRuleCount;

					private Long successRuleCount;

					public Long getTotalRuleCount() {
						return this.totalRuleCount;
					}

					public void setTotalRuleCount(Long totalRuleCount) {
						this.totalRuleCount = totalRuleCount;
					}

					public Long getFinishedRuleCount() {
						return this.finishedRuleCount;
					}

					public void setFinishedRuleCount(Long finishedRuleCount) {
						this.finishedRuleCount = finishedRuleCount;
					}

					public Long getErrorRuleCount() {
						return this.errorRuleCount;
					}

					public void setErrorRuleCount(Long errorRuleCount) {
						this.errorRuleCount = errorRuleCount;
					}

					public Long getSuccessRuleCount() {
						return this.successRuleCount;
					}

					public void setSuccessRuleCount(Long successRuleCount) {
						this.successRuleCount = successRuleCount;
					}
				}
			}
		}
	}

	@Override
	public ListQualityWatchTasksResponse getInstance(UnmarshallerContext context) {
		return	ListQualityWatchTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
