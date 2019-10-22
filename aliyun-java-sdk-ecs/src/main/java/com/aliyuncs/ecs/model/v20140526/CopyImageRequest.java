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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CopyImageRequest extends RpcAcsRequest<CopyImageResponse> {
	   

	private Long resourceOwnerId;

	private String imageId;

	private String destinationRegionId;

	private List<Tag> tags;

	private String resourceOwnerAccount;

	private String destinationImageName;

	private String ownerAccount;

	private Long ownerId;

	private Boolean encrypted;

	private String kMSKeyId;

	private String destinationDescription;
	public CopyImageRequest() {
		super("Ecs", "2014-05-26", "CopyImage", "ecs");
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

	public String getDestinationRegionId() {
		return this.destinationRegionId;
	}

	public void setDestinationRegionId(String destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
		if(destinationRegionId != null){
			putQueryParameter("DestinationRegionId", destinationRegionId);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getDestinationImageName() {
		return this.destinationImageName;
	}

	public void setDestinationImageName(String destinationImageName) {
		this.destinationImageName = destinationImageName;
		if(destinationImageName != null){
			putQueryParameter("DestinationImageName", destinationImageName);
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

	public Boolean getEncrypted() {
		return this.encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
		if(encrypted != null){
			putQueryParameter("Encrypted", encrypted.toString());
		}
	}

	public String getKMSKeyId() {
		return this.kMSKeyId;
	}

	public void setKMSKeyId(String kMSKeyId) {
		this.kMSKeyId = kMSKeyId;
		if(kMSKeyId != null){
			putQueryParameter("KMSKeyId", kMSKeyId);
		}
	}

	public String getDestinationDescription() {
		return this.destinationDescription;
	}

	public void setDestinationDescription(String destinationDescription) {
		this.destinationDescription = destinationDescription;
		if(destinationDescription != null){
			putQueryParameter("DestinationDescription", destinationDescription);
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
	public Class<CopyImageResponse> getResponseClass() {
		return CopyImageResponse.class;
	}

}
