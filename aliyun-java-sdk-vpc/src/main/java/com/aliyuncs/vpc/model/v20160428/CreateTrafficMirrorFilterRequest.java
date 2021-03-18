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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTrafficMirrorFilterRequest extends RpcAcsRequest<CreateTrafficMirrorFilterResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private List<IngressRules> ingressRuless;

	private String trafficMirrorFilterName;

	private List<EgressRules> egressRuless;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String trafficMirrorFilterDescription;
	public CreateTrafficMirrorFilterRequest() {
		super("Vpc", "2016-04-28", "CreateTrafficMirrorFilter", "vpc");
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

	public List<IngressRules> getIngressRuless() {
		return this.ingressRuless;
	}

	public void setIngressRuless(List<IngressRules> ingressRuless) {
		this.ingressRuless = ingressRuless;	
		if (ingressRuless != null) {
			for (int depth1 = 0; depth1 < ingressRuless.size(); depth1++) {
				putQueryParameter("IngressRules." + (depth1 + 1) + ".Priority" , ingressRuless.get(depth1).getPriority());
				putQueryParameter("IngressRules." + (depth1 + 1) + ".Action" , ingressRuless.get(depth1).getAction());
				putQueryParameter("IngressRules." + (depth1 + 1) + ".Protocol" , ingressRuless.get(depth1).getBizProtocol());
				putQueryParameter("IngressRules." + (depth1 + 1) + ".DestinationCidrBlock" , ingressRuless.get(depth1).getDestinationCidrBlock());
				putQueryParameter("IngressRules." + (depth1 + 1) + ".SourceCidrBlock" , ingressRuless.get(depth1).getSourceCidrBlock());
				putQueryParameter("IngressRules." + (depth1 + 1) + ".DestinationPortRange" , ingressRuless.get(depth1).getDestinationPortRange());
				putQueryParameter("IngressRules." + (depth1 + 1) + ".SourcePortRange" , ingressRuless.get(depth1).getSourcePortRange());
			}
		}	
	}

	public String getTrafficMirrorFilterName() {
		return this.trafficMirrorFilterName;
	}

	public void setTrafficMirrorFilterName(String trafficMirrorFilterName) {
		this.trafficMirrorFilterName = trafficMirrorFilterName;
		if(trafficMirrorFilterName != null){
			putQueryParameter("TrafficMirrorFilterName", trafficMirrorFilterName);
		}
	}

	public List<EgressRules> getEgressRuless() {
		return this.egressRuless;
	}

	public void setEgressRuless(List<EgressRules> egressRuless) {
		this.egressRuless = egressRuless;	
		if (egressRuless != null) {
			for (int depth1 = 0; depth1 < egressRuless.size(); depth1++) {
				putQueryParameter("EgressRules." + (depth1 + 1) + ".Priority" , egressRuless.get(depth1).getPriority());
				putQueryParameter("EgressRules." + (depth1 + 1) + ".Action" , egressRuless.get(depth1).getAction());
				putQueryParameter("EgressRules." + (depth1 + 1) + ".Protocol" , egressRuless.get(depth1).getBizProtocol());
				putQueryParameter("EgressRules." + (depth1 + 1) + ".DestinationCidrBlock" , egressRuless.get(depth1).getDestinationCidrBlock());
				putQueryParameter("EgressRules." + (depth1 + 1) + ".SourceCidrBlock" , egressRuless.get(depth1).getSourceCidrBlock());
				putQueryParameter("EgressRules." + (depth1 + 1) + ".DestinationPortRange" , egressRuless.get(depth1).getDestinationPortRange());
				putQueryParameter("EgressRules." + (depth1 + 1) + ".SourcePortRange" , egressRuless.get(depth1).getSourcePortRange());
			}
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

	public String getTrafficMirrorFilterDescription() {
		return this.trafficMirrorFilterDescription;
	}

	public void setTrafficMirrorFilterDescription(String trafficMirrorFilterDescription) {
		this.trafficMirrorFilterDescription = trafficMirrorFilterDescription;
		if(trafficMirrorFilterDescription != null){
			putQueryParameter("TrafficMirrorFilterDescription", trafficMirrorFilterDescription);
		}
	}

	public static class IngressRules {

		private Integer priority;

		private String action;

		private String protocol;

		private String destinationCidrBlock;

		private String sourceCidrBlock;

		private String destinationPortRange;

		private String sourcePortRange;

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getSourceCidrBlock() {
			return this.sourceCidrBlock;
		}

		public void setSourceCidrBlock(String sourceCidrBlock) {
			this.sourceCidrBlock = sourceCidrBlock;
		}

		public String getDestinationPortRange() {
			return this.destinationPortRange;
		}

		public void setDestinationPortRange(String destinationPortRange) {
			this.destinationPortRange = destinationPortRange;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}
	}

	public static class EgressRules {

		private Integer priority;

		private String action;

		private String protocol;

		private String destinationCidrBlock;

		private String sourceCidrBlock;

		private String destinationPortRange;

		private String sourcePortRange;

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getDestinationCidrBlock() {
			return this.destinationCidrBlock;
		}

		public void setDestinationCidrBlock(String destinationCidrBlock) {
			this.destinationCidrBlock = destinationCidrBlock;
		}

		public String getSourceCidrBlock() {
			return this.sourceCidrBlock;
		}

		public void setSourceCidrBlock(String sourceCidrBlock) {
			this.sourceCidrBlock = sourceCidrBlock;
		}

		public String getDestinationPortRange() {
			return this.destinationPortRange;
		}

		public void setDestinationPortRange(String destinationPortRange) {
			this.destinationPortRange = destinationPortRange;
		}

		public String getSourcePortRange() {
			return this.sourcePortRange;
		}

		public void setSourcePortRange(String sourcePortRange) {
			this.sourcePortRange = sourcePortRange;
		}
	}

	@Override
	public Class<CreateTrafficMirrorFilterResponse> getResponseClass() {
		return CreateTrafficMirrorFilterResponse.class;
	}

}
