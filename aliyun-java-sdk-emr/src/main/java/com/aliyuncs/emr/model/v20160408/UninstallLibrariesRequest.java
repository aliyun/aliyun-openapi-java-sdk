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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UninstallLibrariesRequest extends RpcAcsRequest<UninstallLibrariesResponse> {
	   

	private Long resourceOwnerId;

	private String libraryBizId;

	private List<String> clusterBizIdLists;
	public UninstallLibrariesRequest() {
		super("Emr", "2016-04-08", "UninstallLibraries");
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

	public String getLibraryBizId() {
		return this.libraryBizId;
	}

	public void setLibraryBizId(String libraryBizId) {
		this.libraryBizId = libraryBizId;
		if(libraryBizId != null){
			putQueryParameter("LibraryBizId", libraryBizId);
		}
	}

	public List<String> getClusterBizIdLists() {
		return this.clusterBizIdLists;
	}

	public void setClusterBizIdLists(List<String> clusterBizIdLists) {
		this.clusterBizIdLists = clusterBizIdLists;	
		if (clusterBizIdLists != null) {
			for (int i = 0; i < clusterBizIdLists.size(); i++) {
				putQueryParameter("ClusterBizIdList." + (i + 1) , clusterBizIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<UninstallLibrariesResponse> getResponseClass() {
		return UninstallLibrariesResponse.class;
	}

}
