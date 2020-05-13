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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.GenerateSdkDownloadInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateSdkDownloadInfoResponse extends AcsResponse {

	private String requestId;

	private SdkDownloadInfo sdkDownloadInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SdkDownloadInfo getSdkDownloadInfo() {
		return this.sdkDownloadInfo;
	}

	public void setSdkDownloadInfo(SdkDownloadInfo sdkDownloadInfo) {
		this.sdkDownloadInfo = sdkDownloadInfo;
	}

	public static class SdkDownloadInfo {

		private String url;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public GenerateSdkDownloadInfoResponse getInstance(UnmarshallerContext context) {
		return	GenerateSdkDownloadInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
