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
import com.aliyuncs.csas.transform.v20230120.ListUserGroupsForRegistrationPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserGroupsForRegistrationPolicyResponse extends AcsResponse {

	private String requestId;

	private List<Data> policies;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getPolicies() {
		return this.policies;
	}

	public void setPolicies(List<Data> policies) {
		this.policies = policies;
	}

	public static class Data {

		private String policyId;

		private List<UserGroupsItem> userGroups;

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public List<UserGroupsItem> getUserGroups() {
			return this.userGroups;
		}

		public void setUserGroups(List<UserGroupsItem> userGroups) {
			this.userGroups = userGroups;
		}

		public static class UserGroupsItem {

			private String userGroupId;

			private String name;

			private String description;

			private String createTime;

			private List<AttributesItem> attributes;

			public String getUserGroupId() {
				return this.userGroupId;
			}

			public void setUserGroupId(String userGroupId) {
				this.userGroupId = userGroupId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public List<AttributesItem> getAttributes() {
				return this.attributes;
			}

			public void setAttributes(List<AttributesItem> attributes) {
				this.attributes = attributes;
			}

			public static class AttributesItem {

				private String userGroupType;

				private String relation;

				private String value;

				private Integer idpId;

				public String getUserGroupType() {
					return this.userGroupType;
				}

				public void setUserGroupType(String userGroupType) {
					this.userGroupType = userGroupType;
				}

				public String getRelation() {
					return this.relation;
				}

				public void setRelation(String relation) {
					this.relation = relation;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}

				public Integer getIdpId() {
					return this.idpId;
				}

				public void setIdpId(Integer idpId) {
					this.idpId = idpId;
				}
			}
		}
	}

	@Override
	public ListUserGroupsForRegistrationPolicyResponse getInstance(UnmarshallerContext context) {
		return	ListUserGroupsForRegistrationPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
