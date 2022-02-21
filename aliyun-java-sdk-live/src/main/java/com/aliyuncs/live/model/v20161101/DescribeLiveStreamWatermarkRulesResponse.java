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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamWatermarkRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamWatermarkRulesResponse extends AcsResponse {

	private String requestId;

	private List<RuleInfo> ruleInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RuleInfo> getRuleInfoList() {
		return this.ruleInfoList;
	}

	public void setRuleInfoList(List<RuleInfo> ruleInfoList) {
		this.ruleInfoList = ruleInfoList;
	}

	public static class RuleInfo {

		private String ruleId;

		private String name;

		private String domain;

		private String app;

		private String stream;

		private String templateId;

		private String description;

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getStream() {
			return this.stream;
		}

		public void setStream(String stream) {
			this.stream = stream;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeLiveStreamWatermarkRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamWatermarkRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
