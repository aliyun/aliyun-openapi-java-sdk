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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifySmartAccessGatewayRequest extends RpcAcsRequest<ModifySmartAccessGatewayResponse> {
	
	public ModifySmartAccessGatewayRequest() {
		super("Smartag", "2018-03-13", "ModifySmartAccessGateway", "smartag");
	}

	private List<SnatEntries> snatEntriess;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String description;

	private Long ownerId;

	private Integer securityLockThreshold;

	private String name;

	private String cidrBlock;

	private String smartAGId;

	public List<SnatEntries> getSnatEntriess() {
		return this.snatEntriess;
	}

	public void setSnatEntriess(List<SnatEntries> snatEntriess) {
		this.snatEntriess = snatEntriess;	
		if (snatEntriess != null) {
			for (int depth1 = 0; depth1 < snatEntriess.size(); depth1++) {
				putQueryParameter("SnatEntries." + (depth1 + 1) + ".CidrBlock" , snatEntriess.get(depth1).getCidrBlock());
				putQueryParameter("SnatEntries." + (depth1 + 1) + ".SnatIp" , snatEntriess.get(depth1).getSnatIp());
			}
		}	
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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

	public Integer getSecurityLockThreshold() {
		return this.securityLockThreshold;
	}

	public void setSecurityLockThreshold(Integer securityLockThreshold) {
		this.securityLockThreshold = securityLockThreshold;
		if(securityLockThreshold != null){
			putQueryParameter("SecurityLockThreshold", securityLockThreshold.toString());
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

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
		if(cidrBlock != null){
			putQueryParameter("CidrBlock", cidrBlock);
		}
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public static class SnatEntries {

		private String cidrBlock;

		private String snatIp;

		public String getCidrBlock() {
			return this.cidrBlock;
		}

		public void setCidrBlock(String cidrBlock) {
			this.cidrBlock = cidrBlock;
		}

		public String getSnatIp() {
			return this.snatIp;
		}

		public void setSnatIp(String snatIp) {
			this.snatIp = snatIp;
		}
	}

	@Override
	public Class<ModifySmartAccessGatewayResponse> getResponseClass() {
		return ModifySmartAccessGatewayResponse.class;
	}

}
