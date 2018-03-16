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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeSpotPriceHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpotPriceHistoryResponse extends AcsResponse {

	private String requestId;

	private Integer nextOffset;

	private String currency;

	private List<SpotPriceType> spotPrices;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getNextOffset() {
		return this.nextOffset;
	}

	public void setNextOffset(Integer nextOffset) {
		this.nextOffset = nextOffset;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<SpotPriceType> getSpotPrices() {
		return this.spotPrices;
	}

	public void setSpotPrices(List<SpotPriceType> spotPrices) {
		this.spotPrices = spotPrices;
	}

	public static class SpotPriceType {

		private String zoneId;

		private String instanceType;

		private String ioOptimized;

		private String timestamp;

		private String networkType;

		private Float spotPrice;

		private Float originPrice;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(String ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public Float getSpotPrice() {
			return this.spotPrice;
		}

		public void setSpotPrice(Float spotPrice) {
			this.spotPrice = spotPrice;
		}

		public Float getOriginPrice() {
			return this.originPrice;
		}

		public void setOriginPrice(Float originPrice) {
			this.originPrice = originPrice;
		}
	}

	@Override
	public DescribeSpotPriceHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeSpotPriceHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
