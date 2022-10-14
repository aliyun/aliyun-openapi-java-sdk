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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeLaunchTemplateVersionsRequest extends RpcAcsRequest<DescribeLaunchTemplateVersionsResponse> {
	   

	private String launchTemplateName;

	private Long maxVersion;

	private Long resourceOwnerId;

	private Boolean defaultVersion;

	private Long minVersion;

	private Integer pageNumber;

	private Integer pageSize;

	private String launchTemplateId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<Long> launchTemplateVersions;

	private Boolean detailFlag;
	public DescribeLaunchTemplateVersionsRequest() {
		super("Ecs", "2014-05-26", "DescribeLaunchTemplateVersions", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLaunchTemplateName() {
		return this.launchTemplateName;
	}

	public void setLaunchTemplateName(String launchTemplateName) {
		this.launchTemplateName = launchTemplateName;
		if(launchTemplateName != null){
			putQueryParameter("LaunchTemplateName", launchTemplateName);
		}
	}

	public Long getMaxVersion() {
		return this.maxVersion;
	}

	public void setMaxVersion(Long maxVersion) {
		this.maxVersion = maxVersion;
		if(maxVersion != null){
			putQueryParameter("MaxVersion", maxVersion.toString());
		}
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

	public Boolean getDefaultVersion() {
		return this.defaultVersion;
	}

	public void setDefaultVersion(Boolean defaultVersion) {
		this.defaultVersion = defaultVersion;
		if(defaultVersion != null){
			putQueryParameter("DefaultVersion", defaultVersion.toString());
		}
	}

	public Long getMinVersion() {
		return this.minVersion;
	}

	public void setMinVersion(Long minVersion) {
		this.minVersion = minVersion;
		if(minVersion != null){
			putQueryParameter("MinVersion", minVersion.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getLaunchTemplateId() {
		return this.launchTemplateId;
	}

	public void setLaunchTemplateId(String launchTemplateId) {
		this.launchTemplateId = launchTemplateId;
		if(launchTemplateId != null){
			putQueryParameter("LaunchTemplateId", launchTemplateId);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public List<Long> getLaunchTemplateVersions() {
		return this.launchTemplateVersions;
	}

	public void setLaunchTemplateVersions(List<Long> launchTemplateVersions) {
		this.launchTemplateVersions = launchTemplateVersions;	
		if (launchTemplateVersions != null) {
			for (int i = 0; i < launchTemplateVersions.size(); i++) {
				putQueryParameter("LaunchTemplateVersion." + (i + 1) , launchTemplateVersions.get(i));
			}
		}	
	}

	public Boolean getDetailFlag() {
		return this.detailFlag;
	}

	public void setDetailFlag(Boolean detailFlag) {
		this.detailFlag = detailFlag;
		if(detailFlag != null){
			putQueryParameter("DetailFlag", detailFlag.toString());
		}
	}

	@Override
	public Class<DescribeLaunchTemplateVersionsResponse> getResponseClass() {
		return DescribeLaunchTemplateVersionsResponse.class;
	}

}
