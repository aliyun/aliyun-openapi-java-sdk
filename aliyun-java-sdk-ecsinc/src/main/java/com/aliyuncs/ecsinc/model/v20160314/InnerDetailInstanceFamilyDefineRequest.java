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
public class InnerDetailInstanceFamilyDefineRequest extends RpcAcsRequest<InnerDetailInstanceFamilyDefineResponse> {
	
	public InnerDetailInstanceFamilyDefineRequest() {
		super("EcsInc", "2016-03-14", "InnerDetailInstanceFamilyDefine", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String lang;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> instanceTypeFamilys;

	private Long ownerId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
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

	public List<String> getInstanceTypeFamilys() {
		return this.instanceTypeFamilys;
	}

	public void setInstanceTypeFamilys(List<String> instanceTypeFamilys) {
		this.instanceTypeFamilys = instanceTypeFamilys;	
		if (instanceTypeFamilys != null) {
			for (int i = 0; i < instanceTypeFamilys.size(); i++) {
				putQueryParameter("InstanceTypeFamily." + (i + 1) , instanceTypeFamilys.get(i));
			}
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

	@Override
	public Class<InnerDetailInstanceFamilyDefineResponse> getResponseClass() {
		return InnerDetailInstanceFamilyDefineResponse.class;
	}

}
