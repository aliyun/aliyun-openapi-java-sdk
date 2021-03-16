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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeSnapshotMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeSnapshotMonitorDataResponse extends AcsResponse {

	private String requestId;

	private List<DataPoint> monitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataPoint> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<DataPoint> monitorData) {
		this.monitorData = monitorData;
	}

	public static class DataPoint {

		private String time;

		private Long size;

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}
	}

	@Override
	public OpsDescribeSnapshotMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeSnapshotMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
