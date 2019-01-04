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

package com.aliyuncs.ccc.model.v20170705;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.CreateMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateMediaResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private MediaUploadParam mediaUploadParam;

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

	public MediaUploadParam getMediaUploadParam() {
		return this.mediaUploadParam;
	}

	public void setMediaUploadParam(MediaUploadParam mediaUploadParam) {
		this.mediaUploadParam = mediaUploadParam;
	}

	public static class MediaUploadParam {

		private String id;

		private String instance;

		private String name;

		private String fileName;

		private String ossFileName;

		private String ossFilePath;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
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

		public String getOssFilePath() {
			return this.ossFilePath;
		}

		public void setOssFilePath(String ossFilePath) {
			this.ossFilePath = ossFilePath;
		}
	}

	@Override
	public CreateMediaResponse getInstance(UnmarshallerContext context) {
		return	CreateMediaResponseUnmarshaller.unmarshall(this, context);
	}
}
