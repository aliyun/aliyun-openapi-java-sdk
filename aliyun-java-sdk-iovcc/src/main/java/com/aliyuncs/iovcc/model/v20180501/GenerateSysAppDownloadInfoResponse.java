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
import com.aliyuncs.iovcc.transform.v20180501.GenerateSysAppDownloadInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GenerateSysAppDownloadInfoResponse extends AcsResponse {

	private String requestId;

	private SysAppDownloadInfo sysAppDownloadInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public SysAppDownloadInfo getSysAppDownloadInfo() {
		return this.sysAppDownloadInfo;
	}

	public void setSysAppDownloadInfo(SysAppDownloadInfo sysAppDownloadInfo) {
		this.sysAppDownloadInfo = sysAppDownloadInfo;
	}

	public static class SysAppDownloadInfo {

		private String url;

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	@Override
	public GenerateSysAppDownloadInfoResponse getInstance(UnmarshallerContext context) {
		return	GenerateSysAppDownloadInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
