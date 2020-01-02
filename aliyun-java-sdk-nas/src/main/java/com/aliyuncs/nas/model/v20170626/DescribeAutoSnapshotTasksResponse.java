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
import com.aliyuncs.nas.transform.v20170626.DescribeAutoSnapshotTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAutoSnapshotTasksResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<AutoSnapshotTask> autoSnapshotTasks;

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

	public List<AutoSnapshotTask> getAutoSnapshotTasks() {
		return this.autoSnapshotTasks;
	}

	public void setAutoSnapshotTasks(List<AutoSnapshotTask> autoSnapshotTasks) {
		this.autoSnapshotTasks = autoSnapshotTasks;
	}

	public static class AutoSnapshotTask {

		private String sourceFileSystemId;

		private String autoSnapshotPolicyId;

		public String getSourceFileSystemId() {
			return this.sourceFileSystemId;
		}

		public void setSourceFileSystemId(String sourceFileSystemId) {
			this.sourceFileSystemId = sourceFileSystemId;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}
	}

	@Override
	public DescribeAutoSnapshotTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeAutoSnapshotTasksResponseUnmarshaller.unmarshall(this, context);
	}
}
