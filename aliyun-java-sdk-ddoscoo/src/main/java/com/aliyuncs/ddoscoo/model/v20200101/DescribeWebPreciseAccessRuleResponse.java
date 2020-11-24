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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebPreciseAccessRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebPreciseAccessRuleResponse extends AcsResponse {

	private String requestId;

	private List<PreciseAccessConfig> preciseAccessConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PreciseAccessConfig> getPreciseAccessConfigList() {
		return this.preciseAccessConfigList;
	}

	public void setPreciseAccessConfigList(List<PreciseAccessConfig> preciseAccessConfigList) {
		this.preciseAccessConfigList = preciseAccessConfigList;
	}

	public static class PreciseAccessConfig {

		private String domain;

		private List<Rule> ruleList;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public List<Rule> getRuleList() {
			return this.ruleList;
		}

		public void setRuleList(List<Rule> ruleList) {
			this.ruleList = ruleList;
		}

		public static class Rule {

			private String owner;

			private Long expires;

			private String name;

			private String action;

			private List<Condition> conditionList;

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}

			public Long getExpires() {
				return this.expires;
			}

			public void setExpires(Long expires) {
				this.expires = expires;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

			public List<Condition> getConditionList() {
				return this.conditionList;
			}

			public void setConditionList(List<Condition> conditionList) {
				this.conditionList = conditionList;
			}

			public static class Condition {

				private String matchMethod;

				private String field;

				private String headerName;

				private String content;

				public String getMatchMethod() {
					return this.matchMethod;
				}

				public void setMatchMethod(String matchMethod) {
					this.matchMethod = matchMethod;
				}

				public String getField() {
					return this.field;
				}

				public void setField(String field) {
					this.field = field;
				}

				public String getHeaderName() {
					return this.headerName;
				}

				public void setHeaderName(String headerName) {
					this.headerName = headerName;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}
		}
	}

	@Override
	public DescribeWebPreciseAccessRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebPreciseAccessRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
