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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryMonitorSlsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryMonitorSlsDataResponse extends AcsResponse {

	private String requestId;

	private List<MonitorSlsData> monitorSlsDataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorSlsData> getMonitorSlsDataList() {
		return this.monitorSlsDataList;
	}

	public void setMonitorSlsDataList(List<MonitorSlsData> monitorSlsDataList) {
		this.monitorSlsDataList = monitorSlsDataList;
	}

	public static class MonitorSlsData {

		private String region;

		private String logstore;

		private Long timestamp;

		private String project;

		private String source;

		private String slsData;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getLogstore() {
			return this.logstore;
		}

		public void setLogstore(String logstore) {
			this.logstore = logstore;
		}

		public Long getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Long timestamp) {
			this.timestamp = timestamp;
		}

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getSlsData() {
			return this.slsData;
		}

		public void setSlsData(String slsData) {
			this.slsData = slsData;
		}
	}

	@Override
	public OpsQueryMonitorSlsDataResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryMonitorSlsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
