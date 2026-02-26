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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListOrganizationMembersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOrganizationMembersResponse extends AcsResponse {

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private String nextToken;

	private Long totalCount;

	private List<Member> members;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Member> getMembers() {
		return this.members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public static class Member {

		private String accountId;

		private Long birthday;

		private String email;

		private Long hiredDate;

		private Long joinTime;

		private Long lastVisitTime;

		private String mobile;

		private String organizationMemberName;

		private String organizationRoleName;

		private String organizationRoleId;

		private String state;

		private String jobNumber;

		private List<String> deptLists;

		private Identities identities;

		public String getAccountId() {
			return this.accountId;
		}

		public void setAccountId(String accountId) {
			this.accountId = accountId;
		}

		public Long getBirthday() {
			return this.birthday;
		}

		public void setBirthday(Long birthday) {
			this.birthday = birthday;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getHiredDate() {
			return this.hiredDate;
		}

		public void setHiredDate(Long hiredDate) {
			this.hiredDate = hiredDate;
		}

		public Long getJoinTime() {
			return this.joinTime;
		}

		public void setJoinTime(Long joinTime) {
			this.joinTime = joinTime;
		}

		public Long getLastVisitTime() {
			return this.lastVisitTime;
		}

		public void setLastVisitTime(Long lastVisitTime) {
			this.lastVisitTime = lastVisitTime;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getOrganizationMemberName() {
			return this.organizationMemberName;
		}

		public void setOrganizationMemberName(String organizationMemberName) {
			this.organizationMemberName = organizationMemberName;
		}

		public String getOrganizationRoleName() {
			return this.organizationRoleName;
		}

		public void setOrganizationRoleName(String organizationRoleName) {
			this.organizationRoleName = organizationRoleName;
		}

		public String getOrganizationRoleId() {
			return this.organizationRoleId;
		}

		public void setOrganizationRoleId(String organizationRoleId) {
			this.organizationRoleId = organizationRoleId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getJobNumber() {
			return this.jobNumber;
		}

		public void setJobNumber(String jobNumber) {
			this.jobNumber = jobNumber;
		}

		public List<String> getDeptLists() {
			return this.deptLists;
		}

		public void setDeptLists(List<String> deptLists) {
			this.deptLists = deptLists;
		}

		public Identities getIdentities() {
			return this.identities;
		}

		public void setIdentities(Identities identities) {
			this.identities = identities;
		}

		public static class Identities {

			private String externUid;

			private String provider;

			public String getExternUid() {
				return this.externUid;
			}

			public void setExternUid(String externUid) {
				this.externUid = externUid;
			}

			public String getProvider() {
				return this.provider;
			}

			public void setProvider(String provider) {
				this.provider = provider;
			}
		}
	}

	@Override
	public ListOrganizationMembersResponse getInstance(UnmarshallerContext context) {
		return	ListOrganizationMembersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
