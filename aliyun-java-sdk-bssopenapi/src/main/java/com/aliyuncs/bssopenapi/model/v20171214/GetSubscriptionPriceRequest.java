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
public class GetSubscriptionPriceRequest extends RpcAcsRequest<GetSubscriptionPriceResponse> {
	   

	private String productCode;

	private Integer quantity;

	private String subscriptionType;

	private List<ModuleList> moduleLists;

	private Long ownerId;

	private String productType;

	private Integer servicePeriodQuantity;

	private String instanceId;

	private String servicePeriodUnit;

	private String region;

	private String orderType;
	public GetSubscriptionPriceRequest() {
		super("BssOpenApi", "2017-12-14", "GetSubscriptionPrice", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
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
	}	public List<ModuleList> getModuleLists() {
		return this.moduleLists;
	}

	public void setModuleLists(List<ModuleList> moduleLists) {
		this.moduleLists = moduleLists;	
		if (moduleLists != null) {
			for (int depth1 = 0; depth1 < moduleLists.size(); depth1++) {
				putQueryParameter("ModuleList." + (depth1 + 1) + ".ModuleCode" , moduleLists.get(depth1).getModuleCode());
				putQueryParameter("ModuleList." + (depth1 + 1) + ".ModuleStatus" , moduleLists.get(depth1).getModuleStatus());
				putQueryParameter("ModuleList." + (depth1 + 1) + ".Tag" , moduleLists.get(depth1).getTag());
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

	public Integer getServicePeriodQuantity() {
		return this.servicePeriodQuantity;
	}

	public void setServicePeriodQuantity(Integer servicePeriodQuantity) {
		this.servicePeriodQuantity = servicePeriodQuantity;
		if(servicePeriodQuantity != null){
			putQueryParameter("ServicePeriodQuantity", servicePeriodQuantity.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getServicePeriodUnit() {
		return this.servicePeriodUnit;
	}

	public void setServicePeriodUnit(String servicePeriodUnit) {
		this.servicePeriodUnit = servicePeriodUnit;
		if(servicePeriodUnit != null){
			putQueryParameter("ServicePeriodUnit", servicePeriodUnit);
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

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	public static class ModuleList {

		private String moduleCode;

		private Integer moduleStatus;

		private String tag;

		private String config;

		public String getModuleCode() {
			return this.moduleCode;
		}

		public void setModuleCode(String moduleCode) {
			this.moduleCode = moduleCode;
		}

		public Integer getModuleStatus() {
			return this.moduleStatus;
		}

		public void setModuleStatus(Integer moduleStatus) {
			this.moduleStatus = moduleStatus;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}
	}

	@Override
	public Class<GetSubscriptionPriceResponse> getResponseClass() {
		return GetSubscriptionPriceResponse.class;
	}

}
