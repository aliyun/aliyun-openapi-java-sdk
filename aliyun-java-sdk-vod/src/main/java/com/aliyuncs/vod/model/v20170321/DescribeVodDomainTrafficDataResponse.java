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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodDomainTrafficDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainTrafficDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private String requestId;

	private String domainName;

	private String totalTraffic;

	private String dataInterval;

	private List<DataModule> trafficDataPerInterval;

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

	public String getTotalTraffic() {
		return this.totalTraffic;
	}

	public void setTotalTraffic(String totalTraffic) {
		this.totalTraffic = totalTraffic;
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

		private String httpsDomesticValue;

		private String value;

		private String overseasValue;

		private String httpsValue;

		private String httpsOverseasValue;

		private String timeStamp;

		private String domesticValue;

		public String getHttpsDomesticValue() {
			return this.httpsDomesticValue;
		}

		public void setHttpsDomesticValue(String httpsDomesticValue) {
			this.httpsDomesticValue = httpsDomesticValue;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getOverseasValue() {
			return this.overseasValue;
		}

		public void setOverseasValue(String overseasValue) {
			this.overseasValue = overseasValue;
		}

		public String getHttpsValue() {
			return this.httpsValue;
		}

		public void setHttpsValue(String httpsValue) {
			this.httpsValue = httpsValue;
		}

		public String getHttpsOverseasValue() {
			return this.httpsOverseasValue;
		}

		public void setHttpsOverseasValue(String httpsOverseasValue) {
			this.httpsOverseasValue = httpsOverseasValue;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getDomesticValue() {
			return this.domesticValue;
		}

		public void setDomesticValue(String domesticValue) {
			this.domesticValue = domesticValue;
		}
	}

	@Override
	public DescribeVodDomainTrafficDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodDomainTrafficDataResponseUnmarshaller.unmarshall(this, context);
	}
}
