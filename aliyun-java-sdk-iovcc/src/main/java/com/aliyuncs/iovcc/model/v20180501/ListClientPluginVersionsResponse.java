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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.ListClientPluginVersionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClientPluginVersionsResponse extends AcsResponse {

	private String requestId;

	private List<Result> clientPluginVersions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Result> getClientPluginVersions() {
		return this.clientPluginVersions;
	}

	public void setClientPluginVersions(List<Result> clientPluginVersions) {
		this.clientPluginVersions = clientPluginVersions;
	}

	public static class Result {

		private String pkgName;

		private Long versionCode;

		private String version;

		private Long size;

		private Long id;

		private String downloadUrl;

		public String getPkgName() {
			return this.pkgName;
		}

		public void setPkgName(String pkgName) {
			this.pkgName = pkgName;
		}

		public Long getVersionCode() {
			return this.versionCode;
		}

		public void setVersionCode(Long versionCode) {
			this.versionCode = versionCode;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDownloadUrl() {
			return this.downloadUrl;
		}

		public void setDownloadUrl(String downloadUrl) {
			this.downloadUrl = downloadUrl;
		}
	}

	@Override
	public ListClientPluginVersionsResponse getInstance(UnmarshallerContext context) {
		return	ListClientPluginVersionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
