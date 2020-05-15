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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PublishRouteEntriesRequest extends RpcAcsRequest<PublishRouteEntriesResponse> {
	   

	private Long resourceOwnerId;

	private String cenId;

	private String childInstanceRegionId;

	private String resourceOwnerAccount;

	private String destinationCidrBlock;

	private String childInstanceType;

	private String childInstanceId;

	private String childInstanceRouteTableId;
	public PublishRouteEntriesRequest() {
		super("Cbn", "2017-09-12", "PublishRouteEntries", "Cbn");
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

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
		}
	}

	public String getChildInstanceRegionId() {
		return this.childInstanceRegionId;
	}

	public void setChildInstanceRegionId(String childInstanceRegionId) {
		this.childInstanceRegionId = childInstanceRegionId;
		if(childInstanceRegionId != null){
			putQueryParameter("ChildInstanceRegionId", childInstanceRegionId);
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

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		if(destinationCidrBlock != null){
			putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
		}
	}

	public String getChildInstanceType() {
		return this.childInstanceType;
	}

	public void setChildInstanceType(String childInstanceType) {
		this.childInstanceType = childInstanceType;
		if(childInstanceType != null){
			putQueryParameter("ChildInstanceType", childInstanceType);
		}
	}

	public String getChildInstanceId() {
		return this.childInstanceId;
	}

	public void setChildInstanceId(String childInstanceId) {
		this.childInstanceId = childInstanceId;
		if(childInstanceId != null){
			putQueryParameter("ChildInstanceId", childInstanceId);
		}
	}

	public String getChildInstanceRouteTableId() {
		return this.childInstanceRouteTableId;
	}

	public void setChildInstanceRouteTableId(String childInstanceRouteTableId) {
		this.childInstanceRouteTableId = childInstanceRouteTableId;
		if(childInstanceRouteTableId != null){
			putQueryParameter("ChildInstanceRouteTableId", childInstanceRouteTableId);
		}
	}

	@Override
	public Class<PublishRouteEntriesResponse> getResponseClass() {
		return PublishRouteEntriesResponse.class;
	}

}
