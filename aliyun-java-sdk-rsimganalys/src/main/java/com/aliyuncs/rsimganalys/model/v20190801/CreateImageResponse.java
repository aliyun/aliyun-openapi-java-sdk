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

package com.aliyuncs.rsimganalys.model.v20190801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rsimganalys.transform.v20190801.CreateImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateImageResponse extends AcsResponse {

	private String requestId;

	private Integer resultCode;

	private String imageId;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String aliyunPK;

		private String description;

		private String downloadPath;

		private String gmtCreate;

		private String gmtModified;

		private Integer imageId;

		private String jobId;

		private String imageName;

		private Integer runStatus;

		private String urlUploadPath;

		private Long fileTime;

		private String statusCode;

		private String statusMessage;

		public String getAliyunPK() {
			return this.aliyunPK;
		}

		public void setAliyunPK(String aliyunPK) {
			this.aliyunPK = aliyunPK;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDownloadPath() {
			return this.downloadPath;
		}

		public void setDownloadPath(String downloadPath) {
			this.downloadPath = downloadPath;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getImageId() {
			return this.imageId;
		}

		public void setImageId(Integer imageId) {
			this.imageId = imageId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public Integer getRunStatus() {
			return this.runStatus;
		}

		public void setRunStatus(Integer runStatus) {
			this.runStatus = runStatus;
		}

		public String getUrlUploadPath() {
			return this.urlUploadPath;
		}

		public void setUrlUploadPath(String urlUploadPath) {
			this.urlUploadPath = urlUploadPath;
		}

		public Long getFileTime() {
			return this.fileTime;
		}

		public void setFileTime(Long fileTime) {
			this.fileTime = fileTime;
		}

		public String getStatusCode() {
			return this.statusCode;
		}

		public void setStatusCode(String statusCode) {
			this.statusCode = statusCode;
		}

		public String getStatusMessage() {
			return this.statusMessage;
		}

		public void setStatusMessage(String statusMessage) {
			this.statusMessage = statusMessage;
		}
	}

	@Override
	public CreateImageResponse getInstance(UnmarshallerContext context) {
		return	CreateImageResponseUnmarshaller.unmarshall(this, context);
	}
}
