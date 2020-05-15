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
import com.aliyuncs.iovcc.transform.v20180501.ListAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppsResponse extends AcsResponse {

	private String requestId;

	private List<AppsItem> apps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AppsItem> getApps() {
		return this.apps;
	}

	public void setApps(List<AppsItem> apps) {
		this.apps = apps;
	}

	public static class AppsItem {

		private String appKey;

		private String appName;

		private String appPackage;

		private Integer osType;

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

		public String getAppPackage() {
			return this.appPackage;
		}

		public void setAppPackage(String appPackage) {
			this.appPackage = appPackage;
		}

		public Integer getOsType() {
			return this.osType;
		}

		public void setOsType(Integer osType) {
			this.osType = osType;
		}
	}

	@Override
	public ListAppsResponse getInstance(UnmarshallerContext context) {
		return	ListAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
