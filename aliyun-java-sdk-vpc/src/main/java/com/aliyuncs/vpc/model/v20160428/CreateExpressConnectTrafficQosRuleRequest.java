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

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateExpressConnectTrafficQosRuleRequest extends RpcAcsRequest<CreateExpressConnectTrafficQosRuleResponse> {
	   

	private String dstCidr;

	private String clientToken;

	private String ruleName;

	private String srcCidr;

	private String dstIPv6Cidr;

	private String dstPortRange;

	private String protocol;

	private String qosId;

	private String queueId;

	private Integer matchDscp;

	private String ruleDescription;

	private String resourceOwnerAccount;

	private Integer remarkingDscp;

	private String ownerAccount;

	private Integer priority;

	private Long ownerId;

	private String srcPortRange;

	private String srcIPv6Cidr;
	public CreateExpressConnectTrafficQosRuleRequest() {
		super("Vpc", "2016-04-28", "CreateExpressConnectTrafficQosRule", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDstCidr() {
		return this.dstCidr;
	}

	public void setDstCidr(String dstCidr) {
		this.dstCidr = dstCidr;
		if(dstCidr != null){
			putQueryParameter("DstCidr", dstCidr);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getSrcCidr() {
		return this.srcCidr;
	}

	public void setSrcCidr(String srcCidr) {
		this.srcCidr = srcCidr;
		if(srcCidr != null){
			putQueryParameter("SrcCidr", srcCidr);
		}
	}

	public String getDstIPv6Cidr() {
		return this.dstIPv6Cidr;
	}

	public void setDstIPv6Cidr(String dstIPv6Cidr) {
		this.dstIPv6Cidr = dstIPv6Cidr;
		if(dstIPv6Cidr != null){
			putQueryParameter("DstIPv6Cidr", dstIPv6Cidr);
		}
	}

	public String getDstPortRange() {
		return this.dstPortRange;
	}

	public void setDstPortRange(String dstPortRange) {
		this.dstPortRange = dstPortRange;
		if(dstPortRange != null){
			putQueryParameter("DstPortRange", dstPortRange);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getQosId() {
		return this.qosId;
	}

	public void setQosId(String qosId) {
		this.qosId = qosId;
		if(qosId != null){
			putQueryParameter("QosId", qosId);
		}
	}

	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
		if(queueId != null){
			putQueryParameter("QueueId", queueId);
		}
	}

	public Integer getMatchDscp() {
		return this.matchDscp;
	}

	public void setMatchDscp(Integer matchDscp) {
		this.matchDscp = matchDscp;
		if(matchDscp != null){
			putQueryParameter("MatchDscp", matchDscp.toString());
		}
	}

	public String getRuleDescription() {
		return this.ruleDescription;
	}

	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
		if(ruleDescription != null){
			putQueryParameter("RuleDescription", ruleDescription);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Integer getRemarkingDscp() {
		return this.remarkingDscp;
	}

	public void setRemarkingDscp(Integer remarkingDscp) {
		this.remarkingDscp = remarkingDscp;
		if(remarkingDscp != null){
			putQueryParameter("RemarkingDscp", remarkingDscp.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSrcPortRange() {
		return this.srcPortRange;
	}

	public void setSrcPortRange(String srcPortRange) {
		this.srcPortRange = srcPortRange;
		if(srcPortRange != null){
			putQueryParameter("SrcPortRange", srcPortRange);
		}
	}

	public String getSrcIPv6Cidr() {
		return this.srcIPv6Cidr;
	}

	public void setSrcIPv6Cidr(String srcIPv6Cidr) {
		this.srcIPv6Cidr = srcIPv6Cidr;
		if(srcIPv6Cidr != null){
			putQueryParameter("SrcIPv6Cidr", srcIPv6Cidr);
		}
	}

	@Override
	public Class<CreateExpressConnectTrafficQosRuleResponse> getResponseClass() {
		return CreateExpressConnectTrafficQosRuleResponse.class;
	}

}
