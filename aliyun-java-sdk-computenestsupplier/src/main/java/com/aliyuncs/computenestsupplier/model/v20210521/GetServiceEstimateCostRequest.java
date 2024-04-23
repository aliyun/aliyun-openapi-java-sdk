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

package com.aliyuncs.computenestsupplier.model.v20210521;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.computenestsupplier.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetServiceEstimateCostRequest extends RpcAcsRequest<GetServiceEstimateCostResponse> {
	   

	@SerializedName("commodity")
	private Commodity commodity;

	private String clientToken;

	private String templateName;

	private String serviceInstanceId;

	private String specificationName;

	private String serviceVersion;

	private String serviceId;

	private String parameters;
	public GetServiceEstimateCostRequest() {
		super("ComputeNestSupplier", "2021-05-21", "GetServiceEstimateCost");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Commodity getCommodity() {
		return this.commodity;
	}

	public void setCommodity(Commodity commodity) {
		this.commodity = commodity;	
		if (commodity != null) {
			putQueryParameter("Commodity" , new Gson().toJson(commodity));
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

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public String getServiceInstanceId() {
		return this.serviceInstanceId;
	}

	public void setServiceInstanceId(String serviceInstanceId) {
		this.serviceInstanceId = serviceInstanceId;
		if(serviceInstanceId != null){
			putQueryParameter("ServiceInstanceId", serviceInstanceId);
		}
	}

	public String getSpecificationName() {
		return this.specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
		if(specificationName != null){
			putQueryParameter("SpecificationName", specificationName);
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	public static class Commodity {

		@SerializedName("PayPeriod")
		private Integer payPeriod;

		@SerializedName("PayPeriodUnit")
		private String payPeriodUnit;

		public Integer getPayPeriod() {
			return this.payPeriod;
		}

		public void setPayPeriod(Integer payPeriod) {
			this.payPeriod = payPeriod;
		}

		public String getPayPeriodUnit() {
			return this.payPeriodUnit;
		}

		public void setPayPeriodUnit(String payPeriodUnit) {
			this.payPeriodUnit = payPeriodUnit;
		}
	}

	@Override
	public Class<GetServiceEstimateCostResponse> getResponseClass() {
		return GetServiceEstimateCostResponse.class;
	}

}
