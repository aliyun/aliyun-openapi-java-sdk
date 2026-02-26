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

package com.aliyuncs.dfs.model.v20180620;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.ListUserGroupsMappingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserGroupsMappingsResponse extends AcsResponse {

	private String requestId;

	private Boolean hasMore;

	private String nextToken;

	private List<UserGroupsMappingPB> userGroupsMappings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getHasMore() {
		return this.hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<UserGroupsMappingPB> getUserGroupsMappings() {
		return this.userGroupsMappings;
	}

	public void setUserGroupsMappings(List<UserGroupsMappingPB> userGroupsMappings) {
		this.userGroupsMappings = userGroupsMappings;
	}

	public static class UserGroupsMappingPB {

		private String userName;

		private List<String> groupNames;

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public List<String> getGroupNames() {
			return this.groupNames;
		}

		public void setGroupNames(List<String> groupNames) {
			this.groupNames = groupNames;
		}
	}

	@Override
	public ListUserGroupsMappingsResponse getInstance(UnmarshallerContext context) {
		return	ListUserGroupsMappingsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
