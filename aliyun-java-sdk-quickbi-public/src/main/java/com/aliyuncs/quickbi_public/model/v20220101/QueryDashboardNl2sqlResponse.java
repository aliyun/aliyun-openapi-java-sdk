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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.QueryDashboardNl2sqlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDashboardNl2sqlResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String dashboardName;

		private String dashboardNl2sqlId;

		private String ownerId;

		private List<String> authorities;

		public String getDashboardName() {
			return this.dashboardName;
		}

		public void setDashboardName(String dashboardName) {
			this.dashboardName = dashboardName;
		}

		public String getDashboardNl2sqlId() {
			return this.dashboardNl2sqlId;
		}

		public void setDashboardNl2sqlId(String dashboardNl2sqlId) {
			this.dashboardNl2sqlId = dashboardNl2sqlId;
		}

		public String getOwnerId() {
			return this.ownerId;
		}

		public void setOwnerId(String ownerId) {
			this.ownerId = ownerId;
		}

		public List<String> getAuthorities() {
			return this.authorities;
		}

		public void setAuthorities(List<String> authorities) {
			this.authorities = authorities;
		}
	}

	@Override
	public QueryDashboardNl2sqlResponse getInstance(UnmarshallerContext context) {
		return	QueryDashboardNl2sqlResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
