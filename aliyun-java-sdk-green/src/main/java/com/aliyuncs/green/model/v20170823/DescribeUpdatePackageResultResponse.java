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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeUpdatePackageResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpdatePackageResultResponse extends AcsResponse {

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

		private Long id;

		private String name;

		private String packageName;

		private String icon;

		private String startDate;

		private String endDate;

		private Integer type;

		private PackageInfo packageInfo;

		private DebugPackageInfo debugPackageInfo;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPackageName() {
			return this.packageName;
		}

		public void setPackageName(String packageName) {
			this.packageName = packageName;
		}

		public String getIcon() {
			return this.icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public PackageInfo getPackageInfo() {
			return this.packageInfo;
		}

		public void setPackageInfo(PackageInfo packageInfo) {
			this.packageInfo = packageInfo;
		}

		public DebugPackageInfo getDebugPackageInfo() {
			return this.debugPackageInfo;
		}

		public void setDebugPackageInfo(DebugPackageInfo debugPackageInfo) {
			this.debugPackageInfo = debugPackageInfo;
		}

		public static class PackageInfo {

			private String version;

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}

		public static class DebugPackageInfo {

			private String version;

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public DescribeUpdatePackageResultResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpdatePackageResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
