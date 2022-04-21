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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutEventRuleRequest extends RpcAcsRequest<PutEventRuleResponse> {
	   

	private String description;

	private String ruleName;

	private Long silenceTime;

	private String state;

	private String groupId;

	private List<EventPattern> eventPatterns;

	private String eventType;
	public PutEventRuleRequest() {
		super("Cms", "2019-01-01", "PutEventRule", "cms");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public Long getSilenceTime() {
		return this.silenceTime;
	}

	public void setSilenceTime(Long silenceTime) {
		this.silenceTime = silenceTime;
		if(silenceTime != null){
			putQueryParameter("SilenceTime", silenceTime.toString());
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public List<EventPattern> getEventPatterns() {
		return this.eventPatterns;
	}

	public void setEventPatterns(List<EventPattern> eventPatterns) {
		this.eventPatterns = eventPatterns;	
		if (eventPatterns != null) {
			for (int depth1 = 0; depth1 < eventPatterns.size(); depth1++) {
				if (eventPatterns.get(depth1).getLevelLists() != null) {
					for (int i = 0; i < eventPatterns.get(depth1).getLevelLists().size(); i++) {
						putQueryParameter("EventPattern." + (depth1 + 1) + ".LevelList." + (i + 1) , eventPatterns.get(depth1).getLevelLists().get(i));
					}
				}
				putQueryParameter("EventPattern." + (depth1 + 1) + ".KeywordFilter" , eventPatterns.get(depth1).getKeywordFilter());
				putQueryParameter("EventPattern." + (depth1 + 1) + ".Product" , eventPatterns.get(depth1).getProduct());
				if (eventPatterns.get(depth1).getStatusLists() != null) {
					for (int i = 0; i < eventPatterns.get(depth1).getStatusLists().size(); i++) {
						putQueryParameter("EventPattern." + (depth1 + 1) + ".StatusList." + (i + 1) , eventPatterns.get(depth1).getStatusLists().get(i));
					}
				}
				if (eventPatterns.get(depth1).getNameLists() != null) {
					for (int i = 0; i < eventPatterns.get(depth1).getNameLists().size(); i++) {
						putQueryParameter("EventPattern." + (depth1 + 1) + ".NameList." + (i + 1) , eventPatterns.get(depth1).getNameLists().get(i));
					}
				}
				putQueryParameter("EventPattern." + (depth1 + 1) + ".CustomFilters" , eventPatterns.get(depth1).getCustomFilters());
				if (eventPatterns.get(depth1).getEventTypeLists() != null) {
					for (int i = 0; i < eventPatterns.get(depth1).getEventTypeLists().size(); i++) {
						putQueryParameter("EventPattern." + (depth1 + 1) + ".EventTypeList." + (i + 1) , eventPatterns.get(depth1).getEventTypeLists().get(i));
					}
				}
				putQueryParameter("EventPattern." + (depth1 + 1) + ".SQLFilter" , eventPatterns.get(depth1).getSQLFilter());
			}
		}	
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public static class EventPattern {

		private List<String> levelLists;

		private KeywordFilter keywordFilter;

		private String product;

		private List<String> statusLists;

		private List<String> nameLists;

		private String customFilters;

		private List<String> eventTypeLists;

		private String sQLFilter;

		public List<String> getLevelLists() {
			return this.levelLists;
		}

		public void setLevelLists(List<String> levelLists) {
			this.levelLists = levelLists;
		}

		public KeywordFilter getKeywordFilter() {
			return this.keywordFilter;
		}

		public void setKeywordFilter(KeywordFilter keywordFilter) {
			this.keywordFilter = keywordFilter;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public List<String> getStatusLists() {
			return this.statusLists;
		}

		public void setStatusLists(List<String> statusLists) {
			this.statusLists = statusLists;
		}

		public List<String> getNameLists() {
			return this.nameLists;
		}

		public void setNameLists(List<String> nameLists) {
			this.nameLists = nameLists;
		}

		public String getCustomFilters() {
			return this.customFilters;
		}

		public void setCustomFilters(String customFilters) {
			this.customFilters = customFilters;
		}

		public List<String> getEventTypeLists() {
			return this.eventTypeLists;
		}

		public void setEventTypeLists(List<String> eventTypeLists) {
			this.eventTypeLists = eventTypeLists;
		}

		public String getSQLFilter() {
			return this.sQLFilter;
		}

		public void setSQLFilter(String sQLFilter) {
			this.sQLFilter = sQLFilter;
		}

		public static class KeywordFilter {

			private List<String> keywords;

			private String relation;

			public List<String> getKeywords() {
				return this.keywords;
			}

			public void setKeywords(List<String> keywords) {
				this.keywords = keywords;
			}

			public String getRelation() {
				return this.relation;
			}

			public void setRelation(String relation) {
				this.relation = relation;
			}
		}
	}

	@Override
	public Class<PutEventRuleResponse> getResponseClass() {
		return PutEventRuleResponse.class;
	}

}
