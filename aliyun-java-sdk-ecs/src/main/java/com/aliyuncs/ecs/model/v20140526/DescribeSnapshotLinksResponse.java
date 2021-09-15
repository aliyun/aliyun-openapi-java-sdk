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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeSnapshotLinksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotLinksResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<SnapshotLink> snapshotLinks;

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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<SnapshotLink> getSnapshotLinks() {
		return this.snapshotLinks;
	}

	public void setSnapshotLinks(List<SnapshotLink> snapshotLinks) {
		this.snapshotLinks = snapshotLinks;
	}

	public static class SnapshotLink {

		private Boolean instantAccess;

		private Long totalSize;

		private String sourceDiskName;

		private Integer sourceDiskSize;

		private String sourceDiskType;

		private String instanceId;

		private String snapshotLinkId;

		private Integer totalCount;

		private String regionId;

		private String sourceDiskId;

		private String instanceName;

		private String category;

		public Boolean getInstantAccess() {
			return this.instantAccess;
		}

		public void setInstantAccess(Boolean instantAccess) {
			this.instantAccess = instantAccess;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}

		public String getSourceDiskName() {
			return this.sourceDiskName;
		}

		public void setSourceDiskName(String sourceDiskName) {
			this.sourceDiskName = sourceDiskName;
		}

		public Integer getSourceDiskSize() {
			return this.sourceDiskSize;
		}

		public void setSourceDiskSize(Integer sourceDiskSize) {
			this.sourceDiskSize = sourceDiskSize;
		}

		public String getSourceDiskType() {
			return this.sourceDiskType;
		}

		public void setSourceDiskType(String sourceDiskType) {
			this.sourceDiskType = sourceDiskType;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getSnapshotLinkId() {
			return this.snapshotLinkId;
		}

		public void setSnapshotLinkId(String snapshotLinkId) {
			this.snapshotLinkId = snapshotLinkId;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getSourceDiskId() {
			return this.sourceDiskId;
		}

		public void setSourceDiskId(String sourceDiskId) {
			this.sourceDiskId = sourceDiskId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
	}

	@Override
	public DescribeSnapshotLinksResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotLinksResponseUnmarshaller.unmarshall(this, context);
	}
}
