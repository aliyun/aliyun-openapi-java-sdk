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
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnDomainRealTimeSrcHttpCodeDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private String endTime;

	private String dataInterval;

	private List<UsageData> realTimeSrcHttpCodeData;

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

	public List<UsageData> getRealTimeSrcHttpCodeData() {
		return this.realTimeSrcHttpCodeData;
	}

	public void setRealTimeSrcHttpCodeData(List<UsageData> realTimeSrcHttpCodeData) {
		this.realTimeSrcHttpCodeData = realTimeSrcHttpCodeData;
	}

	public static class UsageData {

		private String timeStamp;

		private List<RealTimeSrcCodeProportionData> value;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public List<RealTimeSrcCodeProportionData> getValue() {
			return this.value;
		}

		public void setValue(List<RealTimeSrcCodeProportionData> value) {
			this.value = value;
		}

		public static class RealTimeSrcCodeProportionData {

			private String code;

			private String proportion;

			private String count;

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}

			public String getProportion() {
				return this.proportion;
			}

			public void setProportion(String proportion) {
				this.proportion = proportion;
			}

			public String getCount() {
				return this.count;
			}

			public void setCount(String count) {
				this.count = count;
			}
		}
	}

	@Override
	public DescribeDcdnDomainRealTimeSrcHttpCodeDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnDomainRealTimeSrcHttpCodeDataResponseUnmarshaller.unmarshall(this, context);
	}
}
