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
import com.aliyuncs.dataphin_public.transform.v20230630.ListResourcePermissionOperationLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourcePermissionOperationLogResponse extends AcsResponse {

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

		private List<PermissionOperateLog> data;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<PermissionOperateLog> getData() {
			return this.data;
		}

		public void setData(List<PermissionOperateLog> data) {
			this.data = data;
		}

		public static class PermissionOperateLog {

			private Long operateId;

			private String operateType;

			private String reason;

			private Long operateTime;

			private String authScope;

			private ResourceInfo resourceInfo;

			private Account account;

			private TargetAccount targetAccount;

			private Period period;

			public Long getOperateId() {
				return this.operateId;
			}

			public void setOperateId(Long operateId) {
				this.operateId = operateId;
			}

			public String getOperateType() {
				return this.operateType;
			}

			public void setOperateType(String operateType) {
				this.operateType = operateType;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public Long getOperateTime() {
				return this.operateTime;
			}

			public void setOperateTime(Long operateTime) {
				this.operateTime = operateTime;
			}

			public String getAuthScope() {
				return this.authScope;
			}

			public void setAuthScope(String authScope) {
				this.authScope = authScope;
			}

			public ResourceInfo getResourceInfo() {
				return this.resourceInfo;
			}

			public void setResourceInfo(ResourceInfo resourceInfo) {
				this.resourceInfo = resourceInfo;
			}

			public Account getAccount() {
				return this.account;
			}

			public void setAccount(Account account) {
				this.account = account;
			}

			public TargetAccount getTargetAccount() {
				return this.targetAccount;
			}

			public void setTargetAccount(TargetAccount targetAccount) {
				this.targetAccount = targetAccount;
			}

			public Period getPeriod() {
				return this.period;
			}

			public void setPeriod(Period period) {
				this.period = period;
			}

			public static class ResourceInfo {

				private String id;

				private String name;

				private String displayName;

				private String type;

				private String env;

				private BizUnitInfo bizUnitInfo;

				private ProjectInfo projectInfo;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getEnv() {
					return this.env;
				}

				public void setEnv(String env) {
					this.env = env;
				}

				public BizUnitInfo getBizUnitInfo() {
					return this.bizUnitInfo;
				}

				public void setBizUnitInfo(BizUnitInfo bizUnitInfo) {
					this.bizUnitInfo = bizUnitInfo;
				}

				public ProjectInfo getProjectInfo() {
					return this.projectInfo;
				}

				public void setProjectInfo(ProjectInfo projectInfo) {
					this.projectInfo = projectInfo;
				}

				public static class BizUnitInfo {

					private String id;

					private String name;

					private String displayName;

					private String env;

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getDisplayName() {
						return this.displayName;
					}

					public void setDisplayName(String displayName) {
						this.displayName = displayName;
					}

					public String getEnv() {
						return this.env;
					}

					public void setEnv(String env) {
						this.env = env;
					}
				}

				public static class ProjectInfo {

					private Long id;

					private String name;

					private String displayName;

					private String env;

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getDisplayName() {
						return this.displayName;
					}

					public void setDisplayName(String displayName) {
						this.displayName = displayName;
					}

					public String getEnv() {
						return this.env;
					}

					public void setEnv(String env) {
						this.env = env;
					}
				}
			}

			public static class Account {

				private String id;

				private String name;

				private String type;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class TargetAccount {

				private String id;

				private String name;

				private String type;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class Period {

				private String type;

				private String endTime;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}
		}
	}

	@Override
	public ListResourcePermissionOperationLogResponse getInstance(UnmarshallerContext context) {
		return	ListResourcePermissionOperationLogResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
