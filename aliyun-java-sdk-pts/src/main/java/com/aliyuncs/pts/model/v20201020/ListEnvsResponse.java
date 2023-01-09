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

package com.aliyuncs.pts.model.v20201020;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pts.transform.v20201020.ListEnvsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEnvsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private List<Env> envs;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Env> getEnvs() {
		return this.envs;
	}

	public void setEnvs(List<Env> envs) {
		this.envs = envs;
	}

	public static class Env {

		private Long createTime;

		private String envVersion;

		private Long modifiedTime;

		private Long usedCapacity;

		private String envName;

		private String envId;

		private List<File> files;

		private List<PropertiesItem> properties;

		private List<String> runningScenes;

		private List<String> relatedScenes;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getEnvVersion() {
			return this.envVersion;
		}

		public void setEnvVersion(String envVersion) {
			this.envVersion = envVersion;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public Long getUsedCapacity() {
			return this.usedCapacity;
		}

		public void setUsedCapacity(Long usedCapacity) {
			this.usedCapacity = usedCapacity;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public List<File> getFiles() {
			return this.files;
		}

		public void setFiles(List<File> files) {
			this.files = files;
		}

		public List<PropertiesItem> getProperties() {
			return this.properties;
		}

		public void setProperties(List<PropertiesItem> properties) {
			this.properties = properties;
		}

		public List<String> getRunningScenes() {
			return this.runningScenes;
		}

		public void setRunningScenes(List<String> runningScenes) {
			this.runningScenes = runningScenes;
		}

		public List<String> getRelatedScenes() {
			return this.relatedScenes;
		}

		public void setRelatedScenes(List<String> relatedScenes) {
			this.relatedScenes = relatedScenes;
		}

		public static class File {

			private Long fileSize;

			private String md5;

			private String fileName;

			private String fileOssAddress;

			private Long fileId;

			public Long getFileSize() {
				return this.fileSize;
			}

			public void setFileSize(Long fileSize) {
				this.fileSize = fileSize;
			}

			public String getMd5() {
				return this.md5;
			}

			public void setMd5(String md5) {
				this.md5 = md5;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getFileOssAddress() {
				return this.fileOssAddress;
			}

			public void setFileOssAddress(String fileOssAddress) {
				this.fileOssAddress = fileOssAddress;
			}

			public Long getFileId() {
				return this.fileId;
			}

			public void setFileId(Long fileId) {
				this.fileId = fileId;
			}
		}

		public static class PropertiesItem {

			private String name;

			private String value;

			private String description;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
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
	public ListEnvsResponse getInstance(UnmarshallerContext context) {
		return	ListEnvsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
