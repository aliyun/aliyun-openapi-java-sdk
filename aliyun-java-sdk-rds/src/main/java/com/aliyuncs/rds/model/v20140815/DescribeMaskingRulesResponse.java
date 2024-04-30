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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeMaskingRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMaskingRulesResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private List<EncDBInfo> rules;

		public List<EncDBInfo> getRules() {
			return this.rules;
		}

		public void setRules(List<EncDBInfo> rules) {
			this.rules = rules;
		}

		public static class EncDBInfo {

			private String ruleName;

			private String enabled;

			private String defaultAlgo;

			private String maskingAlgo;

			private RuleConfig ruleConfig;

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getEnabled() {
				return this.enabled;
			}

			public void setEnabled(String enabled) {
				this.enabled = enabled;
			}

			public String getDefaultAlgo() {
				return this.defaultAlgo;
			}

			public void setDefaultAlgo(String defaultAlgo) {
				this.defaultAlgo = defaultAlgo;
			}

			public String getMaskingAlgo() {
				return this.maskingAlgo;
			}

			public void setMaskingAlgo(String maskingAlgo) {
				this.maskingAlgo = maskingAlgo;
			}

			public RuleConfig getRuleConfig() {
				return this.ruleConfig;
			}

			public void setRuleConfig(RuleConfig ruleConfig) {
				this.ruleConfig = ruleConfig;
			}

			public static class RuleConfig {

				private List<String> databases;

				private List<String> tables;

				private List<String> columns;

				public List<String> getDatabases() {
					return this.databases;
				}

				public void setDatabases(List<String> databases) {
					this.databases = databases;
				}

				public List<String> getTables() {
					return this.tables;
				}

				public void setTables(List<String> tables) {
					this.tables = tables;
				}

				public List<String> getColumns() {
					return this.columns;
				}

				public void setColumns(List<String> columns) {
					this.columns = columns;
				}
			}
		}
	}

	@Override
	public DescribeMaskingRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMaskingRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
