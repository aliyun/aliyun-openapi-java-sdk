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
public class CreateSqlServerInstanceRequest extends RpcAcsRequest<CreateSqlServerInstanceResponse> {
	   

	private String windowsPassword;

	private String sqlLogin;

	private String vaultId;

	private Boolean useWindowsAuth;

	private String sqlPassword;

	private String token;

	private String windowsLogin;

	private String sqlServerType;

	private String serverName;
	public CreateSqlServerInstanceRequest() {
		super("hbr", "2017-09-08", "CreateSqlServerInstance", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWindowsPassword() {
		return this.windowsPassword;
	}

	public void setWindowsPassword(String windowsPassword) {
		this.windowsPassword = windowsPassword;
		if(windowsPassword != null){
			putQueryParameter("WindowsPassword", windowsPassword);
		}
	}

	public String getSqlLogin() {
		return this.sqlLogin;
	}

	public void setSqlLogin(String sqlLogin) {
		this.sqlLogin = sqlLogin;
		if(sqlLogin != null){
			putQueryParameter("SqlLogin", sqlLogin);
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

	public Boolean getUseWindowsAuth() {
		return this.useWindowsAuth;
	}

	public void setUseWindowsAuth(Boolean useWindowsAuth) {
		this.useWindowsAuth = useWindowsAuth;
		if(useWindowsAuth != null){
			putQueryParameter("UseWindowsAuth", useWindowsAuth.toString());
		}
	}

	public String getSqlPassword() {
		return this.sqlPassword;
	}

	public void setSqlPassword(String sqlPassword) {
		this.sqlPassword = sqlPassword;
		if(sqlPassword != null){
			putQueryParameter("SqlPassword", sqlPassword);
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

	public String getWindowsLogin() {
		return this.windowsLogin;
	}

	public void setWindowsLogin(String windowsLogin) {
		this.windowsLogin = windowsLogin;
		if(windowsLogin != null){
			putQueryParameter("WindowsLogin", windowsLogin);
		}
	}

	public String getSqlServerType() {
		return this.sqlServerType;
	}

	public void setSqlServerType(String sqlServerType) {
		this.sqlServerType = sqlServerType;
		if(sqlServerType != null){
			putQueryParameter("SqlServerType", sqlServerType);
		}
	}

	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
		if(serverName != null){
			putQueryParameter("ServerName", serverName);
		}
	}

	@Override
	public Class<CreateSqlServerInstanceResponse> getResponseClass() {
		return CreateSqlServerInstanceResponse.class;
	}

}
