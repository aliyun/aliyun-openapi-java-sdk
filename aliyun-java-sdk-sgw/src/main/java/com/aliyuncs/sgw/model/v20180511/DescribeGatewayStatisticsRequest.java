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
public class DescribeGatewayStatisticsRequest extends RpcAcsRequest<DescribeGatewayStatisticsResponse> {
	   

	private String gatewayCategory;

	private String gatewayLocation;

	private Long startTimestamp;

	private Long endTimestamp;

	private String targetAccountId;

	private String securityToken;
	public DescribeGatewayStatisticsRequest() {
		super("sgw", "2018-05-11", "DescribeGatewayStatistics", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayCategory() {
		return this.gatewayCategory;
	}

	public void setGatewayCategory(String gatewayCategory) {
		this.gatewayCategory = gatewayCategory;
		if(gatewayCategory != null){
			putQueryParameter("GatewayCategory", gatewayCategory);
		}
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

	public Long getStartTimestamp() {
		return this.startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		if(startTimestamp != null){
			putQueryParameter("StartTimestamp", startTimestamp.toString());
		}
	}

	public Long getEndTimestamp() {
		return this.endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		if(endTimestamp != null){
			putQueryParameter("EndTimestamp", endTimestamp.toString());
		}
	}

	public String getTargetAccountId() {
		return this.targetAccountId;
	}

	public void setTargetAccountId(String targetAccountId) {
		this.targetAccountId = targetAccountId;
		if(targetAccountId != null){
			putQueryParameter("TargetAccountId", targetAccountId);
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
	public Class<DescribeGatewayStatisticsResponse> getResponseClass() {
		return DescribeGatewayStatisticsResponse.class;
	}

}
