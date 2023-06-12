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
import com.aliyuncs.csas.transform.v20230120.ListPolicesForUserGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPolicesForUserGroupResponse extends AcsResponse {

	private String requestId;

	private List<UserGroup> userGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserGroup> getUserGroups() {
		return this.userGroups;
	}

	public void setUserGroups(List<UserGroup> userGroups) {
		this.userGroups = userGroups;
	}

	public static class UserGroup {

		private String userGroupId;

		private List<Policy> polices;

		public String getUserGroupId() {
			return this.userGroupId;
		}

		public void setUserGroupId(String userGroupId) {
			this.userGroupId = userGroupId;
		}

		public List<Policy> getPolices() {
			return this.polices;
		}

		public void setPolices(List<Policy> polices) {
			this.polices = polices;
		}

		public static class Policy {

			private String policyId;

			private String policyType;

			private String name;

			public String getPolicyId() {
				return this.policyId;
			}

			public void setPolicyId(String policyId) {
				this.policyId = policyId;
			}

			public String getPolicyType() {
				return this.policyType;
			}

			public void setPolicyType(String policyType) {
				this.policyType = policyType;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListPolicesForUserGroupResponse getInstance(UnmarshallerContext context) {
		return	ListPolicesForUserGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
