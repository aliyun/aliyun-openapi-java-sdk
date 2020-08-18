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

package com.aliyuncs.mhub.model.v20170825;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mhub.transform.v20170825.QueryAppInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAppInfoResponse extends AcsResponse {

	private String requestId;

	private AppInfo appInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AppInfo getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}

	public static class AppInfo {

		private String appKey;

		private String appName;

		private Integer type;

		private Boolean readonly;

		private String bundleId;

		private String packageName;

		private Boolean certDevelopAvail;

		private String certDevelopExpiration;

		private Boolean certProductAvail;

		private String certProductExpiration;

		public String getAppKey() {
			return this.appKey;
		}

		public void setAppKey(String appKey) {
			this.appKey = appKey;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}

		public String getBundleId() {
			return this.bundleId;
		}

		public void setBundleId(String bundleId) {
			this.bundleId = bundleId;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public Boolean getCertDevelopAvail() {
			return this.certDevelopAvail;
		}

		public void setCertDevelopAvail(Boolean certDevelopAvail) {
			this.certDevelopAvail = certDevelopAvail;
		}

		public String getCertDevelopExpiration() {
			return this.certDevelopExpiration;
		}

		public void setCertDevelopExpiration(String certDevelopExpiration) {
			this.certDevelopExpiration = certDevelopExpiration;
		}

		public Boolean getCertProductAvail() {
			return this.certProductAvail;
		}

		public void setCertProductAvail(Boolean certProductAvail) {
			this.certProductAvail = certProductAvail;
		}

		public String getCertProductExpiration() {
			return this.certProductExpiration;
		}

		public void setCertProductExpiration(String certProductExpiration) {
			this.certProductExpiration = certProductExpiration;
		}
	}

	@Override
	public QueryAppInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAppInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
