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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.MetastoreListPartitionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MetastoreListPartitionResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Partition> partitionList;

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

	public List<Partition> getPartitionList() {
		return this.partitionList;
	}

	public void setPartitionList(List<Partition> partitionList) {
		this.partitionList = partitionList;
	}

	public static class Partition {

		private String databaseId;

		private String tableId;

		private String partitionName;

		private String partitionType;

		private String partitionComment;

		private String location;

		private String partitionPath;

		private Integer bucketNum;

		private Long gmtCreate;

		private Long gmtModified;

		public String getDatabaseId() {
			return this.databaseId;
		}

		public void setDatabaseId(String databaseId) {
			this.databaseId = databaseId;
		}

		public String getTableId() {
			return this.tableId;
		}

		public void setTableId(String tableId) {
			this.tableId = tableId;
		}

		public String getPartitionName() {
			return this.partitionName;
		}

		public void setPartitionName(String partitionName) {
			this.partitionName = partitionName;
		}

		public String getPartitionType() {
			return this.partitionType;
		}

		public void setPartitionType(String partitionType) {
			this.partitionType = partitionType;
		}

		public String getPartitionComment() {
			return this.partitionComment;
		}

		public void setPartitionComment(String partitionComment) {
			this.partitionComment = partitionComment;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getPartitionPath() {
			return this.partitionPath;
		}

		public void setPartitionPath(String partitionPath) {
			this.partitionPath = partitionPath;
		}

		public Integer getBucketNum() {
			return this.bucketNum;
		}

		public void setBucketNum(Integer bucketNum) {
			this.bucketNum = bucketNum;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public MetastoreListPartitionResponse getInstance(UnmarshallerContext context) {
		return	MetastoreListPartitionResponseUnmarshaller.unmarshall(this, context);
	}
}
