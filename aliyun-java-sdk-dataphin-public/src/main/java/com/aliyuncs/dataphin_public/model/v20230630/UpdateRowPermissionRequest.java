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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateRowPermissionRequest extends RpcAcsRequest<UpdateRowPermissionResponse> {
	   

	private Long opTenantId;

	@SerializedName("updateRowPermissionCommand")
	private UpdateRowPermissionCommand updateRowPermissionCommand;
	public UpdateRowPermissionRequest() {
		super("dataphin-public", "2023-06-30", "UpdateRowPermission");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getOpTenantId() {
		return this.opTenantId;
	}

	public void setOpTenantId(Long opTenantId) {
		this.opTenantId = opTenantId;
		if(opTenantId != null){
			putQueryParameter("OpTenantId", opTenantId.toString());
		}
	}

	public UpdateRowPermissionCommand getUpdateRowPermissionCommand() {
		return this.updateRowPermissionCommand;
	}

	public void setUpdateRowPermissionCommand(UpdateRowPermissionCommand updateRowPermissionCommand) {
		this.updateRowPermissionCommand = updateRowPermissionCommand;	
		if (updateRowPermissionCommand != null) {
			putBodyParameter("UpdateRowPermissionCommand" , new Gson().toJson(updateRowPermissionCommand));
		}	
	}

	public static class UpdateRowPermissionCommand {

		@SerializedName("RowPermissionName")
		private String rowPermissionName;

		@SerializedName("Tables")
		private List<TablesItem> tables;

		@SerializedName("RowPermissionId")
		private Long rowPermissionId;

		@SerializedName("MappingColumns")
		private List<MappingColumnsItem> mappingColumns;

		@SerializedName("Rules")
		private List<RulesItem> rules;

		@SerializedName("RowPermissionDesc")
		private String rowPermissionDesc;

		public String getRowPermissionName() {
			return this.rowPermissionName;
		}

		public void setRowPermissionName(String rowPermissionName) {
			this.rowPermissionName = rowPermissionName;
		}

		public List<TablesItem> getTables() {
			return this.tables;
		}

		public void setTables(List<TablesItem> tables) {
			this.tables = tables;
		}

		public Long getRowPermissionId() {
			return this.rowPermissionId;
		}

		public void setRowPermissionId(Long rowPermissionId) {
			this.rowPermissionId = rowPermissionId;
		}

		public List<MappingColumnsItem> getMappingColumns() {
			return this.mappingColumns;
		}

		public void setMappingColumns(List<MappingColumnsItem> mappingColumns) {
			this.mappingColumns = mappingColumns;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public String getRowPermissionDesc() {
			return this.rowPermissionDesc;
		}

		public void setRowPermissionDesc(String rowPermissionDesc) {
			this.rowPermissionDesc = rowPermissionDesc;
		}

		public static class TablesItem {

			@SerializedName("ResourceId")
			private String resourceId;

			@SerializedName("MappingColumnName")
			private String mappingColumnName;

			@SerializedName("ColumnName")
			private String columnName;

			public String getResourceId() {
				return this.resourceId;
			}

			public void setResourceId(String resourceId) {
				this.resourceId = resourceId;
			}

			public String getMappingColumnName() {
				return this.mappingColumnName;
			}

			public void setMappingColumnName(String mappingColumnName) {
				this.mappingColumnName = mappingColumnName;
			}

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}
		}

		public static class MappingColumnsItem {

			@SerializedName("ColumnName")
			private String columnName;

			@SerializedName("ColumnType")
			private String columnType;

			@SerializedName("ColumnDesc")
			private String columnDesc;

			public String getColumnName() {
				return this.columnName;
			}

			public void setColumnName(String columnName) {
				this.columnName = columnName;
			}

			public String getColumnType() {
				return this.columnType;
			}

			public void setColumnType(String columnType) {
				this.columnType = columnType;
			}

			public String getColumnDesc() {
				return this.columnDesc;
			}

			public void setColumnDesc(String columnDesc) {
				this.columnDesc = columnDesc;
			}
		}

		public static class RulesItem {

			@SerializedName("UserMappingList")
			private List<UserMappingListItem> userMappingList;

			@SerializedName("ScopeType")
			private String scopeType;

			@SerializedName("RuleName")
			private String ruleName;

			@SerializedName("IsDelete")
			private Boolean isDelete;

			@SerializedName("Expressions")
			private List<ExpressionsItem> expressions;

			@SerializedName("Status")
			private Integer status;

			public List<UserMappingListItem> getUserMappingList() {
				return this.userMappingList;
			}

			public void setUserMappingList(List<UserMappingListItem> userMappingList) {
				this.userMappingList = userMappingList;
			}

			public String getScopeType() {
				return this.scopeType;
			}

			public void setScopeType(String scopeType) {
				this.scopeType = scopeType;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public Boolean getIsDelete() {
				return this.isDelete;
			}

			public void setIsDelete(Boolean isDelete) {
				this.isDelete = isDelete;
			}

			public List<ExpressionsItem> getExpressions() {
				return this.expressions;
			}

			public void setExpressions(List<ExpressionsItem> expressions) {
				this.expressions = expressions;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public static class UserMappingListItem {

				@SerializedName("AccountType")
				private String accountType;

				@SerializedName("Accounts")
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

					@SerializedName("AccountId")
					private String accountId;

					public String getAccountId() {
						return this.accountId;
					}

					public void setAccountId(String accountId) {
						this.accountId = accountId;
					}
				}
			}

			public static class ExpressionsItem {

				@SerializedName("SubConditions")
				private List<Object> subConditions;

				@SerializedName("Values")
				private List<String> values;

				@SerializedName("Type")
				private String type;

				@SerializedName("MappingColumnName")
				private String mappingColumnName;

				@SerializedName("Operator")
				private String operator;

				public List<Object> getSubConditions() {
					return this.subConditions;
				}

				public void setSubConditions(List<Object> subConditions) {
					this.subConditions = subConditions;
				}

				public List<String> getValues() {
					return this.values;
				}

				public void setValues(List<String> values) {
					this.values = values;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getMappingColumnName() {
					return this.mappingColumnName;
				}

				public void setMappingColumnName(String mappingColumnName) {
					this.mappingColumnName = mappingColumnName;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}
			}
		}
	}

	@Override
	public Class<UpdateRowPermissionResponse> getResponseClass() {
		return UpdateRowPermissionResponse.class;
	}

}
