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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceSpecRequest extends RpcAcsRequest<ModifyInstanceSpecResponse> {
	   

	private Boolean autoPay;

	private Boolean skipWaitSwitch;

	private String instanceSpec;

	private String token;

	private String instanceId;

	private String modifyAction;
	public ModifyInstanceSpecRequest() {
		super("CloudAPI", "2016-07-14", "ModifyInstanceSpec", "apigateway");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Boolean getSkipWaitSwitch() {
		return this.skipWaitSwitch;
	}

	public void setSkipWaitSwitch(Boolean skipWaitSwitch) {
		this.skipWaitSwitch = skipWaitSwitch;
		if(skipWaitSwitch != null){
			putQueryParameter("SkipWaitSwitch", skipWaitSwitch.toString());
		}
	}

	public String getInstanceSpec() {
		return this.instanceSpec;
	}

	public void setInstanceSpec(String instanceSpec) {
		this.instanceSpec = instanceSpec;
		if(instanceSpec != null){
			putQueryParameter("InstanceSpec", instanceSpec);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
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

	public String getModifyAction() {
		return this.modifyAction;
	}

	public void setModifyAction(String modifyAction) {
		this.modifyAction = modifyAction;
		if(modifyAction != null){
			putQueryParameter("ModifyAction", modifyAction);
		}
	}

	@Override
	public Class<ModifyInstanceSpecResponse> getResponseClass() {
		return ModifyInstanceSpecResponse.class;
	}

}
