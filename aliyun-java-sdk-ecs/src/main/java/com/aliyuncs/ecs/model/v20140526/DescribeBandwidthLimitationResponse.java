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
import com.aliyuncs.ecs.transform.v20140526.DescribeBandwidthLimitationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBandwidthLimitationResponse extends AcsResponse {

	private String requestId;

	private List<Bandwidth> bandwidths;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Bandwidth> getBandwidths() {
		return this.bandwidths;
	}

	public void setBandwidths(List<Bandwidth> bandwidths) {
		this.bandwidths = bandwidths;
	}

	public static class Bandwidth {

		private String internetChargeType;

		private Integer min;

		private Integer max;

		private String unit;

		public String getInternetChargeType() {
			return this.internetChargeType;
		}

		public void setInternetChargeType(String internetChargeType) {
			this.internetChargeType = internetChargeType;
		}

		public Integer getMin() {
			return this.min;
		}

		public void setMin(Integer min) {
			this.min = min;
		}

		public Integer getMax() {
			return this.max;
		}

		public void setMax(Integer max) {
			this.max = max;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}
	}

	@Override
	public DescribeBandwidthLimitationResponse getInstance(UnmarshallerContext context) {
		return	DescribeBandwidthLimitationResponseUnmarshaller.unmarshall(this, context);
	}
}
