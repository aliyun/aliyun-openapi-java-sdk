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
public class CreateVoiceFileRequest extends RpcAcsRequest<CreateVoiceFileResponse> {
	   

	private Long resourceOwnerId;

	private Long localFileId;

	private String ossFileName;

	private String reDoId;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private String uploadFilePath;

	private String tmpOssPath;

	private String prodType;
	public CreateVoiceFileRequest() {
		super("Dyvms", "2017-06-20", "CreateVoiceFile", "dyvms");
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

	public Long getLocalFileId() {
		return this.localFileId;
	}

	public void setLocalFileId(Long localFileId) {
		this.localFileId = localFileId;
		if(localFileId != null){
			putQueryParameter("LocalFileId", localFileId.toString());
		}
	}

	public String getOssFileName() {
		return this.ossFileName;
	}

	public void setOssFileName(String ossFileName) {
		this.ossFileName = ossFileName;
		if(ossFileName != null){
			putQueryParameter("OssFileName", ossFileName);
		}
	}

	public String getReDoId() {
		return this.reDoId;
	}

	public void setReDoId(String reDoId) {
		this.reDoId = reDoId;
		if(reDoId != null){
			putQueryParameter("ReDoId", reDoId);
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

	public String getUploadFilePath() {
		return this.uploadFilePath;
	}

	public void setUploadFilePath(String uploadFilePath) {
		this.uploadFilePath = uploadFilePath;
		if(uploadFilePath != null){
			putQueryParameter("UploadFilePath", uploadFilePath);
		}
	}

	public String getTmpOssPath() {
		return this.tmpOssPath;
	}

	public void setTmpOssPath(String tmpOssPath) {
		this.tmpOssPath = tmpOssPath;
		if(tmpOssPath != null){
			putQueryParameter("TmpOssPath", tmpOssPath);
		}
	}

	public String getProdType() {
		return this.prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
		if(prodType != null){
			putQueryParameter("ProdType", prodType);
		}
	}

	@Override
	public Class<CreateVoiceFileResponse> getResponseClass() {
		return CreateVoiceFileResponse.class;
	}

}
