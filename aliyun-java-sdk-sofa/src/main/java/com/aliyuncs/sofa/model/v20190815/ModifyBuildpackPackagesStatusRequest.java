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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyBuildpackPackagesStatusRequest extends RpcAcsRequest<ModifyBuildpackPackagesStatusResponse> {
	   

	private List<String> regionNumRepeatLists;

	private String id;

	private String newFileStatus;

	private String originalFileStatus;
	public ModifyBuildpackPackagesStatusRequest() {
		super("SOFA", "2019-08-15", "ModifyBuildpackPackagesStatus", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getRegionNumRepeatLists() {
		return this.regionNumRepeatLists;
	}

	public void setRegionNumRepeatLists(List<String> regionNumRepeatLists) {
		this.regionNumRepeatLists = regionNumRepeatLists;	
		if (regionNumRepeatLists != null) {
			for (int i = 0; i < regionNumRepeatLists.size(); i++) {
				putBodyParameter("RegionNumRepeatList." + (i + 1) , regionNumRepeatLists.get(i));
			}
		}	
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getNewFileStatus() {
		return this.newFileStatus;
	}

	public void setNewFileStatus(String newFileStatus) {
		this.newFileStatus = newFileStatus;
		if(newFileStatus != null){
			putBodyParameter("NewFileStatus", newFileStatus);
		}
	}

	public String getOriginalFileStatus() {
		return this.originalFileStatus;
	}

	public void setOriginalFileStatus(String originalFileStatus) {
		this.originalFileStatus = originalFileStatus;
		if(originalFileStatus != null){
			putBodyParameter("OriginalFileStatus", originalFileStatus);
		}
	}

	@Override
	public Class<ModifyBuildpackPackagesStatusResponse> getResponseClass() {
		return ModifyBuildpackPackagesStatusResponse.class;
	}

}
