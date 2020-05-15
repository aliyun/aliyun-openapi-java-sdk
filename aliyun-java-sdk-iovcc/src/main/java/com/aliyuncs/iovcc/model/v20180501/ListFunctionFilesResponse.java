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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListFunctionFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFunctionFilesResponse extends AcsResponse {

	private String requestId;

	private FileList fileList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FileList getFileList() {
		return this.fileList;
	}

	public void setFileList(FileList fileList) {
		this.fileList = fileList;
	}

	public static class FileList {

		private List<File> files;

		private Pagination pagination;

		public List<File> getFiles() {
			return this.files;
		}

		public void setFiles(List<File> files) {
			this.files = files;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class File {

			private Long id;

			private String name;

			private Long contentId;

			private Integer status;

			private Long gmtCreate;

			private Long gmtModified;

			private String description;

			private Long sandboxDeployTime;

			private Long productionDeployTime;

			private Integer sandboxDeployStatus;

			private Integer productionDeployStatus;

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

			public Long getContentId() {
				return this.contentId;
			}

			public void setContentId(Long contentId) {
				this.contentId = contentId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getSandboxDeployTime() {
				return this.sandboxDeployTime;
			}

			public void setSandboxDeployTime(Long sandboxDeployTime) {
				this.sandboxDeployTime = sandboxDeployTime;
			}

			public Long getProductionDeployTime() {
				return this.productionDeployTime;
			}

			public void setProductionDeployTime(Long productionDeployTime) {
				this.productionDeployTime = productionDeployTime;
			}

			public Integer getSandboxDeployStatus() {
				return this.sandboxDeployStatus;
			}

			public void setSandboxDeployStatus(Integer sandboxDeployStatus) {
				this.sandboxDeployStatus = sandboxDeployStatus;
			}

			public Integer getProductionDeployStatus() {
				return this.productionDeployStatus;
			}

			public void setProductionDeployStatus(Integer productionDeployStatus) {
				this.productionDeployStatus = productionDeployStatus;
			}
		}

		public static class Pagination {

			private Integer pageIndex;

			private Integer pageSize;

			private Integer totalCount;

			private Integer totalPageCount;

			public Integer getPageIndex() {
				return this.pageIndex;
			}

			public void setPageIndex(Integer pageIndex) {
				this.pageIndex = pageIndex;
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

			public Integer getTotalPageCount() {
				return this.totalPageCount;
			}

			public void setTotalPageCount(Integer totalPageCount) {
				this.totalPageCount = totalPageCount;
			}
		}
	}

	@Override
	public ListFunctionFilesResponse getInstance(UnmarshallerContext context) {
		return	ListFunctionFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
