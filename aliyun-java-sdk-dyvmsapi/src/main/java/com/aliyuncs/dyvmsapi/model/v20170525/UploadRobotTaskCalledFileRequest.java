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

package com.aliyuncs.dyvmsapi.model.v20170525;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadRobotTaskCalledFileRequest extends RpcAcsRequest<UploadRobotTaskCalledFileResponse> {
	   

	private Long resourceOwnerId;

	private String ttsParamHead;

	private String ttsParam;

	private String calledNumber;

	private Long id;

	private String resourceOwnerAccount;

	private Long ownerId;
	public UploadRobotTaskCalledFileRequest() {
		super("Dyvmsapi", "2017-05-25", "UploadRobotTaskCalledFile", "dyvms");
		setMethod(MethodType.POST);
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

	public String getTtsParamHead() {
		return this.ttsParamHead;
	}

	public void setTtsParamHead(String ttsParamHead) {
		this.ttsParamHead = ttsParamHead;
		if(ttsParamHead != null){
			putQueryParameter("TtsParamHead", ttsParamHead);
		}
	}

	public String getTtsParam() {
		return this.ttsParam;
	}

	public void setTtsParam(String ttsParam) {
		this.ttsParam = ttsParam;
		if(ttsParam != null){
			putQueryParameter("TtsParam", ttsParam);
		}
	}

	public String getCalledNumber() {
		return this.calledNumber;
	}

	public void setCalledNumber(String calledNumber) {
		this.calledNumber = calledNumber;
		if(calledNumber != null){
			putQueryParameter("CalledNumber", calledNumber);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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

	@Override
	public Class<UploadRobotTaskCalledFileResponse> getResponseClass() {
		return UploadRobotTaskCalledFileResponse.class;
	}

}
