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
import com.aliyuncs.ecs.transform.v20140526.DescribeSpotAdviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpotAdviceResponse extends AcsResponse {

	private String regionId;

	private String requestId;

	private List<AvailableSpotZone> availableSpotZones;

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AvailableSpotZone> getAvailableSpotZones() {
		return this.availableSpotZones;
	}

	public void setAvailableSpotZones(List<AvailableSpotZone> availableSpotZones) {
		this.availableSpotZones = availableSpotZones;
	}

	public static class AvailableSpotZone {

		private String zoneId;

		private List<AvailableSpotResource> availableSpotResources;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<AvailableSpotResource> getAvailableSpotResources() {
			return this.availableSpotResources;
		}

		public void setAvailableSpotResources(List<AvailableSpotResource> availableSpotResources) {
			this.availableSpotResources = availableSpotResources;
		}

		public static class AvailableSpotResource {

			private String interruptRateDesc;

			private Integer averageSpotDiscount;

			private String instanceType;

			private Float interruptionRate;

			public String getInterruptRateDesc() {
				return this.interruptRateDesc;
			}

			public void setInterruptRateDesc(String interruptRateDesc) {
				this.interruptRateDesc = interruptRateDesc;
			}

			public Integer getAverageSpotDiscount() {
				return this.averageSpotDiscount;
			}

			public void setAverageSpotDiscount(Integer averageSpotDiscount) {
				this.averageSpotDiscount = averageSpotDiscount;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public Float getInterruptionRate() {
				return this.interruptionRate;
			}

			public void setInterruptionRate(Float interruptionRate) {
				this.interruptionRate = interruptionRate;
			}
		}
	}

	@Override
	public DescribeSpotAdviceResponse getInstance(UnmarshallerContext context) {
		return	DescribeSpotAdviceResponseUnmarshaller.unmarshall(this, context);
	}
}
