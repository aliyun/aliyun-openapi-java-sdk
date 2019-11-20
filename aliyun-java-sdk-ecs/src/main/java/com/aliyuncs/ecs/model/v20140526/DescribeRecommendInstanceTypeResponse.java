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
import com.aliyuncs.ecs.transform.v20140526.DescribeRecommendInstanceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecommendInstanceTypeResponse extends AcsResponse {

	private String requestId;

	private List<RecommendInstanceType> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecommendInstanceType> getData() {
		return this.data;
	}

	public void setData(List<RecommendInstanceType> data) {
		this.data = data;
	}

	public static class RecommendInstanceType {

		private String regionId;

		private String commodityCode;

		private String scene;

		private String instanceChargeType;

		private String spotStrategy;

		private Integer priority;

		private List<Zone> zones;

		private InstanceType instanceType;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public String getInstanceChargeType() {
			return this.instanceChargeType;
		}

		public void setInstanceChargeType(String instanceChargeType) {
			this.instanceChargeType = instanceChargeType;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public List<Zone> getZones() {
			return this.zones;
		}

		public void setZones(List<Zone> zones) {
			this.zones = zones;
		}

		public InstanceType getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(InstanceType instanceType) {
			this.instanceType = instanceType;
		}

		public static class Zone {

			private String zoneNo;

			private List<String> networkTypes;

			public String getZoneNo() {
				return this.zoneNo;
			}

			public void setZoneNo(String zoneNo) {
				this.zoneNo = zoneNo;
			}

			public List<String> getNetworkTypes() {
				return this.networkTypes;
			}

			public void setNetworkTypes(List<String> networkTypes) {
				this.networkTypes = networkTypes;
			}
		}

		public static class InstanceType {

			private String generation;

			private String instanceTypeFamily;

			private String instanceType;

			private String supportIoOptimized;

			private Integer cores;

			private Integer memory;

			public String getGeneration() {
				return this.generation;
			}

			public void setGeneration(String generation) {
				this.generation = generation;
			}

			public String getInstanceTypeFamily() {
				return this.instanceTypeFamily;
			}

			public void setInstanceTypeFamily(String instanceTypeFamily) {
				this.instanceTypeFamily = instanceTypeFamily;
			}

			public String getInstanceType() {
				return this.instanceType;
			}

			public void setInstanceType(String instanceType) {
				this.instanceType = instanceType;
			}

			public String getSupportIoOptimized() {
				return this.supportIoOptimized;
			}

			public void setSupportIoOptimized(String supportIoOptimized) {
				this.supportIoOptimized = supportIoOptimized;
			}

			public Integer getCores() {
				return this.cores;
			}

			public void setCores(Integer cores) {
				this.cores = cores;
			}

			public Integer getMemory() {
				return this.memory;
			}

			public void setMemory(Integer memory) {
				this.memory = memory;
			}
		}
	}

	@Override
	public DescribeRecommendInstanceTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecommendInstanceTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
