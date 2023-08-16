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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetSwitchValueRequest extends RpcAcsRequest<SetSwitchValueResponse> {
	   

	private String switchName;

	private String switchValue;
	public SetSwitchValueRequest() {
		super("dataworks-public", "2018-06-01", "SetSwitchValue", "dide");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSwitchName() {
		return this.switchName;
	}

	public void setSwitchName(String switchName) {
		this.switchName = switchName;
		if(switchName != null){
			putQueryParameter("SwitchName", switchName);
		}
	}

	public String getSwitchValue() {
		return this.switchValue;
	}

	public void setSwitchValue(String switchValue) {
		this.switchValue = switchValue;
		if(switchValue != null){
			putQueryParameter("SwitchValue", switchValue);
		}
	}

	@Override
	public Class<SetSwitchValueResponse> getResponseClass() {
		return SetSwitchValueResponse.class;
	}

}
