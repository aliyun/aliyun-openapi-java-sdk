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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.ListChangeSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListChangeSetsResponse extends AcsResponse {

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<ChangeSet> changeSets;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public List<ChangeSet> getChangeSets() {
		return this.changeSets;
	}

	public void setChangeSets(List<ChangeSet> changeSets) {
		this.changeSets = changeSets;
	}

	public static class ChangeSet {

		private String changeSetId;

		private String changeSetName;

		private String changeSetType;

		private String createTime;

		private String description;

		private String executionStatus;

		private String regionId;

		private String stackId;

		private String stackName;

		private String status;

		public String getChangeSetId() {
			return this.changeSetId;
		}

		public void setChangeSetId(String changeSetId) {
			this.changeSetId = changeSetId;
		}

		public String getChangeSetName() {
			return this.changeSetName;
		}

		public void setChangeSetName(String changeSetName) {
			this.changeSetName = changeSetName;
		}

		public String getChangeSetType() {
			return this.changeSetType;
		}

		public void setChangeSetType(String changeSetType) {
			this.changeSetType = changeSetType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExecutionStatus() {
			return this.executionStatus;
		}

		public void setExecutionStatus(String executionStatus) {
			this.executionStatus = executionStatus;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStackId() {
			return this.stackId;
		}

		public void setStackId(String stackId) {
			this.stackId = stackId;
		}

		public String getStackName() {
			return this.stackName;
		}

		public void setStackName(String stackName) {
			this.stackName = stackName;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListChangeSetsResponse getInstance(UnmarshallerContext context) {
		return	ListChangeSetsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
