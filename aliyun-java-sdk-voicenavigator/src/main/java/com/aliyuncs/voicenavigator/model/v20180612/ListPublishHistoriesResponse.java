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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.ListPublishHistoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPublishHistoriesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<PublishHistoriesItem> publishHistories;

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

	public List<PublishHistoriesItem> getPublishHistories() {
		return this.publishHistories;
	}

	public void setPublishHistories(List<PublishHistoriesItem> publishHistories) {
		this.publishHistories = publishHistories;
	}

	public static class PublishHistoriesItem {

		private String instanceId;

		private String version;

		private String publishUserName;

		private Long publishTime;

		private Boolean isRollbackApplicable;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getPublishUserName() {
			return this.publishUserName;
		}

		public void setPublishUserName(String publishUserName) {
			this.publishUserName = publishUserName;
		}

		public Long getPublishTime() {
			return this.publishTime;
		}

		public void setPublishTime(Long publishTime) {
			this.publishTime = publishTime;
		}

		public Boolean getIsRollbackApplicable() {
			return this.isRollbackApplicable;
		}

		public void setIsRollbackApplicable(Boolean isRollbackApplicable) {
			this.isRollbackApplicable = isRollbackApplicable;
		}
	}

	@Override
	public ListPublishHistoriesResponse getInstance(UnmarshallerContext context) {
		return	ListPublishHistoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
