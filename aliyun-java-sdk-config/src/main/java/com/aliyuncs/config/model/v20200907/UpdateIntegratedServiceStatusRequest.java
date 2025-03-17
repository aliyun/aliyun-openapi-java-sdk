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

package com.aliyuncs.config.model.v20200907;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.config.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateIntegratedServiceStatusRequest extends RpcAcsRequest<UpdateIntegratedServiceStatusResponse> {
	   

	private String integratedTypes;

	private String aggregatorDeliveryDataType;

	private String serviceCode;

	private Boolean status;
	public UpdateIntegratedServiceStatusRequest() {
		super("Config", "2020-09-07", "UpdateIntegratedServiceStatus", "config");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIntegratedTypes() {
		return this.integratedTypes;
	}

	public void setIntegratedTypes(String integratedTypes) {
		this.integratedTypes = integratedTypes;
		if(integratedTypes != null){
			putBodyParameter("IntegratedTypes", integratedTypes);
		}
	}

	public String getAggregatorDeliveryDataType() {
		return this.aggregatorDeliveryDataType;
	}

	public void setAggregatorDeliveryDataType(String aggregatorDeliveryDataType) {
		this.aggregatorDeliveryDataType = aggregatorDeliveryDataType;
		if(aggregatorDeliveryDataType != null){
			putBodyParameter("AggregatorDeliveryDataType", aggregatorDeliveryDataType);
		}
	}

	public String getServiceCode() {
		return this.serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putBodyParameter("ServiceCode", serviceCode);
		}
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<UpdateIntegratedServiceStatusResponse> getResponseClass() {
		return UpdateIntegratedServiceStatusResponse.class;
	}

}
