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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeExpressConnectTrafficQosRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectTrafficQosRuleResponse extends AcsResponse {

	private String requestId;

	private List<RuleListItem> ruleList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RuleListItem> getRuleList() {
		return this.ruleList;
	}

	public void setRuleList(List<RuleListItem> ruleList) {
		this.ruleList = ruleList;
	}

	public static class RuleListItem {

		private String qosId;

		private String queueId;

		private Integer priority;

		private String protocol;

		private String srcCidr;

		private String dstCidr;

		private String srcIPv6Cidr;

		private String dstIPv6Cidr;

		private String srcPortRange;

		private String dstPortRange;

		private Integer matchDscp;

		private Integer remarkingDscp;

		private String ruleName;

		private String ruleDescription;

		private String ruleId;

		private String status;

		public String getQosId() {
			return this.qosId;
		}

		public void setQosId(String qosId) {
			this.qosId = qosId;
		}

		public String getQueueId() {
			return this.queueId;
		}

		public void setQueueId(String queueId) {
			this.queueId = queueId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getSrcCidr() {
			return this.srcCidr;
		}

		public void setSrcCidr(String srcCidr) {
			this.srcCidr = srcCidr;
		}

		public String getDstCidr() {
			return this.dstCidr;
		}

		public void setDstCidr(String dstCidr) {
			this.dstCidr = dstCidr;
		}

		public String getSrcIPv6Cidr() {
			return this.srcIPv6Cidr;
		}

		public void setSrcIPv6Cidr(String srcIPv6Cidr) {
			this.srcIPv6Cidr = srcIPv6Cidr;
		}

		public String getDstIPv6Cidr() {
			return this.dstIPv6Cidr;
		}

		public void setDstIPv6Cidr(String dstIPv6Cidr) {
			this.dstIPv6Cidr = dstIPv6Cidr;
		}

		public String getSrcPortRange() {
			return this.srcPortRange;
		}

		public void setSrcPortRange(String srcPortRange) {
			this.srcPortRange = srcPortRange;
		}

		public String getDstPortRange() {
			return this.dstPortRange;
		}

		public void setDstPortRange(String dstPortRange) {
			this.dstPortRange = dstPortRange;
		}

		public Integer getMatchDscp() {
			return this.matchDscp;
		}

		public void setMatchDscp(Integer matchDscp) {
			this.matchDscp = matchDscp;
		}

		public Integer getRemarkingDscp() {
			return this.remarkingDscp;
		}

		public void setRemarkingDscp(Integer remarkingDscp) {
			this.remarkingDscp = remarkingDscp;
		}

		public String getRuleName() {
			return this.ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public String getRuleDescription() {
			return this.ruleDescription;
		}

		public void setRuleDescription(String ruleDescription) {
			this.ruleDescription = ruleDescription;
		}

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeExpressConnectTrafficQosRuleResponse getInstance(UnmarshallerContext context) {
		return	DescribeExpressConnectTrafficQosRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
