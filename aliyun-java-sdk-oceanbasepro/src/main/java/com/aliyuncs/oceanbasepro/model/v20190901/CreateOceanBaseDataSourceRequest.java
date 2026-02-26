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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateOceanBaseDataSourceRequest extends RpcAcsRequest<CreateOceanBaseDataSourceResponse> {
	   

	private String cluster;

	private String drcUserName;

	private String logProxyIp;

	private String description;

	private String type;

	private String password;

	private String innerDrcPassword;

	private String tenant;

	private String configUrl;

	private String ip;

	private Integer port;

	private String vpcId;

	private String name;

	private String drcPassword;

	private String logProxyPort;

	private String userName;
	public CreateOceanBaseDataSourceRequest() {
		super("OceanBasePro", "2019-09-01", "CreateOceanBaseDataSource", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCluster() {
		return this.cluster;
	}

	public void setCluster(String cluster) {
		this.cluster = cluster;
		if(cluster != null){
			putBodyParameter("Cluster", cluster);
		}
	}

	public String getDrcUserName() {
		return this.drcUserName;
	}

	public void setDrcUserName(String drcUserName) {
		this.drcUserName = drcUserName;
		if(drcUserName != null){
			putBodyParameter("DrcUserName", drcUserName);
		}
	}

	public String getLogProxyIp() {
		return this.logProxyIp;
	}

	public void setLogProxyIp(String logProxyIp) {
		this.logProxyIp = logProxyIp;
		if(logProxyIp != null){
			putBodyParameter("LogProxyIp", logProxyIp);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
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

	public String getInnerDrcPassword() {
		return this.innerDrcPassword;
	}

	public void setInnerDrcPassword(String innerDrcPassword) {
		this.innerDrcPassword = innerDrcPassword;
		if(innerDrcPassword != null){
			putBodyParameter("InnerDrcPassword", innerDrcPassword);
		}
	}

	public String getTenant() {
		return this.tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
		if(tenant != null){
			putBodyParameter("Tenant", tenant);
		}
	}

	public String getConfigUrl() {
		return this.configUrl;
	}

	public void setConfigUrl(String configUrl) {
		this.configUrl = configUrl;
		if(configUrl != null){
			putBodyParameter("ConfigUrl", configUrl);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putBodyParameter("Ip", ip);
		}
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putBodyParameter("Port", port.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getDrcPassword() {
		return this.drcPassword;
	}

	public void setDrcPassword(String drcPassword) {
		this.drcPassword = drcPassword;
		if(drcPassword != null){
			putBodyParameter("DrcPassword", drcPassword);
		}
	}

	public String getLogProxyPort() {
		return this.logProxyPort;
	}

	public void setLogProxyPort(String logProxyPort) {
		this.logProxyPort = logProxyPort;
		if(logProxyPort != null){
			putBodyParameter("LogProxyPort", logProxyPort);
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
	public Class<CreateOceanBaseDataSourceResponse> getResponseClass() {
		return CreateOceanBaseDataSourceResponse.class;
	}

}
