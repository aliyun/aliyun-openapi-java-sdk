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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTrafficMarkingPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrafficMarkingPoliciesResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private List<TrafficMarkingPolicy> trafficMarkingPolicies;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<TrafficMarkingPolicy> getTrafficMarkingPolicies() {
		return this.trafficMarkingPolicies;
	}

	public void setTrafficMarkingPolicies(List<TrafficMarkingPolicy> trafficMarkingPolicies) {
		this.trafficMarkingPolicies = trafficMarkingPolicies;
	}

	public static class TrafficMarkingPolicy {

		private String trafficMarkingPolicyStatus;

		private String trafficMarkingPolicyId;

		private Integer markingDscp;

		private String trafficMarkingPolicyName;

		private Integer priority;

		private String trafficMarkingPolicyDescription;

		private List<TrafficMatchRule> trafficMatchRules;

		public String getTrafficMarkingPolicyStatus() {
			return this.trafficMarkingPolicyStatus;
		}

		public void setTrafficMarkingPolicyStatus(String trafficMarkingPolicyStatus) {
			this.trafficMarkingPolicyStatus = trafficMarkingPolicyStatus;
		}

		public String getTrafficMarkingPolicyId() {
			return this.trafficMarkingPolicyId;
		}

		public void setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
			this.trafficMarkingPolicyId = trafficMarkingPolicyId;
		}

		public Integer getMarkingDscp() {
			return this.markingDscp;
		}

		public void setMarkingDscp(Integer markingDscp) {
			this.markingDscp = markingDscp;
		}

		public String getTrafficMarkingPolicyName() {
			return this.trafficMarkingPolicyName;
		}

		public void setTrafficMarkingPolicyName(String trafficMarkingPolicyName) {
			this.trafficMarkingPolicyName = trafficMarkingPolicyName;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getTrafficMarkingPolicyDescription() {
			return this.trafficMarkingPolicyDescription;
		}

		public void setTrafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
			this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
		}

		public List<TrafficMatchRule> getTrafficMatchRules() {
			return this.trafficMatchRules;
		}

		public void setTrafficMatchRules(List<TrafficMatchRule> trafficMatchRules) {
			this.trafficMatchRules = trafficMatchRules;
		}

		public static class TrafficMatchRule {

			private Integer matchDscp;

			private String dstCidr;

			private String trafficMatchRuleDescription;

			private String protocol;

			private String trafficMatchRuleId;

			private String srcCidr;

			private String trafficMatchRuleName;

			private String trafficMatchRuleStatus;

			private List<Integer> dstPortRange;

			private List<Integer> srcPortRange;

			public Integer getMatchDscp() {
				return this.matchDscp;
			}

			public void setMatchDscp(Integer matchDscp) {
				this.matchDscp = matchDscp;
			}

			public String getDstCidr() {
				return this.dstCidr;
			}

			public void setDstCidr(String dstCidr) {
				this.dstCidr = dstCidr;
			}

			public String getTrafficMatchRuleDescription() {
				return this.trafficMatchRuleDescription;
			}

			public void setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
				this.trafficMatchRuleDescription = trafficMatchRuleDescription;
			}

			public String getBizProtocol() {
				return this.protocol;
			}

			public void setBizProtocol(String protocol) {
				this.protocol = protocol;
			}

			public String getTrafficMatchRuleId() {
				return this.trafficMatchRuleId;
			}

			public void setTrafficMatchRuleId(String trafficMatchRuleId) {
				this.trafficMatchRuleId = trafficMatchRuleId;
			}

			public String getSrcCidr() {
				return this.srcCidr;
			}

			public void setSrcCidr(String srcCidr) {
				this.srcCidr = srcCidr;
			}

			public String getTrafficMatchRuleName() {
				return this.trafficMatchRuleName;
			}

			public void setTrafficMatchRuleName(String trafficMatchRuleName) {
				this.trafficMatchRuleName = trafficMatchRuleName;
			}

			public String getTrafficMatchRuleStatus() {
				return this.trafficMatchRuleStatus;
			}

			public void setTrafficMatchRuleStatus(String trafficMatchRuleStatus) {
				this.trafficMatchRuleStatus = trafficMatchRuleStatus;
			}

			public List<Integer> getDstPortRange() {
				return this.dstPortRange;
			}

			public void setDstPortRange(List<Integer> dstPortRange) {
				this.dstPortRange = dstPortRange;
			}

			public List<Integer> getSrcPortRange() {
				return this.srcPortRange;
			}

			public void setSrcPortRange(List<Integer> srcPortRange) {
				this.srcPortRange = srcPortRange;
			}
		}
	}

	@Override
	public ListTrafficMarkingPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListTrafficMarkingPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
