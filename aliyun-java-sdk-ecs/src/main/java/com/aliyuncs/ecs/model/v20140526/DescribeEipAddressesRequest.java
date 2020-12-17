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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeEipAddressesRequest extends RpcAcsRequest<DescribeEipAddressesResponse> {
	   

	private Long resourceOwnerId;

	private String filter2Value;

	private String iSP;

	private String allocationId;

	private String eipAddress;

	private Integer pageNumber;

	private String lockReason;

	private String filter1Key;

	private String associatedInstanceType;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String filter1Value;

	private String filter2Key;

	private Long ownerId;

	private String chargeType;

	private String associatedInstanceId;

	private String status;
	public DescribeEipAddressesRequest() {
		super("Ecs", "2014-05-26", "DescribeEipAddresses", "ecs");
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

	public String getFilter2Value() {
		return this.filter2Value;
	}

	public void setFilter2Value(String filter2Value) {
		this.filter2Value = filter2Value;
		if(filter2Value != null){
			putQueryParameter("Filter.2.Value", filter2Value);
		}
	}

	public String getISP() {
		return this.iSP;
	}

	public void setISP(String iSP) {
		this.iSP = iSP;
		if(iSP != null){
			putQueryParameter("ISP", iSP);
		}
	}

	public String getAllocationId() {
		return this.allocationId;
	}

	public void setAllocationId(String allocationId) {
		this.allocationId = allocationId;
		if(allocationId != null){
			putQueryParameter("AllocationId", allocationId);
		}
	}

	public String getEipAddress() {
		return this.eipAddress;
	}

	public void setEipAddress(String eipAddress) {
		this.eipAddress = eipAddress;
		if(eipAddress != null){
			putQueryParameter("EipAddress", eipAddress);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getLockReason() {
		return this.lockReason;
	}

	public void setLockReason(String lockReason) {
		this.lockReason = lockReason;
		if(lockReason != null){
			putQueryParameter("LockReason", lockReason);
		}
	}

	public String getFilter1Key() {
		return this.filter1Key;
	}

	public void setFilter1Key(String filter1Key) {
		this.filter1Key = filter1Key;
		if(filter1Key != null){
			putQueryParameter("Filter.1.Key", filter1Key);
		}
	}

	public String getAssociatedInstanceType() {
		return this.associatedInstanceType;
	}

	public void setAssociatedInstanceType(String associatedInstanceType) {
		this.associatedInstanceType = associatedInstanceType;
		if(associatedInstanceType != null){
			putQueryParameter("AssociatedInstanceType", associatedInstanceType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getFilter1Value() {
		return this.filter1Value;
	}

	public void setFilter1Value(String filter1Value) {
		this.filter1Value = filter1Value;
		if(filter1Value != null){
			putQueryParameter("Filter.1.Value", filter1Value);
		}
	}

	public String getFilter2Key() {
		return this.filter2Key;
	}

	public void setFilter2Key(String filter2Key) {
		this.filter2Key = filter2Key;
		if(filter2Key != null){
			putQueryParameter("Filter.2.Key", filter2Key);
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

	public String getChargeType() {
		return this.chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
		if(chargeType != null){
			putQueryParameter("ChargeType", chargeType);
		}
	}

	public String getAssociatedInstanceId() {
		return this.associatedInstanceId;
	}

	public void setAssociatedInstanceId(String associatedInstanceId) {
		this.associatedInstanceId = associatedInstanceId;
		if(associatedInstanceId != null){
			putQueryParameter("AssociatedInstanceId", associatedInstanceId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeEipAddressesResponse> getResponseClass() {
		return DescribeEipAddressesResponse.class;
	}

}
