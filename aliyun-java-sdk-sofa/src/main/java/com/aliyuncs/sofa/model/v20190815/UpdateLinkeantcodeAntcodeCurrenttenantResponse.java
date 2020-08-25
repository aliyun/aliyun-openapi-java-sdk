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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.UpdateLinkeantcodeAntcodeCurrenttenantResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeCurrenttenantResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String createdAt;

	private Long id;

	private String name;

	private String path;

	private Long responseStatusCode;

	private String updatedAt;

	private String whileListIp;

	private Permission permission;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public String getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getWhileListIp() {
		return this.whileListIp;
	}

	public void setWhileListIp(String whileListIp) {
		this.whileListIp = whileListIp;
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	public static class Permission {

		private String groupAccess;

		private String projectAccess;

		private String reviewAccess;

		private String tenantAccess;

		public String getGroupAccess() {
			return this.groupAccess;
		}

		public void setGroupAccess(String groupAccess) {
			this.groupAccess = groupAccess;
		}

		public String getProjectAccess() {
			return this.projectAccess;
		}

		public void setProjectAccess(String projectAccess) {
			this.projectAccess = projectAccess;
		}

		public String getReviewAccess() {
			return this.reviewAccess;
		}

		public void setReviewAccess(String reviewAccess) {
			this.reviewAccess = reviewAccess;
		}

		public String getTenantAccess() {
			return this.tenantAccess;
		}

		public void setTenantAccess(String tenantAccess) {
			this.tenantAccess = tenantAccess;
		}
	}

	@Override
	public UpdateLinkeantcodeAntcodeCurrenttenantResponse getInstance(UnmarshallerContext context) {
		return	UpdateLinkeantcodeAntcodeCurrenttenantResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
