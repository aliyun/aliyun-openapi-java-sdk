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

package com.aliyuncs.airegistry.model.v20260317;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.airegistry.transform.v20260317.GetSkillImportFileUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSkillImportFileUrlResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String uploadUrl;

		private String ossObjectName;

		private String contentType;

		private String maxSize;

		public String getUploadUrl() {
			return this.uploadUrl;
		}

		public void setUploadUrl(String uploadUrl) {
			this.uploadUrl = uploadUrl;
		}

		public String getOssObjectName() {
			return this.ossObjectName;
		}

		public void setOssObjectName(String ossObjectName) {
			this.ossObjectName = ossObjectName;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}

		public String getMaxSize() {
			return this.maxSize;
		}

		public void setMaxSize(String maxSize) {
			this.maxSize = maxSize;
		}
	}

	@Override
	public GetSkillImportFileUrlResponse getInstance(UnmarshallerContext context) {
		return	GetSkillImportFileUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
