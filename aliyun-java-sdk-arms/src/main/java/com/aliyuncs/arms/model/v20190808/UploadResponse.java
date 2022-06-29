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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.UploadResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UploadResponse extends AcsResponse {

	private String requestId;

	private UploadResult uploadResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UploadResult getUploadResult() {
		return this.uploadResult;
	}

	public void setUploadResult(UploadResult uploadResult) {
		this.uploadResult = uploadResult;
	}

	public static class UploadResult {

		private String fid;

		private String fileName;

		private String uploadTime;

		public String getFid() {
			return this.fid;
		}

		public void setFid(String fid) {
			this.fid = fid;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getUploadTime() {
			return this.uploadTime;
		}

		public void setUploadTime(String uploadTime) {
			this.uploadTime = uploadTime;
		}
	}

	@Override
	public UploadResponse getInstance(UnmarshallerContext context) {
		return	UploadResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
