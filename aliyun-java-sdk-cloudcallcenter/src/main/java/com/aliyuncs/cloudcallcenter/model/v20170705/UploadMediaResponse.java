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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.UploadMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadMediaResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private UploadParams uploadParams;

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

	public UploadParams getUploadParams() {
		return this.uploadParams;
	}

	public void setUploadParams(UploadParams uploadParams) {
		this.uploadParams = uploadParams;
	}

	public static class UploadParams {

		private String instance;

		private String name;

		private String fileName;

		private Boolean needsUpload;

		private String accessId;

		private String policy;

		private String signature;

		private String expire;

		private String callback;

		private String folder;

		private String host;

		private Media media;

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

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Boolean getNeedsUpload() {
			return this.needsUpload;
		}

		public void setNeedsUpload(Boolean needsUpload) {
			this.needsUpload = needsUpload;
		}

		public String getAccessId() {
			return this.accessId;
		}

		public void setAccessId(String accessId) {
			this.accessId = accessId;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public String getSignature() {
			return this.signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public String getExpire() {
			return this.expire;
		}

		public void setExpire(String expire) {
			this.expire = expire;
		}

		public String getCallback() {
			return this.callback;
		}

		public void setCallback(String callback) {
			this.callback = callback;
		}

		public String getFolder() {
			return this.folder;
		}

		public void setFolder(String folder) {
			this.folder = folder;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public Media getMedia() {
			return this.media;
		}

		public void setMedia(Media media) {
			this.media = media;
		}

		public static class Media {

			private Long id;

			private String instance;

			private String name;

			private String description;

			private String type;

			private String content;

			private String filePath;

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
		}
	}

	@Override
	public UploadMediaResponse getInstance(UnmarshallerContext context) {
		return	UploadMediaResponseUnmarshaller.unmarshall(this, context);
	}
}
