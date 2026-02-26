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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnIpaDomainMultiUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnIpaDomainMultiUsageDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private List<TrafficDataModule> trafficPerInterval;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrafficDataModule> getTrafficPerInterval() {
		return this.trafficPerInterval;
	}

	public void setTrafficPerInterval(List<TrafficDataModule> trafficPerInterval) {
		this.trafficPerInterval = trafficPerInterval;
	}

	public static class TrafficDataModule {

		private String timeStamp;

		private String domain;

		private String area;

		private Float bps;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getArea() {
			return this.area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public Float getBps() {
			return this.bps;
		}

		public void setBps(Float bps) {
			this.bps = bps;
		}
	}

	@Override
	public DescribeDcdnIpaDomainMultiUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnIpaDomainMultiUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
