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

package com.aliyuncs.iotcc.model.v20210513;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotcc.transform.v20210513.ListGroupDNSServiceRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupDNSServiceRulesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<DNSServiceRulesItem> dNSServiceRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<DNSServiceRulesItem> getDNSServiceRules() {
		return this.dNSServiceRules;
	}

	public void setDNSServiceRules(List<DNSServiceRulesItem> dNSServiceRules) {
		this.dNSServiceRules = dNSServiceRules;
	}

	public static class DNSServiceRulesItem {

		private String ioTCloudConnectorGroupId;

		private String dNSServiceRuleStatus;

		private String source;

		private String serviceType;

		private String destination;

		private String dNSServiceRuleName;

		private String dNSServiceRuleDescription;

		private String dNSServiceRuleId;

		public String getIoTCloudConnectorGroupId() {
			return this.ioTCloudConnectorGroupId;
		}

		public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
			this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		}

		public String getDNSServiceRuleStatus() {
			return this.dNSServiceRuleStatus;
		}

		public void setDNSServiceRuleStatus(String dNSServiceRuleStatus) {
			this.dNSServiceRuleStatus = dNSServiceRuleStatus;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getServiceType() {
			return this.serviceType;
		}

		public void setServiceType(String serviceType) {
			this.serviceType = serviceType;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getDNSServiceRuleName() {
			return this.dNSServiceRuleName;
		}

		public void setDNSServiceRuleName(String dNSServiceRuleName) {
			this.dNSServiceRuleName = dNSServiceRuleName;
		}

		public String getDNSServiceRuleDescription() {
			return this.dNSServiceRuleDescription;
		}

		public void setDNSServiceRuleDescription(String dNSServiceRuleDescription) {
			this.dNSServiceRuleDescription = dNSServiceRuleDescription;
		}

		public String getDNSServiceRuleId() {
			return this.dNSServiceRuleId;
		}

		public void setDNSServiceRuleId(String dNSServiceRuleId) {
			this.dNSServiceRuleId = dNSServiceRuleId;
		}
	}

	@Override
	public ListGroupDNSServiceRulesResponse getInstance(UnmarshallerContext context) {
		return	ListGroupDNSServiceRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
