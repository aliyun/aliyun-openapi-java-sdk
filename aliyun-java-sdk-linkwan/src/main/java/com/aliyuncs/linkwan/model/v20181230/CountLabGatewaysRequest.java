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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CountLabGatewaysRequest extends RpcAcsRequest<CountLabGatewaysResponse> {
	
	public CountLabGatewaysRequest() {
		super("LinkWAN", "2018-12-30", "CountLabGateways", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String fuzzyName;

	private String fuzzyGwEui;

	private Long freqBandPlanGroupId;

	private String onlineState;

	public String getFuzzyName() {
		return this.fuzzyName;
	}

	public void setFuzzyName(String fuzzyName) {
		this.fuzzyName = fuzzyName;
		if(fuzzyName != null){
			putBodyParameter("FuzzyName", fuzzyName);
		}
	}

	public String getFuzzyGwEui() {
		return this.fuzzyGwEui;
	}

	public void setFuzzyGwEui(String fuzzyGwEui) {
		this.fuzzyGwEui = fuzzyGwEui;
		if(fuzzyGwEui != null){
			putBodyParameter("FuzzyGwEui", fuzzyGwEui);
		}
	}

	public Long getFreqBandPlanGroupId() {
		return this.freqBandPlanGroupId;
	}

	public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
		this.freqBandPlanGroupId = freqBandPlanGroupId;
		if(freqBandPlanGroupId != null){
			putBodyParameter("FreqBandPlanGroupId", freqBandPlanGroupId.toString());
		}
	}

	public String getOnlineState() {
		return this.onlineState;
	}

	public void setOnlineState(String onlineState) {
		this.onlineState = onlineState;
		if(onlineState != null){
			putBodyParameter("OnlineState", onlineState);
		}
	}

	@Override
	public Class<CountLabGatewaysResponse> getResponseClass() {
		return CountLabGatewaysResponse.class;
	}

}
