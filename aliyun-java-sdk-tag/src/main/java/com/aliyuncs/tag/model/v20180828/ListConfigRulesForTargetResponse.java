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

package com.aliyuncs.tag.model.v20180828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.tag.transform.v20180828.ListConfigRulesForTargetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListConfigRulesForTargetResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<DataItem> data;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String aggregatorId;

		private String configRuleId;

		private String policyType;

		private Boolean remediation;

		private String tagKey;

		private String tagValue;

		private String targetId;

		private String targetType;

		public String getAggregatorId() {
			return this.aggregatorId;
		}

		public void setAggregatorId(String aggregatorId) {
			this.aggregatorId = aggregatorId;
		}

		public String getConfigRuleId() {
			return this.configRuleId;
		}

		public void setConfigRuleId(String configRuleId) {
			this.configRuleId = configRuleId;
		}

		public String getPolicyType() {
			return this.policyType;
		}

		public void setPolicyType(String policyType) {
			this.policyType = policyType;
		}

		public Boolean getRemediation() {
			return this.remediation;
		}

		public void setRemediation(Boolean remediation) {
			this.remediation = remediation;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getTargetId() {
			return this.targetId;
		}

		public void setTargetId(String targetId) {
			this.targetId = targetId;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}
	}

	@Override
	public ListConfigRulesForTargetResponse getInstance(UnmarshallerContext context) {
		return	ListConfigRulesForTargetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
