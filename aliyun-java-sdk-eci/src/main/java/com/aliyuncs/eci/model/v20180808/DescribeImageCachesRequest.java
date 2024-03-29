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

package com.aliyuncs.eci.model.v20180808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

import java.util.List;

/**
 * @author xiaohui
 * @version 1.2.9
 */
public class DescribeImageCachesRequest extends RpcAcsRequest<DescribeImageCachesResponse> {

	public DescribeImageCachesRequest() {
		super("Eci", "2018-08-08", "DescribeImageCaches", "eci");
	}

	private String imageCacheId;

	private Long resourceOwnerId;

	private String snapshotId;

	private String imageCacheName;

	private String image;

	private List<Tag> tags;

	private List<String> matchImages;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String resourceGroupId;

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if (resourceGroupId != null) {
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getImageCacheId() {
		return this.imageCacheId;
	}

	public void setImageCacheId(String imageCacheId) {
		this.imageCacheId = imageCacheId;
		if(imageCacheId != null){
			putQueryParameter("ImageCacheId", imageCacheId);
		}
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public String getImageCacheName() {
		return this.imageCacheName;
	}

	public void setImageCacheName(String imageCacheName) {
		this.imageCacheName = imageCacheName;
		if(imageCacheName != null){
			putQueryParameter("ImageCacheName", imageCacheName);
		}
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
		if(image != null){
			putQueryParameter("Image", image);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}
	}

	public List<String> getMatchImages() {
		return this.matchImages;
	}

	public void setMatchImages(List<String> matchImages) {
		this.matchImages = matchImages;
		if(matchImages != null) {
			for (int i = 0; i < matchImages.size(); i++) {
				putQueryParameter("MatchImage." + (i+1), matchImages.get(i));
			}
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
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
	public Class<DescribeImageCachesResponse> getResponseClass() {
		return DescribeImageCachesResponse.class;
	}

}
