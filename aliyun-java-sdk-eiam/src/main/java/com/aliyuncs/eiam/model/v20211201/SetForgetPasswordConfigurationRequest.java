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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SetForgetPasswordConfigurationRequest extends RpcAcsRequest<SetForgetPasswordConfigurationResponse> {
	   

	private List<String> authenticationChannels;

	private String forgetPasswordStatus;

	private String instanceId;
	public SetForgetPasswordConfigurationRequest() {
		super("Eiam", "2021-12-01", "SetForgetPasswordConfiguration", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getAuthenticationChannels() {
		return this.authenticationChannels;
	}

	public void setAuthenticationChannels(List<String> authenticationChannels) {
		this.authenticationChannels = authenticationChannels;	
		if (authenticationChannels != null) {
			for (int depth1 = 0; depth1 < authenticationChannels.size(); depth1++) {
				putQueryParameter("AuthenticationChannels." + (depth1 + 1) , authenticationChannels.get(depth1));
			}
		}	
	}

	public String getForgetPasswordStatus() {
		return this.forgetPasswordStatus;
	}

	public void setForgetPasswordStatus(String forgetPasswordStatus) {
		this.forgetPasswordStatus = forgetPasswordStatus;
		if(forgetPasswordStatus != null){
			putQueryParameter("ForgetPasswordStatus", forgetPasswordStatus);
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
	public Class<SetForgetPasswordConfigurationResponse> getResponseClass() {
		return SetForgetPasswordConfigurationResponse.class;
	}

}
