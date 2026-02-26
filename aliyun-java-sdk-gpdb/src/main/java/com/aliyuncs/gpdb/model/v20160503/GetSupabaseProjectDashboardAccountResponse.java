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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.GetSupabaseProjectDashboardAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSupabaseProjectDashboardAccountResponse extends AcsResponse {

	private String requestId;

	private String projectName;

	private String projectId;

	private String dashboardPassword;

	private String dashboardUsername;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getDashboardPassword() {
		return this.dashboardPassword;
	}

	public void setDashboardPassword(String dashboardPassword) {
		this.dashboardPassword = dashboardPassword;
	}

	public String getDashboardUsername() {
		return this.dashboardUsername;
	}

	public void setDashboardUsername(String dashboardUsername) {
		this.dashboardUsername = dashboardUsername;
	}

	@Override
	public GetSupabaseProjectDashboardAccountResponse getInstance(UnmarshallerContext context) {
		return	GetSupabaseProjectDashboardAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
