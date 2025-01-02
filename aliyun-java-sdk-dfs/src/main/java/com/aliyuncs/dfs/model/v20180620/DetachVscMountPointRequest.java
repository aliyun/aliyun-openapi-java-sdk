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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DetachVscMountPointRequest extends RpcAcsRequest<DetachVscMountPointResponse> {
	   

	private String description;

	private String inputRegionId;

	private String mountPointId;

	private String fileSystemId;

	@SerializedName("vscIds")
	private List<String> vscIds;

	private Boolean useAssumeRoleChkServerPerm;

	@SerializedName("instanceIds")
	private List<String> instanceIds;
	public DetachVscMountPointRequest() {
		super("DFS", "2018-06-20", "DetachVscMountPoint", "alidfs");
		setMethod(MethodType.POST);
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

	public String getInputRegionId() {
		return this.inputRegionId;
	}

	public void setInputRegionId(String inputRegionId) {
		this.inputRegionId = inputRegionId;
		if(inputRegionId != null){
			putQueryParameter("InputRegionId", inputRegionId);
		}
	}

	public String getMountPointId() {
		return this.mountPointId;
	}

	public void setMountPointId(String mountPointId) {
		this.mountPointId = mountPointId;
		if(mountPointId != null){
			putQueryParameter("MountPointId", mountPointId);
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

	public List<String> getVscIds() {
		return this.vscIds;
	}

	public void setVscIds(List<String> vscIds) {
		this.vscIds = vscIds;	
		if (vscIds != null) {
			putQueryParameter("VscIds" , new Gson().toJson(vscIds));
		}	
	}

	public Boolean getUseAssumeRoleChkServerPerm() {
		return this.useAssumeRoleChkServerPerm;
	}

	public void setUseAssumeRoleChkServerPerm(Boolean useAssumeRoleChkServerPerm) {
		this.useAssumeRoleChkServerPerm = useAssumeRoleChkServerPerm;
		if(useAssumeRoleChkServerPerm != null){
			putQueryParameter("UseAssumeRoleChkServerPerm", useAssumeRoleChkServerPerm.toString());
		}
	}

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			putQueryParameter("InstanceIds" , new Gson().toJson(instanceIds));
		}	
	}

	@Override
	public Class<DetachVscMountPointResponse> getResponseClass() {
		return DetachVscMountPointResponse.class;
	}

}
