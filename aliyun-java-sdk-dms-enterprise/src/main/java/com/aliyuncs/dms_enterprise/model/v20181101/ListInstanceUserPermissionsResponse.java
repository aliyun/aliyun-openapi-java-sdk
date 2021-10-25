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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListInstanceUserPermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceUserPermissionsResponse extends AcsResponse {

	private Long totalCount;

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<UserPermission> userPermissions;

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<UserPermission> getUserPermissions() {
		return this.userPermissions;
	}

	public void setUserPermissions(List<UserPermission> userPermissions) {
		this.userPermissions = userPermissions;
	}

	public static class UserPermission {

		private String userId;

		private String userNickName;

		private String instanceId;

		private List<PermDetail> permDetails;

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getUserNickName() {
			return this.userNickName;
		}

		public void setUserNickName(String userNickName) {
			this.userNickName = userNickName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public List<PermDetail> getPermDetails() {
			return this.permDetails;
		}

		public void setPermDetails(List<PermDetail> permDetails) {
			this.permDetails = permDetails;
		}

		public static class PermDetail {

			private String originFrom;

			private String permType;

			private String expireDate;

			private String createDate;

			private String userAccessId;

			private String extraData;

			public String getOriginFrom() {
				return this.originFrom;
			}

			public void setOriginFrom(String originFrom) {
				this.originFrom = originFrom;
			}

			public String getPermType() {
				return this.permType;
			}

			public void setPermType(String permType) {
				this.permType = permType;
			}

			public String getExpireDate() {
				return this.expireDate;
			}

			public void setExpireDate(String expireDate) {
				this.expireDate = expireDate;
			}

			public String getCreateDate() {
				return this.createDate;
			}

			public void setCreateDate(String createDate) {
				this.createDate = createDate;
			}

			public String getUserAccessId() {
				return this.userAccessId;
			}

			public void setUserAccessId(String userAccessId) {
				this.userAccessId = userAccessId;
			}

			public String getExtraData() {
				return this.extraData;
			}

			public void setExtraData(String extraData) {
				this.extraData = extraData;
			}
		}
	}

	@Override
	public ListInstanceUserPermissionsResponse getInstance(UnmarshallerContext context) {
		return	ListInstanceUserPermissionsResponseUnmarshaller.unmarshall(this, context);
	}
}
