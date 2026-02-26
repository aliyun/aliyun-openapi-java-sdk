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
public class CreateJenkinsImageRegistryRequest extends RpcAcsRequest<CreateJenkinsImageRegistryResponse> {
	   

	private String extraParam;

	private String registryVersion;

	private String registryHostIp;

	private String password;

	private String sourceIp;

	private String registryName;

	private Integer transPerHour;

	private String registryType;

	private String domainName;

	private String whiteList;

	private Integer netType;

	private String vpcId;

	private Integer persistenceDay;

	private Integer protocolType;

	private String userName;
	public CreateJenkinsImageRegistryRequest() {
		super("Sas", "2018-12-03", "CreateJenkinsImageRegistry");
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
			putBodyParameter("ExtraParam", extraParam);
		}
	}

	public String getRegistryVersion() {
		return this.registryVersion;
	}

	public void setRegistryVersion(String registryVersion) {
		this.registryVersion = registryVersion;
		if(registryVersion != null){
			putBodyParameter("RegistryVersion", registryVersion);
		}
	}

	public String getRegistryHostIp() {
		return this.registryHostIp;
	}

	public void setRegistryHostIp(String registryHostIp) {
		this.registryHostIp = registryHostIp;
		if(registryHostIp != null){
			putBodyParameter("RegistryHostIp", registryHostIp);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getRegistryName() {
		return this.registryName;
	}

	public void setRegistryName(String registryName) {
		this.registryName = registryName;
		if(registryName != null){
			putBodyParameter("RegistryName", registryName);
		}
	}

	public Integer getTransPerHour() {
		return this.transPerHour;
	}

	public void setTransPerHour(Integer transPerHour) {
		this.transPerHour = transPerHour;
		if(transPerHour != null){
			putBodyParameter("TransPerHour", transPerHour.toString());
		}
	}

	public String getRegistryType() {
		return this.registryType;
	}

	public void setRegistryType(String registryType) {
		this.registryType = registryType;
		if(registryType != null){
			putBodyParameter("RegistryType", registryType);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putBodyParameter("DomainName", domainName);
		}
	}

	public String getWhiteList() {
		return this.whiteList;
	}

	public void setWhiteList(String whiteList) {
		this.whiteList = whiteList;
		if(whiteList != null){
			putBodyParameter("WhiteList", whiteList);
		}
	}

	public Integer getNetType() {
		return this.netType;
	}

	public void setNetType(Integer netType) {
		this.netType = netType;
		if(netType != null){
			putBodyParameter("NetType", netType.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putBodyParameter("VpcId", vpcId);
		}
	}

	public Integer getPersistenceDay() {
		return this.persistenceDay;
	}

	public void setPersistenceDay(Integer persistenceDay) {
		this.persistenceDay = persistenceDay;
		if(persistenceDay != null){
			putBodyParameter("PersistenceDay", persistenceDay.toString());
		}
	}

	public Integer getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(Integer protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putBodyParameter("ProtocolType", protocolType.toString());
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	@Override
	public Class<CreateJenkinsImageRegistryResponse> getResponseClass() {
		return CreateJenkinsImageRegistryResponse.class;
	}

}
