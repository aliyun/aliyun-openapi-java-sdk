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
public class SetPasswordInitializationConfigurationRequest extends RpcAcsRequest<SetPasswordInitializationConfigurationResponse> {
	   

	private String passwordInitializationType;

	private List<String> passwordInitializationNotificationChannels;

	private String passwordInitializationStatus;

	private String passwordForcedUpdateStatus;

	private String instanceId;
	public SetPasswordInitializationConfigurationRequest() {
		super("Eiam", "2021-12-01", "SetPasswordInitializationConfiguration", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPasswordInitializationType() {
		return this.passwordInitializationType;
	}

	public void setPasswordInitializationType(String passwordInitializationType) {
		this.passwordInitializationType = passwordInitializationType;
		if(passwordInitializationType != null){
			putQueryParameter("PasswordInitializationType", passwordInitializationType);
		}
	}

	public List<String> getPasswordInitializationNotificationChannels() {
		return this.passwordInitializationNotificationChannels;
	}

	public void setPasswordInitializationNotificationChannels(List<String> passwordInitializationNotificationChannels) {
		this.passwordInitializationNotificationChannels = passwordInitializationNotificationChannels;	
		if (passwordInitializationNotificationChannels != null) {
			for (int depth1 = 0; depth1 < passwordInitializationNotificationChannels.size(); depth1++) {
				putQueryParameter("PasswordInitializationNotificationChannels." + (depth1 + 1) , passwordInitializationNotificationChannels.get(depth1));
			}
		}	
	}

	public String getPasswordInitializationStatus() {
		return this.passwordInitializationStatus;
	}

	public void setPasswordInitializationStatus(String passwordInitializationStatus) {
		this.passwordInitializationStatus = passwordInitializationStatus;
		if(passwordInitializationStatus != null){
			putQueryParameter("PasswordInitializationStatus", passwordInitializationStatus);
		}
	}

	public String getPasswordForcedUpdateStatus() {
		return this.passwordForcedUpdateStatus;
	}

	public void setPasswordForcedUpdateStatus(String passwordForcedUpdateStatus) {
		this.passwordForcedUpdateStatus = passwordForcedUpdateStatus;
		if(passwordForcedUpdateStatus != null){
			putQueryParameter("PasswordForcedUpdateStatus", passwordForcedUpdateStatus);
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
	public Class<SetPasswordInitializationConfigurationResponse> getResponseClass() {
		return SetPasswordInitializationConfigurationResponse.class;
	}

}
