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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudapi.transform.v20160714.DescribeDatasetInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatasetInfoResponse extends AcsResponse {

	private String requestId;

	private DatasetInfo datasetInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DatasetInfo getDatasetInfo() {
		return this.datasetInfo;
	}

	public void setDatasetInfo(DatasetInfo datasetInfo) {
		this.datasetInfo = datasetInfo;
	}

	public static class DatasetInfo {

		private String datasetId;

		private String datasetName;

		private String datasetType;

		private String modifiedTime;

		private String createdTime;

		public String getDatasetId() {
			return this.datasetId;
		}

		public void setDatasetId(String datasetId) {
			this.datasetId = datasetId;
		}

		public String getDatasetName() {
			return this.datasetName;
		}

		public void setDatasetName(String datasetName) {
			this.datasetName = datasetName;
		}

		public String getDatasetType() {
			return this.datasetType;
		}

		public void setDatasetType(String datasetType) {
			this.datasetType = datasetType;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getCreatedTime() {
			return this.createdTime;
		}

		public void setCreatedTime(String createdTime) {
			this.createdTime = createdTime;
		}
	}

	@Override
	public DescribeDatasetInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatasetInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
