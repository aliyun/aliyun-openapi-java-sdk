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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainWebsocketTrafficDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainWebsocketTrafficDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private List<DataModule> trafficDataPerInterval;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getTrafficDataPerInterval() {
		return this.trafficDataPerInterval;
	}

	public void setTrafficDataPerInterval(List<DataModule> trafficDataPerInterval) {
		this.trafficDataPerInterval = trafficDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private Float websocketTraffic;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Float getWebsocketTraffic() {
			return this.websocketTraffic;
		}

		public void setWebsocketTraffic(Float websocketTraffic) {
			this.websocketTraffic = websocketTraffic;
		}
	}

	@Override
	public DescribeDcdnDomainWebsocketTrafficDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainWebsocketTrafficDataResponseUnmarshaller.unmarshall(this, context);
	}
}
