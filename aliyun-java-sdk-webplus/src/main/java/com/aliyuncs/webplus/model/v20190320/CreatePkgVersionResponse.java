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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.CreatePkgVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreatePkgVersionResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private PkgVersion pkgVersion;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public PkgVersion getPkgVersion() {
		return this.pkgVersion;
	}

	public void setPkgVersion(PkgVersion pkgVersion) {
		this.pkgVersion = pkgVersion;
	}

	public static class PkgVersion {

		private String pkgVersionId;

		private String pkgVersionLabel;

		private String pkgVersionDescription;

		private String appName;

		private String appId;

		private String packageSource;

		private Long createTime;

		private Long updateTime;

		public String getPkgVersionId() {
			return this.pkgVersionId;
		}

		public void setPkgVersionId(String pkgVersionId) {
			this.pkgVersionId = pkgVersionId;
		}

		public String getPkgVersionLabel() {
			return this.pkgVersionLabel;
		}

		public void setPkgVersionLabel(String pkgVersionLabel) {
			this.pkgVersionLabel = pkgVersionLabel;
		}

		public String getPkgVersionDescription() {
			return this.pkgVersionDescription;
		}

		public void setPkgVersionDescription(String pkgVersionDescription) {
			this.pkgVersionDescription = pkgVersionDescription;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getPackageSource() {
			return this.packageSource;
		}

		public void setPackageSource(String packageSource) {
			this.packageSource = packageSource;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}
	}

	@Override
	public CreatePkgVersionResponse getInstance(UnmarshallerContext context) {
		return	CreatePkgVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
