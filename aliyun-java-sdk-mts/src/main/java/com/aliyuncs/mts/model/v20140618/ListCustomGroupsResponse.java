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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.ListCustomGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCustomGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<CustomGroup> customGroups;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<CustomGroup> getCustomGroups() {
		return this.customGroups;
	}

	public void setCustomGroups(List<CustomGroup> customGroups) {
		this.customGroups = customGroups;
	}

	public static class CustomGroup {

		private String customGroupId;

		private String customGroupName;

		private String customGroupDescription;

		public String getCustomGroupId() {
			return this.customGroupId;
		}

		public void setCustomGroupId(String customGroupId) {
			this.customGroupId = customGroupId;
		}

		public String getCustomGroupName() {
			return this.customGroupName;
		}

		public void setCustomGroupName(String customGroupName) {
			this.customGroupName = customGroupName;
		}

		public String getCustomGroupDescription() {
			return this.customGroupDescription;
		}

		public void setCustomGroupDescription(String customGroupDescription) {
			this.customGroupDescription = customGroupDescription;
		}
	}

	@Override
	public ListCustomGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListCustomGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
