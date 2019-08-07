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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApplicationsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<Application> applications;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public static class Application {

		private String appId;

		private String appName;

		private String appDescription;

		private String categoryName;

		private String createUsername;

		private String updateUsername;

		private Long createTime;

		private Long updateTime;

		private Integer runningEnvs;

		private Integer totalEnvs;

		private Integer terminatedEnvs;

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getAppDescription() {
			return this.appDescription;
		}

		public void setAppDescription(String appDescription) {
			this.appDescription = appDescription;
		}

		public String getCategoryName() {
			return this.categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}

		public String getCreateUsername() {
			return this.createUsername;
		}

		public void setCreateUsername(String createUsername) {
			this.createUsername = createUsername;
		}

		public String getUpdateUsername() {
			return this.updateUsername;
		}

		public void setUpdateUsername(String updateUsername) {
			this.updateUsername = updateUsername;
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

		public Integer getRunningEnvs() {
			return this.runningEnvs;
		}

		public void setRunningEnvs(Integer runningEnvs) {
			this.runningEnvs = runningEnvs;
		}

		public Integer getTotalEnvs() {
			return this.totalEnvs;
		}

		public void setTotalEnvs(Integer totalEnvs) {
			this.totalEnvs = totalEnvs;
		}

		public Integer getTerminatedEnvs() {
			return this.terminatedEnvs;
		}

		public void setTerminatedEnvs(Integer terminatedEnvs) {
			this.terminatedEnvs = terminatedEnvs;
		}
	}

	@Override
	public DescribeApplicationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeApplicationsResponseUnmarshaller.unmarshall(this, context);
	}
}
