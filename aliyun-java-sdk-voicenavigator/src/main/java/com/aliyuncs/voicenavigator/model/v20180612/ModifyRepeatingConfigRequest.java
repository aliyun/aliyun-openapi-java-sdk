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

package com.aliyuncs.voicenavigator.model.v20180612;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.voicenavigator.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyRepeatingConfigRequest extends RpcAcsRequest<ModifyRepeatingConfigResponse> {
	   

	private List<String> utterancess;

	private String instanceId;
	public ModifyRepeatingConfigRequest() {
		super("VoiceNavigator", "2018-06-12", "ModifyRepeatingConfig", "voicebot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getUtterancess() {
		return this.utterancess;
	}

	public void setUtterancess(List<String> utterancess) {
		this.utterancess = utterancess;	
		if (utterancess != null) {
			for (int i = 0; i < utterancess.size(); i++) {
				putQueryParameter("Utterances." + (i + 1) , utterancess.get(i));
			}
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

	@Override
	public Class<ModifyRepeatingConfigResponse> getResponseClass() {
		return ModifyRepeatingConfigResponse.class;
	}

}
