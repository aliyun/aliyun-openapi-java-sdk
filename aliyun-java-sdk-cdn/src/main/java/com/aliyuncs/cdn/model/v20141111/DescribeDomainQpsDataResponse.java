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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainQpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainQpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private List<DataModule> qpsDataInterval;

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

	public List<DataModule> getQpsDataInterval() {
		return this.qpsDataInterval;
	}

	public void setQpsDataInterval(List<DataModule> qpsDataInterval) {
		this.qpsDataInterval = qpsDataInterval;
	}

	public static class DataModule {

		private String timeStamp;

		private String value;

		private String domesticValue;

		private String overseasValue;

		private String accValue;

		private String accDomesticValue;

		private String accOverseasValue;

		private String dynamicValue;

		private String dynamicDomesticValue;

		private String dynamicOverseasValue;

		private String staticValue;

		private String staticDomesticValue;

		private String staticOverseasValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDomesticValue() {
			return this.domesticValue;
		}

		public void setDomesticValue(String domesticValue) {
			this.domesticValue = domesticValue;
		}

		public String getOverseasValue() {
			return this.overseasValue;
		}

		public void setOverseasValue(String overseasValue) {
			this.overseasValue = overseasValue;
		}

		public String getAccValue() {
			return this.accValue;
		}

		public void setAccValue(String accValue) {
			this.accValue = accValue;
		}

		public String getAccDomesticValue() {
			return this.accDomesticValue;
		}

		public void setAccDomesticValue(String accDomesticValue) {
			this.accDomesticValue = accDomesticValue;
		}

		public String getAccOverseasValue() {
			return this.accOverseasValue;
		}

		public void setAccOverseasValue(String accOverseasValue) {
			this.accOverseasValue = accOverseasValue;
		}

		public String getDynamicValue() {
			return this.dynamicValue;
		}

		public void setDynamicValue(String dynamicValue) {
			this.dynamicValue = dynamicValue;
		}

		public String getDynamicDomesticValue() {
			return this.dynamicDomesticValue;
		}

		public void setDynamicDomesticValue(String dynamicDomesticValue) {
			this.dynamicDomesticValue = dynamicDomesticValue;
		}

		public String getDynamicOverseasValue() {
			return this.dynamicOverseasValue;
		}

		public void setDynamicOverseasValue(String dynamicOverseasValue) {
			this.dynamicOverseasValue = dynamicOverseasValue;
		}

		public String getStaticValue() {
			return this.staticValue;
		}

		public void setStaticValue(String staticValue) {
			this.staticValue = staticValue;
		}

		public String getStaticDomesticValue() {
			return this.staticDomesticValue;
		}

		public void setStaticDomesticValue(String staticDomesticValue) {
			this.staticDomesticValue = staticDomesticValue;
		}

		public String getStaticOverseasValue() {
			return this.staticOverseasValue;
		}

		public void setStaticOverseasValue(String staticOverseasValue) {
			this.staticOverseasValue = staticOverseasValue;
		}
	}

	@Override
	public DescribeDomainQpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainQpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
