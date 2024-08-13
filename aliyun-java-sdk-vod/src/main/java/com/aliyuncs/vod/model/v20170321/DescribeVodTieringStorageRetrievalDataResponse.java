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
import com.aliyuncs.vod.transform.v20170321.DescribeVodTieringStorageRetrievalDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodTieringStorageRetrievalDataResponse extends AcsResponse {

	private String requestId;

	private List<RetrievalDataItem> retrievalData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RetrievalDataItem> getRetrievalData() {
		return this.retrievalData;
	}

	public void setRetrievalData(List<RetrievalDataItem> retrievalData) {
		this.retrievalData = retrievalData;
	}

	public static class RetrievalDataItem {

		private String timeStamp;

		private String region;

		private String storageClass;

		private Long retrievalData;

		private Long cAStdRetrievalData;

		private Long cABulkRetrievalData;

		private Long cAHighPriorRetrievalData;

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

		public Long getRetrievalData() {
			return this.retrievalData;
		}

		public void setRetrievalData(Long retrievalData) {
			this.retrievalData = retrievalData;
		}

		public Long getCAStdRetrievalData() {
			return this.cAStdRetrievalData;
		}

		public void setCAStdRetrievalData(Long cAStdRetrievalData) {
			this.cAStdRetrievalData = cAStdRetrievalData;
		}

		public Long getCABulkRetrievalData() {
			return this.cABulkRetrievalData;
		}

		public void setCABulkRetrievalData(Long cABulkRetrievalData) {
			this.cABulkRetrievalData = cABulkRetrievalData;
		}

		public Long getCAHighPriorRetrievalData() {
			return this.cAHighPriorRetrievalData;
		}

		public void setCAHighPriorRetrievalData(Long cAHighPriorRetrievalData) {
			this.cAHighPriorRetrievalData = cAHighPriorRetrievalData;
		}
	}

	@Override
	public DescribeVodTieringStorageRetrievalDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodTieringStorageRetrievalDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
