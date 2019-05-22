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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeFleetsRequest extends RpcAcsRequest<DescribeFleetsResponse> {
	
	public DescribeFleetsRequest() {
		super("Ecs", "2014-05-26", "DescribeFleets", "ecs");
	}

	private Long resourceOwnerId;

	private Integer pageNumber;

	private String fleetName;

	private List<String> fleetStatuss;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> fleetIds;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
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

	public String getFleetName() {
		return this.fleetName;
	}

	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
		if(fleetName != null){
			putQueryParameter("FleetName", fleetName);
		}
	}

	public List<String> getFleetStatuss() {
		return this.fleetStatuss;
	}

	public void setFleetStatuss(List<String> fleetStatuss) {
		this.fleetStatuss = fleetStatuss;	
		if (fleetStatuss != null) {
			for (int i = 0; i < fleetStatuss.size(); i++) {
				putQueryParameter("FleetStatus." + (i + 1) , fleetStatuss.get(i));
			}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<String> getFleetIds() {
		return this.fleetIds;
	}

	public void setFleetIds(List<String> fleetIds) {
		this.fleetIds = fleetIds;	
		if (fleetIds != null) {
			for (int i = 0; i < fleetIds.size(); i++) {
				putQueryParameter("FleetId." + (i + 1) , fleetIds.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeFleetsResponse> getResponseClass() {
		return DescribeFleetsResponse.class;
	}

}
