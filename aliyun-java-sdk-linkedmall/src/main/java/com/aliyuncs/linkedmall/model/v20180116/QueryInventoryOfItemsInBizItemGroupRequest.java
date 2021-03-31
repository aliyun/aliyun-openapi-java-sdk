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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryInventoryOfItemsInBizItemGroupRequest extends RpcAcsRequest<QueryInventoryOfItemsInBizItemGroupResponse> {
	   

	private String divisionCode;

	private String lmItemIds;

	private String itemIds;

	private String bizId;

	private String subBizId;
	public QueryInventoryOfItemsInBizItemGroupRequest() {
		super("linkedmall", "2018-01-16", "QueryInventoryOfItemsInBizItemGroup", "linkedmall");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDivisionCode() {
		return this.divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
		if(divisionCode != null){
			putQueryParameter("DivisionCode", divisionCode);
		}
	}

	public String getLmItemIds() {
		return this.lmItemIds;
	}

	public void setLmItemIds(String lmItemIds) {
		this.lmItemIds = lmItemIds;
		if(lmItemIds != null){
			putQueryParameter("LmItemIds", lmItemIds);
		}
	}

	public String getItemIds() {
		return this.itemIds;
	}

	public void setItemIds(String itemIds) {
		this.itemIds = itemIds;
		if(itemIds != null){
			putQueryParameter("ItemIds", itemIds);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getSubBizId() {
		return this.subBizId;
	}

	public void setSubBizId(String subBizId) {
		this.subBizId = subBizId;
		if(subBizId != null){
			putQueryParameter("SubBizId", subBizId);
		}
	}

	@Override
	public Class<QueryInventoryOfItemsInBizItemGroupResponse> getResponseClass() {
		return QueryInventoryOfItemsInBizItemGroupResponse.class;
	}

}
