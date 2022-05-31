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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.CheckServiceLinkedRoleForDeletingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckServiceLinkedRoleForDeletingResponse extends AcsResponse {

	private Boolean deletable;

	private String requestId;

	private Boolean success;

	private String message;

	private String errorCode;

	private String errorMessage;

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private List<RoleUsage> roleUsages;

	public Boolean getDeletable() {
		return this.deletable;
	}

	public void setDeletable(Boolean deletable) {
		this.deletable = deletable;
	}

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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public List<RoleUsage> getRoleUsages() {
		return this.roleUsages;
	}

	public void setRoleUsages(List<RoleUsage> roleUsages) {
		this.roleUsages = roleUsages;
	}

	public static class RoleUsage {

		private String region;

		private String resources;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getResources() {
			return this.resources;
		}

		public void setResources(String resources) {
			this.resources = resources;
		}
	}

	@Override
	public CheckServiceLinkedRoleForDeletingResponse getInstance(UnmarshallerContext context) {
		return	CheckServiceLinkedRoleForDeletingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
