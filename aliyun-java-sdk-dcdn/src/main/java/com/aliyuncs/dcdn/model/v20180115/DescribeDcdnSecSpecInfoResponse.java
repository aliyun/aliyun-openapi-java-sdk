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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnSecSpecInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnSecSpecInfoResponse extends AcsResponse {

	private String requestId;

	private String version;

	private List<RuleInfoItem> specInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<RuleInfoItem> getSpecInfos() {
		return this.specInfos;
	}

	public void setSpecInfos(List<RuleInfoItem> specInfos) {
		this.specInfos = specInfos;
	}

	public static class RuleInfoItem {

		private String ruleCode;

		private List<ConfigItem> ruleConfigs;

		public String getRuleCode() {
			return this.ruleCode;
		}

		public void setRuleCode(String ruleCode) {
			this.ruleCode = ruleCode;
		}

		public List<ConfigItem> getRuleConfigs() {
			return this.ruleConfigs;
		}

		public void setRuleConfigs(List<ConfigItem> ruleConfigs) {
			this.ruleConfigs = ruleConfigs;
		}

		public static class ConfigItem {

			private String code;

			private String expr;

			private String value;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getExpr() {
				return this.expr;
			}

			public void setExpr(String expr) {
				this.expr = expr;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeDcdnSecSpecInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnSecSpecInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
