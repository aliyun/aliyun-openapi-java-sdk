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

package com.aliyuncs.sophonsoar.model.v20220728;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sophonsoar.transform.v20220728.DescribePlaybookReleasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlaybookReleasesResponse extends AcsResponse {

	private String requestId;

	private List<Data> records;

	private Page page;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getRecords() {
		return this.records;
	}

	public void setRecords(List<Data> records) {
		this.records = records;
	}

	public Page getPage() {
		return this.page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public static class Data {

		private Integer id;

		private Long gmtCreate;

		private Long gmtModified;

		private Long playbookId;

		private String releaseUuid;

		private String creator;

		private String description;

		private String taskflowMd5;

		private Integer flowFlag;

		private Integer flowTag;

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
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

		public Long getPlaybookId() {
			return this.playbookId;
		}

		public void setPlaybookId(Long playbookId) {
			this.playbookId = playbookId;
		}

		public String getReleaseUuid() {
			return this.releaseUuid;
		}

		public void setReleaseUuid(String releaseUuid) {
			this.releaseUuid = releaseUuid;
		}

		public String getCreator() {
			return this.creator;
		}

		public void setCreator(String creator) {
			this.creator = creator;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTaskflowMd5() {
			return this.taskflowMd5;
		}

		public void setTaskflowMd5(String taskflowMd5) {
			this.taskflowMd5 = taskflowMd5;
		}

		public Integer getFlowFlag() {
			return this.flowFlag;
		}

		public void setFlowFlag(Integer flowFlag) {
			this.flowFlag = flowFlag;
		}

		public Integer getFlowTag() {
			return this.flowTag;
		}

		public void setFlowTag(Integer flowTag) {
			this.flowTag = flowTag;
		}
	}

	public static class Page {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

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
	}

	@Override
	public DescribePlaybookReleasesResponse getInstance(UnmarshallerContext context) {
		return	DescribePlaybookReleasesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
