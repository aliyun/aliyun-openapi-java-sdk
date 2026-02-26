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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resellertrade.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PublicActivityRequest extends RpcAcsRequest<PublicActivityResponse> {
	   

	private String bizId;

	private List<Long> activityLists;

	private String token;

	private String snapType;
	public PublicActivityRequest() {
		super("ResellerTrade", "2019-12-27", "PublicActivity");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putBodyParameter("BizId", bizId);
		}
	}

	public List<Long> getActivityLists() {
		return this.activityLists;
	}

	public void setActivityLists(List<Long> activityLists) {
		this.activityLists = activityLists;	
		if (activityLists != null) {
			for (int i = 0; i < activityLists.size(); i++) {
				putBodyParameter("ActivityList." + (i + 1) , activityLists.get(i));
			}
		}	
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putBodyParameter("Token", token);
		}
	}

	public String getSnapType() {
		return this.snapType;
	}

	public void setSnapType(String snapType) {
		this.snapType = snapType;
		if(snapType != null){
			putBodyParameter("SnapType", snapType);
		}
	}

	@Override
	public Class<PublicActivityResponse> getResponseClass() {
		return PublicActivityResponse.class;
	}

}
