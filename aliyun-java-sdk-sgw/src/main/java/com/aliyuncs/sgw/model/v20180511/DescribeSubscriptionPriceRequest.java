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
public class DescribeSubscriptionPriceRequest extends RpcAcsRequest<DescribeSubscriptionPriceResponse> {
	   

	private String gatewayClass;

	private Long cacheSSDSize;

	private String periodUnit;

	private Integer periodQuantity;

	private String securityToken;

	private Long cacheCloudEfficiencySize;
	public DescribeSubscriptionPriceRequest() {
		super("sgw", "2018-05-11", "DescribeSubscriptionPrice", "hcs_sgw");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGatewayClass() {
		return this.gatewayClass;
	}

	public void setGatewayClass(String gatewayClass) {
		this.gatewayClass = gatewayClass;
		if(gatewayClass != null){
			putQueryParameter("GatewayClass", gatewayClass);
		}
	}

	public Long getCacheSSDSize() {
		return this.cacheSSDSize;
	}

	public void setCacheSSDSize(Long cacheSSDSize) {
		this.cacheSSDSize = cacheSSDSize;
		if(cacheSSDSize != null){
			putQueryParameter("CacheSSDSize", cacheSSDSize.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Integer getPeriodQuantity() {
		return this.periodQuantity;
	}

	public void setPeriodQuantity(Integer periodQuantity) {
		this.periodQuantity = periodQuantity;
		if(periodQuantity != null){
			putQueryParameter("PeriodQuantity", periodQuantity.toString());
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

	public Long getCacheCloudEfficiencySize() {
		return this.cacheCloudEfficiencySize;
	}

	public void setCacheCloudEfficiencySize(Long cacheCloudEfficiencySize) {
		this.cacheCloudEfficiencySize = cacheCloudEfficiencySize;
		if(cacheCloudEfficiencySize != null){
			putQueryParameter("CacheCloudEfficiencySize", cacheCloudEfficiencySize.toString());
		}
	}

	@Override
	public Class<DescribeSubscriptionPriceResponse> getResponseClass() {
		return DescribeSubscriptionPriceResponse.class;
	}

}
