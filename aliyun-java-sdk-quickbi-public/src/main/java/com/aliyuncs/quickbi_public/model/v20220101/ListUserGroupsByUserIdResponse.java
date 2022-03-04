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

package com.aliyuncs.quickbi_public.model.v20220101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20220101.ListUserGroupsByUserIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserGroupsByUserIdResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<Data> result;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String identifiedPath;

		private String parentUsergroupId;

		private String modifiedTime;

		private String createUser;

		private String usergroupName;

		private String createTime;

		private String usergroupDesc;

		private String usergroupId;

		private String modifyUser;

		public String getIdentifiedPath() {
			return this.identifiedPath;
		}

		public void setIdentifiedPath(String identifiedPath) {
			this.identifiedPath = identifiedPath;
		}

		public String getParentUsergroupId() {
			return this.parentUsergroupId;
		}

		public void setParentUsergroupId(String parentUsergroupId) {
			this.parentUsergroupId = parentUsergroupId;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCreateUser() {
			return this.createUser;
		}

		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}

		public String getUsergroupName() {
			return this.usergroupName;
		}

		public void setUsergroupName(String usergroupName) {
			this.usergroupName = usergroupName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUsergroupDesc() {
			return this.usergroupDesc;
		}

		public void setUsergroupDesc(String usergroupDesc) {
			this.usergroupDesc = usergroupDesc;
		}

		public String getUsergroupId() {
			return this.usergroupId;
		}

		public void setUsergroupId(String usergroupId) {
			this.usergroupId = usergroupId;
		}

		public String getModifyUser() {
			return this.modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}
	}

	@Override
	public ListUserGroupsByUserIdResponse getInstance(UnmarshallerContext context) {
		return	ListUserGroupsByUserIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
