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
import com.aliyuncs.iovcc.transform.v20180501.ListProjectAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectAppsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer totalCount;

		private Integer totalPage;

		private List<ProjectApp> projectApps;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Integer totalPage) {
			this.totalPage = totalPage;
		}

		public List<ProjectApp> getProjectApps() {
			return this.projectApps;
		}

		public void setProjectApps(List<ProjectApp> projectApps) {
			this.projectApps = projectApps;
		}

		public static class ProjectApp {

			private Long id;

			private String appId;

			private String userId;

			private String projectId;

			private String appName;

			private String appKey;

			private String appSecret;

			private Integer status;

			private Long gmtCreate;

			private Long gmtModified;

			private String appPkgName;

			private Integer osType;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getProjectId() {
				return this.projectId;
			}

			public void setProjectId(String projectId) {
				this.projectId = projectId;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getAppKey() {
				return this.appKey;
			}

			public void setAppKey(String appKey) {
				this.appKey = appKey;
			}

			public String getAppSecret() {
				return this.appSecret;
			}

			public void setAppSecret(String appSecret) {
				this.appSecret = appSecret;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getAppPkgName() {
				return this.appPkgName;
			}

			public void setAppPkgName(String appPkgName) {
				this.appPkgName = appPkgName;
			}

			public Integer getOsType() {
				return this.osType;
			}

			public void setOsType(Integer osType) {
				this.osType = osType;
			}
		}
	}

	@Override
	public ListProjectAppsResponse getInstance(UnmarshallerContext context) {
		return	ListProjectAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
