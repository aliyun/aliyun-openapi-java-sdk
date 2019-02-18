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

package com.aliyuncs.industry_brain.model.v20180712;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetServiceInputMappingRequest extends RpcAcsRequest<GetServiceInputMappingResponse> {
	
	public GetServiceInputMappingRequest() {
		super("industry-brain", "2018-07-12", "GetServiceInputMapping");
	}

	private Boolean showLatestData;

	private Integer limit;

	private String serviceId;

	private String algorithmId;

	public Boolean getShowLatestData() {
		return this.showLatestData;
	}

	public void setShowLatestData(Boolean showLatestData) {
		this.showLatestData = showLatestData;
		if(showLatestData != null){
			putQueryParameter("ShowLatestData", showLatestData.toString());
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
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

	public String getAlgorithmId() {
		return this.algorithmId;
	}

	public void setAlgorithmId(String algorithmId) {
		this.algorithmId = algorithmId;
		if(algorithmId != null){
			putQueryParameter("AlgorithmId", algorithmId);
		}
	}

	@Override
	public Class<GetServiceInputMappingResponse> getResponseClass() {
		return GetServiceInputMappingResponse.class;
	}

}
