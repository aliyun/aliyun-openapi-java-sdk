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
import com.aliyuncs.imm.transform.v20170906.ListFaceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFaceGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer nextMarker;

	private List<GroupsItem> groups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(Integer nextMarker) {
		this.nextMarker = nextMarker;
	}

	public List<GroupsItem> getGroups() {
		return this.groups;
	}

	public void setGroups(List<GroupsItem> groups) {
		this.groups = groups;
	}

	public static class GroupsItem {

		private Integer groupId;

		private Integer faceNum;

		public Integer getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		public Integer getFaceNum() {
			return this.faceNum;
		}

		public void setFaceNum(Integer faceNum) {
			this.faceNum = faceNum;
		}
	}

	@Override
	public ListFaceGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListFaceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
