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
public class ReversedRegisterServerRequest extends RpcAcsRequest<ReversedRegisterServerResponse> {
	
	public ReversedRegisterServerRequest() {
		super("hdr", "2017-09-25", "ReversedRegisterServer", "hdr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String ipAddress;

	private String agentVersion;

	private Long memory;

	private String disks;

	private String osDetail;

	private String hostname;

	private String bootMode;

	private String securityToken;

	private Long userUid;

	private String gatewayId;

	private String volumes;

	private Integer cpu;

	private String osType;

	private String serverId;

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
		if(ipAddress != null){
			putQueryParameter("IpAddress", ipAddress);
		}
	}

	public String getAgentVersion() {
		return this.agentVersion;
	}

	public void setAgentVersion(String agentVersion) {
		this.agentVersion = agentVersion;
		if(agentVersion != null){
			putQueryParameter("AgentVersion", agentVersion);
		}
	}

	public Long getMemory() {
		return this.memory;
	}

	public void setMemory(Long memory) {
		this.memory = memory;
		if(memory != null){
			putQueryParameter("Memory", memory.toString());
		}
	}

	public String getDisks() {
		return this.disks;
	}

	public void setDisks(String disks) {
		this.disks = disks;
		if(disks != null){
			putQueryParameter("Disks", disks);
		}
	}

	public String getOsDetail() {
		return this.osDetail;
	}

	public void setOsDetail(String osDetail) {
		this.osDetail = osDetail;
		if(osDetail != null){
			putQueryParameter("OsDetail", osDetail);
		}
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
		if(hostname != null){
			putQueryParameter("Hostname", hostname);
		}
	}

	public String getBootMode() {
		return this.bootMode;
	}

	public void setBootMode(String bootMode) {
		this.bootMode = bootMode;
		if(bootMode != null){
			putQueryParameter("BootMode", bootMode);
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

	public Long getUserUid() {
		return this.userUid;
	}

	public void setUserUid(Long userUid) {
		this.userUid = userUid;
		if(userUid != null){
			putQueryParameter("UserUid", userUid.toString());
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	public String getVolumes() {
		return this.volumes;
	}

	public void setVolumes(String volumes) {
		this.volumes = volumes;
		if(volumes != null){
			putQueryParameter("Volumes", volumes);
		}
	}

	public Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(Integer cpu) {
		this.cpu = cpu;
		if(cpu != null){
			putQueryParameter("Cpu", cpu.toString());
		}
	}

	public String getOsType() {
		return this.osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
		if(osType != null){
			putQueryParameter("OsType", osType);
		}
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
		if(serverId != null){
			putQueryParameter("ServerId", serverId);
		}
	}

	@Override
	public Class<ReversedRegisterServerResponse> getResponseClass() {
		return ReversedRegisterServerResponse.class;
	}

}
