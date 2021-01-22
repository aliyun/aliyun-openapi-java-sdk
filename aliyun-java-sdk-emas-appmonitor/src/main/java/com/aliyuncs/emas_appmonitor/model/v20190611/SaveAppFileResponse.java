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

package com.aliyuncs.emas_appmonitor.model.v20190611;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emas_appmonitor.transform.v20190611.SaveAppFileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SaveAppFileResponse extends AcsResponse {

	private String requestId;

	private AppFile appFile;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppFile getAppFile() {
		return this.appFile;
	}

	public void setAppFile(AppFile appFile) {
		this.appFile = appFile;
	}

	public static class AppFile {

		private String appVersion;

		private String fileName;

		private String filePath;

		private String fileType;

		private Long id;

		private String uniqueAppId;

		public String getAppVersion() {
			return this.appVersion;
		}

		public void setAppVersion(String appVersion) {
			this.appVersion = appVersion;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileType() {
			return this.fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUniqueAppId() {
			return this.uniqueAppId;
		}

		public void setUniqueAppId(String uniqueAppId) {
			this.uniqueAppId = uniqueAppId;
		}
	}

	@Override
	public SaveAppFileResponse getInstance(UnmarshallerContext context) {
		return	SaveAppFileResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
