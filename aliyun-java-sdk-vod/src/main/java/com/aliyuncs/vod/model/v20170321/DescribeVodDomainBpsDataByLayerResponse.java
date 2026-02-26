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
import com.aliyuncs.vod.transform.v20170321.DescribeVodDomainBpsDataByLayerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodDomainBpsDataByLayerResponse extends AcsResponse {

	private Integer dataInterval;

	private String requestId;

	private List<DataModule> bpsDataInterval;

	public Integer getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(Integer dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataModule> getBpsDataInterval() {
		return this.bpsDataInterval;
	}

	public void setBpsDataInterval(List<DataModule> bpsDataInterval) {
		this.bpsDataInterval = bpsDataInterval;
	}

	public static class DataModule {

		private Double value;

		private Long trafficValue;

		private String timeStamp;

		public Double getValue() {
			return this.value;
		}

		public void setValue(Double value) {
			this.value = value;
		}

		public Long getTrafficValue() {
			return this.trafficValue;
		}

		public void setTrafficValue(Long trafficValue) {
			this.trafficValue = trafficValue;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeVodDomainBpsDataByLayerResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodDomainBpsDataByLayerResponseUnmarshaller.unmarshall(this, context);
	}
}
