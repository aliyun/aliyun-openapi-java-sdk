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

package com.aliyuncs.cloudapi.model.v20160714;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeAuthorizedAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAuthorizedAppsResponse extends AcsResponse {

	private Integer pageNumber;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<AuthorizedApp> authorizedApps;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AuthorizedApp> getAuthorizedApps() {
		return this.authorizedApps;
	}

	public void setAuthorizedApps(List<AuthorizedApp> authorizedApps) {
		this.authorizedApps = authorizedApps;
	}

	public static class AuthorizedApp {

		private String appName;

		private String authorizationSource;

		private String authVaildTime;

		private String description;

		private String authorizedTime;

		private Long appId;

		private String stageName;

		private String stageAlias;

		private String operator;

		private String appDescription;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAuthorizationSource() {
			return this.authorizationSource;
		}

		public void setAuthorizationSource(String authorizationSource) {
			this.authorizationSource = authorizationSource;
		}

		public String getAuthVaildTime() {
			return this.authVaildTime;
		}

		public void setAuthVaildTime(String authVaildTime) {
			this.authVaildTime = authVaildTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAuthorizedTime() {
			return this.authorizedTime;
		}

		public void setAuthorizedTime(String authorizedTime) {
			this.authorizedTime = authorizedTime;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getStageName() {
			return this.stageName;
		}

		public void setStageName(String stageName) {
			this.stageName = stageName;
		}

		public String getStageAlias() {
			return this.stageAlias;
		}

		public void setStageAlias(String stageAlias) {
			this.stageAlias = stageAlias;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getAppDescription() {
			return this.appDescription;
		}

		public void setAppDescription(String appDescription) {
			this.appDescription = appDescription;
		}
	}

	@Override
	public DescribeAuthorizedAppsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAuthorizedAppsResponseUnmarshaller.unmarshall(this, context);
	}
}
