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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFilesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<File> fileList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<File> getFileList() {
		return this.fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
	}

	public static class File {

		private Long id;

		private String name;

		private Long projectId;

		private String category;

		private String fileType;

		private String directory;

		private String content;

		private Long gmtCreate;

		private Long gmtModified;

		private String creator;

		private String lastModifier;

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

		public Long getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Long projectId) {
			this.projectId = projectId;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getFileType() {
			return this.fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public String getDirectory() {
			return this.directory;
		}

		public void setDirectory(String directory) {
			this.directory = directory;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
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

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getLastModifier() {
			return this.lastModifier;
		}

		public void setLastModifier(String lastModifier) {
			this.lastModifier = lastModifier;
		}
	}

	@Override
	public ListFilesResponse getInstance(UnmarshallerContext context) {
		return	ListFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
