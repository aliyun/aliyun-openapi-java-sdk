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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.GetInvokeRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInvokeRoleResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Boolean hasRole;

	private ServiceRole serviceRole;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Boolean getHasRole() {
		return this.hasRole;
	}

	public void setHasRole(Boolean hasRole) {
		this.hasRole = hasRole;
	}

	public ServiceRole getServiceRole() {
		return this.serviceRole;
	}

	public void setServiceRole(ServiceRole serviceRole) {
		this.serviceRole = serviceRole;
	}

	public static class ServiceRole {

		private String roleName;

		private String arn;

		public String getRoleName() {
			return this.roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getArn() {
			return this.arn;
		}

		public void setArn(String arn) {
			this.arn = arn;
		}
	}

	@Override
	public GetInvokeRoleResponse getInstance(UnmarshallerContext context) {
		return	GetInvokeRoleResponseUnmarshaller.unmarshall(this, context);
	}
}
