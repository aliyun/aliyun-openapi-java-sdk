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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListIspTypesRequest extends RpcAcsRequest<ListIspTypesResponse> {
	   

	private String acceleratorType;

	private String businessRegionId;
	public ListIspTypesRequest() {
		super("Ga", "2019-11-20", "ListIspTypes", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAcceleratorType() {
		return this.acceleratorType;
	}

	public void setAcceleratorType(String acceleratorType) {
		this.acceleratorType = acceleratorType;
		if(acceleratorType != null){
			putQueryParameter("AcceleratorType", acceleratorType);
		}
	}

	public String getBusinessRegionId() {
		return this.businessRegionId;
	}

	public void setBusinessRegionId(String businessRegionId) {
		this.businessRegionId = businessRegionId;
		if(businessRegionId != null){
			putQueryParameter("BusinessRegionId", businessRegionId);
		}
	}

	@Override
	public Class<ListIspTypesResponse> getResponseClass() {
		return ListIspTypesResponse.class;
	}

}
