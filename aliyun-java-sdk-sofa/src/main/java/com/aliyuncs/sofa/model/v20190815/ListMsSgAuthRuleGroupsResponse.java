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
import com.aliyuncs.sofa.transform.v20190815.ListMsSgAuthRuleGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMsSgAuthRuleGroupsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

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

	public List<AuthRuleGroupsItem> getAuthRuleGroups() {
		return this.authRuleGroups;
	}

	public void setAuthRuleGroups(List<AuthRuleGroupsItem> authRuleGroups) {
		this.authRuleGroups = authRuleGroups;
	}

	public static class AuthRuleGroupsItem {

		private String dataId;

		private Long enabled;

		private String gmtModified;

		private Long id;

		private String instanceId;

		private Long status;

		private String type;

		private List<RulesItem> rules;

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public Long getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Long enabled) {
			this.enabled = enabled;
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

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<RulesItem> getRules() {
			return this.rules;
		}

		public void setRules(List<RulesItem> rules) {
			this.rules = rules;
		}

		public static class RulesItem {

			private String authRuleGroupId;

			private Long changedItemCnt;

			private String changedType;

			private Long enabled;

			private Long id;

			private String mode;

			private String name;

			private List<RuleItemsItem> ruleItems;

			public String getAuthRuleGroupId() {
				return this.authRuleGroupId;
			}

			public void setAuthRuleGroupId(String authRuleGroupId) {
				this.authRuleGroupId = authRuleGroupId;
			}

			public Long getChangedItemCnt() {
				return this.changedItemCnt;
			}

			public void setChangedItemCnt(Long changedItemCnt) {
				this.changedItemCnt = changedItemCnt;
			}

			public String getChangedType() {
				return this.changedType;
			}

			public void setChangedType(String changedType) {
				this.changedType = changedType;
			}

			public Long getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Long enabled) {
				this.enabled = enabled;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
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

			public List<RuleItemsItem> getRuleItems() {
				return this.ruleItems;
			}

			public void setRuleItems(List<RuleItemsItem> ruleItems) {
				this.ruleItems = ruleItems;
			}

			public static class RuleItemsItem {

				private Long authRuleId;

				private String changedType;

				private String field;

				private Long id;

				private String operation;

				private String type;

				private String value;

				private PublishedAuthRuleItem publishedAuthRuleItem;

				public Long getAuthRuleId() {
					return this.authRuleId;
				}

				public void setAuthRuleId(Long authRuleId) {
					this.authRuleId = authRuleId;
				}

				public String getChangedType() {
					return this.changedType;
				}

				public void setChangedType(String changedType) {
					this.changedType = changedType;
				}

				public String getField() {
					return this.field;
				}

				public void setField(String field) {
					this.field = field;
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

				public PublishedAuthRuleItem getPublishedAuthRuleItem() {
					return this.publishedAuthRuleItem;
				}

				public void setPublishedAuthRuleItem(PublishedAuthRuleItem publishedAuthRuleItem) {
					this.publishedAuthRuleItem = publishedAuthRuleItem;
				}

				public static class PublishedAuthRuleItem {

					private Long authRuleId;

					private String changedType;

					private String field;

					private String operation;

					private String value;

					public Long getAuthRuleId() {
						return this.authRuleId;
					}

					public void setAuthRuleId(Long authRuleId) {
						this.authRuleId = authRuleId;
					}

					public String getChangedType() {
						return this.changedType;
					}

					public void setChangedType(String changedType) {
						this.changedType = changedType;
					}

					public String getField() {
						return this.field;
					}

					public void setField(String field) {
						this.field = field;
					}

					public String getOperation() {
						return this.operation;
					}

					public void setOperation(String operation) {
						this.operation = operation;
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
	}

	@Override
	public ListMsSgAuthRuleGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListMsSgAuthRuleGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
