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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.ListFilePermissionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFilePermissionResponse extends AcsResponse {

	private String requestId;

	private List<FilePermission> filePermissions;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FilePermission> getFilePermissions() {
		return this.filePermissions;
	}

	public void setFilePermissions(List<FilePermission> filePermissions) {
		this.filePermissions = filePermissions;
	}

	public static class FilePermission {

		private String roleId;

		private Long expireTime;

		private Boolean disinheritSubGroup;

		private CdsIdentity cdsIdentity;

		public String getRoleId() {
			return this.roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}

		public Long getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(Long expireTime) {
			this.expireTime = expireTime;
		}

		public Boolean getDisinheritSubGroup() {
			return this.disinheritSubGroup;
		}

		public void setDisinheritSubGroup(Boolean disinheritSubGroup) {
			this.disinheritSubGroup = disinheritSubGroup;
		}

		public CdsIdentity getCdsIdentity() {
			return this.cdsIdentity;
		}

		public void setCdsIdentity(CdsIdentity cdsIdentity) {
			this.cdsIdentity = cdsIdentity;
		}

		public static class CdsIdentity {

			private String id;

			private String type;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}
		}
	}

	@Override
	public ListFilePermissionResponse getInstance(UnmarshallerContext context) {
		return	ListFilePermissionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
