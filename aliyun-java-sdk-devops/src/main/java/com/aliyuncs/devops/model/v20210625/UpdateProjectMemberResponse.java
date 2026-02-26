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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.UpdateProjectMemberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class UpdateProjectMemberResponse extends AcsResponse {

	private String requestId;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Member member;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Member getMember() {
		return this.member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public static class Member {

		private String id;

		private String roleIdentifier;

		private String userIdentifier;

		private String userType;

		private String targetType;

		private Long gmtCreate;

		private Long gmtModified;

		private String targetIdentifier;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRoleIdentifier() {
			return this.roleIdentifier;
		}

		public void setRoleIdentifier(String roleIdentifier) {
			this.roleIdentifier = roleIdentifier;
		}

		public String getUserIdentifier() {
			return this.userIdentifier;
		}

		public void setUserIdentifier(String userIdentifier) {
			this.userIdentifier = userIdentifier;
		}

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
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

		public String getTargetIdentifier() {
			return this.targetIdentifier;
		}

		public void setTargetIdentifier(String targetIdentifier) {
			this.targetIdentifier = targetIdentifier;
		}
	}

	@Override
	public UpdateProjectMemberResponse getInstance(UnmarshallerContext context) {
		return	UpdateProjectMemberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
