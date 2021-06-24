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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryFunctionGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryFunctionGroupsResponse extends AcsResponse {

	private String requestId;

	private List<FunctionGroup> functionGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FunctionGroup> getFunctionGroups() {
		return this.functionGroups;
	}

	public void setFunctionGroups(List<FunctionGroup> functionGroups) {
		this.functionGroups = functionGroups;
	}

	public static class FunctionGroup {

		private String parentGroupId;

		private String groupId;

		private String groupName;

		private Integer priority;

		private String groupCategory;

		private Long id;

		public String getParentGroupId() {
			return this.parentGroupId;
		}

		public void setParentGroupId(String parentGroupId) {
			this.parentGroupId = parentGroupId;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public String getGroupCategory() {
			return this.groupCategory;
		}

		public void setGroupCategory(String groupCategory) {
			this.groupCategory = groupCategory;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public OpsQueryFunctionGroupsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryFunctionGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
