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

package com.aliyuncs.sgw.model.v20180511;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sgw.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewaysTagsRequest extends RpcAcsRequest<DescribeGatewaysTagsResponse> {
	   

	private String gatewayIds;

	private String securityToken;

	private String tagCategory;

	private String storageBundleId;
	public DescribeGatewaysTagsRequest() {
		super("sgw", "2018-05-11", "DescribeGatewaysTags", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayIds() {
		return this.gatewayIds;
	}

	public void setGatewayIds(String gatewayIds) {
		this.gatewayIds = gatewayIds;
		if(gatewayIds != null){
			putQueryParameter("GatewayIds", gatewayIds);
		}
	}

	public String getSecurityToken() {
		return this.securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getTagCategory() {
		return this.tagCategory;
	}

	public void setTagCategory(String tagCategory) {
		this.tagCategory = tagCategory;
		if(tagCategory != null){
			putQueryParameter("TagCategory", tagCategory);
		}
	}

	public String getStorageBundleId() {
		return this.storageBundleId;
	}

	public void setStorageBundleId(String storageBundleId) {
		this.storageBundleId = storageBundleId;
		if(storageBundleId != null){
			putQueryParameter("StorageBundleId", storageBundleId);
		}
	}

	@Override
	public Class<DescribeGatewaysTagsResponse> getResponseClass() {
		return DescribeGatewaysTagsResponse.class;
	}

}
