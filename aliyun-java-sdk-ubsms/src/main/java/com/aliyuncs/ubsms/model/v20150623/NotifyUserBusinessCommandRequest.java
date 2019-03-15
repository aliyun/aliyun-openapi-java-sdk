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

package com.aliyuncs.ubsms.model.v20150623;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class NotifyUserBusinessCommandRequest extends RpcAcsRequest<NotifyUserBusinessCommandResponse> {
	
	public NotifyUserBusinessCommandRequest() {
		super("Ubsms", "2015-06-23", "NotifyUserBusinessCommand", "ubsms");
	}

	private String uid;

	private String password;

	private String instanceId;

	private String serviceCode;

	private String clientToken;

	private String cmd;

	private String region;

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
		if(uid != null){
			putQueryParameter("Uid", uid);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getBizServiceCode() {
		return this.serviceCode;
	}

	public void setBizServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putQueryParameter("ServiceCode", serviceCode);
		}
	}

	/**
	 * @deprecated use getBizServiceCode instead of this.
	 */
	@Deprecated
	public String getServiceCode() {
		return this.serviceCode;
	}

	/**
	 * @deprecated use setBizServiceCode instead of this.
	 */
	@Deprecated
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		if(serviceCode != null){
			putQueryParameter("ServiceCode", serviceCode);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getCmd() {
		return this.cmd;
	}

	public void setCmd(String cmd) {
		this.cmd = cmd;
		if(cmd != null){
			putQueryParameter("Cmd", cmd);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<NotifyUserBusinessCommandResponse> getResponseClass() {
		return NotifyUserBusinessCommandResponse.class;
	}

}
