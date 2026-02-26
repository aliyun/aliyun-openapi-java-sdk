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

package com.aliyuncs.ebs.model.v20210730;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ebs.transform.v20210730.DescribeDiskMonitorDataListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiskMonitorDataListResponse extends AcsResponse {

	private String requestId;

	private Long totalCount;

	private String nextToken;

	private List<DiskMonitorData> monitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<DiskMonitorData> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<DiskMonitorData> monitorData) {
		this.monitorData = monitorData;
	}

	public static class DiskMonitorData {

		private String diskId;

		private String timestamp;

		private Long burstIOCount;

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public Long getBurstIOCount() {
			return this.burstIOCount;
		}

		public void setBurstIOCount(Long burstIOCount) {
			this.burstIOCount = burstIOCount;
		}
	}

	@Override
	public DescribeDiskMonitorDataListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiskMonitorDataListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
