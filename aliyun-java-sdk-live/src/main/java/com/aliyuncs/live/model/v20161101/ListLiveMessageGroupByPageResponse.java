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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListLiveMessageGroupByPageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLiveMessageGroupByPageResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Groups> groupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<Groups> getGroupList() {
		return this.groupList;
	}

	public void setGroupList(List<Groups> groupList) {
		this.groupList = groupList;
	}

	public static class Groups {

		private String groupId;

		private String creatorId;

		private Long createtime;

		private String groupName;

		private String groupInfo;

		private Boolean delete;

		private List<String> adminList;

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getCreatorId() {
			return this.creatorId;
		}

		public void setCreatorId(String creatorId) {
			this.creatorId = creatorId;
		}

		public Long getCreatetime() {
			return this.createtime;
		}

		public void setCreatetime(Long createtime) {
			this.createtime = createtime;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getGroupInfo() {
			return this.groupInfo;
		}

		public void setGroupInfo(String groupInfo) {
			this.groupInfo = groupInfo;
		}

		public Boolean getDelete() {
			return this.delete;
		}

		public void setDelete(Boolean delete) {
			this.delete = delete;
		}

		public List<String> getAdminList() {
			return this.adminList;
		}

		public void setAdminList(List<String> adminList) {
			this.adminList = adminList;
		}
	}

	@Override
	public ListLiveMessageGroupByPageResponse getInstance(UnmarshallerContext context) {
		return	ListLiveMessageGroupByPageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
