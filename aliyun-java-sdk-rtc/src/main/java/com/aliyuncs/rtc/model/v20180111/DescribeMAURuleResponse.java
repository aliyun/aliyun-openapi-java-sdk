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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeMAURuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMAURuleResponse extends AcsResponse {

	private String requestId;

	private List<Rule> rules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Rule> getRules() {
		return this.rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public static class Rule {

		private Long ruleId;

		private String channelPrefix;

		private String useridPrefix;

		private Long templateId;

		private String callBack;

		private Integer isEnable;

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getChannelPrefix() {
			return this.channelPrefix;
		}

		public void setChannelPrefix(String channelPrefix) {
			this.channelPrefix = channelPrefix;
		}

		public String getUseridPrefix() {
			return this.useridPrefix;
		}

		public void setUseridPrefix(String useridPrefix) {
			this.useridPrefix = useridPrefix;
		}

		public Long getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Long templateId) {
			this.templateId = templateId;
		}

		public String getCallBack() {
			return this.callBack;
		}

		public void setCallBack(String callBack) {
			this.callBack = callBack;
		}

		public Integer getIsEnable() {
			return this.isEnable;
		}

		public void setIsEnable(Integer isEnable) {
			this.isEnable = isEnable;
		}
	}

	@Override
	public DescribeMAURuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeMAURuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
