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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.SearchAlertContactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchAlertContactResponse extends AcsResponse {

	private String requestId;

	private PageBean pageBean;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageBean getPageBean() {
		return this.pageBean;
	}

	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	public static class PageBean {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Contact> contacts;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
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

		public List<Contact> getContacts() {
			return this.contacts;
		}

		public void setContacts(List<Contact> contacts) {
			this.contacts = contacts;
		}

		public static class Contact {

			private Long contactId;

			private String contactName;

			private String phone;

			private String email;

			private String userId;

			private String dingRobot;

			private Long createTime;

			private Long updateTime;

			private Boolean systemNoc;

			private String webhook;

			private String content;

			public Long getContactId() {
				return this.contactId;
			}

			public void setContactId(Long contactId) {
				this.contactId = contactId;
			}

			public String getContactName() {
				return this.contactName;
			}

			public void setContactName(String contactName) {
				this.contactName = contactName;
			}

			public String getPhone() {
				return this.phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public String getEmail() {
				return this.email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getDingRobot() {
				return this.dingRobot;
			}

			public void setDingRobot(String dingRobot) {
				this.dingRobot = dingRobot;
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

			public Boolean getSystemNoc() {
				return this.systemNoc;
			}

			public void setSystemNoc(Boolean systemNoc) {
				this.systemNoc = systemNoc;
			}

			public String getWebhook() {
				return this.webhook;
			}

			public void setWebhook(String webhook) {
				this.webhook = webhook;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public SearchAlertContactResponse getInstance(UnmarshallerContext context) {
		return	SearchAlertContactResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
