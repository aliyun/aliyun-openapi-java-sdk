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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyAccessPointRequest extends RpcAcsRequest<ModifyAccessPointResponse> {
	   

	private String accessPointId;

	private String accessPointName;

	private String fileSystemId;

	private Boolean enabledRam;

	private String accessGroup;
	public ModifyAccessPointRequest() {
		super("NAS", "2017-06-26", "ModifyAccessPoint", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccessPointId() {
		return this.accessPointId;
	}

	public void setAccessPointId(String accessPointId) {
		this.accessPointId = accessPointId;
		if(accessPointId != null){
			putQueryParameter("AccessPointId", accessPointId);
		}
	}

	public String getAccessPointName() {
		return this.accessPointName;
	}

	public void setAccessPointName(String accessPointName) {
		this.accessPointName = accessPointName;
		if(accessPointName != null){
			putQueryParameter("AccessPointName", accessPointName);
		}
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public Boolean getEnabledRam() {
		return this.enabledRam;
	}

	public void setEnabledRam(Boolean enabledRam) {
		this.enabledRam = enabledRam;
		if(enabledRam != null){
			putQueryParameter("EnabledRam", enabledRam.toString());
		}
	}

	public String getAccessGroup() {
		return this.accessGroup;
	}

	public void setAccessGroup(String accessGroup) {
		this.accessGroup = accessGroup;
		if(accessGroup != null){
			putQueryParameter("AccessGroup", accessGroup);
		}
	}

	@Override
	public Class<ModifyAccessPointResponse> getResponseClass() {
		return ModifyAccessPointResponse.class;
	}

}
