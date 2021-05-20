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

package com.aliyuncs.ivision.model.v20190308;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ivision.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAlgorithmHistogramsRequest extends RpcAcsRequest<GetAlgorithmHistogramsResponse> {
	   

	private String endDate;

	private String startDate;

	private String algorithmCode;

	private String aggregateType;
	public GetAlgorithmHistogramsRequest() {
		super("ivision", "2019-03-08", "GetAlgorithmHistograms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate);
		}
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate);
		}
	}

	public String getAlgorithmCode() {
		return this.algorithmCode;
	}

	public void setAlgorithmCode(String algorithmCode) {
		this.algorithmCode = algorithmCode;
		if(algorithmCode != null){
			putQueryParameter("AlgorithmCode", algorithmCode);
		}
	}

	public String getAggregateType() {
		return this.aggregateType;
	}

	public void setAggregateType(String aggregateType) {
		this.aggregateType = aggregateType;
		if(aggregateType != null){
			putQueryParameter("AggregateType", aggregateType);
		}
	}

	@Override
	public Class<GetAlgorithmHistogramsResponse> getResponseClass() {
		return GetAlgorithmHistogramsResponse.class;
	}

}
