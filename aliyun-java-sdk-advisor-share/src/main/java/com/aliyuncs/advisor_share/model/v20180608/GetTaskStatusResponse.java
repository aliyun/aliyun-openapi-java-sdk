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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.GetTaskStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskStatusResponse extends AcsResponse {

	private String requestId;

	private List<ProductTaskStatus> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProductTaskStatus> getData() {
		return this.data;
	}

	public void setData(List<ProductTaskStatus> data) {
		this.data = data;
	}

	public static class ProductTaskStatus {

		private String product;

		private String checkTaskStatus;

		private Integer checkTaskDoingCount;

		private Integer checkTaskFailedCount;

		private Integer checkTaskDoneCount;

		private String resourceSyncTaskStatus;

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getCheckTaskStatus() {
			return this.checkTaskStatus;
		}

		public void setCheckTaskStatus(String checkTaskStatus) {
			this.checkTaskStatus = checkTaskStatus;
		}

		public Integer getCheckTaskDoingCount() {
			return this.checkTaskDoingCount;
		}

		public void setCheckTaskDoingCount(Integer checkTaskDoingCount) {
			this.checkTaskDoingCount = checkTaskDoingCount;
		}

		public Integer getCheckTaskFailedCount() {
			return this.checkTaskFailedCount;
		}

		public void setCheckTaskFailedCount(Integer checkTaskFailedCount) {
			this.checkTaskFailedCount = checkTaskFailedCount;
		}

		public Integer getCheckTaskDoneCount() {
			return this.checkTaskDoneCount;
		}

		public void setCheckTaskDoneCount(Integer checkTaskDoneCount) {
			this.checkTaskDoneCount = checkTaskDoneCount;
		}

		public String getResourceSyncTaskStatus() {
			return this.resourceSyncTaskStatus;
		}

		public void setResourceSyncTaskStatus(String resourceSyncTaskStatus) {
			this.resourceSyncTaskStatus = resourceSyncTaskStatus;
		}
	}

	@Override
	public GetTaskStatusResponse getInstance(UnmarshallerContext context) {
		return	GetTaskStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
