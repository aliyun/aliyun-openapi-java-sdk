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
public class DescribeLaunchTemplatesRequest extends RpcAcsRequest<DescribeLaunchTemplatesResponse> {
	   

	private List<String> launchTemplateNames;

	private Long resourceOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private List<TemplateTag> templateTags;

	private List<String> launchTemplateIds;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String templateResourceGroupId;

	private Long ownerId;
	public DescribeLaunchTemplatesRequest() {
		super("Ecs", "2014-05-26", "DescribeLaunchTemplates", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getLaunchTemplateNames() {
		return this.launchTemplateNames;
	}

	public void setLaunchTemplateNames(List<String> launchTemplateNames) {
		this.launchTemplateNames = launchTemplateNames;	
		if (launchTemplateNames != null) {
			for (int i = 0; i < launchTemplateNames.size(); i++) {
				putQueryParameter("LaunchTemplateName." + (i + 1) , launchTemplateNames.get(i));
			}
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

	public List<TemplateTag> getTemplateTags() {
		return this.templateTags;
	}

	public void setTemplateTags(List<TemplateTag> templateTags) {
		this.templateTags = templateTags;	
		if (templateTags != null) {
			for (int depth1 = 0; depth1 < templateTags.size(); depth1++) {
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Key" , templateTags.get(depth1).getKey());
				putQueryParameter("TemplateTag." + (depth1 + 1) + ".Value" , templateTags.get(depth1).getValue());
			}
		}	
	}

	public List<String> getLaunchTemplateIds() {
		return this.launchTemplateIds;
	}

	public void setLaunchTemplateIds(List<String> launchTemplateIds) {
		this.launchTemplateIds = launchTemplateIds;	
		if (launchTemplateIds != null) {
			for (int i = 0; i < launchTemplateIds.size(); i++) {
				putQueryParameter("LaunchTemplateId." + (i + 1) , launchTemplateIds.get(i));
			}
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

	public String getTemplateResourceGroupId() {
		return this.templateResourceGroupId;
	}

	public void setTemplateResourceGroupId(String templateResourceGroupId) {
		this.templateResourceGroupId = templateResourceGroupId;
		if(templateResourceGroupId != null){
			putQueryParameter("TemplateResourceGroupId", templateResourceGroupId);
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

	public static class TemplateTag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<DescribeLaunchTemplatesResponse> getResponseClass() {
		return DescribeLaunchTemplatesResponse.class;
	}

}
