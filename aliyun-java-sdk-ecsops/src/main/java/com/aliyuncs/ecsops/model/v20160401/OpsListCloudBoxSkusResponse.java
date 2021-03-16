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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsListCloudBoxSkusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListCloudBoxSkusResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private String nextToken;

	private List<CloudBoxSkuSet> cloudBoxSkuSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<CloudBoxSkuSet> getCloudBoxSkuSets() {
		return this.cloudBoxSkuSets;
	}

	public void setCloudBoxSkuSets(List<CloudBoxSkuSet> cloudBoxSkuSets) {
		this.cloudBoxSkuSets = cloudBoxSkuSets;
	}

	public static class CloudBoxSkuSet {

		private String cloudBoxSkuId;

		private String bizType;

		private String skuType;

		private String description;

		private String bandwidth;

		private Float minBlockStorage;

		private Float maxBlockStorage;

		private Float length;

		private Float width;

		private Float height;

		private Float weight;

		private Float powerConsumption;

		private List<InstanceTypeSet> instanceTypeSets;

		public String getCloudBoxSkuId() {
			return this.cloudBoxSkuId;
		}

		public void setCloudBoxSkuId(String cloudBoxSkuId) {
			this.cloudBoxSkuId = cloudBoxSkuId;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getSkuType() {
			return this.skuType;
		}

		public void setSkuType(String skuType) {
			this.skuType = skuType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public Float getMinBlockStorage() {
			return this.minBlockStorage;
		}

		public void setMinBlockStorage(Float minBlockStorage) {
			this.minBlockStorage = minBlockStorage;
		}

		public Float getMaxBlockStorage() {
			return this.maxBlockStorage;
		}

		public void setMaxBlockStorage(Float maxBlockStorage) {
			this.maxBlockStorage = maxBlockStorage;
		}

		public Float getLength() {
			return this.length;
		}

		public void setLength(Float length) {
			this.length = length;
		}

		public Float getWidth() {
			return this.width;
		}

		public void setWidth(Float width) {
			this.width = width;
		}

		public Float getHeight() {
			return this.height;
		}

		public void setHeight(Float height) {
			this.height = height;
		}

		public Float getWeight() {
			return this.weight;
		}

		public void setWeight(Float weight) {
			this.weight = weight;
		}

		public Float getPowerConsumption() {
			return this.powerConsumption;
		}

		public void setPowerConsumption(Float powerConsumption) {
			this.powerConsumption = powerConsumption;
		}

		public List<InstanceTypeSet> getInstanceTypeSets() {
			return this.instanceTypeSets;
		}

		public void setInstanceTypeSets(List<InstanceTypeSet> instanceTypeSets) {
			this.instanceTypeSets = instanceTypeSets;
		}

		public static class InstanceTypeSet {

			private String instanceTypeName;

			private Integer instanceTypeCount;

			private String instanceTypeFamily;

			public String getInstanceTypeName() {
				return this.instanceTypeName;
			}

			public void setInstanceTypeName(String instanceTypeName) {
				this.instanceTypeName = instanceTypeName;
			}

			public Integer getInstanceTypeCount() {
				return this.instanceTypeCount;
			}

			public void setInstanceTypeCount(Integer instanceTypeCount) {
				this.instanceTypeCount = instanceTypeCount;
			}

			public String getInstanceTypeFamily() {
				return this.instanceTypeFamily;
			}

			public void setInstanceTypeFamily(String instanceTypeFamily) {
				this.instanceTypeFamily = instanceTypeFamily;
			}
		}
	}

	@Override
	public OpsListCloudBoxSkusResponse getInstance(UnmarshallerContext context) {
		return	OpsListCloudBoxSkusResponseUnmarshaller.unmarshall(this, context);
	}
}
