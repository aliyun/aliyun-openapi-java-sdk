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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class TwoPartiesCallRequest extends RpcAcsRequest<TwoPartiesCallResponse> {
	
	public TwoPartiesCallRequest() {
		super("CCC", "2017-07-05", "TwoPartiesCall");
	}

	private String caller;

	private String instanceId;

	private String calleeCustomer;

	private String calleeAgent;

	public String getCaller() {
		return this.caller;
	}

	public void setCaller(String caller) {
		this.caller = caller;
		if(caller != null){
			putQueryParameter("Caller", caller);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getCalleeCustomer() {
		return this.calleeCustomer;
	}

	public void setCalleeCustomer(String calleeCustomer) {
		this.calleeCustomer = calleeCustomer;
		if(calleeCustomer != null){
			putQueryParameter("CalleeCustomer", calleeCustomer);
		}
	}

	public String getCalleeAgent() {
		return this.calleeAgent;
	}

	public void setCalleeAgent(String calleeAgent) {
		this.calleeAgent = calleeAgent;
		if(calleeAgent != null){
			putQueryParameter("CalleeAgent", calleeAgent);
		}
	}

	@Override
	public Class<TwoPartiesCallResponse> getResponseClass() {
		return TwoPartiesCallResponse.class;
	}

}
