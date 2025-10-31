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
public class CreateCenInterRegionTrafficQosPolicyRequest extends RpcAcsRequest<CreateCenInterRegionTrafficQosPolicyResponse> {
	   

	private Long resourceOwnerId;

	private String bandwidthGuaranteeMode;

	private String clientToken;

	private List<TrafficQosQueues> trafficQosQueuess;

	private String trafficQosPolicyName;

	private Boolean dryRun;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String trafficQosPolicyDescription;

	private Long ownerId;

	private String transitRouterId;

	private String transitRouterAttachmentId;
	public CreateCenInterRegionTrafficQosPolicyRequest() {
		super("Cbn", "2017-09-12", "CreateCenInterRegionTrafficQosPolicy", "cbn");
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

	public String getBandwidthGuaranteeMode() {
		return this.bandwidthGuaranteeMode;
	}

	public void setBandwidthGuaranteeMode(String bandwidthGuaranteeMode) {
		this.bandwidthGuaranteeMode = bandwidthGuaranteeMode;
		if(bandwidthGuaranteeMode != null){
			putQueryParameter("BandwidthGuaranteeMode", bandwidthGuaranteeMode);
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

	public List<TrafficQosQueues> getTrafficQosQueuess() {
		return this.trafficQosQueuess;
	}

	public void setTrafficQosQueuess(List<TrafficQosQueues> trafficQosQueuess) {
		this.trafficQosQueuess = trafficQosQueuess;	
		if (trafficQosQueuess != null) {
			for (int depth1 = 0; depth1 < trafficQosQueuess.size(); depth1++) {
				if (trafficQosQueuess.get(depth1).getDscpss() != null) {
					for (int i = 0; i < trafficQosQueuess.get(depth1).getDscpss().size(); i++) {
						putQueryParameter("TrafficQosQueues." + (depth1 + 1) + ".Dscps." + (i + 1) , trafficQosQueuess.get(depth1).getDscpss().get(i));
					}
				}
				putQueryParameter("TrafficQosQueues." + (depth1 + 1) + ".Bandwidth" , trafficQosQueuess.get(depth1).getBandwidth());
				putQueryParameter("TrafficQosQueues." + (depth1 + 1) + ".QosQueueName" , trafficQosQueuess.get(depth1).getQosQueueName());
				putQueryParameter("TrafficQosQueues." + (depth1 + 1) + ".RemainBandwidthPercent" , trafficQosQueuess.get(depth1).getRemainBandwidthPercent());
				putQueryParameter("TrafficQosQueues." + (depth1 + 1) + ".QosQueueDescription" , trafficQosQueuess.get(depth1).getQosQueueDescription());
			}
		}	
	}

	public String getTrafficQosPolicyName() {
		return this.trafficQosPolicyName;
	}

	public void setTrafficQosPolicyName(String trafficQosPolicyName) {
		this.trafficQosPolicyName = trafficQosPolicyName;
		if(trafficQosPolicyName != null){
			putQueryParameter("TrafficQosPolicyName", trafficQosPolicyName);
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

	public String getTrafficQosPolicyDescription() {
		return this.trafficQosPolicyDescription;
	}

	public void setTrafficQosPolicyDescription(String trafficQosPolicyDescription) {
		this.trafficQosPolicyDescription = trafficQosPolicyDescription;
		if(trafficQosPolicyDescription != null){
			putQueryParameter("TrafficQosPolicyDescription", trafficQosPolicyDescription);
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

	public String getTransitRouterId() {
		return this.transitRouterId;
	}

	public void setTransitRouterId(String transitRouterId) {
		this.transitRouterId = transitRouterId;
		if(transitRouterId != null){
			putQueryParameter("TransitRouterId", transitRouterId);
		}
	}

	public String getTransitRouterAttachmentId() {
		return this.transitRouterAttachmentId;
	}

	public void setTransitRouterAttachmentId(String transitRouterAttachmentId) {
		this.transitRouterAttachmentId = transitRouterAttachmentId;
		if(transitRouterAttachmentId != null){
			putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
		}
	}

	public static class TrafficQosQueues {

		private List<Integer> dscpss;

		private String bandwidth;

		private String qosQueueName;

		private String remainBandwidthPercent;

		private String qosQueueDescription;

		public List<Integer> getDscpss() {
			return this.dscpss;
		}

		public void setDscpss(List<Integer> dscpss) {
			this.dscpss = dscpss;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getQosQueueName() {
			return this.qosQueueName;
		}

		public void setQosQueueName(String qosQueueName) {
			this.qosQueueName = qosQueueName;
		}

		public String getRemainBandwidthPercent() {
			return this.remainBandwidthPercent;
		}

		public void setRemainBandwidthPercent(String remainBandwidthPercent) {
			this.remainBandwidthPercent = remainBandwidthPercent;
		}

		public String getQosQueueDescription() {
			return this.qosQueueDescription;
		}

		public void setQosQueueDescription(String qosQueueDescription) {
			this.qosQueueDescription = qosQueueDescription;
		}
	}

	@Override
	public Class<CreateCenInterRegionTrafficQosPolicyResponse> getResponseClass() {
		return CreateCenInterRegionTrafficQosPolicyResponse.class;
	}

}
