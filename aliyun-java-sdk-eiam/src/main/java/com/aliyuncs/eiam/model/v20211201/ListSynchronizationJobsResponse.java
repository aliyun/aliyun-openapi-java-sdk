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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListSynchronizationJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSynchronizationJobsResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private List<SynchronizationJob> synchronizationJobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<SynchronizationJob> getSynchronizationJobs() {
		return this.synchronizationJobs;
	}

	public void setSynchronizationJobs(List<SynchronizationJob> synchronizationJobs) {
		this.synchronizationJobs = synchronizationJobs;
	}

	public static class SynchronizationJob {

		private String synchronizationJobId;

		private String targetType;

		private String targetId;

		private String direction;

		private Long startTime;

		private Long endTime;

		private String triggerType;

		private String status;

		private Result result;

		public String getSynchronizationJobId() {
			return this.synchronizationJobId;
		}

		public void setSynchronizationJobId(String synchronizationJobId) {
			this.synchronizationJobId = synchronizationJobId;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getDirection() {
			return this.direction;
		}

		public void setDirection(String direction) {
			this.direction = direction;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getTriggerType() {
			return this.triggerType;
		}

		public void setTriggerType(String triggerType) {
			this.triggerType = triggerType;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public static class Result {

			private String errorMessage;

			private String errorCode;

			private UserStatistics userStatistics;

			private OrganizationalUnitStatistics organizationalUnitStatistics;

			private GroupStatistics groupStatistics;

			private GroupMemberStatistics groupMemberStatistics;

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

			public UserStatistics getUserStatistics() {
				return this.userStatistics;
			}

			public void setUserStatistics(UserStatistics userStatistics) {
				this.userStatistics = userStatistics;
			}

			public OrganizationalUnitStatistics getOrganizationalUnitStatistics() {
				return this.organizationalUnitStatistics;
			}

			public void setOrganizationalUnitStatistics(OrganizationalUnitStatistics organizationalUnitStatistics) {
				this.organizationalUnitStatistics = organizationalUnitStatistics;
			}

			public GroupStatistics getGroupStatistics() {
				return this.groupStatistics;
			}

			public void setGroupStatistics(GroupStatistics groupStatistics) {
				this.groupStatistics = groupStatistics;
			}

			public GroupMemberStatistics getGroupMemberStatistics() {
				return this.groupMemberStatistics;
			}

			public void setGroupMemberStatistics(GroupMemberStatistics groupMemberStatistics) {
				this.groupMemberStatistics = groupMemberStatistics;
			}

			public static class UserStatistics {

				private Created created;

				private Updated updated;

				private Binded binded;

				private Deleted deleted;

				private Same same;

				private Pushed pushed;

				public Created getCreated() {
					return this.created;
				}

				public void setCreated(Created created) {
					this.created = created;
				}

				public Updated getUpdated() {
					return this.updated;
				}

				public void setUpdated(Updated updated) {
					this.updated = updated;
				}

				public Binded getBinded() {
					return this.binded;
				}

				public void setBinded(Binded binded) {
					this.binded = binded;
				}

				public Deleted getDeleted() {
					return this.deleted;
				}

				public void setDeleted(Deleted deleted) {
					this.deleted = deleted;
				}

				public Same getSame() {
					return this.same;
				}

				public void setSame(Same same) {
					this.same = same;
				}

				public Pushed getPushed() {
					return this.pushed;
				}

				public void setPushed(Pushed pushed) {
					this.pushed = pushed;
				}

				public static class Created {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Updated {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Binded {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Deleted {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Same {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Pushed {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}
			}

			public static class OrganizationalUnitStatistics {

				private Created1 created1;

				private Updated2 updated2;

				private Binded3 binded3;

				private Deleted4 deleted4;

				private Same5 same5;

				private Pushed6 pushed6;

				public Created1 getCreated1() {
					return this.created1;
				}

				public void setCreated1(Created1 created1) {
					this.created1 = created1;
				}

				public Updated2 getUpdated2() {
					return this.updated2;
				}

				public void setUpdated2(Updated2 updated2) {
					this.updated2 = updated2;
				}

				public Binded3 getBinded3() {
					return this.binded3;
				}

				public void setBinded3(Binded3 binded3) {
					this.binded3 = binded3;
				}

				public Deleted4 getDeleted4() {
					return this.deleted4;
				}

				public void setDeleted4(Deleted4 deleted4) {
					this.deleted4 = deleted4;
				}

				public Same5 getSame5() {
					return this.same5;
				}

				public void setSame5(Same5 same5) {
					this.same5 = same5;
				}

				public Pushed6 getPushed6() {
					return this.pushed6;
				}

				public void setPushed6(Pushed6 pushed6) {
					this.pushed6 = pushed6;
				}

				public static class Created1 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Updated2 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Binded3 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Deleted4 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Same5 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Pushed6 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}
			}

			public static class GroupStatistics {

				private Created7 created7;

				private Updated8 updated8;

				private Binded9 binded9;

				private Deleted10 deleted10;

				private Same11 same11;

				private Pushed12 pushed12;

				public Created7 getCreated7() {
					return this.created7;
				}

				public void setCreated7(Created7 created7) {
					this.created7 = created7;
				}

				public Updated8 getUpdated8() {
					return this.updated8;
				}

				public void setUpdated8(Updated8 updated8) {
					this.updated8 = updated8;
				}

				public Binded9 getBinded9() {
					return this.binded9;
				}

				public void setBinded9(Binded9 binded9) {
					this.binded9 = binded9;
				}

				public Deleted10 getDeleted10() {
					return this.deleted10;
				}

				public void setDeleted10(Deleted10 deleted10) {
					this.deleted10 = deleted10;
				}

				public Same11 getSame11() {
					return this.same11;
				}

				public void setSame11(Same11 same11) {
					this.same11 = same11;
				}

				public Pushed12 getPushed12() {
					return this.pushed12;
				}

				public void setPushed12(Pushed12 pushed12) {
					this.pushed12 = pushed12;
				}

				public static class Created7 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Updated8 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Binded9 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Deleted10 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Same11 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Pushed12 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}
			}

			public static class GroupMemberStatistics {

				private Created13 created13;

				private Updated14 updated14;

				private Binded15 binded15;

				private Deleted16 deleted16;

				private Same17 same17;

				private Pushed18 pushed18;

				public Created13 getCreated13() {
					return this.created13;
				}

				public void setCreated13(Created13 created13) {
					this.created13 = created13;
				}

				public Updated14 getUpdated14() {
					return this.updated14;
				}

				public void setUpdated14(Updated14 updated14) {
					this.updated14 = updated14;
				}

				public Binded15 getBinded15() {
					return this.binded15;
				}

				public void setBinded15(Binded15 binded15) {
					this.binded15 = binded15;
				}

				public Deleted16 getDeleted16() {
					return this.deleted16;
				}

				public void setDeleted16(Deleted16 deleted16) {
					this.deleted16 = deleted16;
				}

				public Same17 getSame17() {
					return this.same17;
				}

				public void setSame17(Same17 same17) {
					this.same17 = same17;
				}

				public Pushed18 getPushed18() {
					return this.pushed18;
				}

				public void setPushed18(Pushed18 pushed18) {
					this.pushed18 = pushed18;
				}

				public static class Created13 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Updated14 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Binded15 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Deleted16 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Same17 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}

				public static class Pushed18 {

					private Long total;

					private Long success;

					private Long failed;

					private Long skipped;

					public Long getTotal() {
						return this.total;
					}

					public void setTotal(Long total) {
						this.total = total;
					}

					public Long getSuccess() {
						return this.success;
					}

					public void setSuccess(Long success) {
						this.success = success;
					}

					public Long getFailed() {
						return this.failed;
					}

					public void setFailed(Long failed) {
						this.failed = failed;
					}

					public Long getSkipped() {
						return this.skipped;
					}

					public void setSkipped(Long skipped) {
						this.skipped = skipped;
					}
				}
			}
		}
	}

	@Override
	public ListSynchronizationJobsResponse getInstance(UnmarshallerContext context) {
		return	ListSynchronizationJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
