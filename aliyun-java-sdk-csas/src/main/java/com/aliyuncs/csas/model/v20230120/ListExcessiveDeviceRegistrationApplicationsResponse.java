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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListExcessiveDeviceRegistrationApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExcessiveDeviceRegistrationApplicationsResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private List<DataList> applications;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public List<DataList> getApplications() {
		return this.applications;
	}

	public void setApplications(List<DataList> applications) {
		this.applications = applications;
	}

	public static class DataList {

		private String deviceTag;

		private String deviceType;

		private String hostname;

		private String username;

		private String saseUserId;

		private String department;

		private String mac;

		private Boolean isUsed;

		private String status;

		private String createTime;

		private String description;

		private String applicationId;

		public String getDeviceTag() {
			return this.deviceTag;
		}

		public void setDeviceTag(String deviceTag) {
			this.deviceTag = deviceTag;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getHostname() {
			return this.hostname;
		}

		public void setHostname(String hostname) {
			this.hostname = hostname;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getSaseUserId() {
			return this.saseUserId;
		}

		public void setSaseUserId(String saseUserId) {
			this.saseUserId = saseUserId;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
		}

		public Boolean getIsUsed() {
			return this.isUsed;
		}

		public void setIsUsed(Boolean isUsed) {
			this.isUsed = isUsed;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}
	}

	@Override
	public ListExcessiveDeviceRegistrationApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListExcessiveDeviceRegistrationApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
