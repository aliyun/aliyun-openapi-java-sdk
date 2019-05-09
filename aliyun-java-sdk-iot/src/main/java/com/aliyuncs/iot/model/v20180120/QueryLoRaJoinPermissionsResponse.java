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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryLoRaJoinPermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLoRaJoinPermissionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private String productKey;

	private List<JoinPermission> joinPermissions;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public List<JoinPermission> getJoinPermissions() {
		return this.joinPermissions;
	}

	public void setJoinPermissions(List<JoinPermission> joinPermissions) {
		this.joinPermissions = joinPermissions;
	}

	public static class JoinPermission {

		private String joinPermissionId;

		private String joinPermissionName;

		private String joinPermissionType;

		private String ownerAliyunPk;

		private Boolean enabled;

		private String classMode;

		public String getJoinPermissionId() {
			return this.joinPermissionId;
		}

		public void setJoinPermissionId(String joinPermissionId) {
			this.joinPermissionId = joinPermissionId;
		}

		public String getJoinPermissionName() {
			return this.joinPermissionName;
		}

		public void setJoinPermissionName(String joinPermissionName) {
			this.joinPermissionName = joinPermissionName;
		}

		public String getJoinPermissionType() {
			return this.joinPermissionType;
		}

		public void setJoinPermissionType(String joinPermissionType) {
			this.joinPermissionType = joinPermissionType;
		}

		public String getOwnerAliyunPk() {
			return this.ownerAliyunPk;
		}

		public void setOwnerAliyunPk(String ownerAliyunPk) {
			this.ownerAliyunPk = ownerAliyunPk;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getClassMode() {
			return this.classMode;
		}

		public void setClassMode(String classMode) {
			this.classMode = classMode;
		}
	}

	@Override
	public QueryLoRaJoinPermissionsResponse getInstance(UnmarshallerContext context) {
		return	QueryLoRaJoinPermissionsResponseUnmarshaller.unmarshall(this, context);
	}
}
