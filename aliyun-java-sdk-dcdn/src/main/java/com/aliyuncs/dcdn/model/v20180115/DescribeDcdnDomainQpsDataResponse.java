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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainQpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainQpsDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private String domainName;

	private String dataInterval;

	private List<DataModule> qpsDataPerInterval;

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

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<DataModule> getQpsDataPerInterval() {
		return this.qpsDataPerInterval;
	}

	public void setQpsDataPerInterval(List<DataModule> qpsDataPerInterval) {
		this.qpsDataPerInterval = qpsDataPerInterval;
	}

	public static class DataModule {

		private Float dynamicHttpsAcc;

		private Float dynamicHttpAcc;

		private Float qps;

		private Float staticHttpsAcc;

		private Float staticHttpQps;

		private Float staticHttpAcc;

		private Float dynamicHttpsQps;

		private Float acc;

		private Float staticHttpsQps;

		private Float dynamicHttpQps;

		private String timeStamp;

		public Float getDynamicHttpsAcc() {
			return this.dynamicHttpsAcc;
		}

		public void setDynamicHttpsAcc(Float dynamicHttpsAcc) {
			this.dynamicHttpsAcc = dynamicHttpsAcc;
		}

		public Float getDynamicHttpAcc() {
			return this.dynamicHttpAcc;
		}

		public void setDynamicHttpAcc(Float dynamicHttpAcc) {
			this.dynamicHttpAcc = dynamicHttpAcc;
		}

		public Float getQps() {
			return this.qps;
		}

		public void setQps(Float qps) {
			this.qps = qps;
		}

		public Float getStaticHttpsAcc() {
			return this.staticHttpsAcc;
		}

		public void setStaticHttpsAcc(Float staticHttpsAcc) {
			this.staticHttpsAcc = staticHttpsAcc;
		}

		public Float getStaticHttpQps() {
			return this.staticHttpQps;
		}

		public void setStaticHttpQps(Float staticHttpQps) {
			this.staticHttpQps = staticHttpQps;
		}

		public Float getStaticHttpAcc() {
			return this.staticHttpAcc;
		}

		public void setStaticHttpAcc(Float staticHttpAcc) {
			this.staticHttpAcc = staticHttpAcc;
		}

		public Float getDynamicHttpsQps() {
			return this.dynamicHttpsQps;
		}

		public void setDynamicHttpsQps(Float dynamicHttpsQps) {
			this.dynamicHttpsQps = dynamicHttpsQps;
		}

		public Float getAcc() {
			return this.acc;
		}

		public void setAcc(Float acc) {
			this.acc = acc;
		}

		public Float getStaticHttpsQps() {
			return this.staticHttpsQps;
		}

		public void setStaticHttpsQps(Float staticHttpsQps) {
			this.staticHttpsQps = staticHttpsQps;
		}

		public Float getDynamicHttpQps() {
			return this.dynamicHttpQps;
		}

		public void setDynamicHttpQps(Float dynamicHttpQps) {
			this.dynamicHttpQps = dynamicHttpQps;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeDcdnDomainQpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainQpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
