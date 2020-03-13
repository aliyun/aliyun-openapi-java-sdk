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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CreateBuildpackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateBuildpackResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String buildpackId;

	private List<UploadEndpointsItem> uploadEndpoints;

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

	public String getBuildpackId() {
		return this.buildpackId;
	}

	public void setBuildpackId(String buildpackId) {
		this.buildpackId = buildpackId;
	}

	public List<UploadEndpointsItem> getUploadEndpoints() {
		return this.uploadEndpoints;
	}

	public void setUploadEndpoints(List<UploadEndpointsItem> uploadEndpoints) {
		this.uploadEndpoints = uploadEndpoints;
	}

	public static class UploadEndpointsItem {

		private String accessKeyId;

		private String bucket;

		private String encodedPolicy;

		private String expiration;

		private String filePath;

		private String host;

		private String regionId;

		private String signature;

		private String storageType;

		private String url;

		public String getAccessKeyId() {
			return this.accessKeyId;
		}

		public void setAccessKeyId(String accessKeyId) {
			this.accessKeyId = accessKeyId;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public String getEncodedPolicy() {
			return this.encodedPolicy;
		}

		public void setEncodedPolicy(String encodedPolicy) {
			this.encodedPolicy = encodedPolicy;
		}

		public String getExpiration() {
			return this.expiration;
		}

		public void setExpiration(String expiration) {
			this.expiration = expiration;
		}

		public String getFilePath() {
			return this.filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getHost() {
			return this.host;
		}

		public void setHost(String host) {
			this.host = host;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSignature() {
			return this.signature;
		}

		public void setSignature(String signature) {
			this.signature = signature;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public CreateBuildpackResponse getInstance(UnmarshallerContext context) {
		return	CreateBuildpackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
