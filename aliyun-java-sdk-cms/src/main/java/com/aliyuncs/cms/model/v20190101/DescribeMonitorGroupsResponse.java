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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMonitorGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorGroupsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<Resource> resources;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Resource> getResources() {
		return this.resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

	public static class Resource {

		private Long groupId;

		private String groupName;

		private String serviceId;

		private String type;

		private Long gmtModified;

		private Long gmtCreate;

		private String bindUrl;

		private String dynamicTagRuleId;

		private String groupFounderTagKey;

		private String groupFounderTagValue;

		private List<ContactGroup> contactGroups;

		private List<Tag> tags;

		private List<String> templateIds;

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getServiceId() {
			return this.serviceId;
		}

		public void setServiceId(String serviceId) {
			this.serviceId = serviceId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getBindUrl() {
			return this.bindUrl;
		}

		public void setBindUrl(String bindUrl) {
			this.bindUrl = bindUrl;
		}

		public String getDynamicTagRuleId() {
			return this.dynamicTagRuleId;
		}

		public void setDynamicTagRuleId(String dynamicTagRuleId) {
			this.dynamicTagRuleId = dynamicTagRuleId;
		}

		public String getGroupFounderTagKey() {
			return this.groupFounderTagKey;
		}

		public void setGroupFounderTagKey(String groupFounderTagKey) {
			this.groupFounderTagKey = groupFounderTagKey;
		}

		public String getGroupFounderTagValue() {
			return this.groupFounderTagValue;
		}

		public void setGroupFounderTagValue(String groupFounderTagValue) {
			this.groupFounderTagValue = groupFounderTagValue;
		}

		public List<ContactGroup> getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(List<ContactGroup> contactGroups) {
			this.contactGroups = contactGroups;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public List<String> getTemplateIds() {
			return this.templateIds;
		}

		public void setTemplateIds(List<String> templateIds) {
			this.templateIds = templateIds;
		}

		public static class ContactGroup {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeMonitorGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
