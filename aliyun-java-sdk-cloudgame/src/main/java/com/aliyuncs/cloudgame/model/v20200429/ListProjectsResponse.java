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

package com.aliyuncs.cloudgame.model.v20200429;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudgame.transform.v20200429.ListProjectsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectsResponse extends AcsResponse {

	private Integer count;

	private Integer currentPage;

	private Integer pageSize;

	private String requestId;

	private List<DataListItem> dataList;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
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

	public List<DataListItem> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<DataListItem> dataList) {
		this.dataList = dataList;
	}

	public static class DataListItem {

		private String standardCodeRate;

		private String highDefinitionResolution;

		private String highDefinitionCodeRate;

		private String standardResolution;

		private String projectId;

		private Integer concurrencyLimitNumber;

		private String highestCodeRate;

		private String projectName;

		private String highestResolution;

		public String getStandardCodeRate() {
			return this.standardCodeRate;
		}

		public void setStandardCodeRate(String standardCodeRate) {
			this.standardCodeRate = standardCodeRate;
		}

		public String getHighDefinitionResolution() {
			return this.highDefinitionResolution;
		}

		public void setHighDefinitionResolution(String highDefinitionResolution) {
			this.highDefinitionResolution = highDefinitionResolution;
		}

		public String getHighDefinitionCodeRate() {
			return this.highDefinitionCodeRate;
		}

		public void setHighDefinitionCodeRate(String highDefinitionCodeRate) {
			this.highDefinitionCodeRate = highDefinitionCodeRate;
		}

		public String getStandardResolution() {
			return this.standardResolution;
		}

		public void setStandardResolution(String standardResolution) {
			this.standardResolution = standardResolution;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public Integer getConcurrencyLimitNumber() {
			return this.concurrencyLimitNumber;
		}

		public void setConcurrencyLimitNumber(Integer concurrencyLimitNumber) {
			this.concurrencyLimitNumber = concurrencyLimitNumber;
		}

		public String getHighestCodeRate() {
			return this.highestCodeRate;
		}

		public void setHighestCodeRate(String highestCodeRate) {
			this.highestCodeRate = highestCodeRate;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getHighestResolution() {
			return this.highestResolution;
		}

		public void setHighestResolution(String highestResolution) {
			this.highestResolution = highestResolution;
		}
	}

	@Override
	public ListProjectsResponse getInstance(UnmarshallerContext context) {
		return	ListProjectsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
