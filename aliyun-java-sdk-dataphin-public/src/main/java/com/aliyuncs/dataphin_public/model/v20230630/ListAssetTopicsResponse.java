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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.ListAssetTopicsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAssetTopicsResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<Topic> topicList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Topic> getTopicList() {
			return this.topicList;
		}

		public void setTopicList(List<Topic> topicList) {
			this.topicList = topicList;
		}

		public static class Topic {

			private String modifyTime;

			private String assetType;

			private String visibilityType;

			private Long topicId;

			private String topicDescription;

			private String topicName;

			private List<VisibleUserGroup> visibleUserGroups;

			private List<VisibleUser> visibleUsers;

			private List<Owner> owners;

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getAssetType() {
				return this.assetType;
			}

			public void setAssetType(String assetType) {
				this.assetType = assetType;
			}

			public String getVisibilityType() {
				return this.visibilityType;
			}

			public void setVisibilityType(String visibilityType) {
				this.visibilityType = visibilityType;
			}

			public Long getTopicId() {
				return this.topicId;
			}

			public void setTopicId(Long topicId) {
				this.topicId = topicId;
			}

			public String getTopicDescription() {
				return this.topicDescription;
			}

			public void setTopicDescription(String topicDescription) {
				this.topicDescription = topicDescription;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}

			public List<VisibleUserGroup> getVisibleUserGroups() {
				return this.visibleUserGroups;
			}

			public void setVisibleUserGroups(List<VisibleUserGroup> visibleUserGroups) {
				this.visibleUserGroups = visibleUserGroups;
			}

			public List<VisibleUser> getVisibleUsers() {
				return this.visibleUsers;
			}

			public void setVisibleUsers(List<VisibleUser> visibleUsers) {
				this.visibleUsers = visibleUsers;
			}

			public List<Owner> getOwners() {
				return this.owners;
			}

			public void setOwners(List<Owner> owners) {
				this.owners = owners;
			}

			public static class VisibleUserGroup {

				private String userGroupId;

				private String userGroupName;

				public String getUserGroupId() {
					return this.userGroupId;
				}

				public void setUserGroupId(String userGroupId) {
					this.userGroupId = userGroupId;
				}

				public String getUserGroupName() {
					return this.userGroupName;
				}

				public void setUserGroupName(String userGroupName) {
					this.userGroupName = userGroupName;
				}
			}

			public static class VisibleUser {

				private String userName;

				private String userId;

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}
			}

			public static class Owner {

				private String userName;

				private String userId;

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getUserId() {
					return this.userId;
				}

				public void setUserId(String userId) {
					this.userId = userId;
				}
			}
		}
	}

	@Override
	public ListAssetTopicsResponse getInstance(UnmarshallerContext context) {
		return	ListAssetTopicsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
