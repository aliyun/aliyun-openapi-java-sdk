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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagVbrRelationsRequest extends RpcAcsRequest<DescribeSagVbrRelationsResponse> {
	   

	private Long resourceOwnerId;

	private List<String> vbrInstanceIdss;

	private String vbrRegionId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public DescribeSagVbrRelationsRequest() {
		super("Smartag", "2018-03-13", "DescribeSagVbrRelations", "smartag");
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

	public List<String> getVbrInstanceIdss() {
		return this.vbrInstanceIdss;
	}

	public void setVbrInstanceIdss(List<String> vbrInstanceIdss) {
		this.vbrInstanceIdss = vbrInstanceIdss;	
		if (vbrInstanceIdss != null) {
			for (int i = 0; i < vbrInstanceIdss.size(); i++) {
				putQueryParameter("VbrInstanceIds." + (i + 1) , vbrInstanceIdss.get(i));
			}
		}	
	}

	public String getVbrRegionId() {
		return this.vbrRegionId;
	}

	public void setVbrRegionId(String vbrRegionId) {
		this.vbrRegionId = vbrRegionId;
		if(vbrRegionId != null){
			putQueryParameter("VbrRegionId", vbrRegionId);
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

	@Override
	public Class<DescribeSagVbrRelationsResponse> getResponseClass() {
		return DescribeSagVbrRelationsResponse.class;
	}

}
