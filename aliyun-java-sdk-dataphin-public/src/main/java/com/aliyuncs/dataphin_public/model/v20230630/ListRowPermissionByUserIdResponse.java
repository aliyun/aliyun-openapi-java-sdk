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
import com.aliyuncs.dataphin_public.transform.v20230630.ListRowPermissionByUserIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListRowPermissionByUserIdResponse extends AcsResponse {

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

		private Integer totalCount;

		private List<DataItem> data;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String gmtCreate;

			private String gmtModified;

			private String creator;

			private String modifier;

			private Long tenantId;

			private List<RulesItem> rules;

			private List<TablesItem> tables;

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

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getModifier() {
				return this.modifier;
			}

			public void setModifier(String modifier) {
				this.modifier = modifier;
			}

			public Long getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(Long tenantId) {
				this.tenantId = tenantId;
			}

			public List<RulesItem> getRules() {
				return this.rules;
			}

			public void setRules(List<RulesItem> rules) {
				this.rules = rules;
			}

			public List<TablesItem> getTables() {
				return this.tables;
			}

			public void setTables(List<TablesItem> tables) {
				this.tables = tables;
			}

			public static class RulesItem {

				private String ruleName;

				private String scopeType;

				private Boolean isDelete;

				private Integer status;

				private List<ExpressionsItem> expressions;

				private List<UserMappingListItem> userMappingList;

				public String getRuleName() {
					return this.ruleName;
				}

				public void setRuleName(String ruleName) {
					this.ruleName = ruleName;
				}

				public String getScopeType() {
					return this.scopeType;
				}

				public void setScopeType(String scopeType) {
					this.scopeType = scopeType;
				}

				public Boolean getIsDelete() {
					return this.isDelete;
				}

				public void setIsDelete(Boolean isDelete) {
					this.isDelete = isDelete;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}

				public List<ExpressionsItem> getExpressions() {
					return this.expressions;
				}

				public void setExpressions(List<ExpressionsItem> expressions) {
					this.expressions = expressions;
				}

				public List<UserMappingListItem> getUserMappingList() {
					return this.userMappingList;
				}

				public void setUserMappingList(List<UserMappingListItem> userMappingList) {
					this.userMappingList = userMappingList;
				}

				public static class ExpressionsItem {

					private String mappingColumnName;

					private String type;

					private String operator;

					private List<String> values;

					private List<String> subConditions;

					public String getMappingColumnName() {
						return this.mappingColumnName;
					}

					public void setMappingColumnName(String mappingColumnName) {
						this.mappingColumnName = mappingColumnName;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}

					public List<String> getValues() {
						return this.values;
					}

					public void setValues(List<String> values) {
						this.values = values;
					}

					public List<String> getSubConditions() {
						return this.subConditions;
					}

					public void setSubConditions(List<String> subConditions) {
						this.subConditions = subConditions;
					}
				}

				public static class UserMappingListItem {

					private String accountType;

					private List<AccountsItem> accounts;

					public String getAccountType() {
						return this.accountType;
					}

					public void setAccountType(String accountType) {
						this.accountType = accountType;
					}

					public List<AccountsItem> getAccounts() {
						return this.accounts;
					}

					public void setAccounts(List<AccountsItem> accounts) {
						this.accounts = accounts;
					}

					public static class AccountsItem {

						private String accountId;

						public String getAccountId() {
							return this.accountId;
						}

						public void setAccountId(String accountId) {
							this.accountId = accountId;
						}
					}
				}
			}

			public static class TablesItem {

				private String mappingColumnName;

				private String resourceId;

				private String columnName;

				public String getMappingColumnName() {
					return this.mappingColumnName;
				}

				public void setMappingColumnName(String mappingColumnName) {
					this.mappingColumnName = mappingColumnName;
				}

				public String getResourceId() {
					return this.resourceId;
				}

				public void setResourceId(String resourceId) {
					this.resourceId = resourceId;
				}

				public String getColumnName() {
					return this.columnName;
				}

				public void setColumnName(String columnName) {
					this.columnName = columnName;
				}
			}
		}
	}

	@Override
	public ListRowPermissionByUserIdResponse getInstance(UnmarshallerContext context) {
		return	ListRowPermissionByUserIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
