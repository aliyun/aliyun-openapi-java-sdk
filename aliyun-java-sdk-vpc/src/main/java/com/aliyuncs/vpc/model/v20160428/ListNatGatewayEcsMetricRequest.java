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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListNatGatewayEcsMetricRequest extends RpcAcsRequest<ListNatGatewayEcsMetricResponse> {
	   

	private String orderKey;

	private String nextToken;

	private String natGatewayId;

	private Boolean dryRun;

	private String privateIpAddress;

	private String maxResults;

	private Long timePoint;

	private String orderType;
	public ListNatGatewayEcsMetricRequest() {
		super("Vpc", "2016-04-28", "ListNatGatewayEcsMetric", "vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOrderKey() {
		return this.orderKey;
	}

	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
		if(orderKey != null){
			putQueryParameter("OrderKey", orderKey);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getNatGatewayId() {
		return this.natGatewayId;
	}

	public void setNatGatewayId(String natGatewayId) {
		this.natGatewayId = natGatewayId;
		if(natGatewayId != null){
			putQueryParameter("NatGatewayId", natGatewayId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getPrivateIpAddress() {
		return this.privateIpAddress;
	}

	public void setPrivateIpAddress(String privateIpAddress) {
		this.privateIpAddress = privateIpAddress;
		if(privateIpAddress != null){
			putQueryParameter("PrivateIpAddress", privateIpAddress);
		}
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults);
		}
	}

	public Long getTimePoint() {
		return this.timePoint;
	}

	public void setTimePoint(Long timePoint) {
		this.timePoint = timePoint;
		if(timePoint != null){
			putQueryParameter("TimePoint", timePoint.toString());
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<ListNatGatewayEcsMetricResponse> getResponseClass() {
		return ListNatGatewayEcsMetricResponse.class;
	}

}
