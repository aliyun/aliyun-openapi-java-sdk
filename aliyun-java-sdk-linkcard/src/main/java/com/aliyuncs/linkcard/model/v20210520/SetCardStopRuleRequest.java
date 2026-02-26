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

package com.aliyuncs.linkcard.model.v20210520;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkcard.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetCardStopRuleRequest extends RpcAcsRequest<SetCardStopRuleResponse> {
	   

	private Long flowLimit;

	private String iccid;

	private Boolean autoRestore;
	public SetCardStopRuleRequest() {
		super("Linkcard", "2021-05-20", "SetCardStopRule");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getFlowLimit() {
		return this.flowLimit;
	}

	public void setFlowLimit(Long flowLimit) {
		this.flowLimit = flowLimit;
		if(flowLimit != null){
			putQueryParameter("FlowLimit", flowLimit.toString());
		}
	}

	public String getIccid() {
		return this.iccid;
	}

	public void setIccid(String iccid) {
		this.iccid = iccid;
		if(iccid != null){
			putQueryParameter("Iccid", iccid);
		}
	}

	public Boolean getAutoRestore() {
		return this.autoRestore;
	}

	public void setAutoRestore(Boolean autoRestore) {
		this.autoRestore = autoRestore;
		if(autoRestore != null){
			putQueryParameter("AutoRestore", autoRestore.toString());
		}
	}

	@Override
	public Class<SetCardStopRuleResponse> getResponseClass() {
		return SetCardStopRuleResponse.class;
	}

}
