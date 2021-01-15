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
public class UpdateClientSettingsRequest extends RpcAcsRequest<UpdateClientSettingsResponse> {
	   

	private String dataProxySetting;

	private Integer maxWorker;

	private Integer proxyPort;

	private String clientId;

	private Integer maxCpuCore;

	private String vaultId;

	private String dataNetworkType;

	private String proxyPassword;

	private String proxyUser;

	private Boolean useHttps;

	private String proxyHost;
	public UpdateClientSettingsRequest() {
		super("hbr", "2017-09-08", "UpdateClientSettings", "hbr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataProxySetting() {
		return this.dataProxySetting;
	}

	public void setDataProxySetting(String dataProxySetting) {
		this.dataProxySetting = dataProxySetting;
		if(dataProxySetting != null){
			putQueryParameter("DataProxySetting", dataProxySetting);
		}
	}

	public Integer getMaxWorker() {
		return this.maxWorker;
	}

	public void setMaxWorker(Integer maxWorker) {
		this.maxWorker = maxWorker;
		if(maxWorker != null){
			putQueryParameter("MaxWorker", maxWorker.toString());
		}
	}

	public Integer getProxyPort() {
		return this.proxyPort;
	}

	public void setProxyPort(Integer proxyPort) {
		this.proxyPort = proxyPort;
		if(proxyPort != null){
			putQueryParameter("ProxyPort", proxyPort.toString());
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
		}
	}

	public Integer getMaxCpuCore() {
		return this.maxCpuCore;
	}

	public void setMaxCpuCore(Integer maxCpuCore) {
		this.maxCpuCore = maxCpuCore;
		if(maxCpuCore != null){
			putQueryParameter("MaxCpuCore", maxCpuCore.toString());
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

	public String getDataNetworkType() {
		return this.dataNetworkType;
	}

	public void setDataNetworkType(String dataNetworkType) {
		this.dataNetworkType = dataNetworkType;
		if(dataNetworkType != null){
			putQueryParameter("DataNetworkType", dataNetworkType);
		}
	}

	public String getProxyPassword() {
		return this.proxyPassword;
	}

	public void setProxyPassword(String proxyPassword) {
		this.proxyPassword = proxyPassword;
		if(proxyPassword != null){
			putQueryParameter("ProxyPassword", proxyPassword);
		}
	}

	public String getProxyUser() {
		return this.proxyUser;
	}

	public void setProxyUser(String proxyUser) {
		this.proxyUser = proxyUser;
		if(proxyUser != null){
			putQueryParameter("ProxyUser", proxyUser);
		}
	}

	public Boolean getUseHttps() {
		return this.useHttps;
	}

	public void setUseHttps(Boolean useHttps) {
		this.useHttps = useHttps;
		if(useHttps != null){
			putQueryParameter("UseHttps", useHttps.toString());
		}
	}

	public String getProxyHost() {
		return this.proxyHost;
	}

	public void setProxyHost(String proxyHost) {
		this.proxyHost = proxyHost;
		if(proxyHost != null){
			putQueryParameter("ProxyHost", proxyHost);
		}
	}

	@Override
	public Class<UpdateClientSettingsResponse> getResponseClass() {
		return UpdateClientSettingsResponse.class;
	}

}
