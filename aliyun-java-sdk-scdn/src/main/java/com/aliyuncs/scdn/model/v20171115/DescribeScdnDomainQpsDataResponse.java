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

package com.aliyuncs.scdn.model.v20171115;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDomainQpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDomainQpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private List<DataModule> qpsDataPerInterval;

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

	public List<DataModule> getQpsDataPerInterval() {
		return this.qpsDataPerInterval;
	}

	public void setQpsDataPerInterval(List<DataModule> qpsDataPerInterval) {
		this.qpsDataPerInterval = qpsDataPerInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String qpsValue;

		private String httpQpsValue;

		private String httpsQpsValue;

		private String accValue;

		private String httpAccValue;

		private String httpsAccValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getQpsValue() {
			return this.qpsValue;
		}

		public void setQpsValue(String qpsValue) {
			this.qpsValue = qpsValue;
		}

		public String getHttpQpsValue() {
			return this.httpQpsValue;
		}

		public void setHttpQpsValue(String httpQpsValue) {
			this.httpQpsValue = httpQpsValue;
		}

		public String getHttpsQpsValue() {
			return this.httpsQpsValue;
		}

		public void setHttpsQpsValue(String httpsQpsValue) {
			this.httpsQpsValue = httpsQpsValue;
		}

		public String getAccValue() {
			return this.accValue;
		}

		public void setAccValue(String accValue) {
			this.accValue = accValue;
		}

		public String getHttpAccValue() {
			return this.httpAccValue;
		}

		public void setHttpAccValue(String httpAccValue) {
			this.httpAccValue = httpAccValue;
		}

		public String getHttpsAccValue() {
			return this.httpsAccValue;
		}

		public void setHttpsAccValue(String httpsAccValue) {
			this.httpsAccValue = httpsAccValue;
		}
	}

	@Override
	public DescribeScdnDomainQpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDomainQpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
