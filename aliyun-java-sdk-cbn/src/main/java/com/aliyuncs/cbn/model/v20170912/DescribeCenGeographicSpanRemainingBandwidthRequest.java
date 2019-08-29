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
import com.aliyuncs.cbn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCenGeographicSpanRemainingBandwidthRequest extends RpcAcsRequest<DescribeCenGeographicSpanRemainingBandwidthResponse> {
	
	public DescribeCenGeographicSpanRemainingBandwidthRequest() {
		super("Cbn", "2017-09-12", "DescribeCenGeographicSpanRemainingBandwidth", "cbn");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String geographicRegionBId;

	private Long resourceOwnerId;

	private String geographicRegionAId;

	private String resourceOwnerAccount;

	private String cenId;

	private String ownerAccount;

	private Integer pageSize;

	private Long ownerId;

	private Integer pageNumber;

	public String getGeographicRegionBId() {
		return this.geographicRegionBId;
	}

	public void setGeographicRegionBId(String geographicRegionBId) {
		this.geographicRegionBId = geographicRegionBId;
		if(geographicRegionBId != null){
			putQueryParameter("GeographicRegionBId", geographicRegionBId);
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

	public String getGeographicRegionAId() {
		return this.geographicRegionAId;
	}

	public void setGeographicRegionAId(String geographicRegionAId) {
		this.geographicRegionAId = geographicRegionAId;
		if(geographicRegionAId != null){
			putQueryParameter("GeographicRegionAId", geographicRegionAId);
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

	public String getCenId() {
		return this.cenId;
	}

	public void setCenId(String cenId) {
		this.cenId = cenId;
		if(cenId != null){
			putQueryParameter("CenId", cenId);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<DescribeCenGeographicSpanRemainingBandwidthResponse> getResponseClass() {
		return DescribeCenGeographicSpanRemainingBandwidthResponse.class;
	}

}
