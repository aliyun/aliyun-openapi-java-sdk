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
public class CreateAccessPointRequest extends RpcAcsRequest<CreateAccessPointResponse> {
	   

	private String vswId;

	private String accessPointName;

	private Integer posixGroupId;

	private String posixSecondaryGroupIds;

	private String fileSystemId;

	private Integer ownerGroupId;

	private Boolean enabledRam;

	private Integer ownerUserId;

	private String permission;

	private String vpcId;

	private String rootDirectory;

	private String accessGroup;

	private Integer posixUserId;
	public CreateAccessPointRequest() {
		super("NAS", "2017-06-26", "CreateAccessPoint", "nas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getVswId() {
		return this.vswId;
	}

	public void setVswId(String vswId) {
		this.vswId = vswId;
		if(vswId != null){
			putQueryParameter("VswId", vswId);
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

	public Integer getPosixGroupId() {
		return this.posixGroupId;
	}

	public void setPosixGroupId(Integer posixGroupId) {
		this.posixGroupId = posixGroupId;
		if(posixGroupId != null){
			putQueryParameter("PosixGroupId", posixGroupId.toString());
		}
	}

	public String getPosixSecondaryGroupIds() {
		return this.posixSecondaryGroupIds;
	}

	public void setPosixSecondaryGroupIds(String posixSecondaryGroupIds) {
		this.posixSecondaryGroupIds = posixSecondaryGroupIds;
		if(posixSecondaryGroupIds != null){
			putQueryParameter("PosixSecondaryGroupIds", posixSecondaryGroupIds);
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

	public Integer getOwnerGroupId() {
		return this.ownerGroupId;
	}

	public void setOwnerGroupId(Integer ownerGroupId) {
		this.ownerGroupId = ownerGroupId;
		if(ownerGroupId != null){
			putQueryParameter("OwnerGroupId", ownerGroupId.toString());
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

	public Integer getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setOwnerUserId(Integer ownerUserId) {
		this.ownerUserId = ownerUserId;
		if(ownerUserId != null){
			putQueryParameter("OwnerUserId", ownerUserId.toString());
		}
	}

	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
		if(permission != null){
			putQueryParameter("Permission", permission);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getRootDirectory() {
		return this.rootDirectory;
	}

	public void setRootDirectory(String rootDirectory) {
		this.rootDirectory = rootDirectory;
		if(rootDirectory != null){
			putQueryParameter("RootDirectory", rootDirectory);
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

	public Integer getPosixUserId() {
		return this.posixUserId;
	}

	public void setPosixUserId(Integer posixUserId) {
		this.posixUserId = posixUserId;
		if(posixUserId != null){
			putQueryParameter("PosixUserId", posixUserId.toString());
		}
	}

	@Override
	public Class<CreateAccessPointResponse> getResponseClass() {
		return CreateAccessPointResponse.class;
	}

}
