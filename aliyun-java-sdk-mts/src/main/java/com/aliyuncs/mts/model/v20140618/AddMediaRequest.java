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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddMediaRequest extends RpcAcsRequest<AddMediaResponse> {
	   

	private Long resourceOwnerId;

	private String description;

	private String title;

	private Boolean inputUnbind;

	private String coverURL;

	private Long cateId;

	private String mediaWorkflowId;

	private String mediaWorkflowUserData;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String overrideParams;

	private Long ownerId;

	private String tags;

	private String fileURL;
	public AddMediaRequest() {
		super("Mts", "2014-06-18", "AddMedia", "mts");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public Boolean getInputUnbind() {
		return this.inputUnbind;
	}

	public void setInputUnbind(Boolean inputUnbind) {
		this.inputUnbind = inputUnbind;
		if(inputUnbind != null){
			putQueryParameter("InputUnbind", inputUnbind.toString());
		}
	}

	public String getCoverURL() {
		return this.coverURL;
	}

	public void setCoverURL(String coverURL) {
		this.coverURL = coverURL;
		if(coverURL != null){
			putQueryParameter("CoverURL", coverURL);
		}
	}

	public Long getCateId() {
		return this.cateId;
	}

	public void setCateId(Long cateId) {
		this.cateId = cateId;
		if(cateId != null){
			putQueryParameter("CateId", cateId.toString());
		}
	}

	public String getMediaWorkflowId() {
		return this.mediaWorkflowId;
	}

	public void setMediaWorkflowId(String mediaWorkflowId) {
		this.mediaWorkflowId = mediaWorkflowId;
		if(mediaWorkflowId != null){
			putQueryParameter("MediaWorkflowId", mediaWorkflowId);
		}
	}

	public String getMediaWorkflowUserData() {
		return this.mediaWorkflowUserData;
	}

	public void setMediaWorkflowUserData(String mediaWorkflowUserData) {
		this.mediaWorkflowUserData = mediaWorkflowUserData;
		if(mediaWorkflowUserData != null){
			putQueryParameter("MediaWorkflowUserData", mediaWorkflowUserData);
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

	public String getOverrideParams() {
		return this.overrideParams;
	}

	public void setOverrideParams(String overrideParams) {
		this.overrideParams = overrideParams;
		if(overrideParams != null){
			putQueryParameter("OverrideParams", overrideParams);
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

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getFileURL() {
		return this.fileURL;
	}

	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
		if(fileURL != null){
			putQueryParameter("FileURL", fileURL);
		}
	}

	@Override
	public Class<AddMediaResponse> getResponseClass() {
		return AddMediaResponse.class;
	}

}
