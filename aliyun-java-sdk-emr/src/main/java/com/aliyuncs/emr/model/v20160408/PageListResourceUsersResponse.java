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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.PageListResourceUsersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageListResourceUsersResponse extends AcsResponse {

	private Boolean paging;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Item> items;

	public Boolean getPaging() {
		return this.paging;
	}

	public void setPaging(Boolean paging) {
		this.paging = paging;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private String aliyunUserId;

		private String userName;

		private String status;

		private Long gmtCreate;

		private String knoxSyncStatus;

		private String linuxSyncStatus;

		private String kerberosStutus;

		private String sourceType;

		private List<RoleDTO> roleDTOList;

		public String getAliyunUserId() {
			return this.aliyunUserId;
		}

		public void setAliyunUserId(String aliyunUserId) {
			this.aliyunUserId = aliyunUserId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getKnoxSyncStatus() {
			return this.knoxSyncStatus;
		}

		public void setKnoxSyncStatus(String knoxSyncStatus) {
			this.knoxSyncStatus = knoxSyncStatus;
		}

		public String getLinuxSyncStatus() {
			return this.linuxSyncStatus;
		}

		public void setLinuxSyncStatus(String linuxSyncStatus) {
			this.linuxSyncStatus = linuxSyncStatus;
		}

		public String getKerberosStutus() {
			return this.kerberosStutus;
		}

		public void setKerberosStutus(String kerberosStutus) {
			this.kerberosStutus = kerberosStutus;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public List<RoleDTO> getRoleDTOList() {
			return this.roleDTOList;
		}

		public void setRoleDTOList(List<RoleDTO> roleDTOList) {
			this.roleDTOList = roleDTOList;
		}

		public static class RoleDTO {

			private Long id;

			private String name;

			private String resourceType;

			private String gmtCreate;

			private String gmtModified;

			private String description;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getResourceType() {
				return this.resourceType;
			}

			public void setResourceType(String resourceType) {
				this.resourceType = resourceType;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public PageListResourceUsersResponse getInstance(UnmarshallerContext context) {
		return	PageListResourceUsersResponseUnmarshaller.unmarshall(this, context);
	}
}
