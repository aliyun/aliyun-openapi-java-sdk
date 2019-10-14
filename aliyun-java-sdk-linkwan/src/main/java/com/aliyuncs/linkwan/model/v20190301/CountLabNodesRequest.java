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

package com.aliyuncs.linkwan.model.v20190301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkwan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CountLabNodesRequest extends RpcAcsRequest<CountLabNodesResponse> {
	   

	private String fuzzyName;

	private String activationState;

	private Long freqBandPlanGroupId;

	private String fuzzyDevEui;
	public CountLabNodesRequest() {
		super("LinkWAN", "2019-03-01", "CountLabNodes", "linkwan");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFuzzyName() {
		return this.fuzzyName;
	}

	public void setFuzzyName(String fuzzyName) {
		this.fuzzyName = fuzzyName;
		if(fuzzyName != null){
			putQueryParameter("FuzzyName", fuzzyName);
		}
	}

	public String getActivationState() {
		return this.activationState;
	}

	public void setActivationState(String activationState) {
		this.activationState = activationState;
		if(activationState != null){
			putQueryParameter("ActivationState", activationState);
		}
	}

	public Long getFreqBandPlanGroupId() {
		return this.freqBandPlanGroupId;
	}

	public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
		this.freqBandPlanGroupId = freqBandPlanGroupId;
		if(freqBandPlanGroupId != null){
			putQueryParameter("FreqBandPlanGroupId", freqBandPlanGroupId.toString());
		}
	}

	public String getFuzzyDevEui() {
		return this.fuzzyDevEui;
	}

	public void setFuzzyDevEui(String fuzzyDevEui) {
		this.fuzzyDevEui = fuzzyDevEui;
		if(fuzzyDevEui != null){
			putQueryParameter("FuzzyDevEui", fuzzyDevEui);
		}
	}

	@Override
	public Class<CountLabNodesResponse> getResponseClass() {
		return CountLabNodesResponse.class;
	}

}
