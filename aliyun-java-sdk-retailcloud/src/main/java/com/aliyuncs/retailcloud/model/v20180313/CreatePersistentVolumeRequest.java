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
public class CreatePersistentVolumeRequest extends RpcAcsRequest<CreatePersistentVolumeResponse> {
	   

	private String reclaimPolicy;

	private String nFSVersion;

	private String accessModes;

	private String name;

	private String mountTargetDomain;

	private String mountDir;

	private String clusterInstanceId;

	private String capacity;

	private String storageClass;
	public CreatePersistentVolumeRequest() {
		super("retailcloud", "2018-03-13", "CreatePersistentVolume", "retailcloud");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReclaimPolicy() {
		return this.reclaimPolicy;
	}

	public void setReclaimPolicy(String reclaimPolicy) {
		this.reclaimPolicy = reclaimPolicy;
		if(reclaimPolicy != null){
			putBodyParameter("ReclaimPolicy", reclaimPolicy);
		}
	}

	public String getNFSVersion() {
		return this.nFSVersion;
	}

	public void setNFSVersion(String nFSVersion) {
		this.nFSVersion = nFSVersion;
		if(nFSVersion != null){
			putBodyParameter("NFSVersion", nFSVersion);
		}
	}

	public String getAccessModes() {
		return this.accessModes;
	}

	public void setAccessModes(String accessModes) {
		this.accessModes = accessModes;
		if(accessModes != null){
			putBodyParameter("AccessModes", accessModes);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public String getMountTargetDomain() {
		return this.mountTargetDomain;
	}

	public void setMountTargetDomain(String mountTargetDomain) {
		this.mountTargetDomain = mountTargetDomain;
		if(mountTargetDomain != null){
			putBodyParameter("MountTargetDomain", mountTargetDomain);
		}
	}

	public String getMountDir() {
		return this.mountDir;
	}

	public void setMountDir(String mountDir) {
		this.mountDir = mountDir;
		if(mountDir != null){
			putBodyParameter("MountDir", mountDir);
		}
	}

	public String getClusterInstanceId() {
		return this.clusterInstanceId;
	}

	public void setClusterInstanceId(String clusterInstanceId) {
		this.clusterInstanceId = clusterInstanceId;
		if(clusterInstanceId != null){
			putBodyParameter("ClusterInstanceId", clusterInstanceId);
		}
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
		if(capacity != null){
			putBodyParameter("Capacity", capacity);
		}
	}

	public String getStorageClass() {
		return this.storageClass;
	}

	public void setStorageClass(String storageClass) {
		this.storageClass = storageClass;
		if(storageClass != null){
			putBodyParameter("StorageClass", storageClass);
		}
	}

	@Override
	public Class<CreatePersistentVolumeResponse> getResponseClass() {
		return CreatePersistentVolumeResponse.class;
	}

}
