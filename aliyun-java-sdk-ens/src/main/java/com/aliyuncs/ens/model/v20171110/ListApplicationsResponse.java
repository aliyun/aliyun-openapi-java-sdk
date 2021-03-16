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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.ListApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<Application> applications;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public static class Application {

		private String clusterName;

		private List<App> appList;

		public String getClusterName() {
			return this.clusterName;
		}

		public void setClusterName(String clusterName) {
			this.clusterName = clusterName;
		}

		public List<App> getAppList() {
			return this.appList;
		}

		public void setAppList(List<App> appList) {
			this.appList = appList;
		}

		public static class App {

			private String appId;

			private String appInfo;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getAppInfo() {
				return this.appInfo;
			}

			public void setAppInfo(String appInfo) {
				this.appInfo = appInfo;
			}
		}
	}

	@Override
	public ListApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationsResponseUnmarshaller.unmarshall(this, context);
	}
}
