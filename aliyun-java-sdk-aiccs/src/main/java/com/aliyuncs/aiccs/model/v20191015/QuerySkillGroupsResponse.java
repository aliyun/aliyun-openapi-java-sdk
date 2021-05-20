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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.QuerySkillGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QuerySkillGroupsResponse extends AcsResponse {

	private Integer onePageSize;

	private String requestId;

	private Integer totalPage;

	private Integer currentPage;

	private Integer totalResults;

	private List<DataItem> data;

	public Integer getOnePageSize() {
		return this.onePageSize;
	}

	public void setOnePageSize(Integer onePageSize) {
		this.onePageSize = onePageSize;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalResults() {
		return this.totalResults;
	}

	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String skillGroupName;

		private String description;

		private String displayName;

		private Long skillGroupId;

		private Integer channelType;

		public String getSkillGroupName() {
			return this.skillGroupName;
		}

		public void setSkillGroupName(String skillGroupName) {
			this.skillGroupName = skillGroupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public Long getSkillGroupId() {
			return this.skillGroupId;
		}

		public void setSkillGroupId(Long skillGroupId) {
			this.skillGroupId = skillGroupId;
		}

		public Integer getChannelType() {
			return this.channelType;
		}

		public void setChannelType(Integer channelType) {
			this.channelType = channelType;
		}
	}

	@Override
	public QuerySkillGroupsResponse getInstance(UnmarshallerContext context) {
		return	QuerySkillGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
