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
public class CreateCenInterRegionTrafficQosQueueRequest extends RpcAcsRequest<CreateCenInterRegionTrafficQosQueueResponse> {
	   

	private List<Integer> dscpss;

	private Long resourceOwnerId;

	private String clientToken;

	private String qosQueueName;

	private String remainBandwidthPercent;

	private Boolean dryRun;

	private String trafficQosPolicyId;

	private String resourceOwnerAccount;

	private Long bandwidth;

	private String ownerAccount;

	private Long ownerId;

	private String qosQueueDescription;
	public CreateCenInterRegionTrafficQosQueueRequest() {
		super("Cbn", "2017-09-12", "CreateCenInterRegionTrafficQosQueue", "cbn");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Integer> getDscpss() {
		return this.dscpss;
	}

	public void setDscpss(List<Integer> dscpss) {
		this.dscpss = dscpss;	
		if (dscpss != null) {
			for (int i = 0; i < dscpss.size(); i++) {
				putQueryParameter("Dscps." + (i + 1) , dscpss.get(i));
			}
		}	
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

	public String getQosQueueName() {
		return this.qosQueueName;
	}

	public void setQosQueueName(String qosQueueName) {
		this.qosQueueName = qosQueueName;
		if(qosQueueName != null){
			putQueryParameter("QosQueueName", qosQueueName);
		}
	}

	public String getRemainBandwidthPercent() {
		return this.remainBandwidthPercent;
	}

	public void setRemainBandwidthPercent(String remainBandwidthPercent) {
		this.remainBandwidthPercent = remainBandwidthPercent;
		if(remainBandwidthPercent != null){
			putQueryParameter("RemainBandwidthPercent", remainBandwidthPercent);
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

	public String getTrafficQosPolicyId() {
		return this.trafficQosPolicyId;
	}

	public void setTrafficQosPolicyId(String trafficQosPolicyId) {
		this.trafficQosPolicyId = trafficQosPolicyId;
		if(trafficQosPolicyId != null){
			putQueryParameter("TrafficQosPolicyId", trafficQosPolicyId);
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

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
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

	public String getQosQueueDescription() {
		return this.qosQueueDescription;
	}

	public void setQosQueueDescription(String qosQueueDescription) {
		this.qosQueueDescription = qosQueueDescription;
		if(qosQueueDescription != null){
			putQueryParameter("QosQueueDescription", qosQueueDescription);
		}
	}

	@Override
	public Class<CreateCenInterRegionTrafficQosQueueResponse> getResponseClass() {
		return CreateCenInterRegionTrafficQosQueueResponse.class;
	}

}
