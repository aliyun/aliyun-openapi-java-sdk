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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyParentPlatformRequest extends RpcAcsRequest<ModifyParentPlatformResponse> {
	   

	private String gbId;

	private Boolean clientAuth;

	private String description;

	private Boolean autoStart;

	private String id;

	private String clientPassword;

	private String ip;

	private Long ownerId;

	private Long port;

	private String name;

	private String clientUsername;
	public ModifyParentPlatformRequest() {
		super("vs", "2018-12-12", "ModifyParentPlatform", "vs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGbId() {
		return this.gbId;
	}

	public void setGbId(String gbId) {
		this.gbId = gbId;
		if(gbId != null){
			putQueryParameter("GbId", gbId);
		}
	}

	public Boolean getClientAuth() {
		return this.clientAuth;
	}

	public void setClientAuth(Boolean clientAuth) {
		this.clientAuth = clientAuth;
		if(clientAuth != null){
			putQueryParameter("ClientAuth", clientAuth.toString());
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

	public Boolean getAutoStart() {
		return this.autoStart;
	}

	public void setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
		if(autoStart != null){
			putQueryParameter("AutoStart", autoStart.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getClientPassword() {
		return this.clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
		if(clientPassword != null){
			putQueryParameter("ClientPassword", clientPassword);
		}
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
		if(ip != null){
			putQueryParameter("Ip", ip);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getPort() {
		return this.port;
	}

	public void setPort(Long port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
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

	public String getClientUsername() {
		return this.clientUsername;
	}

	public void setClientUsername(String clientUsername) {
		this.clientUsername = clientUsername;
		if(clientUsername != null){
			putQueryParameter("ClientUsername", clientUsername);
		}
	}

	@Override
	public Class<ModifyParentPlatformResponse> getResponseClass() {
		return ModifyParentPlatformResponse.class;
	}

}
