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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvmsapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryVirtualNumberRelationRequest extends RpcAcsRequest<QueryVirtualNumberRelationResponse> {
	   

	private Long specId;

	private Long resourceOwnerId;

	private Integer routeType;

	private Integer pageSize;

	private String relatedNum;

	private String regionNameCity;

	private Long qualificationId;

	private String resourceOwnerAccount;

	private String prodCode;

	private String phoneNum;

	private Long ownerId;

	private Integer pageNo;
	public QueryVirtualNumberRelationRequest() {
		super("Dyvmsapi", "2017-05-25", "QueryVirtualNumberRelation", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSpecId() {
		return this.specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
		if(specId != null){
			putQueryParameter("SpecId", specId.toString());
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

	public Integer getRouteType() {
		return this.routeType;
	}

	public void setRouteType(Integer routeType) {
		this.routeType = routeType;
		if(routeType != null){
			putQueryParameter("RouteType", routeType.toString());
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

	public String getRelatedNum() {
		return this.relatedNum;
	}

	public void setRelatedNum(String relatedNum) {
		this.relatedNum = relatedNum;
		if(relatedNum != null){
			putQueryParameter("RelatedNum", relatedNum);
		}
	}

	public String getRegionNameCity() {
		return this.regionNameCity;
	}

	public void setRegionNameCity(String regionNameCity) {
		this.regionNameCity = regionNameCity;
		if(regionNameCity != null){
			putQueryParameter("RegionNameCity", regionNameCity);
		}
	}

	public Long getQualificationId() {
		return this.qualificationId;
	}

	public void setQualificationId(Long qualificationId) {
		this.qualificationId = qualificationId;
		if(qualificationId != null){
			putQueryParameter("QualificationId", qualificationId.toString());
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

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
		}
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
		if(phoneNum != null){
			putQueryParameter("PhoneNum", phoneNum);
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

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	@Override
	public Class<QueryVirtualNumberRelationResponse> getResponseClass() {
		return QueryVirtualNumberRelationResponse.class;
	}

}
