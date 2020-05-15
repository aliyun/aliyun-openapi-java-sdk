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
public class DescribeForwardTableEntriesRequest extends RpcAcsRequest<DescribeForwardTableEntriesResponse> {
	   

	private Long resourceOwnerId;

	private String forwardTableId;

	private String internalIp;

	private Integer pageNumber;

	private String forwardEntryId;

	private Integer pageSize;

	private String externalIp;

	private String resourceOwnerAccount;

	private String ipProtocol;

	private String forwardEntryName;

	private String ownerAccount;

	private Long ownerId;

	private String internalPort;

	private String externalPort;
	public DescribeForwardTableEntriesRequest() {
		super("Vpc", "2016-04-28", "DescribeForwardTableEntries", "vpc");
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

	public String getForwardTableId() {
		return this.forwardTableId;
	}

	public void setForwardTableId(String forwardTableId) {
		this.forwardTableId = forwardTableId;
		if(forwardTableId != null){
			putQueryParameter("ForwardTableId", forwardTableId);
		}
	}

	public String getInternalIp() {
		return this.internalIp;
	}

	public void setInternalIp(String internalIp) {
		this.internalIp = internalIp;
		if(internalIp != null){
			putQueryParameter("InternalIp", internalIp);
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

	public String getForwardEntryId() {
		return this.forwardEntryId;
	}

	public void setForwardEntryId(String forwardEntryId) {
		this.forwardEntryId = forwardEntryId;
		if(forwardEntryId != null){
			putQueryParameter("ForwardEntryId", forwardEntryId);
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

	public String getExternalIp() {
		return this.externalIp;
	}

	public void setExternalIp(String externalIp) {
		this.externalIp = externalIp;
		if(externalIp != null){
			putQueryParameter("ExternalIp", externalIp);
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

	public String getIpProtocol() {
		return this.ipProtocol;
	}

	public void setIpProtocol(String ipProtocol) {
		this.ipProtocol = ipProtocol;
		if(ipProtocol != null){
			putQueryParameter("IpProtocol", ipProtocol);
		}
	}

	public String getForwardEntryName() {
		return this.forwardEntryName;
	}

	public void setForwardEntryName(String forwardEntryName) {
		this.forwardEntryName = forwardEntryName;
		if(forwardEntryName != null){
			putQueryParameter("ForwardEntryName", forwardEntryName);
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

	public String getInternalPort() {
		return this.internalPort;
	}

	public void setInternalPort(String internalPort) {
		this.internalPort = internalPort;
		if(internalPort != null){
			putQueryParameter("InternalPort", internalPort);
		}
	}

	public String getExternalPort() {
		return this.externalPort;
	}

	public void setExternalPort(String externalPort) {
		this.externalPort = externalPort;
		if(externalPort != null){
			putQueryParameter("ExternalPort", externalPort);
		}
	}

	@Override
	public Class<DescribeForwardTableEntriesResponse> getResponseClass() {
		return DescribeForwardTableEntriesResponse.class;
	}

}
