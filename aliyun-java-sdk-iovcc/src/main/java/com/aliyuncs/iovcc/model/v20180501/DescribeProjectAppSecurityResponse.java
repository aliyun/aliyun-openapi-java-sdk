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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeProjectAppSecurityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProjectAppSecurityResponse extends AcsResponse {

	private String requestId;

	private ProjectAppSecurity projectAppSecurity;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ProjectAppSecurity getProjectAppSecurity() {
		return this.projectAppSecurity;
	}

	public void setProjectAppSecurity(ProjectAppSecurity projectAppSecurity) {
		this.projectAppSecurity = projectAppSecurity;
	}

	public static class ProjectAppSecurity {

		private Long id;

		private String appId;

		private String appKey;

		private String appSecret;

		private Long gmtCreate;

		private Long gmtModified;

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
	}

	@Override
	public DescribeProjectAppSecurityResponse getInstance(UnmarshallerContext context) {
		return	DescribeProjectAppSecurityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
