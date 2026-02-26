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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.QueryServicePackAndPriceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryServicePackAndPriceResponse extends AcsResponse {

	private Integer originalAmount;

	private String requestId;

	private Float discountPrice;

	private Float tradePrice;

	private Float originalPrice;

	private Integer chargeAmount;

	private String currency;

	private String regionId;

	private List<ServicePackInfo> servicePack;

	public Integer getOriginalAmount() {
		return this.originalAmount;
	}

	public void setOriginalAmount(Integer originalAmount) {
		this.originalAmount = originalAmount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Float getDiscountPrice() {
		return this.discountPrice;
	}

	public void setDiscountPrice(Float discountPrice) {
		this.discountPrice = discountPrice;
	}

	public Float getTradePrice() {
		return this.tradePrice;
	}

	public void setTradePrice(Float tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Float getOriginalPrice() {
		return this.originalPrice;
	}

	public void setOriginalPrice(Float originalPrice) {
		this.originalPrice = originalPrice;
	}

	public Integer getChargeAmount() {
		return this.chargeAmount;
	}

	public void setChargeAmount(Integer chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public List<ServicePackInfo> getServicePack() {
		return this.servicePack;
	}

	public void setServicePack(List<ServicePackInfo> servicePack) {
		this.servicePack = servicePack;
	}

	public static class ServicePackInfo {

		private Integer endTime;

		private Integer capacity;

		private Integer startTime;

		private String instanceName;

		public Integer getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Integer endTime) {
			this.endTime = endTime;
		}

		public Integer getCapacity() {
			return this.capacity;
		}

		public void setCapacity(Integer capacity) {
			this.capacity = capacity;
		}

		public Integer getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Integer startTime) {
			this.startTime = startTime;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}
	}

	@Override
	public QueryServicePackAndPriceResponse getInstance(UnmarshallerContext context) {
		return	QueryServicePackAndPriceResponseUnmarshaller.unmarshall(this, context);
	}
}
