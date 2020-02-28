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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateSslVpnServerRequest extends RpcAcsRequest<CreateSslVpnServerResponse> {
	   

	private Long resourceOwnerId;

	private String clientToken;

	private String localSubnet;

	private Boolean enableMultiFactorAuth;

	private String iDaaSInstanceId;

	private String cipher;

	private String clientIpPool;

	private String resourceOwnerAccount;

	private Boolean compress;

	private String ownerAccount;

	private String vpnGatewayId;

	private Long ownerId;

	private Integer port;

	private String proto;

	private String name;
	public CreateSslVpnServerRequest() {
		super("Vpc", "2016-04-28", "CreateSslVpnServer", "Vpc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getLocalSubnet() {
		return this.localSubnet;
	}

	public void setLocalSubnet(String localSubnet) {
		this.localSubnet = localSubnet;
		if(localSubnet != null){
			putQueryParameter("LocalSubnet", localSubnet);
		}
	}

	public Boolean getEnableMultiFactorAuth() {
		return this.enableMultiFactorAuth;
	}

	public void setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
		this.enableMultiFactorAuth = enableMultiFactorAuth;
		if(enableMultiFactorAuth != null){
			putQueryParameter("EnableMultiFactorAuth", enableMultiFactorAuth.toString());
		}
	}

	public String getIDaaSInstanceId() {
		return this.iDaaSInstanceId;
	}

	public void setIDaaSInstanceId(String iDaaSInstanceId) {
		this.iDaaSInstanceId = iDaaSInstanceId;
		if(iDaaSInstanceId != null){
			putQueryParameter("IDaaSInstanceId", iDaaSInstanceId);
		}
	}

	public String getCipher() {
		return this.cipher;
	}

	public void setCipher(String cipher) {
		this.cipher = cipher;
		if(cipher != null){
			putQueryParameter("Cipher", cipher);
		}
	}

	public String getClientIpPool() {
		return this.clientIpPool;
	}

	public void setClientIpPool(String clientIpPool) {
		this.clientIpPool = clientIpPool;
		if(clientIpPool != null){
			putQueryParameter("ClientIpPool", clientIpPool);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Boolean getCompress() {
		return this.compress;
	}

	public void setCompress(Boolean compress) {
		this.compress = compress;
		if(compress != null){
			putQueryParameter("Compress", compress.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getVpnGatewayId() {
		return this.vpnGatewayId;
	}

	public void setVpnGatewayId(String vpnGatewayId) {
		this.vpnGatewayId = vpnGatewayId;
		if(vpnGatewayId != null){
			putQueryParameter("VpnGatewayId", vpnGatewayId);
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

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
		if(port != null){
			putQueryParameter("Port", port.toString());
		}
	}

	public String getProto() {
		return this.proto;
	}

	public void setProto(String proto) {
		this.proto = proto;
		if(proto != null){
			putQueryParameter("Proto", proto);
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

	@Override
	public Class<CreateSslVpnServerResponse> getResponseClass() {
		return CreateSslVpnServerResponse.class;
	}

}
