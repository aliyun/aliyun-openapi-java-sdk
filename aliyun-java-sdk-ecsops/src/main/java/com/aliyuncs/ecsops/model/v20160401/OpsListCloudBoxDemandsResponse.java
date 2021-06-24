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
import com.aliyuncs.ecsops.transform.v20160401.OpsListCloudBoxDemandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListCloudBoxDemandsResponse extends AcsResponse {

	private Integer totalCount;

	private String nextToken;

	private String requestId;

	private List<CloudBoxDemandSet> cloudBoxDemandSets;

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

	public List<CloudBoxDemandSet> getCloudBoxDemandSets() {
		return this.cloudBoxDemandSets;
	}

	public void setCloudBoxDemandSets(List<CloudBoxDemandSet> cloudBoxDemandSets) {
		this.cloudBoxDemandSets = cloudBoxDemandSets;
	}

	public static class CloudBoxDemandSet {

		private String status;

		private String demandType;

		private String cloudBoxId;

		private String cloudBoxDemandId;

		private Integer duration;

		private Float blockStorageCapacity;

		private List<CloudBoxSkuSet> cloudBoxSkuSets;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDemandType() {
			return this.demandType;
		}

		public void setDemandType(String demandType) {
			this.demandType = demandType;
		}

		public String getCloudBoxId() {
			return this.cloudBoxId;
		}

		public void setCloudBoxId(String cloudBoxId) {
			this.cloudBoxId = cloudBoxId;
		}

		public String getCloudBoxDemandId() {
			return this.cloudBoxDemandId;
		}

		public void setCloudBoxDemandId(String cloudBoxDemandId) {
			this.cloudBoxDemandId = cloudBoxDemandId;
		}

		public Integer getDuration() {
			return this.duration;
		}

		public void setDuration(Integer duration) {
			this.duration = duration;
		}

		public Float getBlockStorageCapacity() {
			return this.blockStorageCapacity;
		}

		public void setBlockStorageCapacity(Float blockStorageCapacity) {
			this.blockStorageCapacity = blockStorageCapacity;
		}

		public List<CloudBoxSkuSet> getCloudBoxSkuSets() {
			return this.cloudBoxSkuSets;
		}

		public void setCloudBoxSkuSets(List<CloudBoxSkuSet> cloudBoxSkuSets) {
			this.cloudBoxSkuSets = cloudBoxSkuSets;
		}

		public static class CloudBoxSkuSet {

			private String skuId;

			private Integer count;

			public String getSkuId() {
				return this.skuId;
			}

			public void setSkuId(String skuId) {
				this.skuId = skuId;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public OpsListCloudBoxDemandsResponse getInstance(UnmarshallerContext context) {
		return	OpsListCloudBoxDemandsResponseUnmarshaller.unmarshall(this, context);
	}
}
