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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeAccessGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccessGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<AccessGroup> accessGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<AccessGroup> getAccessGroups() {
		return this.accessGroups;
	}

	public void setAccessGroups(List<AccessGroup> accessGroups) {
		this.accessGroups = accessGroups;
	}

	public static class AccessGroup {

		private String accessGroupName;

		private String accessGroupType;

		private Integer ruleCount;

		private Integer mountTargetCount;

		private String description;

		public String getAccessGroupName() {
			return this.accessGroupName;
		}

		public void setAccessGroupName(String accessGroupName) {
			this.accessGroupName = accessGroupName;
		}

		public String getAccessGroupType() {
			return this.accessGroupType;
		}

		public void setAccessGroupType(String accessGroupType) {
			this.accessGroupType = accessGroupType;
		}

		public Integer getRuleCount() {
			return this.ruleCount;
		}

		public void setRuleCount(Integer ruleCount) {
			this.ruleCount = ruleCount;
		}

		public Integer getMountTargetCount() {
			return this.mountTargetCount;
		}

		public void setMountTargetCount(Integer mountTargetCount) {
			this.mountTargetCount = mountTargetCount;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public DescribeAccessGroupsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccessGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
