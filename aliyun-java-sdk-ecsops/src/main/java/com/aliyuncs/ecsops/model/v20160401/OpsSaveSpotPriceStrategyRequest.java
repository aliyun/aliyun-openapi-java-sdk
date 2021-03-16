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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsSaveSpotPriceStrategyRequest extends RpcAcsRequest<OpsSaveSpotPriceStrategyResponse> {
	   

	private String izNo;

	private String regionNo;

	private String flavor;

	private String discountConfig;

	private String createdBy;

	private Integer strategyType;

	private String auditParamStr;
	public OpsSaveSpotPriceStrategyRequest() {
		super("Ecsops", "2016-04-01", "OpsSaveSpotPriceStrategy", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("IzNo", izNo);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public String getFlavor() {
		return this.flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
		if(flavor != null){
			putQueryParameter("Flavor", flavor);
		}
	}

	public String getDiscountConfig() {
		return this.discountConfig;
	}

	public void setDiscountConfig(String discountConfig) {
		this.discountConfig = discountConfig;
		if(discountConfig != null){
			putQueryParameter("DiscountConfig", discountConfig);
		}
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
		if(createdBy != null){
			putQueryParameter("CreatedBy", createdBy);
		}
	}

	public Integer getStrategyType() {
		return this.strategyType;
	}

	public void setStrategyType(Integer strategyType) {
		this.strategyType = strategyType;
		if(strategyType != null){
			putQueryParameter("StrategyType", strategyType.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsSaveSpotPriceStrategyResponse> getResponseClass() {
		return OpsSaveSpotPriceStrategyResponse.class;
	}

}
