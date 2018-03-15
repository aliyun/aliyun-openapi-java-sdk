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

package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UploadServerCertificateRequest extends RpcAcsRequest<UploadServerCertificateResponse> {
	
	public UploadServerCertificateRequest() {
		super("Slb", "2014-05-15", "UploadServerCertificate", "slb");
	}

	private String access_key_id;

	private Long resourceOwnerId;

	private String serverCertificate;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String aliCloudCertificateName;

	private String aliCloudCertificateId;

	private Long ownerId;

	private String tags;

	private String privateKey;

	private String resourceGroupId;

	private String serverCertificateName;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
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

	public String getServerCertificate() {
		return this.serverCertificate;
	}

	public void setServerCertificate(String serverCertificate) {
		this.serverCertificate = serverCertificate;
		if(serverCertificate != null){
			putQueryParameter("ServerCertificate", serverCertificate);
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

	public String getAliCloudCertificateName() {
		return this.aliCloudCertificateName;
	}

	public void setAliCloudCertificateName(String aliCloudCertificateName) {
		this.aliCloudCertificateName = aliCloudCertificateName;
		if(aliCloudCertificateName != null){
			putQueryParameter("AliCloudCertificateName", aliCloudCertificateName);
		}
	}

	public String getAliCloudCertificateId() {
		return this.aliCloudCertificateId;
	}

	public void setAliCloudCertificateId(String aliCloudCertificateId) {
		this.aliCloudCertificateId = aliCloudCertificateId;
		if(aliCloudCertificateId != null){
			putQueryParameter("AliCloudCertificateId", aliCloudCertificateId);
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

	public String getPrivateKey() {
		return this.privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
		if(privateKey != null){
			putQueryParameter("PrivateKey", privateKey);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getServerCertificateName() {
		return this.serverCertificateName;
	}

	public void setServerCertificateName(String serverCertificateName) {
		this.serverCertificateName = serverCertificateName;
		if(serverCertificateName != null){
			putQueryParameter("ServerCertificateName", serverCertificateName);
		}
	}

	@Override
	public Class<UploadServerCertificateResponse> getResponseClass() {
		return UploadServerCertificateResponse.class;
	}

}
