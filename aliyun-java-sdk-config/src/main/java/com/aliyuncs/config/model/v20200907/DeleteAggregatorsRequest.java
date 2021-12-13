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
public class DeleteAggregatorsRequest extends RpcAcsRequest<DeleteAggregatorsResponse> {
	   

	private String clientToken;

	private String aggregatorIds;
	public DeleteAggregatorsRequest() {
		super("Config", "2020-09-07", "DeleteAggregators");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getAggregatorIds() {
		return this.aggregatorIds;
	}

	public void setAggregatorIds(String aggregatorIds) {
		this.aggregatorIds = aggregatorIds;
		if(aggregatorIds != null){
			putBodyParameter("AggregatorIds", aggregatorIds);
		}
	}

	@Override
	public Class<DeleteAggregatorsResponse> getResponseClass() {
		return DeleteAggregatorsResponse.class;
	}

}
