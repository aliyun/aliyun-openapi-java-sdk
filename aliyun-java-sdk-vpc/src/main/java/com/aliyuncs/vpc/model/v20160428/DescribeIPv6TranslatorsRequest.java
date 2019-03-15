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

/**
 * @author auto create
 * @version 
 */
public class DescribeIPv6TranslatorsRequest extends RpcAcsRequest<DescribeIPv6TranslatorsResponse> {
	
	public DescribeIPv6TranslatorsRequest() {
		super("Vpc", "2016-04-28", "DescribeIPv6Translators", "vpc");
	}

	private String businessStatus;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String allocateIpv6Addr;

	private String ownerAccount;

	private String allocateIpv4Addr;

	private Long ownerId;

	private String spec;

	private Integer pageNumber;

	private String name;

	private Integer pageSize;

	private String ipv6TranslatorId;

	private String payType;

	private String status;

	public String getBusinessStatus() {
		return this.businessStatus;
	}

	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
		if(businessStatus != null){
			putQueryParameter("BusinessStatus", businessStatus);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getAllocateIpv6Addr() {
		return this.allocateIpv6Addr;
	}

	public void setAllocateIpv6Addr(String allocateIpv6Addr) {
		this.allocateIpv6Addr = allocateIpv6Addr;
		if(allocateIpv6Addr != null){
			putQueryParameter("AllocateIpv6Addr", allocateIpv6Addr);
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

	public String getAllocateIpv4Addr() {
		return this.allocateIpv4Addr;
	}

	public void setAllocateIpv4Addr(String allocateIpv4Addr) {
		this.allocateIpv4Addr = allocateIpv4Addr;
		if(allocateIpv4Addr != null){
			putQueryParameter("AllocateIpv4Addr", allocateIpv4Addr);
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

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	public String getIpv6TranslatorId() {
		return this.ipv6TranslatorId;
	}

	public void setIpv6TranslatorId(String ipv6TranslatorId) {
		this.ipv6TranslatorId = ipv6TranslatorId;
		if(ipv6TranslatorId != null){
			putQueryParameter("Ipv6TranslatorId", ipv6TranslatorId);
		}
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType);
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
	public Class<DescribeIPv6TranslatorsResponse> getResponseClass() {
		return DescribeIPv6TranslatorsResponse.class;
	}

}
