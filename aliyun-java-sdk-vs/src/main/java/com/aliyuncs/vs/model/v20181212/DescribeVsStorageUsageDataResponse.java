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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVsStorageUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsStorageUsageDataResponse extends AcsResponse {

	private String requestId;

	private List<StorageUsageDataModule> storageUsage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<StorageUsageDataModule> getStorageUsage() {
		return this.storageUsage;
	}

	public void setStorageUsage(List<StorageUsageDataModule> storageUsage) {
		this.storageUsage = storageUsage;
	}

	public static class StorageUsageDataModule {

		private String timeStamp;

		private String bucket;

		private Integer storageDataValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public Integer getStorageDataValue() {
			return this.storageDataValue;
		}

		public void setStorageDataValue(Integer storageDataValue) {
			this.storageDataValue = storageDataValue;
		}
	}

	@Override
	public DescribeVsStorageUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsStorageUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
