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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.DescribeDispatchRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDispatchRuleResponse extends AcsResponse {

	private String requestId;

	private DispatchRule dispatchRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DispatchRule getDispatchRule() {
		return this.dispatchRule;
	}

	public void setDispatchRule(DispatchRule dispatchRule) {
		this.dispatchRule = dispatchRule;
	}

	public static class DispatchRule {

		private Long ruleId;

		private String name;

		private String state;

		private List<GroupRule> groupRules;

		private List<NotifyRule> notifyRules;

		private LabelMatchExpressionGrid labelMatchExpressionGrid;

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public List<GroupRule> getGroupRules() {
			return this.groupRules;
		}

		public void setGroupRules(List<GroupRule> groupRules) {
			this.groupRules = groupRules;
		}

		public List<NotifyRule> getNotifyRules() {
			return this.notifyRules;
		}

		public void setNotifyRules(List<NotifyRule> notifyRules) {
			this.notifyRules = notifyRules;
		}

		public LabelMatchExpressionGrid getLabelMatchExpressionGrid() {
			return this.labelMatchExpressionGrid;
		}

		public void setLabelMatchExpressionGrid(LabelMatchExpressionGrid labelMatchExpressionGrid) {
			this.labelMatchExpressionGrid = labelMatchExpressionGrid;
		}

		public static class GroupRule {

			private Long groupId;

			private Long groupWaitTime;

			private Long groupInterval;

			private List<String> groupingFields;

			public Long getGroupId() {
				return this.groupId;
			}

			public void setGroupId(Long groupId) {
				this.groupId = groupId;
			}

			public Long getGroupWaitTime() {
				return this.groupWaitTime;
			}

			public void setGroupWaitTime(Long groupWaitTime) {
				this.groupWaitTime = groupWaitTime;
			}

			public Long getGroupInterval() {
				return this.groupInterval;
			}

			public void setGroupInterval(Long groupInterval) {
				this.groupInterval = groupInterval;
			}

			public List<String> getGroupingFields() {
				return this.groupingFields;
			}

			public void setGroupingFields(List<String> groupingFields) {
				this.groupingFields = groupingFields;
			}
		}

		public static class NotifyRule {

			private List<NotifyObject> notifyObjects;

			private List<String> notifyChannels;

			public List<NotifyObject> getNotifyObjects() {
				return this.notifyObjects;
			}

			public void setNotifyObjects(List<NotifyObject> notifyObjects) {
				this.notifyObjects = notifyObjects;
			}

			public List<String> getNotifyChannels() {
				return this.notifyChannels;
			}

			public void setNotifyChannels(List<String> notifyChannels) {
				this.notifyChannels = notifyChannels;
			}

			public static class NotifyObject {

				private String notifyType;

				private String name;

				private String notifyObjectId;

				public String getNotifyType() {
					return this.notifyType;
				}

				public void setNotifyType(String notifyType) {
					this.notifyType = notifyType;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getNotifyObjectId() {
					return this.notifyObjectId;
				}

				public void setNotifyObjectId(String notifyObjectId) {
					this.notifyObjectId = notifyObjectId;
				}
			}
		}

		public static class LabelMatchExpressionGrid {

			private List<LabelMatchExpressionGroup> labelMatchExpressionGroups;

			public List<LabelMatchExpressionGroup> getLabelMatchExpressionGroups() {
				return this.labelMatchExpressionGroups;
			}

			public void setLabelMatchExpressionGroups(List<LabelMatchExpressionGroup> labelMatchExpressionGroups) {
				this.labelMatchExpressionGroups = labelMatchExpressionGroups;
			}

			public static class LabelMatchExpressionGroup {

				private List<LabelMatchExpression> labelMatchExpressions;

				public List<LabelMatchExpression> getLabelMatchExpressions() {
					return this.labelMatchExpressions;
				}

				public void setLabelMatchExpressions(List<LabelMatchExpression> labelMatchExpressions) {
					this.labelMatchExpressions = labelMatchExpressions;
				}

				public static class LabelMatchExpression {

					private String key;

					private String value;

					private String operator;

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

					public String getOperator() {
						return this.operator;
					}

					public void setOperator(String operator) {
						this.operator = operator;
					}
				}
			}
		}
	}

	@Override
	public DescribeDispatchRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeDispatchRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
