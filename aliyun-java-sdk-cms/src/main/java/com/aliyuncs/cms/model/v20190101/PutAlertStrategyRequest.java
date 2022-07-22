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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutAlertStrategyRequest extends RpcAcsRequest<PutAlertStrategyResponse> {
	   

	@SerializedName("groupingRule")
	private GroupingRule groupingRule;

	@SerializedName("filterRule")
	private FilterRule filterRule;

	@SerializedName("escalationRule")
	private EscalationRule escalationRule;

	@SerializedName("pushingRule")
	private PushingRule pushingRule;

	private String templateGroupId;

	private String name;

	private String strategyId;

	private String describe;

	@SerializedName("channelMapRule")
	private ChannelMapRule channelMapRule;
	public PutAlertStrategyRequest() {
		super("Cms", "2019-01-01", "PutAlertStrategy", "cms");
		setMethod(MethodType.POST);
	}

	public GroupingRule getGroupingRule() {
		return this.groupingRule;
	}

	public void setGroupingRule(GroupingRule groupingRule) {
		this.groupingRule = groupingRule;	
		if (groupingRule != null) {
			putQueryParameter("GroupingRule" , new Gson().toJson(groupingRule));
		}	
	}

	public FilterRule getFilterRule() {
		return this.filterRule;
	}

	public void setFilterRule(FilterRule filterRule) {
		this.filterRule = filterRule;	
		if (filterRule != null) {
			putQueryParameter("FilterRule" , new Gson().toJson(filterRule));
		}	
	}

	public EscalationRule getEscalationRule() {
		return this.escalationRule;
	}

	public void setEscalationRule(EscalationRule escalationRule) {
		this.escalationRule = escalationRule;	
		if (escalationRule != null) {
			putQueryParameter("EscalationRule" , new Gson().toJson(escalationRule));
		}	
	}

	public PushingRule getPushingRule() {
		return this.pushingRule;
	}

	public void setPushingRule(PushingRule pushingRule) {
		this.pushingRule = pushingRule;	
		if (pushingRule != null) {
			putQueryParameter("PushingRule" , new Gson().toJson(pushingRule));
		}	
	}

	public String getTemplateGroupId() {
		return this.templateGroupId;
	}

	public void setTemplateGroupId(String templateGroupId) {
		this.templateGroupId = templateGroupId;
		if(templateGroupId != null){
			putQueryParameter("TemplateGroupId", templateGroupId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getStrategyId() {
		return this.strategyId;
	}

	public void setStrategyId(String strategyId) {
		this.strategyId = strategyId;
		if(strategyId != null){
			putQueryParameter("StrategyId", strategyId);
		}
	}

	public String getDescribe() {
		return this.describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
		if(describe != null){
			putQueryParameter("Describe", describe);
		}
	}

	public ChannelMapRule getChannelMapRule() {
		return this.channelMapRule;
	}

	public void setChannelMapRule(ChannelMapRule channelMapRule) {
		this.channelMapRule = channelMapRule;	
		if (channelMapRule != null) {
			putQueryParameter("ChannelMapRule" , new Gson().toJson(channelMapRule));
		}	
	}

	public static class GroupingRule {

		@SerializedName("Period")
		private String period;

		@SerializedName("Times")
		private String times;

		@SerializedName("GroupingRuleItems")
		private List<GroupingRuleItemsItem> groupingRuleItems;

		@SerializedName("SilenceTime")
		private String silenceTime;

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getTimes() {
			return this.times;
		}

		public void setTimes(String times) {
			this.times = times;
		}

		public List<GroupingRuleItemsItem> getGroupingRuleItems() {
			return this.groupingRuleItems;
		}

		public void setGroupingRuleItems(List<GroupingRuleItemsItem> groupingRuleItems) {
			this.groupingRuleItems = groupingRuleItems;
		}

		public String getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(String silenceTime) {
			this.silenceTime = silenceTime;
		}

		public static class GroupingRuleItemsItem {

			@SerializedName("GroupingKeys")
			private List<String> groupingKeys;

			@SerializedName("GroupingType")
			private String groupingType;

			@SerializedName("AiGroupingServiceId")
			private String aiGroupingServiceId;

			public List<String> getGroupingKeys() {
				return this.groupingKeys;
			}

			public void setGroupingKeys(List<String> groupingKeys) {
				this.groupingKeys = groupingKeys;
			}

			public String getGroupingType() {
				return this.groupingType;
			}

			public void setGroupingType(String groupingType) {
				this.groupingType = groupingType;
			}

			public String getAiGroupingServiceId() {
				return this.aiGroupingServiceId;
			}

			public void setAiGroupingServiceId(String aiGroupingServiceId) {
				this.aiGroupingServiceId = aiGroupingServiceId;
			}
		}
	}

	public static class FilterRule {

		@SerializedName("FilterItems")
		private List<FilterItemsItem> filterItems;

		@SerializedName("BlackList")
		private List<BlackListItem> blackList;

		@SerializedName("WhiteList")
		private List<WhiteListItem> whiteList;

		public List<FilterItemsItem> getFilterItems() {
			return this.filterItems;
		}

		public void setFilterItems(List<FilterItemsItem> filterItems) {
			this.filterItems = filterItems;
		}

		public List<BlackListItem> getBlackList() {
			return this.blackList;
		}

		public void setBlackList(List<BlackListItem> blackList) {
			this.blackList = blackList;
		}

		public List<WhiteListItem> getWhiteList() {
			return this.whiteList;
		}

		public void setWhiteList(List<WhiteListItem> whiteList) {
			this.whiteList = whiteList;
		}

		public static class FilterItemsItem {

			@SerializedName("Product")
			private String product;

			@SerializedName("Level")
			private String level;

			@SerializedName("MetricName")
			private String metricName;

			@SerializedName("EventSource")
			private String eventSource;

			@SerializedName("EventName")
			private String eventName;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getEventSource() {
				return this.eventSource;
			}

			public void setEventSource(String eventSource) {
				this.eventSource = eventSource;
			}

			public String getEventName() {
				return this.eventName;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}
		}

		public static class BlackListItem {

			@SerializedName("Product")
			private String product;

			@SerializedName("Level")
			private String level;

			@SerializedName("MetricName")
			private String metricName;

			@SerializedName("EventSource")
			private String eventSource;

			@SerializedName("EventName")
			private String eventName;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getEventSource() {
				return this.eventSource;
			}

			public void setEventSource(String eventSource) {
				this.eventSource = eventSource;
			}

			public String getEventName() {
				return this.eventName;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}
		}

		public static class WhiteListItem {

			@SerializedName("Product")
			private String product;

			@SerializedName("Level")
			private String level;

			@SerializedName("MetricName")
			private String metricName;

			@SerializedName("EventSource")
			private String eventSource;

			@SerializedName("EventName")
			private String eventName;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getLevel() {
				return this.level;
			}

			public void setLevel(String level) {
				this.level = level;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getEventSource() {
				return this.eventSource;
			}

			public void setEventSource(String eventSource) {
				this.eventSource = eventSource;
			}

			public String getEventName() {
				return this.eventName;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}
		}
	}

	public static class EscalationRule {

		@SerializedName("AutoResolveTime")
		private Integer autoResolveTime;

		@SerializedName("Escalations")
		private List<EscalationsItem> escalations;

		@SerializedName("ReTriggerTime")
		private Integer reTriggerTime;

		public Integer getAutoResolveTime() {
			return this.autoResolveTime;
		}

		public void setAutoResolveTime(Integer autoResolveTime) {
			this.autoResolveTime = autoResolveTime;
		}

		public List<EscalationsItem> getEscalations() {
			return this.escalations;
		}

		public void setEscalations(List<EscalationsItem> escalations) {
			this.escalations = escalations;
		}

		public Integer getReTriggerTime() {
			return this.reTriggerTime;
		}

		public void setReTriggerTime(Integer reTriggerTime) {
			this.reTriggerTime = reTriggerTime;
		}

		public static class EscalationsItem {

			@SerializedName("EscalateTime")
			private Integer escalateTime;

			@SerializedName("ContactGroups")
			private List<String> contactGroups;

			@SerializedName("LevelGroupMapRule")
			private LevelGroupMapRule levelGroupMapRule;

			public Integer getEscalateTime() {
				return this.escalateTime;
			}

			public void setEscalateTime(Integer escalateTime) {
				this.escalateTime = escalateTime;
			}

			public List<String> getContactGroups() {
				return this.contactGroups;
			}

			public void setContactGroups(List<String> contactGroups) {
				this.contactGroups = contactGroups;
			}

			public LevelGroupMapRule getLevelGroupMapRule() {
				return this.levelGroupMapRule;
			}

			public void setLevelGroupMapRule(LevelGroupMapRule levelGroupMapRule) {
				this.levelGroupMapRule = levelGroupMapRule;
			}

			public static class LevelGroupMapRule {

				@SerializedName("Critical")
				private List<String> critical;

				@SerializedName("Resolve")
				private List<String> resolve;

				@SerializedName("Warning")
				private List<String> warning;

				@SerializedName("Info")
				private List<String> info;

				public List<String> getCritical() {
					return this.critical;
				}

				public void setCritical(List<String> critical) {
					this.critical = critical;
				}

				public List<String> getResolve() {
					return this.resolve;
				}

				public void setResolve(List<String> resolve) {
					this.resolve = resolve;
				}

				public List<String> getWarning() {
					return this.warning;
				}

				public void setWarning(List<String> warning) {
					this.warning = warning;
				}

				public List<String> getInfo() {
					return this.info;
				}

				public void setInfo(List<String> info) {
					this.info = info;
				}
			}
		}
	}

	public static class PushingRule {

		@SerializedName("PushingItems")
		private List<PushingItemsItem> pushingItems;

		public List<PushingItemsItem> getPushingItems() {
			return this.pushingItems;
		}

		public void setPushingItems(List<PushingItemsItem> pushingItems) {
			this.pushingItems = pushingItems;
		}

		public static class PushingItemsItem {

			@SerializedName("WebhookTarget")
			private WebhookTarget webhookTarget;

			@SerializedName("ArnTarget")
			private ArnTarget arnTarget;

			@SerializedName("TargetType")
			private String targetType;

			@SerializedName("Range")
			private String range;

			public WebhookTarget getWebhookTarget() {
				return this.webhookTarget;
			}

			public void setWebhookTarget(WebhookTarget webhookTarget) {
				this.webhookTarget = webhookTarget;
			}

			public ArnTarget getArnTarget() {
				return this.arnTarget;
			}

			public void setArnTarget(ArnTarget arnTarget) {
				this.arnTarget = arnTarget;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public String getRange() {
				return this.range;
			}

			public void setRange(String range) {
				this.range = range;
			}

			public static class WebhookTarget {

				@SerializedName("Headers")
				private String headers;

				@SerializedName("Method")
				private String method;

				@SerializedName("Url")
				private String url;

				@SerializedName("ResponseToken")
				private String responseToken;

				public String getHeaders() {
					return this.headers;
				}

				public void setHeaders(String headers) {
					this.headers = headers;
				}

				public String getBizMethod() {
					return this.method;
				}

				public void setBizMethod(String method) {
					this.method = method;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public String getResponseToken() {
					return this.responseToken;
				}

				public void setResponseToken(String responseToken) {
					this.responseToken = responseToken;
				}
			}

			public static class ArnTarget {

				@SerializedName("Arn")
				private String arn;

				public String getArn() {
					return this.arn;
				}

				public void setArn(String arn) {
					this.arn = arn;
				}
			}
		}
	}

	public static class ChannelMapRule {

		@SerializedName("Critical")
		private Critical critical;

		@SerializedName("Warning")
		private Warning warning;

		@SerializedName("Info")
		private Info info;

		public Critical getCritical() {
			return this.critical;
		}

		public void setCritical(Critical critical) {
			this.critical = critical;
		}

		public Warning getWarning() {
			return this.warning;
		}

		public void setWarning(Warning warning) {
			this.warning = warning;
		}

		public Info getInfo() {
			return this.info;
		}

		public void setInfo(Info info) {
			this.info = info;
		}

		public static class Critical {

			@SerializedName("Channels")
			private List<String> channels;

			public List<String> getChannels() {
				return this.channels;
			}

			public void setChannels(List<String> channels) {
				this.channels = channels;
			}
		}

		public static class Warning {

			@SerializedName("Channels")
			private List<String> channels;

			public List<String> getChannels() {
				return this.channels;
			}

			public void setChannels(List<String> channels) {
				this.channels = channels;
			}
		}

		public static class Info {

			@SerializedName("Channels")
			private List<String> channels;

			public List<String> getChannels() {
				return this.channels;
			}

			public void setChannels(List<String> channels) {
				this.channels = channels;
			}
		}
	}

	@Override
	public Class<PutAlertStrategyResponse> getResponseClass() {
		return PutAlertStrategyResponse.class;
	}

}
