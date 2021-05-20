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
import com.aliyuncs.rsimganalys.transform.v20190801.GetImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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

		private String imageName;

		private String appkey;

		private Long fileTime;

		private String description;

		private String aliyunPK;

		private Integer runStatus;

		private String userResolution;

		private String resolution;

		private String uCS;

		private String pixelSize;

		private Integer publishStatus;

		private String publicResult;

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getAppkey() {
			return this.appkey;
		}

		public void setAppkey(String appkey) {
			this.appkey = appkey;
		}

		public Long getFileTime() {
			return this.fileTime;
		}

		public void setFileTime(Long fileTime) {
			this.fileTime = fileTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAliyunPK() {
			return this.aliyunPK;
		}

		public void setAliyunPK(String aliyunPK) {
			this.aliyunPK = aliyunPK;
		}

		public Integer getRunStatus() {
			return this.runStatus;
		}

		public void setRunStatus(Integer runStatus) {
			this.runStatus = runStatus;
		}

		public String getUserResolution() {
			return this.userResolution;
		}

		public void setUserResolution(String userResolution) {
			this.userResolution = userResolution;
		}

		public String getResolution() {
			return this.resolution;
		}

		public void setResolution(String resolution) {
			this.resolution = resolution;
		}

		public String getUCS() {
			return this.uCS;
		}

		public void setUCS(String uCS) {
			this.uCS = uCS;
		}

		public String getPixelSize() {
			return this.pixelSize;
		}

		public void setPixelSize(String pixelSize) {
			this.pixelSize = pixelSize;
		}

		public Integer getPublishStatus() {
			return this.publishStatus;
		}

		public void setPublishStatus(Integer publishStatus) {
			this.publishStatus = publishStatus;
		}

		public String getPublicResult() {
			return this.publicResult;
		}

		public void setPublicResult(String publicResult) {
			this.publicResult = publicResult;
		}
	}

	@Override
	public GetImageResponse getInstance(UnmarshallerContext context) {
		return	GetImageResponseUnmarshaller.unmarshall(this, context);
	}
}
