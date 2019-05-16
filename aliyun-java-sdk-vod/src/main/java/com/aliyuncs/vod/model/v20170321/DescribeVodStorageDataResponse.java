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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodStorageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodStorageDataResponse extends AcsResponse {

	private String requestId;

	private String dataInterval;

	private List<StorageDataItem> storageData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<StorageDataItem> getStorageData() {
		return this.storageData;
	}

	public void setStorageData(List<StorageDataItem> storageData) {
		this.storageData = storageData;
	}

	public static class StorageDataItem {

		private String timeStamp;

		private String storageUtilization;

		private String networkOut;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getStorageUtilization() {
			return this.storageUtilization;
		}

		public void setStorageUtilization(String storageUtilization) {
			this.storageUtilization = storageUtilization;
		}

		public String getNetworkOut() {
			return this.networkOut;
		}

		public void setNetworkOut(String networkOut) {
			this.networkOut = networkOut;
		}
	}

	@Override
	public DescribeVodStorageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodStorageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
