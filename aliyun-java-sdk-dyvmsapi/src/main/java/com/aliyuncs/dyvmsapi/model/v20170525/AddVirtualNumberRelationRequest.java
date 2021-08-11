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
public class AddVirtualNumberRelationRequest extends RpcAcsRequest<AddVirtualNumberRelationResponse> {
	   

	private Long resourceOwnerId;

	private String numberList;

	private Integer routeType;

	private String corpNameList;

	private String resourceOwnerAccount;

	private String prodCode;

	private String phoneNum;

	private Long ownerId;
	public AddVirtualNumberRelationRequest() {
		super("Dyvmsapi", "2017-05-25", "AddVirtualNumberRelation", "dyvms");
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

	public String getNumberList() {
		return this.numberList;
	}

	public void setNumberList(String numberList) {
		this.numberList = numberList;
		if(numberList != null){
			putQueryParameter("NumberList", numberList);
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

	public String getCorpNameList() {
		return this.corpNameList;
	}

	public void setCorpNameList(String corpNameList) {
		this.corpNameList = corpNameList;
		if(corpNameList != null){
			putQueryParameter("CorpNameList", corpNameList);
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

	@Override
	public Class<AddVirtualNumberRelationResponse> getResponseClass() {
		return AddVirtualNumberRelationResponse.class;
	}

}
