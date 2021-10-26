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
import com.aliyuncs.dataworks_public.transform.v20200518.ListProjectRolesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectRolesResponse extends AcsResponse {

	private String requestId;

	private List<Role> projectRoleList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Role> getProjectRoleList() {
		return this.projectRoleList;
	}

	public void setProjectRoleList(List<Role> projectRoleList) {
		this.projectRoleList = projectRoleList;
	}

	public static class Role {

		private Integer projectRoleId;

		private String projectRoleType;

		private String projectRoleName;

		private String projectRoleCode;

		public Integer getProjectRoleId() {
			return this.projectRoleId;
		}

		public void setProjectRoleId(Integer projectRoleId) {
			this.projectRoleId = projectRoleId;
		}

		public String getProjectRoleType() {
			return this.projectRoleType;
		}

		public void setProjectRoleType(String projectRoleType) {
			this.projectRoleType = projectRoleType;
		}

		public String getProjectRoleName() {
			return this.projectRoleName;
		}

		public void setProjectRoleName(String projectRoleName) {
			this.projectRoleName = projectRoleName;
		}

		public String getProjectRoleCode() {
			return this.projectRoleCode;
		}

		public void setProjectRoleCode(String projectRoleCode) {
			this.projectRoleCode = projectRoleCode;
		}
	}

	@Override
	public ListProjectRolesResponse getInstance(UnmarshallerContext context) {
		return	ListProjectRolesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
