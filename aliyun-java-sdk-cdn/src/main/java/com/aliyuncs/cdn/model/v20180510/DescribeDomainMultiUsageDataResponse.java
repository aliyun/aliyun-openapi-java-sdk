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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeDomainMultiUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainMultiUsageDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private List<RequestDataModule> requestPerInterval;

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

	public List<RequestDataModule> getRequestPerInterval() {
		return this.requestPerInterval;
	}

	public void setRequestPerInterval(List<RequestDataModule> requestPerInterval) {
		this.requestPerInterval = requestPerInterval;
	}

	public List<TrafficDataModule> getTrafficPerInterval() {
		return this.trafficPerInterval;
	}

	public void setTrafficPerInterval(List<TrafficDataModule> trafficPerInterval) {
		this.trafficPerInterval = trafficPerInterval;
	}

	public static class RequestDataModule {

		private String type;

		private String timeStamp;

		private String domain;

		private Long request;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

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

		public Long getRequest() {
			return this.request;
		}

		public void setRequest(Long request) {
			this.request = request;
		}
	}

	public static class TrafficDataModule {

		private String type;

		private String domain;

		private String timeStamp;

		private String area;

		private Float bps;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
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
	public DescribeDomainMultiUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainMultiUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
