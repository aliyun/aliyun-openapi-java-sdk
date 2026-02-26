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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateStorageVolumeRequest extends RpcAcsRequest<CreateStorageVolumeResponse> {
	   

	private String ensRegionId;

	private String gatewayId;

	private String authUser;

	private String volumeName;

	private String authPassword;

	private String authProtocol;

	private String description;

	private String isEnable;

	private String isAuth;

	private String storageId;
	public CreateStorageVolumeRequest() {
		super("Ens", "2017-11-10", "CreateStorageVolume", "ens");
		setMethod(MethodType.POST);
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	public String getAuthUser() {
		return this.authUser;
	}

	public void setAuthUser(String authUser) {
		this.authUser = authUser;
		if(authUser != null){
			putQueryParameter("AuthUser", authUser);
		}
	}

	public String getVolumeName() {
		return this.volumeName;
	}

	public void setVolumeName(String volumeName) {
		this.volumeName = volumeName;
		if(volumeName != null){
			putQueryParameter("VolumeName", volumeName);
		}
	}

	public String getAuthPassword() {
		return this.authPassword;
	}

	public void setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
		if(authPassword != null){
			putQueryParameter("AuthPassword", authPassword);
		}
	}

	public String getAuthProtocol() {
		return this.authProtocol;
	}

	public void setAuthProtocol(String authProtocol) {
		this.authProtocol = authProtocol;
		if(authProtocol != null){
			putQueryParameter("AuthProtocol", authProtocol);
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

	public String getIsEnable() {
		return this.isEnable;
	}

	public void setIsEnable(String isEnable) {
		this.isEnable = isEnable;
		if(isEnable != null){
			putQueryParameter("IsEnable", isEnable);
		}
	}

	public String getIsAuth() {
		return this.isAuth;
	}

	public void setIsAuth(String isAuth) {
		this.isAuth = isAuth;
		if(isAuth != null){
			putQueryParameter("IsAuth", isAuth);
		}
	}

	public String getStorageId() {
		return this.storageId;
	}

	public void setStorageId(String storageId) {
		this.storageId = storageId;
		if(storageId != null){
			putQueryParameter("StorageId", storageId);
		}
	}

	@Override
	public Class<CreateStorageVolumeResponse> getResponseClass() {
		return CreateStorageVolumeResponse.class;
	}

}
