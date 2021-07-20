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
import com.aliyuncs.iotcc.transform.v20210513.ListAuthorizationRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAuthorizationRulesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<AuthorizationRuleModels> authorizationRules;

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

	public List<AuthorizationRuleModels> getAuthorizationRules() {
		return this.authorizationRules;
	}

	public void setAuthorizationRules(List<AuthorizationRuleModels> authorizationRules) {
		this.authorizationRules = authorizationRules;
	}

	public static class AuthorizationRuleModels {

		private String ioTCloudConnectorId;

		private String policy;

		private String authorizationRuleStatus;

		private String destinationType;

		private String destination;

		private String authorizationRuleName;

		private String authorizationRuleDescription;

		private String authorizationRuleId;

		private List<String> sourceCidrs;

		public String getIoTCloudConnectorId() {
			return this.ioTCloudConnectorId;
		}

		public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
			this.ioTCloudConnectorId = ioTCloudConnectorId;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getAuthorizationRuleStatus() {
			return this.authorizationRuleStatus;
		}

		public void setAuthorizationRuleStatus(String authorizationRuleStatus) {
			this.authorizationRuleStatus = authorizationRuleStatus;
		}

		public String getDestinationType() {
			return this.destinationType;
		}

		public void setDestinationType(String destinationType) {
			this.destinationType = destinationType;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getAuthorizationRuleName() {
			return this.authorizationRuleName;
		}

		public void setAuthorizationRuleName(String authorizationRuleName) {
			this.authorizationRuleName = authorizationRuleName;
		}

		public String getAuthorizationRuleDescription() {
			return this.authorizationRuleDescription;
		}

		public void setAuthorizationRuleDescription(String authorizationRuleDescription) {
			this.authorizationRuleDescription = authorizationRuleDescription;
		}

		public String getAuthorizationRuleId() {
			return this.authorizationRuleId;
		}

		public void setAuthorizationRuleId(String authorizationRuleId) {
			this.authorizationRuleId = authorizationRuleId;
		}

		public List<String> getSourceCidrs() {
			return this.sourceCidrs;
		}

		public void setSourceCidrs(List<String> sourceCidrs) {
			this.sourceCidrs = sourceCidrs;
		}
	}

	@Override
	public ListAuthorizationRulesResponse getInstance(UnmarshallerContext context) {
		return	ListAuthorizationRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
