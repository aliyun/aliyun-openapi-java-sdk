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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeAccountMaskingPrivilegeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountMaskingPrivilegeResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<UserPrivilegeItem> userPrivilege;

		public List<UserPrivilegeItem> getUserPrivilege() {
			return this.userPrivilege;
		}

		public void setUserPrivilege(List<UserPrivilegeItem> userPrivilege) {
			this.userPrivilege = userPrivilege;
		}

		public static class UserPrivilegeItem {

			private String expireTime;

			private String privilege;

			private String userName;

			public String getExpireTime() {
				return this.expireTime;
			}

			public void setExpireTime(String expireTime) {
				this.expireTime = expireTime;
			}

			public String getPrivilege() {
				return this.privilege;
			}

			public void setPrivilege(String privilege) {
				this.privilege = privilege;
			}

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}
		}
	}

	@Override
	public DescribeAccountMaskingPrivilegeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountMaskingPrivilegeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
