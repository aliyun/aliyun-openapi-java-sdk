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

package com.aliyuncs.outboundbot.model.v20191226;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.outboundbot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetMaxAttemptsPerDayRequest extends RpcAcsRequest<GetMaxAttemptsPerDayResponse> {
	   

	private Integer strategyLevel;

	private String entryId;
	public GetMaxAttemptsPerDayRequest() {
		super("OutboundBot", "2019-12-26", "GetMaxAttemptsPerDay", "outboundbot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getStrategyLevel() {
		return this.strategyLevel;
	}

	public void setStrategyLevel(Integer strategyLevel) {
		this.strategyLevel = strategyLevel;
		if(strategyLevel != null){
			putQueryParameter("StrategyLevel", strategyLevel.toString());
		}
	}

	public String getEntryId() {
		return this.entryId;
	}

	public void setEntryId(String entryId) {
		this.entryId = entryId;
		if(entryId != null){
			putQueryParameter("EntryId", entryId);
		}
	}

	@Override
	public Class<GetMaxAttemptsPerDayResponse> getResponseClass() {
		return GetMaxAttemptsPerDayResponse.class;
	}

}
