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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeDatabaseResourceUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDatabaseResourceUsageResponse extends AcsResponse {

	private String requestId;

	private List<MonitorData> monitorDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorData> getMonitorDatas() {
		return this.monitorDatas;
	}

	public void setMonitorDatas(List<MonitorData> monitorDatas) {
		this.monitorDatas = monitorDatas;
	}

	public static class MonitorData {

		private String date;

		private Long binlogSize;

		private Long dataSize;

		private Long otherSize;

		private Long totalSize;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Long getBinlogSize() {
			return this.binlogSize;
		}

		public void setBinlogSize(Long binlogSize) {
			this.binlogSize = binlogSize;
		}

		public Long getDataSize() {
			return this.dataSize;
		}

		public void setDataSize(Long dataSize) {
			this.dataSize = dataSize;
		}

		public Long getOtherSize() {
			return this.otherSize;
		}

		public void setOtherSize(Long otherSize) {
			this.otherSize = otherSize;
		}

		public Long getTotalSize() {
			return this.totalSize;
		}

		public void setTotalSize(Long totalSize) {
			this.totalSize = totalSize;
		}
	}

	@Override
	public DescribeDatabaseResourceUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeDatabaseResourceUsageResponseUnmarshaller.unmarshall(this, context);
	}
}
