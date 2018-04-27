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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.GroupFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GroupFacesResponse extends AcsResponse {

	private String requestId;

	private String setId;

	private Integer hasMore;

	private List<GroupsItem> groups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public Integer getHasMore() {
		return this.hasMore;
	}

	public void setHasMore(Integer hasMore) {
		this.hasMore = hasMore;
	}

	public List<GroupsItem> getGroups() {
		return this.groups;
	}

	public void setGroups(List<GroupsItem> groups) {
		this.groups = groups;
	}

	public static class GroupsItem {

		private String faceId;

		private String groupId;

		private String unGroupReason;

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getUnGroupReason() {
			return this.unGroupReason;
		}

		public void setUnGroupReason(String unGroupReason) {
			this.unGroupReason = unGroupReason;
		}
	}

	@Override
	public GroupFacesResponse getInstance(UnmarshallerContext context) {
		return	GroupFacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
