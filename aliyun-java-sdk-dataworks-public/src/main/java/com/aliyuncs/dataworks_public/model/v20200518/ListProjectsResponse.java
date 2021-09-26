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
import com.aliyuncs.dataworks_public.transform.v20200518.ListProjectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectsResponse extends AcsResponse {

	private String requestId;

	private PageResult pageResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PageResult getPageResult() {
		return this.pageResult;
	}

	public void setPageResult(PageResult pageResult) {
		this.pageResult = pageResult;
	}

	public static class PageResult {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<Project> projectList;

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

		public List<Project> getProjectList() {
			return this.projectList;
		}

		public void setProjectList(List<Project> projectList) {
			this.projectList = projectList;
		}

		public static class Project {

			private String projectStatusCode;

			private Integer projectStatus;

			private String projectName;

			private String projectIdentifier;

			private Long projectId;

			private String projectDescription;

			private String projectOwnerBaseId;

			public String getProjectStatusCode() {
				return this.projectStatusCode;
			}

			public void setProjectStatusCode(String projectStatusCode) {
				this.projectStatusCode = projectStatusCode;
			}

			public Integer getProjectStatus() {
				return this.projectStatus;
			}

			public void setProjectStatus(Integer projectStatus) {
				this.projectStatus = projectStatus;
			}

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProjectIdentifier() {
				return this.projectIdentifier;
			}

			public void setProjectIdentifier(String projectIdentifier) {
				this.projectIdentifier = projectIdentifier;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getProjectDescription() {
				return this.projectDescription;
			}

			public void setProjectDescription(String projectDescription) {
				this.projectDescription = projectDescription;
			}

			public String getProjectOwnerBaseId() {
				return this.projectOwnerBaseId;
			}

			public void setProjectOwnerBaseId(String projectOwnerBaseId) {
				this.projectOwnerBaseId = projectOwnerBaseId;
			}
		}
	}

	@Override
	public ListProjectsResponse getInstance(UnmarshallerContext context) {
		return	ListProjectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
