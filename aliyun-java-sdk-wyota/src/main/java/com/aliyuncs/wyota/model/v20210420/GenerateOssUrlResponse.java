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

package com.aliyuncs.wyota.model.v20210420;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.wyota.transform.v20210420.GenerateOssUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateOssUrlResponse extends AcsResponse {

	private String requestId;

	private List<OssUrlList> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OssUrlList> getData() {
		return this.data;
	}

	public void setData(List<OssUrlList> data) {
		this.data = data;
	}

	public static class OssUrlList {

		private String objectName;

		private String downloadUrl;

		public String getObjectName() {
			return this.objectName;
		}

		public void setObjectName(String objectName) {
			this.objectName = objectName;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}
	}

	@Override
	public GenerateOssUrlResponse getInstance(UnmarshallerContext context) {
		return	GenerateOssUrlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
