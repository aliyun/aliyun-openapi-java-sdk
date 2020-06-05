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
public class DescribeGatewayCategoriesRequest extends RpcAcsRequest<DescribeGatewayCategoriesResponse> {
	   

	private String gatewayLocation;

	private String securityToken;
	public DescribeGatewayCategoriesRequest() {
		super("sgw", "2018-05-11", "DescribeGatewayCategories", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayLocation() {
		return this.gatewayLocation;
	}

	public void setGatewayLocation(String gatewayLocation) {
		this.gatewayLocation = gatewayLocation;
		if(gatewayLocation != null){
			putQueryParameter("GatewayLocation", gatewayLocation);
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

	@Override
	public Class<DescribeGatewayCategoriesResponse> getResponseClass() {
		return DescribeGatewayCategoriesResponse.class;
	}

}
