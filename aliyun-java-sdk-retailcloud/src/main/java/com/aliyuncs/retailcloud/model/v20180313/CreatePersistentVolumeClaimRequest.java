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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreatePersistentVolumeClaimRequest extends RpcAcsRequest<CreatePersistentVolumeClaimResponse> {
	   

	private String accessModes;

	private Long appId;

	private String name;

	private Long envId;

	private String storageClass;

	private String capacity;
	public CreatePersistentVolumeClaimRequest() {
		super("retailcloud", "2018-03-13", "CreatePersistentVolumeClaim", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccessModes() {
		return this.accessModes;
	}

	public void setAccessModes(String accessModes) {
		this.accessModes = accessModes;
		if(accessModes != null){
			putQueryParameter("AccessModes", accessModes);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
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

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public String getStorageClass() {
		return this.storageClass;
	}

	public void setStorageClass(String storageClass) {
		this.storageClass = storageClass;
		if(storageClass != null){
			putQueryParameter("StorageClass", storageClass);
		}
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
		if(capacity != null){
			putQueryParameter("Capacity", capacity);
		}
	}

	@Override
	public Class<CreatePersistentVolumeClaimResponse> getResponseClass() {
		return CreatePersistentVolumeClaimResponse.class;
	}

}
