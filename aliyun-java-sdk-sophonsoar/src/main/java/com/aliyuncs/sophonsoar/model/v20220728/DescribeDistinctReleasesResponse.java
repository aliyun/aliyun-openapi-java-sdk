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
import com.aliyuncs.sophonsoar.transform.v20220728.DescribeDistinctReleasesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDistinctReleasesResponse extends AcsResponse {

	private String requestId;

	private List<RecordsItem> records;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordsItem> getRecords() {
		return this.records;
	}

	public void setRecords(List<RecordsItem> records) {
		this.records = records;
	}

	public static class RecordsItem {

		private String description;

		private String taskflowMd5;

		private Integer flowFlag;

		private Integer flowTag;

		private String taskflowType;

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

		public String getTaskflowType() {
			return this.taskflowType;
		}

		public void setTaskflowType(String taskflowType) {
			this.taskflowType = taskflowType;
		}
	}

	@Override
	public DescribeDistinctReleasesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDistinctReleasesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
