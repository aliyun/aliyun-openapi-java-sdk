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
public class CopySystemImageRequest extends RpcAcsRequest<CopySystemImageResponse> {
	
	public CopySystemImageRequest() {
		super("EcsInc", "2016-03-14", "CopySystemImage", "ecs", "innerAPI");
	}

	private Long transitId;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String toImageName;

	private String ownerAccount;

	private List<String> toRegionNoLists;

	private String toImageDesc;

	private List<Tag> tags;

	private Long ownerId;

	public Long getTransitId() {
		return this.transitId;
	}

	public void setTransitId(Long transitId) {
		this.transitId = transitId;
		if(transitId != null){
			putQueryParameter("TransitId", transitId.toString());
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

	public String getToImageName() {
		return this.toImageName;
	}

	public void setToImageName(String toImageName) {
		this.toImageName = toImageName;
		if(toImageName != null){
			putQueryParameter("ToImageName", toImageName);
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

	public List<String> getToRegionNoLists() {
		return this.toRegionNoLists;
	}

	public void setToRegionNoLists(List<String> toRegionNoLists) {
		this.toRegionNoLists = toRegionNoLists;	
		if (toRegionNoLists != null) {
			for (int i = 0; i < toRegionNoLists.size(); i++) {
				putQueryParameter("ToRegionNoList." + (i + 1) , toRegionNoLists.get(i));
			}
		}	
	}

	public String getToImageDesc() {
		return this.toImageDesc;
	}

	public void setToImageDesc(String toImageDesc) {
		this.toImageDesc = toImageDesc;
		if(toImageDesc != null){
			putQueryParameter("ToImageDesc", toImageDesc);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
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

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CopySystemImageResponse> getResponseClass() {
		return CopySystemImageResponse.class;
	}

}
