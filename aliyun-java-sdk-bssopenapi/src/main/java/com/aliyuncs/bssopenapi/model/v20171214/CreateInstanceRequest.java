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
public class CreateInstanceRequest extends RpcAcsRequest<CreateInstanceResponse> {
	   

	private String productCode;

	private Integer period;

	private String clientToken;

	private String subscriptionType;

	private Long ownerId;

	private String productType;

	private Integer renewPeriod;

	private List<Parameter> parameters;

	private String renewalStatus;
	public CreateInstanceRequest() {
		super("BssOpenApi", "2017-12-14", "CreateInstance");
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

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public Integer getRenewPeriod() {
		return this.renewPeriod;
	}

	public void setRenewPeriod(Integer renewPeriod) {
		this.renewPeriod = renewPeriod;
		if(renewPeriod != null){
			putQueryParameter("RenewPeriod", renewPeriod.toString());
		}
	}

	public List<Parameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			for (int depth1 = 0; depth1 < parameters.size(); depth1++) {
				putQueryParameter("Parameter." + (depth1 + 1) + ".Code" , parameters.get(depth1).getCode());
				putQueryParameter("Parameter." + (depth1 + 1) + ".Value" , parameters.get(depth1).getValue());
			}
		}	
	}

	public String getRenewalStatus() {
		return this.renewalStatus;
	}

	public void setRenewalStatus(String renewalStatus) {
		this.renewalStatus = renewalStatus;
		if(renewalStatus != null){
			putQueryParameter("RenewalStatus", renewalStatus);
		}
	}

	public static class Parameter {

		private String code;

		private String value;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateInstanceResponse> getResponseClass() {
		return CreateInstanceResponse.class;
	}

}
