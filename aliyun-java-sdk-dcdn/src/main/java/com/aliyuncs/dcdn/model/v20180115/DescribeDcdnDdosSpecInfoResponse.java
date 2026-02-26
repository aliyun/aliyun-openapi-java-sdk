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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDdosSpecInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDdosSpecInfoResponse extends AcsResponse {

	private String edition;

	private String requestId;

	private String enable;

	private List<RuleInfoItem> specInfos;

	public String getEdition() {
		return this.edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEnable() {
		return this.enable;
	}

	public void setEnable(String enable) {
		this.enable = enable;
	}

	public List<RuleInfoItem> getSpecInfos() {
		return this.specInfos;
	}

	public void setSpecInfos(List<RuleInfoItem> specInfos) {
		this.specInfos = specInfos;
	}

	public static class RuleInfoItem {

		private String rule;

		private List<ConfigItem> configs;

		public String getRule() {
			return this.rule;
		}

		public void setRule(String rule) {
			this.rule = rule;
		}

		public List<ConfigItem> getConfigs() {
			return this.configs;
		}

		public void setConfigs(List<ConfigItem> configs) {
			this.configs = configs;
		}

		public static class ConfigItem {

			private String value;

			private String config;

			private String expr;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getConfig() {
				return this.config;
			}

			public void setConfig(String config) {
				this.config = config;
			}

			public String getExpr() {
				return this.expr;
			}

			public void setExpr(String expr) {
				this.expr = expr;
			}
		}
	}

	@Override
	public DescribeDcdnDdosSpecInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDdosSpecInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
