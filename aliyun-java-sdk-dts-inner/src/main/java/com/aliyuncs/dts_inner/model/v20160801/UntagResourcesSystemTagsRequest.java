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

package com.aliyuncs.dts_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UntagResourcesSystemTagsRequest extends RpcAcsRequest<UntagResourcesSystemTagsResponse> {
	   

	private Long tagOwnerUid;

	private Boolean all;

	private List<String> resourceIds;

	private String resourceType;

	private List<String> tagKeys;
	public UntagResourcesSystemTagsRequest() {
		super("Dts-inner", "2016-08-01", "UntagResourcesSystemTags", "dts");
		setMethod(MethodType.POST);
	}

	public Long getTagOwnerUid() {
		return this.tagOwnerUid;
	}

	public void setTagOwnerUid(Long tagOwnerUid) {
		this.tagOwnerUid = tagOwnerUid;
		if(tagOwnerUid != null){
			putBodyParameter("TagOwnerUid", tagOwnerUid.toString());
		}
	}

	public Boolean getAll() {
		return this.all;
	}

	public void setAll(Boolean all) {
		this.all = all;
		if(all != null){
			putBodyParameter("All", all.toString());
		}
	}

	public List<String> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<String> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int i = 0; i < resourceIds.size(); i++) {
				putBodyParameter("ResourceId." + (i + 1) , resourceIds.get(i));
			}
		}	
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putBodyParameter("ResourceType", resourceType);
		}
	}

	public List<String> getTagKeys() {
		return this.tagKeys;
	}

	public void setTagKeys(List<String> tagKeys) {
		this.tagKeys = tagKeys;	
		if (tagKeys != null) {
			for (int i = 0; i < tagKeys.size(); i++) {
				putBodyParameter("TagKey." + (i + 1) , tagKeys.get(i));
			}
		}	
	}

	@Override
	public Class<UntagResourcesSystemTagsResponse> getResponseClass() {
		return UntagResourcesSystemTagsResponse.class;
	}

}
