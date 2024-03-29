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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateHanaInstanceRequest extends RpcAcsRequest<UpdateHanaInstanceResponse> {
	   

	private String hanaName;

	private String vaultId;

	private Boolean useSsl;

	private String alertSetting;

	private String resourceGroupId;

	private String password;

	private String host;

	private Boolean validateCertificate;

	private String clusterId;

	private Integer instanceNumber;

	private String userName;
	public UpdateHanaInstanceRequest() {
		super("hbr", "2017-09-08", "UpdateHanaInstance", "hbr");
		setProtocol(ProtocolType.HTTPS);
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

	public Boolean getUseSsl() {
		return this.useSsl;
	}

	public void setUseSsl(Boolean useSsl) {
		this.useSsl = useSsl;
		if(useSsl != null){
			putQueryParameter("UseSsl", useSsl.toString());
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

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
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
	public Class<UpdateHanaInstanceResponse> getResponseClass() {
		return UpdateHanaInstanceResponse.class;
	}

}
