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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceRequest extends RpcAcsRequest<ModifyInstanceResponse> {
	
	public ModifyInstanceRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyInstance", "CloudCallCenter", "innerAPI");
	}

	private String bucket;

	private String instanceId;

	private String description;

	private Integer storageMaxDays;

	private Integer storageMaxSize;

	public String getBucket() {
		return this.bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
		if(bucket != null){
			putQueryParameter("Bucket", bucket);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public Integer getStorageMaxDays() {
		return this.storageMaxDays;
	}

	public void setStorageMaxDays(Integer storageMaxDays) {
		this.storageMaxDays = storageMaxDays;
		if(storageMaxDays != null){
			putQueryParameter("StorageMaxDays", storageMaxDays.toString());
		}
	}

	public Integer getStorageMaxSize() {
		return this.storageMaxSize;
	}

	public void setStorageMaxSize(Integer storageMaxSize) {
		this.storageMaxSize = storageMaxSize;
		if(storageMaxSize != null){
			putQueryParameter("StorageMaxSize", storageMaxSize.toString());
		}
	}

	@Override
	public Class<ModifyInstanceResponse> getResponseClass() {
		return ModifyInstanceResponse.class;
	}

}
