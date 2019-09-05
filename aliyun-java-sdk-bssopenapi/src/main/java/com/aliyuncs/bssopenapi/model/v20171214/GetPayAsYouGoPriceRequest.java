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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetPayAsYouGoPriceRequest extends RpcAcsRequest<GetPayAsYouGoPriceResponse> {
	
	public GetPayAsYouGoPriceRequest() {
		super("BssOpenApi", "2017-12-14", "GetPayAsYouGoPrice", "bssopenapi");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String productCode;

	private String subscriptionType;

	private List<ModuleList> moduleLists;

	private Long ownerId;

	private String productType;

	private String region;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		if(subscriptionType != null){
			putQueryParameter("SubscriptionType", subscriptionType);
		}
	}

	public List<ModuleList> getModuleLists() {
		return this.moduleLists;
	}

	public void setModuleLists(List<ModuleList> moduleLists) {
		this.moduleLists = moduleLists;	
		if (moduleLists != null) {
			for (int depth1 = 0; depth1 < moduleLists.size(); depth1++) {
				putQueryParameter("ModuleList." + (depth1 + 1) + ".ModuleCode" , moduleLists.get(depth1).getModuleCode());
				putQueryParameter("ModuleList." + (depth1 + 1) + ".PriceType" , moduleLists.get(depth1).getPriceType());
				putQueryParameter("ModuleList." + (depth1 + 1) + ".Config" , moduleLists.get(depth1).getConfig());
			}
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

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public static class ModuleList {

		private String moduleCode;

		private String priceType;

		private String config;

		public String getModuleCode() {
			return this.moduleCode;
		}

		public void setModuleCode(String moduleCode) {
			this.moduleCode = moduleCode;
		}

		public String getPriceType() {
			return this.priceType;
		}

		public void setPriceType(String priceType) {
			this.priceType = priceType;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}
	}

	@Override
	public Class<GetPayAsYouGoPriceResponse> getResponseClass() {
		return GetPayAsYouGoPriceResponse.class;
	}

}
