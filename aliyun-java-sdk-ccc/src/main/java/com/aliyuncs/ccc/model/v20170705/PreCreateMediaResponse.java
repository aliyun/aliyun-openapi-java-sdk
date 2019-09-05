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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.PreCreateMediaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreCreateMediaResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private PreCreateMediaParam preCreateMediaParam;

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

	public PreCreateMediaParam getPreCreateMediaParam() {
		return this.preCreateMediaParam;
	}

	public void setPreCreateMediaParam(PreCreateMediaParam preCreateMediaParam) {
		this.preCreateMediaParam = preCreateMediaParam;
	}

	public static class PreCreateMediaParam {

		private String ossFile;

		private String ossFilePath;

		private String ossBucket;

		private String signatureUrl;

		public String getOssFile() {
			return this.ossFile;
		}

		public void setOssFile(String ossFile) {
			this.ossFile = ossFile;
		}

		public String getOssFilePath() {
			return this.ossFilePath;
		}

		public void setOssFilePath(String ossFilePath) {
			this.ossFilePath = ossFilePath;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public String getSignatureUrl() {
			return this.signatureUrl;
		}

		public void setSignatureUrl(String signatureUrl) {
			this.signatureUrl = signatureUrl;
		}
	}

	@Override
	public PreCreateMediaResponse getInstance(UnmarshallerContext context) {
		return	PreCreateMediaResponseUnmarshaller.unmarshall(this, context);
	}
}
