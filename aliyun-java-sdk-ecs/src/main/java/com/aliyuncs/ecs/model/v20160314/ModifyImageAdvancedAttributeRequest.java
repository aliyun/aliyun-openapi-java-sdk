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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyImageAdvancedAttributeRequest extends RpcAcsRequest<ModifyImageAdvancedAttributeResponse> {
	   

	private Long resourceOwnerId;

	private String imageId;

	private List<Flag> flag;

	private String supportIoOptimized;

	private String resourceOwnerAccount;

	private Long ownerId;
	public ModifyImageAdvancedAttributeRequest() {
		super("Ecs", "2016-03-14", "ModifyImageAdvancedAttribute", "ecs");
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

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public List<Flag> getFlag() {
		return this.flag;
	}

	public void setFlag(List<Flag> flag) {
		this.flag = flag;	
		if (flag != null) {
			for (int depth1 = 0; depth1 < flag.size(); depth1++) {
				if (flag.get(depth1) != null) {
					
						putQueryParameter("Flag." + (depth1 + 1) + ".Name" , flag.get(depth1).getName());
						putQueryParameter("Flag." + (depth1 + 1) + ".Value" , flag.get(depth1).getValue());
				}
			}
		}	
	}

	public String getSupportIoOptimized() {
		return this.supportIoOptimized;
	}

	public void setSupportIoOptimized(String supportIoOptimized) {
		this.supportIoOptimized = supportIoOptimized;
		if(supportIoOptimized != null){
			putQueryParameter("SupportIoOptimized", supportIoOptimized);
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

	public static class Flag {

		private String name;

		private Boolean value;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getValue() {
			return this.value;
		}

		public void setValue(Boolean value) {
			this.value = value;
		}
	}

	@Override
	public Class<ModifyImageAdvancedAttributeResponse> getResponseClass() {
		return ModifyImageAdvancedAttributeResponse.class;
	}

}
