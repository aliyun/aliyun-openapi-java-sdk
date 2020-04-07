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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHanaInstanceRequest extends RpcAcsRequest<CreateHanaInstanceResponse> {
	   

	private String hanaName;

	private String vaultId;

	private String contactId;

	private Boolean useSsl;

	private String sid;

	private String alertSetting;

	private String password;

	private String host;

	private Boolean validateCertificate;

	private String ecsInstanceId;

	private Integer instanceNumber;

	private String token;

	private String userName;
	public CreateHanaInstanceRequest() {
		super("hbr", "2017-09-08", "CreateHanaInstance", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHanaName() {
		return this.hanaName;
	}

	public void setHanaName(String hanaName) {
		this.hanaName = hanaName;
		if(hanaName != null){
			putQueryParameter("HanaName", hanaName);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getContactId() {
		return this.contactId;
	}

	public void setContactId(String contactId) {
		this.contactId = contactId;
		if(contactId != null){
			putQueryParameter("ContactId", contactId);
		}
	}

	public Boolean getUseSsl() {
		return this.useSsl;
	}

	public void setUseSsl(Boolean useSsl) {
		this.useSsl = useSsl;
		if(useSsl != null){
			putQueryParameter("UseSsl", useSsl.toString());
		}
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid);
		}
	}

	public String getAlertSetting() {
		return this.alertSetting;
	}

	public void setAlertSetting(String alertSetting) {
		this.alertSetting = alertSetting;
		if(alertSetting != null){
			putQueryParameter("AlertSetting", alertSetting);
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

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putQueryParameter("Host", host);
		}
	}

	public Boolean getValidateCertificate() {
		return this.validateCertificate;
	}

	public void setValidateCertificate(Boolean validateCertificate) {
		this.validateCertificate = validateCertificate;
		if(validateCertificate != null){
			putQueryParameter("ValidateCertificate", validateCertificate.toString());
		}
	}

	public String getEcsInstanceId() {
		return this.ecsInstanceId;
	}

	public void setEcsInstanceId(String ecsInstanceId) {
		this.ecsInstanceId = ecsInstanceId;
		if(ecsInstanceId != null){
			putQueryParameter("EcsInstanceId", ecsInstanceId);
		}
	}

	public Integer getInstanceNumber() {
		return this.instanceNumber;
	}

	public void setInstanceNumber(Integer instanceNumber) {
		this.instanceNumber = instanceNumber;
		if(instanceNumber != null){
			putQueryParameter("InstanceNumber", instanceNumber.toString());
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putQueryParameter("UserName", userName);
		}
	}

	@Override
	public Class<CreateHanaInstanceResponse> getResponseClass() {
		return CreateHanaInstanceResponse.class;
	}

}
