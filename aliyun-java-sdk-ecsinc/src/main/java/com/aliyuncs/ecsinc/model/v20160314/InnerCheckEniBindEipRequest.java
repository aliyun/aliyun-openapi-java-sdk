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

/**
 * @author auto create
 * @version 
 */
public class InnerCheckEniBindEipRequest extends RpcAcsRequest<InnerCheckEniBindEipResponse> {
	
	public InnerCheckEniBindEipRequest() {
		super("EcsInc", "2016-03-14", "InnerCheckEniBindEip", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String aliUid;

	private String eipAddressKeeped;

	private String eniNo;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String eipAddressCount;

	private String operateType;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(String aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid);
		}
	}

	public String getEipAddressKeeped() {
		return this.eipAddressKeeped;
	}

	public void setEipAddressKeeped(String eipAddressKeeped) {
		this.eipAddressKeeped = eipAddressKeeped;
		if(eipAddressKeeped != null){
			putQueryParameter("EipAddressKeeped", eipAddressKeeped);
		}
	}

	public String getEniNo() {
		return this.eniNo;
	}

	public void setEniNo(String eniNo) {
		this.eniNo = eniNo;
		if(eniNo != null){
			putQueryParameter("EniNo", eniNo);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getEipAddressCount() {
		return this.eipAddressCount;
	}

	public void setEipAddressCount(String eipAddressCount) {
		this.eipAddressCount = eipAddressCount;
		if(eipAddressCount != null){
			putQueryParameter("EipAddressCount", eipAddressCount);
		}
	}

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
		}
	}

	@Override
	public Class<InnerCheckEniBindEipResponse> getResponseClass() {
		return InnerCheckEniBindEipResponse.class;
	}

}
