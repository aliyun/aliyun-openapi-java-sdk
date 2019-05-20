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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.ListMediasWithPublicResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMediasWithPublicResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<PublicMedia> publicMedias;

	private Medias medias;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<PublicMedia> getPublicMedias() {
		return this.publicMedias;
	}

	public void setPublicMedias(List<PublicMedia> publicMedias) {
		this.publicMedias = publicMedias;
	}

	public Medias getMedias() {
		return this.medias;
	}

	public void setMedias(Medias medias) {
		this.medias = medias;
	}

	public static class PublicMedia {

		private Long id;

		private String instance;

		private String name;

		private String description;

		private String type;

		private String content;

		private String filePath;

		private String fileName;

		private String ossFileName;

		private String scope;

		private String status;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getInstance() {
			return this.instance;
		}

		public void setInstance(String instance) {
			this.instance = instance;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getOssFileName() {
			return this.ossFileName;
		}

		public void setOssFileName(String ossFileName) {
			this.ossFileName = ossFileName;
		}

		public String getScope() {
			return this.scope;
		}

		public void setScope(String scope) {
			this.scope = scope;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class Medias {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<Media> list;

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

		public List<Media> getList() {
			return this.list;
		}

		public void setList(List<Media> list) {
			this.list = list;
		}

		public static class Media {

			private String instance;

			private String name;

			private String description;

			private String type;

			private String content;

			private String filePath;

			private String fileName;

			private String ossFileName;

			private String scope;

			private String status;

			public String getInstance() {
				return this.instance;
			}

			public void setInstance(String instance) {
				this.instance = instance;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public String getFilePath() {
				return this.filePath;
			}

			public void setFilePath(String filePath) {
				this.filePath = filePath;
			}

			public String getFileName() {
				return this.fileName;
			}

			public void setFileName(String fileName) {
				this.fileName = fileName;
			}

			public String getOssFileName() {
				return this.ossFileName;
			}

			public void setOssFileName(String ossFileName) {
				this.ossFileName = ossFileName;
			}

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListMediasWithPublicResponse getInstance(UnmarshallerContext context) {
		return	ListMediasWithPublicResponseUnmarshaller.unmarshall(this, context);
	}
}
