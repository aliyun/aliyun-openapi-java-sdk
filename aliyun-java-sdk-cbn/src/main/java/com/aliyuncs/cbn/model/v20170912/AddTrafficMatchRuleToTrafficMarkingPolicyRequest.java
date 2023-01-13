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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddTrafficMatchRuleToTrafficMarkingPolicyRequest extends RpcAcsRequest<AddTrafficMatchRuleToTrafficMarkingPolicyResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String trafficMarkingPolicyId;

	private Boolean dryRun;

	private List<TrafficMatchRules> trafficMatchRuless;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public AddTrafficMatchRuleToTrafficMarkingPolicyRequest() {
		super("Cbn", "2017-09-12", "AddTrafficMatchRuleToTrafficMarkingPolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getTrafficMarkingPolicyId() {
		return this.trafficMarkingPolicyId;
	}

	public void setTrafficMarkingPolicyId(String trafficMarkingPolicyId) {
		this.trafficMarkingPolicyId = trafficMarkingPolicyId;
		if(trafficMarkingPolicyId != null){
			putQueryParameter("TrafficMarkingPolicyId", trafficMarkingPolicyId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<TrafficMatchRules> getTrafficMatchRuless() {
		return this.trafficMatchRuless;
	}

	public void setTrafficMatchRuless(List<TrafficMatchRules> trafficMatchRuless) {
		this.trafficMatchRuless = trafficMatchRuless;	
		if (trafficMatchRuless != null) {
			for (int depth1 = 0; depth1 < trafficMatchRuless.size(); depth1++) {
				if (trafficMatchRuless.get(depth1).getDstPortRanges() != null) {
					for (int i = 0; i < trafficMatchRuless.get(depth1).getDstPortRanges().size(); i++) {
						putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".DstPortRange." + (i + 1) , trafficMatchRuless.get(depth1).getDstPortRanges().get(i));
					}
				}
				putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".MatchDscp" , trafficMatchRuless.get(depth1).getMatchDscp());
				putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".Protocol" , trafficMatchRuless.get(depth1).getBizProtocol());
				putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".TrafficMatchRuleDescription" , trafficMatchRuless.get(depth1).getTrafficMatchRuleDescription());
				if (trafficMatchRuless.get(depth1).getSrcPortRanges() != null) {
					for (int i = 0; i < trafficMatchRuless.get(depth1).getSrcPortRanges().size(); i++) {
						putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".SrcPortRange." + (i + 1) , trafficMatchRuless.get(depth1).getSrcPortRanges().get(i));
					}
				}
				putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".DstCidr" , trafficMatchRuless.get(depth1).getDstCidr());
				putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".TrafficMatchRuleName" , trafficMatchRuless.get(depth1).getTrafficMatchRuleName());
				putQueryParameter("TrafficMatchRules." + (depth1 + 1) + ".SrcCidr" , trafficMatchRuless.get(depth1).getSrcCidr());
			}
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public static class TrafficMatchRules {

		private List<Integer> dstPortRanges;

		private Integer matchDscp;

		private String protocol;

		private String trafficMatchRuleDescription;

		private List<Integer> srcPortRanges;

		private String dstCidr;

		private String trafficMatchRuleName;

		private String srcCidr;

		public List<Integer> getDstPortRanges() {
			return this.dstPortRanges;
		}

		public void setDstPortRanges(List<Integer> dstPortRanges) {
			this.dstPortRanges = dstPortRanges;
		}

		public Integer getMatchDscp() {
			return this.matchDscp;
		}

		public void setMatchDscp(Integer matchDscp) {
			this.matchDscp = matchDscp;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getTrafficMatchRuleDescription() {
			return this.trafficMatchRuleDescription;
		}

		public void setTrafficMatchRuleDescription(String trafficMatchRuleDescription) {
			this.trafficMatchRuleDescription = trafficMatchRuleDescription;
		}

		public List<Integer> getSrcPortRanges() {
			return this.srcPortRanges;
		}

		public void setSrcPortRanges(List<Integer> srcPortRanges) {
			this.srcPortRanges = srcPortRanges;
		}

		public String getDstCidr() {
			return this.dstCidr;
		}

		public void setDstCidr(String dstCidr) {
			this.dstCidr = dstCidr;
		}

		public String getTrafficMatchRuleName() {
			return this.trafficMatchRuleName;
		}

		public void setTrafficMatchRuleName(String trafficMatchRuleName) {
			this.trafficMatchRuleName = trafficMatchRuleName;
		}

		public String getSrcCidr() {
			return this.srcCidr;
		}

		public void setSrcCidr(String srcCidr) {
			this.srcCidr = srcCidr;
		}
	}

	@Override
	public Class<AddTrafficMatchRuleToTrafficMarkingPolicyResponse> getResponseClass() {
		return AddTrafficMatchRuleToTrafficMarkingPolicyResponse.class;
	}

}
