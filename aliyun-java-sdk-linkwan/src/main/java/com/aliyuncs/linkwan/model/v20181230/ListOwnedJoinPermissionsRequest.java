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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ListOwnedJoinPermissionsRequest extends RpcAcsRequest<ListOwnedJoinPermissionsResponse> {
	
	public ListOwnedJoinPermissionsRequest() {
		super("LinkWAN", "2018-12-30", "ListOwnedJoinPermissions", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private Boolean enabled;

	private String fuzzyJoinEui;

	private Long limit;

	private Long offset;

	private String fuzzyRenterAliyunId;

	private Boolean boundNodeGroup;

	private String joinPermissionType;

	private String sortingField;

	private Boolean ascending;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putBodyParameter("Enabled", enabled.toString());
		}
	}

	public String getFuzzyJoinEui() {
		return this.fuzzyJoinEui;
	}

	public void setFuzzyJoinEui(String fuzzyJoinEui) {
		this.fuzzyJoinEui = fuzzyJoinEui;
		if(fuzzyJoinEui != null){
			putBodyParameter("FuzzyJoinEui", fuzzyJoinEui);
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
		}
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putBodyParameter("Offset", offset.toString());
		}
	}

	public String getFuzzyRenterAliyunId() {
		return this.fuzzyRenterAliyunId;
	}

	public void setFuzzyRenterAliyunId(String fuzzyRenterAliyunId) {
		this.fuzzyRenterAliyunId = fuzzyRenterAliyunId;
		if(fuzzyRenterAliyunId != null){
			putBodyParameter("FuzzyRenterAliyunId", fuzzyRenterAliyunId);
		}
	}

	public Boolean getBoundNodeGroup() {
		return this.boundNodeGroup;
	}

	public void setBoundNodeGroup(Boolean boundNodeGroup) {
		this.boundNodeGroup = boundNodeGroup;
		if(boundNodeGroup != null){
			putBodyParameter("BoundNodeGroup", boundNodeGroup.toString());
		}
	}

	public String getJoinPermissionType() {
		return this.joinPermissionType;
	}

	public void setJoinPermissionType(String joinPermissionType) {
		this.joinPermissionType = joinPermissionType;
		if(joinPermissionType != null){
			putBodyParameter("JoinPermissionType", joinPermissionType);
		}
	}

	public String getSortingField() {
		return this.sortingField;
	}

	public void setSortingField(String sortingField) {
		this.sortingField = sortingField;
		if(sortingField != null){
			putBodyParameter("SortingField", sortingField);
		}
	}

	public Boolean getAscending() {
		return this.ascending;
	}

	public void setAscending(Boolean ascending) {
		this.ascending = ascending;
		if(ascending != null){
			putBodyParameter("Ascending", ascending.toString());
		}
	}

	@Override
	public Class<ListOwnedJoinPermissionsResponse> getResponseClass() {
		return ListOwnedJoinPermissionsResponse.class;
	}

}
