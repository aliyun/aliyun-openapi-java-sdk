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
import com.aliyuncs.ecd.transform.v20200930.CreateCdsFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCdsFileResponse extends AcsResponse {

	private String requestId;

	private FileModel fileModel;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public FileModel getFileModel() {
		return this.fileModel;
	}

	public void setFileModel(FileModel fileModel) {
		this.fileModel = fileModel;
	}

	public static class FileModel {

		private String uploadUrl;

		private String fileId;

		private String uploadId;

		public String getUploadUrl() {
			return this.uploadUrl;
		}

		public void setUploadUrl(String uploadUrl) {
			this.uploadUrl = uploadUrl;
		}

		public String getFileId() {
			return this.fileId;
		}

		public void setFileId(String fileId) {
			this.fileId = fileId;
		}

		public String getUploadId() {
			return this.uploadId;
		}

		public void setUploadId(String uploadId) {
			this.uploadId = uploadId;
		}
	}

	@Override
	public CreateCdsFileResponse getInstance(UnmarshallerContext context) {
		return	CreateCdsFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
