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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorGroupsRequest extends RpcAcsRequest<DescribeMonitorGroupsResponse> {
	   

	private Boolean selectContactGroups;

	private Boolean includeTemplateHistory;

	private String type;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Tag> tags;

	private String keyword;

	private String groupId;

	private String groupName;

	private String instanceId;

	private String dynamicTagGroupId;
	public DescribeMonitorGroupsRequest() {
		super("Cms", "2019-01-01", "DescribeMonitorGroups", "cms");
		setMethod(MethodType.POST);
	}

	public Boolean getSelectContactGroups() {
		return this.selectContactGroups;
	}

	public void setSelectContactGroups(Boolean selectContactGroups) {
		this.selectContactGroups = selectContactGroups;
		if(selectContactGroups != null){
			putQueryParameter("SelectContactGroups", selectContactGroups.toString());
		}
	}

	public Boolean getIncludeTemplateHistory() {
		return this.includeTemplateHistory;
	}

	public void setIncludeTemplateHistory(Boolean includeTemplateHistory) {
		this.includeTemplateHistory = includeTemplateHistory;
		if(includeTemplateHistory != null){
			putQueryParameter("IncludeTemplateHistory", includeTemplateHistory.toString());
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDynamicTagGroupId() {
		return this.dynamicTagGroupId;
	}

	public void setDynamicTagGroupId(String dynamicTagGroupId) {
		this.dynamicTagGroupId = dynamicTagGroupId;
		if(dynamicTagGroupId != null){
			putQueryParameter("DynamicTagGroupId", dynamicTagGroupId);
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<DescribeMonitorGroupsResponse> getResponseClass() {
		return DescribeMonitorGroupsResponse.class;
	}

}
