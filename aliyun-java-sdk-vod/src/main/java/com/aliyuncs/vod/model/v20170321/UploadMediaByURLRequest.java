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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UploadMediaByURLRequest extends RpcAcsRequest<UploadMediaByURLResponse> {
	
	public UploadMediaByURLRequest() {
		super("vod", "2017-03-21", "UploadMediaByURL", "vod");
	}

	private String userData;

	private Long resourceOwnerId;

	private String templateGroupId;

	private String uploadMetadatas;

	private String resourceOwnerAccount;

	private String uploadURLs;

	private String appId;

	private String messageCallback;

	private Long ownerId;

	private String priority;

	private String storageLocation;

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
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

	public String getTemplateGroupId() {
		return this.templateGroupId;
	}

	public void setTemplateGroupId(String templateGroupId) {
		this.templateGroupId = templateGroupId;
		if(templateGroupId != null){
			putQueryParameter("TemplateGroupId", templateGroupId);
		}
	}

	public String getUploadMetadatas() {
		return this.uploadMetadatas;
	}

	public void setUploadMetadatas(String uploadMetadatas) {
		this.uploadMetadatas = uploadMetadatas;
		if(uploadMetadatas != null){
			putQueryParameter("UploadMetadatas", uploadMetadatas);
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

	public String getUploadURLs() {
		return this.uploadURLs;
	}

	public void setUploadURLs(String uploadURLs) {
		this.uploadURLs = uploadURLs;
		if(uploadURLs != null){
			putQueryParameter("UploadURLs", uploadURLs);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getMessageCallback() {
		return this.messageCallback;
	}

	public void setMessageCallback(String messageCallback) {
		this.messageCallback = messageCallback;
		if(messageCallback != null){
			putQueryParameter("MessageCallback", messageCallback);
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

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority);
		}
	}

	public String getStorageLocation() {
		return this.storageLocation;
	}

	public void setStorageLocation(String storageLocation) {
		this.storageLocation = storageLocation;
		if(storageLocation != null){
			putQueryParameter("StorageLocation", storageLocation);
		}
	}

	@Override
	public Class<UploadMediaByURLResponse> getResponseClass() {
		return UploadMediaByURLResponse.class;
	}

}
