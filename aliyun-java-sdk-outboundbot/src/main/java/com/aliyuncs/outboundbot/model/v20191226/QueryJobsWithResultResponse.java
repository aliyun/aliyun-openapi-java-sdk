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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.QueryJobsWithResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryJobsWithResultResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<String> variableNames;

	private Jobs jobs;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<String> getVariableNames() {
		return this.variableNames;
	}

	public void setVariableNames(List<String> variableNames) {
		this.variableNames = variableNames;
	}

	public Jobs getJobs() {
		return this.jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public static class Jobs {

		private Integer pageCount;

		private Integer pageNumber;

		private Integer pageSize;

		private Integer rowCount;

		private List<Job> list;

		public Integer getPageCount() {
			return this.pageCount;
		}

		public void setPageCount(Integer pageCount) {
			this.pageCount = pageCount;
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

		public Integer getRowCount() {
			return this.rowCount;
		}

		public void setRowCount(Integer rowCount) {
			this.rowCount = rowCount;
		}

		public List<Job> getList() {
			return this.list;
		}

		public void setList(List<Job> list) {
			this.list = list;
		}

		public static class Job {

			private String jobFailureReason;

			private String statusName;

			private String id;

			private String status;

			private LatestTask latestTask;

			public String getJobFailureReason() {
				return this.jobFailureReason;
			}

			public void setJobFailureReason(String jobFailureReason) {
				this.jobFailureReason = jobFailureReason;
			}

			public String getStatusName() {
				return this.statusName;
			}

			public void setStatusName(String statusName) {
				this.statusName = statusName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public LatestTask getLatestTask() {
				return this.latestTask;
			}

			public void setLatestTask(LatestTask latestTask) {
				this.latestTask = latestTask;
			}

			public static class LatestTask {

				private String taskEndReason;

				private Integer callDuration;

				private String callDurationDisplay;

				private String statusName;

				private Boolean hasAnswered;

				private Boolean hasReachedEndOfFlow;

				private Long callTime;

				private Boolean hasHangUpByRejection;

				private String status;

				private List<Extra> extras;

				private Contact contact;

				public String getTaskEndReason() {
					return this.taskEndReason;
				}

				public void setTaskEndReason(String taskEndReason) {
					this.taskEndReason = taskEndReason;
				}

				public Integer getCallDuration() {
					return this.callDuration;
				}

				public void setCallDuration(Integer callDuration) {
					this.callDuration = callDuration;
				}

				public String getCallDurationDisplay() {
					return this.callDurationDisplay;
				}

				public void setCallDurationDisplay(String callDurationDisplay) {
					this.callDurationDisplay = callDurationDisplay;
				}

				public String getStatusName() {
					return this.statusName;
				}

				public void setStatusName(String statusName) {
					this.statusName = statusName;
				}

				public Boolean getHasAnswered() {
					return this.hasAnswered;
				}

				public void setHasAnswered(Boolean hasAnswered) {
					this.hasAnswered = hasAnswered;
				}

				public Boolean getHasReachedEndOfFlow() {
					return this.hasReachedEndOfFlow;
				}

				public void setHasReachedEndOfFlow(Boolean hasReachedEndOfFlow) {
					this.hasReachedEndOfFlow = hasReachedEndOfFlow;
				}

				public Long getCallTime() {
					return this.callTime;
				}

				public void setCallTime(Long callTime) {
					this.callTime = callTime;
				}

				public Boolean getHasHangUpByRejection() {
					return this.hasHangUpByRejection;
				}

				public void setHasHangUpByRejection(Boolean hasHangUpByRejection) {
					this.hasHangUpByRejection = hasHangUpByRejection;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public List<Extra> getExtras() {
					return this.extras;
				}

				public void setExtras(List<Extra> extras) {
					this.extras = extras;
				}

				public Contact getContact() {
					return this.contact;
				}

				public void setContact(Contact contact) {
					this.contact = contact;
				}

				public static class Extra {

					private String key;

					private String value;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class Contact {

					private String preferredPhoneNumber;

					private String jobUuid;

					private String phoneNumber;

					private String role;

					private Integer round;

					private String name;

					private String id;

					private String state;

					private String referenceId;

					private String honorific;

					public String getPreferredPhoneNumber() {
						return this.preferredPhoneNumber;
					}

					public void setPreferredPhoneNumber(String preferredPhoneNumber) {
						this.preferredPhoneNumber = preferredPhoneNumber;
					}

					public String getJobUuid() {
						return this.jobUuid;
					}

					public void setJobUuid(String jobUuid) {
						this.jobUuid = jobUuid;
					}

					public String getPhoneNumber() {
						return this.phoneNumber;
					}

					public void setPhoneNumber(String phoneNumber) {
						this.phoneNumber = phoneNumber;
					}

					public String getRole() {
						return this.role;
					}

					public void setRole(String role) {
						this.role = role;
					}

					public Integer getRound() {
						return this.round;
					}

					public void setRound(Integer round) {
						this.round = round;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getState() {
						return this.state;
					}

					public void setState(String state) {
						this.state = state;
					}

					public String getReferenceId() {
						return this.referenceId;
					}

					public void setReferenceId(String referenceId) {
						this.referenceId = referenceId;
					}

					public String getHonorific() {
						return this.honorific;
					}

					public void setHonorific(String honorific) {
						this.honorific = honorific;
					}
				}
			}
		}
	}

	@Override
	public QueryJobsWithResultResponse getInstance(UnmarshallerContext context) {
		return	QueryJobsWithResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
