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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SaveApPortalConfigRequest extends RpcAcsRequest<SaveApPortalConfigResponse> {
	
	public SaveApPortalConfigRequest() {
		super("cloudwf", "2017-03-28", "SaveApPortalConfig", "cloudwf");
	}

	private String authKey;

	private String portalUrl;

	private Boolean portalStatus;

	private String whitelist;

	private String checkUrl;

	private Long apConfigId;

	private String authSecret;

	private String webAuthUrl;

	private Integer network;

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public String getPortalUrl() {
		return this.portalUrl;
	}

	public void setPortalUrl(String portalUrl) {
		this.portalUrl = portalUrl;
		if(portalUrl != null){
			putQueryParameter("PortalUrl", portalUrl);
		}
	}

	public Boolean getPortalStatus() {
		return this.portalStatus;
	}

	public void setPortalStatus(Boolean portalStatus) {
		this.portalStatus = portalStatus;
		if(portalStatus != null){
			putQueryParameter("PortalStatus", portalStatus.toString());
		}
	}

	public String getWhitelist() {
		return this.whitelist;
	}

	public void setWhitelist(String whitelist) {
		this.whitelist = whitelist;
		if(whitelist != null){
			putQueryParameter("Whitelist", whitelist);
		}
	}

	public String getCheckUrl() {
		return this.checkUrl;
	}

	public void setCheckUrl(String checkUrl) {
		this.checkUrl = checkUrl;
		if(checkUrl != null){
			putQueryParameter("CheckUrl", checkUrl);
		}
	}

	public Long getApConfigId() {
		return this.apConfigId;
	}

	public void setApConfigId(Long apConfigId) {
		this.apConfigId = apConfigId;
		if(apConfigId != null){
			putQueryParameter("ApConfigId", apConfigId.toString());
		}
	}

	public String getAuthSecret() {
		return this.authSecret;
	}

	public void setAuthSecret(String authSecret) {
		this.authSecret = authSecret;
		if(authSecret != null){
			putQueryParameter("AuthSecret", authSecret);
		}
	}

	public String getWebAuthUrl() {
		return this.webAuthUrl;
	}

	public void setWebAuthUrl(String webAuthUrl) {
		this.webAuthUrl = webAuthUrl;
		if(webAuthUrl != null){
			putQueryParameter("WebAuthUrl", webAuthUrl);
		}
	}

	public Integer getNetwork() {
		return this.network;
	}

	public void setNetwork(Integer network) {
		this.network = network;
		if(network != null){
			putQueryParameter("Network", network.toString());
		}
	}

	@Override
	public Class<SaveApPortalConfigResponse> getResponseClass() {
		return SaveApPortalConfigResponse.class;
	}

}
