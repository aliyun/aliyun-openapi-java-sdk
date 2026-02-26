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
public class ListPrivateAccessApplicationsRequest extends RpcAcsRequest<ListPrivateAccessApplicationsResponse> {
	   

	private String policyId;

	private Integer pageSize;

	private String address;

	private String tagId;

	private String connectorId;

	private Integer currentPage;

	private List<String> applicationIds;

	private String accessModes;

	private String name;

	private String status;
	public ListPrivateAccessApplicationsRequest() {
		super("csas", "2023-01-20", "ListPrivateAccessApplications");
		setMethod(MethodType.GET);
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putQueryParameter("PolicyId", policyId);
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
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

	public String getConnectorId() {
		return this.connectorId;
	}

	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
		if(connectorId != null){
			putQueryParameter("ConnectorId", connectorId);
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

	public List<String> getApplicationIds() {
		return this.applicationIds;
	}

	public void setApplicationIds(List<String> applicationIds) {
		this.applicationIds = applicationIds;	
		if (applicationIds != null) {
			for (int depth1 = 0; depth1 < applicationIds.size(); depth1++) {
				putQueryParameter("ApplicationIds." + (depth1 + 1) , applicationIds.get(depth1));
			}
		}	
	}

	public String getAccessModes() {
		return this.accessModes;
	}

	public void setAccessModes(String accessModes) {
		this.accessModes = accessModes;
		if(accessModes != null){
			putQueryParameter("AccessModes", accessModes);
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
	public Class<ListPrivateAccessApplicationsResponse> getResponseClass() {
		return ListPrivateAccessApplicationsResponse.class;
	}

}
