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
public class DeleteLibrariesRequest extends RpcAcsRequest<DeleteLibrariesResponse> {
	   

	private Long resourceOwnerId;

	private List<String> libraryBizIdLists;
	public DeleteLibrariesRequest() {
		super("Emr", "2016-04-08", "DeleteLibraries");
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

	public List<String> getLibraryBizIdLists() {
		return this.libraryBizIdLists;
	}

	public void setLibraryBizIdLists(List<String> libraryBizIdLists) {
		this.libraryBizIdLists = libraryBizIdLists;	
		if (libraryBizIdLists != null) {
			for (int i = 0; i < libraryBizIdLists.size(); i++) {
				putQueryParameter("LibraryBizIdList." + (i + 1) , libraryBizIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteLibrariesResponse> getResponseClass() {
		return DeleteLibrariesResponse.class;
	}

}
