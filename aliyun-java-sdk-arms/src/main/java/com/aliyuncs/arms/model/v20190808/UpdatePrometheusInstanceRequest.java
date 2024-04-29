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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdatePrometheusInstanceRequest extends RpcAcsRequest<UpdatePrometheusInstanceResponse> {
	   

	private String clusterId;

	private String resourceGroupId;

	private Integer storageDuration;

	private Integer archiveDuration;
	public UpdatePrometheusInstanceRequest() {
		super("ARMS", "2019-08-08", "UpdatePrometheusInstance", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
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

	public Integer getStorageDuration() {
		return this.storageDuration;
	}

	public void setStorageDuration(Integer storageDuration) {
		this.storageDuration = storageDuration;
		if(storageDuration != null){
			putQueryParameter("StorageDuration", storageDuration.toString());
		}
	}

	public Integer getArchiveDuration() {
		return this.archiveDuration;
	}

	public void setArchiveDuration(Integer archiveDuration) {
		this.archiveDuration = archiveDuration;
		if(archiveDuration != null){
			putQueryParameter("ArchiveDuration", archiveDuration.toString());
		}
	}

	@Override
	public Class<UpdatePrometheusInstanceResponse> getResponseClass() {
		return UpdatePrometheusInstanceResponse.class;
	}

}
