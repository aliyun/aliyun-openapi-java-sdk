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
public class DescribeGlobalAccelerationInstancesRequest extends RpcAcsRequest<DescribeGlobalAccelerationInstancesResponse> {
	
	public DescribeGlobalAccelerationInstancesRequest() {
		super("Vpc", "2016-04-28", "DescribeGlobalAccelerationInstances", "vpc");
	}

	private String ipAddress;

	private Long resourceOwnerId;

	private String bandwidthType;

	private String resourceOwnerAccount;

	private String serviceLocation;

	private String ownerAccount;

	private Long ownerId;

	private Boolean includeReservationData;

	private String globalAccelerationInstanceId;

	private String serverId;

	private Integer pageNumber;

	private String name;

	private Integer pageSize;

	private String status;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		if(ipAddress != null){
			putQueryParameter("IpAddress", ipAddress);
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

	public String getBandwidthType() {
		return this.bandwidthType;
	}

	public void setBandwidthType(String bandwidthType) {
		this.bandwidthType = bandwidthType;
		if(bandwidthType != null){
			putQueryParameter("BandwidthType", bandwidthType);
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

	public String getServiceLocation() {
		return this.serviceLocation;
	}

	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
		if(serviceLocation != null){
			putQueryParameter("ServiceLocation", serviceLocation);
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

	public Boolean getIncludeReservationData() {
		return this.includeReservationData;
	}

	public void setIncludeReservationData(Boolean includeReservationData) {
		this.includeReservationData = includeReservationData;
		if(includeReservationData != null){
			putQueryParameter("IncludeReservationData", includeReservationData.toString());
		}
	}

	public String getGlobalAccelerationInstanceId() {
		return this.globalAccelerationInstanceId;
	}

	public void setGlobalAccelerationInstanceId(String globalAccelerationInstanceId) {
		this.globalAccelerationInstanceId = globalAccelerationInstanceId;
		if(globalAccelerationInstanceId != null){
			putQueryParameter("GlobalAccelerationInstanceId", globalAccelerationInstanceId);
		}
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
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
	public Class<DescribeGlobalAccelerationInstancesResponse> getResponseClass() {
		return DescribeGlobalAccelerationInstancesResponse.class;
	}

}
