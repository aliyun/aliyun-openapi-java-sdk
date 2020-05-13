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
import com.aliyuncs.iovcc.transform.v20180501.ListApiGatewayAppsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApiGatewayAppsResponse extends AcsResponse {

	private String requestId;

	private List<Result> apiGatewayApps;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Result> getApiGatewayApps() {
		return this.apiGatewayApps;
	}

	public void setApiGatewayApps(List<Result> apiGatewayApps) {
		this.apiGatewayApps = apiGatewayApps;
	}

	public static class Result {

		private Long id;

		private String projectId;

		private String userId;

		private Integer status;

		private Long gmtCreate;

		private Long gmtModified;

		private String gatewayAppKey;

		private String gatewayAppSecret;

		private String gatewayAppId;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
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

		public String getGatewayAppKey() {
			return this.gatewayAppKey;
		}

		public void setGatewayAppKey(String gatewayAppKey) {
			this.gatewayAppKey = gatewayAppKey;
		}

		public String getGatewayAppSecret() {
			return this.gatewayAppSecret;
		}

		public void setGatewayAppSecret(String gatewayAppSecret) {
			this.gatewayAppSecret = gatewayAppSecret;
		}

		public String getGatewayAppId() {
			return this.gatewayAppId;
		}

		public void setGatewayAppId(String gatewayAppId) {
			this.gatewayAppId = gatewayAppId;
		}
	}

	@Override
	public ListApiGatewayAppsResponse getInstance(UnmarshallerContext context) {
		return	ListApiGatewayAppsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
