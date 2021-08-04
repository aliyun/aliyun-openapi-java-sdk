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

package com.aliyuncs.vs.model.v20181212;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeVsStorageTrafficUsageDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVsStorageTrafficUsageDataResponse extends AcsResponse {

	private String requestId;

	private List<TrafficUsageDataModule> trafficUsage;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TrafficUsageDataModule> getTrafficUsage() {
		return this.trafficUsage;
	}

	public void setTrafficUsage(List<TrafficUsageDataModule> trafficUsage) {
		this.trafficUsage = trafficUsage;
	}

	public static class TrafficUsageDataModule {

		private String timeStamp;

		private String bucket;

		private Long lanTrafficInDataValue;

		private Long lanTrafficOutDataValue;

		private Long wanTrafficInDataValue;

		private Long wanTrafficOutDataValue;

		private Float lanBandwidthInDataValue;

		private Float lanBandwidthOutDataValue;

		private Float wanBandwidthInDataValue;

		private Float wanBandwidthOutDataValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getBucket() {
			return this.bucket;
		}

		public void setBucket(String bucket) {
			this.bucket = bucket;
		}

		public Long getLanTrafficInDataValue() {
			return this.lanTrafficInDataValue;
		}

		public void setLanTrafficInDataValue(Long lanTrafficInDataValue) {
			this.lanTrafficInDataValue = lanTrafficInDataValue;
		}

		public Long getLanTrafficOutDataValue() {
			return this.lanTrafficOutDataValue;
		}

		public void setLanTrafficOutDataValue(Long lanTrafficOutDataValue) {
			this.lanTrafficOutDataValue = lanTrafficOutDataValue;
		}

		public Long getWanTrafficInDataValue() {
			return this.wanTrafficInDataValue;
		}

		public void setWanTrafficInDataValue(Long wanTrafficInDataValue) {
			this.wanTrafficInDataValue = wanTrafficInDataValue;
		}

		public Long getWanTrafficOutDataValue() {
			return this.wanTrafficOutDataValue;
		}

		public void setWanTrafficOutDataValue(Long wanTrafficOutDataValue) {
			this.wanTrafficOutDataValue = wanTrafficOutDataValue;
		}

		public Float getLanBandwidthInDataValue() {
			return this.lanBandwidthInDataValue;
		}

		public void setLanBandwidthInDataValue(Float lanBandwidthInDataValue) {
			this.lanBandwidthInDataValue = lanBandwidthInDataValue;
		}

		public Float getLanBandwidthOutDataValue() {
			return this.lanBandwidthOutDataValue;
		}

		public void setLanBandwidthOutDataValue(Float lanBandwidthOutDataValue) {
			this.lanBandwidthOutDataValue = lanBandwidthOutDataValue;
		}

		public Float getWanBandwidthInDataValue() {
			return this.wanBandwidthInDataValue;
		}

		public void setWanBandwidthInDataValue(Float wanBandwidthInDataValue) {
			this.wanBandwidthInDataValue = wanBandwidthInDataValue;
		}

		public Float getWanBandwidthOutDataValue() {
			return this.wanBandwidthOutDataValue;
		}

		public void setWanBandwidthOutDataValue(Float wanBandwidthOutDataValue) {
			this.wanBandwidthOutDataValue = wanBandwidthOutDataValue;
		}
	}

	@Override
	public DescribeVsStorageTrafficUsageDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVsStorageTrafficUsageDataResponseUnmarshaller.unmarshall(this, context);
	}
}
