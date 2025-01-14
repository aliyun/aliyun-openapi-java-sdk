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
import com.aliyuncs.csas.transform.v20230120.ListUninstallApplicationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUninstallApplicationsResponse extends AcsResponse {

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

		private String devTag;

		private String devType;

		private String mac;

		private String hostname;

		private String username;

		private String saseUserId;

		private String department;

		private String reason;

		private String status;

		private String applicationId;

		private Boolean isUninstall;

		private String createTime;

		private String idpName;

		public String getDevTag() {
			return this.devTag;
		}

		public void setDevTag(String devTag) {
			this.devTag = devTag;
		}

		public String getDevType() {
			return this.devType;
		}

		public void setDevType(String devType) {
			this.devType = devType;
		}

		public String getMac() {
			return this.mac;
		}

		public void setMac(String mac) {
			this.mac = mac;
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

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getApplicationId() {
			return this.applicationId;
		}

		public void setApplicationId(String applicationId) {
			this.applicationId = applicationId;
		}

		public Boolean getIsUninstall() {
			return this.isUninstall;
		}

		public void setIsUninstall(Boolean isUninstall) {
			this.isUninstall = isUninstall;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getIdpName() {
			return this.idpName;
		}

		public void setIdpName(String idpName) {
			this.idpName = idpName;
		}
	}

	@Override
	public ListUninstallApplicationsResponse getInstance(UnmarshallerContext context) {
		return	ListUninstallApplicationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
