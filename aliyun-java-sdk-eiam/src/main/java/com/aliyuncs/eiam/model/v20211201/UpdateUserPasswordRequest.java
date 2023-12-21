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
public class UpdateUserPasswordRequest extends RpcAcsRequest<UpdateUserPasswordResponse> {
	   

	private List<String> userNotificationChannels;

	private String userId;

	private String password;

	private String passwordForcedUpdateStatus;

	private String instanceId;
	public UpdateUserPasswordRequest() {
		super("Eiam", "2021-12-01", "UpdateUserPassword", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getUserNotificationChannels() {
		return this.userNotificationChannels;
	}

	public void setUserNotificationChannels(List<String> userNotificationChannels) {
		this.userNotificationChannels = userNotificationChannels;	
		if (userNotificationChannels != null) {
			for (int depth1 = 0; depth1 < userNotificationChannels.size(); depth1++) {
				putQueryParameter("UserNotificationChannels." + (depth1 + 1) , userNotificationChannels.get(depth1));
			}
		}	
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
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
	public Class<UpdateUserPasswordResponse> getResponseClass() {
		return UpdateUserPasswordResponse.class;
	}

}
