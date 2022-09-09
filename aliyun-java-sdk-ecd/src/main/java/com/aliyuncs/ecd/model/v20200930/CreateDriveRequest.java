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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDriveRequest extends RpcAcsRequest<CreateDriveResponse> {
	   

	private Boolean profileRoaming;

	private String description;

	private String type;

	private String userId;

	private String domainId;

	private String externalDomainId;

	private Long usedSize;

	private Long aliUid;

	private String driveName;

	private Long totalSize;

	private String resourceType;
	public CreateDriveRequest() {
		super("ecd", "2020-09-30", "CreateDrive");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getProfileRoaming() {
		return this.profileRoaming;
	}

	public void setProfileRoaming(Boolean profileRoaming) {
		this.profileRoaming = profileRoaming;
		if(profileRoaming != null){
			putQueryParameter("ProfileRoaming", profileRoaming.toString());
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getDomainId() {
		return this.domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
		if(domainId != null){
			putQueryParameter("DomainId", domainId);
		}
	}

	public String getExternalDomainId() {
		return this.externalDomainId;
	}

	public void setExternalDomainId(String externalDomainId) {
		this.externalDomainId = externalDomainId;
		if(externalDomainId != null){
			putQueryParameter("ExternalDomainId", externalDomainId);
		}
	}

	public Long getUsedSize() {
		return this.usedSize;
	}

	public void setUsedSize(Long usedSize) {
		this.usedSize = usedSize;
		if(usedSize != null){
			putQueryParameter("UsedSize", usedSize.toString());
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getDriveName() {
		return this.driveName;
	}

	public void setDriveName(String driveName) {
		this.driveName = driveName;
		if(driveName != null){
			putQueryParameter("DriveName", driveName);
		}
	}

	public Long getTotalSize() {
		return this.totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
		if(totalSize != null){
			putQueryParameter("TotalSize", totalSize.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	@Override
	public Class<CreateDriveResponse> getResponseClass() {
		return CreateDriveResponse.class;
	}

}
