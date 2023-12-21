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
public class SetPasswordExpirationConfigurationRequest extends RpcAcsRequest<SetPasswordExpirationConfigurationResponse> {
	   

	private Integer passwordForcedUpdateDuration;

	private Integer passwordExpirationNotificationDuration;

	private String passwordExpirationStatus;

	private String instanceId;

	private String passwordExpirationAction;

	private Integer passwordValidMaxDay;

	private List<String> passwordExpirationNotificationChannels;

	private String passwordExpirationNotificationStatus;
	public SetPasswordExpirationConfigurationRequest() {
		super("Eiam", "2021-12-01", "SetPasswordExpirationConfiguration", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getPasswordForcedUpdateDuration() {
		return this.passwordForcedUpdateDuration;
	}

	public void setPasswordForcedUpdateDuration(Integer passwordForcedUpdateDuration) {
		this.passwordForcedUpdateDuration = passwordForcedUpdateDuration;
		if(passwordForcedUpdateDuration != null){
			putQueryParameter("PasswordForcedUpdateDuration", passwordForcedUpdateDuration.toString());
		}
	}

	public Integer getPasswordExpirationNotificationDuration() {
		return this.passwordExpirationNotificationDuration;
	}

	public void setPasswordExpirationNotificationDuration(Integer passwordExpirationNotificationDuration) {
		this.passwordExpirationNotificationDuration = passwordExpirationNotificationDuration;
		if(passwordExpirationNotificationDuration != null){
			putQueryParameter("PasswordExpirationNotificationDuration", passwordExpirationNotificationDuration.toString());
		}
	}

	public String getPasswordExpirationStatus() {
		return this.passwordExpirationStatus;
	}

	public void setPasswordExpirationStatus(String passwordExpirationStatus) {
		this.passwordExpirationStatus = passwordExpirationStatus;
		if(passwordExpirationStatus != null){
			putQueryParameter("PasswordExpirationStatus", passwordExpirationStatus);
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

	public String getPasswordExpirationAction() {
		return this.passwordExpirationAction;
	}

	public void setPasswordExpirationAction(String passwordExpirationAction) {
		this.passwordExpirationAction = passwordExpirationAction;
		if(passwordExpirationAction != null){
			putQueryParameter("PasswordExpirationAction", passwordExpirationAction);
		}
	}

	public Integer getPasswordValidMaxDay() {
		return this.passwordValidMaxDay;
	}

	public void setPasswordValidMaxDay(Integer passwordValidMaxDay) {
		this.passwordValidMaxDay = passwordValidMaxDay;
		if(passwordValidMaxDay != null){
			putQueryParameter("PasswordValidMaxDay", passwordValidMaxDay.toString());
		}
	}

	public List<String> getPasswordExpirationNotificationChannels() {
		return this.passwordExpirationNotificationChannels;
	}

	public void setPasswordExpirationNotificationChannels(List<String> passwordExpirationNotificationChannels) {
		this.passwordExpirationNotificationChannels = passwordExpirationNotificationChannels;	
		if (passwordExpirationNotificationChannels != null) {
			for (int depth1 = 0; depth1 < passwordExpirationNotificationChannels.size(); depth1++) {
				putQueryParameter("PasswordExpirationNotificationChannels." + (depth1 + 1) , passwordExpirationNotificationChannels.get(depth1));
			}
		}	
	}

	public String getPasswordExpirationNotificationStatus() {
		return this.passwordExpirationNotificationStatus;
	}

	public void setPasswordExpirationNotificationStatus(String passwordExpirationNotificationStatus) {
		this.passwordExpirationNotificationStatus = passwordExpirationNotificationStatus;
		if(passwordExpirationNotificationStatus != null){
			putQueryParameter("PasswordExpirationNotificationStatus", passwordExpirationNotificationStatus);
		}
	}

	@Override
	public Class<SetPasswordExpirationConfigurationResponse> getResponseClass() {
		return SetPasswordExpirationConfigurationResponse.class;
	}

}
