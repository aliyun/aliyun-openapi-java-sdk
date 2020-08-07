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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListProjectMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectMembersResponse extends AcsResponse {

	private Integer pageNum;

	private Integer pageSize;

	private String requestId;

	private Integer totalNum;

	private List<ProjectMember> projectMemberList;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<ProjectMember> getProjectMemberList() {
		return this.projectMemberList;
	}

	public void setProjectMemberList(List<ProjectMember> projectMemberList) {
		this.projectMemberList = projectMemberList;
	}

	public static class ProjectMember {

		private String projectMemberId;

		private String projectMemberName;

		private String projectMemberType;

		private String createOn;

		private String nick;

		private String status;

		private List<Role> projectRoleList;

		public String getProjectMemberId() {
			return this.projectMemberId;
		}

		public void setProjectMemberId(String projectMemberId) {
			this.projectMemberId = projectMemberId;
		}

		public String getProjectMemberName() {
			return this.projectMemberName;
		}

		public void setProjectMemberName(String projectMemberName) {
			this.projectMemberName = projectMemberName;
		}

		public String getProjectMemberType() {
			return this.projectMemberType;
		}

		public void setProjectMemberType(String projectMemberType) {
			this.projectMemberType = projectMemberType;
		}

		public String getCreateOn() {
			return this.createOn;
		}

		public void setCreateOn(String createOn) {
			this.createOn = createOn;
		}

		public String getNick() {
			return this.nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Role> getProjectRoleList() {
			return this.projectRoleList;
		}

		public void setProjectRoleList(List<Role> projectRoleList) {
			this.projectRoleList = projectRoleList;
		}

		public static class Role {

			private String projectRoleCode;

			private Integer projectRoleId;

			private String projectRoleName;

			private String projectRoleType;

			public String getProjectRoleCode() {
				return this.projectRoleCode;
			}

			public void setProjectRoleCode(String projectRoleCode) {
				this.projectRoleCode = projectRoleCode;
			}

			public Integer getProjectRoleId() {
				return this.projectRoleId;
			}

			public void setProjectRoleId(Integer projectRoleId) {
				this.projectRoleId = projectRoleId;
			}

			public String getProjectRoleName() {
				return this.projectRoleName;
			}

			public void setProjectRoleName(String projectRoleName) {
				this.projectRoleName = projectRoleName;
			}

			public String getProjectRoleType() {
				return this.projectRoleType;
			}

			public void setProjectRoleType(String projectRoleType) {
				this.projectRoleType = projectRoleType;
			}
		}
	}

	@Override
	public ListProjectMembersResponse getInstance(UnmarshallerContext context) {
		return	ListProjectMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
