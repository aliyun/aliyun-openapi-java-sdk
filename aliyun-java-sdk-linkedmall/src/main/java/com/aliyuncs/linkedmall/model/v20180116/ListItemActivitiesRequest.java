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
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListItemActivitiesRequest extends RpcAcsRequest<ListItemActivitiesResponse> {
	   

	private List<Object> lmItemIds;

	private List<Object> itemIds;

	private String bizId;
	public ListItemActivitiesRequest() {
		super("linkedmall", "2018-01-16", "ListItemActivities", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Object> getLmItemIds() {
		return this.lmItemIds;
	}

	public void setLmItemIds(List<Object> lmItemIds) {
		this.lmItemIds = lmItemIds;
		if(lmItemIds != null){
			putQueryParameter("LmItemIds", new Gson().toJson(lmItemIds));
		}
	}

	public List<Object> getItemIds() {
		return this.itemIds;
	}

	public void setItemIds(List<Object> itemIds) {
		this.itemIds = itemIds;
		if(itemIds != null){
			putQueryParameter("ItemIds", new Gson().toJson(itemIds));
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

	@Override
	public Class<ListItemActivitiesResponse> getResponseClass() {
		return ListItemActivitiesResponse.class;
	}

}
