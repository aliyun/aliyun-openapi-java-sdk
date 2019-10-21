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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainContractProjectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainContractProjectsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<ContractProjectsItem> contractProjects;

		private Pagination pagination;

		public List<ContractProjectsItem> getContractProjects() {
			return this.contractProjects;
		}

		public void setContractProjects(List<ContractProjectsItem> contractProjects) {
			this.contractProjects = contractProjects;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class ContractProjectsItem {

			private String projectId;

			private String consortiumId;

			private Long createTime;

			private Long updateTime;

			private String projectName;

			private String projectVersion;

			private String projectDescription;

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getConsortiumId() {
				return this.consortiumId;
			}

			public void setConsortiumId(String consortiumId) {
				this.consortiumId = consortiumId;
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

			public String getProjectName() {
				return this.projectName;
			}

			public void setProjectName(String projectName) {
				this.projectName = projectName;
			}

			public String getProjectVersion() {
				return this.projectVersion;
			}

			public void setProjectVersion(String projectVersion) {
				this.projectVersion = projectVersion;
			}

			public String getProjectDescription() {
				return this.projectDescription;
			}

			public void setProjectDescription(String projectDescription) {
				this.projectDescription = projectDescription;
			}
		}

		public static class Pagination {

			private Integer pageSize;

			private Integer pageNumber;

			private Integer totalCount;

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getPageNumber() {
				return this.pageNumber;
			}

			public void setPageNumber(Integer pageNumber) {
				this.pageNumber = pageNumber;
			}

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}
		}
	}

	@Override
	public DescribeAntChainContractProjectsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainContractProjectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
