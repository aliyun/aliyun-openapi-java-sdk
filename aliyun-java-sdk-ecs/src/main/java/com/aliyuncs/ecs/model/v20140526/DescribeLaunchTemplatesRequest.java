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

/**
 * @author auto create
 * @version 
 */
public class DescribeLaunchTemplatesRequest extends RpcAcsRequest<DescribeLaunchTemplatesResponse> {
	
	public DescribeLaunchTemplatesRequest() {
		super("Ecs", "2014-05-26", "DescribeLaunchTemplates", "ecs");
	}

	private String templateTag1Value;

	private List<String> launchTemplateNames;

	private Long resourceOwnerId;

	private String templateTag4Key;

	private Integer pageNumber;

	private String templateTag3Key;

	private String templateTag5Value;

	private Integer pageSize;

	private String templateTag3Value;

	private String templateTag2Key;

	private List<String> launchTemplateIds;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String templateResourceGroupId;

	private String templateTag2Value;

	private Long ownerId;

	private String templateTag4Value;

	private String templateTag5Key;

	private String templateTag1Key;

	public String getTemplateTag1Value() {
		return this.templateTag1Value;
	}

	public void setTemplateTag1Value(String templateTag1Value) {
		this.templateTag1Value = templateTag1Value;
		if(templateTag1Value != null){
			putQueryParameter("TemplateTag.1.Value", templateTag1Value);
		}
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

	public String getTemplateTag4Key() {
		return this.templateTag4Key;
	}

	public void setTemplateTag4Key(String templateTag4Key) {
		this.templateTag4Key = templateTag4Key;
		if(templateTag4Key != null){
			putQueryParameter("TemplateTag.4.Key", templateTag4Key);
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

	public String getTemplateTag3Key() {
		return this.templateTag3Key;
	}

	public void setTemplateTag3Key(String templateTag3Key) {
		this.templateTag3Key = templateTag3Key;
		if(templateTag3Key != null){
			putQueryParameter("TemplateTag.3.Key", templateTag3Key);
		}
	}

	public String getTemplateTag5Value() {
		return this.templateTag5Value;
	}

	public void setTemplateTag5Value(String templateTag5Value) {
		this.templateTag5Value = templateTag5Value;
		if(templateTag5Value != null){
			putQueryParameter("TemplateTag.5.Value", templateTag5Value);
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

	public String getTemplateTag3Value() {
		return this.templateTag3Value;
	}

	public void setTemplateTag3Value(String templateTag3Value) {
		this.templateTag3Value = templateTag3Value;
		if(templateTag3Value != null){
			putQueryParameter("TemplateTag.3.Value", templateTag3Value);
		}
	}

	public String getTemplateTag2Key() {
		return this.templateTag2Key;
	}

	public void setTemplateTag2Key(String templateTag2Key) {
		this.templateTag2Key = templateTag2Key;
		if(templateTag2Key != null){
			putQueryParameter("TemplateTag.2.Key", templateTag2Key);
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

	public String getTemplateTag2Value() {
		return this.templateTag2Value;
	}

	public void setTemplateTag2Value(String templateTag2Value) {
		this.templateTag2Value = templateTag2Value;
		if(templateTag2Value != null){
			putQueryParameter("TemplateTag.2.Value", templateTag2Value);
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

	public String getTemplateTag4Value() {
		return this.templateTag4Value;
	}

	public void setTemplateTag4Value(String templateTag4Value) {
		this.templateTag4Value = templateTag4Value;
		if(templateTag4Value != null){
			putQueryParameter("TemplateTag.4.Value", templateTag4Value);
		}
	}

	public String getTemplateTag5Key() {
		return this.templateTag5Key;
	}

	public void setTemplateTag5Key(String templateTag5Key) {
		this.templateTag5Key = templateTag5Key;
		if(templateTag5Key != null){
			putQueryParameter("TemplateTag.5.Key", templateTag5Key);
		}
	}

	public String getTemplateTag1Key() {
		return this.templateTag1Key;
	}

	public void setTemplateTag1Key(String templateTag1Key) {
		this.templateTag1Key = templateTag1Key;
		if(templateTag1Key != null){
			putQueryParameter("TemplateTag.1.Key", templateTag1Key);
		}
	}

	@Override
	public Class<DescribeLaunchTemplatesResponse> getResponseClass() {
		return DescribeLaunchTemplatesResponse.class;
	}

}
