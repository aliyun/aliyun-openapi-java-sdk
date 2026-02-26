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
import com.aliyuncs.csas.transform.v20230120.ListUserPrivateAccessPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserPrivateAccessPoliciesResponse extends AcsResponse {

	private String requestId;

	private Integer totalNum;

	private List<Policies> polices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public List<Policies> getPolices() {
		return this.polices;
	}

	public void setPolices(List<Policies> polices) {
		this.polices = polices;
	}

	public static class Policies {

		private String policyId;

		private String name;

		private Long priority;

		private String policyAction;

		private String userGroupMode;

		private String matchedUserGroup;

		private String deviceAttributeName;

		private List<CustomUserAttributesItem> customUserAttributes;

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getPriority() {
			return this.priority;
		}

		public void setPriority(Long priority) {
			this.priority = priority;
		}

		public String getPolicyAction() {
			return this.policyAction;
		}

		public void setPolicyAction(String policyAction) {
			this.policyAction = policyAction;
		}

		public String getUserGroupMode() {
			return this.userGroupMode;
		}

		public void setUserGroupMode(String userGroupMode) {
			this.userGroupMode = userGroupMode;
		}

		public String getMatchedUserGroup() {
			return this.matchedUserGroup;
		}

		public void setMatchedUserGroup(String matchedUserGroup) {
			this.matchedUserGroup = matchedUserGroup;
		}

		public String getDeviceAttributeName() {
			return this.deviceAttributeName;
		}

		public void setDeviceAttributeName(String deviceAttributeName) {
			this.deviceAttributeName = deviceAttributeName;
		}

		public List<CustomUserAttributesItem> getCustomUserAttributes() {
			return this.customUserAttributes;
		}

		public void setCustomUserAttributes(List<CustomUserAttributesItem> customUserAttributes) {
			this.customUserAttributes = customUserAttributes;
		}

		public static class CustomUserAttributesItem {

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

	@Override
	public ListUserPrivateAccessPoliciesResponse getInstance(UnmarshallerContext context) {
		return	ListUserPrivateAccessPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
