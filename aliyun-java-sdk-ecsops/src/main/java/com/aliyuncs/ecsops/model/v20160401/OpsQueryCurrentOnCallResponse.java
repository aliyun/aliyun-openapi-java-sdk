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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryCurrentOnCallResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryCurrentOnCallResponse extends AcsResponse {

	private String requestId;

	private List<OnCallStaffInfo> onCallStaffInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OnCallStaffInfo> getOnCallStaffInfos() {
		return this.onCallStaffInfos;
	}

	public void setOnCallStaffInfos(List<OnCallStaffInfo> onCallStaffInfos) {
		this.onCallStaffInfos = onCallStaffInfos;
	}

	public static class OnCallStaffInfo {

		private String empId;

		private String departmentCnName;

		private String phone;

		private String department;

		private String nickName;

		private String email;

		public String getEmpId() {
			return this.empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getDepartmentCnName() {
			return this.departmentCnName;
		}

		public void setDepartmentCnName(String departmentCnName) {
			this.departmentCnName = departmentCnName;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getDepartment() {
			return this.department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

	@Override
	public OpsQueryCurrentOnCallResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryCurrentOnCallResponseUnmarshaller.unmarshall(this, context);
	}
}
