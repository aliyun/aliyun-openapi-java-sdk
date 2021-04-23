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

package com.aliyuncs.quickbi_public.model.v20200731;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200731.GetUserGroupInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserGroupInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

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

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String usergroupId;

		private String usergroupName;

		private String usergroupDesc;

		private String parentUsergroupId;

		private String identifiedPath;

		private String createUser;

		private String modifyUser;

		private String createTime;

		private String modifiedTime;

		public String getUsergroupId() {
			return this.usergroupId;
		}

		public void setUsergroupId(String usergroupId) {
			this.usergroupId = usergroupId;
		}

		public String getUsergroupName() {
			return this.usergroupName;
		}

		public void setUsergroupName(String usergroupName) {
			this.usergroupName = usergroupName;
		}

		public String getUsergroupDesc() {
			return this.usergroupDesc;
		}

		public void setUsergroupDesc(String usergroupDesc) {
			this.usergroupDesc = usergroupDesc;
		}

		public String getParentUsergroupId() {
			return this.parentUsergroupId;
		}

		public void setParentUsergroupId(String parentUsergroupId) {
			this.parentUsergroupId = parentUsergroupId;
		}

		public String getIdentifiedPath() {
			return this.identifiedPath;
		}

		public void setIdentifiedPath(String identifiedPath) {
			this.identifiedPath = identifiedPath;
		}

		public String getCreateUser() {
			return this.createUser;
		}

		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}

		public String getModifyUser() {
			return this.modifyUser;
		}

		public void setModifyUser(String modifyUser) {
			this.modifyUser = modifyUser;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}
	}

	@Override
	public GetUserGroupInfoResponse getInstance(UnmarshallerContext context) {
		return	GetUserGroupInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
