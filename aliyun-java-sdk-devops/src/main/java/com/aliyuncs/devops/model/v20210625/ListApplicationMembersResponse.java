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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListApplicationMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationMembersResponse extends AcsResponse {

	private Long total;

	private Long current;

	private Long pageSize;

	private Long pages;

	private String requestId;

	private List<RecordsItem> records;

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Long getCurrent() {
		return this.current;
	}

	public void setCurrent(Long current) {
		this.current = current;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPages() {
		return this.pages;
	}

	public void setPages(Long pages) {
		this.pages = pages;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordsItem> getRecords() {
		return this.records;
	}

	public void setRecords(List<RecordsItem> records) {
		this.records = records;
	}

	public static class RecordsItem {

		private String id;

		private String type;

		private String displayName;

		private String description;

		private String avatar;

		private List<RoleListItem> roleList;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		public List<RoleListItem> getRoleList() {
			return this.roleList;
		}

		public void setRoleList(List<RoleListItem> roleList) {
			this.roleList = roleList;
		}

		public static class RoleListItem {

			private String name;

			private String displayName;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}
		}
	}

	@Override
	public ListApplicationMembersResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
