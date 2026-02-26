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

package com.aliyuncs.eiam.model.v20211201;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListOrganizationalUnitsRequest extends RpcAcsRequest<ListOrganizationalUnitsResponse> {
	   

	private String organizationalUnitNameStartsWith;

	private Long pageNumber;

	private String parentId;

	private Long pageSize;

	private List<String> organizationalUnitIds;

	private String organizationalUnitName;

	private String instanceId;
	public ListOrganizationalUnitsRequest() {
		super("Eiam", "2021-12-01", "ListOrganizationalUnits", "eiam");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getOrganizationalUnitNameStartsWith() {
		return this.organizationalUnitNameStartsWith;
	}

	public void setOrganizationalUnitNameStartsWith(String organizationalUnitNameStartsWith) {
		this.organizationalUnitNameStartsWith = organizationalUnitNameStartsWith;
		if(organizationalUnitNameStartsWith != null){
			putQueryParameter("OrganizationalUnitNameStartsWith", organizationalUnitNameStartsWith);
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public List<String> getOrganizationalUnitIds() {
		return this.organizationalUnitIds;
	}

	public void setOrganizationalUnitIds(List<String> organizationalUnitIds) {
		this.organizationalUnitIds = organizationalUnitIds;	
		if (organizationalUnitIds != null) {
			for (int depth1 = 0; depth1 < organizationalUnitIds.size(); depth1++) {
				putQueryParameter("OrganizationalUnitIds." + (depth1 + 1) , organizationalUnitIds.get(depth1));
			}
		}	
	}

	public String getOrganizationalUnitName() {
		return this.organizationalUnitName;
	}

	public void setOrganizationalUnitName(String organizationalUnitName) {
		this.organizationalUnitName = organizationalUnitName;
		if(organizationalUnitName != null){
			putQueryParameter("OrganizationalUnitName", organizationalUnitName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<ListOrganizationalUnitsResponse> getResponseClass() {
		return ListOrganizationalUnitsResponse.class;
	}

}
