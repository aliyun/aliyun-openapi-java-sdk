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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyTagWithUuidRequest extends RpcAcsRequest<ModifyTagWithUuidResponse> {
	   

	private String tagId;

	private String machineTypes;

	private String tagList;

	private String uuidList;
	public ModifyTagWithUuidRequest() {
		super("Sas", "2018-12-03", "ModifyTagWithUuid", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putQueryParameter("TagId", tagId);
		}
	}

	public String getMachineTypes() {
		return this.machineTypes;
	}

	public void setMachineTypes(String machineTypes) {
		this.machineTypes = machineTypes;
		if(machineTypes != null){
			putQueryParameter("MachineTypes", machineTypes);
		}
	}

	public String getTagList() {
		return this.tagList;
	}

	public void setTagList(String tagList) {
		this.tagList = tagList;
		if(tagList != null){
			putQueryParameter("TagList", tagList);
		}
	}

	public String getUuidList() {
		return this.uuidList;
	}

	public void setUuidList(String uuidList) {
		this.uuidList = uuidList;
		if(uuidList != null){
			putQueryParameter("UuidList", uuidList);
		}
	}

	@Override
	public Class<ModifyTagWithUuidResponse> getResponseClass() {
		return ModifyTagWithUuidResponse.class;
	}

}
