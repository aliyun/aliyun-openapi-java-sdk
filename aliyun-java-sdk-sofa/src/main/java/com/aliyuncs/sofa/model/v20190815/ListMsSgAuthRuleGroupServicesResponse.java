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
import com.aliyuncs.sofa.transform.v20190815.ListMsSgAuthRuleGroupServicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMsSgAuthRuleGroupServicesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long currentPage;

	private Long pageSize;

	private Long startIndex;

	private Long totalSize;

	private List<AuthRuleGroupsItem> authRuleGroups;

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

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getStartIndex() {
		return this.startIndex;
	}

	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public List<AuthRuleGroupsItem> getAuthRuleGroups() {
		return this.authRuleGroups;
	}

	public void setAuthRuleGroups(List<AuthRuleGroupsItem> authRuleGroups) {
		this.authRuleGroups = authRuleGroups;
	}

	public static class AuthRuleGroupsItem {

		private String appName;

		private Long blackGroupId;

		private Long blackState;

		private String dataId;

		private String gmtCreate;

		private String gmtModified;

		private Long id;

		private String instanceId;

		private String operator;

		private Long status;

		private Long whiteGroupId;

		private Long whiteState;

		private List<RulesItem> rules;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Long getBlackGroupId() {
			return this.blackGroupId;
		}

		public void setBlackGroupId(Long blackGroupId) {
			this.blackGroupId = blackGroupId;
		}

		public Long getBlackState() {
			return this.blackState;
		}

		public void setBlackState(Long blackState) {
			this.blackState = blackState;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
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

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public Long getWhiteGroupId() {
			return this.whiteGroupId;
		}

		public void setWhiteGroupId(Long whiteGroupId) {
			this.whiteGroupId = whiteGroupId;
		}

		public Long getWhiteState() {
			return this.whiteState;
		}

		public void setWhiteState(Long whiteState) {
			this.whiteState = whiteState;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public static class RulesItem {

			private Long authRuleRroupId;

			private Long enabled;

			private String gmtCreate;

			private String gmtModified;

			private String id;

			private String mode;

			private String name;

			private String type;

			private List<RuleItemsItem> ruleItems;

			public Long getAuthRuleRroupId() {
				return this.authRuleRroupId;
			}

			public void setAuthRuleRroupId(Long authRuleRroupId) {
				this.authRuleRroupId = authRuleRroupId;
			}

			public Long getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Long enabled) {
				this.enabled = enabled;
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

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getMode() {
				return this.mode;
			}

			public void setMode(String mode) {
				this.mode = mode;
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

			public List<RuleItemsItem> getRuleItems() {
				return this.ruleItems;
			}

			public void setRuleItems(List<RuleItemsItem> ruleItems) {
				this.ruleItems = ruleItems;
			}

			public static class RuleItemsItem {

				private Long authRuleId;

				private String field;

				private String gmtCreate;

				private String gmtModified;

				private Long id;

				private String operation;

				private String operator;

				private String type;

				private String value;

				public Long getAuthRuleId() {
					return this.authRuleId;
				}

				public void setAuthRuleId(Long authRuleId) {
					this.authRuleId = authRuleId;
				}

				public String getField() {
					return this.field;
				}

				public void setField(String field) {
					this.field = field;
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

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getOperation() {
					return this.operation;
				}

				public void setOperation(String operation) {
					this.operation = operation;
				}

				public String getOperator() {
					return this.operator;
				}

				public void setOperator(String operator) {
					this.operator = operator;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public ListMsSgAuthRuleGroupServicesResponse getInstance(UnmarshallerContext context) {
		return	ListMsSgAuthRuleGroupServicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
