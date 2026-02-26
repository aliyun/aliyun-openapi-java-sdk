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

package com.aliyuncs.eiam.model.v20211201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eiam.transform.v20211201.ListApplicationsForUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListApplicationsForUserResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private List<Application> applications;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Application> getApplications() {
		return this.applications;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public static class Application {

		private String applicationId;

		private Boolean hasDirectAuthorization;

		private Boolean hasInheritAuthorization;

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public Boolean getHasDirectAuthorization() {
			return this.hasDirectAuthorization;
		}

		public void setHasDirectAuthorization(Boolean hasDirectAuthorization) {
			this.hasDirectAuthorization = hasDirectAuthorization;
		}

		public Boolean getHasInheritAuthorization() {
			return this.hasInheritAuthorization;
		}

		public void setHasInheritAuthorization(Boolean hasInheritAuthorization) {
			this.hasInheritAuthorization = hasInheritAuthorization;
		}
	}

	@Override
	public ListApplicationsForUserResponse getInstance(UnmarshallerContext context) {
		return	ListApplicationsForUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
