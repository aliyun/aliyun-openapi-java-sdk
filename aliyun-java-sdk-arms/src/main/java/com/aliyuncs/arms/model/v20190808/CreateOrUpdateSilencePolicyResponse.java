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
import com.aliyuncs.arms.transform.v20190808.CreateOrUpdateSilencePolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateOrUpdateSilencePolicyResponse extends AcsResponse {

	private String requestId;

	private SilencePolicy silencePolicy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SilencePolicy getSilencePolicy() {
		return this.silencePolicy;
	}

	public void setSilencePolicy(SilencePolicy silencePolicy) {
		this.silencePolicy = silencePolicy;
	}

	public static class SilencePolicy {

		private Long id;

		private String name;

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

	@Override
	public CreateOrUpdateSilencePolicyResponse getInstance(UnmarshallerContext context) {
		return	CreateOrUpdateSilencePolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
