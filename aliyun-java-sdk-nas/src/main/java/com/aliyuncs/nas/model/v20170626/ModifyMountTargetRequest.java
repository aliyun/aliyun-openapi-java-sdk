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
public class ModifyMountTargetRequest extends RpcAcsRequest<ModifyMountTargetResponse> {
	   

	private String fileSystemId;

	private String mountTargetDomain;

	private String accessGroupName;

	private String dualStackMountTargetDomain;

	private String status;
	public ModifyMountTargetRequest() {
		super("NAS", "2017-06-26", "ModifyMountTarget", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getMountTargetDomain() {
		return this.mountTargetDomain;
	}

	public void setMountTargetDomain(String mountTargetDomain) {
		this.mountTargetDomain = mountTargetDomain;
		if(mountTargetDomain != null){
			putQueryParameter("MountTargetDomain", mountTargetDomain);
		}
	}

	public String getAccessGroupName() {
		return this.accessGroupName;
	}

	public void setAccessGroupName(String accessGroupName) {
		this.accessGroupName = accessGroupName;
		if(accessGroupName != null){
			putQueryParameter("AccessGroupName", accessGroupName);
		}
	}

	public String getDualStackMountTargetDomain() {
		return this.dualStackMountTargetDomain;
	}

	public void setDualStackMountTargetDomain(String dualStackMountTargetDomain) {
		this.dualStackMountTargetDomain = dualStackMountTargetDomain;
		if(dualStackMountTargetDomain != null){
			putQueryParameter("DualStackMountTargetDomain", dualStackMountTargetDomain);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ModifyMountTargetResponse> getResponseClass() {
		return ModifyMountTargetResponse.class;
	}

}
