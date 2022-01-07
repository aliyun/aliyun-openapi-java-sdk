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
import com.aliyuncs.arms.transform.v20190808.DescribeContactGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeContactGroupsResponse extends AcsResponse {

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

		private Long total;

		private Long page;

		private Long size;

		private List<ContactGroups> alertContactGroups;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public List<ContactGroups> getAlertContactGroups() {
			return this.alertContactGroups;
		}

		public void setAlertContactGroups(List<ContactGroups> alertContactGroups) {
			this.alertContactGroups = alertContactGroups;
		}

		public static class ContactGroups {

			private Float contactGroupId;

			private String contactGroupName;

			private List<ContactsItem> contacts;

			public Float getContactGroupId() {
				return this.contactGroupId;
			}

			public void setContactGroupId(Float contactGroupId) {
				this.contactGroupId = contactGroupId;
			}

			public String getContactGroupName() {
				return this.contactGroupName;
			}

			public void setContactGroupName(String contactGroupName) {
				this.contactGroupName = contactGroupName;
			}

			public List<ContactsItem> getContacts() {
				return this.contacts;
			}

			public void setContacts(List<ContactsItem> contacts) {
				this.contacts = contacts;
			}

			public static class ContactsItem {

				private Float contactId;

				private String contactName;

				private String phone;

				private String email;

				public Float getContactId() {
					return this.contactId;
				}

				public void setContactId(Float contactId) {
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
			}
		}
	}

	@Override
	public DescribeContactGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeContactGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
