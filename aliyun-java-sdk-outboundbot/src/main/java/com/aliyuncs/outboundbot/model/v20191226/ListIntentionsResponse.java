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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListIntentionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIntentionsResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean success;

		private String message;

		private String botId;

		private List<IntentListItem> intentList;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getBotId() {
			return this.botId;
		}

		public void setBotId(String botId) {
			this.botId = botId;
		}

		public List<IntentListItem> getIntentList() {
			return this.intentList;
		}

		public void setIntentList(List<IntentListItem> intentList) {
			this.intentList = intentList;
		}

		public static class IntentListItem {

			private Long botId;

			private String dialogId;

			private String name;

			private Long id;

			private String botName;

			private String language;

			private Integer type;

			private Long tableId;

			private List<UserSayItem> userSay;

			private List<RuleCheckItem> ruleCheck;

			private List<SlotItem> slot;

			private List<String> alias;

			public Long getBotId() {
				return this.botId;
			}

			public void setBotId(Long botId) {
				this.botId = botId;
			}

			public String getDialogId() {
				return this.dialogId;
			}

			public void setDialogId(String dialogId) {
				this.dialogId = dialogId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getBotName() {
				return this.botName;
			}

			public void setBotName(String botName) {
				this.botName = botName;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Long getTableId() {
				return this.tableId;
			}

			public void setTableId(Long tableId) {
				this.tableId = tableId;
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

			public List<String> getAlias() {
				return this.alias;
			}

			public void setAlias(List<String> alias) {
				this.alias = alias;
			}

			public static class UserSayItem {

				private String id;

				private String fromId;

				private Boolean strict;

				private List<Data1> userSayData;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getFromId() {
					return this.fromId;
				}

				public void setFromId(String fromId) {
					this.fromId = fromId;
				}

				public Boolean getStrict() {
					return this.strict;
				}

				public void setStrict(Boolean strict) {
					this.strict = strict;
				}

				public List<Data1> getUserSayData() {
					return this.userSayData;
				}

				public void setUserSayData(List<Data1> userSayData) {
					this.userSayData = userSayData;
				}

				public static class Data1 {

					private String slotId;

					private String text;

					public String getSlotId() {
						return this.slotId;
					}

					public void setSlotId(String slotId) {
						this.slotId = slotId;
					}

					public String getText() {
						return this.text;
					}

					public void setText(String text) {
						this.text = text;
					}
				}
			}

			public static class RuleCheckItem {

				private Boolean strict;

				private String text;

				private List<String> warning;

				private List<String> error;

				public Boolean getStrict() {
					return this.strict;
				}

				public void setStrict(Boolean strict) {
					this.strict = strict;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
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

				private String id;

				private String name;

				private Boolean isArray;

				private Boolean isEncrypt;

				private Boolean isInteractive;

				private String value;

				private Boolean isNecessary;

				private Integer lifeSpan;

				private String feedbackType;

				private List<Tag> tags;

				private List<FeedbackFunction> feedbackFunctions;

				private List<String> question;

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

				public Boolean getIsArray() {
					return this.isArray;
				}

				public void setIsArray(Boolean isArray) {
					this.isArray = isArray;
				}

				public Boolean getIsEncrypt() {
					return this.isEncrypt;
				}

				public void setIsEncrypt(Boolean isEncrypt) {
					this.isEncrypt = isEncrypt;
				}

				public Boolean getIsInteractive() {
					return this.isInteractive;
				}

				public void setIsInteractive(Boolean isInteractive) {
					this.isInteractive = isInteractive;
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

				public Integer getLifeSpan() {
					return this.lifeSpan;
				}

				public void setLifeSpan(Integer lifeSpan) {
					this.lifeSpan = lifeSpan;
				}

				public String getFeedbackType() {
					return this.feedbackType;
				}

				public void setFeedbackType(String feedbackType) {
					this.feedbackType = feedbackType;
				}

				public List<Tag> getTags() {
					return this.tags;
				}

				public void setTags(List<Tag> tags) {
					this.tags = tags;
				}

				public List<FeedbackFunction> getFeedbackFunctions() {
					return this.feedbackFunctions;
				}

				public void setFeedbackFunctions(List<FeedbackFunction> feedbackFunctions) {
					this.feedbackFunctions = feedbackFunctions;
				}

				public List<String> getQuestion() {
					return this.question;
				}

				public void setQuestion(List<String> question) {
					this.question = question;
				}

				public static class Tag {

					private String userSayId;

					private String value;

					public String getUserSayId() {
						return this.userSayId;
					}

					public void setUserSayId(String userSayId) {
						this.userSayId = userSayId;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class FeedbackFunction {

					private String code;

					private String description;

					private String function;

					private String name;

					private String aliyunService;

					private String aliyunFunction;

					private String endPoint;

					private String type;

					private Map<Object,Object> params;

					private List<SwitchItem> _switch;

					public String getCode() {
						return this.code;
					}

					public void setCode(String code) {
						this.code = code;
					}

					public String getDescription() {
						return this.description;
					}

					public void setDescription(String description) {
						this.description = description;
					}

					public String getFunction() {
						return this.function;
					}

					public void setFunction(String function) {
						this.function = function;
					}

					public String getName() {
						return this.name;
					}

					public void setName(String name) {
						this.name = name;
					}

					public String getAliyunService() {
						return this.aliyunService;
					}

					public void setAliyunService(String aliyunService) {
						this.aliyunService = aliyunService;
					}

					public String getAliyunFunction() {
						return this.aliyunFunction;
					}

					public void setAliyunFunction(String aliyunFunction) {
						this.aliyunFunction = aliyunFunction;
					}

					public String getEndPoint() {
						return this.endPoint;
					}

					public void setEndPoint(String endPoint) {
						this.endPoint = endPoint;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Map<Object,Object> getParams() {
						return this.params;
					}

					public void setParams(Map<Object,Object> params) {
						this.params = params;
					}

					public List<SwitchItem> get_Switch() {
						return this._switch;
					}

					public void set_Switch(List<SwitchItem> _switch) {
						this._switch = _switch;
					}

					public static class SwitchItem {

						private String id;

						private String label;

						private String type;

						private String value;

						private String name;

						public String getId() {
							return this.id;
						}

						public void setId(String id) {
							this.id = id;
						}

						public String getLabel() {
							return this.label;
						}

						public void setLabel(String label) {
							this.label = label;
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

						public String getName() {
							return this.name;
						}

						public void setName(String name) {
							this.name = name;
						}
					}
				}
			}
		}
	}

	@Override
	public ListIntentionsResponse getInstance(UnmarshallerContext context) {
		return	ListIntentionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
