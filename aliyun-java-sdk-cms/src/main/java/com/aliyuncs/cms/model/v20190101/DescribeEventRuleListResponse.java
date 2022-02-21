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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeEventRuleListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventRuleListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Integer total;

	private Boolean success;

	private List<EventRule> eventRules;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<EventRule> getEventRules() {
		return this.eventRules;
	}

	public void setEventRules(List<EventRule> eventRules) {
		this.eventRules = eventRules;
	}

	public static class EventRule {

		private String eventType;

		private String description;

		private String groupId;

		private String name;

		private String state;

		private Long silenceTime;

		private List<EventPatternItem> eventPattern;

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
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

		public Long getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Long silenceTime) {
			this.silenceTime = silenceTime;
		}

		public List<EventPatternItem> getEventPattern() {
			return this.eventPattern;
		}

		public void setEventPattern(List<EventPatternItem> eventPattern) {
			this.eventPattern = eventPattern;
		}

		public static class EventPatternItem {

			private String product;

			private String customFilters;

			private String sQLFilter;

			private List<String> levelList;

			private List<String> eventTypeList;

			private List<String> nameList;

			private KeywordFilter keywordFilter;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public String getCustomFilters() {
				return this.customFilters;
			}

			public void setCustomFilters(String customFilters) {
				this.customFilters = customFilters;
			}

			public String getSQLFilter() {
				return this.sQLFilter;
			}

			public void setSQLFilter(String sQLFilter) {
				this.sQLFilter = sQLFilter;
			}

			public List<String> getLevelList() {
				return this.levelList;
			}

			public void setLevelList(List<String> levelList) {
				this.levelList = levelList;
			}

			public List<String> getEventTypeList() {
				return this.eventTypeList;
			}

			public void setEventTypeList(List<String> eventTypeList) {
				this.eventTypeList = eventTypeList;
			}

			public List<String> getNameList() {
				return this.nameList;
			}

			public void setNameList(List<String> nameList) {
				this.nameList = nameList;
			}

			public KeywordFilter getKeywordFilter() {
				return this.keywordFilter;
			}

			public void setKeywordFilter(KeywordFilter keywordFilter) {
				this.keywordFilter = keywordFilter;
			}

			public static class KeywordFilter {

				private String relation;

				private List<String> keywords;

				public String getRelation() {
					return this.relation;
				}

				public void setRelation(String relation) {
					this.relation = relation;
				}

				public List<String> getKeywords() {
					return this.keywords;
				}

				public void setKeywords(List<String> keywords) {
					this.keywords = keywords;
				}
			}
		}
	}

	@Override
	public DescribeEventRuleListResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventRuleListResponseUnmarshaller.unmarshall(this, context);
	}
}
