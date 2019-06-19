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

package com.aliyuncs.hbase.model.v20170115;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateSubscriptionRequest extends RpcAcsRequest<CreateSubscriptionResponse> {
	
	public CreateSubscriptionRequest() {
		super("HBase", "2017-01-15", "CreateSubscription");
	}

	private Long resourceOwnerId;

	private String subscriptionDescription;

	private String mapping;

	private String sourceInstanceRegionId;

	private String resourceOwnerAccount;

	private String subscriptionType;

	private String destinationInstanceRegionId;

	private Long ownerId;

	private String extraContext;

	private String slbServer;

	private String destinationInstanceId;

	private String zoneId;

	private String sourceInstanceId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSubscriptionDescription() {
		return this.subscriptionDescription;
	}

	public void setSubscriptionDescription(String subscriptionDescription) {
		this.subscriptionDescription = subscriptionDescription;
		if(subscriptionDescription != null){
			putQueryParameter("SubscriptionDescription", subscriptionDescription);
		}
	}

	public String getMapping() {
		return this.mapping;
	}

	public void setMapping(String mapping) {
		this.mapping = mapping;
		if(mapping != null){
			putQueryParameter("Mapping", mapping);
		}
	}

	public String getSourceInstanceRegionId() {
		return this.sourceInstanceRegionId;
	}

	public void setSourceInstanceRegionId(String sourceInstanceRegionId) {
		this.sourceInstanceRegionId = sourceInstanceRegionId;
		if(sourceInstanceRegionId != null){
			putQueryParameter("SourceInstanceRegionId", sourceInstanceRegionId);
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

	public String getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		if(subscriptionType != null){
			putQueryParameter("SubscriptionType", subscriptionType);
		}
	}

	public String getDestinationInstanceRegionId() {
		return this.destinationInstanceRegionId;
	}

	public void setDestinationInstanceRegionId(String destinationInstanceRegionId) {
		this.destinationInstanceRegionId = destinationInstanceRegionId;
		if(destinationInstanceRegionId != null){
			putQueryParameter("DestinationInstanceRegionId", destinationInstanceRegionId);
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

	public String getExtraContext() {
		return this.extraContext;
	}

	public void setExtraContext(String extraContext) {
		this.extraContext = extraContext;
		if(extraContext != null){
			putQueryParameter("ExtraContext", extraContext);
		}
	}

	public String getSlbServer() {
		return this.slbServer;
	}

	public void setSlbServer(String slbServer) {
		this.slbServer = slbServer;
		if(slbServer != null){
			putQueryParameter("SlbServer", slbServer);
		}
	}

	public String getDestinationInstanceId() {
		return this.destinationInstanceId;
	}

	public void setDestinationInstanceId(String destinationInstanceId) {
		this.destinationInstanceId = destinationInstanceId;
		if(destinationInstanceId != null){
			putQueryParameter("DestinationInstanceId", destinationInstanceId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getSourceInstanceId() {
		return this.sourceInstanceId;
	}

	public void setSourceInstanceId(String sourceInstanceId) {
		this.sourceInstanceId = sourceInstanceId;
		if(sourceInstanceId != null){
			putQueryParameter("SourceInstanceId", sourceInstanceId);
		}
	}

	@Override
	public Class<CreateSubscriptionResponse> getResponseClass() {
		return CreateSubscriptionResponse.class;
	}

}
