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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagTrafficTopNResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagTrafficTopNResponse extends AcsResponse {

	private String requestId;

	private List<TrafficTopNItem> trafficTopN;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrafficTopNItem> getTrafficTopN() {
		return this.trafficTopN;
	}

	public void setTrafficTopN(List<TrafficTopNItem> trafficTopN) {
		this.trafficTopN = trafficTopN;
	}

	public static class TrafficTopNItem {

		private String instanceId;

		private String trafficRate;

		private String regionId;

		private String name;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTrafficRate() {
			return this.trafficRate;
		}

		public void setTrafficRate(String trafficRate) {
			this.trafficRate = trafficRate;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DescribeSagTrafficTopNResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagTrafficTopNResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
