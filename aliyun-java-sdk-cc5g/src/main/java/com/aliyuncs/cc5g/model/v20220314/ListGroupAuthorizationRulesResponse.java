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

package com.aliyuncs.cc5g.model.v20220314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cc5g.transform.v20220314.ListGroupAuthorizationRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupAuthorizationRulesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private String maxResults;

	private String totalCount;

	private List<GroupAuthorizationRule> groupAuthorizationRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<GroupAuthorizationRule> getGroupAuthorizationRules() {
		return this.groupAuthorizationRules;
	}

	public void setGroupAuthorizationRules(List<GroupAuthorizationRule> groupAuthorizationRules) {
		this.groupAuthorizationRules = groupAuthorizationRules;
	}

	public static class GroupAuthorizationRule {

		private String authorizationRuleId;

		private String status;

		private String name;

		private String description;

		private String type;

		private String sourceCidr;

		private String destinationType;

		private String protocol;

		private String destinationPort;

		private String destination;

		private String policy;

		private Boolean dns;

		private String createTime;

		public String getAuthorizationRuleId() {
			return this.authorizationRuleId;
		}

		public void setAuthorizationRuleId(String authorizationRuleId) {
			this.authorizationRuleId = authorizationRuleId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getSourceCidr() {
			return this.sourceCidr;
		}

		public void setSourceCidr(String sourceCidr) {
			this.sourceCidr = sourceCidr;
		}

		public String getDestinationType() {
			return this.destinationType;
		}

		public void setDestinationType(String destinationType) {
			this.destinationType = destinationType;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getDestinationPort() {
			return this.destinationPort;
		}

		public void setDestinationPort(String destinationPort) {
			this.destinationPort = destinationPort;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public Boolean getDns() {
			return this.dns;
		}

		public void setDns(Boolean dns) {
			this.dns = dns;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListGroupAuthorizationRulesResponse getInstance(UnmarshallerContext context) {
		return	ListGroupAuthorizationRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
