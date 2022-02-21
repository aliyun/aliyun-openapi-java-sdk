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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SaveApPortalConfigRequest extends RpcAcsRequest<SaveApPortalConfigResponse> {
	   

	private String authKey;

	private List<String> portalTypes;

	private Integer countdown;

	private Integer clientUpload;

	private String whitelist;

	private Integer network;

	private String appName;

	private String portalUrl;

	private Integer totalUpload;

	private Integer totalDownload;

	private String appAuthUrl;

	private String appCode;

	private Long apConfigId;

	private String checkUrl;

	private Integer clientDownload;

	private String authSecret;

	private String webAuthUrl;

	private Long timeStamp;
	public SaveApPortalConfigRequest() {
		super("cloudwifi-pop", "2019-11-18", "SaveApPortalConfig", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthKey() {
		return this.authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
		if(authKey != null){
			putQueryParameter("AuthKey", authKey);
		}
	}

	public List<String> getPortalTypes() {
		return this.portalTypes;
	}

	public void setPortalTypes(List<String> portalTypes) {
		this.portalTypes = portalTypes;	
		if (portalTypes != null) {
			String portalTypesArrVal = "";
			for(int depth1 = 0; depth1 < portalTypes.size(); depth1++) {
				portalTypesArrVal += portalTypes.get(depth1) + ",";
			}
			if (portalTypesArrVal.length() > 0) {
				portalTypesArrVal = portalTypesArrVal.substring(0, portalTypesArrVal.length() - 1);
			}
			putQueryParameter("PortalTypes" , portalTypesArrVal);
		}	
	}

	public Integer getCountdown() {
		return this.countdown;
	}

	public void setCountdown(Integer countdown) {
		this.countdown = countdown;
		if(countdown != null){
			putQueryParameter("Countdown", countdown.toString());
		}
	}

	public Integer getClientUpload() {
		return this.clientUpload;
	}

	public void setClientUpload(Integer clientUpload) {
		this.clientUpload = clientUpload;
		if(clientUpload != null){
			putQueryParameter("ClientUpload", clientUpload.toString());
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

	public Integer getNetwork() {
		return this.network;
	}

	public void setNetwork(Integer network) {
		this.network = network;
		if(network != null){
			putQueryParameter("Network", network.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
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

	public Integer getTotalUpload() {
		return this.totalUpload;
	}

	public void setTotalUpload(Integer totalUpload) {
		this.totalUpload = totalUpload;
		if(totalUpload != null){
			putQueryParameter("TotalUpload", totalUpload.toString());
		}
	}

	public Integer getTotalDownload() {
		return this.totalDownload;
	}

	public void setTotalDownload(Integer totalDownload) {
		this.totalDownload = totalDownload;
		if(totalDownload != null){
			putQueryParameter("TotalDownload", totalDownload.toString());
		}
	}

	public String getAppAuthUrl() {
		return this.appAuthUrl;
	}

	public void setAppAuthUrl(String appAuthUrl) {
		this.appAuthUrl = appAuthUrl;
		if(appAuthUrl != null){
			putQueryParameter("AppAuthUrl", appAuthUrl);
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
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

	public String getCheckUrl() {
		return this.checkUrl;
	}

	public void setCheckUrl(String checkUrl) {
		this.checkUrl = checkUrl;
		if(checkUrl != null){
			putQueryParameter("CheckUrl", checkUrl);
		}
	}

	public Integer getClientDownload() {
		return this.clientDownload;
	}

	public void setClientDownload(Integer clientDownload) {
		this.clientDownload = clientDownload;
		if(clientDownload != null){
			putQueryParameter("ClientDownload", clientDownload.toString());
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

	public Long getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
		if(timeStamp != null){
			putQueryParameter("TimeStamp", timeStamp.toString());
		}
	}

	@Override
	public Class<SaveApPortalConfigResponse> getResponseClass() {
		return SaveApPortalConfigResponse.class;
	}

}
