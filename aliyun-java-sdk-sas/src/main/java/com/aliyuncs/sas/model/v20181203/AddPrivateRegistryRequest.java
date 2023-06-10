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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddPrivateRegistryRequest extends RpcAcsRequest<AddPrivateRegistryResponse> {
	   

	private String extraParam;

	private String registryVersion;

	private String registryHostIp;

	private String password;

	private String registryRegionId;

	private Integer transPerHour;

	private String registryType;

	private String domainName;

	private Long netType;

	private String vpcId;

	private Long protocolType;

	private String userName;
	public AddPrivateRegistryRequest() {
		super("Sas", "2018-12-03", "AddPrivateRegistry", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraParam() {
		return this.extraParam;
	}

	public void setExtraParam(String extraParam) {
		this.extraParam = extraParam;
		if(extraParam != null){
			putQueryParameter("ExtraParam", extraParam);
		}
	}

	public String getRegistryVersion() {
		return this.registryVersion;
	}

	public void setRegistryVersion(String registryVersion) {
		this.registryVersion = registryVersion;
		if(registryVersion != null){
			putQueryParameter("RegistryVersion", registryVersion);
		}
	}

	public String getRegistryHostIp() {
		return this.registryHostIp;
	}

	public void setRegistryHostIp(String registryHostIp) {
		this.registryHostIp = registryHostIp;
		if(registryHostIp != null){
			putQueryParameter("RegistryHostIp", registryHostIp);
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

	public String getRegistryRegionId() {
		return this.registryRegionId;
	}

	public void setRegistryRegionId(String registryRegionId) {
		this.registryRegionId = registryRegionId;
		if(registryRegionId != null){
			putQueryParameter("RegistryRegionId", registryRegionId);
		}
	}

	public Integer getTransPerHour() {
		return this.transPerHour;
	}

	public void setTransPerHour(Integer transPerHour) {
		this.transPerHour = transPerHour;
		if(transPerHour != null){
			putQueryParameter("TransPerHour", transPerHour.toString());
		}
	}

	public String getRegistryType() {
		return this.registryType;
	}

	public void setRegistryType(String registryType) {
		this.registryType = registryType;
		if(registryType != null){
			putQueryParameter("RegistryType", registryType);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
		}
	}

	public Long getNetType() {
		return this.netType;
	}

	public void setNetType(Long netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public Long getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(Long protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType.toString());
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
	public Class<AddPrivateRegistryResponse> getResponseClass() {
		return AddPrivateRegistryResponse.class;
	}

}
