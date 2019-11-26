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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRobotv2DialogRelRequest extends RpcAcsRequest<UpdateRobotv2DialogRelResponse> {
	   

	private Long resourceOwnerId;

	private Boolean isChanged;

	private String voiceCode;

	private String fileId;

	private String voiceFile;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private Long dialogId;

	private Long subDialogId;

	private Long voiceId;

	private String voiceType;
	public UpdateRobotv2DialogRelRequest() {
		super("Dyvms", "2017-06-20", "UpdateRobotv2DialogRel", "dyvms");
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

	public Boolean getIsChanged() {
		return this.isChanged;
	}

	public void setIsChanged(Boolean isChanged) {
		this.isChanged = isChanged;
		if(isChanged != null){
			putQueryParameter("IsChanged", isChanged.toString());
		}
	}

	public String getVoiceCode() {
		return this.voiceCode;
	}

	public void setVoiceCode(String voiceCode) {
		this.voiceCode = voiceCode;
		if(voiceCode != null){
			putQueryParameter("VoiceCode", voiceCode);
		}
	}

	public String getFileId() {
		return this.fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
		if(fileId != null){
			putQueryParameter("FileId", fileId);
		}
	}

	public String getVoiceFile() {
		return this.voiceFile;
	}

	public void setVoiceFile(String voiceFile) {
		this.voiceFile = voiceFile;
		if(voiceFile != null){
			putQueryParameter("VoiceFile", voiceFile);
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

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
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

	public Long getDialogId() {
		return this.dialogId;
	}

	public void setDialogId(Long dialogId) {
		this.dialogId = dialogId;
		if(dialogId != null){
			putQueryParameter("DialogId", dialogId.toString());
		}
	}

	public Long getSubDialogId() {
		return this.subDialogId;
	}

	public void setSubDialogId(Long subDialogId) {
		this.subDialogId = subDialogId;
		if(subDialogId != null){
			putQueryParameter("SubDialogId", subDialogId.toString());
		}
	}

	public Long getVoiceId() {
		return this.voiceId;
	}

	public void setVoiceId(Long voiceId) {
		this.voiceId = voiceId;
		if(voiceId != null){
			putQueryParameter("VoiceId", voiceId.toString());
		}
	}

	public String getVoiceType() {
		return this.voiceType;
	}

	public void setVoiceType(String voiceType) {
		this.voiceType = voiceType;
		if(voiceType != null){
			putQueryParameter("VoiceType", voiceType);
		}
	}

	@Override
	public Class<UpdateRobotv2DialogRelResponse> getResponseClass() {
		return UpdateRobotv2DialogRelResponse.class;
	}

}
