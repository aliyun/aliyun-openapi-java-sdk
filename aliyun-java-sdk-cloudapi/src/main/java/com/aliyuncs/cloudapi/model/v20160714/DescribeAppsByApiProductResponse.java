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
import com.aliyuncs.cloudapi.transform.v20160714.DescribeAppsByApiProductResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppsByApiProductResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<AuthorizedApp> authorizedApps;

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

		private String description;

		private String authValidTime;

		private Long appId;

		private String extend;

		private String authorizedTime;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAuthValidTime() {
			return this.authValidTime;
		}

		public void setAuthValidTime(String authValidTime) {
			this.authValidTime = authValidTime;
		}

		public Long getAppId() {
			return this.appId;
		}

		public void setAppId(Long appId) {
			this.appId = appId;
		}

		public String getExtend() {
			return this.extend;
		}

		public void setExtend(String extend) {
			this.extend = extend;
		}

		public String getAuthorizedTime() {
			return this.authorizedTime;
		}

		public void setAuthorizedTime(String authorizedTime) {
			this.authorizedTime = authorizedTime;
		}
	}

	@Override
	public DescribeAppsByApiProductResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppsByApiProductResponseUnmarshaller.unmarshall(this, context);
	}
}
