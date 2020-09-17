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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLinkeBahamutAdminpipelineRequest extends RpcAcsRequest<ListLinkeBahamutAdminpipelineResponse> {
	   

	private List<String> tagsRepeatLists;

	private String pageSize;

	private String tenantId;

	private String isReleased;

	private String stageType;

	private String page;
	public ListLinkeBahamutAdminpipelineRequest() {
		super("SOFA", "2019-08-15", "ListLinkeBahamutAdminpipeline", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getTagsRepeatLists() {
		return this.tagsRepeatLists;
	}

	public void setTagsRepeatLists(List<String> tagsRepeatLists) {
		this.tagsRepeatLists = tagsRepeatLists;	
		if (tagsRepeatLists != null) {
			for (int i = 0; i < tagsRepeatLists.size(); i++) {
				putBodyParameter("TagsRepeatList." + (i + 1) , tagsRepeatLists.get(i));
			}
		}	
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getIsReleased() {
		return this.isReleased;
	}

	public void setIsReleased(String isReleased) {
		this.isReleased = isReleased;
		if(isReleased != null){
			putBodyParameter("IsReleased", isReleased);
		}
	}

	public String getStageType() {
		return this.stageType;
	}

	public void setStageType(String stageType) {
		this.stageType = stageType;
		if(stageType != null){
			putBodyParameter("StageType", stageType);
		}
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
		if(page != null){
			putBodyParameter("Page", page);
		}
	}

	@Override
	public Class<ListLinkeBahamutAdminpipelineResponse> getResponseClass() {
		return ListLinkeBahamutAdminpipelineResponse.class;
	}

}
