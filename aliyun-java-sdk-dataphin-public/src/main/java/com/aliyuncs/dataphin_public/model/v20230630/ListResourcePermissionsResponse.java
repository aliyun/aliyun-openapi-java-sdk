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
import com.aliyuncs.dataphin_public.transform.v20230630.ListResourcePermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListResourcePermissionsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private PageResult pageResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Long totalCount;

		private List<ResourcePermissionRecord> data;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ResourcePermissionRecord> getData() {
			return this.data;
		}

		public void setData(List<ResourcePermissionRecord> data) {
			this.data = data;
		}

		public static class ResourcePermissionRecord {

			private String authScope;

			private String recordId;

			private List<PermissionPeriod> permissionPeriodList;

			private ResourceInfo resourceInfo;

			private Period period;

			private TargetAccount targetAccount;

			public String getAuthScope() {
				return this.authScope;
			}

			public void setAuthScope(String authScope) {
				this.authScope = authScope;
			}

			public String getRecordId() {
				return this.recordId;
			}

			public void setRecordId(String recordId) {
				this.recordId = recordId;
			}

			public List<PermissionPeriod> getPermissionPeriodList() {
				return this.permissionPeriodList;
			}

			public void setPermissionPeriodList(List<PermissionPeriod> permissionPeriodList) {
				this.permissionPeriodList = permissionPeriodList;
			}

			public ResourceInfo getResourceInfo() {
				return this.resourceInfo;
			}

			public void setResourceInfo(ResourceInfo resourceInfo) {
				this.resourceInfo = resourceInfo;
			}

			public Period getPeriod() {
				return this.period;
			}

			public void setPeriod(Period period) {
				this.period = period;
			}

			public TargetAccount getTargetAccount() {
				return this.targetAccount;
			}

			public void setTargetAccount(TargetAccount targetAccount) {
				this.targetAccount = targetAccount;
			}

			public static class PermissionPeriod {

				private String permissionType;

				private Period1 period1;

				public String getPermissionType() {
					return this.permissionType;
				}

				public void setPermissionType(String permissionType) {
					this.permissionType = permissionType;
				}

				public Period1 getPeriod1() {
					return this.period1;
				}

				public void setPeriod1(Period1 period1) {
					this.period1 = period1;
				}

				public static class Period1 {

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

			public static class ResourceInfo {

				private String type;

				private String displayName;

				private String id;

				private String env;

				private String name;

				private BizUnitInfo bizUnitInfo;

				private ProjectInfo projectInfo;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getDisplayName() {
					return this.displayName;
				}

				public void setDisplayName(String displayName) {
					this.displayName = displayName;
				}

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getEnv() {
					return this.env;
				}

				public void setEnv(String env) {
					this.env = env;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
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

					private String displayName;

					private String id;

					private String env;

					private String name;

					public String getDisplayName() {
						return this.displayName;
					}

					public void setDisplayName(String displayName) {
						this.displayName = displayName;
					}

					public String getId() {
						return this.id;
					}

					public void setId(String id) {
						this.id = id;
					}

					public String getEnv() {
						return this.env;
					}

					public void setEnv(String env) {
						this.env = env;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
				}

				public static class ProjectInfo {

					private String displayName;

					private Long id;

					private String env;

					private String name;

					public String getDisplayName() {
						return this.displayName;
					}

					public void setDisplayName(String displayName) {
						this.displayName = displayName;
					}

					public Long getId() {
						return this.id;
					}

					public void setId(Long id) {
						this.id = id;
					}

					public String getEnv() {
						return this.env;
					}

					public void setEnv(String env) {
						this.env = env;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}
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

			public static class TargetAccount {

				private String type;

				private String id;

				private String name;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

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
			}
		}
	}

	@Override
	public ListResourcePermissionsResponse getInstance(UnmarshallerContext context) {
		return	ListResourcePermissionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
