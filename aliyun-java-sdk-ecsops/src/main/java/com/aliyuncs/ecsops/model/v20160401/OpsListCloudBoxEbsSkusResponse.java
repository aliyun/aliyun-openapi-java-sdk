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
import com.aliyuncs.ecsops.transform.v20160401.OpsListCloudBoxEbsSkusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsListCloudBoxEbsSkusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private String nextToken;

	private Long totalCount;

	private List<CloudBoxEbsSkuSet> cloudBoxEbsSkuSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<CloudBoxEbsSkuSet> getCloudBoxEbsSkuSets() {
		return this.cloudBoxEbsSkuSets;
	}

	public void setCloudBoxEbsSkuSets(List<CloudBoxEbsSkuSet> cloudBoxEbsSkuSets) {
		this.cloudBoxEbsSkuSets = cloudBoxEbsSkuSets;
	}

	public static class CloudBoxEbsSkuSet {

		private String cloudBoxSkuId;

		private String name;

		private String storageType;

		private String performanceLevel;

		private String machineType;

		private Long minCapacity;

		private Long maxCapacity;

		private Long stepCapacity;

		public String getCloudBoxSkuId() {
			return this.cloudBoxSkuId;
		}

		public void setCloudBoxSkuId(String cloudBoxSkuId) {
			this.cloudBoxSkuId = cloudBoxSkuId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public String getPerformanceLevel() {
			return this.performanceLevel;
		}

		public void setPerformanceLevel(String performanceLevel) {
			this.performanceLevel = performanceLevel;
		}

		public String getMachineType() {
			return this.machineType;
		}

		public void setMachineType(String machineType) {
			this.machineType = machineType;
		}

		public Long getMinCapacity() {
			return this.minCapacity;
		}

		public void setMinCapacity(Long minCapacity) {
			this.minCapacity = minCapacity;
		}

		public Long getMaxCapacity() {
			return this.maxCapacity;
		}

		public void setMaxCapacity(Long maxCapacity) {
			this.maxCapacity = maxCapacity;
		}

		public Long getStepCapacity() {
			return this.stepCapacity;
		}

		public void setStepCapacity(Long stepCapacity) {
			this.stepCapacity = stepCapacity;
		}
	}

	@Override
	public OpsListCloudBoxEbsSkusResponse getInstance(UnmarshallerContext context) {
		return	OpsListCloudBoxEbsSkusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
