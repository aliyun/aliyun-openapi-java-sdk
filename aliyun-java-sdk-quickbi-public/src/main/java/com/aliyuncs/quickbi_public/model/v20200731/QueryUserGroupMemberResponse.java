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
import com.aliyuncs.quickbi_public.transform.v20200731.QueryUserGroupMemberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserGroupMemberResponse extends AcsResponse {

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

		private String id;

		private String name;

		private Boolean isUserGroup;

		private String parentUserGroupId;

		private String parentUserGroupName;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getIsUserGroup() {
			return this.isUserGroup;
		}

		public void setIsUserGroup(Boolean isUserGroup) {
			this.isUserGroup = isUserGroup;
		}

		public String getParentUserGroupId() {
			return this.parentUserGroupId;
		}

		public void setParentUserGroupId(String parentUserGroupId) {
			this.parentUserGroupId = parentUserGroupId;
		}

		public String getParentUserGroupName() {
			return this.parentUserGroupName;
		}

		public void setParentUserGroupName(String parentUserGroupName) {
			this.parentUserGroupName = parentUserGroupName;
		}
	}

	@Override
	public QueryUserGroupMemberResponse getInstance(UnmarshallerContext context) {
		return	QueryUserGroupMemberResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
