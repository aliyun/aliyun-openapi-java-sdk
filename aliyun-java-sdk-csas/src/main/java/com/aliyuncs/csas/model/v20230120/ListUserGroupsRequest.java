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
public class ListUserGroupsRequest extends RpcAcsRequest<ListUserGroupsResponse> {
	   

	private String attributeValue;

	private String pAPolicyId;

	private Integer pageSize;

	private Integer currentPage;

	private List<String> userGroupIds;

	private String name;
	public ListUserGroupsRequest() {
		super("csas", "2023-01-20", "ListUserGroups");
		setMethod(MethodType.GET);
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
		if(attributeValue != null){
			putQueryParameter("AttributeValue", attributeValue);
		}
	}

	public String getPAPolicyId() {
		return this.pAPolicyId;
	}

	public void setPAPolicyId(String pAPolicyId) {
		this.pAPolicyId = pAPolicyId;
		if(pAPolicyId != null){
			putQueryParameter("PAPolicyId", pAPolicyId);
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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public List<String> getUserGroupIds() {
		return this.userGroupIds;
	}

	public void setUserGroupIds(List<String> userGroupIds) {
		this.userGroupIds = userGroupIds;	
		if (userGroupIds != null) {
			for (int depth1 = 0; depth1 < userGroupIds.size(); depth1++) {
				putQueryParameter("UserGroupIds." + (depth1 + 1) , userGroupIds.get(depth1));
			}
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

	@Override
	public Class<ListUserGroupsResponse> getResponseClass() {
		return ListUserGroupsResponse.class;
	}

}
