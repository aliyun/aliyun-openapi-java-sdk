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

package com.aliyuncs.cdt.model.v20210813;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdt.transform.v20210813.ListCdtTrafficTiersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCdtTrafficTiersResponse extends AcsResponse {

	private String requestId;

	private List<TrafficTiersItem> trafficTiers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrafficTiersItem> getTrafficTiers() {
		return this.trafficTiers;
	}

	public void setTrafficTiers(List<TrafficTiersItem> trafficTiers) {
		this.trafficTiers = trafficTiers;
	}

	public static class TrafficTiersItem {

		private Long lowestTraffic;

		private Long highestTraffic;

		private Long tier;

		public Long getLowestTraffic() {
			return this.lowestTraffic;
		}

		public void setLowestTraffic(Long lowestTraffic) {
			this.lowestTraffic = lowestTraffic;
		}

		public Long getHighestTraffic() {
			return this.highestTraffic;
		}

		public void setHighestTraffic(Long highestTraffic) {
			this.highestTraffic = highestTraffic;
		}

		public Long getTier() {
			return this.tier;
		}

		public void setTier(Long tier) {
			this.tier = tier;
		}
	}

	@Override
	public ListCdtTrafficTiersResponse getInstance(UnmarshallerContext context) {
		return	ListCdtTrafficTiersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
