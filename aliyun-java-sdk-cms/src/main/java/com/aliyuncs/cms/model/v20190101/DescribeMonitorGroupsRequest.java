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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorGroupsRequest extends RpcAcsRequest<DescribeMonitorGroupsResponse> {
	
	public DescribeMonitorGroupsRequest() {
		super("Cms", "2019-01-01", "DescribeMonitorGroups", "cms");
	}

	private Boolean selectContactGroups;

	private String instanceId;

	private Integer pageSize;

	private String type;

	private String keyword;

	private String groupName;

	private Integer pageNumber;

	private String bindUrls;

	public Boolean getSelectContactGroups() {
		return this.selectContactGroups;
	}

	public void setSelectContactGroups(Boolean selectContactGroups) {
		this.selectContactGroups = selectContactGroups;
		if(selectContactGroups != null){
			putQueryParameter("SelectContactGroups", selectContactGroups.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
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

	public String getBindUrls() {
		return this.bindUrls;
	}

	public void setBindUrls(String bindUrls) {
		this.bindUrls = bindUrls;
		if(bindUrls != null){
			putQueryParameter("BindUrls", bindUrls);
		}
	}

	@Override
	public Class<DescribeMonitorGroupsResponse> getResponseClass() {
		return DescribeMonitorGroupsResponse.class;
	}

}
