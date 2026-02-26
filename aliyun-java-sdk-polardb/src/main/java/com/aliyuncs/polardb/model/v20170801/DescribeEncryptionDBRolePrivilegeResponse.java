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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeEncryptionDBRolePrivilegeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEncryptionDBRolePrivilegeResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Boolean success;

	private String dBClusterId;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<RolePrivilegeListItem> rolePrivilegeList;

		public List<RolePrivilegeListItem> getRolePrivilegeList() {
			return this.rolePrivilegeList;
		}

		public void setRolePrivilegeList(List<RolePrivilegeListItem> rolePrivilegeList) {
			this.rolePrivilegeList = rolePrivilegeList;
		}

		public static class RolePrivilegeListItem {

			private String rolePrivilegeName;

			private String negation;

			private String encryption;

			private String notEncryption;

			public String getRolePrivilegeName() {
				return this.rolePrivilegeName;
			}

			public void setRolePrivilegeName(String rolePrivilegeName) {
				this.rolePrivilegeName = rolePrivilegeName;
			}

			public String getNegation() {
				return this.negation;
			}

			public void setNegation(String negation) {
				this.negation = negation;
			}

			public String getEncryption() {
				return this.encryption;
			}

			public void setEncryption(String encryption) {
				this.encryption = encryption;
			}

			public String getNotEncryption() {
				return this.notEncryption;
			}

			public void setNotEncryption(String notEncryption) {
				this.notEncryption = notEncryption;
			}
		}
	}

	@Override
	public DescribeEncryptionDBRolePrivilegeResponse getInstance(UnmarshallerContext context) {
		return	DescribeEncryptionDBRolePrivilegeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
