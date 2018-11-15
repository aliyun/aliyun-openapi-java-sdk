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

package com.aliyuncs.chatbot.model.v20171011;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.chatbot.transform.v20171011.QueryIntentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryIntentsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Intent> intents;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Intent> getIntents() {
		return this.intents;
	}

	public void setIntents(List<Intent> intents) {
		this.intents = intents;
	}

	public static class Intent {

		private Long intentId;

		private String name;

		private String createTime;

		private String modifyTime;

		private String createUserId;

		private String createUserName;

		private String modifyUserId;

		private String modifyUserName;

		private List<UserSayItem> userSay;

		private List<RuleCheckItem> ruleCheck;

		private List<SlotItem> slot;

		public Long getIntentId() {
			return this.intentId;
		}

		public void setIntentId(Long intentId) {
			this.intentId = intentId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
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

		public String getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(String createUserId) {
			this.createUserId = createUserId;
		}

		public String getCreateUserName() {
			return this.createUserName;
		}

		public void setCreateUserName(String createUserName) {
			this.createUserName = createUserName;
		}

		public String getModifyUserId() {
			return this.modifyUserId;
		}

		public void setModifyUserId(String modifyUserId) {
			this.modifyUserId = modifyUserId;
		}

		public String getModifyUserName() {
			return this.modifyUserName;
		}

		public void setModifyUserName(String modifyUserName) {
			this.modifyUserName = modifyUserName;
		}

		public List<UserSayItem> getUserSay() {
			return this.userSay;
		}

		public void setUserSay(List<UserSayItem> userSay) {
			this.userSay = userSay;
		}

		public List<RuleCheckItem> getRuleCheck() {
			return this.ruleCheck;
		}

		public void setRuleCheck(List<RuleCheckItem> ruleCheck) {
			this.ruleCheck = ruleCheck;
		}

		public List<SlotItem> getSlot() {
			return this.slot;
		}

		public void setSlot(List<SlotItem> slot) {
			this.slot = slot;
		}

		public static class UserSayItem {

			private Boolean strict;

			private List<DataItem> data;

			public Boolean getStrict() {
				return this.strict;
			}

			public void setStrict(Boolean strict) {
				this.strict = strict;
			}

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public static class DataItem {

				private String text;

				private String slotId;

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public String getSlotId() {
					return this.slotId;
				}

				public void setSlotId(String slotId) {
					this.slotId = slotId;
				}
			}
		}

		public static class RuleCheckItem {

			private String text;

			private Boolean strict;

			private List<String> warning;

			private List<String> error;

			public String getText() {
				return this.text;
			}

			public void setText(String text) {
				this.text = text;
			}

			public Boolean getStrict() {
				return this.strict;
			}

			public void setStrict(Boolean strict) {
				this.strict = strict;
			}

			public List<String> getWarning() {
				return this.warning;
			}

			public void setWarning(List<String> warning) {
				this.warning = warning;
			}

			public List<String> getError() {
				return this.error;
			}

			public void setError(List<String> error) {
				this.error = error;
			}
		}

		public static class SlotItem {

			private String name;

			private String value;

			private Boolean isNecessary;

			private Boolean isArray;

			private Integer lifeSpan;

			private List<TagsItem> tags;

			private List<String> question;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public Boolean getIsNecessary() {
				return this.isNecessary;
			}

			public void setIsNecessary(Boolean isNecessary) {
				this.isNecessary = isNecessary;
			}

			public Boolean getIsArray() {
				return this.isArray;
			}

			public void setIsArray(Boolean isArray) {
				this.isArray = isArray;
			}

			public Integer getLifeSpan() {
				return this.lifeSpan;
			}

			public void setLifeSpan(Integer lifeSpan) {
				this.lifeSpan = lifeSpan;
			}

			public List<TagsItem> getTags() {
				return this.tags;
			}

			public void setTags(List<TagsItem> tags) {
				this.tags = tags;
			}

			public List<String> getQuestion() {
				return this.question;
			}

			public void setQuestion(List<String> question) {
				this.question = question;
			}

			public static class TagsItem {

				private String value;

				private String userSayId;

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public String getUserSayId() {
					return this.userSayId;
				}

				public void setUserSayId(String userSayId) {
					this.userSayId = userSayId;
				}
			}
		}
	}

	@Override
	public QueryIntentsResponse getInstance(UnmarshallerContext context) {
		return	QueryIntentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
