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
import com.aliyuncs.vod.transform.v20170321.DescribeVodTieringStorageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodTieringStorageDataResponse extends AcsResponse {

	private String requestId;

	private List<DataModule> storageData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getStorageData() {
		return this.storageData;
	}

	public void setStorageData(List<DataModule> storageData) {
		this.storageData = storageData;
	}

	public static class DataModule {

		private String timeStamp;

		private String region;

		private String storageClass;

		private Long storageUtilization;

		private Long lessthanMonthDatasize;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getStorageClass() {
			return this.storageClass;
		}

		public void setStorageClass(String storageClass) {
			this.storageClass = storageClass;
		}

		public Long getStorageUtilization() {
			return this.storageUtilization;
		}

		public void setStorageUtilization(Long storageUtilization) {
			this.storageUtilization = storageUtilization;
		}

		public Long getLessthanMonthDatasize() {
			return this.lessthanMonthDatasize;
		}

		public void setLessthanMonthDatasize(Long lessthanMonthDatasize) {
			this.lessthanMonthDatasize = lessthanMonthDatasize;
		}
	}

	@Override
	public DescribeVodTieringStorageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodTieringStorageDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
