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
import com.aliyuncs.csas.transform.v20230120.ListPolicesForPrivateAccessTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPolicesForPrivateAccessTagResponse extends AcsResponse {

	private String requestId;

	private List<Tag> tags;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class Tag {

		private String tagId;

		private List<Policy> polices;

		public String getTagId() {
			return this.tagId;
		}

		public void setTagId(String tagId) {
			this.tagId = tagId;
		}

		public List<Policy> getPolices() {
			return this.polices;
		}

		public void setPolices(List<Policy> polices) {
			this.polices = polices;
		}

		public static class Policy {

			private String policyId;

			private String name;

			private String description;

			private String policyAction;

			private Integer priority;

			private String status;

			private String applicationType;

			private String userGroupType;

			private String createTime;

			private List<CustomUserAttribute> customUserAttributes;

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

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getPolicyAction() {
				return this.policyAction;
			}

			public void setPolicyAction(String policyAction) {
				this.policyAction = policyAction;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getApplicationType() {
				return this.applicationType;
			}

			public void setApplicationType(String applicationType) {
				this.applicationType = applicationType;
			}

			public String getUserGroupType() {
				return this.userGroupType;
			}

			public void setUserGroupType(String userGroupType) {
				this.userGroupType = userGroupType;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public List<CustomUserAttribute> getCustomUserAttributes() {
				return this.customUserAttributes;
			}

			public void setCustomUserAttributes(List<CustomUserAttribute> customUserAttributes) {
				this.customUserAttributes = customUserAttributes;
			}

			public static class CustomUserAttribute {

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
	public ListPolicesForPrivateAccessTagResponse getInstance(UnmarshallerContext context) {
		return	ListPolicesForPrivateAccessTagResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
