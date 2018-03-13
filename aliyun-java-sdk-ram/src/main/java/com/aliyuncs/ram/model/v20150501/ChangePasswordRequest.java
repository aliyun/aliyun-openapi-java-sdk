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
package com.aliyuncs.ram.model.v20150501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ChangePasswordRequest extends RpcAcsRequest<ChangePasswordResponse> {
	
	public ChangePasswordRequest() {
		super("Ram", "2015-05-01", "ChangePassword");
		setProtocol(ProtocolType.HTTPS);
	}

	private String oldPassword;

	private String newPassword;

	public String getOldPassword() {
		return this.oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
		if(oldPassword != null){
			putQueryParameter("OldPassword", oldPassword);
		}
	}

	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
		if(newPassword != null){
			putQueryParameter("NewPassword", newPassword);
		}
	}

	@Override
	public Class<ChangePasswordResponse> getResponseClass() {
		return ChangePasswordResponse.class;
	}

}
