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
import com.aliyuncs.arms.transform.v20190808.ListSilencePoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSilencePoliciesResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Long total;

		private Long page;

		private Long size;

		private List<Policies> silencePolicies;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public List<Policies> getSilencePolicies() {
			return this.silencePolicies;
		}

		public void setSilencePolicies(List<Policies> silencePolicies) {
			this.silencePolicies = silencePolicies;
		}

		public static class Policies {

			private Long id;

			private String name;

			private String state;

			private String timeSlots;

			private String timePeriod;

			private String effectiveTimeType;

			private List<MatchingRulesItem> matchingRules;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
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

			public String getTimeSlots() {
				return this.timeSlots;
			}

			public void setTimeSlots(String timeSlots) {
				this.timeSlots = timeSlots;
			}

			public String getTimePeriod() {
				return this.timePeriod;
			}

			public void setTimePeriod(String timePeriod) {
				this.timePeriod = timePeriod;
			}

			public String getEffectiveTimeType() {
				return this.effectiveTimeType;
			}

			public void setEffectiveTimeType(String effectiveTimeType) {
				this.effectiveTimeType = effectiveTimeType;
			}

			public List<MatchingRulesItem> getMatchingRules() {
				return this.matchingRules;
			}

			public void setMatchingRules(List<MatchingRulesItem> matchingRules) {
				this.matchingRules = matchingRules;
			}

			public static class MatchingRulesItem {

				private List<MatchingConditionsItem> matchingConditions;

				public List<MatchingConditionsItem> getMatchingConditions() {
					return this.matchingConditions;
				}

				public void setMatchingConditions(List<MatchingConditionsItem> matchingConditions) {
					this.matchingConditions = matchingConditions;
				}

				public static class MatchingConditionsItem {

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
	public ListSilencePoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListSilencePoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
