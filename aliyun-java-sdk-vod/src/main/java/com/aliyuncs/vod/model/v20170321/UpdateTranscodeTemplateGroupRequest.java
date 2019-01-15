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
public class UpdateTranscodeTemplateGroupRequest extends RpcAcsRequest<UpdateTranscodeTemplateGroupResponse> {
	
	public UpdateTranscodeTemplateGroupRequest() {
		super("vod", "2017-03-21", "UpdateTranscodeTemplateGroup", "vod");
	}

	private String transcodeTemplateList;

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String name;

	private Long resourceRealOwnerId;

	private Long ownerId;

	private String locked;

	private String transcodeTemplateGroupId;

	public String getTranscodeTemplateList() {
		return this.transcodeTemplateList;
	}

	public void setTranscodeTemplateList(String transcodeTemplateList) {
		this.transcodeTemplateList = transcodeTemplateList;
		if(transcodeTemplateList != null){
			putQueryParameter("TranscodeTemplateList", transcodeTemplateList);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getResourceRealOwnerId() {
		return this.resourceRealOwnerId;
	}

	public void setResourceRealOwnerId(Long resourceRealOwnerId) {
		this.resourceRealOwnerId = resourceRealOwnerId;
		if(resourceRealOwnerId != null){
			putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId.toString());
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

	public String getLocked() {
		return this.locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
		if(locked != null){
			putQueryParameter("Locked", locked);
		}
	}

	public String getTranscodeTemplateGroupId() {
		return this.transcodeTemplateGroupId;
	}

	public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
		this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		if(transcodeTemplateGroupId != null){
			putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
		}
	}

	@Override
	public Class<UpdateTranscodeTemplateGroupResponse> getResponseClass() {
		return UpdateTranscodeTemplateGroupResponse.class;
	}

}
