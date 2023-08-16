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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListDynamicRoutesRequest extends RpcAcsRequest<ListDynamicRoutesResponse> {
	   

	private Integer pageSize;

	private String applicationId;

	private List<String> dynamicRouteIds;

	private String tagId;

	private Integer currentPage;

	private List<String> regionIds;

	private String nextHop;

	private String name;

	private String status;
	public ListDynamicRoutesRequest() {
		super("csas", "2023-01-20", "ListDynamicRoutes");
		setMethod(MethodType.GET);
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

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putQueryParameter("ApplicationId", applicationId);
		}
	}

	public List<String> getDynamicRouteIds() {
		return this.dynamicRouteIds;
	}

	public void setDynamicRouteIds(List<String> dynamicRouteIds) {
		this.dynamicRouteIds = dynamicRouteIds;	
		if (dynamicRouteIds != null) {
			for (int depth1 = 0; depth1 < dynamicRouteIds.size(); depth1++) {
				putQueryParameter("DynamicRouteIds." + (depth1 + 1) , dynamicRouteIds.get(depth1));
			}
		}	
	}

	public String getTagId() {
		return this.tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
		if(tagId != null){
			putQueryParameter("TagId", tagId);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public List<String> getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(List<String> regionIds) {
		this.regionIds = regionIds;	
		if (regionIds != null) {
			for (int depth1 = 0; depth1 < regionIds.size(); depth1++) {
				putQueryParameter("RegionIds." + (depth1 + 1) , regionIds.get(depth1));
			}
		}	
	}

	public String getNextHop() {
		return this.nextHop;
	}

	public void setNextHop(String nextHop) {
		this.nextHop = nextHop;
		if(nextHop != null){
			putQueryParameter("NextHop", nextHop);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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
	public Class<ListDynamicRoutesResponse> getResponseClass() {
		return ListDynamicRoutesResponse.class;
	}

}
