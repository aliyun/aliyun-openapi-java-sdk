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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeployDrGatewayRequest extends RpcAcsRequest<DeployDrGatewayResponse> {
	
	public DeployDrGatewayRequest() {
		super("hdr", "2017-09-25", "DeployDrGateway", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String windowsShadowVmImageName;

	private String sitePairId;

	private String gatewayImageName;

	private String description;

	private String linuxShadowVmImageName;

	private String drGatewayClass;

	private String userVSwitchId;

	private String securityToken;

	private String name;

	private String siteId;

	public String getWindowsShadowVmImageName() {
		return this.windowsShadowVmImageName;
	}

	public void setWindowsShadowVmImageName(String windowsShadowVmImageName) {
		this.windowsShadowVmImageName = windowsShadowVmImageName;
		if(windowsShadowVmImageName != null){
			putQueryParameter("WindowsShadowVmImageName", windowsShadowVmImageName);
		}
	}

	public String getSitePairId() {
		return this.sitePairId;
	}

	public void setSitePairId(String sitePairId) {
		this.sitePairId = sitePairId;
		if(sitePairId != null){
			putQueryParameter("SitePairId", sitePairId);
		}
	}

	public String getGatewayImageName() {
		return this.gatewayImageName;
	}

	public void setGatewayImageName(String gatewayImageName) {
		this.gatewayImageName = gatewayImageName;
		if(gatewayImageName != null){
			putQueryParameter("GatewayImageName", gatewayImageName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getLinuxShadowVmImageName() {
		return this.linuxShadowVmImageName;
	}

	public void setLinuxShadowVmImageName(String linuxShadowVmImageName) {
		this.linuxShadowVmImageName = linuxShadowVmImageName;
		if(linuxShadowVmImageName != null){
			putQueryParameter("LinuxShadowVmImageName", linuxShadowVmImageName);
		}
	}

	public String getDrGatewayClass() {
		return this.drGatewayClass;
	}

	public void setDrGatewayClass(String drGatewayClass) {
		this.drGatewayClass = drGatewayClass;
		if(drGatewayClass != null){
			putQueryParameter("DrGatewayClass", drGatewayClass);
		}
	}

	public String getUserVSwitchId() {
		return this.userVSwitchId;
	}

	public void setUserVSwitchId(String userVSwitchId) {
		this.userVSwitchId = userVSwitchId;
		if(userVSwitchId != null){
			putQueryParameter("UserVSwitchId", userVSwitchId);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
		if(siteId != null){
			putQueryParameter("SiteId", siteId);
		}
	}

	@Override
	public Class<DeployDrGatewayResponse> getResponseClass() {
		return DeployDrGatewayResponse.class;
	}

}
