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
import com.aliyuncs.cms.transform.v20190101.DescribeContactGroupListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContactGroupListResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer total;

	private String requestId;

	private List<ContactGroup> contactGroupList;

	private List<String> contactGroups;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ContactGroup> getContactGroupList() {
		return this.contactGroupList;
	}

	public void setContactGroupList(List<ContactGroup> contactGroupList) {
		this.contactGroupList = contactGroupList;
	}

	public List<String> getContactGroups() {
		return this.contactGroups;
	}

	public void setContactGroups(List<String> contactGroups) {
		this.contactGroups = contactGroups;
	}

	public static class ContactGroup {

		private String name;

		private String describe;

		private Long createTime;

		private Long updateTime;

		private Boolean enabledWeeklyReport;

		private Boolean enableSubscribed;

		private List<String> contacts;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescribe() {
			return this.describe;
		}

		public void setDescribe(String describe) {
			this.describe = describe;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getEnabledWeeklyReport() {
			return this.enabledWeeklyReport;
		}

		public void setEnabledWeeklyReport(Boolean enabledWeeklyReport) {
			this.enabledWeeklyReport = enabledWeeklyReport;
		}

		public Boolean getEnableSubscribed() {
			return this.enableSubscribed;
		}

		public void setEnableSubscribed(Boolean enableSubscribed) {
			this.enableSubscribed = enableSubscribed;
		}

		public List<String> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<String> contacts) {
			this.contacts = contacts;
		}
	}

	@Override
	public DescribeContactGroupListResponse getInstance(UnmarshallerContext context) {
		return	DescribeContactGroupListResponseUnmarshaller.unmarshall(this, context);
	}
}
