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

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private List<CloudBoxSkuSet> cloudBoxSkuSets;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CloudBoxSkuSet> getCloudBoxSkuSets() {
		return this.cloudBoxSkuSets;
	}

	public void setCloudBoxSkuSets(List<CloudBoxSkuSet> cloudBoxSkuSets) {
		this.cloudBoxSkuSets = cloudBoxSkuSets;
	}

	public static class CloudBoxSkuSet {

		private Float powerConsumption;

		private Float height;

		private Float maxBlockStorage;

		private String skuType;

		private Float minBlockStorage;

		private String bizType;

		private Float weight;

		private String bandwidth;

		private String description;

		private String cloudBoxSkuId;

		private Float width;

		private Float length;

		private List<InstanceTypeSet> instanceTypeSets;

		public Float getPowerConsumption() {
			return this.powerConsumption;
		}

		public void setPowerConsumption(Float powerConsumption) {
			this.powerConsumption = powerConsumption;
		}

		public Float getHeight() {
			return this.height;
		}

		public void setHeight(Float height) {
			this.height = height;
		}

		public Float getMaxBlockStorage() {
			return this.maxBlockStorage;
		}

		public void setMaxBlockStorage(Float maxBlockStorage) {
			this.maxBlockStorage = maxBlockStorage;
		}

		public String getSkuType() {
			return this.skuType;
		}

		public void setSkuType(String skuType) {
			this.skuType = skuType;
		}

		public Float getMinBlockStorage() {
			return this.minBlockStorage;
		}

		public void setMinBlockStorage(Float minBlockStorage) {
			this.minBlockStorage = minBlockStorage;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public Float getWeight() {
			return this.weight;
		}

		public void setWeight(Float weight) {
			this.weight = weight;
		}

		public String getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(String bandwidth) {
			this.bandwidth = bandwidth;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCloudBoxSkuId() {
			return this.cloudBoxSkuId;
		}

		public void setCloudBoxSkuId(String cloudBoxSkuId) {
			this.cloudBoxSkuId = cloudBoxSkuId;
		}

		public Float getWidth() {
			return this.width;
		}

		public void setWidth(Float width) {
			this.width = width;
		}

		public Float getLength() {
			return this.length;
		}

		public void setLength(Float length) {
			this.length = length;
		}

		public List<InstanceTypeSet> getInstanceTypeSets() {
			return this.instanceTypeSets;
		}

		public void setInstanceTypeSets(List<InstanceTypeSet> instanceTypeSets) {
			this.instanceTypeSets = instanceTypeSets;
		}

		public static class InstanceTypeSet {

			private Integer instanceTypeCount;

			private String instanceTypeName;

			private String instanceTypeFamily;

			public Integer getInstanceTypeCount() {
				return this.instanceTypeCount;
			}

			public void setInstanceTypeCount(Integer instanceTypeCount) {
				this.instanceTypeCount = instanceTypeCount;
			}

			public String getInstanceTypeName() {
				return this.instanceTypeName;
			}

			public void setInstanceTypeName(String instanceTypeName) {
				this.instanceTypeName = instanceTypeName;
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
