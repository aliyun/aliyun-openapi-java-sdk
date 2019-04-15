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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryInstanceCreatedByProductRequest extends RpcAcsRequest<InnerQueryInstanceCreatedByProductResponse> {
	
	public InnerQueryInstanceCreatedByProductRequest() {
		super("EcsInc", "2016-03-14", "InnerQueryInstanceCreatedByProduct", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private List<String> privateIpAddressess;

	private List<Long> aliUidss;

	private List<String> instanceTypess;

	private String channel;

	private String securityGroupId;

	private String operator;

	private Integer pageNumber;

	private Integer pageSize;

	private List<String> publicIpAddressess;

	private String proxyId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String token;

	private String vSwitchId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getPrivateIpAddressess() {
		return this.privateIpAddressess;
	}

	public void setPrivateIpAddressess(List<String> privateIpAddressess) {
		this.privateIpAddressess = privateIpAddressess;	
		if (privateIpAddressess != null) {
			for (int i = 0; i < privateIpAddressess.size(); i++) {
				putQueryParameter("PrivateIpAddresses." + (i + 1) , privateIpAddressess.get(i));
			}
		}	
	}

	public List<Long> getAliUidss() {
		return this.aliUidss;
	}

	public void setAliUidss(List<Long> aliUidss) {
		this.aliUidss = aliUidss;	
		if (aliUidss != null) {
			for (int i = 0; i < aliUidss.size(); i++) {
				putQueryParameter("AliUids." + (i + 1) , aliUidss.get(i));
			}
		}	
	}

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
		}	
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("channel", channel);
		}
	}

	public String getSecurityGroupId() {
		return this.securityGroupId;
	}

	public void setSecurityGroupId(String securityGroupId) {
		this.securityGroupId = securityGroupId;
		if(securityGroupId != null){
			putQueryParameter("SecurityGroupId", securityGroupId);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("operator", operator);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getPublicIpAddressess() {
		return this.publicIpAddressess;
	}

	public void setPublicIpAddressess(List<String> publicIpAddressess) {
		this.publicIpAddressess = publicIpAddressess;	
		if (publicIpAddressess != null) {
			for (int i = 0; i < publicIpAddressess.size(); i++) {
				putQueryParameter("PublicIpAddresses." + (i + 1) , publicIpAddressess.get(i));
			}
		}	
	}

	public String getProxyId() {
		return this.proxyId;
	}

	public void setProxyId(String proxyId) {
		this.proxyId = proxyId;
		if(proxyId != null){
			putQueryParameter("proxyId", proxyId);
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

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("token", token);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	@Override
	public Class<InnerQueryInstanceCreatedByProductResponse> getResponseClass() {
		return InnerQueryInstanceCreatedByProductResponse.class;
	}

}
