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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainBpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private List<DataModule> bpsDataPerInterval;

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

	public List<DataModule> getBpsDataPerInterval() {
		return this.bpsDataPerInterval;
	}

	public void setBpsDataPerInterval(List<DataModule> bpsDataPerInterval) {
		this.bpsDataPerInterval = bpsDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private Float bps;

		private Float dynamicHttpBps;

		private Float dynamicHttpsBps;

		private Float staticHttpBps;

		private Float staticHttpsBps;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Float getBps() {
			return this.bps;
		}

		public void setBps(Float bps) {
			this.bps = bps;
		}

		public Float getDynamicHttpBps() {
			return this.dynamicHttpBps;
		}

		public void setDynamicHttpBps(Float dynamicHttpBps) {
			this.dynamicHttpBps = dynamicHttpBps;
		}

		public Float getDynamicHttpsBps() {
			return this.dynamicHttpsBps;
		}

		public void setDynamicHttpsBps(Float dynamicHttpsBps) {
			this.dynamicHttpsBps = dynamicHttpsBps;
		}

		public Float getStaticHttpBps() {
			return this.staticHttpBps;
		}

		public void setStaticHttpBps(Float staticHttpBps) {
			this.staticHttpBps = staticHttpBps;
		}

		public Float getStaticHttpsBps() {
			return this.staticHttpsBps;
		}

		public void setStaticHttpsBps(Float staticHttpsBps) {
			this.staticHttpsBps = staticHttpsBps;
		}
	}

	@Override
	public DescribeDcdnDomainBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainBpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
