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

package com.aliyuncs.pairecservice.model.v20221213;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.ListTrafficControlTargetTrafficHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTrafficControlTargetTrafficHistoryResponse extends AcsResponse {

	private String requestId;

	private String totalCount;

	private List<TrafficControlTaskTrafficHistoriesItem> trafficControlTaskTrafficHistories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<TrafficControlTaskTrafficHistoriesItem> getTrafficControlTaskTrafficHistories() {
		return this.trafficControlTaskTrafficHistories;
	}

	public void setTrafficControlTaskTrafficHistories(List<TrafficControlTaskTrafficHistoriesItem> trafficControlTaskTrafficHistories) {
		this.trafficControlTaskTrafficHistories = trafficControlTaskTrafficHistories;
	}

	public static class TrafficControlTaskTrafficHistoriesItem {

		private String recordTime;

		private String itemId;

		private String experimentId;

		private String trafficControlTargetTraffic;

		private String trafficControlTargetAimTraffic;

		private String trafficControlTaskTraffic;

		public String getRecordTime() {
			return this.recordTime;
		}

		public void setRecordTime(String recordTime) {
			this.recordTime = recordTime;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getTrafficControlTargetTraffic() {
			return this.trafficControlTargetTraffic;
		}

		public void setTrafficControlTargetTraffic(String trafficControlTargetTraffic) {
			this.trafficControlTargetTraffic = trafficControlTargetTraffic;
		}

		public String getTrafficControlTargetAimTraffic() {
			return this.trafficControlTargetAimTraffic;
		}

		public void setTrafficControlTargetAimTraffic(String trafficControlTargetAimTraffic) {
			this.trafficControlTargetAimTraffic = trafficControlTargetAimTraffic;
		}

		public String getTrafficControlTaskTraffic() {
			return this.trafficControlTaskTraffic;
		}

		public void setTrafficControlTaskTraffic(String trafficControlTaskTraffic) {
			this.trafficControlTaskTraffic = trafficControlTaskTraffic;
		}
	}

	@Override
	public ListTrafficControlTargetTrafficHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListTrafficControlTargetTrafficHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
