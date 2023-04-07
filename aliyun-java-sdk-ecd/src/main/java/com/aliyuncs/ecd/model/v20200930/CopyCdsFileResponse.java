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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.CopyCdsFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CopyCdsFileResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private String success;

	private CopyCdsFileModel copyCdsFileModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public CopyCdsFileModel getCopyCdsFileModel() {
		return this.copyCdsFileModel;
	}

	public void setCopyCdsFileModel(CopyCdsFileModel copyCdsFileModel) {
		this.copyCdsFileModel = copyCdsFileModel;
	}

	public static class CopyCdsFileModel {

		private String asyncTaskId;

		private String fileId;

		public String getAsyncTaskId() {
			return this.asyncTaskId;
		}

		public void setAsyncTaskId(String asyncTaskId) {
			this.asyncTaskId = asyncTaskId;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}
	}

	@Override
	public CopyCdsFileResponse getInstance(UnmarshallerContext context) {
		return	CopyCdsFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
