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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetTrafficControlTaskTrafficResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTrafficControlTaskTrafficResponse extends AcsResponse {

	private String requestId;

	private TrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TrafficControlTaskTrafficInfo getTrafficControlTaskTrafficInfo() {
		return this.trafficControlTaskTrafficInfo;
	}

	public void setTrafficControlTaskTrafficInfo(TrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo) {
		this.trafficControlTaskTrafficInfo = trafficControlTaskTrafficInfo;
	}

	public static class TrafficControlTaskTrafficInfo {

		private Map<Object,Object> taskTraffics;

		private List<TargetTrafficsItem> targetTraffics;

		public Map<Object,Object> getTaskTraffics() {
			return this.taskTraffics;
		}

		public void setTaskTraffics(Map<Object,Object> taskTraffics) {
			this.taskTraffics = taskTraffics;
		}

		public List<TargetTrafficsItem> getTargetTraffics() {
			return this.targetTraffics;
		}

		public void setTargetTraffics(List<TargetTrafficsItem> targetTraffics) {
			this.targetTraffics = targetTraffics;
		}

		public static class TargetTrafficsItem {

			private String trafficContorlTargetId;

			private List<Map<Object,Object>> data;

			public String getTrafficContorlTargetId() {
				return this.trafficContorlTargetId;
			}

			public void setTrafficContorlTargetId(String trafficContorlTargetId) {
				this.trafficContorlTargetId = trafficContorlTargetId;
			}

			public List<Map<Object,Object>> getData() {
				return this.data;
			}

			public void setData(List<Map<Object,Object>> data) {
				this.data = data;
			}
		}
	}

	@Override
	public GetTrafficControlTaskTrafficResponse getInstance(UnmarshallerContext context) {
		return	GetTrafficControlTaskTrafficResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
