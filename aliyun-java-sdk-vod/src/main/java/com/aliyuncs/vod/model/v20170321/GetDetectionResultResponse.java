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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetDetectionResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDetectionResultResponse extends AcsResponse {

	private String requestId;

	private List<DetectionResult> detectionResultList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DetectionResult> getDetectionResultList() {
		return this.detectionResultList;
	}

	public void setDetectionResultList(List<DetectionResult> detectionResultList) {
		this.detectionResultList = detectionResultList;
	}

	public static class DetectionResult {

		private String status;

		private String platform;

		private String contentType;

		private String collectionTitle;

		private String collectionUrl;

		private String createTime;

		private String uploader;

		private String modifyTime;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getCollectionTitle() {
			return this.collectionTitle;
		}

		public void setCollectionTitle(String collectionTitle) {
			this.collectionTitle = collectionTitle;
		}

		public String getCollectionUrl() {
			return this.collectionUrl;
		}

		public void setCollectionUrl(String collectionUrl) {
			this.collectionUrl = collectionUrl;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUploader() {
			return this.uploader;
		}

		public void setUploader(String uploader) {
			this.uploader = uploader;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public GetDetectionResultResponse getInstance(UnmarshallerContext context) {
		return	GetDetectionResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
